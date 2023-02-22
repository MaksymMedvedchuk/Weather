package util;

public enum PropertyKey {

    PATH_TO_XML("pathXML"),
    PATH_TO_XSD("pathXSD");

    private final String key;

    PropertyKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
