package br.com.silas.exemplomvpcombutterknife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivityView extends AppCompatActivity implements MainContract.MainContractView {
    static final String EXTRA_MESSAGE = "br.com.exemplomvccombutterknife";
    @BindView(R.id.editTextLogin)
    EditText editTextLogin;
    @BindView(R.id.editTextSenha)
    EditText editTextSenha;

    @OnClick(R.id.btnSend)
    void sendMessage() {
        mPresenter.validateCamp(editTextLogin.getText().toString(),editTextSenha.getText().toString());
    }

    private MainContract.MainContractPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
        ButterKnife.bind(this);

        mPresenter = new MainActivityPresenter(this);


    }

    @Override
    public void errorMessage() {
        Toast.makeText(this, getString(R.string.message), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void errorLogin() {
        Toast.makeText(this, "Login ou senha incorretos!!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void openDisplayMessageActivity() {
        String message = editTextLogin.getText().toString();
        Intent intent = new Intent(MainActivityView.this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, editTextLogin.getText().toString());
        startActivity(intent);

    }

    @Override
    public void initialize() {

    }

    @Override
    public void setPresenter(MainContract.MainContractPresenter presenter) {
        mPresenter = presenter;

    }
}
