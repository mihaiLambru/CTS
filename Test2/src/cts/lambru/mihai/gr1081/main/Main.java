package cts.lambru.mihai.gr1081.main;

import cts.lambru.mihai.gr1081.singletone.Robot;
import cts.lambru.mihai.gr1081.state.CerereStudent;

public class Main {
    public static void main(String[] args){
        //ex1
        Robot robot =Robot.getInstance(54621);
        System.out.println(robot.getIdRobot());
        Robot robot2 =Robot.getInstance(1);
        System.out.println(robot.getIdRobot());

        //ex2
        CerereStudent cerereStudent = new CerereStudent(4,"Am nevoie de adeverinta pentru locul de munca");
        cerereStudent.confirmare();
        cerereStudent.verificare();
        cerereStudent.avizareDecanat();
        cerereStudent.respingere();

        CerereStudent cerereStudent2 = new CerereStudent(11,"Am nevoie de adeverinta pt munca");
        cerereStudent2.confirmare();
        cerereStudent2.verificare();
        cerereStudent.avizareDecanat();
        cerereStudent.respingere();

        CerereStudent cerereStudent3 = new CerereStudent(11,null);
        cerereStudent3.confirmare();
        cerereStudent3.verificare();
        cerereStudent3.avizareDecanat();
        cerereStudent3.respingere();
    }
}
