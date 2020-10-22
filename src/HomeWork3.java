import java.util.Scanner;

    public class HomeWork3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int range = 9;
            int answer = (int)(Math.random() * range);
            int count = 3;
            System.out.println("Угадайте число, попыток у вас " + count);
            System.out.println("Загаданно число от 0 до " + range);
            while (count > 0){
                int imput_number = scanner.nextInt();
                if(imput_number == answer){
                    System.out.println("Поздравляю, Вы угадали!");
                    break;
                } else if(imput_number > answer){
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
                count--;
                if(count == 0) {
                    System.out.println("У вас закончились попытки :(");
                }

            }

        }
    }
