final class Calculator{
    private final int count ;

    public Calculator(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }

    public Calculator increment(){
        Calculator cal = new Calculator(this.count+1);
                return cal;
    }
    public Calculator decrement(){
        Calculator cal = new Calculator(this.count-1);
        return cal;
    }
}
 class ObectMutableImmutable {
    public static void main(String [] args){
       Calculator cal = new Calculator(10);
       System.out.println("cal : Count :"+cal.getCount());
       Calculator cal1 = cal.increment();
       System.out.println("cal 1 : Count :"+cal1.getCount());
       System.out.println("cal : count : "+cal.getCount());
       System.out.println();
       Calculator cal2 = cal.decrement();
        System.out.println("cal2 : Count: "+cal2.getCount());
        System.out.println("cal : count : "+cal.getCount());


    }
}
