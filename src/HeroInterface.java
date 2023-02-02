public interface HeroInterface {
        
    void display();

    String getName();

    void setName(String name);

    double getAttackPower();

    double getHealth();

    double maxHealth();

    void attack(Hero opponent);

    void takeDamage(Double damage);

    void setWeapon(Weapon weapon);
    
    boolean isAttack();

    boolean isAlive();

    void statusAlive();
}
