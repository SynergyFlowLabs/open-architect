package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.b1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h {

    @NotNull
    private static final String A = "packageName";

    @NotNull
    private static final String B = "com.android.billingclient.api.BillingClient";

    @NotNull
    private static final String C = "com.android.billingclient.api.Purchase";

    @NotNull
    private static final String D = "com.android.billingclient.api.Purchase$PurchasesResult";

    @NotNull
    private static final String E = "com.android.billingclient.api.SkuDetails";

    @NotNull
    private static final String F = "com.android.billingclient.api.PurchaseHistoryRecord";

    @NotNull
    private static final String G = "com.android.billingclient.api.SkuDetailsResponseListener";

    @NotNull
    private static final String H = "com.android.billingclient.api.PurchaseHistoryResponseListener";

    @NotNull
    private static final String I = "com.android.billingclient.api.BillingClient$Builder";

    @NotNull
    private static final String J = "com.android.billingclient.api.PurchasesUpdatedListener";

    @NotNull
    private static final String K = "com.android.billingclient.api.BillingClientStateListener";

    @NotNull
    private static final String L = "queryPurchases";

    @NotNull
    private static final String M = "getPurchasesList";

    @NotNull
    private static final String N = "getOriginalJson";

    @NotNull
    private static final String O = "querySkuDetailsAsync";

    @NotNull
    private static final String P = "queryPurchaseHistoryAsync";

    @NotNull
    private static final String Q = "newBuilder";

    @NotNull
    private static final String R = "enablePendingPurchases";

    @NotNull
    private static final String S = "setListener";

    @NotNull
    private static final String T = "build";

    @NotNull
    private static final String U = "startConnection";

    @NotNull
    private static final String V = "onBillingSetupFinished";

    @NotNull
    private static final String W = "onBillingServiceDisconnected";

    @NotNull
    private static final String X = "onPurchaseHistoryResponse";

    @NotNull
    private static final String Y = "onSkuDetailsResponse";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private static h f98906u = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final String f98910y = "inapp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final String f98911z = "productId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f98912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f98913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Class<?> f98914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Class<?> f98915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Class<?> f98916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Class<?> f98917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Class<?> f98918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Class<?> f98919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Class<?> f98920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Method f98921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Method f98922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Method f98923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Method f98924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Method f98925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Method f98926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Method f98927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final l f98928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final Set<String> f98929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final b f98904s = new b(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f98905t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f98907v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final Map<String, JSONObject> f98908w = new ConcurrentHashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final Map<String, JSONObject> f98909x = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m10, @Nullable Object[] objArr) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                if (Intrinsics.areEqual(m10.getName(), h.V)) {
                    h.f98904s.f().set(true);
                } else {
                    String name = m10.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    if (StringsKt.M1(name, h.W, false, 2, null)) {
                        h.f98904s.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(Context context, Class<?> cls) {
            Object objE;
            Object objE2;
            Object objE3;
            m mVar = m.f98989a;
            Class<?> clsA = m.a(h.I);
            Class<?> clsA2 = m.a(h.J);
            if (clsA != null && clsA2 != null) {
                Method methodD = m.d(cls, h.Q, Context.class);
                Method methodD2 = m.d(clsA, h.R, new Class[0]);
                Method methodD3 = m.d(clsA, h.S, clsA2);
                Method methodD4 = m.d(clsA, "build", new Class[0]);
                if (methodD != null && methodD2 != null && methodD3 != null && methodD4 != null && (objE = m.e(cls, methodD, null, context)) != null && (objE2 = m.e(clsA, methodD3, objE, Proxy.newProxyInstance(clsA2.getClassLoader(), new Class[]{clsA2}, new d()))) != null && (objE3 = m.e(clsA, methodD2, objE2, new Object[0])) != null) {
                    return m.e(clsA, methodD4, objE3, new Object[0]);
                }
                return null;
            }
            return null;
        }

        private final void b(Context context) {
            Object objA;
            l lVarB = l.f98974g.b();
            if (lVarB == null) {
                return;
            }
            m mVar = m.f98989a;
            Class<?> clsA = m.a(h.B);
            Class<?> clsA2 = m.a(h.C);
            Class<?> clsA3 = m.a(h.D);
            Class<?> clsA4 = m.a(h.E);
            Class<?> clsA5 = m.a(h.F);
            Class<?> clsA6 = m.a(h.G);
            Class<?> clsA7 = m.a(h.H);
            if (clsA == null || clsA3 == null || clsA2 == null || clsA4 == null || clsA6 == null || clsA5 == null || clsA7 == null) {
                return;
            }
            Method methodD = m.d(clsA, h.L, String.class);
            Method methodD2 = m.d(clsA3, h.M, new Class[0]);
            Method methodD3 = m.d(clsA2, h.N, new Class[0]);
            Method methodD4 = m.d(clsA4, h.N, new Class[0]);
            Method methodD5 = m.d(clsA5, h.N, new Class[0]);
            Method methodD6 = m.d(clsA, h.O, lVarB.f(), clsA6);
            Method methodD7 = m.d(clsA, h.P, String.class, clsA7);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || methodD5 == null || methodD6 == null || methodD7 == null || (objA = a(context, clsA)) == null) {
                return;
            }
            h.m(new h(context, objA, clsA, clsA3, clsA2, clsA4, clsA5, clsA6, clsA7, methodD, methodD2, methodD3, methodD4, methodD5, methodD6, methodD7, lVarB, null));
            h hVarG = h.g();
            if (hVarG == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            h.n(hVarG);
        }

        @n
        @Nullable
        public final synchronized h c(@NotNull Context context) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                if (h.f().get()) {
                    return h.g();
                }
                b(context);
                h.f().set(true);
                return h.g();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @NotNull
        public final Map<String, JSONObject> d() {
            return h.h();
        }

        @NotNull
        public final Map<String, JSONObject> e() {
            return h.k();
        }

        @NotNull
        public final AtomicBoolean f() {
            return h.l();
        }

        private b() {
        }
    }

    public final class c implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Runnable f98930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f98931b;

        public c(@NotNull h this$0, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f98931b = this$0;
            this.f98930a = runnable;
        }

        private final void a(List<?> list) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        m mVar = m.f98989a;
                        Object objE = m.e(h.i(this.f98931b), h.c(this.f98931b), obj, new Object[0]);
                        String str = objE instanceof String ? (String) objE : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", h.b(this.f98931b).getPackageName());
                            if (jSONObject.has(h.f98911z)) {
                                String skuID = jSONObject.getString(h.f98911z);
                                h.e(this.f98931b).add(skuID);
                                Map<String, JSONObject> mapD = h.f98904s.d();
                                Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                mapD.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f98930a.run();
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }

        @NotNull
        public final Runnable b() {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                return this.f98930a;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }

        public final void c(@NotNull Runnable runnable) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(runnable, "<set-?>");
                this.f98930a = runnable;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] objArr) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.areEqual(method.getName(), h.X)) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m10, @Nullable Object[] objArr) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                return null;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Runnable f98932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f98933b;

        public e(@NotNull h this$0, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f98933b = this$0;
            this.f98932a = runnable;
        }

        @NotNull
        public final Runnable a() {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                return this.f98932a;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }

        public final void b(@NotNull List<?> skuDetailsObjectList) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(skuDetailsObjectList, "skuDetailsObjectList");
                for (Object obj : skuDetailsObjectList) {
                    try {
                        m mVar = m.f98989a;
                        Object objE = m.e(h.j(this.f98933b), h.d(this.f98933b), obj, new Object[0]);
                        String str = objE instanceof String ? (String) objE : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has(h.f98911z)) {
                                String skuID = jSONObject.getString(h.f98911z);
                                Map<String, JSONObject> mapE = h.f98904s.e();
                                Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                mapE.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f98932a.run();
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }

        public final void c(@NotNull Runnable runnable) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(runnable, "<set-?>");
                this.f98932a = runnable;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m10, @Nullable Object[] objArr) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                if (Intrinsics.areEqual(m10.getName(), h.Y)) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        b((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }
    }

    public /* synthetic */ h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, lVar);
    }

    public static final /* synthetic */ Context b(h hVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return hVar.f98912a;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(h hVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return hVar.f98925n;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(h hVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return hVar.f98924m;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(h hVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return hVar.f98929r;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return f98905t;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ h g() {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return f98906u;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return f98908w;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(h hVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return hVar.f98918g;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(h hVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return hVar.f98917f;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return f98909x;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            return f98907v;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(h hVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return;
        }
        try {
            f98906u = hVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
        }
    }

    public static final /* synthetic */ void n(h hVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return;
        }
        try {
            hVar.u();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
        }
    }

    @n
    @Nullable
    public static final synchronized h o(@NotNull Context context) {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
                return null;
            }
            try {
                return f98904s.c(context);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
                return null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(h this$0, Runnable queryPurchaseHistoryRunnable) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
            this$0.t("inapp", new ArrayList(this$0.f98929r), queryPurchaseHistoryRunnable);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
        }
    }

    private final void s(String str, Runnable runnable) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(this.f98920i.getClassLoader(), new Class[]{this.f98920i}, new c(this, runnable));
            m mVar = m.f98989a;
            m.e(this.f98914c, this.f98927p, this.f98913b, str, objNewProxyInstance);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void t(String str, List<String> list, Runnable runnable) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(this.f98919h.getClassLoader(), new Class[]{this.f98919h}, new e(this, runnable));
            Object objE = this.f98928q.e(str, list);
            m mVar = m.f98989a;
            m.e(this.f98914c, this.f98926o, this.f98913b, objE, objNewProxyInstance);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void u() {
        Method methodD;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            m mVar = m.f98989a;
            Class<?> clsA = m.a(K);
            if (clsA == null || (methodD = m.d(this.f98914c, U, clsA)) == null) {
                return;
            }
            m.e(this.f98914c, methodD, this.f98913b, Proxy.newProxyInstance(clsA.getClassLoader(), new Class[]{clsA}, new a()));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void p(@NotNull String skuType, @NotNull Runnable querySkuRunnable) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
            m mVar = m.f98989a;
            Object objE = m.e(this.f98915d, this.f98922k, m.e(this.f98914c, this.f98921j, this.f98913b, "inapp"), new Object[0]);
            List list = objE instanceof List ? (List) objE : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    m mVar2 = m.f98989a;
                    Object objE2 = m.e(this.f98916e, this.f98923l, obj, new Object[0]);
                    String str = objE2 instanceof String ? (String) objE2 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has(f98911z)) {
                            String skuID = jSONObject.getString(f98911z);
                            arrayList.add(skuID);
                            Map<String, JSONObject> map = f98908w;
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            map.put(skuID, jSONObject);
                        }
                    }
                }
                t(skuType, arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void q(@NotNull String skuType, @NotNull final Runnable queryPurchaseHistoryRunnable) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            s(skuType, new Runnable() { // from class: com.facebook.appevents.iap.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.r(this.f98902a, queryPurchaseHistoryRunnable);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private h(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar) {
        this.f98912a = context;
        this.f98913b = obj;
        this.f98914c = cls;
        this.f98915d = cls2;
        this.f98916e = cls3;
        this.f98917f = cls4;
        this.f98918g = cls5;
        this.f98919h = cls6;
        this.f98920i = cls7;
        this.f98921j = method;
        this.f98922k = method2;
        this.f98923l = method3;
        this.f98924m = method4;
        this.f98925n = method5;
        this.f98926o = method6;
        this.f98927p = method7;
        this.f98928q = lVar;
        this.f98929r = new CopyOnWriteArraySet();
    }
}
