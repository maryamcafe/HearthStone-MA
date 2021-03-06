package cards;


import static cards.CardConstants.durabilityWrongInputMsg;

public class WeaponCard extends Card {

    protected CardConstants.Type type = CardConstants.Type.WEAPON;

    //this number shows how many times a weapon can be used
    private int durability = 0;

    //The Action of the card in gameplay
    private Description description;

    public WeaponCard(CardConstants.Class cardClass,
                      String name,
                      int manaCost,
                      CardConstants.Rarity rarity,
                      String descriptionText,
                      int number, int durability) throws Exception {
        super(cardClass,
                name,
                manaCost,
                rarity,
                descriptionText,
                number);
        if (durability <= 0) {
            throw new Exception(durabilityWrongInputMsg);
        } else {
            this.durability = durability;
        }
        description = new Description(descriptionText);
    }

    @Override
    public String toString() {
        String output = "type: \t\t" + type +
                "\nClass: \t\t" + cardClass +
                "\nname: \t\t" + name +
                "\nmanaCost: \t" + manaCost +
                "\nrarity: \t" + rarity +
                "\nDescription: " + descriptionText +
                "\ndurability: \t\t" + durability +
                "\nNumber Of this Card:" + number;

        return output;
    }
}
