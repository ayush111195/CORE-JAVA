public class Main {
    public static void main(String[] args) {

                           // (1.) while loop----------


        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println("using loops");
        int i = 1;
        while (i <= 4) {
            System.out.println(i);
            i++;
        }

    //   while(true){System.out.println("jay shri ram");}
                                                   //question---1--------



//        int a1 = 2;
//        while (a1 <= 45) {
//            System.out.println(a1);
//            a1++;
//        }

//-------------------------------------------------------------------------------------------------------
                                                  // (2.) do-while loop---------



        int b1 = 0;
        do {
            System.out.println(b1);
            b1++;
        }
        while (b1 <= 8);
        //question no---1

        char n = 1;
        int c1 = n;
        do {
            System.out.println(c1);
            c1++;
        }
        while (c1 <= 22);

//--------------------------------------------------------------------------------------------------------------
                                             //  (3). for loop------


        System.out.println("for loop");
        for (int e1 = 0; e1 <= 10; e1++) {
            System.out.println(e1);
        }

                                                     //question-1



        //2n= use for even no (0,2,4,6,,8----------)
        //2*n+1= use for odd no (1,3,5,7,9,------------)
        int n1 = 10;
        for (int i1 = 0; i1 < n1; i1++) {
            System.out.println(2 * i1 + 1);
        }

                                          //decrement for loop-----


        for (int d1 = 7; d1 >= 0; d1--) {
            System.out.println(d1);
        }


                                          //  break & continue---------

                                    //(1). break----

                                 // 1. for loop ke leye break----------


        for (int f1 = 0; f1 <= 10; f1++) {
            System.out.println(f1);
            System.out.println("java is a good");
            if (f1 == 3) {
                System.out.print("ending the loop");
                break;
            }
        }
        //break= loop ko diye gye no pr end kr deta h ......

                          // 2. while loop ke leye break-------

        int g1 = 0;
        while (g1 <= 10) {
            System.out.println(g1);
            System.out.println("java is good");
            if (g1 == 4) {
                System.out.println("ending the loop");
                break;
            }
            g1++;
        }

                             // 3.do-while ke leye break---

        int h1 = 0;
        do {
            System.out.println(h1);
            System.out.println("java is a good");
            h1++;
            if (h1 == 6) {
                System.out.println("ending the loop");
                break;
            }
        }
        while (h1 <= 10);


                                           // (2). continue---------------


                                 //1.for loop ke leye-----------



        for (int f = 0; f <10; f++) {

            if (f == 3) {
                System.out.println("ending the loop");

            continue;}
            System.out.println(f);
            System.out.println("java is a good");}
        //continue = jis condition ke sath lga hota h uske skip kr deta h mtlb yhan f1==3 pe lha h to continue
        //ke neeche jo bhi intrection h wo 3 pr apply nhi hoga.....


                               //2.while loop ke leye--------


        int g = 0;
        while (g <10) {
            g++;
            if (g == 4) {
                System.out.println("ending the loop");
                continue;}
            System.out.println(g);
            System.out.println("java is good");}

                                      // 3. do-while loop  ke leye

        int h = 0;
        do {h++;
            if (h == 6) {
                System.out.println("ending the loop");
                continue;}
            System.out.println(h);
            System.out.println("java is a good");
        }
        while (h < 10);



    }


    }

