package SimplestClassesAndObjects;

public class Student {
    String secondName;
    String nameAndMiddleName;
    int group;
    int[] assesment = new int[5];

    public Student(String secondName, String nameAndMiddleName, int group, int[] assesment) {
        this.secondName = secondName;
        this.nameAndMiddleName = nameAndMiddleName;
        this.group = group;
        this.assesment = assesment;
    }

    @Override
    public String toString() {
        return "Фамилия студента:" + secondName + '\n' +
                "Группа: " + group;
    }
    
}
