/* Generated By:JavaCC: Do not edit this line. ShadyParserTokenManager.java */
package cz.cuni.amis.pogamut.shady;
import java.util.*;

/** Token Manager. */
public class ShadyParserTokenManager implements ShadyParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xe40L) != 0L)
         {
            jjmatchedKind = 18;
            return 1;
         }
         if ((active0 & 0x4000000L) != 0L)
            return 6;
         return -1;
      case 1:
         if ((active0 & 0x640L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 1;
            return 1;
         }
         if ((active0 & 0x800L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
            return 1;
         }
         if ((active0 & 0x600L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 40:
         return jjStopAtPos(0, 7);
      case 41:
         return jjStopAtPos(0, 8);
      case 46:
         return jjStartNfaWithStates_0(0, 26, 6);
      case 60:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 61:
         return jjStopAtPos(0, 14);
      case 62:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x440L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x800L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x440L);
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 11, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 55;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  else if (curChar == 45)
                     jjAddStates(7, 9);
                  else if (curChar == 34)
                     jjCheckNAddStates(10, 12);
                  else if (curChar == 39)
                     jjAddStates(13, 14);
                  else if (curChar == 46)
                     jjCheckNAdd(6);
                  else if (curChar == 36)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(1);
                  }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(3);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 21)
                        kind = 21;
                  }
                  break;
               case 1:
                  if ((0x3ff201000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if (curChar == 48 && kind > 21)
                     kind = 21;
                  break;
               case 5:
                  if (curChar == 46)
                     jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddStates(15, 17);
                  break;
               case 8:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 11:
                  if (curChar == 39)
                     jjAddStates(13, 14);
                  break;
               case 12:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if (curChar == 39 && kind > 24)
                     kind = 24;
                  break;
               case 15:
                  if ((0xff008400000000L & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 16:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
               case 19:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(18);
                  break;
               case 18:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 25:
                  if (curChar == 34)
                     jjCheckNAddStates(10, 12);
                  break;
               case 26:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 28:
                  if ((0xff008400000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 29:
                  if (curChar == 34 && kind > 25)
                     kind = 25;
                  break;
               case 30:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
               case 33:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(32);
                  break;
               case 32:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 41:
                  if (curChar != 46)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddStates(18, 20);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddStates(18, 20);
                  break;
               case 44:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(45);
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(45, 10);
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  break;
               case 48:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(49);
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(49, 10);
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(21, 23);
                  break;
               case 52:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(53);
                  break;
               case 53:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(53, 10);
                  break;
               case 54:
                  if (curChar == 45)
                     jjAddStates(7, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(1);
                  break;
               case 7:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(24, 25);
                  break;
               case 10:
                  if ((0x5000000050L & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 12:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 14:
                  if (curChar == 92)
                     jjCheckNAddStates(26, 29);
                  break;
               case 15:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 20:
                  if (curChar == 117)
                     jjCheckNAddTwoStates(20, 21);
                  break;
               case 21:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 26:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 27:
                  if (curChar == 92)
                     jjCheckNAddStates(30, 33);
                  break;
               case 28:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 34:
                  if (curChar == 117)
                     jjCheckNAddTwoStates(34, 35);
                  break;
               case 35:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 36:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 37:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 38:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 43:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(34, 35);
                  break;
               case 47:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(36, 37);
                  break;
               case 51:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(38, 39);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 26:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(10, 12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 55 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   40, 41, 46, 47, 50, 51, 10, 2, 5, 39, 26, 27, 29, 12, 14, 6, 
   7, 10, 42, 43, 10, 50, 51, 10, 8, 9, 15, 16, 19, 20, 28, 30, 
   33, 34, 44, 45, 48, 49, 52, 53, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\156\157\144\145", "\50", "\51", 
"\141\156\144", "\156\157\164", "\157\162", "\76", "\76\75", "\75", "\41\75", "\74\75", "\74", 
null, null, null, null, null, null, null, null, "\56", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x767ffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[55];
private final int[] jjstateSet = new int[110];
protected char curChar;
/** Constructor. */
public ShadyParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ShadyParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 55; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
