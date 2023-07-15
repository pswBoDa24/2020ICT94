public abstract class LibraryItem {
    protected String title;
    protected String itemID;
    protected boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut() {
        this.checkedOut = true;
    }

    public void checkIn() {
        this.checkedOut = false;
    }

    public abstract void displayItemDetails();
}
