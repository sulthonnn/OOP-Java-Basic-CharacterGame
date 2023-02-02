
//@author Sulthon Abdillah
public class Main {

    public static void main(String[] args) throws Exception {

        //polymorphism
        Hero heroApi = new FireHero("Flame");
        Weapon weaponApi = new Weapon("Blade of Chaos", 7);
        heroApi.setWeapon(weaponApi);//pasang senjata

        Hero heroAir = new WaterHero("Aqua");
        Weapon weaponAir = new Weapon("Trisula", 5);
        heroAir.setWeapon(weaponAir);//pasang senjata

        Hero heroAngin = new WindHero("Tornado");
        Weapon weaponAngin = new Weapon("Pisau Angin", 4);
        heroAngin.setWeapon(weaponAngin);//pasang senjata

        Hero heroPetir = new ThunderHero("Thor");
        Weapon weaponPetir = new Weapon("Mjolnir", 6);
        heroPetir.setWeapon(weaponPetir);//pasang senjata

        Hero heroTanah = new EarthHero("Bumi");
        Weapon weaponTanah = new Weapon("Kapak Batu", 5);
        heroTanah.setWeapon(weaponTanah);
        
        Hero heroIce = new IceHero("Kuzan");
        Weapon weaponIce = new Weapon("Tombak Ice", 6);
        heroIce.setWeapon(weaponIce);

        //method attack hero
        System.out.println("\n===================Attack Hero==================");
        heroApi.attack(heroAngin);
        heroPetir.attack(heroIce);
        heroIce.attack(heroApi);
        heroPetir.attack(heroTanah);
        heroTanah.attack(heroAir);
        heroAir.attack(heroApi);
        heroAngin.attack(heroPetir);

    }
}
