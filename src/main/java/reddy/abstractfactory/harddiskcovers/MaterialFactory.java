
package reddy.abstractfactory.harddiskcovers;


public interface MaterialFactory {
    public Metal createCopper();
    public Metal createIron();
    public Metal createNickel();
    public Metal createZinc();
    public Plastic createAcrylic();
    public Plastic createPVC();
    public Plastic createNylon();
    public Plastic createRTVSilicone();
    public PolyCarbonate createAltron();
    public PolyCarbonate createLucent();
    public PolyCarbonate createRenol();
    
}
