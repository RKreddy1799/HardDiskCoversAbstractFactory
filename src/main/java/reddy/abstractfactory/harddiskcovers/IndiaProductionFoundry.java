
package reddy.abstractfactory.harddiskcovers;

public class IndiaProductionFoundry extends IndiaFoundry{
    protected HardDiskCover createDisk( String item ){
        HardDiskCover hardDiskCover = null;
        MaterialFactory materialFactory = new ChinaMaterialFactory();
        
        if(item.equalsIgnoreCase("metalliccover")){
            hardDiskCover = new MetallicCover(materialFactory);
            hardDiskCover.setName("India Metallic Cover Style ");

        }
        else if(item.equalsIgnoreCase("plasticcover")){
            hardDiskCover = new PlasticCover(materialFactory);
            hardDiskCover.setName("India Plastic Cover Style ");

        }
        else if(item.equalsIgnoreCase("polycarbonatecover")){
            hardDiskCover = new PolyCarbonateCover(materialFactory);
            hardDiskCover.setName("India PolyCarbonate Cover Style ");

        }        

   
        return hardDiskCover;
    }  
}

