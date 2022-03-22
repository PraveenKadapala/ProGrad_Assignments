 class Holiday {
    private String name;
    private int day;
    private String month;
    
    public Holiday(String n,int d,String m)
    {
        this.name=n;
        this.day=d;
        this.month=m;
    }
    
    public boolean insamemonth(Holiday h)
    {
        if(this.month==h.month)
            return true;
            return false;
    }
    
    
    public double avgDay(Holiday[] arr)
    {
        int sum=this.day;
        double avg;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i].day;
        }
        avg=sum/(arr.length+1);
        return avg;
    }

}
class Holidays {
    public static void main(String[] args) {
        Holiday h1=new Holiday("Saturday",8,"Mar");
        Holiday h2=new Holiday("Sunday",15,"June");
        Holiday h3=new Holiday("Independence_day",4,"July");
        Holiday[] arr={h2,h3};

       System.out.println(h1.insamemonth(h2));
       System.out.println(h1.avgDay(arr));
    }
}

