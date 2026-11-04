package androidx.media3.datasource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class e implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f62472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<r1> f62473c = new ArrayList<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private x f62475e;

    protected e(boolean z10) {
        this.f62472b = z10;
    }

    @Override // androidx.media3.datasource.p
    @androidx.media3.common.util.b1
    public final void s(r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        if (this.f62473c.contains(r1Var)) {
            return;
        }
        this.f62473c.add(r1Var);
        this.f62474d++;
    }

    protected final void u(int i10) {
        x xVar = (x) androidx.media3.common.util.k1.o(this.f62475e);
        for (int i11 = 0; i11 < this.f62474d; i11++) {
            this.f62473c.get(i11).g(this, xVar, this.f62472b, i10);
        }
    }

    protected final void v() {
        x xVar = (x) androidx.media3.common.util.k1.o(this.f62475e);
        for (int i10 = 0; i10 < this.f62474d; i10++) {
            this.f62473c.get(i10).h(this, xVar, this.f62472b);
        }
        this.f62475e = null;
    }

    protected final void w(x xVar) {
        for (int i10 = 0; i10 < this.f62474d; i10++) {
            this.f62473c.get(i10).i(this, xVar, this.f62472b);
        }
    }

    protected final void x(x xVar) {
        this.f62475e = xVar;
        for (int i10 = 0; i10 < this.f62474d; i10++) {
            this.f62473c.get(i10).f(this, xVar, this.f62472b);
        }
    }
}
