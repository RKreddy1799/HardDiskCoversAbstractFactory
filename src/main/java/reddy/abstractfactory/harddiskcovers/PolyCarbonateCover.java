
package reddy.abstractfactory.harddiskcovers;


public class PolyCarbonateCover extends HardDiskCover{
    MaterialFactory materialFactory;
    
    public PolyCarbonateCover(MaterialFactory materialFactory){
        this.materialFactory = materialFactory;
        
    }
    void prepare(){
        System.out.println("Creating " + name );
        altron = materialFactory.createAltron();
        lucent = materialFactory.createLucent();
        renol = materialFactory.createRenol();
        this.heat();
        this.molding();
        this.highPressure();
        
    }    
}
