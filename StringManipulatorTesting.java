public class StringManipulatorTesting{
    public static void main(String[] args) {
        StringManipulator iD = new StringManipulator();
        String Str = iD.TrimAndConcat("    Hello     ","     World    ");
        Integer indexNull = iD.getIndexOrNull("San Fransico Giants", 'z');
        Integer spotNull = iD.getIndexOrNull("Hello", "o");
        String wordConcat = iD.concatSubstring("Doggy", 0, 3, "Mother");
        System.out.println(Str.trim());
        System.out.println(indexNull);
        System.out.println(spotNull);
        System.out.println(wordConcat);
    }
}