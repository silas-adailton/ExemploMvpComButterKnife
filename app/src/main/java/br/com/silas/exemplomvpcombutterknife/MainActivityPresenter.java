package br.com.silas.exemplomvpcombutterknife;

/**
 * Created by Silas on 07/02/2017.
 */

public class MainActivityPresenter implements MainContract.MainContractPresenter {
    private MainContract.MainContractView view;

    public MainActivityPresenter(MainContract.MainContractView view) {
        this.view = view;
    }

    @Override
    public void validateCamp(String login,String senha) {
        if(login.isEmpty()) {
            view.errorMessage();
        }else{
            if (login.equals("Silas") && senha.equals("1234")){
                view.openDisplayMessageActivity();
            }else{
                view.errorLogin();
            }

        }

    }
}
