package chainOfResponsibility;

public interface CipherHandler {

    public void setNextChainLink(CipherHandler next);
    public String decode(String cipherText);
	public boolean isCodeCracked(String candidateText);

}
