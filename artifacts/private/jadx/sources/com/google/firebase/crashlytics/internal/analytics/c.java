package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.crashlytics.internal.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f120947g = "_ae";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f120948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f120949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f120950c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f120952e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f120951d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f120953f = false;

    public c(@NonNull e eVar, int i10, TimeUnit timeUnit) {
        this.f120948a = eVar;
        this.f120949b = i10;
        this.f120950c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@NonNull String str, @p0 Bundle bundle) {
        synchronized (this.f120951d) {
            try {
                g.f().k("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f120952e = new CountDownLatch(1);
                this.f120953f = false;
                this.f120948a.a(str, bundle);
                g.f().k("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f120952e.await(this.f120949b, this.f120950c)) {
                        this.f120953f = true;
                        g.f().k("App exception callback received from Analytics listener.");
                    } else {
                        g.f().m("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f120952e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean b() {
        return this.f120953f;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f120952e;
        if (countDownLatch != null && f120947g.equals(str)) {
            countDownLatch.countDown();
        }
    }
}
