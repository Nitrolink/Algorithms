package com.foundry.Advanced;


import com.foundry.Advanced.Feb1.Balls;
import com.foundry.Intermediate.HotSeat;
import com.foundry.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


        public static void ballsTest(){
            System.out.println("\n----------------------------------\nContainer Sort Test\n");
            List<List<Integer>> input1 = new ArrayList<>();
            input1.add(Arrays.asList(999336263,998799923));
            input1.add(Arrays.asList(998799923,999763019));

            List<List<Integer>> input2 = new ArrayList<>();
            input2.add(Arrays.asList(997612619, 934920795, 998879231, 999926463));
            input2.add(Arrays.asList(960369681, 997828120, 999792735, 979622676));
            input2.add(Arrays.asList(999013654, 998634077, 997988323, 958769423));
            input2.add(Arrays.asList(997409523, 999301350, 940952923, 993020546));


            List<List<Integer>> input3 = new ArrayList<>();
            input3.add(Arrays.asList(993263231, 806455183, 972467746, 761846174, 226680660, 667393859, 815298761, 790313908, 997845516));
            input3.add(Arrays.asList(873142072, 579210472, 996344520, 999601755, 904458846, 663577990, 980240637, 713052540, 963408591));
            input3.add(Arrays.asList(551159221, 873763794, 752756532, 798803609, 670921889, 995259612, 981339960, 763904498, 499472207));
            input3.add(Arrays.asList(975980611, 999974039, 729219884, 834636710, 973988213, 969888254 ,846967495, 687204298, 511348404));
            input3.add(Arrays.asList(993232608, 998103218, 857820670, 995587240, 817798750, 773950980, 824882180, 797565274, 887424441));
            input3.add(Arrays.asList(847857578, 768853671, 916073200, 982234748, 986511977, 733420232, 997714976, 819799716, 891570083));
            input3.add(Arrays.asList(733197334, 985682497, 612123868, 971798655, 999905357, 710092446, 997494889, 683312998, 850074746));
            input3.add(Arrays.asList(799093993, 543648222, 944524289, 814951921, 981087922, 997222915, 506561779, 997697933, 652807674));
            input3.add(Arrays.asList(989362549, 973516812, 891706714, 786904549, 982329176, 376575034, 993535504, 984745483, 777613376));

            List<List<Integer>> input4 = new ArrayList<>();
            input4.add(Arrays.asList(10000,300,10000));
            input4.add(Arrays.asList(2,1,2));
            input4.add(Arrays.asList(3,3,3));

            List<List<Integer>> input5 = new ArrayList<>();
            input5.add(Arrays.asList(1,3,1));

            List<List<Integer>> input6 = new ArrayList<>();
            input6.add(Arrays.asList(1,3,1));

            List<List<Integer>> input7 = new ArrayList<>();
            input7.add(Arrays.asList(1,3,1));

            List<List<Integer>> input8 = new ArrayList<>();
            input8.add(Arrays.asList(1,3,1));

            List<List<Integer>> input9 = new ArrayList<>();
            input9.add(Arrays.asList(1,3,1));

            List<List<Integer>> input10 = new ArrayList<>();
            input10.add(Arrays.asList(1,3,1));





            //String containerSort4 = Balls.organizingContainers(input4);
            //String containerSort5 = Balls.organizingContainers(input5);
            //String containerSort6 = Balls.organizingContainers(input6);
            //String containerSort7 = Balls.organizingContainers(input7);
            //String containerSort8 = Balls.organizingContainers(input8);
            //String containerSort9 = Balls.organizingContainers(input9);
            //String containerSort10 = Balls.organizingContainers(input10);

                Tester.assertEquals("Container Sort",1,"Possible",Balls.organizingContainers(input1));
                Tester.assertEquals("Container Sort",2,"Possible",Balls.organizingContainers(input2));
                Tester.assertEquals("Container Sort",3,"Possible",Balls.organizingContainers(input3));

            //Tester.assertEquals("Container Sort",4,"Impossible",containerSort4);
            //Tester.assertEquals("Container Sort",5,"Possible",containerSort5);
            //Tester.assertEquals("Container Sort",6,"Impossible",containerSort6);
            //Tester.assertEquals("Container Sort",7,"Possible",containerSort7);
            //Tester.assertEquals("Container Sort",8,"Possible",containerSort8);
            //Tester.assertEquals("Container Sort",9,"Possible",containerSort9);
            //Tester.assertEquals("Container Sort",10,"Possible",containerSort10);

        }



        public static void main(String[] args) {
                ballsTest();
        }
}
