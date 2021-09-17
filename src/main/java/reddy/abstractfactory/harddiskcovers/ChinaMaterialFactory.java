
package reddy.abstractfactory.harddiskcovers;

public class ChinaMaterialFactory implements MaterialFactory{
    public Metal createCopper(){
        return new Copper();
        
    }
    public Metal createIron(){
        return new Iron();
    }
    public Metal createNickel(){
        return new Nickel();
        
    }
    public Metal createZinc(){
        return new Zinc();
    }
    public Plastic createPVC(){
        return new PVC();
    }
    public Plastic createRTVSilicone(){
        return new RTVSilicone();
    }
    public Plastic createAcrylic(){
        return new Acrylic();
    }
    public PolyCarbonate createAltron(){
        return new Altron();
        
    }
    public PolyCarbonate createLucent(){
        return new Lucent();
    }
    public PolyCarbonate createRenol(){
        return new Renol();
    }
    public Plastic createNylon(){
        return new Nylon();
    }
}
