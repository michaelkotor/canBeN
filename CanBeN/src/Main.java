import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        boolean m = canBeN1(new int[]{24, 0, 0, 0});
        boolean n = canBeN2(new double[]{1, 2, 1, 1});
        /*
        * Hi, i have made two functions. They both give the same result, but the second one has to take double as a parameter, because
        * it uses recursion.
        * */
        System.out.println(m);
        System.out.println(n);
        //test();
    }

    public static boolean canBeN1(int[] nums) {
        double N = 24;
        String[] list = {"+", "-", "*", "/"};
        double[] array = new double[4];

        for (int i = 0; i < nums.length; i++) {
            array[i] = Double.valueOf(nums[i]);
        }

        double[] tempN = new double[4];
        String[] tempS = new String[3];
        for (int firstNumber = 0; firstNumber < array.length; firstNumber++) {
            tempN[0] = array[firstNumber];
            for (int firstItem = 0; firstItem < list.length; firstItem++) {
                tempS[0] = list[firstItem];
                for (int secondNumber = 0; secondNumber < array.length; secondNumber++) {
                    if (secondNumber == firstNumber) {
                        continue;
                    }

                    tempN[1] = array[secondNumber];
                    for (int secondItem = 0; secondItem < list.length; secondItem++) {
                        tempS[1] = list[secondItem];
                        for (int thirdNumber = 0; thirdNumber < array.length; thirdNumber++) {
                            if ((secondNumber == thirdNumber) || (thirdNumber == firstNumber)) {
                                continue;
                            }

                            tempN[2] = array[thirdNumber];
                            for (int thirdItem = 0; thirdItem < list.length; thirdItem++) {
                                tempS[2] = list[thirdItem];
                                for (int fourthNumber = 0; fourthNumber < array.length; fourthNumber++) {
                                    if ((firstNumber == fourthNumber || secondNumber == fourthNumber || thirdNumber == fourthNumber)) {
                                        continue;
                                    }
                                    tempN[3] = array[fourthNumber];
                                    boolean b = Poland.count(tempN, tempS, N);
                                    if (b) {
                                        return true;
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        return false;
    }

    public static boolean canBeN2(double[] nums) {
        /*
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
        */

        double N = 24;

        if (nums.length == 1) {
            return Math.abs(nums[0] - N) < 0.0000001;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                Stack<Double> new_nums = new Stack();
                for (int k = 0; k < nums.length; k++) {
                    if ((k != i) && (k != j)) {
                        new_nums.add(nums[k]);
                    }
                }
                double[] temp_mas;
                new_nums.push(nums[i] + nums[j]);
                temp_mas = stackToArray(new_nums);
                if (canBeN2(temp_mas)) {
                    return true;
                }
                new_nums.pop();

                new_nums.push(nums[i] - nums[j]);
                temp_mas = stackToArray(new_nums);
                if (canBeN2(temp_mas)) {
                    return true;
                }
                new_nums.pop();

                new_nums.push(nums[i] * nums[j]);
                temp_mas = stackToArray(new_nums);
                if (canBeN2(temp_mas)) {
                    return true;
                }
                new_nums.pop();

                new_nums.push(nums[i] / nums[j]);
                temp_mas = stackToArray(new_nums);
                if (canBeN2(temp_mas)) {
                    return true;
                }
                new_nums.pop();

            }
        }
        return false;
    }

    public static double[] stackToArray(Stack<Double> stack) {
        double[] temp = new double[stack.size()];
        Stack<Double> ourStack = (Stack<Double>) stack.clone();
        for (int i = ourStack.size() - 1; i >= 0; i--) {
            temp[i] = ourStack.pop();
        }
        return temp;
    }

    public static void test() {
        int[] numbersI = new int[4];
        double[] numbersD = new double[4];
        boolean b;

        for (int i = 0; i < 1000; i++) {
            for (int  j = 0; j < 4; j++) {
                int a = Math.round((float)Math.random());
                numbersI[j] = a;
                numbersD[j] = (double) a;
            }
            if (canBeN1(numbersI) != canBeN2(numbersD)) {
                System.out.println("In this numbers we have correlation!");
                for (int k = 0; k < 4; k++) {
                    System.out.print(numbersI[k]);
                }
                for (int k = 0; k < 4; k++) {
                    System.out.print(numbersD[k]);
                }
            }
        }
        System.out.println("I finished!");
    }
}
