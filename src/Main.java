import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Для решения этой задачи используеь  тип переменной var, присваиваем переменной var три разных значения. посвле этого выводим значение каждой переменной в консоль*/
   var dog = 8.0;
   var cat = 3.6;
   var paper = 763789;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       dog = dog + 4;
       cat = cat + 4;
       paper = paper +4;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       dog = dog -3.5;
       cat = cat - 1.6;
       paper = paper - 7639;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // начало третьего блока задания
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        System.out.println(firstFighter + secondFighter);
        System.out.println(secondFighter - firstFighter);
    // вычетаем вес спротсменов от большего к меньшему с помошью %
        System.out.println(secondFighter % firstFighter);
        // выполнение задачи по количеству часов на сотрудника.
        var totalWorkingHours = 640;
        var employee = 8;
        var totalNumberOfEmployees = totalWorkingHours / employee;
        System.out.println("всего работников в компании - " + totalNumberOfEmployees + " человек");
        var addingEmployees = totalNumberOfEmployees + 94;
        var totalTime = (totalWorkingHours / addingEmployees);
        System.out.println("если в компании работает " + addingEmployees + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
    }


}