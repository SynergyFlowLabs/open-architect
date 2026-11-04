package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.c0;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.f;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile d f105044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f105045d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Duration f105046e = Duration.ofMinutes(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final d0 f105047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f105048b = new AtomicLong(-1);

    private d(Context context, String str) {
        this.f105047a = c0.b(context, e0.a().b("ads_identifier:api").a());
    }

    public static d a(Context context) {
        if (f105044c == null) {
            synchronized (f105045d) {
                try {
                    if (f105044c == null) {
                        f105044c = new d(context, "ads_identifier:api");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f105044c;
    }

    public static /* synthetic */ void b(d dVar, long j10, Exception exc) {
        ConnectionResult connectionResultO1;
        "getting error as ".concat(String.valueOf(exc.getMessage()));
        if ((exc instanceof com.google.android.gms.common.api.b) && (connectionResultO1 = ((com.google.android.gms.common.api.b) exc).a().O1()) != null && connectionResultO1.O1() == 24) {
            dVar.f105048b.set(j10);
        }
    }

    public final synchronized void c(int i10, int i11, long j10, long j11, int i12) {
        AtomicLong atomicLong = this.f105048b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        atomicLong.get();
        if (this.f105048b.get() == -1 || jElapsedRealtime - this.f105048b.get() > f105046e.toMillis()) {
            d0 d0Var = this.f105047a;
            if (d0Var != null) {
                d0Var.F(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i11, 0, j10, j11, null, null, 0, i12)))).g(new f() { // from class: com.google.android.gms.ads.identifier.c
                    @Override // com.google.android.gms.tasks.f
                    public final void d(Exception exc) {
                        d.b(this.f105042a, jElapsedRealtime, exc);
                    }
                });
            }
        }
    }
}
