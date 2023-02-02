public class FireHero extends Hero {

    private String type;
    private Weapon weapon;
    private double totalDamage;

    FireHero(String name) {
        super(name);
        this.type = "Fire Hero";
    }

    @Override
    public void display() {
        System.out.println("\nStatus ");
        System.out.println("Name\t\t: " + getName());
        System.out.println("Health\t\t: " + getHealth() + "/" + maxHealth());
        System.out.println("Base Attack\t: " + getAttackPower());
        System.out.println("Weapon\t\t: " + this.weapon.getNameWeapon() + "(+" + this.weapon.getAttack()+")");
        System.out.println("Status Alive\t: " + isAlive());
        System.out.print("Type\t\t: " + this.type + "\n");
    }

   
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack(Hero opponent) {
        if (opponent.getHealth() > 0) {

            this.totalDamage = this.getAttackPower() + this.weapon.getAttack();
            //burn saat attack
            double burn = opponent.getHealth() * 1 / 20;
            this.totalDamage += burn;

            if (opponent instanceof WindHero) {
                opponent.takeDamage(this.totalDamage += 5);
                
            } else if (opponent instanceof EarthHero) {
                opponent.takeDamage(this.totalDamage -= 2);

            } else {
                opponent.takeDamage(this.totalDamage);
            }

            System.out.print("\n" + opponent.getName() + " is attacking by " + this.getName() + " with damage "
                    + this.totalDamage + " (+burn " + burn
                    + ")\n");
            opponent.statusAlive();
            this.display();

        } else {
            isAttack();
        }

    }


}
