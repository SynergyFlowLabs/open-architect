package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.l1
    protected long f110296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.l1
    protected long f110297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f110298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ pd f110299d;

    public nd(pd pdVar) {
        Objects.requireNonNull(pdVar);
        this.f110299d = pdVar;
        this.f110298c = new ld(this, pdVar.f110184a);
        long jB = pdVar.f110184a.e().b();
        this.f110296a = jB;
        this.f110297b = jB;
    }

    @androidx.annotation.m1
    final void a(long j10) {
        this.f110299d.h();
        this.f110298c.d();
        this.f110296a = j10;
        this.f110297b = j10;
    }

    @androidx.annotation.m1
    final void b(long j10) {
        this.f110298c.d();
    }

    final void c() {
        this.f110298c.d();
        long jB = this.f110299d.f110184a.e().b();
        this.f110296a = jB;
        this.f110297b = jB;
    }

    @androidx.annotation.m1
    public final boolean d(boolean z10, boolean z11, long j10) {
        pd pdVar = this.f110299d;
        pdVar.h();
        pdVar.j();
        if (pdVar.f110184a.g()) {
            h7 h7Var = pdVar.f110184a;
            h7Var.x().f110172q.b(h7Var.e().currentTimeMillis());
        }
        long j11 = j10 - this.f110296a;
        if (!z10 && j11 < 1000) {
            pdVar.f110184a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            int i10 = 3 << 0;
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f110297b;
            this.f110297b = j10;
        }
        h7 h7Var2 = pdVar.f110184a;
        h7Var2.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !h7Var2.w().N();
        h7 h7Var3 = pdVar.f110184a;
        ze.k0(h7Var3.I().q(z12), bundle, true);
        if (!z11) {
            h7Var3.B().t("auto", "_e", bundle);
        }
        this.f110296a = j10;
        w wVar = this.f110298c;
        wVar.d();
        wVar.b(((Long) z4.f110792r0.b(null)).longValue());
        return true;
    }
}
