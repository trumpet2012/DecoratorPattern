/**
 * William Trent Holliday
 * 2/2/15
 */
public class JavaEditor extends EditorDecorator {

    public JavaEditor(Editor editor){
        this.editor = editor;
    }

    @Override
    public String getSupportedFileTypes() {
        return this.editor.getSupportedFileTypes() + " .java .jar .class";
    }

    @Override
    public String getVersion() {
        return "v14.0.3";
    }

    @Override
    public String getName() {
        return this.editor.getName() + " for Java";
    }

}
