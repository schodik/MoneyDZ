
import java.util.*;

    public class values
    {
        public static void main(String[] args)
        {
            int choice;
            double amount;
            double dollar, yuan, euro, tenge, rubl;

            Scanner sc = new Scanner(System.in);

            System.out.println("Выбор:");
            System.out.println("Введите 1: Доллар");
            System.out.println("Введите 2: Юани");
            System.out.println("Введите 3: Евро");
            System.out.println("Введите 4: Тенге");
            System.out.println("Введите 5: Российский рубль");


            System.out.println("\nВаш выбор: ");
            choice = sc.nextInt();
            System.out.println("Ваш выбор это: " + choice);

            System.out.println("Введите количество денег которые вы хотите конвертировать");
            amount = sc.nextFloat();
            System.out.println("Ваш выбор: " + amount);

            switch (choice)
            {
                case 1:
                    yuan = amount * 7.12;
                    System.out.println(amount + " Долларов = " + yuan + " Юань");
                    euro = amount * 1.02;
                    System.out.println(amount + " Долларов = " + euro + " Евро");
                    tenge = amount * 454.82;
                    System.out.println(amount + " Долларов = " + tenge + " Тенге");
                    rubl = amount * 78.00;
                    System.out.println(amount + " Долларов = " + rubl + " Рублей");
                    break;

                case 2:
                    dollar = amount * 0.14;
                    System.out.println(amount + " Юаней = " + dollar + " Долларов");
                    euro = amount * 0.14;
                    System.out.println(amount + " Юаней = " + euro + " Евро");
                    tenge = amount * 66.22;
                    System.out.println(amount + " Юаней = " + tenge + " Тенге");
                    rubl = amount * 11.36;
                    System.out.println(amount + " Юаней = " + rubl + " Рублей");
                    break;

                case 3:
                    dollar = amount * 0.98;
                    System.out.println(amount + " Евро = " + dollar + " Долларов");
                    yuan = amount * 6.98;
                    System.out.println(amount + " Евро = " + yuan + " Юань");
                    tenge = amount * 494.41;
                    System.out.println(amount + " Евро = " + tenge + " Тенге");
                    rubl = amount * 84.79;
                    System.out.println(amount + " Евро = " + rubl + " Рублей");
                    break;

                case 4:
                    dollar = amount * 0.015;
                    System.out.println(amount + " Тенге = " + dollar + " Долларов");
                    yuan = amount * 0.0022;
                    System.out.println(amount + " Тенге = " + yuan + " Юань");
                    euro = amount * 0.0020;
                    System.out.println(amount + " Тенге = " + euro + " Евро");
                    rubl = amount * 0.17;
                    System.out.println(amount + " Тенге = " + rubl + " Рублей");
                    break;

                case 5:
                    dollar = amount * 0.013;
                    System.out.println(amount + " Рублей = " + dollar + " Долларов");
                    yuan = amount * 0.088;
                    System.out.println(amount + " Рублей = " + yuan + " Юань");
                    tenge = amount * 5.83;
                    System.out.println(amount + " Рублей = " + tenge + " Тенге");
                    euro = amount * 0.012;
                    System.out.println(amount + " Рублей = " + euro + " Евро");
                    break;


                default:
                    System.out.println("Invalid input");
            }
        }
    }

