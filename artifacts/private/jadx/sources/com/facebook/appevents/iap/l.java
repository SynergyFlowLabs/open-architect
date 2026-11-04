package com.facebook.appevents.iap;

import androidx.annotation.b1;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private static l f98975h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f98977j = "com.android.billingclient.api.SkuDetailsParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f98978k = "com.android.billingclient.api.SkuDetailsParams$Builder";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f98979l = "newBuilder";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f98980m = "setType";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f98981n = "setSkusList";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f98982o = "build";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f98983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<?> f98984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Method f98985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Method f98986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Method f98987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Method f98988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f98974g = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f98976i = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a() {
            m mVar = m.f98989a;
            Class<?> clsA = m.a(l.f98977j);
            Class<?> clsA2 = m.a(l.f98978k);
            if (clsA == null || clsA2 == null) {
                return;
            }
            Method methodD = m.d(clsA, l.f98979l, new Class[0]);
            Method methodD2 = m.d(clsA2, l.f98980m, String.class);
            Method methodD3 = m.d(clsA2, l.f98981n, List.class);
            Method methodD4 = m.d(clsA2, "build", new Class[0]);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null) {
                return;
            }
            l.c(new l(clsA, clsA2, methodD, methodD2, methodD3, methodD4));
        }

        @n
        @Nullable
        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            a();
            l.a().set(true);
            return l.b();
        }

        private a() {
        }
    }

    public l(@NotNull Class<?> skuDetailsParamsClazz, @NotNull Class<?> builderClazz, @NotNull Method newBuilderMethod, @NotNull Method setTypeMethod, @NotNull Method setSkusListMethod, @NotNull Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.f98983a = skuDetailsParamsClazz;
        this.f98984b = builderClazz;
        this.f98985c = newBuilderMethod;
        this.f98986d = setTypeMethod;
        this.f98987e = setSkusListMethod;
        this.f98988f = buildMethod;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return null;
        }
        try {
            return f98976i;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l b() {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return null;
        }
        try {
            return f98975h;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(l lVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return;
        }
        try {
            f98975h = lVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
        }
    }

    @n
    @Nullable
    public static final l d() {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return null;
        }
        try {
            return f98974g.b();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
            return null;
        }
    }

    @Nullable
    public final Object e(@Nullable String str, @Nullable List<String> list) {
        Object objE;
        Object objE2;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            m mVar = m.f98989a;
            Object objE3 = m.e(this.f98983a, this.f98985c, null, new Object[0]);
            if (objE3 != null && (objE = m.e(this.f98984b, this.f98986d, objE3, str)) != null && (objE2 = m.e(this.f98984b, this.f98987e, objE, list)) != null) {
                return m.e(this.f98984b, this.f98988f, objE2, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @NotNull
    public final Class<?> f() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f98983a;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }
}
