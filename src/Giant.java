import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Giant {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    String [] wordsArray = {"fee", "fii", "foo", "fum", "I", "smell", "the", "blood", "of", "an", "Englishman"};
    Stack<Test> tests;

    double coverage;

    class Test{
        String id;
        String name;
        Object testObject;
        Object testWhichMethod;
        String before;
        Object desiredResult;
        Object results;
        ArrayList<Case> cases;
        boolean isTestPassed;
        int passed;
        int failed;
        double passVFail;

        class Case {
            String id;
            String caseOfWhat;
            boolean isCasePassed;
            Object caseBefore;
            Object caseAfter;
        }

        void named(Object o){
            name = String.valueOf(o);
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

        }

        void testExitMessage(){}

        void countClasses(){

        }

        void countFunctions(){

        }
    }

    public void finish(){
        alert("\nTests finished!");
    }

    private void alert(String message){
        System.out.println(message);
    }
    private void alertl(String message){
        System.out.print(message);
    }
    private void passed(String message){
        System.out.print(" + " + ANSI_GREEN + "PASSED - " + ANSI_RESET + message);
    }
    private void failed(String message){
        System.out.print(" - " + ANSI_RED + "FAILED - " + ANSI_RESET + message);
    }

}
