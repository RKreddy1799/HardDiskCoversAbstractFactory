
package reddy.abstractfactory.harddiskcovers;

public class PlasticCover extends HardDiskCover{
    MaterialFactory materialFactory;
    
    public PlasticCover(MaterialFactory materialFactory){
        this.materialFactory = materialFactory;
        
    }
    void prepare(){
        
        System.out.println("Creating " + name );
        acrylic = materialFactory.createAcrylic();
        nylon = materialFactory.createNylon();
        rtvSilicone = materialFactory.createRTVSilicone();
        this.heat();
        this.extrusion();
        this.molding();
        this.cooling();
        
        
    }
}

