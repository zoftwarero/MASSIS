/* Generated By:JavaCC: Do not edit this line. PoshParserTokenManager.java */
package cz.cuni.amis.pogamut.sposh.elements;
import cz.cuni.amis.pogamut.shady.ArgString;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/** Token Manager. */
public class PoshParserTokenManager implements PoshParserConstants
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
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 32;
            return 50;
         }
         if ((active0 & 0x800L) != 0L)
            return 60;
         if ((active0 & 0xc00000L) != 0L)
         {
            jjmatchedKind = 32;
            return 61;
         }
         if ((active0 & 0x193ef600L) != 0L)
         {
            jjmatchedKind = 32;
            return 60;
         }
         if ((active0 & 0x4000000L) != 0L)
            return 9;
         return -1;
      case 1:
         if ((active0 & 0x60600L) != 0L)
            return 60;
         if ((active0 & 0x19f9f000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
            return 60;
         }
         return -1;
      case 2:
         if ((active0 & 0x200000L) != 0L)
            return 60;
         if ((active0 & 0x19d9f000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 2;
            return 60;
         }
         return -1;
      case 3:
         if ((active0 & 0x9082000L) != 0L)
            return 60;
         if ((active0 & 0x10d1d000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
            return 60;
         }
         return -1;
      case 4:
         if ((active0 & 0x10004000L) != 0L)
            return 60;
         if ((active0 & 0xd19000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 4;
            return 60;
         }
         return -1;
      case 5:
         if ((active0 & 0x400000L) != 0L)
            return 60;
         if ((active0 & 0x919000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 5;
            return 60;
         }
         return -1;
      case 6:
         if ((active0 & 0x118000L) != 0L)
            return 60;
         if ((active0 & 0x801000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 6;
            return 60;
         }
         return -1;
      case 7:
         if ((active0 & 0x1000L) != 0L)
            return 60;
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 7;
            return 60;
         }
         return -1;
      case 8:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 8;
            return 60;
         }
         return -1;
      case 9:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 9;
            return 60;
         }
         return -1;
      case 10:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 10;
            return 60;
         }
         return -1;
      case 11:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 11;
            return 60;
         }
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
      case 40:
         return jjStopAtPos(0, 6);
      case 41:
         return jjStopAtPos(0, 7);
      case 44:
         return jjStopAtPos(0, 25);
      case 61:
         return jjStartNfaWithStates_0(0, 26, 9);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x600L);
      case 67:
      case 99:
         return jjStartNfaWithStates_0(0, 11, 60);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0xc00000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa1_0(0x24000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x280000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x8100000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
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
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x11000000L);
      case 68:
      case 100:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 60);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x208000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 77:
      case 109:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 60);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x886000L);
      case 80:
      case 112:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 60);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x8500000L);
      case 90:
      case 122:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(1, 17, 60);
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
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x810000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x500000L);
      case 76:
      case 108:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(2, 21, 60);
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x88000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x8004000L);
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
      case 69:
      case 101:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 60);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 60);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 76:
      case 108:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 60);
         break;
      case 77:
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 83:
      case 115:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 60);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x808000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(4, 28, 60);
         return jjMoveStringLiteralDfa5_0(active0, 0x401000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 83:
      case 115:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 60);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x908000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 83:
      case 115:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 60);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 82:
      case 114:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(6, 20, 60);
         break;
      case 83:
      case 115:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 60);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 60);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(7, 12, 60);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 84:
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         return jjMoveStringLiteralDfa12_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(12, 23, 60);
         break;
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
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
   jjnewStateCnt = 60;
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
               case 61:
                  if ((0x3ff200000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(48);
                  }
                  else if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 45;
                  if ((0x3ff200000000000L & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  break;
               case 60:
                  if ((0x3ff200000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(48);
                  }
                  else if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 45;
                  if ((0x3ff200000000000L & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAddStates(0, 4);
                  }
                  else if ((0x7000000000000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                  }
                  else if (curChar == 45)
                     jjCheckNAddStates(5, 7);
                  else if (curChar == 36)
                     jjCheckNAdd(41);
                  else if (curChar == 34)
                     jjCheckNAddStates(8, 10);
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 46)
                     jjCheckNAdd(16);
                  else if (curChar == 33)
                     jjCheckNAdd(9);
                  else if (curChar == 59)
                     jjCheckNAddStates(11, 13);
                  if (curChar == 62)
                     jjCheckNAdd(9);
                  else if (curChar == 60)
                     jjCheckNAdd(9);
                  else if (curChar == 61)
                     jjCheckNAdd(9);
                  break;
               case 50:
                  if ((0x3ff200000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(48);
                  }
                  else if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 45;
                  if ((0x3ff200000000000L & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(11, 13);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 3:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 9:
                  if (curChar == 61 && kind > 29)
                     kind = 29;
                  break;
               case 10:
                  if (curChar == 61)
                     jjCheckNAdd(9);
                  break;
               case 11:
                  if ((0x7000000000000000L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 12:
                  if (curChar == 33)
                     jjCheckNAdd(9);
                  break;
               case 13:
                  if (curChar == 60)
                     jjCheckNAdd(9);
                  break;
               case 14:
                  if (curChar == 62)
                     jjCheckNAdd(9);
                  break;
               case 15:
                  if (curChar == 46)
                     jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAddTwoStates(16, 17);
                  break;
               case 18:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(19);
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(19);
                  break;
               case 20:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAddTwoStates(22, 23);
                  break;
               case 23:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAddTwoStates(23, 25);
                  break;
               case 26:
                  if (curChar == 34)
                     jjCheckNAddStates(8, 10);
                  break;
               case 27:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 29:
                  if ((0xff008400000000L & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 30:
                  if (curChar == 34 && kind > 35)
                     kind = 35;
                  break;
               case 31:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 32:
               case 34:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(33);
                  break;
               case 33:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(8, 10);
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
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 40:
                  if (curChar == 36)
                     jjCheckNAdd(41);
                  break;
               case 42:
                  if ((0x3ff200000000000L & l) != 0L)
                     jjAddStates(14, 15);
                  break;
               case 43:
                  if (curChar == 46)
                     jjCheckNAdd(41);
                  break;
               case 44:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if ((0x3ff200000000000L & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  break;
               case 47:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 48:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(48);
                  break;
               case 53:
                  if (curChar == 45)
                     jjCheckNAddStates(5, 7);
                  break;
               case 54:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(54);
                  break;
               case 55:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(16, 19);
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(56, 15);
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(57, 58);
                  break;
               case 58:
                  if (curChar != 46)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(17);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAddStates(0, 4);
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
               case 61:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(48);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  if ((0x800000008L & l) != 0L)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  break;
               case 60:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(48);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAddStates(20, 22);
                  }
                  if ((0x8000000080000L & l) != 0L)
                     jjAddStates(23, 24);
                  else if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if ((0x1000000010L & l) != 0L)
                     jjCheckNAdd(5);
                  break;
               case 50:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(48);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 51;
                  else if ((0x1000000010L & l) != 0L)
                     jjCheckNAdd(5);
                  break;
               case 1:
                  jjAddStates(11, 13);
                  break;
               case 5:
                  if ((0x800000008L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 6:
               case 7:
               case 51:
                  if ((0x1000000010L & l) != 0L)
                     jjCheckNAdd(5);
                  break;
               case 8:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 17:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(25, 26);
                  break;
               case 21:
               case 22:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAddTwoStates(22, 23);
                  break;
               case 24:
               case 25:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAddTwoStates(23, 25);
                  break;
               case 27:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 28:
                  if (curChar == 92)
                     jjCheckNAddStates(27, 30);
                  break;
               case 29:
                  if ((0x14404410144044L & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 35:
                  if ((0x20000000200000L & l) != 0L)
                     jjCheckNAddTwoStates(35, 36);
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
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 39:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 41:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(31, 33);
                  break;
               case 42:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(42, 43);
                  break;
               case 44:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(44);
                  break;
               case 45:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAddStates(20, 22);
                  break;
               case 46:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  break;
               case 48:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(48);
                  break;
               case 49:
                  if ((0x8000000080000L & l) != 0L)
                     jjAddStates(23, 24);
                  break;
               case 52:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 51;
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
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(11, 13);
                  break;
               case 27:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 10);
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
      if ((i = jjnewStateCnt) == (startsAt = 60 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   56, 15, 57, 58, 54, 15, 54, 55, 27, 28, 30, 1, 2, 4, 42, 43, 
   56, 15, 57, 58, 46, 47, 48, 50, 52, 18, 19, 29, 31, 34, 35, 42, 
   43, 44, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\50", "\51", null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, "\54", 
"\75", null, null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3dffffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
static final long[] jjtoSpecial = {
   0x20L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[60];
private final int[] jjstateSet = new int[120];
protected char curChar;
/** Constructor. */
public PoshParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public PoshParserTokenManager(SimpleCharStream stream, int lexState){
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
   for (i = 60; i-- > 0;)
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
  Token specialToken = null;
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
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 37)
   {
      jjmatchedKind = 37;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
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
