package Class;

public class Person {
    private String name;
    private Integer age;
    private Boolean isHappy;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIsHappy() {
        return isHappy;
    }

    public void setIsHappy(Boolean isHappy) {
        this.isHappy = isHappy;
    }

    public void sayHi(Person anotherPerson){
        System.out.println(this.name + ": Oie, " + anotherPerson.getName());
        anotherPerson.answerHi(this);
    }

    public void answerHi(Person anotherPerson){
        System.out.println(this.name + ": Oii, " +anotherPerson.getName());
    }

    public void introduceYourself(){
        System.out.println(this.name + ": Meu nome é " + this.name + " e tenho " + this.getAge() + " anos");
    }

    public void winGame(Person nextPerson){
        nextPerson.setIsHappy(true);
        System.out.println(this.name + " estava competindo com " + nextPerson.getName());
        System.out.println(nextPerson.name + " ganhou e está muito feliz! ");
    }

}
