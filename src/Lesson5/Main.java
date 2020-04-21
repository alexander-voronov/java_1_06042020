package Lesson5;

public class Main {
    public static void main(String[] args) {
        //Employee employee1 = new Employee("Иванов Иван Иванович", "manager","email@email.com", "8-495-123-45-67", 100000, 35);
        //employee1.info();
        //Commit_2


        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312311", 30000, 30);
        empArray[1] = new Employee("Petrov Petr", "Engineer", "ppetrov@mailbox.com", "892312312", 30000, 50);
        empArray[2] = new Employee("Sidorov Sidr", "secretary", "ssidorov@mailbox.com", "892312313", 45000, 30);
        empArray[3] = new Employee("Sapogov Kot", "Manager", "skot@mailbox.com", "892312314", 50000, 25);
        empArray[4] = new Employee("Maslov George", "Director", "gendir@mailbox.com", "892312315", 3000000, 67);

        for (int i = 0; i < empArray.length ; i++) {
          if(empArray[i].getAge() > 40){
                empArray[i].info();
            }
        }
    }
}
