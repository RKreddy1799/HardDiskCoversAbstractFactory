
package abstractfactory;


public abstract class IndiaFoundry {
    
    protected abstract HardDiskCover createDisk( String name );
    
    public HardDiskCover orderDisk( String coverType ){
        HardDiskCover hardDiskCover = createDisk(coverType);
        
        System.out.println("------Creating a " + hardDiskCover.getName() + "-------\n");
        
        hardDiskCover.prepare();
        
        hardDiskCover.pack();
        
        return hardDiskCover;
    }
}