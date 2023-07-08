// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// import java.util.Scanner;

// public class homework1 {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Enter the number: ");
//         int i = iScanner.nextInt();
//         System.out.printf("Sum of numbers: %d", sumNumber(i));
//         iScanner.close();
//     }

//     public static int sumNumber(int a) {
//         return (a * (a + 1)) / 2;
//     }
// }

// 2) Вывести все простые числа от 1 до 1000
// public class homework1 {
//     public static void main(String[] args) {
//     for (int i = 2; i <= 1000; i++){
//             boolean isPrimeNumber = true;
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isPrimeNumber = false;
//                     break;
//                 }
//             }

//             if (isPrimeNumber) {System.out.println("Простые числа: " + i);}
//         }
//     }
// }

// 3) Реализовать простой калькулятор
// import java.util.Scanner;
// public class homework1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int first = sc.nextInt();
//         System.out.print("Enter the operation + - / *: ");
//         char operation;
//         operation = sc.next().charAt(0);
//         System.out.print("Enter the second number: ");
//         int second = sc.nextInt();
//         int result;
//         switch (operation) {
//             case '+':
//                 result = first + second;
//                 System.out.printf("Result: %d",result);
//                 break;
//             case '-':
//                 result = first - second;
//                 System.out.printf("Result: %d",result);
//                 break;
//             case '/':
//                 result = first / second;
//                 System.out.printf("Result: %d",result);
//                 break;
//             case '*':
//                 result = first * second;
//                 System.out.printf("Result: %d",result);
//                 break;

//         }
//         sc.close();
//     }
// }