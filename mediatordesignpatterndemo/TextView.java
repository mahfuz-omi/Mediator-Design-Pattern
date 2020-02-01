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
public class TextView implements View{
    
    private String name;
    private Mediator mediator;

    public TextView(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    
    

    @Override
    public void onDraw() {
        System.out.println("TextView onDraw");
    }

    @Override
    public void doOperation() {
        System.out.println("TextView operation");
        this.mediator.notify(this);
    }
    
}
