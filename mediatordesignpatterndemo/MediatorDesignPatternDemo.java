/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatordesignpatterndemo;

/**
 *
 * @author OMI
 */
public class MediatorDesignPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Button button = new Button("my Buttob");
        TextView textView = new TextView("my TextView");
        
        Mediator mediator = new FormMediator();
        
        
        // button and textview will directly communicaye with the mediator...not within them
        button.setMediator(mediator);
        textView.setMediator(mediator);
        
        // user clicks on button and textview
        button.doOperation();
        textView.doOperation();
    }
    
}
