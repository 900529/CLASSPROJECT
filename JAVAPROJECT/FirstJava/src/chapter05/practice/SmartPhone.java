package chapter05.practice;

public class SmartPhone {

	
	//변수 정의 
	String color;//null
	float size; //0.0
	String company;//null
	int volumeSize; //0
	
	//기능 정의
	
	void call() {
		System.out.println("전화 걸기");
	}
	
    void volumeUp(){
    	System.out.println("볼륨을 높입니다");
    	volumeSize ++;
    }
    
    void volumeDown(){
    	System.out.println("볼륨을 낮춥니다");
    	volumeSize--;
    }
    
    void showInfo() {
    	System.out.println("폰정보");
    	System.out.println("제조사" + company);
    	System.out.println("색상" + this.color);
    	System.out.println("사이즈" + size);
    	System.out.println("폰정보" + volumeSize);
    }

}
