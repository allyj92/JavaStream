package StreamOperator.mediOperator.finalOperator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
    // Student 객체로 구성된 배열 리스트 생성
    static List<Student> totalList = Arrays.asList(
            new Student("김코딩", 100, Student.Gender.Male),
            new Student("박해커", 80, Student.Gender.Male),
            new Student("이자바", 90, Student.Gender.Female),
            new Student("나미녀", 60, Student.Gender.Female)
    );

    public static void main(String[] args) {
        // 스트림 연산 결과를 Map으로 반환
        Map<String, Integer> maleMap = totalList.stream()
                .filter(s -> s.getGender() == Student.Gender.Male)
                .collect(Collectors.toMap(
                        student -> student.getName(), // Key
                        student -> student.getScore() // Value
                ));
        // 출력
        System.out.println(maleMap);
    }
}

class Student {
    public enum Gender {Male, Female};
    private String name;
    private int score;
    private Gender gender;

    public Student(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Gender getGender() {
        return gender;
    }
}