package rpax.massis.model.managers.movement.steering;

import java.util.List;

import rpax.massis.model.agents.Agent;
import rpax.massis.util.geom.KVector;
import straightedge.geom.KPoint;

public class FollowPath extends SteeringBehavior {

	private final double radius;
	private final double frames_ahead;

	public FollowPath(Agent v, double radius, double frames_ahead) {
		super(v);
		this.radius = radius;
		this.frames_ahead = frames_ahead;
	}

	@Override
	public KVector steer() {
		List<KPoint> p = v.getPath();
		KVector vel = v.getVelocity();
		KVector loc = new KVector(v.getXY());
		KVector predict = vel.copy();
		predict.normalize();
		predict.mult(frames_ahead);
		KVector predictLoc = KVector.add(loc, predict);

		KVector target = null;
		KVector dir = null;
		double record = 100 * 1000 * 100;

		KVector normal = null;
		for (int i = 0; i < p.size() - 1; i++)
		{

			KPoint a = p.get(i);
			KPoint b = p.get(Math.min((i + 1), p.size() - 1));
			normal = KVector.getNormalPoint(predictLoc, a, b);

			double da = KVector.distance(normal, a);
			double db = KVector.distance(normal, b);
			KVector line = KVector.sub(b, a);
			if (da + db > line.magnitude() + 1)
			{
				normal = new KVector(b);
				a = p.get(Math.min((i + 1), p.size() - 1));
				b = p.get(Math.min((i + 2), p.size() - 1));
				line = KVector.sub(b, a);

			}

			double d = KVector.distance(predictLoc, normal);
			if (d < record)
			{
				record = d;
				target = normal;
				dir = line;
				dir.normalize();
				dir.mult(frames_ahead);
			}
		}

		KVector steer = new KVector();
		if (target == null)
			return new KVector();
		if (record > radius || vel.magnitude() < 0.1)
		{
			target.add(dir);

			KVector desired = KVector.sub(target, loc);
			double d = desired.magnitude();
			if (d > 0)
			{
				desired.normalize();

				desired.mult(v.getMaxSpeed());
				steer = desired;

			}
			else
			{
				steer = KVector.sub(target, v.getXY());

				steer.normalize();
			}
			return steer.normalize().mult(v.getMaxForce());
		}
		else
		{
			steer = KVector.sub(target, v.getXY());
			steer.normalize();
			return steer.normalize().mult(v.getMaxForce());
		}
	}

}
