package biz.enums;

/**
 * An enum for universally referencing the types of currencies a {@link biz.Dragon} can have.
 *
 * @author Chase Bengtson
 */
public enum Currency
{
    UNKNOWN(0),
    DRAGON_CASH(1),
    TREATS(2),
    GEMS(3),
    EXPERIENCE(4);

    private final int value;

    Currency (int value){
        this. value = value;
    }

    public int getValue(){
        return this.value;
    }
}
