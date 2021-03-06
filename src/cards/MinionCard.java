package cards;


import static cards.CardConstants.Type.MINION;
import static cards.CardConstants.attackWrongInputMsg;

public class MinionCard extends Card {

    protected CardConstants.Type type = MINION;
    //hp is the lives number of a minion
    private int hp;
    // if a minion attacks, it will decrease enemy's lives this much:
    private int attack;

    //The Action of the card in gameplay
    private Description description;


    public MinionCard(CardConstants.Class cardClass,
                      String name,
                      int manaCost,
                      CardConstants.Rarity rarity,
                      String descriptionText,
                      int number, int hp, int attack) throws Exception {
        super(cardClass,
                name,
                manaCost,
                rarity,
                descriptionText,
                number);
        if (attack <= 0 || hp <= 0) {
            throw new Exception(attackWrongInputMsg);
        } else {
            this.attack = attack;
            this.hp = hp;
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
                "\nhp: \t\t" + hp +
                "\nattack:\t\t" + attack +
                "\nNumber Of this Card:" + number;
        return output;
    }

}
