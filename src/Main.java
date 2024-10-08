public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        var dog = 80;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\nЗадача 2:");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\nЗадача 3:");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\nЗадача 4:");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println("\nЗадача 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        System.out.println("\nЗадача 6:");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sumWeight = boxer1 + boxer2;
        System.out.println("общая массса = " + sumWeight);
        var subWeight = boxer2 - boxer1;
        System.out.println("разница массы = " + subWeight);

        System.out.println("\nЗадача 7:");
        var ostWeight = boxer2 % boxer1;
        System.out.println("остаток от деления = " + ostWeight);
    }
}