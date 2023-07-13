public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class FirstComment {
    public static void main(String[] args) {
        System.out.println("Java is a programming language");
    }
}

class Variable {
    public static void main(String[] args) {
        int month;
        month = 9;
        int day = 16;

        System.out.println("このチャンネルは");
        System.out.println(month + "月" + day + "日に公開しました");
    }
}

class DataType {
    public static void main(String[] args) {
        int month = 12;
        int day = 29;
        float weight = 63.0f;
        double height = 168.5;
        char bloodType = 'A';

        String name = "佐藤";

        System.out.println("こんにちは!" + name + "です。");
        System.out.println("身長は" + height + "cmで、体重は" + weight + "kgです。");
        System.out.println("誕生日は" + month + "月" + day + "日です。");
        System.out.println("血液型は" + bloodType + "型です。");
        System.out.println("チャンネル登録や拡散よろしく！");
    }
}

class Array {
    public static void main(String[] args) {
        int[] score = new int[3];
        score[0] = 20;
        score[1] = 100;
        score[2] = 75;

        String[] name = {"鈴木", "田中", "中村"};

        System.out.println(name[0] + "さんの点数は" + score[0] + "点です。");
        System.out.println(name[1] + "さんの点数は" + score[1] + "点です。");
        System.out.println(name[2] + "さんの点数は" + score[2] + "点です。");
        System.out.println("受験者数：" + score.length + "人");
    }
}

class MultiArray {
    public static void main(String[] args) {
        int[][] allScore = {{20, 30, 40}, {50, 60, 70}};
        System.out.println("1組の1年生の国語の点数は" + allScore[0][0] + "点です。");
    }
}

class CmdLine {
    public static void main(String[] args) {
        System.out.println("args[0]:" + args[0]);
        System.out.println("args[1]:" + args[1]);
        System.out.println("args.length:" + args.length);
    }
}


class ScoreArray {
    public static void main(String[] args) {
        int[] score = {90, 80, 70, 60};

        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1) + "人目は" + score[i] + "点です。");
        }
    }
}

class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}

class Branch1 {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        double rate =0.10;
        int discount, amount;

        if(price >= 3000){
            discount = 300;
        } else {
            discount = 0;
        }

        amount = (int)((price - discount) * (1 + rate));
        System.out.println("値引金額：" + discount + "円");
        System.out.println("消費税込みの金額：" + amount + "円");
    }
}

class Branch3 {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        switch(num){
            case 1:
                System.out.println("入園料金：8400円");
                break;
            case 2:
                System.out.println("入園料金：7000円");
                break;
            case 3:
                System.out.println("入園料金：5000円");
                break;
            default:
                System.out.println("１：一般, 2：中学生, 3：小学生");
        }
    }
}

