package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class h<T> implements Iterator<T>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T[] f312736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312737b;

    public h(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312736a = array;
    }

    @NotNull
    public final T[] b() {
        return this.f312736a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312737b < this.f312736a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f312736a;
            int i10 = this.f312737b;
            this.f312737b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312737b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
