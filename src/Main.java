public class Main {
    public static void main(String[] args) {

        /***************************************/
        System.out.print("Firs point: ");

       byte[] by = new byte[4];
       by[0] = 0;
       by[1] = 1;
       by[2] = 2;
       by[3] = 3;

       short [] sh = new short[4];

       for (byte i = 0 ; i < 4 ; i ++) {

           sh[i] =by[i];
           System.out.print(sh[i] + " ");
       }
        System.out.println();

       float fl_1 = 0.2f;
       float fl_2 = 2;
       int in = 4 ;
       double db = 12.0;

        System.out.println(fl_1 / fl_2);
        System.out.println(in / fl_1);
        System.out.println(db / in);

        char [] ch = new char[10];
        ch[0] = 'A';
        ch[1] = 'B';
        ch[2] = 'C';
        ch[3] = 'D';
        ch[4] = 'E';
        ch[5] = 'F';
        ch[6] = 'G';
        ch[7] = 'O';
        ch[8] = '!';
        ch[9] = 'R';

        System.out.println("HEllO " + ch[4]+ch[6]+ch[7]+ch[9]+ch[8]);


        System.out.println();
        /***************************************/
        System.out.print("Second point: ");
        int x = 0;

        while (x < 25) {
            x++;
            System.out.print(x + " ");
        }
        System.out.println();
        /***************************************/
        System.out.print("Third point: ");

        int[] array_1 = new int[10];
        array_1[0] = 0;
        array_1[1] = 1;
        array_1[2] = 2;
        array_1[3] = 3;
        array_1[4] = 4;
        array_1[5] = 5;
        array_1[6] = 6;
        array_1[7] = 7;
        array_1[8] = 8;
        array_1[9] = 9;

        for (int i = 0; i < 10; i++) {

            System.out.print(array_1[i] + " ");
        }
        System.out.println();
        /***************************************/
        System.out.print("Fourth point: ");

        int[] array_2 = new int[10];
        array_2[0] = 1;
        array_2[1] = 2;
        array_2[2] = 3;
        array_2[3] = 4;
        array_2[4] = 5;
        array_2[5] = 6;
        array_2[6] = 7;
        array_2[7] = 8;
        array_2[8] = 9;
        array_2[9] = 10;

        for (int i = 0; i < 10; i++) {

            System.out.print(array_2[i] + " ");
        }
        System.out.println();
        /***************************************/
        System.out.print("Fifth point: ");

        int[] array_3 = new int[10];
        array_3[0] = 10;
        array_3[1] = 9;
        array_3[2] = 8;
        array_3[3] = 7;
        array_3[4] = 6;
        array_3[5] = 5;
        array_3[6] = 4;
        array_3[7] = 3;
        array_3[8] = 2;
        array_3[9] = 1;

        for (int i = 0; i < 10; i++) {

            System.out.print(array_3[i] + " ");
        }
        System.out.println();
        /***************************************/
        System.out.print("Sixth point: ");

        int number1;
        int number2;

        number1 = 10;
        number2 = 5;

        char op;
        op = '/';

        if (op == '+') {
            System.out.println(number1 + number2);
        } else if (op == '-') {
            System.out.println(number1 - number2);
        } else if (op == '*') {
            System.out.println(number1 * number2);
        } else if (op == '/') {
            System.out.println(number1 / number2);
        }
        /***************************************/
        System.out.print("Seventh point: ");

        int[] a = new int[9];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;

        int[] b = new int[9];

        for (int c = 0 ; c < 9 ; c ++){
            b[c] = a[c];
        }
        for (int i = 0, j = 8; i <9 && j >=0; i++, j--) {

            a[i] = b[j];
            System.out.print(a[i] + " ");
        }

    }
}
