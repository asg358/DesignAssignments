package com.stackroute;

public class TextEditor {

   private Text text;

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void allLetterToUpperCase(){

        Utility.printText("Uppercasing the letters");
        Utility.printText(this.text.getText().toUpperCase());

    }

    public void findSubtextAndDelete(){

        Utility.printText("Finding Subtext and Deleting");

    }

}
