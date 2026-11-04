package g0;

import androidx.compose.runtime.internal.w0;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class k<T> extends a<T> implements ListIterator<T>, qj.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f275381h = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i<T> f275382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f275383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private n<? extends T> f275384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f275385g;

    public k(@NotNull i<T> iVar, int i10) {
        super(i10, iVar.size());
        this.f275382d = iVar;
        this.f275383e = iVar.k();
        this.f275385g = -1;
        j();
    }

    private final void h() {
        if (this.f275383e != this.f275382d.k()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (this.f275385g == -1) {
            throw new IllegalStateException();
        }
    }

    private final void j() {
        Object[] objArrL = this.f275382d.l();
        if (objArrL == null) {
            this.f275384f = null;
            return;
        }
        int iD = o.d(this.f275382d.size());
        int iB = r.B(d(), iD);
        int iM = (this.f275382d.m() / 5) + 1;
        n<? extends T> nVar = this.f275384f;
        if (nVar == null) {
            this.f275384f = new n<>(objArrL, iB, iD, iM);
        } else {
            Intrinsics.checkNotNull(nVar);
            nVar.k(objArrL, iB, iD, iM);
        }
    }

    private final void reset() {
        g(this.f275382d.size());
        this.f275383e = this.f275382d.k();
        this.f275385g = -1;
        j();
    }

    @Override // g0.a, java.util.ListIterator
    public void add(T t10) {
        h();
        this.f275382d.add(d(), t10);
        f(d() + 1);
        reset();
    }

    @Override // g0.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        h();
        b();
        this.f275385g = d();
        n<? extends T> nVar = this.f275384f;
        if (nVar == null) {
            Object[] objArrN = this.f275382d.n();
            int iD = d();
            f(iD + 1);
            return (T) objArrN[iD];
        }
        if (nVar.hasNext()) {
            f(d() + 1);
            return nVar.next();
        }
        Object[] objArrN2 = this.f275382d.n();
        int iD2 = d();
        f(iD2 + 1);
        return (T) objArrN2[iD2 - nVar.e()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        h();
        c();
        this.f275385g = d() - 1;
        n<? extends T> nVar = this.f275384f;
        if (nVar == null) {
            Object[] objArrN = this.f275382d.n();
            f(d() - 1);
            return (T) objArrN[d()];
        }
        if (d() <= nVar.e()) {
            f(d() - 1);
            return nVar.previous();
        }
        Object[] objArrN2 = this.f275382d.n();
        f(d() - 1);
        return (T) objArrN2[d() - nVar.e()];
    }

    @Override // g0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        h();
        i();
        this.f275382d.remove(this.f275385g);
        if (this.f275385g < d()) {
            f(this.f275385g);
        }
        reset();
    }

    @Override // g0.a, java.util.ListIterator
    public void set(T t10) {
        h();
        i();
        this.f275382d.set(this.f275385g, t10);
        this.f275383e = this.f275382d.k();
        j();
    }
}
