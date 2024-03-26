# Record

- 자바 14에서 Preview로 추가, 16에서 정식 등록
- 데이터의 묶음을 저장하기 위한, 단순한 형태의 클래스
- - 레코드는 `final`
    - 다른 클래스로 상속되거나 `abstract` 로 선언 불가
- 레코드의 각 항목들은 `private`, `final`
    - 각각 같은 이름의 getter가 기본으로 만들어짐
- 인스턴스 필드를 가질 수 없음
    - 클래스 필드는 가능 *( EX02 예제에서 확인 )*
- 클래스 내부에 정의된 record는 내부 정적 클래스처럼 아래와 같이 사용할 수 있다.
    - `Button.ClickInfo click6 = new Button.ClickInfo(111, 222, Button.ClickedBy.LEFT);`