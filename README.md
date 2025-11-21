# Person-Class-Java

A simple Java class representing a person with **name** and **age**.  
Includes methods to get and set attributes, and a method to display the information.

 Features

- Get and set **Name** and **Age**
- Validate age input (must be > 0)
- Display person's information with `talk()` method

 Usage

```java
person p = new person("Roaa", 19);
p.talk(); // Output: Name = Roaa , Age = 19
p.setAge(22);
p.setName("Sara");
p.talk(); // Output: Name = Sara , Age = 22
