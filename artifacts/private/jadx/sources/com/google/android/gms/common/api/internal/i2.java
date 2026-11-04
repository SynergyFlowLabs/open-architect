package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
final class i2 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f106090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f106092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f106093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f106094e;

    @androidx.annotation.l1
    i2(i iVar, int i10, c cVar, long j10, long j11, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        this.f106090a = iVar;
        this.f106091b = i10;
        this.f106092c = cVar;
        this.f106093d = j10;
        this.f106094e = j11;
    }

    @androidx.annotation.p0
    static i2 a(i iVar, int i10, c cVar) {
        boolean zE2;
        if (!iVar.e()) {
            return null;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = com.google.android.gms.common.internal.y.b().a();
        if (rootTelemetryConfigurationA == null) {
            zE2 = true;
        } else {
            if (!rootTelemetryConfigurationA.b2()) {
                return null;
            }
            zE2 = rootTelemetryConfigurationA.e2();
            u1 u1VarV = iVar.v(cVar);
            if (u1VarV != null) {
                if (!(u1VarV.w() instanceof com.google.android.gms.common.internal.f)) {
                    return null;
                }
                com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) u1VarV.w();
                if (fVar.S() && !fVar.f()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(u1VarV, fVar, i10);
                    if (connectionTelemetryConfigurationB == null) {
                        return null;
                    }
                    u1VarV.H();
                    zE2 = connectionTelemetryConfigurationB.f2();
                }
            }
        }
        return new i2(iVar, i10, cVar, zE2 ? System.currentTimeMillis() : 0L, zE2 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[RETURN] */
    @androidx.annotation.p0
    private static ConnectionTelemetryConfiguration b(u1 u1Var, com.google.android.gms.common.internal.f fVar, int i10) {
        ConnectionTelemetryConfiguration connectionTelemetryConfigurationQ = fVar.Q();
        if (connectionTelemetryConfigurationQ != null && connectionTelemetryConfigurationQ.e2()) {
            int[] iArrT1 = connectionTelemetryConfigurationQ.T1();
            if (iArrT1 == null) {
                int[] iArrB2 = connectionTelemetryConfigurationQ.b2();
                if (iArrB2 == null || !com.google.android.gms.common.util.b.c(iArrB2, i10)) {
                    if (u1Var.t() < connectionTelemetryConfigurationQ.O1()) {
                        return connectionTelemetryConfigurationQ;
                    }
                }
            } else if (com.google.android.gms.common.util.b.c(iArrT1, i10)) {
                if (u1Var.t() < connectionTelemetryConfigurationQ.O1()) {
                    return connectionTelemetryConfigurationQ;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[PHI: r9
      0x00a0: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x009e, B:44:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    @androidx.annotation.m1
    public final void onComplete(@NonNull Task task) {
        u1 u1VarV;
        int version;
        int i10;
        int i11;
        int iO1;
        long j10;
        long j11;
        if (this.f106090a.e()) {
            RootTelemetryConfiguration rootTelemetryConfigurationA = com.google.android.gms.common.internal.y.b().a();
            if ((rootTelemetryConfigurationA == null || rootTelemetryConfigurationA.b2()) && (u1VarV = this.f106090a.v(this.f106092c)) != null && (u1VarV.w() instanceof com.google.android.gms.common.internal.f)) {
                com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) u1VarV.w();
                int i12 = 0;
                boolean zE2 = this.f106093d > 0;
                int iH = fVar.H();
                int iB2 = 100;
                if (rootTelemetryConfigurationA != null) {
                    zE2 &= rootTelemetryConfigurationA.e2();
                    int iO2 = rootTelemetryConfigurationA.O1();
                    int iT1 = rootTelemetryConfigurationA.T1();
                    version = rootTelemetryConfigurationA.getVersion();
                    if (fVar.S() && !fVar.f()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(u1VarV, fVar, this.f106091b);
                        if (connectionTelemetryConfigurationB == null) {
                            return;
                        }
                        boolean z10 = connectionTelemetryConfigurationB.f2() && this.f106093d > 0;
                        iT1 = connectionTelemetryConfigurationB.O1();
                        zE2 = z10;
                    }
                    i11 = iO2;
                    i10 = iT1;
                } else {
                    version = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                i iVar = this.f106090a;
                int iElapsedRealtime = -1;
                if (task.u()) {
                    iO1 = 0;
                } else if (task.s()) {
                    i12 = iB2;
                    iO1 = -1;
                } else {
                    Exception excP = task.p();
                    if (excP instanceof com.google.android.gms.common.api.b) {
                        Status statusA = ((com.google.android.gms.common.api.b) excP).a();
                        iB2 = statusA.b2();
                        ConnectionResult connectionResultO1 = statusA.O1();
                        if (connectionResultO1 == null) {
                            i12 = iB2;
                            iO1 = -1;
                        } else {
                            iO1 = connectionResultO1.O1();
                            i12 = iB2;
                        }
                    } else {
                        i12 = 101;
                        iO1 = -1;
                    }
                }
                if (zE2) {
                    long j12 = this.f106093d;
                    long j13 = this.f106094e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                iVar.J(new MethodInvocation(this.f106091b, i12, iO1, j10, j11, null, null, iH, iElapsedRealtime), version, i11, i10);
            }
        }
    }
}
