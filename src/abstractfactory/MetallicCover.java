
package abstractfactory;


public class MetallicCover extends HardDiskCover{
    MaterialFactory materialFactory;
    
    public MetallicCover(MaterialFactory materialFactory){
        this.materialFactory = materialFactory;
        
    }
    void prepare(){
        System.out.println("Creating " + name );
        copper = materialFactory.createCopper();
        iron = materialFactory.createIron();
        nickel = materialFactory.createNickel();
        zinc = materialFactory.createZinc();
        this.heat();
        this.drawing();
        this.extrusion();
        this.forging();
        this.rolling();
        
    }
}
