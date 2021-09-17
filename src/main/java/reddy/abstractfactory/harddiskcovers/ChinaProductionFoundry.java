
package reddy.abstractfactory.harddiskcovers;

public class ChinaProductionFoundry extends ChinaFoundry{
    protected HardDiskCover createDisk( String item ){
        HardDiskCover hardDiskCover = null;
        MaterialFactory materialFactory = new ChinaMaterialFactory();
        
        if(item.equalsIgnoreCase("metalliccover")){
            hardDiskCover = new MetallicCover(materialFactory);
            hardDiskCover.setName("Chinese Metallic Cover Style: ");

        }
        else if(item.equalsIgnoreCase("plasticcover")){
            hardDiskCover = new PlasticCover(materialFactory);
            hardDiskCover.setName("Chinese Plastic Cover Style: ");

        }
        else if(item.equalsIgnoreCase("polycarbonatecover")){
            hardDiskCover = new PolyCarbonateCover(materialFactory);
            hardDiskCover.setName("Chinese PolyCarbonate Cover Style: ");

        }        

   
        return hardDiskCover;
    }  
}

