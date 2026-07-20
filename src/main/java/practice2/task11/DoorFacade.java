package practice2.task11;

public class DoorFacade {

    private final DoorOpen doorOpen;
    private final DoorClose doorClose;
    private final DoorLock doorLock;

    public DoorFacade() {
        doorOpen = new DoorOpen();
        doorClose = new DoorClose();
        doorLock = new DoorLock();
    }

    public void openDoor() {
        doorOpen.open();
    }

    public void closeDoor() {
        doorClose.close();
    }

    public void lockDoor() {
        doorLock.lock();
    }

}
