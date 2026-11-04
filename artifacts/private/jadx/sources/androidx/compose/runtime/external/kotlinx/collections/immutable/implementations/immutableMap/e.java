package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public abstract class e<K, V, T> implements Iterator<T>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35623d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v<K, V, T>[] f35624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35626c = true;

    public e(@NotNull u<K, V> uVar, @NotNull v<K, V, T>[] vVarArr) {
        this.f35624a = vVarArr;
        vVarArr[0].j(uVar.s(), uVar.p() * 2);
        this.f35625b = 0;
        d();
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (this.f35624a[this.f35625b].f()) {
            return;
        }
        for (int i10 = this.f35625b; -1 < i10; i10--) {
            int iH = h(i10);
            if (iH == -1 && this.f35624a[i10].g()) {
                this.f35624a[i10].i();
                iH = h(i10);
            }
            if (iH != -1) {
                this.f35625b = iH;
                return;
            }
            if (i10 > 0) {
                this.f35624a[i10 - 1].i();
            }
            this.f35624a[i10].j(u.f35659e.a().s(), 0);
        }
        this.f35626c = false;
    }

    private static /* synthetic */ void e() {
    }

    private final int h(int i10) {
        if (this.f35624a[i10].f()) {
            return i10;
        }
        if (!this.f35624a[i10].g()) {
            return -1;
        }
        u<? extends K, ? extends V> uVarC = this.f35624a[i10].c();
        if (i10 == 6) {
            this.f35624a[i10 + 1].j(uVarC.s(), uVarC.s().length);
        } else {
            this.f35624a[i10 + 1].j(uVarC.s(), uVarC.p() * 2);
        }
        return h(i10 + 1);
    }

    protected final K c() {
        b();
        return this.f35624a[this.f35625b].b();
    }

    @NotNull
    protected final v<K, V, T>[] f() {
        return this.f35624a;
    }

    protected final int g() {
        return this.f35625b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35626c;
    }

    protected final void i(int i10) {
        this.f35625b = i10;
    }

    @Override // java.util.Iterator
    public T next() {
        b();
        T next = this.f35624a[this.f35625b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
