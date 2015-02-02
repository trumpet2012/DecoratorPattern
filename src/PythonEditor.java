/**
 * William Trent Holliday
 * 2/2/15
 */
public class PythonEditor extends EditorDecorator {

    public PythonEditor(Editor editor){
        this.editor = editor;
    }

    @Override
    public String getSupportedFileTypes() {
        return this.editor.getSupportedFileTypes() + " .py .pyc";
    }

    @Override
    public String getVersion() {
        return "v4.0.4";
    }

    @Override
    public String getName() {
        return this.editor.getName() + " for Python";
    }
}
