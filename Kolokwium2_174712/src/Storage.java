class Storage<T> {
    private T storage;


    public Storage(T storage) {
        this.storage = storage;
    }


    public T retrieve() {
        return storage;
    }

    public void store(T storage) {
        this.storage = storage;
    }
}


