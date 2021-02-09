class VarDemo {
    public static void main(String[] args) {
        System.out.print("Value x: ");
        for (var x = 2.5; x < 100.0; x = x * 2) {
            System.out.print(x + " ");
        }

        System.out.println();

        int nums[] = {1, 2, 3, 4, 5, 6};
        System.out.print("Values to array nums: ");
        for (var n : nums) {
            System.out.print(n + " ");
        }

        System.out.println();

        double avg = 10.0;
        var avg2 = 10.0;

        int var = 1;

        var avg3 = 10.0;
        System.out.println("Value local variable avg3 is: " + avg3);

        int var3 = 1;
        System.out.println("Value local variable is: " + var3);

        var k = -var3;
        System.out.println("Value variable k is: " + k);

        var myArr = new int[5];

        //var number;

        var myStr = new String ("This is chains");
        var mySubStr = myStr.substring(5,8);
        System.out.println(mySubStr);

    }
}
