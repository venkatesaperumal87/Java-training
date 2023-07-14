/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int secondLastDigitOf(int input1){
  if(input1>=-9 && input1<=9)
   return -1;
   if(input1<0)
   input1*=-1;
  input1/=10;
  int n=input1%10;
  return n;
 }
}