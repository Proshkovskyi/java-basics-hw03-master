public class Student {

    int rating;
    private String name;
    private static double totalRate = 0.0d;
    private static int countOfStudents = 0;

    public Student(String name) {
        this.name = name;
        countOfStudents++;
        totalRate += getRating();
    }

    public static double getAvgRating() {
        if (Double.isInfinite(totalRate / countOfStudents) || Double.isNaN(totalRate / countOfStudents)) {
            return totalRate;
        } else {
            return totalRate / countOfStudents;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        totalRate += rating;
    }

    public boolean betterStudent(Student student) {
        int bestRating = Integer.compare(rating, student.getRating());
        return bestRating > 0;
    }

    public void changeRating(int rating) {
        totalRate -= getRating();
        setRating(rating);
    }

    public static void removeStudent(Student student) {
        countOfStudents -= 1;
        totalRate -= student.getRating();
        student.setRating(0);
        student.setName(null);
    }

    @Override
    public String toString() {
        return name + ":" + rating;
    }
}
