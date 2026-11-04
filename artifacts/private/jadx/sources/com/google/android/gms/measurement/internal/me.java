package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.measurement.k7 f110271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List f110272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List f110273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f110274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ qe f110275e;

    /* synthetic */ me(qe qeVar, byte[] bArr) {
        Objects.requireNonNull(qeVar);
        this.f110275e = qeVar;
    }

    private static final long b(com.google.android.gms.internal.measurement.y6 y6Var) {
        return ((y6Var.J() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.y6 y6Var) {
        com.google.android.gms.common.internal.w.r(y6Var);
        if (this.f110273c == null) {
            this.f110273c = new ArrayList();
        }
        if (this.f110272b == null) {
            this.f110272b = new ArrayList();
        }
        if (!this.f110273c.isEmpty() && b((com.google.android.gms.internal.measurement.y6) this.f110273c.get(0)) != b(y6Var)) {
            return false;
        }
        long jE = this.f110274d + ((long) y6Var.e());
        qe qeVar = this.f110275e;
        if (!qeVar.B0().H(null, z4.f110759e1)) {
            qeVar.B0();
            if (jE >= k.o()) {
                return false;
            }
        } else if (!this.f110273c.isEmpty()) {
            qeVar.B0();
            if (jE >= k.o()) {
                return false;
            }
        }
        this.f110274d = jE;
        this.f110273c.add(y6Var);
        this.f110272b.add(Long.valueOf(j10));
        int size = this.f110273c.size();
        qeVar.B0();
        return size < Math.max(1, ((Integer) z4.f110775k.b(null)).intValue());
    }
}
