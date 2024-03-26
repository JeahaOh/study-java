package sec06.chap07.ex01;

/**
 * Created by jeaha on 3/26/24
 */
public enum Gender {
    MALE("👦🏻"), FEMALE("👧🏼");
    
    private String emoji;
    
    Gender(String emoji) {
        this.emoji = emoji;
    }
    
    public String getEmoji() {
        return emoji;
    }
}
