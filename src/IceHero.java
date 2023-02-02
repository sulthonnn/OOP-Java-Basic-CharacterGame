public class IceHero extends WaterHero{
    
    private String type;
    private Weapon weapon;
    private double totalDamage;
    private double addHealth;

    IceHero(String name) {
        super(name);
        this.type = "Ice Hero";
    }

    @Override
    public void display() {
        System.out.println("\nStatus ");
        System.out.println("Name\t\t: " + getName());
        System.out.println("Health\t\t: " + this.getHealth() + "/" + maxHealth());
        System.out.println("Base Attack\t: " + getAttackPower());
        System.out.println("Weapon\t\t: " + this.weapon.getNameWeapon() + "(+" + this.weapon.getAttack()+")");
        System.out.println("Status Alive\t: " + isAlive());
        System.out.print("Type\t\t: " + this.type + "\n");

    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public double getHealth() {
        return super.getHealth() + this.addHealth;
    }

    @Override
    public void attack(Hero opponent) {
        if (opponent.getHealth() > 0) {

            this.totalDamage = this.getAttackPower() + this.weapon.getAttack();

            if (opponent instanceof FireHero) {
                opponent.takeDamage(this.totalDamage += 8);

            } else if (opponent instanceof EarthHero) {
                opponent.takeDamage(this.totalDamage -= 2);

            } else {
                opponent.takeDamage(this.totalDamage);
            }
            
            //heal saat attack
            if (this.getHealth()>=100) {
                this.addHealth=0;              
            } else {
                this.addHealth += this.totalDamage * 1 / 5;   
            }

            System.out.println("\n" + opponent.getName() + " is attacking by " + this.getName() + " with damage "
                        + this.totalDamage + "(+heal " + this.addHealth +" )");
            opponent.statusAlive();
            this.display();

        } else {
            isAttack();
        }
    }
}
