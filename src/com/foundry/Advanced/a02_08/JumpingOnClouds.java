package com.foundry.Advanced.a02_08;

public class JumpingOnClouds {
    public static int jumpingOnClouds(int[] c, int k){
        int e = 100;
        int n = c.length;
        int cc = 0;

        do {
            System.out.println("Jumping from cloud " + cc + " to cloud " + (cc+k));
            e--;
            cc = (cc+k)%n;
            if(c[cc]==1){
                System.out.println("Hit a thunder cloud");
                e-=2;
            }
            System.out.println("Energy: " + e);
        }  while(cc != 0);

        return e;
    }



    public static void main(String[] args) {
        int[] c = new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0,};
        System.out.println(jumpingOnClouds(c,3));
    }
}
