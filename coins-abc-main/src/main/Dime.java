/**
 * Dime coin class.
 * @author Team E
 * @version 1.0
 */
public class Dime extends Coin {
    /**
     * Default constructor for Dime.
     */
    public Dime() {
        super("Dime", DIME_VALUE,
            new CuproNickel(), DEFAULT_YEAR);
    }
    
    // /**
    //  * Constructor for Dime with specific year.
    //  * @param year the year of manufacture
    //  */
    // public Dime(int year) {
    //     super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
    //         "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", 
    //         "Torch_Branches", "ONE DIME", true, 
    //         new CuproNickel(), year);
    // }
    
    // /**
    //  * Constructor for Dime with specific year and metallurgy.
    //  * @param year the year of manufacture
    //  * @param smelter the metallurgy strategy
    //  */
    // public Dime(int year, Metallurgy smelter) {
    //     super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
    //         "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", 
    //         "Torch_Branches", "ONE DIME", true, 
    //         smelter, year);
    // }

    @Override
    protected Coin smeltStep(Coin c) {
        setSmelter(new CuproNickel());
        smelt();

        return this;
    }

    //Note to self: Is this method needed?
    @Override
    protected Coin ImprintRidgedEdge(Coin c) {
        this.setRidgedEdge(false);

        return this;
    }

    @Override
    protected Coin ImprintFrontImage(Coin c) {
        this.setFrontImage("F_Roosevelt");

        return this;
    }

    @Override
    protected Coin ImprintBackImage(Coin c) {
        this.setBackImage("Torch_Branches");

        return this;
    }

    @Override
    protected Coin ImprintFrontMotto(Coin c) {
        this.setFrontMotto("In God We Trust");
        this.setFrontLabel("Liberty");

        return this;
    }

    @Override
    protected Coin ImprintBackMotto(Coin c) {
        this.setBackMotto("E Pluribus Unum");
        this.setBackLabel("UNITED STATES OF AMERICA");
        this.setValueDescription("ONE DIME");

        return this;
    }
}
