package br.com.silas.exemplomvpcombutterknife;

/**
 * Created by Silas on 07/02/2017.
 */

public interface MainContract {
    interface MainContractView{
        void errorMessage();
        void errorLogin();
        void openDisplayMessageActivity();
        void initialize();
        void setPresenter(MainContractPresenter presenter);
    }
    interface MainContractPresenter{
        void validateCamp(String login,String senha);
    }
}
