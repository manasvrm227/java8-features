package com.features;

@FunctionalInterface
interface TestInterfaceWithNoParameter {
	//A method with no parameter
    public String sayHello();
}


@FunctionalInterface
interface TestInterfaceWithParameter {
	//A method with parameter
    public String sayHello(String name);
}


public class LambdaExpression {
	public static void main(String[] args) {
		TestInterfaceWithNoParameter noParameter = () -> {
			return "Hello";
		};
		System.out.println(noParameter.sayHello());
	
		TestInterfaceWithParameter withParameter = (name) -> {
			return name +", how are you?";
		};
	
		System.out.println(withParameter.sayHello("Manas"));
	}
}