package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name1){
        this.lastName = name1;
    }

    public void setAge(int age){
        if(this.age > 0 && this.age < 100 ){
            this.age = age;
        }else{
            this.age = 0;
        }
    }

    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }else{
            return false;
        }
    }

    public String getFullName(){
        String fullName = firstName +" "+ lastName;
        return fullName;
    }

}
