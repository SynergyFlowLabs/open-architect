package com.google.vr.sdk.deps;

import com.google.vr.sdk.deps.w6;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w6<M extends w6<M>> extends c7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected y6 f129659b;

    private void o(int i10, d7 d7Var) throws IOException {
        z6 z6VarB;
        y6 y6Var = this.f129659b;
        if (y6Var == null) {
            this.f129659b = new y6();
            z6VarB = null;
        } else {
            z6VarB = y6Var.b(i10);
        }
        if (z6VarB == null) {
            z6VarB = new z6();
            this.f129659b.c(i10, z6VarB);
        }
        z6VarB.c(d7Var);
    }

    @Override // com.google.vr.sdk.deps.c7
    protected int b() {
        if (this.f129659b == null) {
            return 0;
        }
        int iA = 0;
        for (int i10 = 0; i10 < this.f129659b.a(); i10++) {
            iA += this.f129659b.e(i10).a();
        }
        return iA;
    }

    @Override // com.google.vr.sdk.deps.c7
    public void k(u6 u6Var) throws IOException {
        if (this.f129659b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f129659b.a(); i10++) {
            this.f129659b.e(i10).b(u6Var);
        }
    }

    @Override // com.google.vr.sdk.deps.c7
    public M l() throws CloneNotSupportedException {
        M m10 = (M) super.l();
        a7.a(this, m10);
        return m10;
    }

    protected final boolean n(t6 t6Var, int i10) throws IOException {
        int iT = t6Var.t();
        if (!t6Var.i(i10)) {
            return false;
        }
        o(i10 >>> 3, new d7(i10, t6Var.f(iT, t6Var.t() - iT)));
        return true;
    }
}
