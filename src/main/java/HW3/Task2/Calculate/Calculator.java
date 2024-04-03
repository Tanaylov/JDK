package HW3.Task2.Calculate;

public class Calculator{
    private enum NumberType {INTEGER, LONG, DOUBLE, FLOAT}
    private enum Operation {SUM, MULTIPLY, SUBTRACT, DIVIDE}

    private static <T extends Number> void operation(T number1, T number2, Operation operation) {
        NumberType numberTypeMain = cast(number1);
        NumberType numberType2 = cast(number2);
        if (numberType2.equals(NumberType.DOUBLE) || numberType2.equals(NumberType.FLOAT)) numberTypeMain = numberType2;
        switch (operation) {
            case SUM -> actionSum(number1, number2, numberTypeMain);
            case MULTIPLY -> actionMultiply(number1, number2, numberTypeMain);
            case SUBTRACT -> actionSubtract(number1, number2, numberTypeMain);
            case DIVIDE -> actionDivide(number1, number2, numberTypeMain);
        }
    }

    //region actions:
    private static <T extends Number> void actionSum(T number1, T number2, NumberType numberType) {
        switch (numberType) {
            case INTEGER -> System.out.println(number1.intValue() + number2.intValue());
            case LONG -> System.out.println(number1.longValue() + number2.longValue());
            case FLOAT -> System.out.println(number1.floatValue() + number2.floatValue());
            case DOUBLE -> System.out.println(number1.doubleValue() + number2.doubleValue());
        }
    }

    private static <T extends Number> void actionMultiply(T number1, T number2, NumberType numberType) {
        switch (numberType) {
            case INTEGER -> System.out.println(number1.intValue() * number2.intValue());
            case LONG -> System.out.println(number1.longValue() * number2.longValue());
            case FLOAT -> System.out.println(number1.floatValue() * number2.floatValue());
            case DOUBLE -> System.out.println(number1.doubleValue() * number2.doubleValue());
        }
    }

    private static <T extends Number> void actionSubtract(T number1, T number2, NumberType numberType) {
        switch (numberType) {
            case INTEGER -> System.out.println(number1.intValue() - number2.intValue());
            case LONG -> System.out.println(number1.longValue() - number2.longValue());
            case FLOAT -> System.out.println(number1.floatValue() - number2.floatValue());
            case DOUBLE -> System.out.println(number1.doubleValue() - number2.doubleValue());
        }
    }

    private static <T extends Number> void actionDivide(T number1, T number2, NumberType numberType) {
        switch (numberType) {
            case INTEGER -> System.out.println(number1.intValue() / number2.intValue());
            case LONG -> System.out.println(number1.longValue() / number2.longValue());
            case FLOAT -> System.out.println(number1.floatValue() / number2.floatValue());
            case DOUBLE -> System.out.println(number1.doubleValue() / number2.doubleValue());
        }
    }
    //endregion actions

    //region operations:
    static <T extends Number> void sum(T number1, T number2) {
        operation(number1, number2, Operation.SUM);
    }

    static <T extends Number> void multiply(T number1, T number2) {
        operation(number1, number2, Operation.MULTIPLY);
    }
    static <T extends Number> void subtract(T number1, T number2) {
        operation(number1, number2, Operation.SUBTRACT);
    }
    static <T extends Number> void divide(T number1, T number2) {
        if (number2.equals(0)) System.out.println("You're trying to divide by zero");
        else operation(number1, number2, Operation.DIVIDE);
    }
    //endregion operations

    private static <T extends Number> NumberType cast(T number) {
        return NumberType.valueOf(number.getClass().getSimpleName().toUpperCase());
    }
}
