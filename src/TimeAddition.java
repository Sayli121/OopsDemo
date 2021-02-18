class TimeAddition{
	int hour;
	int min;
	int sec;
	 
	public TimeAddition(int h,int m,int s)
	{
		hour =h;
		min=m;
		sec=s;
	}
	void add(TimeAddition obj2) {
		this.hour += obj2.hour;
		this.min += obj2.min;
		this.sec += obj2.sec;}
		
		
	
	
	void check()
	{
		if(this.sec>=60)
        {
            this.min+=1;
            this.sec=this.sec-60;
        }
        if(this.min>=60)
        {
            this.hour+=1;
            this.min=this.min-60;
        }
        if(this.hour>24)
        {
            
            this.hour=this.hour-24;
        }}
       
        void display() {
    		System.out.println(this.hour+ ":" + this.min + ":" + this.sec );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TimeAddition TimeAddition = new  TimeAddition(12,34,22);
		 TimeAddition obj2 = new  TimeAddition(3,23,44);
		 TimeAddition.add(obj2);
		 TimeAddition.check();
		
		 TimeAddition.display();
	}}
		
		
	

			
	 
	 
	 
