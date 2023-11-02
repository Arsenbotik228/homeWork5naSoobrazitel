public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(420);
        boss.setDamage(35);
        boss.setDefenseType("Воздушный щит");

        System.out.println("BOSS INFO:");
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Атака босса: " + boss.getDamage());
        System.out.println("Тип защиты босса: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println("\nHEROES INFO:");
        for (Hero hero : heroes) {
            System.out.println("Здоровье героя: " + hero.getHealth());
            System.out.println("Урон героя: " + hero.getDamage());
            System.out.println("Суперспособность героя: " + hero.getSuperpower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Мечи возмездия");
        Hero hero2 = new Hero(150, 30, "Стрела метеора");
        Hero hero3 = new Hero(120, 25, "Неть:(");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}