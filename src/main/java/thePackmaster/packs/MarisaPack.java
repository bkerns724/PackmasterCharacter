package thePackmaster.packs;

import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.UIStrings;
import thePackmaster.SpireAnniversary5Mod;
import thePackmaster.cards.marisapack.*;

import java.util.ArrayList;

public class MarisaPack extends AbstractCardPack {
    public static final String ID = SpireAnniversary5Mod.makeID(MarisaPack.class.getSimpleName());
    private static final UIStrings UI_STRINGS = CardCrawlGame.languagePack.getUIString(ID);
    public static final String NAME = UI_STRINGS.TEXT[0];
    public static final String DESC = UI_STRINGS.TEXT[1];
    public static final String AUTHOR = UI_STRINGS.TEXT[2];
    public static final String CREDITS = UI_STRINGS.TEXT[3];

    public MarisaPack() {
        super(ID, NAME, DESC, AUTHOR, CREDITS, new PackSummary(4, 1, 3, 4, 3, PackSummary.Tags.Attacks));
    }

    @Override
    public ArrayList<String> getCards() {
        ArrayList<String> cards = new ArrayList<>();
        cards.add(MasterSpark.ID);
        cards.add(GalacticHalo.ID);
        cards.add(RisingStrike.ID);
        cards.add(GrandCross.ID);
        cards.add(CasketOfStars.ID);
        cards.add(LuminousStrike.ID);
        cards.add(BlazingStar.ID);
        cards.add(UltimateShortwave.ID);
        cards.add(EscapeVelocity.ID);
        cards.add(EventHorizon.ID);
        return cards;
    }
}
