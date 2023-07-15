// フィボナッチ数列
class Test {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1 + " " + n2);
        for (int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

// 素数判定
class Test1 {
    public static void main(String[] args) {
        for (int i = 1; i<= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// 二次元配列とループ
class Test2 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}