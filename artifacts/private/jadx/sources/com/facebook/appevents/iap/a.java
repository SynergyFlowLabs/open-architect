package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f98891c = "com.android.vending.billing.IInAppBillingService$Stub";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f98892d = "com.android.billingclient.api.ProxyBillingActivity";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static Boolean f98894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private static Boolean f98895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ServiceConnection f98896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f98897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Intent f98898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private static Object f98899k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f98889a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f98890b = a.class.getCanonicalName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f98893e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.facebook.appevents.iap.a$a, reason: collision with other inner class name */
    public static final class ServiceConnectionC0903a implements ServiceConnection {
        ServiceConnectionC0903a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            a aVar = a.f98889a;
            i iVar = i.f98934a;
            g0 g0Var = g0.f99617a;
            a.f98899k = i.a(g0.n(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            g0 g0Var = g0.f99617a;
            Context contextN = g0.n();
            i iVar = i.f98934a;
            ArrayList<String> arrayListI = i.i(contextN, a.f98899k);
            a aVar = a.f98889a;
            aVar.f(contextN, arrayListI, false);
            aVar.f(contextN, i.j(contextN, a.f98899k), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d() {
            g0 g0Var = g0.f99617a;
            Context contextN = g0.n();
            i iVar = i.f98934a;
            ArrayList<String> arrayListI = i.i(contextN, a.f98899k);
            if (arrayListI.isEmpty()) {
                arrayListI = i.g(contextN, a.f98899k);
            }
            a.f98889a.f(contextN, arrayListI, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                g0 g0Var = g0.f99617a;
                g0.y().execute(new Runnable() { // from class: com.facebook.appevents.iap.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (Intrinsics.areEqual(a.f98895g, Boolean.TRUE) && Intrinsics.areEqual(activity.getLocalClassName(), a.f98892d)) {
                    g0 g0Var = g0.f99617a;
                    g0.y().execute(new Runnable() { // from class: com.facebook.appevents.iap.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private a() {
    }

    private final void e() {
        if (f98894f != null) {
            return;
        }
        m mVar = m.f98989a;
        Boolean boolValueOf = Boolean.valueOf(m.a(f98891c) != null);
        f98894f = boolValueOf;
        if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return;
        }
        f98895g = Boolean.valueOf(m.a(f98892d) != null);
        i iVar = i.f98934a;
        i.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        f98898j = intent;
        f98896h = new ServiceConnectionC0903a();
        f98897i = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context, ArrayList<String> arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (String purchase : arrayList) {
            try {
                String sku = new JSONObject(purchase).getString("productId");
                Intrinsics.checkNotNullExpressionValue(sku, "sku");
                Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                map.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException unused) {
            }
        }
        i iVar = i.f98934a;
        for (Map.Entry<String, String> entry : i.k(context, arrayList2, f98899k, z10).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = (String) map.get(key);
            if (str != null) {
                com.facebook.appevents.internal.i iVar2 = com.facebook.appevents.internal.i.f99018a;
                com.facebook.appevents.internal.i.f(str, value, z10);
            }
        }
    }

    @n
    public static final void g() {
        a aVar = f98889a;
        aVar.e();
        if (Intrinsics.areEqual(f98894f, Boolean.FALSE)) {
            return;
        }
        com.facebook.appevents.internal.i iVar = com.facebook.appevents.internal.i.f99018a;
        if (com.facebook.appevents.internal.i.c()) {
            aVar.h();
        }
    }

    private final void h() {
        if (f98893e.compareAndSet(false, true)) {
            g0 g0Var = g0.f99617a;
            Context contextN = g0.n();
            if (contextN instanceof Application) {
                Application application = (Application) contextN;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f98897i;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f98898j;
                if (intent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = f98896h;
                if (serviceConnection != null) {
                    contextN.bindService(intent, serviceConnection, 1);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
