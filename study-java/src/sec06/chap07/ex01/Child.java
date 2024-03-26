package sec06.chap07.ex01;

/**
 * Created by jeaha on 3/26/24
 */
// ⭐️  레코드로 작성
public record Child(
        String name,
        int birthYear,
        Gender gender
) {}