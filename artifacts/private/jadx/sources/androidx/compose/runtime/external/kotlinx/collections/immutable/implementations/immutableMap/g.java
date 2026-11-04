package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class g<K, V, T> extends e<K, V, T> implements Iterator<T>, qj.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f35634i = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f<K, V> f35635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private K f35636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35638h;

    public g(@NotNull f<K, V> fVar, @NotNull v<K, V, T>[] vVarArr) {
        super(fVar.c(), vVarArr);
        this.f35635e = fVar;
        this.f35638h = fVar.b();
    }

    private final void j() {
        if (this.f35635e.b() != this.f35638h) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (!this.f35637g) {
            throw new IllegalStateException();
        }
    }

    private final void l(int i10, u<?, ?> uVar, K k10, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            f()[i11].k(uVar.s(), uVar.s().length, 0);
            while (!Intrinsics.areEqual(f()[i11].b(), k10)) {
                f()[i11].h();
            }
            i(i11);
            return;
        }
        int iF = 1 << y.f(i10, i12);
        if (uVar.t(iF)) {
            f()[i11].k(uVar.s(), uVar.p() * 2, uVar.q(iF));
            i(i11);
        } else {
            int iR = uVar.R(iF);
            u<?, ?> uVarQ = uVar.Q(iR);
            f()[i11].k(uVar.s(), uVar.p() * 2, iR);
            l(i10, uVarQ, k10, i11 + 1);
        }
    }

    public final void m(K k10, V v10) {
        if (this.f35635e.containsKey(k10)) {
            if (hasNext()) {
                K kC = c();
                this.f35635e.put(k10, v10);
                l(kC != null ? kC.hashCode() : 0, this.f35635e.c(), kC, 0);
            } else {
                this.f35635e.put(k10, v10);
            }
            this.f35638h = this.f35635e.b();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e, java.util.Iterator
    public T next() {
        j();
        this.f35636f = c();
        this.f35637g = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e, java.util.Iterator
    public void remove() {
        k();
        if (hasNext()) {
            K kC = c();
            r1.k(this.f35635e).remove(this.f35636f);
            l(kC != null ? kC.hashCode() : 0, this.f35635e.c(), kC, 0);
        } else {
            r1.k(this.f35635e).remove(this.f35636f);
        }
        this.f35636f = null;
        this.f35637g = false;
        this.f35638h = this.f35635e.b();
    }
}
