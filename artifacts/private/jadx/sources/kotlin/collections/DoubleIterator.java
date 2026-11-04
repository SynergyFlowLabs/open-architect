package kotlin.collections;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import qj.a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DoubleIterator implements Iterator<Double>, a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Double next() {
        return Double.valueOf(nextDouble());
    }

    public abstract double nextDouble();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public final Double next() {
        return Double.valueOf(nextDouble());
    }
}
