import  java.lang.Math.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] students={"ragad","samiah","mohammad"};
        UniversityCourse un =new UniversityCourse("Java","Fahed");
        un.register(students);

        System.out.println(un.getNumberOfRegisteredStudents());
        System.out.println(un.isRegistered("ragad"));

    }
}