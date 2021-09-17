
package reddy.abstractfactory.harddiskcovers;

public abstract class HardDiskCover {
    String name;
    
    Metal copper;
    Metal iron;
    Metal nickel;
    Metal zinc;
    Plastic acrylic;
    Plastic nylon;
    Plastic pvc;
    Plastic rtvSilicone;
    PolyCarbonate altron;
    PolyCarbonate lucent;
    PolyCarbonate renol;
    
    abstract void prepare();
    
    public String getName(){
        return name;
    }
    public void setName ( String name ) {
        this.name = name;
    }
    public void heat(){
        System.out.println(name + " heating material");
    }
    public void rolling(){
        System.out.println( name + " rolling material");
    }
    //plastics and metals
    public void extrusion(){
        System.out.println( name + " extruding material");
    }
    public void drawing(){
        System.out.println( name + " drawing material");
    }
    public void forging(){
        System.out.println(name + " forging material");
    }
    //plastic molding
    public void molding(){
        System.out.println(name + " molding of material");
    }
    public void cooling(){
        System.out.println(name + " controlled cooling");
    }
    //
    public void highPressure(){
        System.out.println(name + " apply high pressure");
    }
    public void pack(){
        System.out.println("\nPackage of " + name + " ready");
    }
    public String toString(){
        StringBuffer printer = new StringBuffer();
        printer.append("--- " + name + "----- \n");
        if(copper != null){
            printer.append(copper);
            printer.append("\n");
        }
        if(iron != null){
            printer.append(iron);
            printer.append("\n");
        }
        if(nickel != null){
            printer.append(nickel);
            printer.append("\n");
        }
        if(zinc != null){
            printer.append(zinc);
            printer.append("\n");
        }
        if(acrylic != null){
            printer.append(acrylic);
            printer.append("\n");
        }     
        if(nylon  != null){
            printer.append(nylon);
            printer.append("\n");
        }
        if(pvc  != null){
            printer.append(pvc);
            printer.append("\n");
        }        
        if(rtvSilicone  != null){
            printer.append(rtvSilicone);
            printer.append("\n");
        }
        if(altron != null ){
            printer.append(altron);
            printer.append("\n");
        }
        if(lucent != null ){
            printer.append(lucent);
            printer.append("\n");
        }
        if(renol != null ){
            printer.append(renol);
            printer.append("\n");
        }   
       
        return printer.toString();
    }      
}
