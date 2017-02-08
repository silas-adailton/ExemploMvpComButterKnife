package br.com.silas.exemplomvpcombutterknife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DisplayMessageActivity extends AppCompatActivity {
    @BindView(R.id.textViewMessage)
    TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        textViewMessage.setText(intent.getStringExtra(MainActivityView.EXTRA_MESSAGE));

    }
}
