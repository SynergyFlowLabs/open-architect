package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends androidx.loader.content.a implements com.google.android.gms.common.api.internal.x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Semaphore f105676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set f105677s;

    public f(Context context, Set set) {
        super(context);
        this.f105676r = new Semaphore(0);
        this.f105677s = set;
    }

    @Override // androidx.loader.content.a
    public final /* bridge */ /* synthetic */ Object J() {
        Iterator it = this.f105677s.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((com.google.android.gms.common.api.l) it.next()).y(this)) {
                i10++;
            }
        }
        try {
            this.f105676r.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void onComplete() {
        this.f105676r.release();
    }

    @Override // androidx.loader.content.c
    protected final void s() {
        this.f105676r.drainPermits();
        h();
    }
}
