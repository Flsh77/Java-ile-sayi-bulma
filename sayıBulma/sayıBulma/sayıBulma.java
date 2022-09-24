package sayıBulma;

public class sayıBulma {
    
    public static void main(String[] args) {
        int firstNumber = -9;
        int secondNumber = 9;
        int thirdNumber = 8;

        // && = and
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Büyük Sayı : " + firstNumber);
        }

        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Büyük Sayı : " + secondNumber);
        }

        else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Büyük Sayı : " + thirdNumber);
        }

        else{
            System.out.println("Büyük Sayı Yok");
        }





    }



}
