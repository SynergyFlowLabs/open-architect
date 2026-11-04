package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class s5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static s5 f110467d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h7 f110468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.internal.d0 f110469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f110470c = new AtomicLong(-1);

    private s5(Context context, h7 h7Var) {
        this.f110469b = com.google.android.gms.common.internal.c0.b(context, com.google.android.gms.common.internal.e0.a().b("measurement:api").a());
        this.f110468a = h7Var;
    }

    static s5 a(h7 h7Var) {
        if (f110467d == null) {
            f110467d = new s5(h7Var.d(), h7Var);
        }
        return f110467d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jB = this.f110468a.e().b();
        AtomicLong atomicLong = this.f110470c;
        if (atomicLong.get() != -1 && jB - atomicLong.get() <= 1800000) {
            return;
        }
        this.f110469b.F(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i11, 0, j10, j11, null, null, 0, i12)))).g(new com.google.android.gms.tasks.f() { // from class: com.google.android.gms.measurement.internal.r5
            @Override // com.google.android.gms.tasks.f
            public final /* synthetic */ void d(Exception exc) {
                this.f110432a.c(jB, exc);
            }
        });
    }

    final /* synthetic */ void c(long j10, Exception exc) {
        this.f110470c.set(j10);
    }
}
