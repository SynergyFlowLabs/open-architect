package com.google.api.client.googleapis.media;

import com.google.api.client.http.c0;
import com.google.api.client.http.r;
import com.google.api.client.http.u;
import com.google.api.client.http.x;
import com.google.api.client.util.f;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@f
class e implements c0, r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Logger f115456d = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f115457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f115458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f115459c;

    public e(c cVar, u uVar) {
        this.f115457a = (c) h0.d(cVar);
        this.f115458b = uVar.k();
        this.f115459c = uVar.x();
        uVar.K(this);
        uVar.X(this);
    }

    @Override // com.google.api.client.http.r
    public boolean a(u uVar, boolean z10) throws IOException {
        r rVar = this.f115458b;
        boolean z11 = rVar != null && rVar.a(uVar, z10);
        if (z11) {
            try {
                this.f115457a.v();
                return z11;
            } catch (IOException e10) {
                f115456d.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e10);
            }
        }
        return z11;
    }

    @Override // com.google.api.client.http.c0
    public boolean c(u uVar, x xVar, boolean z10) throws IOException {
        c0 c0Var = this.f115459c;
        boolean z11 = c0Var != null && c0Var.c(uVar, xVar, z10);
        if (z11 && z10 && xVar.k() / 100 == 5) {
            try {
                this.f115457a.v();
                return z11;
            } catch (IOException e10) {
                f115456d.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e10);
            }
        }
        return z11;
    }
}
