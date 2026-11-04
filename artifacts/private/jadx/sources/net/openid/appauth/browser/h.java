package net.openid.appauth.browser;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f332854e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final WeakReference<Context> f332855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final AtomicReference<androidx.browser.customtabs.c> f332856b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final CountDownLatch f332857c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private androidx.browser.customtabs.g f332858d;

    class a extends androidx.browser.customtabs.g {
        a() {
        }

        private void d(@p0 androidx.browser.customtabs.c cVar) {
            h.this.f332856b.set(cVar);
            h.this.f332857c.countDown();
        }

        @Override // androidx.browser.customtabs.g
        public void b(ComponentName componentName, androidx.browser.customtabs.c cVar) {
            net.openid.appauth.internal.a.a("CustomTabsService is connected", new Object[0]);
            cVar.n(0L);
            d(cVar);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            net.openid.appauth.internal.a.a("CustomTabsService is disconnected", new Object[0]);
            d(null);
        }
    }

    public h(@NonNull Context context) {
        this.f332855a = new WeakReference<>(context);
    }

    public synchronized void c(@NonNull String str) {
        try {
            if (this.f332858d != null) {
                return;
            }
            this.f332858d = new a();
            Context context = this.f332855a.get();
            if (context == null || !androidx.browser.customtabs.c.b(context, str, this.f332858d)) {
                net.openid.appauth.internal.a.f("Unable to bind custom tabs service", new Object[0]);
                this.f332857c.countDown();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @m1
    @p0
    public androidx.browser.customtabs.h d(@p0 androidx.browser.customtabs.b bVar, @p0 Uri... uriArr) {
        androidx.browser.customtabs.c cVarG = g();
        if (cVarG == null) {
            return null;
        }
        androidx.browser.customtabs.h hVarK = cVarG.k(bVar);
        if (hVarK == null) {
            net.openid.appauth.internal.a.l("Failed to create custom tabs session through custom tabs client", new Object[0]);
            return null;
        }
        if (uriArr != null && uriArr.length > 0) {
            hVarK.g(uriArr[0], null, net.openid.appauth.internal.b.h(uriArr, 1));
        }
        return hVarK;
    }

    @NonNull
    @m1
    public androidx.browser.customtabs.d.c e(@p0 Uri... uriArr) {
        return new androidx.browser.customtabs.d.c(d(null, uriArr));
    }

    public synchronized void f() {
        try {
            if (this.f332858d == null) {
                return;
            }
            Context context = this.f332855a.get();
            if (context != null) {
                context.unbindService(this.f332858d);
            }
            this.f332856b.set(null);
            net.openid.appauth.internal.a.a("CustomTabsService is disconnected", new Object[0]);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @m1
    public androidx.browser.customtabs.c g() {
        try {
            this.f332857c.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            net.openid.appauth.internal.a.f("Interrupted while waiting for browser connection", new Object[0]);
            this.f332857c.countDown();
        }
        return this.f332856b.get();
    }
}
