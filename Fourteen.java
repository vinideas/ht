


class Person
{
Car c=new Car();

void display()
{
System.out.println("Hello "+c.name);
}

}


class Car
{
String name="maruti alto";
}


class Fourteen
{

public static void main(String args[])
{
System.out.println("Vishnu");

Person p=new Person();

System.out.println(p.c.name);

p.display();

}


}

