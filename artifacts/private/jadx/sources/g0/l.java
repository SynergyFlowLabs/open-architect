package g0;

import androidx.compose.runtime.internal.w0;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class l<E> extends a<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f275386e = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E f275387d;

    public l(E e10, int i10) {
        super(i10, 1);
        this.f275387d = e10;
    }

    @Override // g0.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        b();
        f(d() + 1);
        return this.f275387d;
    }

    @Override // java.util.ListIterator
    public E previous() {
        c();
        f(d() - 1);
        return this.f275387d;
    }
}
