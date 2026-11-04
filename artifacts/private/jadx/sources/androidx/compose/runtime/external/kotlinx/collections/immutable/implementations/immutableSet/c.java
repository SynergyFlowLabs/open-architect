package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class c<E> implements Iterator<E>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35693d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<f<E>> f35694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35696c;

    public c(@NotNull e<E> eVar) {
        List<f<E>> listMutableListOf = CollectionsKt.mutableListOf(new f());
        this.f35694a = listMutableListOf;
        this.f35696c = true;
        f.i(listMutableListOf.get(0), eVar.n(), 0, 2, null);
        this.f35695b = 0;
        c();
    }

    private final void c() {
        if (this.f35694a.get(this.f35695b).d()) {
            return;
        }
        for (int i10 = this.f35695b; -1 < i10; i10--) {
            int iG = g(i10);
            if (iG == -1 && this.f35694a.get(i10).c()) {
                this.f35694a.get(i10).f();
                iG = g(i10);
            }
            if (iG != -1) {
                this.f35695b = iG;
                return;
            }
            if (i10 > 0) {
                this.f35694a.get(i10 - 1).f();
            }
            this.f35694a.get(i10).h(e.f35702d.a().n(), 0);
        }
        this.f35696c = false;
    }

    private static /* synthetic */ void d() {
    }

    private final int g(int i10) {
        if (this.f35694a.get(i10).d()) {
            return i10;
        }
        if (!this.f35694a.get(i10).e()) {
            return -1;
        }
        e<? extends E> eVarB = this.f35694a.get(i10).b();
        int i11 = i10 + 1;
        if (i11 == this.f35694a.size()) {
            this.f35694a.add(new f<>());
        }
        f.i(this.f35694a.get(i11), eVarB.n(), 0, 2, null);
        return g(i11);
    }

    protected final E b() {
        i0.a.a(hasNext());
        return this.f35694a.get(this.f35695b).a();
    }

    @NotNull
    protected final List<f<E>> e() {
        return this.f35694a;
    }

    protected final int f() {
        return this.f35695b;
    }

    protected final void h(int i10) {
        this.f35695b = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35696c;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.f35696c) {
            throw new NoSuchElementException();
        }
        E eG = this.f35694a.get(this.f35695b).g();
        c();
        return eG;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
