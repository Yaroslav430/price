import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int operand1 = nextInt();
        int operand2 = nextInt();
        char operation = getOperation();
        int result = calc(operand1, operand2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int nextInt() {
        System.out.println("Введите число:");
        int operand;
            if (scanner.hasNextInt()) {
                operand = scanner.nextInt();
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                scanner.next();//рекурсия
                operand = nextInt();
            }
            return operand;
        }

        private static char getOperation () {
            System.out.println("Введите операцию");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }

        public static int calc ( int operand1, int operand2, char operation){
            int result;
            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(operand1, operand2, getOperation());
            }
            return result;
        }
    }

//Какой оператор лучше использовать, чтобы проверить, какую операцию выполнять?(swith)//

//Если пользователь ввёл неподдерживаемую операцию, стоит ли ему сообщить об этом?
// ( проверка ввода .. предупредить об ошибке)//

// Нужна ли дополнительная переменная для второго операнда? А для результата?
// (operand2 для второго и result для результата)//

// Можно ли написать весь код в одном методе? или вынести код для каждой операции отдельно?
// (лучше разнести получение одного, второго операнда и знака операции отдельно, и отдельный метод для расчета)//

//Калькулятор//