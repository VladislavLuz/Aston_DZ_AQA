public class Sotrudnik {
    private String fullName;
    private String postName;
    private String email;
    private Long phone;
    private Double salary;
    private int age;

    public Sotrudnik(String fullName, String postName, String email, Long phone, Double salary, int age){
        this.fullName = fullName;
        this.postName = postName;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("ФИО:" + fullName);
        System.out.println("Должность:" + postName);
        System.out.println("Email:" + email);
        System.out.println("Телефон:" + phone);
        System.out.println("Зарплата:" + salary);
        System.out.println("Возраст:" + age);
    }

}
