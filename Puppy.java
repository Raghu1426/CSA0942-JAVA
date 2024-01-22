class Puppy
{
	public int puppyAge;
	public Puppy(String name)
	{
		System.out.println("Name chosen is:" + name);
	}
	public void setAge(int Age)
	{
		puppyAge = Age;
	}
	public void getAge()
	{
		System.out.println("puppy's age is:" + puppyAge);
	}
	public static void main(String[] args)
	{
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.setAge(5);
		myPuppy.getAge();
		System.out.println("variable value:"+myPuppy.puppyAge);
	}
}
