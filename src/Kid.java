public class Kid {

    private String name;
    private String gender;
    private int age;

    public static int numberOfKids = 0;

    public Kid(){

        name = "Jean-Marc";
        gender = "Male";
        age = 18;

        numberOfKids++;

    }

    public Kid(String name, String gender, int age){

        this.name = name;
        this.gender = gender;
        this.age = age;

        numberOfKids++;

    }

    public String getName() {

        return this.name;
    }

    public String getGender() {

        return this.gender;
    }

    public int getAge() {

        return this.age;
    }


    public void setName(String name) {

        this.name = name;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String toString(){

        return "Name: " + name + "\n" + "Gender: " + gender + "\n" + "Age: " + age;

    }
    public boolean areTheyTwins(Kid kid) {

        if (this.age == kid.age)
        {
            return true;
        }
        else {
            return false;
        }
    }



}





