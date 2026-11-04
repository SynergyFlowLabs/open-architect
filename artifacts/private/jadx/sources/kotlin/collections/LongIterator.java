package kotlin.collections;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import qj.a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class LongIterator implements Iterator<Long>, a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
