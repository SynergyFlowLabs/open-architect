package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@g6.a
public class b1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f123429e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @g6.a
    public static final int f123430f = 500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f123431g = 404;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f123432h = 401;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f123433i = 402;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f123434j = 403;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f123435k = "com.google.firebase.MESSAGING_EVENT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f123436l = "wrapped_intent";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f123437m = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static b1 f123438n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private String f123439a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f123440b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f123441c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<Intent> f123442d = new ArrayDeque();

    private b1() {
    }

    private int a(Context context, Intent intent) {
        String strF = f(context, intent);
        if (strF != null) {
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            return (e(context) ? m1.j(context, intent) : context.startService(intent)) == null ? 404 : -1;
        } catch (IllegalStateException e10) {
            e10.toString();
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    static synchronized b1 b() {
        try {
            if (f123438n == null) {
                f123438n = new b1();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f123438n;
    }

    @androidx.annotation.p0
    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f123439a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f123439a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f123439a = serviceInfo.name;
                    }
                    return this.f123439a;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @androidx.annotation.l1
    public static void g(b1 b1Var) {
        f123438n = b1Var;
    }

    @androidx.annotation.l0
    Intent c() {
        return this.f123442d.poll();
    }

    boolean d(Context context) {
        if (this.f123441c == null) {
            this.f123441c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        this.f123440b.booleanValue();
        return this.f123441c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f123440b == null) {
            this.f123440b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.f123440b.booleanValue();
        return this.f123440b.booleanValue();
    }

    @androidx.annotation.l0
    public int h(Context context, Intent intent) {
        this.f123442d.offer(intent);
        Intent intent2 = new Intent(f123435k);
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
