package HW3.Task1.PersonTask;

/*Описать интерфейс Person с методами doWork() и haveRest().
Написать два класса работник и бездельник, реализующих интерфейс.
Работник работает, и не умеет бездельничать, в то время как бездельник не умеет работать, но умеет отдыхать.
Написать обобщённые классы Workplace и Club, содержащие массив из Person. В классах необходимо
вызывать у всего массива людей вызывать соответствующие методы
 */


public class App {
    public static void main(String[] args) {
        Person[] persons = {new Worker(), new Idle(), new Worker(), new Worker()};
        Place workplace = new Workplace(persons);
        Place club = new Club(persons);
//        workplace.action();
//        club.action();

        while (workplace.iterator().hasNext()) {
            workplace.iterator().next().doWork();
        }
    }
}
