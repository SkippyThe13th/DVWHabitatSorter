package biz;

import java.util.HashSet;
import java.util.Set;

import biz.enums.Currency;
import biz.enums.Trait;

/**
 * A class to represent a dragon in Dragon Vale World.
 *
 * @author Chase Bengtson
 */
public class Dragon
{
    private String name;
    private Set<Trait> traits;
    private Currency currencyTypeGenerated;
    private int currencyAmountGenerated; //Currency is generated per hour

    /**
     * Constructor
     */
    private Dragon(Builder dragonStats){
        this.name = dragonStats.name;
        this.traits = new HashSet<>(dragonStats.traits);
        this.currencyTypeGenerated = dragonStats.currencyTypeGenerated;
        this.currencyAmountGenerated = dragonStats.currencyAmountGenerated;
    }

    /**
     * Builder class used to construct an instance of a {@link Dragon} object.  By first creating a new Builder
     * and then calling the subsequent "with" methods, the attributes for a dragon can be created, and a {@link Dragon}
     * object can be created and returned by calling the "hatch" method.
     */
    public static final class Builder{
        private String name = "";
        private HashSet<Trait> traits = new HashSet<>();
        private Currency currencyTypeGenerated = Currency.UNKNOWN;
        private int currencyAmountGenerated = 0;

        public Builder(){
        }

        public Dragon.Builder withName(String name){
            this.name = name;
            return this;
        }

        public Dragon.Builder withTraits(Set<Trait> traits){
            this.traits = new HashSet<>(traits);
            return this;
        }

        public Dragon.Builder withCurrencyTypeGenerated(Currency type){
            this.currencyTypeGenerated = type;
            return this;
        }

        public Dragon.Builder withCurrencyAmountGenerated(int amount){
            this.currencyAmountGenerated = amount;
            return this;
        }

        public Dragon hatch(){
            return new Dragon(this);
        }

    }
}
