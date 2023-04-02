
import java.util.*;

    public class values
    {
        public static void main(String[] args)
        {
            int choice;
            double amount;
            double dollar, yuan, euro, tenge, rubl, Adollar, Amanat, lek, Apeso, Dram ;

            Scanner sc = new Scanner(System.in);

            System.out.println("Выбор:");
            System.out.println("Введите 1: Доллар");
            System.out.println("Введите 2: Юани");
            System.out.println("Введите 3: Евро");
            System.out.println("Введите 4: Тенге");
            System.out.println("Введите 5: Российский рубль");
            System.out.println("Введите 6: Австралийский доллар");
            System.out.println("Введите 7: Азербайджанский манат");
            System.out.println("Введите 8: Лек");
            System.out.println("Введите 9: Аргентинское песо");
            System.out.println("Введите 10: Армянский драм");


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
                    Adollar = amount * 1.5;
                    System.out.println(amount + " Долларов = " + Adollar + " Австралийских долларов");
                    Amanat = amount * 1.7;
                    System.out.println(amount + " Долларов = " + Amanat + " Азербайджанских манат");
                    lek = amount * 104.30;
                    System.out.println(amount + " Долларов = " + lek + " Леков");
                    Apeso = amount * 208.39;
                    System.out.println(amount + " Долларов = " + Apeso + " Аргентинских песо");
                    Dram = amount * 388.48;
                    System.out.println(amount + " Долларов = " + Dram + " Армянских драм");
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
                    Adollar = amount * 0.22;
                    System.out.println(amount + " Юаней = " + Adollar + " Австралийских долларов");
                    Amanat = amount * 0.25;
                    System.out.println(amount + " Юаней = " + Amanat + " Азербайджанских манат");
                    lek = amount * 15.18;
                    System.out.println(amount + " Юаней = " + lek + " Леков");
                    Apeso = amount * 30.34;
                    System.out.println(amount + " Юаней = " + Apeso + " Аргентинских песо");
                    Dram = amount * 56.56;
                    System.out.println(amount + " Юаней = " + Dram + " Армянских драм");
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
                    Adollar = amount * 1.63;
                    System.out.println(amount + " Евро = " + Adollar + " Австралийских долларов");
                    Amanat = amount * 1.85;
                    System.out.println(amount + " Евро = " + Amanat + " Азербайджанских манат");
                    lek = amount * 113.38;
                    System.out.println(amount + " Евро = " + lek + " Леков");
                    Apeso = amount * 226.53;
                    System.out.println(amount + " Евро = " + Apeso + " Аргентинских песо");
                    Dram = amount * 422.30;
                    System.out.println(amount + " Евро = " + Dram + " Армянских драм");
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
                    Adollar = amount * 0.0033;
                    System.out.println(amount + " Тенге = " + Adollar + " Австралийских долларов");
                    Amanat = amount * 0.0037;
                    System.out.println(amount + " Тенге = " + Amanat + " Азербайджанских манат");
                    lek = amount * 0.23;
                    System.out.println(amount + " Тенге = " + lek + " Леков");
                    Apeso = amount * 0.46;
                    System.out.println(amount + " Тенге = " + Apeso + " Аргентинских песо");
                    Dram = amount * 0.85;
                    System.out.println(amount + " Тенге = " + Dram + " Армянских драм");
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
                    Adollar = amount * 1.63;
                    System.out.println(amount + " Рублей = " + Adollar + " Австралийских долларов");
                    Amanat = amount * 1.85;
                    System.out.println(amount + " Рублей = " + Amanat + " Азербайджанских манат");
                    lek = amount * 1.35;
                    System.out.println(amount + " Рублей = " + lek + " Леков");
                    Apeso = amount * 2.67;
                    System.out.println(amount + " Рублей = " + Apeso + " Аргентинских песо");
                    Dram = amount * 4.98;
                    System.out.println(amount + " Рублей = " + Dram + " Армянских драм");
                    break;

                case 6:
                    dollar = amount * 0.67;
                    System.out.println(amount + " Австралийских долларов = " + dollar + " Долларов");
                    yuan = amount * 4.59;
                    System.out.println(amount + " Австралийских долларов = " + yuan + " Юань");
                    tenge = amount * 304.19;
                    System.out.println(amount + " Австралийских долларов = " + tenge + " Тенге");
                    euro = amount * 0.62;
                    System.out.println(amount + " Австралийских долларов = " + euro + " Евро");
                    rubl = amount * 52.17;
                    System.out.println(amount + " Австралийских долларов = " + rubl + " Рублей");
                    Amanat = amount * 1.14;
                    System.out.println(amount + " Австралийских долларов = " + Amanat + " Азербайджанских манат");
                    lek = amount * 69.76;
                    System.out.println(amount + " Австралийских долларов = " + lek + " Леков");
                    Apeso = amount * 139.37;
                    System.out.println(amount + " Австралийских долларов = " + Apeso + " Аргентинских песо");
                    Dram = amount * 259.82;
                    System.out.println(amount + " Австралийских долларов = " + Dram + " Армянских драм");
                    break;

                case 7:
                    dollar = amount * 0.59;
                    System.out.println(amount + " Азербайджанских манат = " + dollar + " Долларов");
                    yuan = amount * 4.04;
                    System.out.println(amount + " Азербайджанских манат = " + yuan + " Юань");
                    tenge = amount * 267.54;
                    System.out.println(amount + " Азербайджанских манат = " + tenge + " Тенге");
                    euro = amount * 0.54;
                    System.out.println(amount + " Азербайджанских манат = " + euro + " Евро");
                    rubl = amount * 45.88;
                    System.out.println(amount + " Азербайджанских манат = " + rubl + " Рублей");
                    Adollar = amount * 0.88;
                    System.out.println(amount + " Азербайджанских манат = " + Adollar + " Австралийских долларов");
                    lek = amount * 61.35;
                    System.out.println(amount + " Азербайджанских манат = " + lek + " Леков");
                    Apeso = amount * 122.58;
                    System.out.println(amount + " Азербайджанских манат = " + Apeso + " Аргентинских песо");
                    Dram = amount * 228.52;
                    System.out.println(amount + " Азербайджанских манат = " + Dram + " Армянских драм");
                    break;

                case 8:
                    dollar = amount * 0.0096;
                    System.out.println(amount + " Леков = " + dollar + " Долларов");
                    yuan = amount * 0.066;
                    System.out.println(amount + " Леков = " + yuan + " Юань");
                    tenge = amount * 4.38;
                    System.out.println(amount + " Леков = " + tenge + " Тенге");
                    euro = amount * 0.0088;
                    System.out.println(amount + " Леков = " + euro + " Евро");
                    rubl = amount * 0.75;
                    System.out.println(amount + " Леков = " + rubl + " Рублей");
                    Adollar = amount * 0.014;
                    System.out.println(amount + " Леков = " + Adollar + " Австралийских долларов");
                    Amanat = amount * 0.016;
                    System.out.println(amount + " Леков = " + Amanat + " Азербайджанских манат");
                    Apeso = amount * 2.01;
                    System.out.println(amount + " Леков = " + Apeso + " Аргентинских песо");
                    Dram = amount * 3.74;
                    System.out.println(amount + " Леков = " + Dram + " Армянских драм");
                    break;

                case 9:
                    dollar = amount * 0.0048;
                    System.out.println(amount + " Аргентинских песо = " + dollar + " Долларов");
                    yuan = amount * 0.033;
                    System.out.println(amount + " Аргентинских песо = " + yuan + " Юань");
                    tenge = amount * 2.18;
                    System.out.println(amount + " Аргентинских песо = " + tenge + " Тенге");
                    euro = amount * 0.0044;
                    System.out.println(amount + " Аргентинских песо = " + euro + " Евро");
                    rubl = amount * 0.37;
                    System.out.println(amount + " Аргентинских песо = " + rubl + " Рублей");
                    Adollar = amount * 0.0072;
                    System.out.println(amount + " Аргентинских песо = " + Adollar + " Австралийских долларов");
                    lek = amount * 0.50;
                    System.out.println(amount + " Аргентинских песо = " + lek + " Леков");
                    Amanat = amount * 0.0082;
                    System.out.println(amount + " Аргентинских песо = " + Amanat + " Азербайджанских манат");
                    Dram = amount * 1.86;
                    System.out.println(amount + " Аргентинских песо = " + Dram + " Армянских драм");
                    break;

                case 10:
                    dollar = amount * 0.0026;
                    System.out.println(amount + " Армянских драм = " + dollar + " Долларов");
                    yuan = amount * 0.018;
                    System.out.println(amount + " Армянских драм = " + yuan + " Юань");
                    tenge = amount * 1.17;
                    System.out.println(amount + " Армянских драм = " + tenge + " Тенге");
                    euro = amount * 0.0024;
                    System.out.println(amount + " Армянских драм = " + euro + " Евро");
                    rubl = amount * 0.20;
                    System.out.println(amount + " Армянских драм = " + rubl + " Рублей");
                    Adollar = amount * 0.0039;
                    System.out.println(amount + " Армянских драм = " + Adollar + " Австралийских долларов");
                    lek = amount * 0.27;
                    System.out.println(amount + " Армянских драм = " + lek + " Леков");
                    Amanat = amount * 0.0044;
                    System.out.println(amount + " Армянских драм = " + Amanat + " Азербайджанских манат");
                    Apeso = amount * 0.54;
                    System.out.println(amount + " Армянских драм = " + Apeso + "  Аргентинских песо");
                    break;



                default:
                    System.out.println("Invalid input");
            }
        }
    }

