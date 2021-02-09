class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int getI() {
        return i;
    }

    void setI(int k) {
        if (k >= 0) {
            i = k;
        }
    }
}

class VarDemo2{
    public static void main(String[] args) {
        var mc = new MyClass(10);
        System.out.println("Value i in variable mc is: " + mc.getI());
        mc.setI(19);
        System.out.println("Value i in variable mc is: " + mc.getI());
    }
}