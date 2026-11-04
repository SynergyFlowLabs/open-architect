package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements j, ServiceConnection {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f11945f = "PostMessageServConn";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11946a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.customtabs.a f11947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private android.support.customtabs.c f11948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private String f11949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11950e;

    public l(@NonNull i iVar) {
        IBinder iBinderC = iVar.c();
        if (iBinderC == null) {
            throw new IllegalArgumentException("Provided session must have binder.");
        }
        this.f11947b = android.support.customtabs.a.b.i(iBinderC);
    }

    private boolean f() {
        return this.f11948c != null;
    }

    private boolean h(@p0 Bundle bundle) {
        if (this.f11948c == null) {
            return false;
        }
        synchronized (this.f11946a) {
            try {
                try {
                    this.f11948c.h3(this.f11947b, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // androidx.browser.customtabs.j
    @b1({b1.a.LIBRARY})
    public final boolean a(@p0 Bundle bundle) {
        return g(bundle);
    }

    @Override // androidx.browser.customtabs.j
    @b1({b1.a.LIBRARY})
    public void b(@NonNull Context context) {
        m(context);
    }

    @b1({b1.a.LIBRARY})
    public boolean c(@NonNull Context context) {
        String str = this.f11949d;
        if (str != null) {
            return d(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }

    public boolean d(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent();
        intent.setClassName(str, k.class.getName());
        int i10 = 6 ^ 1;
        return context.bindService(intent, this, 1);
    }

    @b1({b1.a.LIBRARY})
    public void e(@NonNull Context context) {
        if (f()) {
            m(context);
        }
    }

    public final boolean g(@p0 Bundle bundle) {
        this.f11950e = true;
        return h(bundle);
    }

    public void i() {
        if (this.f11950e) {
            h(null);
        }
    }

    public void j() {
    }

    public final boolean k(@NonNull String str, @p0 Bundle bundle) {
        if (this.f11948c == null) {
            return false;
        }
        synchronized (this.f11946a) {
            try {
                try {
                    this.f11948c.Ad(this.f11947b, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @b1({b1.a.LIBRARY})
    public void l(@NonNull String str) {
        this.f11949d = str;
    }

    @Override // androidx.browser.customtabs.j
    @b1({b1.a.LIBRARY})
    public final boolean l1(@NonNull String str, @p0 Bundle bundle) {
        return k(str, bundle);
    }

    public void m(@NonNull Context context) {
        if (f()) {
            context.unbindService(this);
            this.f11948c = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f11948c = android.support.customtabs.c.b.i(iBinder);
        i();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f11948c = null;
        j();
    }
}
