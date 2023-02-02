public class Weapon {
    
    private String name;
    private double attack;

    Weapon(String name, double attack){
        if (name == null || name == "") {
            throw new RuntimeException("Nama senjata tidak boleh kosong!");
          }
          
        this.name = name;
        this.attack = attack;
    }

    //getter
    public String getNameWeapon(){
        return this.name;
    }

    //setter
    public void setNameWeapon(String name){
        if(name==null || name=="") {
            System.err.println("Nama senjata tidak boleh kosong!");
            return;
        }
        this.name=name;
    }

    //getter
    public double getAttack(){
        return this.attack;
    }

    //setter
    public void setAttack(double attack){
        this.attack=attack;
    }
}
