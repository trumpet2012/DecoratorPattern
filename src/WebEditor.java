/**
 * William Trent Holliday
 * 2/2/15
 */
public class WebEditor extends EditorDecorator {

    public WebEditor(Editor editor){
        this.editor = editor;
    }

    @Override
    public String getSupportedFileTypes() {
        return editor.getSupportedFileTypes() + " .html .htm .css .js";
    }

    @Override
    public String getVersion() {
        return "v1.1";
    }

    public String getName(){
        return this.editor.getName() + " for Web";
    }

}
