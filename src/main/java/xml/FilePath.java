package xml;

public class FilePath {
    public static String getFilePath(){
        String FilePath = "XML/ballons_mingas_"+GetTimeForXML.dateNow()+".xml";
        return FilePath;
    }
}
