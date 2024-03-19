class ParentClass {
	protected int parentValue;

	public ParentClass(int parentValue) {
		this.parentValue = parentValue;
	}
}

public class ChildClass extends ParentClass {
	private int childValue;

	public ChildClass(int parentValue) {
		super(parentValue);
		this.childValue = 42;
	}

	public ChildClass(int parentValue, int childValue) {
		this(parentValue);
		this.childValue = childValue;
	}

	public static void main(String[] args) {
		ChildClass obj1 = new ChildClass(10);
		ChildClass obj2 = new ChildClass(20, 30);

		System.out.println("obj1.parentValue: " + obj1.parentValue);
		System.out.println("obj1.childValue: " + obj1.childValue);

		System.out.println("obj2.parentValue: " + obj2.parentValue);
		System.out.println("obj2.childValue: " + obj2.childValue);
	}
}