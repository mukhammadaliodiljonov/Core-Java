class A {
    public static void main(String... args) {
        System.out.println("Main method A");
        String [] str= {"AAA","BBB","CCC"};
        B.main(str);
        // or
        B.main(args);
    }
}
    class B{
        public static void main(String [] args){
            System.out.println("main() B");

    }
}
