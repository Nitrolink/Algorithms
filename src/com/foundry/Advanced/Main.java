package com.foundry.Advanced;


import com.foundry.Advanced.a02_01.Balls;
import com.foundry.Advanced.a02_15.ListNode;
import com.foundry.Advanced.a02_15.NodeMaker;
import com.foundry.Advanced.a02_15.removeKFromList;
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

            Tester.assertEquals("Container Sort",1,"Possible",Balls.organizingContainers(input1));
            Tester.assertEquals("Container Sort",2,"Possible",Balls.organizingContainers(input2));
            Tester.assertEquals("Container Sort",3,"Possible",Balls.organizingContainers(input3));

        }

        public static void nodeTest(){
            ArrayList<Integer> inArr1 = new ArrayList<Integer>(Arrays.asList(3,1,2,3,4,5));
            ListNode<Integer> input1 = NodeMaker.nodeMaker(inArr1);
            input1 = removeKFromList.solution(input1,3);
            ArrayList<Integer> test = NodeMaker.arrayMaker(input1);
            Object[] expected1 = {1,2,4,5};
            Object[] actual1 = test.toArray();

            Tester.objArrayEquals("Remove K From List",1,expected1,actual1);
        }

        public static void main(String[] args) {
            //ballsTest();
            nodeTest();
        }
}
