package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.google.android.gms.common.internal.k2;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.v;
import fj.h;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f106901b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @h
    private static volatile a f106902c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @l1
    public final ConcurrentHashMap f106903a = new ConcurrentHashMap();

    private a() {
    }

    @NonNull
    @g6.a
    public static a b() {
        if (f106902c == null) {
            synchronized (f106901b) {
                try {
                    if (f106902c == null) {
                        f106902c = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a aVar = f106902c;
        w.r(aVar);
        return aVar;
    }

    private static void f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean g(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, @h Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((com.google.android.gms.common.wrappers.d.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!h(serviceConnection)) {
            return i(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f106903a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        try {
            boolean zI = i(context, intent, serviceConnection, i10, executor);
            if (zI) {
                return zI;
            }
            this.f106903a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th2) {
            this.f106903a.remove(serviceConnection, serviceConnection);
            throw th2;
        }
    }

    private static boolean h(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof k2);
    }

    private static final boolean i(Context context, Intent intent, ServiceConnection serviceConnection, int i10, @h Executor executor) {
        if (executor == null) {
            executor = null;
            int i11 = 3 << 0;
        }
        return (!v.p() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    @g6.a
    public boolean a(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i10) {
        return g(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    @g6.a
    public void c(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (!h(serviceConnection) || !this.f106903a.containsKey(serviceConnection)) {
            f(context, serviceConnection);
            return;
        }
        try {
            f(context, (ServiceConnection) this.f106903a.get(serviceConnection));
            this.f106903a.remove(serviceConnection);
        } catch (Throwable th2) {
            this.f106903a.remove(serviceConnection);
            throw th2;
        }
    }

    @g6.a
    public void d(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        try {
            c(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean e(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i10, @h Executor executor) {
        return g(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
