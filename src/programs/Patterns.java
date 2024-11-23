package programs;

public class Patterns {
    public static void main(String[] args) {

        System.out.println("Pattern 1");
/*    *
     * *
    * * *
   * * * *
  * * * * *
*/

        for (int i=1;i<=5;i++) {
            for (int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern 2");
/* * * * * *
   * * * *
    * * *
     * *
      *
 */

        for (int i=0;i<=5;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int k=5;k>i;k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern 3");
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

        for (int i=0;i<5;i++) {
            for (int i1 = 0; i1 <5; i1++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern 4");
//* * * * *  i=0 i1=0 - 5
//*       *  1,0        1,4
//*       *  2,0        2,4
//*       *  3,0        3,4
//* * * * * i=4 i1=0-5

        for (int i=0;i<5;i++) {
            for (int i1 = 0; i1 <5; i1++) {
                if(i== 0 || i == 4 || i1==0 || i1==4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Pattern 5");
        for (int i=1;i<=5;i++) {
            for (int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<=5;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int k=5;k>i;k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern 6");
        for (int i=1;i<=5;i++) {
            for (int j=1;j <=i;j++) {
                System.out.print("* ");
            }
            for (int k=5;k>i;k--) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Pattern 7");
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for(int i=1;i<=5;i++){
            for(int k=5;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<i+1;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern 8");
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
        int count = 1;
        for(int i=0;i<=5;i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        System.out.println("Pattern 9");
//        * * * * *
//         * * * *
//        * * * * *
//         * * * *
//        * * * * *

//        for(int i=0;i<6;i++) {
//            for(int j=0;j<1;j++){
//
//            }
//        }
    }
}
