package sec06.chap06.ex01;

/**
 * Created by jeaha on 3/26/24
 */
public class Button {
    private ButtonMode buttonMode = ButtonMode.LIGHT;
    private ButtonSpace buttonSpace = ButtonSpace.SINGLE;
    
    public void setButtonMode(ButtonMode buttonMode) {
        this.buttonMode = buttonMode;
    }
    
    public void setButtonSpace(ButtonSpace buttonSpace) {
        this.buttonSpace = buttonSpace;
    }
}
