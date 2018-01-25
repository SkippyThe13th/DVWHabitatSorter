package biz.enums;

/**
 * A enum for keeping a universal way of referencing the different traits a {@link biz.Dragon} can have.
 *
 * @author Chase Bengtson
 */
public enum Trait
{
    UNKNOWN(0),
    JUNGLE(1),
    FIRE(2),
    EARTH(3),
    FROZEN(4),
    WATER(5),
    FAIRY(6),
    AIR(7),
    RAINBOW(8),
    STORM(9),
    SUNKEN(10),
    ANCIENT(11),
    BRIAR(12),
    SPIRIT(13),
    DRAGONSAI(14),
    ZODIA(15),
    TREAT(16),
    ZEN(17);

    private int value;

    Trait (int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
