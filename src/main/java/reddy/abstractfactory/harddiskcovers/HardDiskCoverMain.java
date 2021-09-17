
package reddy.abstractfactory.harddiskcovers;


public class HardDiskCoverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ChinaFoundry chinaFoundry = new ChinaProductionFoundry();
        IndiaFoundry indiaFoundry = new IndiaProductionFoundry();
        HardDiskCover hardDiskCover = chinaFoundry.orderDisk("metalliccover");
        System.out.println("Washington University has ordered  " + hardDiskCover.getName() + "\n");
        
        hardDiskCover = indiaFoundry.orderDisk("plasticcover");
        System.out.println("Mark has ordered  " + hardDiskCover.getName() + "\n");
        
        hardDiskCover = chinaFoundry.orderDisk("polycarbonatecover");
        System.out.println("NIX Library has ordered  " + hardDiskCover.getName() + "\n");
        
    }
}
