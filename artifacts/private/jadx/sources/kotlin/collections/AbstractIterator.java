package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Nullable;
import qj.a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractIterator<T> implements Iterator<T>, a {

    @Nullable
    private T nextValue;
    private int state;

    private final boolean tryToComputeNext() {
        this.state = 3;
        computeNext();
        return this.state == 1;
    }

    protected abstract void computeNext();

    protected final void done() {
        this.state = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.state;
        if (i10 == 0) {
            return tryToComputeNext();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.state;
        if (i10 == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (i10 == 2 || !tryToComputeNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        return this.nextValue;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final void setNext(T t10) {
        this.nextValue = t10;
        this.state = 1;
    }
}
