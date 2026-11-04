package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.l1
final class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qe f110330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f110331b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f110332c = d();

    public oe(qe qeVar) {
        this.f110330a = qeVar;
    }

    private final long d() {
        qe qeVar = this.f110330a;
        com.google.android.gms.common.internal.w.r(qeVar);
        long jLongValue = ((Long) z4.f110799v.b(null)).longValue();
        long jLongValue2 = ((Long) z4.f110801w.b(null)).longValue();
        for (int i10 = 1; i10 < this.f110331b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return qeVar.e().currentTimeMillis() + Math.min(jLongValue, jLongValue2);
    }

    public final void a() {
        this.f110331b++;
        this.f110332c = d();
    }

    public final boolean b() {
        return this.f110330a.e().currentTimeMillis() >= this.f110332c;
    }

    final /* synthetic */ long c() {
        return this.f110332c;
    }
}
