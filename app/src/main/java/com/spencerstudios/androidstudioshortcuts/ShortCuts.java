package com.spencerstudios.androidstudioshortcuts;

import java.util.ArrayList;
import java.util.List;

public class ShortCuts {

    public static List<Data> list() {

        List<Data> populatedList = new ArrayList<>();

        populatedList.add(new Data("", "General", ""));
        populatedList.add(new Data("Save all", "Control + S", "Command + S"));
        populatedList.add(new Data("Synchronize", "Control + Alt + Y", "Command + Option + Y"));
        populatedList.add(new Data("Maximize/minimize editor", "Control + Shift + F12", "Control + Command + F12"));
        populatedList.add(new Data("Add to favorites", "Alt + Shift + F", "Option + Shift + F"));
        populatedList.add(new Data("Inspect current file with current profile", "Alt + Shift + I", "Option + Shift + I"));
        populatedList.add(new Data("Quick switch scheme", "Control + ` (backquote)", "Control + ` (backquote)"));
        populatedList.add(new Data("Open settings dialogue", "Control + Alt + S", "Command + , (comma)"));
        populatedList.add(new Data("Open project structure dialog", "Control + Alt + Shift + S", "Command + ; (semicolon)"));
        populatedList.add(new Data("Switch between tabs and tool window", "Control + Tab", "Control + Tab"));
        populatedList.add(new Data("", "Navigating and Searching Within Studio", ""));
        populatedList.add(new Data("Search everything (including code and menus)","Press Shift twice","Press Shift twice"));
        populatedList.add(new Data("Find", "Control + F","Command + F"));
        populatedList.add(new Data("Find next","F3","Command + G"));
        populatedList.add(new Data("Find previous","Shift + F3","Command + Shift + G"));
        populatedList.add(new Data("Replace","Control + R","Command + R"));
        populatedList.add(new Data("Find action","Control + Shift + A","Command + Shift + A"));
        populatedList.add(new Data("Search by symbol name","Control + Alt + Shift + N","Command + Option + O"));
        populatedList.add(new Data("Find class","Control + N","Command + O"));
        populatedList.add(new Data("Find file (instead of class)","Control + Shift + N","Command + Shift + O"));
        populatedList.add(new Data("Find in path","Control + Shift + F","Command + Shift + F"));
        populatedList.add(new Data("Open file structure pop-up","Control + F12","Command + F12"));
        populatedList.add(new Data("Navigate between open editor tabs","Alt + Right/Left Arrow","Control + Right/Left Arrow"));
        populatedList.add(new Data("Jump to source","F4 / Control + Enter","F4 / Command + Down Arrow"));
        populatedList.add(new Data("Open current editor tab in new window","Shift + F4","Shift + F4"));
        populatedList.add(new Data("Recently opened files pop-up","Control + E","Command + E"));
        populatedList.add(new Data("Recently edited files pop-up","Control + Shift + E","Command + Shift + E"));
        populatedList.add(new Data("Go to last edit location","Control + Shift + Backspace","Command + Shift + Backspace"));
        populatedList.add(new Data("Close active editor tab","Control + F4","Command + W"));
        populatedList.add(new Data("Return to editor window from a tool window","Esc","Esc"));
        populatedList.add(new Data("Hide active or last active tool window","Shift + Esc","Shift + Esc"));
        populatedList.add(new Data("Go to line","Control + G","Command + L"));
        populatedList.add(new Data("Open type hierarchy","Control + H","Control + H"));
        populatedList.add(new Data("Open method hierarchy","Control + Shift + H","Command + Shift + H"));
        populatedList.add(new Data("Open call hierarchy","Control + Alt + H","Control + Option + H"));
        populatedList.add(new Data("", "Writing Code", ""));

        return populatedList;

        /*

        populatedList.add(new Data("","",""));


*/
    }
}
