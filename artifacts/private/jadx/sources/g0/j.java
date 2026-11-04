package g0;

import androidx.compose.runtime.internal.w0;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class j<T> extends a<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f275378f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final T[] f275379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n<T> f275380e;

    public j(@NotNull Object[] objArr, @NotNull T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f275379d = tArr;
        int iD = o.d(i11);
        this.f275380e = new n<>(objArr, r.B(i10, iD), iD, i12);
    }

    @Override // g0.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        b();
        if (this.f275380e.hasNext()) {
            f(d() + 1);
            return this.f275380e.next();
        }
        T[] tArr = this.f275379d;
        int iD = d();
        f(iD + 1);
        return tArr[iD - this.f275380e.e()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        c();
        if (d() <= this.f275380e.e()) {
            f(d() - 1);
            return this.f275380e.previous();
        }
        T[] tArr = this.f275379d;
        f(d() - 1);
        return tArr[d() - this.f275380e.e()];
    }
}
