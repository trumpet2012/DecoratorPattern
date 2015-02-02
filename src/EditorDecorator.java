/**
 * William Trent Holliday
 * 2/2/15
 */
public abstract class EditorDecorator implements Editor {
    protected Editor editor;
    protected String name;
    public void setName(String name){
        this.name = name;
    }
}
