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
public class Button implements View{

    private String name;
    private Mediator mediator;

    public Button(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    
    
    
    
    @Override
    public void onDraw() {
        System.out.println("Button onDraw");
    }

    @Override
    public void doOperation() {
        System.out.println("Button Operation");
        this.mediator.notify(this);
    }
    
}
