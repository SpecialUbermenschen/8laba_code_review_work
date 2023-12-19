public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b ==0){
            System.out.println("Не дели на 0");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int operation, int a, int b){
        switch (operation) {
            case 1:
                return add(a, b);
            case 2:
                return dif(a, b);
            case 3:
                return div(a, b);
            case 4:
                return times(a, b);
            default:
                System.out.println("Неправильно, попробуйте еще раз");
                return 0; // or handle the error in a different way
        }
    }
}
