public class ThunderHero extends Hero {

    private String type;
    private Weapon weapon;
    private double totalDamage;

    ThunderHero(String name) {
        super(name);
        this.type = "Thunder Hero";
    }

    @Override
    public void display() {
        System.out.println("\nStatus ");
        System.out.println("Name\t\t: " +  getName());
        System.out.println("Health\t\t: " +  getHealth() + "/" + maxHealth());
        System.out.println("Base Attack\t: " +  getAttackPower());
        System.out.println("Weapon\t\t: " +  this.weapon.getNameWeapon() + "(+" + this.weapon.getAttack()+")");
        System.out.println("Status Alive\t: " + isAlive());
        System.out.print("Type\t\t: " +  this.type + "\n");
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack(Hero opponent) {
        if (opponent.getHealth() > 0) {

            this.totalDamage = this.getAttackPower() + this.weapon.getAttack();

            //critical saat attack
            Double critical = (Math.random() * 50) / 100 * this.totalDamage;
            this.totalDamage += critical;

            if (opponent instanceof EarthHero) {
                opponent.takeDamage(this.totalDamage += 5);
            
            } else {
                opponent.takeDamage(this.totalDamage);
            }
   
            System.out.println("\n" + opponent.getName() + " is attacking by " + this.getName() + " with damage "
                    + this.totalDamage +" (+critical " + critical +")");
            opponent.statusAlive();
            this.display();  

        } else {
            isAttack();
        }
    }

}
