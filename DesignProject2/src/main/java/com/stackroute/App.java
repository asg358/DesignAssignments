package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Text text=new Text();
        text.setText("Hello world");
        text.setAuthor("Robin");
        text.setLength(11);

        TextEditor textEditor=new TextEditor();
        textEditor.setText(text);
        textEditor.allLetterToUpperCase();
        textEditor.findSubtextAndDelete();
    }
}
