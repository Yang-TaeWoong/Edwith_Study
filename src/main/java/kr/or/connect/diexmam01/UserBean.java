package kr.or.connect.diexmam01;

public class UserBean {
	private String name;
	private int age;
	private boolean male;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserBean()
	{
		
	}
	public UserBean(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", age=" + age + ", male=" + male + "]";
	}
}
