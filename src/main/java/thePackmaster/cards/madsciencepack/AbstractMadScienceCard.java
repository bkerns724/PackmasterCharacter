package thePackmaster.cards.madsciencepack;

import thePackmaster.cards.AbstractPackmasterCard;

public abstract class AbstractMadScienceCard extends AbstractPackmasterCard
{
    public AbstractMadScienceCard(String cardID, int cost, CardType type, CardRarity rarity, CardTarget target)
    {
        super(cardID, cost, type, rarity, target);
        setBackgroundTexture(
                "anniv5Resources/images/512/madscience/" + type.name().toLowerCase() + ".png",
                "anniv5Resources/images/1024/madscience/" + type.name().toLowerCase() + ".png"
        );
    }
}
