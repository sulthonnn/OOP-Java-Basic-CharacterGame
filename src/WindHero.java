public class WindHero extends Hero {

    private String type;
    private Weapon weapon;
    private double totalDamage;

    WindHero(String name) {
        super(name);
        this.type = "Wind Hero";
    }

    @Override
    public void display() {
        System.out.println("\nStatus ");
        System.out.println("Name\t\t: " + getName());
        System.out.println("Health\t\t: " + getHealth() + "/" + maxHealth());
        System.out.println("Base Attack\t: " + getAttackPower());
        System.out.println("Weapon\t\t: " + this.weapon.getNameWeapon() + "(+" +this.weapon.getAttack()+")");
        System.out.println("Status Alive\t: " + isAlive());
        System.out.print("Type\t\t: " + this.type + "\n");

    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack(Hero opponent) {
        if (opponent.getHealth() > 0) {

            this.totalDamage = this.getAttackPower()  + this.weapon.getAttack();
            
            //bleeding saat attack
            Double bleeding = Math.random() * 10;
            this.totalDamage += bleeding;

            if(opponent instanceof ThunderHero){
                opponent.takeDamage(this.totalDamage+=5);

            } else if (opponent instanceof EarthHero) {
                opponent.takeDamage(this.totalDamage -= 2);

            } else {
                opponent.takeDamage(this.totalDamage);
            }

            System.out.print("\n" + opponent.getName() + " is attacking by " + this.getName() + " with damage "
                    + this.totalDamage + " (+bleeding " + bleeding 
                    + ")\n");
            opponent.statusAlive();
            this.display();

        } else {
            isAttack();
        }
    }
}
