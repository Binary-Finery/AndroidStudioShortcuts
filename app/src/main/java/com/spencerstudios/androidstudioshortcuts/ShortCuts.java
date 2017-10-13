package com.spencerstudios.androidstudioshortcuts;

import java.util.ArrayList;
import java.util.List;

public class ShortCuts {

    public static List<Data> list() {

        List<Data> populatedList = new ArrayList<>();

        //general

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
        populatedList.add(new Data("Search everything (including code and menus)", "Press Shift twice", "Press Shift twice"));
        populatedList.add(new Data("Find", "Control + F", "Command + F"));
        populatedList.add(new Data("Find next", "F3", "Command + G"));
        populatedList.add(new Data("Find previous", "Shift + F3", "Command + Shift + G"));
        populatedList.add(new Data("Replace", "Control + R", "Command + R"));
        populatedList.add(new Data("Find action", "Control + Shift + A", "Command + Shift + A"));
        populatedList.add(new Data("Search by symbol name", "Control + Alt + Shift + N", "Command + Option + O"));
        populatedList.add(new Data("Find class", "Control + N", "Command + O"));
        populatedList.add(new Data("Find file (instead of class)", "Control + Shift + N", "Command + Shift + O"));
        populatedList.add(new Data("Find in path", "Control + Shift + F", "Command + Shift + F"));
        populatedList.add(new Data("Open file structure pop-up", "Control + F12", "Command + F12"));
        populatedList.add(new Data("Navigate between open editor tabs", "Alt + Right/Left Arrow", "Control + Right/Left Arrow"));
        populatedList.add(new Data("Jump to source", "F4 / Control + Enter", "F4 / Command + Down Arrow"));
        populatedList.add(new Data("Open current editor tab in new window", "Shift + F4", "Shift + F4"));
        populatedList.add(new Data("Recently opened files pop-up", "Control + E", "Command + E"));
        populatedList.add(new Data("Recently edited files pop-up", "Control + Shift + E", "Command + Shift + E"));
        populatedList.add(new Data("Go to last edit location", "Control + Shift + Backspace", "Command + Shift + Backspace"));
        populatedList.add(new Data("Close active editor tab", "Control + F4", "Command + W"));
        populatedList.add(new Data("Return to editor window from a tool window", "Esc", "Esc"));
        populatedList.add(new Data("Hide active or last active tool window", "Shift + Esc", "Shift + Esc"));
        populatedList.add(new Data("Go to line", "Control + G", "Command + L"));
        populatedList.add(new Data("Open type hierarchy", "Control + H", "Control + H"));
        populatedList.add(new Data("Open method hierarchy", "Control + Shift + H", "Command + Shift + H"));
        populatedList.add(new Data("Open call hierarchy", "Control + Alt + H", "Control + Option + H"));

        //writing code

        populatedList.add(new Data("", "Writing Code", ""));

        populatedList.add(new Data("Generate code (getters, setters, constructors, hashCode/equals, toString, new file, new class)", "Alt + Insert", "Command + N"));
        populatedList.add(new Data("Override methods", "Control + O", "Control + O"));
        populatedList.add(new Data("Implement methods", "Control + I", "Control + I"));
        populatedList.add(new Data("Surround with (if...else / try...catch / etc.)", "Control + Alt + T", "Command + Option + T"));
        populatedList.add(new Data("Delete line at caret", "Control + Y", "Command + Backspace"));
        populatedList.add(new Data("Collapse/expand current code block", "Control + minus/plus", "Command + minus/plus"));
        populatedList.add(new Data("Collapse/expand all code blocks", "Control + Shift + minus/plus", "Command + Shift + minus/plus"));
        populatedList.add(new Data("Duplicate current line or selection", "Control + D", "Command + D"));
        populatedList.add(new Data("Basic code completion", "Control + Space", "Control + Space"));
        populatedList.add(new Data("Smart code completion (filters the list of methods and variables by expected type)", "Control + Shift + Space", "Control + Shift + Space"));
        populatedList.add(new Data("Complete statement", "Control + Shift + Enter", "Command + Shift + Enter"));
        populatedList.add(new Data("Quick documentation lookup", "Control + Q", "Control + J"));
        populatedList.add(new Data("Show parameters for selected method", "Control + P", "Command + P"));
        populatedList.add(new Data("Go to declaration (directly)", "Control + B or Control + Click", "Command + B or Command + Click"));
        populatedList.add(new Data("Go to implementations", "Control + Alt + B", "Command + Alt + B"));
        populatedList.add(new Data("Go to super-method/super-class", "Control + U", "Command + U"));
        populatedList.add(new Data("Open quick definition lookup", "Control + Shift + I", "Command + Y"));
        populatedList.add(new Data("Toggle project tool window visibility", "Alt + 1", "Command + 1"));
        populatedList.add(new Data("Toggle bookmark", "F11", "F3"));
        populatedList.add(new Data("Toggle bookmark with mnemonic", "Control + F11", "Option + F3"));
        populatedList.add(new Data("Comment/uncomment with line comment", "Control + /", "Command + /"));
        populatedList.add(new Data("Comment/uncomment with block comment", "Control + Shift + /", "Command + Shift + /"));
        populatedList.add(new Data("Select successively increasing code blocks", "Control + W", "Option + Up"));
        populatedList.add(new Data("Decrease current selection to previous state", "Control + Shift + W", "Option + Down"));
        populatedList.add(new Data("Move to code block start", "Control + [", "Option + Command + ["));
        populatedList.add(new Data("Move to code block end", "Control + ]", "Option + Command + ]"));
        populatedList.add(new Data("Select to the code block start", "Control + Shift + [", "Option + Command + Shift + ["));
        populatedList.add(new Data("Select to the code block end", "Control + Shift + ]", "Option + Command + Shift + ]"));
        populatedList.add(new Data("Delete to end of word", "Control + Delete", "Option + Delete"));
        populatedList.add(new Data("Delete to start of word", "Control + Backspace", "Option + Backspace"));
        populatedList.add(new Data("Optimize imports", "Control + Alt + O", "Control + Option + O"));
        populatedList.add(new Data("Project quick fix (show intention actions and quick fixes)", "Alt + Enter", "Option + Enter"));
        populatedList.add(new Data("Reformat code", "Control + Alt + L", "Command + Option + L"));
        populatedList.add(new Data("Auto-indent lines", "Control + Alt + I", "Control + Option + I"));
        populatedList.add(new Data("Indent/unindent lines", "Tab/Shift + Tab", "Tab/Shift + Tab"));
        populatedList.add(new Data("Smart line join", "Control + Shift + J", "Control + Shift + J"));
        populatedList.add(new Data("Smart line split", "Control + Enter", "Command + Enter"));
        populatedList.add(new Data("Start new line", "Shift + Enter", "Shift + Enter"));
        populatedList.add(new Data("Next/previous highlighted error", "F2 / Shift + F2", "F2 / Shift + F2"));

        //build and run...

        populatedList.add(new Data("", "Build and Run", ""));

        populatedList.add(new Data("Build", "Control + F9", "Command + F9"));
        populatedList.add(new Data("Build and run", "Shift + F10", "Control + R"));
        populatedList.add(new Data("Apply changes (with Instant Run)", "Control + F10", "Control + Command + R"));

        //debugging

        populatedList.add(new Data("", "Debugging", ""));

        populatedList.add(new Data("Debug", "Shift + F9", "Control + D"));
        populatedList.add(new Data("Step over", "F8", "F8"));
        populatedList.add(new Data("Step into", "F7", "F7"));
        populatedList.add(new Data("Smart step into", "Shift + F7", "Shift + F7"));
        populatedList.add(new Data("Step out", "Shift + F8", "Shift + F8"));
        populatedList.add(new Data("Run to cursor", "Alt + F9", "Option + F9"));
        populatedList.add(new Data("Evaluate expression", "Alt + F8", "Option + F8"));
        populatedList.add(new Data("Resume program", "F9", "Command + Option + R"));
        populatedList.add(new Data("Toggle breakpoint", "Control + F8", "Command + F8"));
        populatedList.add(new Data("View breakpoints", "Control + Shift + F8", "Command + Shift + F8"));


        //refactoring...

        populatedList.add(new Data("", "Refactoring", ""));

        populatedList.add(new Data("Copy", "F5", "F5"));
        populatedList.add(new Data("Move", "F6", "F6"));
        populatedList.add(new Data("Safe delete", "Alt + Delete", "Command + Delete"));
        populatedList.add(new Data("Rename", "Shift + F6", "Shift + F6"));
        populatedList.add(new Data("Change signature", "Control + F6", "Command + F6"));
        populatedList.add(new Data("Inline", "Control + Alt + N", "Command + Option + N"));
        populatedList.add(new Data("Extract method", "Control + Alt + M", "Command + Option + M"));
        populatedList.add(new Data("Extract variable", "Control + Alt + V", "Command + Option + V"));
        populatedList.add(new Data("Extract field", "Control + Alt + F", "Command + Option + F"));
        populatedList.add(new Data("Extract constant", "Control + Alt + C", "Command + Option + C"));
        populatedList.add(new Data("Extract parameter", "Control + Alt + P", "Command + Option + P"));

        //vcs

        populatedList.add(new Data("", "Version Control / Local History", ""));

        populatedList.add(new Data("Commit project to VCS", "Control + K", "Command + K"));
        populatedList.add(new Data("Update project from VCS", "Control + T", "Command + T"));
        populatedList.add(new Data("View recent changes", "Alt + Shift + C", "Option + Shift + C"));
        populatedList.add(new Data("Open VCS popup", "Alt + ` (backquote)", "Control + V"));

        return populatedList;
    }
}
