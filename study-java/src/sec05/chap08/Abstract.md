# abstract

### `abstract` 클래스

- 그 자체로 인스턴스 생성 불가
    - 얄코그룹에서 매장을 내지는 않음
- 부모 클래스로서는 일반 클래스와 같음
    - 다형성 역시 구현됨
        - *얄코치킨과 얄코카페의 매장은 얄코그룹 소속*

### `abstract` 메소드

- 추상 클래스에서만 사용 가능
- 스스로는 선언만 하고 구현하지 않음
    - ⭐ 자식 클래스에서 반드시 구현
    - 구현하지 않을 시 컴파일 에러
        - 메뉴 - 코드 - 메서드 구현 / IDE의 오류 안내 클릭
    - 접근 제어자 의미 없음
- 클래스 메소드는 추상 메소드로 작성할 수 없음
    - 인스턴스를 생성해서 쓰는 것이 아니므로 맞지 않음