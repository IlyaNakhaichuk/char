package com.levelp.jb2;


public class Accumul {
    public void accum(String s) {
       char[] charArray = s.toCharArray();
       for(int z=0;z<charArray.length;z++){
         charArray[z]=Character.toUpperCase(charArray[z]);
         for(int x=0;x<=z;x++){
             System.out.print(charArray[z]);
             charArray[z]=Character.toLowerCase(charArray[z]);
         }
         if(z!=charArray.length-1)
         System.out.print("-");
       }

    }
}
