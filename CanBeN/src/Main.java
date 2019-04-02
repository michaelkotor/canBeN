public class Main {
    public static void main(String[] args) {
        boolean m = canBeN(new int[]{1, 3, 4, 6});
        System.out.println("'Z'");
        System.out.println(m);

    }

    public static boolean canBeN(int[] nums) {
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
}
