//Вариант 1
void main() {
    int[] A =  {5,1,60,78,3};
    int max_A = 0;
    int min_A = A[0];

    int[] B =  {7,2,68,789,30,55};
    int max_B = 0;
    int min_B = B[0];

    int[] C =  {5,-1,60,78,3,700,999,};
    int max_C = 0;
    int min_C = C[0];

    for (int i = 0; i < A.length;i++){
        if (A[i] > max_A) {
            max_A = i;
        }

        if (A[i] < min_A) {
            min_A = i;
        }
    }

    for (int i = 0; i < B.length;i++){
        if (B[i] > max_B) {
            max_B = i;
        }

        if (B[i] < min_B) {
            min_B = i;
        }
    }

    for (int i = 0; i < C.length;i++){
        if (C[i] > max_C) {
            max_C = i;
        }

        if (C[i] < min_C) {
            min_C = i;
        }
    }

    System.out.println("Массив А:");
    System.out.print("["+A[0]);
        for (int i = 1; i < A.length; i++) {
            System.out.print(" "+A[i]);
        }
        System.out.print("]");
    System.out.println("\nНаибольший элемент массива A:"+A[max_A]+"(Индекс:"+max_A+")");
    System.out.println("Наименьший элемент массива A:"+A[min_A]+"(Индекс:"+min_A+")");

    System.out.println("\nМассив B:");
    System.out.print("["+B[0]);
    for (int i = 1; i < B.length; i++) {
        System.out.print(" "+B[i]);
    }
    System.out.print("]");
    System.out.println("\nНаибольший элемент массива B:"+B[max_B]+"(Индекс:"+max_B+")");
    System.out.println("Наименьший элемент массива B:"+B[min_B]+"(Индекс:"+min_B+")");

    System.out.println("\nМассив С:");
    System.out.print("["+C[0]);
    for (int i = 1; i < C.length; i++) {
        System.out.print(" "+C[i]);
    }
    System.out.print("]");
    System.out.println("\nНаибольший элемент массива С:"+C[max_C]+"(Индекс:"+max_C+")");
    System.out.println("Наименьший элемент массива С:"+C[min_C]+"(Индекс:"+min_C+")");
}