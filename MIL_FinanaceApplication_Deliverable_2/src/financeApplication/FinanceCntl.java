package financeApplication;

/**
 *
 * @author mauriciolitvak
 */
public class FinanceCntl {
    
    private static final int STARTING_INDEX_OF_DISPLAY = 0;
    private final LoginCredentialsList credentialsList;
    private final FinanceUI financeUI;
    
    public FinanceCntl() {
        credentialsList = new LoginCredentialsList();
        financeUI = new FinanceUI(this);
    }
    
    LoginCredential getLoginCredentials(int index) {
        return credentialsList.getLoginCredentials().get(index);
    }
    
    int getListSize() {
        return credentialsList.getLoginCredentials().size();
    }
    
    public String getArrayList() {
        return credentialsList.getLoginCredentials().toString();
    }
    
    void addNewItemToEndOfList(String firstName, String lastName, String email, String password) {
        credentialsList.getLoginCredentials().add(new LoginCredential(firstName, lastName, email, password));
    }
    
    void replaceElementInArrayList(int index, String firstName, String lastName, String email, String password) {
        credentialsList.getLoginCredentials().set(index, new LoginCredential(firstName, lastName, email, password));
    }

}
