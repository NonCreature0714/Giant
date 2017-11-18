import java.util.ArrayList;
import java.util.Stack;

public class Giant {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    String [] wordsArray = {"fee", "fii", "foo", "fum", "I", "smell", "the", "blood", "of", "an", "Englishman"};
    Stack<Test> _tests;

    double coverage;

    void push(Test o){
        _tests.push((Test) o);
    }

    void run(){
        _setup();
        _call();
        _finish();
    }

    void _setup(){

    }

    void _call(){
        while (!_tests.empty()){
            _test(_tests.pop());
        }
    }

    void _test(Test t){

    }

    class Test{
        String id;
        String ofWhat;
        Object testObject;
        Object testWhichMethod;
        String before;
        Object desiredResult;
        Object results;
        ArrayList<Case> cases;
        boolean isTestPassed;
        int passed;
        int failed;
        int totalCases;

        Test(){

        }

        class Case {
            String id;
            String caseOfWhat;
            boolean isCasePassed;
            Object caseBefore;
            Object caseAfter;
        }

        void named(Object o){
            ofWhat = String.valueOf(o);
        }

        void title(Object o){
            named(o);
        }

        void cause(Object o){

        }

        void is(Object o){

        }

        void not(Object o){

        }

        void a(Object o){

        }

        void has(Object o){

        }

        void result(Object o){

        }

        void of(Object o){

        }

        void asserts(Object o){

        }

        void at(Object location){

        }

        void didPass(){
            for (Case c : cases){
                if ((c.isCasePassed)) {
                    passed++;
                } else {
                    failed++;
                }
            }
            if(failed > 0){
                isTestPassed = false;
            } else {
                isTestPassed = true;
            }
        }

        void change(Object o){

        }

        void to(Object o){

        }

        void testIntroMessage(){
            alert("Test of " + ofWhat + ".");
        }

        void testExitMessage(){
            alert("Test passed at " + ((passed-failed)/totalCases));
        }

        void countClasses(){

        }

        void countFunctions(){

        }
    }

    //    LinkedList _oneElement;
//    LinkedList _emptyList;
//    ArrayList<String> _words;
//    TestLinkedList(){
//        alert("Starting test....");
//        _oneElement = new LinkedList();
//        _oneElement.addFirst("Single");
//        _emptyList = new LinkedList();
//
//        _words = new ArrayList<>(Arrays.asList(wordsArray));
//    }
//
//    public void test_addFirst(){
//        alert("\nTesting addFirst:");
//        LinkedList _list = new LinkedList();
//        _list.addFirst(wordsArray[wordsArray.length-1]);
//        if(_list.size() == 1 && _list.getElement(0).equals(wordsArray[10])){
//            alert("\t " + ANSI_GREEN + "+ PASSED " + ANSI_RESET + "- added one element " + _list.getElement(0));
//        } else {
//            alert("\t " + ANSI_RED + "- FAILED " + ANSI_RESET + "- did not add an element");
//        }
//        _list.addFirst(wordsArray[wordsArray.length-2]);
//        if(_list.size() == 2 && _list.getElement(0).equals(wordsArray[9])){
//            alert("\t " + ANSI_GREEN + "+ PASSED " + ANSI_RESET + "- added one element " + _list.getElement(0));
//        } else {
//            alert("\t " + ANSI_RED + "- FAILED " + ANSI_RESET + "- did not add an element");
//        }
//
//        alert("\t Result: " + _list.toString());
//    }
//
//    public void test_getElement(){
//        alert("\nTesting getElement:");
//        LinkedList _list = new LinkedList();
//        for(int i = wordsArray.length-1; i >= 0; i--){
//            _list.addFirst(wordsArray[i]);
//        }
//        alert("\tOriginal list: " + _list.toString());
//        for(int i = 0; i < wordsArray.length; i++){
//            if(_list.getElement(i) == null){
//                alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + "- did not retrieve " + wordsArray[i] + " from list because it's null.");
//            } else if (!(_list.getElement(i) instanceof String)){
//                alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + "- object which is supposed to be string at " + wordsArray[i] + " isn't a String object.");
//            } else {
//                alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + "- successfully got " + _list.getElement(i) + " from list!");
//            }
//        }
//    }
//
//    public void test_size(){
//        alert("\nTesting size.");
//        LinkedList _list = new LinkedList();
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, _words.get(i));
//        }
//
//        if(_list.size() == _words.size()){
//            alert("\t " +  ANSI_GREEN+ "+ PASSED " + ANSI_RESET + "size!");
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + "size!");
//        }
//    }
//
//    public void test_searchElement(){
//        alert("\nTesting searchElement.");
//        LinkedList _list = new LinkedList();
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, _words.get(i));
//        }
//
//        String searchTerm;
//
//        for(int i = 0; i < _words.size(); i++){
//            searchTerm = _words.get(i);
//            if(_list.searchElement(searchTerm) == _words.indexOf(searchTerm)){
//                alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - search term " + searchTerm + " found at " + _list.searchElement(searchTerm));
//            } else {
//                alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - ");
//            }
//        }
//    }
//
//    public void test_setElement(){
//        alert("\nTesting setElement.");
//        LinkedList _list = new LinkedList();
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, "");
//        }
//
//        for(int i = 0; i < _words.size(); i++){
//            _list.setElement(i, _words.get(i));
//            if(_list.getElement(i) == _words.get(i)){
//                alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + "");
//            } else {
//                alert("\t " + ANSI_RED + "- FAILED " + ANSI_RESET );
//            }
//        }
//    }
//
//    public void test_insertElement(){
//        alert("\nTesting insertElement.");
//        LinkedList _list = new LinkedList();
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, _words.get(i));
//        }
//
//        alert("\n\tInserting 'wife' at the end of the list.");
//        _list.insertElement(_list.size(), "wife");
//
//        if(_list.size() == _words.size()+1){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - inserted an element.");
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - did not insert element.");
//        }
//        alert("\tPrevious list: " + _words);
//        alert("\tNew list:      " + _list.toString());
//
//        alert("\n\tInserting 'tasty' before Englishman in list.");
//        _list.insertElement(10, "tasty");
//        if(_list.getElement(10) == "tasty"){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - correctly inserted an element.");
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - did NOT correctly insert element.");
//        }
//        alert("\tPrevious list: " + _words);
//        alert("\tNew list:      " + _list.toString());
//
//        alert("\n\tInserting 'faa' at the begining of list.");
//        _list.insertElement(0, "faa");
//        if(_list.getElement(0) == "faa"){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - correctly inserted at the beginning of list.");
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - did NOT correctly insert element at the beginning.");
//        }
//        alert("\tPrevious list: " + _words);
//        alert("\tNew list:      " + _list.toString());
//
//    }
//
//    public void test_removeElement(){
//        alert("\nTesting removeElement.");
//        LinkedList _list = new LinkedList();
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, _words.get(i));
//        }
//        _list.insertElement(_list.size(), "wife");
//        _list.insertElement(10, "tasty");
//        _list.insertElement(0, "faa");
//        alert("\tStarting list: " + _list.toString());
//        Object temp;
//
//        alert("\n\tAttempting to remove element at " + _list.searchElement("faa") + " which is " + _list.getElement(_list.searchElement("faa")));
//        int removeIndex = _list.searchElement("faa");
//        alert("\tOld list is: " + _list.toString());
//        temp = _list.removeElement(removeIndex);
//        if(_list.searchElement("faa") == -1 && temp == "faa" && 13 == _list.size()){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - removed element.");
//            alert("\t New list: " + _list.toString());
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - element not properly removed.");
//            alert("\t List: " + _list.toString());
//        }
//
//
//        alert("\n\tAttempting to remove element at " + _list.searchElement("wife") + " which is " + _list.getElement(_list.searchElement("wife")));
//        removeIndex = _list.searchElement("wife");
//        alert("\tOld list is: " + _list.toString());
//        temp = _list.removeElement(removeIndex);;
//        if(_list.searchElement("wife") == -1 && temp == "wife" && 12 == _list.size()){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - removed element.");
//            alert("\t\t New list: " + _list.toString());
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - element not removed.");
//            alert("\t\tList: " + _list.toString());
//        }
//
//        alert("\n\tAttempting to remove element at " + _list.searchElement("tasty") + " which is " + _list.getElement(_list.searchElement("tasty")));
//        removeIndex = _list.searchElement("tasty");
//        alert("\tOld list is: " + _list.toString());
//        temp = _list.removeElement(removeIndex);
//        if(_list.searchElement("tasty") == -1 && temp == "tasty" && 11 == _list.size()){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - removed element.");
//            alert("\t\t New list: " + _list.toString());
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - element not removed.");
//            alert("\t List: " + _list.toString());
//        }
//
//    }
//
//    public void test_countHowMany(){
//        alert("\nTesting countHowMany.");
//        LinkedList _list = new LinkedList();
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, "23");
//        }
//
//        int count = _list.countHowMany("23");
//        if(count == _words.size()){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - count is accurate.");
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - count is bad.");
//        }
//    }
//
//    public void test_removeDuplicate(){
//        alert("\nTesting removeDuplicate");
//        LinkedList _list = new LinkedList();
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, _words.get(i));
//        }
//        _list.addFirst("yolo");
//        _list.addFirst("yolo");
//        _list.addFirst("yolo");
//
//        alert("\tList before: " + _list.toString());
//        _list.removeDuplicate("yolo");
//        alert("\tList after: " + _list.toString());
//        int count = 0;
//        int found = _list.searchElement("yolo");
//        String str = (String)_list.getElement(found);
//        String test;
//        for(int i = 0; i < _list.size(); i++){
//            test = (String)_list.getElement(i);
//            if(test.equals(str)){
//                count++;
//            }
//        }
//
//        if(count == 1){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - correctly removed dupes.");
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - incorrectly removed dupes.");
//        }
//    }
//
//    public void test_appendAtEnd(){
//        alert("\nTesting appendAtEnd");
//        LinkedList _list = new LinkedList();
//
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, _words.get(i));
//        }
//
//        alert("\tList before: " + _list.toString());
//        _list.appendAtEnd("hungry", 3);
//
//        int originalFinalIndex = 10;
//        for(int i = 0; i < 3; i++){
//            if(String.valueOf(_list.getElement(originalFinalIndex+(i+1))).equals("hungry")){
//                alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - " + (i+1));
//            } else {
//                alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - " + (i+2));
//            }
//        }
//        alert("\tFinal list: " + _list.toString());
//    }
//
//    public void test_appendAfter(){
//        alert("\nTesting appendAfter");
//        LinkedList _list = new LinkedList();
//        for(int i = 0; i < _words.size(); i++){
//            _list.insertElement(i, _words.get(i));
//        }
//
//        alert("\tList before: " + _list.toString());
//        _list.appendAfter("fum", "fyy");
//        if(_list.size() == 12 && _list.getElement(4).equals("fyy")){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - new list: " + _list.toString());
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - list: " + _list.toString() );
//        }
//
//        _list.appendAfter("Englishman", "foot");
//        if(_list.size() == 13 && _list.getElement(12).equals("foot")){
//            alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - new list: " + _list.toString());
//        } else {
//            alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " - list: " + _list.toString() );
//        }
//
//    }
//
//    public void test_reverseFirstFew(){
//        alertl( "\nTest of reverseFirstFew: \n");
//        LinkedList _list = new LinkedList();
//
//        for(int i = 0; i < wordsArray.length; i++){
//            _list.insertElement(i, _words.get(i));
//        }
//
//        int howMany = _words.size();
//        _list.reverseFirstFew(howMany);
//
//        alert("\tOrignal list: " + _words);
//
//        alertl("\tResults: \n");
//        if(_list.size() != wordsArray.length){
//            System.out.print("\t\t - list and words are not the same length.");
//        }
//
//        Stack<String> _testStack = new Stack<>();
//        for(int i = 0; i < howMany; i++) {
//            _testStack.push(_words.get(i));
//        }
//
//        int position = 0;
//        while (!_testStack.empty()){
//            if(_testStack.pop().equals(_list.getElement(position))){
//                alert("\t " + ANSI_GREEN+ "+ PASSED " + ANSI_RESET + " - successful swap at position " + position + ", showing list: " + _list.toString());
//            } else {
//                alert("\t " + ANSI_RED + " - FAILED " + ANSI_RESET + " swap at position " + position);
//            }
//            position++;
//        }
//
//        while (!_testStack.empty()){
//            _testStack.pop();
//        }
//
//        for(int i = 0; i < 4; i++){
//            _testStack.push((String)_list.getElement(i));
//        }
//
////        alert("\t\tNew list: " + _list);
//
//    }

    public void _finish(){
        alert("\nAll _tests finished!");
    }
    private void alert(String message){
        System.out.println(message);
    }
    private void alertl(String message){
        System.out.print(message);
    }
    private void casePassed(String message){ System.out.print(" + " + ANSI_GREEN + "PASSED - " + ANSI_RESET + message); }
    private void caseFailed(String message){ System.out.print(" - " + ANSI_RED + "FAILED - " + ANSI_RESET + message); }
    private void testResultMessage(){}

}
