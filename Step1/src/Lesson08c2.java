
public class Lesson08c2 {
	private int hr, min , sec;
	
	public void setTime(int h, int m, int s){
		hr = ((h>0 && h<=24) ? h : 0);
		min = ((m>0 && m<=60) ? m : 0);
		sec = ((s>0 && s<=60) ? s : 0);
		
	}
	public void setThiTime(int hr, int min, int sec){
		this.hr = 12;//Syntax To let the class use the objects with same name.
		this.min = 3;//If program runs without(this.Obj)syntax it will use previous values given to
		this.sec = 56;//local variables
	}
	
	public String getMilatryTime(){
	   return String.format("%02d:%02d:%02d", hr, min,sec);//New syntax(%*num_of_tabs**num_of_digits*d)
	}
	
	public String getRegTime(){
		return String.format("%d:%02d:%02d %s",((hr==0||hr==12)?12 : hr%12), min, sec, ((hr<12)?"am":"pm"));
	}//Smart way of using syntax and displaying regular time with minimum typing effort
	
	//Learning constructor overloading
	public  Lesson08c2(){
		this(0,0,0);
	}
	public Lesson08c2(int h){
		this(h,0,0);
	}
	public Lesson08c2(int h, int m){
		this(h,m,0);
	}
	public Lesson08c2(int h, int m, int s){
		setTimes(h,m,s);
	}
	public void setTimes(int h, int m, int s){
		setHr(h);
		setMin(m);
		setSec(s);
	}
	public void setHr(int h){
		hr = ((h>0&&h<24) ?h : 0);
	}
	public void setMin(int m){
		min = ((m>0&&m<60) ?m : 0);
	}
	public void setSec(int s){
		sec= ((s>0&&s<60) ?s : 0);
	}
}
