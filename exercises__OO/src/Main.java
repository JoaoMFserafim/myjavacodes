import java.util.Scanner;

public class Main {
    public void sum_of_odd_up_to_this_number(){
        Scanner read = new Scanner(System.in);

        int sum = 0;
        int number_insert = 0;

        System.out.println("Insert number :");
        number_insert = read.nextInt();

        for (int i = 0;i <=number_insert;i++){
            if (i % 2 != 0){
                sum++;
            }
        }

        System.out.println("the sum of odds up to this number is :" + sum);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number_1;
        int number_2;

        System.out.println("What's the first number ?");
        number_1 = read.nextInt();

        System.out.println(" What' the second number ?");
        number_2 = read.nextInt();

        if (number_1 > number_2){
            System.out.println("the first number is bigger than second");
        } else if (number_1 == number_2) {
            System.out.println("the number are equals");
        } else {
            System.out.println("the second number is bigger than first");
        }
        Wheel wheel = new Wheel(18,"modern","black","carbon");
        wheel.setColor("gray");
        wheel.setMaterial("alluminium");
        wheel.setModel("classic");
        wheel.setSize(16);

        Car car = new Car("black","hach","sportive",210000.00);
        Owner owner = new Owner(999999999,'m',"car owner");

        car.setColor("white");
        car.setPrice(190000.00);
        car.setType("economic");
        car.setChassis_model("sedan");

        owner.setCpf(1111111111);
        owner.setGender('f');
        owner.setType_of_propriety("house");

    }
}