/**
 * William Trent Holliday
 * 2/2/15
 */
public class EditorTester {

    public static void main(String[] args){
        BasicEditor basicEditor = new BasicEditor("NinjaEdit");

        WebEditor webEditor = new WebEditor(basicEditor);
        JavaEditor javaEditor = new JavaEditor(basicEditor);
        PythonEditor pythonEditor = new PythonEditor(basicEditor);

        System.out.printf("%s [%s]\n\tFile types: %s\n\n", basicEditor.getName(), basicEditor.getVersion(), basicEditor.getSupportedFileTypes());
        System.out.printf("%s [%s]\n\tFile types: %s\n\n", webEditor.getName(), webEditor.getVersion(), webEditor.getSupportedFileTypes());
        System.out.printf("%s [%s]\n\tFile types: %s\n\n", javaEditor.getName(), javaEditor.getVersion(), javaEditor.getSupportedFileTypes());
        System.out.printf("%s [%s]\n\tFile types: %s\n\n", pythonEditor.getName(), pythonEditor.getVersion(), pythonEditor.getSupportedFileTypes());

    }

}
