package br.ufc.quixada.dadm.rogaldornquotes.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.ufc.quixada.dadm.rogaldornquotes.entity.Quote;

public class QuoteDAO {

    private static List<Quote> quotes = new ArrayList<>();

    public QuoteDAO() {
        this.init();
    }

    private void init() {
        this.add(new Quote("Give me a hundred Space Marines. Or failing that give me a thousand other troops.", "Codex: Space Marines (4th Edition) [Needs Citation]"));
        this.add(new Quote("The Emperor has no like, Loken. There are no gods in this hollow universe to keep him company. So he made us, demi-gods, to stand beside him. I have never quite come to terms with my status. Does that surprise you? I see what I am capable of, and what is expected of me, and I shudder. The mere fact of me frightens me sometimes.", "Horus Rising (Novel) by Dan Abnett, Part One, Chapter 6, pg. 134"));
        this.add(new Quote("Don't be insulted, but there is something very human about you, Loken, for an Astartes.", "Horus Rising (Novel) by Dan Abnett, Part One, Chapter 6, pg. 136"));
        this.add(new Quote("-If the Warmaster has turned his back on Terra, what are my orders?\n" +
                "-Tell him his brother Rogal will have him answer for it.\n" +
                "-to First Captain Sigismund", "The Flight of the Eisenstein (Novel)\n" +
                "by James Swallow\n" +
                ", Chapter 14, pg. 348 "));
        this.add(new Quote("If there is nobility remaining within Konrad's Legion, then it is hidden deeply beneath too many layers of twisted lusts, deviance, and disobedience. Their ways are foolish, ill-considered and a hindrance to the orderly flow of controlled war. The time is coming when the Night Lords must answer for their behaviour and be brought back into the doctrine of Imperial warfare, lest we lose them to their own deviant hungers.", "Soul Hunter (Novel) by Aaron Dembski-Bowden, Part One, Chapter 6, p. 123"));
        this.add(new Quote("There is no enemy. The foe on the battlefield is merely the manifestation of that which we must overcome. He is doubt, and fear, and despair. Every battle is fought within. Conquer the battlefield that lies inside you, and the enemy disappears like the illusion he is.", "Seventh Retribution (Novel) by Ben Counter, K-Day + 11 Days, pg. 158"));
        this.add(new Quote("-No plan survives contact with the enemy.\n" +
                "\n" +
                "-Then you're not making the right plans.\n" +
                "-Attributed, in retort to Lion El'Jonson", "I Am Slaughter (Novel) by Dan Abnett, Chapter Six"));
    }

    public Quote add(Quote quote) {
        quote.setId(this.quotes.size() + 1);
        this.quotes.add(quote);
        return quote;
    }

    public Quote get(Integer id) {
        for (Quote q : this.quotes) {
            if (q.getId() == id) {
                return q;
            }
        }
        return null;
    }

    public Quote getRandom() {
        Integer quoteId = new Random().nextInt(this.count()) + 1;
        return this.get(quoteId);
    }

    public Boolean delete(Integer id) {
        Quote q = this.get(id);
        if (q != null) {
            this.quotes.remove(q);
            return true;
        }
        return false;
    }

    public Quote update(Integer id, Quote quote) {
        this.delete(id);
        quote.setId(id);
        this.quotes.add(quote);
        return quote;
    }

    public Integer count() {
        return this.quotes.size();
    }

}
