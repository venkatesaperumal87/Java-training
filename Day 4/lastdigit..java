/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int lastDigitOf(int input1){
     if(input1<0)
  {
   input1*=-1;
  }
  int n=input1%10;
  return n;
 }
}