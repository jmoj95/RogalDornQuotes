package br.ufc.quixada.dadm.rogaldornquotes;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import br.ufc.quixada.dadm.rogaldornquotes.dao.QuoteDAO;
import br.ufc.quixada.dadm.rogaldornquotes.entity.Quote;

public class MainActivity extends AppCompatActivity {

    private QuoteDAO quoteDAO;
    private TextView txtQuote;
    private TextView txtSource;
    private FloatingActionButton btnReload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.quoteDAO = new QuoteDAO();
        this.txtQuote = findViewById(R.id.txt_quote);
        this.txtSource = findViewById(R.id.txt_source);
        this.btnReload = findViewById(R.id.btn_reload);

        requestRandomQuote();
    }

    public void btnReloadClick(View view) {
        requestRandomQuote();
    }

    private void requestRandomQuote() {
        Quote quote = this.quoteDAO.getRandom();
        this.txtQuote.setText(quote.getQuote());
        this.txtSource.setText(quote.getSource());
    }
}
