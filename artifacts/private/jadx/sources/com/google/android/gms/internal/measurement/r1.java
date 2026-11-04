package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f108764a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f108765b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(android.os.Bundle r3, java.lang.Class r4) {
        /*
            java.lang.String r2 = "Androeed.ru"
            r0 = 0
            r2 = 4
            if (r3 == 0) goto L2e
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            r2 = 0
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L14
            return r3
        L14:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            r2 = 3
            java.lang.String r3 = r3.getCanonicalName()
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            r2 = 2
            java.lang.String r4 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String.format(r4, r3)
            throw r0
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.r1.s(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final String k(long j10) {
        return (String) s(p(j10), String.class);
    }

    public final Long n(long j10) {
        return (Long) s(p(j10), Long.class);
    }

    public final Bundle p(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f108764a;
        synchronized (atomicReference) {
            try {
                if (!this.f108765b) {
                    try {
                        atomicReference.wait(j10);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = (Bundle) this.f108764a.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.x1
    public final void r(Bundle bundle) {
        AtomicReference atomicReference = this.f108764a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f108765b = true;
                    this.f108764a.notify();
                } catch (Throwable th2) {
                    this.f108764a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
