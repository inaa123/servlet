package ch03.ex05;

public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name +", " + age;
	} //웹앱에선 toString상관없지만(html코드가 웹앱에 사용됨) 잘 작동하는지 확인하기위해 콘솔출력용으로 만든거임
}
