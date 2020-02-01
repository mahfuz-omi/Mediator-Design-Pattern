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
public class FormMediator implements Mediator{

    Button button;
    TextView textView;
    @Override
    public void notify(View sender) {
        if(sender instanceof Button)
            System.out.println("Button operation done");
        else if(sender instanceof TextView)
            System.out.println("TextView operation done");
    }
    
}
