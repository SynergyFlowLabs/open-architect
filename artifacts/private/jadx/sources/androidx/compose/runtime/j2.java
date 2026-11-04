package androidx.compose.runtime;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class j2 implements Iterator<androidx.compose.runtime.tooling.m>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f36170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36173d;

    public j2(@NotNull w5 w5Var, int i10, int i11) {
        this.f36170a = w5Var;
        this.f36171b = i11;
        this.f36172c = i10;
        this.f36173d = w5Var.K();
        if (w5Var.L()) {
            y5.k0();
        }
    }

    private final void e() {
        if (this.f36170a.K() != this.f36173d) {
            y5.k0();
        }
    }

    public final int b() {
        return this.f36171b;
    }

    @NotNull
    public final w5 c() {
        return this.f36170a;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.tooling.m next() {
        e();
        int i10 = this.f36172c;
        this.f36172c = y5.M(this.f36170a.D(), i10) + i10;
        return new x5(this.f36170a, i10, this.f36173d);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36172c < this.f36171b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
