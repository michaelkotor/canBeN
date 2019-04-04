import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        boolean m = canBeN(new int[]{4, 3, 2, 1});
        boolean n = python(new double[]{4, 3, 2, 1});
        //N is changed
        System.out.println(m);
        System.out.println(n);
    }

    public static boolean canBeN(int[] nums) {
        double N = 12;
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

    public static boolean python(double[] nums) {
        //double[] array = new double[4];
        double N = 24;

        if  (nums.length == 1) {
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
                    double[] temp_mas;
                    new_nums.add(nums[i] + nums[j]);
                    temp_mas = stackToArray(new_nums);
                    if (python(temp_mas)) {return true;}
                    new_nums.pop();

                    new_nums.add(nums[i] - nums[j]);
                    temp_mas = stackToArray(new_nums);
                    if (python(temp_mas)) {return true;}
                    new_nums.pop();

                    new_nums.add(nums[i] * nums[j]);
                    temp_mas = stackToArray(new_nums);
                    if (python(temp_mas)) {return true;}
                    new_nums.pop();

                    new_nums.add(nums[i] / nums[j]);
                    temp_mas = stackToArray(new_nums);
                    if (python(temp_mas)) {return true;}
                    new_nums.pop();
                }
            }
        }
        return false;
    }

    public static double[] stackToArray(Stack<Double> stack) {
        double[] temp = new double[stack.size()];
        Stack<Double> ourStack = (Stack<Double>) stack.clone();
        for (int i = 0; i < ourStack.size(); i++) {
            temp[0] = ourStack.pop();
        }
        return temp;
    }
}
