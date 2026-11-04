package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.w0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class d<E> extends c<E> implements Iterator<E>, qj.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f35697i = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b<E> f35698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private E f35699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35701h;

    public d(@NotNull b<E> bVar) {
        super(bVar.k());
        this.f35698e = bVar;
        this.f35701h = bVar.i();
    }

    private final void i() {
        if (this.f35698e.i() != this.f35701h) {
            throw new ConcurrentModificationException();
        }
    }

    private final void j() {
        if (!this.f35700g) {
            throw new IllegalStateException();
        }
    }

    private final boolean k(e<?> eVar) {
        return eVar.m() == 0;
    }

    private final void l(int i10, e<?> eVar, E e10, int i11) {
        if (k(eVar)) {
            int iIndexOf = ArraysKt.indexOf((E[]) eVar.n(), e10);
            i0.a.a(iIndexOf != -1);
            e().get(i11).h(eVar.n(), iIndexOf);
            h(i11);
            return;
        }
        int iQ = eVar.q(1 << g.f(i10, i11 * 5));
        e().get(i11).h(eVar.n(), iQ);
        Object obj = eVar.n()[iQ];
        if (obj instanceof e) {
            l(i10, (e) obj, e10, i11 + 1);
        } else {
            h(i11);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public E next() {
        i();
        E e10 = (E) super.next();
        this.f35699f = e10;
        this.f35700g = true;
        return e10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public void remove() {
        j();
        if (hasNext()) {
            E eB = b();
            r1.a(this.f35698e).remove(this.f35699f);
            l(eB != null ? eB.hashCode() : 0, this.f35698e.k(), eB, 0);
        } else {
            r1.a(this.f35698e).remove(this.f35699f);
        }
        this.f35699f = null;
        this.f35700g = false;
        this.f35701h = this.f35698e.i();
    }
}
