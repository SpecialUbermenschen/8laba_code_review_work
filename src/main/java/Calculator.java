import java.util.function.BinaryOperator;

public class Calculator {
    private BinaryOperator<Integer>[] operations;

    public Calculator() {

        operations = new BinaryOperator[5];

        operations[1] = Integer::sum;
        operations[2] = (a, b) -> a - b;
        operations[3] = (a, b) -> (b != 0) ? a / b : 0;
        operations[4] = (a, b) -> a * b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Не в мою смену 0!!!(не смей делить на 0 пжпжпж)");
            return 0;
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int operation, int a, int b) {
        BinaryOperator<Integer> operator = getOperator(operation);
        if (operator != null) {
            return operator.apply(a, b);
        } else {
            System.out.println("Ошибочка вышлааа (╯°□°)╯");
            return 0;
        }
    }

    private BinaryOperator<Integer> getOperator(int operation) {
        if (operation >= 1 && operation < operations.length) {
            return operations[operation];
        } else {
            return null;
        }
    }
}