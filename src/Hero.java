public abstract class Hero implements HeroInterface{

    private String name;
    private double health;
    private double baseAttack;
    private double totalDamage;
    private boolean isAlive;

    Hero(String name) {
        if (name == null || name == "") {
            throw new RuntimeException("Nama hero tidak boleh kosong!");
          }
        this.name = name;
        this.baseAttack = 5;
        this.health = 100;
        this.isAlive = true;
    }

    //getter
    public String getName() {
        return this.name;
    }

    //setter
    public void setName(String name) {
        if(name==null || name=="") {
            System.err.println("Nama hero tidak boleh kosong!");
            return;
        }
        this.name = name;
    }

    //getter
    public double getAttackPower() {
        return this.baseAttack;
    }

    //getter
    public double getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    //getter
    public double maxHealth() {
        return this.health;
    }

    //getter
    public boolean isAlive() {
        return this.isAlive;
    }

    public void takeDamage(Double damage) {
        this.totalDamage += damage;
    }

    public boolean isAttack() {
        return false;
    }

    public void statusAlive() {
        // check is alive
        if (this.getHealth() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
            System.out.println(this.name + " was died");
        }
        this.display();
    }

}
