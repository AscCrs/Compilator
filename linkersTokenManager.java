/* linkersTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. linkersTokenManager.java */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** Token Manager. */
@SuppressWarnings ("unused")
public class linkersTokenManager implements linkersConstants {
    static ArrayList<String> tablaErrores = new ArrayList<String>();

    public void LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar) {
        String errorMessage = "Error L\u00e9xico -> L\u00ednea: " + errorLine + ", Columna: " + errorColumn + ", Descripci\u00f3n: ";
        if (EOFSeen) {
            errorMessage += "<EOF> encontrado, pero esperaba m\u00e1s caracteres.";
        } else {
            errorMessage += "\"" + curChar + "\" encontrado, pero esperaba m\u00e1s caracteres.";
        }
        tablaErrores.add(errorMessage);
    }

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fffeL) != 0L)
         {
            jjmatchedKind = 40;
            return 12;
         }
         return -1;
      case 1:
         if ((active0 & 0x30L) != 0L)
            return 13;
         if ((active0 & 0x3ffceL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 40;
               jjmatchedPos = 1;
            }
            return 13;
         }
         return -1;
      case 2:
         if ((active0 & 0x200L) != 0L)
            return 13;
         if ((active0 & 0x3fdeeL) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
            return 13;
         }
         return -1;
      case 3:
         if ((active0 & 0x3f5aaL) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 3;
            return 13;
         }
         if ((active0 & 0x844L) != 0L)
            return 13;
         return -1;
      case 4:
         if ((active0 & 0x5100L) != 0L)
            return 13;
         if ((active0 & 0x3a4aaL) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 4;
            return 13;
         }
         return -1;
      case 5:
         if ((active0 & 0x80a0L) != 0L)
            return 13;
         if ((active0 & 0x3240aL) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 5;
            return 13;
         }
         return -1;
      case 6:
         if ((active0 & 0x30402L) != 0L)
            return 13;
         if ((active0 & 0x2008L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 6;
            return 13;
         }
         return -1;
      case 7:
         if ((active0 & 0x8L) != 0L)
            return 13;
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 7;
            return 13;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 37:
         return jjStopAtPos(0, 28);
      case 38:
         return jjStopAtPos(0, 36);
      case 40:
         return jjStopAtPos(0, 20);
      case 41:
         return jjStopAtPos(0, 21);
      case 42:
         return jjStopAtPos(0, 26);
      case 43:
         return jjStopAtPos(0, 24);
      case 45:
         return jjStopAtPos(0, 25);
      case 47:
         return jjStopAtPos(0, 27);
      case 58:
         return jjStopAtPos(0, 23);
      case 59:
         return jjStopAtPos(0, 22);
      case 60:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 61:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 62:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x10400L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x8008L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x4200L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x30L);
      case 123:
         return jjStopAtPos(0, 18);
      case 124:
         return jjStopAtPos(0, 37);
      case 125:
         return jjStopAtPos(0, 19);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x2L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x12404L);
      case 102:
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 4;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x20200L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x8L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x10008L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1004L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x180L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 114:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 13);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x840L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x8020L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x2L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1400L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 13);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x20100L);
      case 111:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 13);
         break;
      case 114:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(3, 2, 13);
         return jjMoveStringLiteralDfa4_0(active0, 0x8L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x2L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 13);
         return jjMoveStringLiteralDfa5_0(active0, 0x20020L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x8L);
      case 107:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 13);
         break;
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 111:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 13);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x2L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x30000L);
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x8L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 104:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 13);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 110:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 13);
         break;
      case 111:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 82:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(6, 1, 13);
         break;
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x8L);
      case 108:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 13);
         break;
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(6, 17, 13);
         break;
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(7, 3, 13);
         return jjMoveStringLiteralDfa8_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(8, 13, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
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
static final long[] jjbitVec1 = {
   0x0L, 0x0L, 0x0L, 0x408220200000000L
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 12;
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
               case 13:
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  { jjCheckNAddTwoStates(5, 4); }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  { jjCheckNAddTwoStates(5, 4); }
                  break;
               case 1:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 34 && kind > 39)
                     kind = 39;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(8, 9); }
                  break;
               case 9:
                  if (curChar == 46)
                     { jjCheckNAdd(10); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAdd(10); }
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  { jjCheckNAdd(11); }
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
               case 13:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     { jjCheckNAddStates(3, 5); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     { jjCheckNAddTwoStates(5, 4); }
                  }
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  { jjCheckNAddTwoStates(4, 6); }
                  break;
               case 12:
               case 6:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  { jjCheckNAddStates(3, 5); }
                  break;
               case 1:
                  { jjAddStates(6, 7); }
                  break;
               case 5:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  { jjCheckNAddTwoStates(5, 4); }
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
               case 13:
                  if ((jjbitVec1[i2] & l2) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     { jjCheckNAddTwoStates(5, 4); }
                  }
                  if ((jjbitVec1[i2] & l2) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     { jjCheckNAddStates(3, 5); }
                  }
                  break;
               case 0:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  { jjCheckNAddTwoStates(4, 6); }
                  break;
               case 12:
               case 6:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  { jjCheckNAddStates(3, 5); }
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(6, 7); }
                  break;
               case 5:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  { jjCheckNAddTwoStates(5, 4); }
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
      if ((i = jjnewStateCnt) == (startsAt = 12 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\111\116\111\103\111\101\122", "\114\145\145\162", 
"\105\163\143\162\151\142\151\162", "\151\146", "\151\146\164\150\145\156", "\145\154\163\145", 
"\123\167\151\164\143\150", "\127\150\151\154\145", "\106\157\162", "\104\145\146\141\165\154\164", 
"\103\141\163\157", "\102\162\145\141\153", "\126\145\162\144\141\144\145\162\157", 
"\106\141\154\163\157", "\105\156\164\145\162\157", "\104\145\143\151\155\141\154", 
"\142\157\157\154\145\141\156", "\173", "\175", "\50", "\51", "\73", "\72", "\53", "\55", "\52", "\57", "\45", 
"\75", "\76", "\74", "\74\75", "\76\75", "\75\75", "\41\75", "\46", "\174", "\41", 
null, null, null, null, null, null, null, null, null, null, };
static protected Token jjFillToken()
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
static final int[] jjnextStates = {
   8, 9, 11, 5, 4, 6, 1, 2, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
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
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 48)
   {
      jjmatchedKind = 48;
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
            SkipLexicalActions(matchedToken);
         }
         else
            SkipLexicalActions(null);
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

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 48 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
        linkersTokenManager.tablaErrores.add("Error L\u00e9xico -> L\u00ednea: " + input_stream.getEndLine() + ", Columna: " + input_stream.getEndColumn() + ", Token no reconocido.");
         break;
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public linkersTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public linkersTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 12; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7ffffffffffL, 
};
static final long[] jjtoSkip = {
   0x1f00000000000L, 
};
static final long[] jjtoSpecial = {
   0x1000000000000L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[12];
    static private final int[] jjstateSet = new int[2 * 12];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
