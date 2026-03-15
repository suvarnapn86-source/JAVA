import java.util.TreeSet;
import java.util.Comparator;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + ":" + score;
    }
}

public class StudentLeaderboard {
    public static void main(String[] args) {

        // Ascending leaderboard
        TreeSet<Student> leaderboard = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.score != s2.score) {
                    return s1.score - s2.score;
                } else {
                    return s1.name.compareTo(s2.name);
                }
            }
        });

        leaderboard.add(new Student("Alice", 85));
        leaderboard.add(new Student("Bob", 92));
        leaderboard.add(new Student("Charlie", 78));
        leaderboard.add(new Student("David", 92));
        leaderboard.add(new Student("Eve", 88));

        System.out.println("=== Student Leaderboard (Ascending Score) ===");
        for (Student s : leaderboard) {
            System.out.println(s);
        }

        // Remove Charlie
        leaderboard.removeIf(s -> s.name.equals("Charlie"));

        System.out.println("\n=== After Removing Charlie ===");
        for (Student s : leaderboard) {
            System.out.println(s);
        }

        // Descending leaderboard
        TreeSet<Student> descendingLeaderboard = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s2.score != s1.score) {
                    return s2.score - s1.score;
                } else {
                    return s1.name.compareTo(s2.name);
                }
            }
        });

        descendingLeaderboard.addAll(leaderboard);

        System.out.println("\n=== Student Leaderboard (Descending Score) ===");
        for (Student s : descendingLeaderboard) {
            System.out.println(s);
        }
    }
}