package HW3.Task1.PersonTask;

import java.util.NoSuchElementException;

abstract class Place<T extends Person> {
    T[] personArray;
    private final PlaceIterator placeIterator = new PlaceIterator();
    public Place(T[] personArray) {
        this.personArray = personArray;
    }

    public PlaceIterator iterator() {return placeIterator;}

    abstract void action();

    public class PlaceIterator {
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < personArray.length;
        }
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return personArray[currentIndex++];
        }
    }
}
