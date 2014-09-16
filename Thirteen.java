


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
String name;
}


class Thirteen
{

public static void main(String args[])
{
System.out.println("Vishnu");

Person p=new Person();

System.out.println(p.c.name);

p.display();

}


}

