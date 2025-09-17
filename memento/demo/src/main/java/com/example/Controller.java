package com.example;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> undohistory; // Memento undo-history
    private List<IMemento> redohistory; // Memento redo-history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undohistory = new ArrayList<>();
        this.redohistory = new ArrayList<>();

    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!undohistory.isEmpty()) {
            System.out.println("Memento undo found in history");
            IMemento previousState = undohistory.remove(undohistory.size() - 1);
            redohistory.add(model.createMemento()); // Save current state to redo history before restoring previous undo state
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    // Restore selected state from history-list 
    public void undoFromList(int index){
        if (!undohistory.isEmpty() && index >= 0 && index < undohistory.size()){

            
            // Reverse selected state and delete from undoHistory and 
            for (int i = undohistory.size()-1; i > index; i--){
                IMemento removeState = undohistory.remove(i);
                redohistory.add(removeState);
            }

            IMemento previousState = undohistory.remove(undohistory.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }

    }

    public void redo(){
        if (!redohistory.isEmpty()){
            System.out.println("\nMemento redo found in history\n");
            IMemento nextState = redohistory.remove(redohistory.size() - 1);
            undohistory.add(model.createMemento()); // Save current state to undo history before restoring redo state
            model.restoreState(nextState);
            gui.updateGui();
        }
    }


    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undohistory.add(currentState);
        redohistory.clear(); // Clear redo history when the user makes a new change to the statee
    }


    public List<IMemento> getUndoHistory(){
        return undohistory;
    }
}