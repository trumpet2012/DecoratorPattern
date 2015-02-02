/**
 * William Trent Holliday
 * 2/2/15
 */
public class BasicEditor implements Editor {

    public BasicEditor(String name){
        this.name = name;
    }

    @Override
    public String getSupportedFileTypes() {
        return ".txt";
    }

    @Override
    public String getVersion() {
        return "v0.1";
    }

    public String getName(){
        return this.name;
    }

    public String name;
}
