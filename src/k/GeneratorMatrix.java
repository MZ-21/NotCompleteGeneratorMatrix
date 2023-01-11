package k;
import java.util.*;

public class GeneratorMatrix {
    public static void main(String[] args) {


        int[] f1 = {0, 0, 0, 0};int[] f2 = {0, 0, 0, 1};int[] f3 = {0, 0, 1, 0};int[] f4 = {0, 1, 0, 0};
        int[] f5 = {1, 0, 0, 0};int[] f6 = {1, 1, 0, 0};int[] f7 = {1, 0, 1, 0};int[] f8 = {0, 1, 1, 0};
        int[] f9 = {0, 0, 1, 1};int[] f10 = {1, 1, 1, 0};int[] f11 = {1, 0, 1, 1};int[] f12 = {0, 1, 1, 1};
        int[] f13 = {1, 1, 0, 1};int[] f14 = {1, 0, 0, 1};int[] f15 = {0, 1, 0, 1};int[] f16 = {1, 1, 1, 1};


        int[] code1 = new int[7];int[] code2 = new int[7];int[] code3 = new int[7];int[] code4 = new int[7];
        int[] code5 = new int[7];int[] code6 = new int[7];int[] code7 = new int[7];int[] code8 = new int[7];
        int[] code9 = new int[7];int[] code10 = new int[7];int[] code11 = new int[7];int[] code12 = new int[7];
        int[] code13 = new int[7];int[] code14 = new int[7];int[] code15 = new int[7];int[] code16 = new int[7];


        code1 = codeG(code1, f1);
        code2 = codeG(code2, f2);
        code3 = codeG(code3, f3);
        code4 = codeG(code4, f4);
        code5 = codeG(code5, f5);
        code6 = codeG(code6, f6);
        code7 = codeG(code7, f7);
        code8 = codeG(code8, f8);
        code9 = codeG(code9, f9);
        code10 = codeG(code10, f10);
        code11 = codeG(code11, f11);
        code12 = codeG(code12, f12);
        code13 = codeG(code13, f13);
        code14 = codeG(code14, f14);
        code15 = codeG(code15, f15);
        code16 = codeG(code16, f16);

        /*print(code1);print(code2);print(code3);print(code4);print(code5);print(code6);print(code7);print(code8);print(code9);
        print(code10);print(code11);print(code12);print(code13);print(code14);print(code15);print(code16);*/

        int[] fix = {1, 0, 0, 0,0,0,0};
        print(fix);
        print(code1);

        if (compare(code1, fix) == 0 || compare(code1, fix) == 1) {
            System.out.println("The nearest neighbour is code1: ");

        } else if ((compare(code2, fix) == 0) || (compare(code2, fix)) == 1) {
            System.out.println("The nearest neighbour is code2: ");

        } else if (compare(code3, fix) == 0 || compare(code3, fix) == 1) {
            System.out.println("The nearest neighbour is code3: ");

        } else if (compare(code4, fix) == 0 || compare(code4, fix) == 1) {
            System.out.println("The nearest neighbour is code4: ");

        } else if (compare(code5, fix) == 0 || compare(code5, fix) == 1) {
            System.out.println("The nearest neighbour is code5: ");

        } else if (compare(code6, fix) == 0 || compare(code6, fix) == 1) {
            System.out.println("The nearest neighbour is code6: ");

        } else if (compare(code7, fix) == 0 || compare(code7, fix) == 1) {
            System.out.println("The nearest neighbour is code7: ");

        } else if (compare(code8, fix) == 0 || compare(code8, fix) == 1) {
            System.out.println("The nearest neighbour is code8: ");

        } else if (compare(code9, fix) == 0 || compare(code9, fix) == 1) {
            System.out.println("The nearest neighbour is code9: ");

        } else if (compare(code10, fix) == 0 || compare(code10, fix) == 1) {
            System.out.println("The nearest neighbour is code10: ");

        } else if (compare(code11, fix) == 0 || compare(code12, fix) == 1) {
            System.out.println("The nearest neighbour is code11: ");

        } else if (compare(code12, fix) == 0 || compare(code12, fix) == 1) {
            System.out.println("The nearest neighbour is code12: ");

        }
        else if (compare(code13, fix) == 0 || compare(code13, fix) == 1) {
            System.out.println("The nearest neighbour is code13, ");

        } else if (compare(code14, fix) == 0 || compare(code14, fix) == 1) {
            System.out.println("The codes match: ");
        }
    }

    public static void print(int[] a) {
        System.out.print("[");
        for (int s = 0; s < a.length; s++) {
            System.out.print(a[s]);
        }
        System.out.print("]");

    }

    public static int[] codeG(int[] code, int[] f) {
        int[] c1 = {1, 0, 0, 0};
        int[] c2 = {0, 1, 0, 0};
        int[] c3 = {0, 0, 1, 0};
        int[] c4 = {0, 0, 0, 1};
        int[] c5 = {1, 1, 0, 1};
        int[] c6 = {1, 0, 1, 1};
        int[] c7 = {0, 1, 1, 1};
        code = new int[7];


        for (int j = 0; j < code.length; j++) {
            for (int i = 0; i < c1.length; i++) {
                if ((j == 1)) {
                    c1 = c2;
                } else if ((j == 2)) {
                    c1 = c3;
                } else if (j == 3) {
                    c1 = c4;
                } else if (j == 4) {
                    c1 = c5;
                } else if (j == 5) {
                    c1 = c6;
                } else if (j == 6) {
                    c1 = c7;
                }
                code[j] += c1[i] * f[i];
            }
            code[j] = code[j] % 2;
        }
        return code;
    }

    public static int compare(int[] code, int[] nearestN) {
        int countF = 0;
        int index = 0;
        for (int i = 0; i < 7 && countF < 2; i++) {
            if ((code[i]) != (nearestN[i])) {
                countF++;
                index = i;
            }
        }
        System.out.println(countF);
            return countF;
    }
}



































