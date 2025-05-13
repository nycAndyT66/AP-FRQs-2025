public class SignedText {
    private String fName;
    private String lName;
    
    public SignedText(String i, String j){
        fName = i;
        lName = j;
    }

    public String getSignature(){
        if(fName == null){
            return lName;
        }
        return fName.substring(0,1)+"-"+lName;
    }

    public String addSignature(String txt){
        if(txt.indexOf(this.getSignature()) == 0){
            return txt.substring(getSignature().length())+getSignature();
        }

        else if(txt.indexOf(getSignature()) == txt.length()-getSignature().length()-1){
            return txt;
        }

        else{
            return txt + getSignature();
        }
    }
}
