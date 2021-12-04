package fc.collections.collections2.task1;

public class OwnMapImplementation implements OwnMap {

    private final int HASH_MAP_SIZE = 1000;
    private String[] arrayString = new String[HASH_MAP_SIZE];

    private int hash(String key) {
        return key.hashCode() % HASH_MAP_SIZE;
    }


    @Override
    public boolean put(String key, String value) {
        arrayString[hash(key)] = value;
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        if (arrayString[hash(key)] != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        boolean isFound = false;
        for (int index = 0; index < HASH_MAP_SIZE; index++) {
            if (arrayString[index] == value) {
                isFound = true;
            }
        }
        return isFound;
    }

    @Override
    public String remove(String key) {
        String element = arrayString[hash(key)];
        arrayString[hash(key)] = null;
        return element;
    }

    @Override
    public String get(String key) {
        return arrayString[hash(key)];
    }
}
