package g0;

import androidx.compose.runtime.internal.w0;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class e<T> extends a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f275359e = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final T[] f275360d;

    public e(@NotNull T[] tArr, int i10, int i11) {
        super(i10, i11);
        this.f275360d = tArr;
    }

    @Override // g0.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f275360d;
        int iD = d();
        f(iD + 1);
        return tArr[iD];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f275360d;
        f(d() - 1);
        return tArr[d()];
    }
}
