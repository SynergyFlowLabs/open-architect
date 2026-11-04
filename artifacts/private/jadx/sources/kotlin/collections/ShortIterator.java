package kotlin.collections;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import qj.a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ShortIterator implements Iterator<Short>, a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(nextShort());
    }

    public abstract short nextShort();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
    public final Short next2() {
        return Short.valueOf(nextShort());
    }
}
