public class Poland {
    private static double EPS = 0.00000001;
    public static double countABCDxyz(double nums[], String[] list) {
        double temp1 = 0, temp2 = 0, temp3 = 0;
        switch (list[0]) {
            case "+":
                temp1 = nums[2] + nums[3];
                break;
            case "-":
                temp1 = nums[2] - nums[3];
                break;
            case "*":
                temp1 = nums[2] * nums[3];
                break;
            case "/":
                temp1 = nums[2] / nums[3];
                break;
        }
        switch (list[1]) {
            case "+":
                temp2 = temp1 + nums[1];
                break;
            case "-":
                temp2 = temp1 - nums[1];
                break;
            case "*":
                temp2 = temp1 * nums[1];
                break;
            case "/":
                temp2 = temp1 / nums[1];
                break;
        }
        switch (list[2]) {
            case "+":
                temp3 = temp2 + nums[0];
                break;
            case "-":
                temp3 = temp2 - nums[0];
                break;
            case "*":
                temp3 = temp2 * nums[0];
                break;
            case "/":
                temp3 = temp2 / nums[0];
                break;
        }
        return temp3;
    }

    public static double countABCxyDz(double[] nums, String[] list) {
        double temp1 = 0, temp2 = 0, temp3 = 0;
        switch (list[0]) {
            case "+":
                temp1 = nums[1] + nums[2];
                break;
            case "-":
                temp1 = nums[1] - nums[2];
                break;
            case "*":
                temp1 = nums[1] * nums[2];
                break;
            case "/":
                temp1 = nums[1] / nums[2];
                break;
        }

        switch (list[1]) {
            case "+":
                temp2 = nums[0] + temp1;
                break;
            case "-":
                temp2 = nums[0] - temp1;
                break;
            case "*":
                temp2 = nums[0] * temp1;
                break;
            case "/":
                temp2 = nums[0] / temp1;
                break;
        }
        switch (list[2]) {
            case "+":
                temp3 = temp2 + nums[3];
                break;
            case "-":
                temp3 = temp2 - nums[3];
                break;
            case "*":
                temp3 = temp2 * nums[3];
                break;
            case "/":
                temp3 = temp2 / nums[3];
                break;
        }
        return temp3;
    }

    public static double countABCxDyz(double[] nums, String[] list) {
        double temp1 = 0, temp2 = 0, temp3 = 0;
        switch (list[0]) {
            case "+":
                temp1 = nums[1] + nums[2];
                break;
            case "-":
                temp1 = nums[1] - nums[2];
                break;
            case "*":
                temp1 = nums[1] * nums[2];
                break;
            case "/":
                temp1 = nums[1] / nums[2];
                break;
        }

        switch (list[1]) {
            case "+":
                temp2 = temp1 + nums[3];
                break;
            case "-":
                temp2 = temp1 - nums[3];
                break;
            case "*":
                temp2 = temp1 * nums[3];
                break;
            case "/":
                temp2 = temp1 / nums[3];
                break;
        }
        switch (list[2]) {
            case "+":
                temp3 = nums[0] + temp2;
                break;
            case "-":
                temp3 = nums[0] - temp2;
                break;
            case "*":
                temp3 = nums[0] * temp2;
                break;
            case "/":
                temp3 = nums[0] / temp2;
                break;
        }
        return temp3;
    }

    public static double countABxCyDz(double[] nums, String[] list) {
        double temp1 = 0, temp2 = 0, temp3 = 0;
        switch (list[0]) {
            case "+":
                temp1 = nums[0] + nums[1];
                break;
            case "-":
                temp1 = nums[0] - nums[1];
                break;
            case "*":
                temp1 = nums[0] * nums[1];
                break;
            case "/":
                temp1 = nums[0] / nums[1];
                break;
        }

        switch (list[1]) {
            case "+":
                temp2 = temp1 + nums[2];
                break;
            case "-":
                temp2 = temp1 - nums[2];
                break;
            case "*":
                temp2 = temp1 * nums[2];
                break;
            case "/":
                temp2 = temp1 / nums[2];
                break;
        }
        switch (list[2]) {
            case "+":
                temp3 = temp2 + nums[3];
                break;
            case "-":
                temp3 = temp2 - nums[3];
                break;
            case "*":
                temp3 = temp2 * nums[3];
                break;
            case "/":
                temp3 = temp2 / nums[3];
                break;
        }
        return temp3;
    }

    public static double countABxCDyz(double[] nums, String[] list) {
        double temp1 = 0, temp2 = 0, temp3 = 0;
        switch (list[0]) {
            case "+":
                temp1 = nums[0] + nums[1];
                break;
            case "-":
                temp1 = nums[0] - nums[1];
                break;
            case "*":
                temp1 = nums[0] * nums[1];
                break;
            case "/":
                temp1 = nums[0] / nums[1];
                break;
        }

        switch (list[1]) {
            case "+":
                temp2 = nums[2] + nums[3];
                break;
            case "-":
                temp2 = nums[2] - nums[3];
                break;
            case "*":
                temp2 = nums[2] * nums[3];
                break;
            case "/":
                temp2 = nums[2] / nums[3];
                break;
        }
        switch (list[2]) {
            case "+":
                temp3 = temp1 + temp2;
                break;
            case "-":
                temp3 = temp1 - temp2;
                break;
            case "*":
                temp3 = temp1 * temp2;
                break;
            case "/":
                temp3 = temp1 / temp2;
                break;
        }
        return temp3;
    }

    public static boolean count(double[] nums, String[] list, double N) {
        double temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0, temp5 = 0;
        temp1 = countABCDxyz(nums, list);
        temp2 = countABCxDyz(nums, list);
        temp3 = countABCxyDz(nums, list);
        temp4 = countABxCyDz(nums, list);
        temp5 = countABxCDyz(nums, list);

        if (temp1 == N || temp2 == N || temp3 == N || temp4 == N || temp5 == N) {
            return true;
        }

        if (Math.abs(temp1) == N) {return true;}
        if (Math.abs(temp1) == N) {return true;}
        if (Math.abs(temp1) == N) {return true;}
        if (Math.abs(temp1) == N) {return true;}
        if (Math.abs(temp1) == N) {return true;}


        return false;
    }
}

