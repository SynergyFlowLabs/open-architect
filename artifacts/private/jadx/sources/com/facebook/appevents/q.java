package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.b1;
import com.facebook.AccessToken;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f99234b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f99235c = q.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f99236d = "com.facebook.sdk.APP_EVENTS_FLUSHED";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f99237e = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f99238f = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f99239a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public final void a(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            t.f99255c.f(application, null);
        }

        @oj.n
        public final void b(@NotNull Application application, @Nullable String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            t.f99255c.f(application, str);
        }

        @oj.n
        public final void c(@NotNull WebView webView, @Nullable Context context) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            t.f99255c.g(webView, context);
        }

        @oj.n
        public final void d() {
            l0 l0Var = l0.f99122a;
            l0.d();
        }

        @oj.n
        public final void e() {
            com.facebook.appevents.d dVar = com.facebook.appevents.d.f98836a;
            com.facebook.appevents.d.g(null);
        }

        @oj.n
        @NotNull
        public final String f(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return t.f99255c.k(context);
        }

        @oj.n
        @Nullable
        public final b g() {
            return t.f99255c.l();
        }

        @oj.n
        @NotNull
        public final String h() {
            l0 l0Var = l0.f99122a;
            return l0.h();
        }

        @oj.n
        @Nullable
        public final String i() {
            com.facebook.appevents.d dVar = com.facebook.appevents.d.f98836a;
            return com.facebook.appevents.d.c();
        }

        @oj.n
        public final void j(@NotNull Context context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            t.f99255c.o(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @oj.n
        @NotNull
        public final q k(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new q(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @oj.n
        @NotNull
        public final q l(@NotNull Context context, @Nullable AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new q(context, null, accessToken, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @oj.n
        @NotNull
        public final q m(@NotNull Context context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new q(context, str, null, 0 == true ? 1 : 0);
        }

        @oj.n
        @NotNull
        public final q n(@NotNull Context context, @Nullable String str, @Nullable AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new q(context, str, accessToken, null);
        }

        @oj.n
        public final void o() {
            t.f99255c.u();
        }

        @oj.n
        public final void p(@NotNull b flushBehavior) {
            Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            t.f99255c.v(flushBehavior);
        }

        @oj.n
        @b1({b1.a.LIBRARY_GROUP})
        public final void q(@Nullable String str) {
            t.f99255c.w(str);
        }

        @oj.n
        public final void r(@Nullable String str) {
            t.f99255c.x(str);
        }

        @oj.n
        public final void s(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
            l0 l0Var = l0.f99122a;
            l0.o(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        @oj.n
        public final void t(@Nullable String str) {
            com.facebook.appevents.d dVar = com.facebook.appevents.d.f98836a;
            com.facebook.appevents.d.g(str);
        }

        private a() {
        }
    }

    public enum b {
        AUTO,
        EXPLICIT_ONLY;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
        }
    }

    public enum c {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
        }
    }

    public enum d {
        NEW,
        REFURBISHED,
        USED;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            return (d[]) Arrays.copyOf(dVarArrValuesCustom, dVarArrValuesCustom.length);
        }
    }

    public /* synthetic */ q(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    @oj.n
    public static final void A() {
        f99234b.o();
    }

    @oj.n
    public static final void B(@NotNull b bVar) {
        f99234b.p(bVar);
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP})
    public static final void C(@Nullable String str) {
        f99234b.q(str);
    }

    @oj.n
    public static final void D(@Nullable String str) {
        f99234b.r(str);
    }

    @oj.n
    public static final void E(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        f99234b.s(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @oj.n
    public static final void F(@Nullable String str) {
        f99234b.t(str);
    }

    @oj.n
    public static final void a(@NotNull Application application) {
        f99234b.a(application);
    }

    @oj.n
    public static final void b(@NotNull Application application, @Nullable String str) {
        f99234b.b(application, str);
    }

    @oj.n
    public static final void c(@NotNull WebView webView, @Nullable Context context) {
        f99234b.c(webView, context);
    }

    @oj.n
    public static final void d() {
        f99234b.d();
    }

    @oj.n
    public static final void e() {
        f99234b.e();
    }

    @oj.n
    @NotNull
    public static final String g(@NotNull Context context) {
        return f99234b.f(context);
    }

    @oj.n
    @Nullable
    public static final b i() {
        return f99234b.g();
    }

    @oj.n
    @NotNull
    public static final String j() {
        return f99234b.h();
    }

    @oj.n
    @Nullable
    public static final String k() {
        return f99234b.i();
    }

    @oj.n
    public static final void l(@NotNull Context context, @Nullable String str) {
        f99234b.j(context, str);
    }

    @oj.n
    @NotNull
    public static final q w(@NotNull Context context) {
        return f99234b.k(context);
    }

    @oj.n
    @NotNull
    public static final q x(@NotNull Context context, @Nullable AccessToken accessToken) {
        return f99234b.l(context, accessToken);
    }

    @oj.n
    @NotNull
    public static final q y(@NotNull Context context, @Nullable String str) {
        return f99234b.m(context, str);
    }

    @oj.n
    @NotNull
    public static final q z(@NotNull Context context, @Nullable String str, @Nullable AccessToken accessToken) {
        return f99234b.n(context, str, accessToken);
    }

    public final void f() {
        this.f99239a.o();
    }

    @NotNull
    public final String h() {
        return this.f99239a.s();
    }

    public final boolean m(@NotNull AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return this.f99239a.x(accessToken);
    }

    public final void n(@Nullable String str) {
        this.f99239a.y(str);
    }

    public final void o(@Nullable String str, double d10) {
        this.f99239a.z(str, d10);
    }

    public final void p(@Nullable String str, double d10, @Nullable Bundle bundle) {
        this.f99239a.A(str, d10, bundle);
    }

    public final void q(@Nullable String str, @Nullable Bundle bundle) {
        this.f99239a.B(str, bundle);
    }

    public final void r(@Nullable String str, @Nullable c cVar, @Nullable d dVar, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Bundle bundle) {
        this.f99239a.H(str, cVar, dVar, str2, str3, str4, str5, bigDecimal, currency, str6, str7, str8, bundle);
    }

    public final void s(@Nullable BigDecimal bigDecimal, @Nullable Currency currency) {
        this.f99239a.I(bigDecimal, currency);
    }

    public final void t(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        this.f99239a.J(bigDecimal, currency, bundle);
    }

    public final void u(@NotNull Bundle payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f99239a.N(payload, null);
    }

    public final void v(@NotNull Bundle payload, @Nullable String str) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f99239a.N(payload, str);
    }

    private q(Context context, String str, AccessToken accessToken) {
        this.f99239a = new t(context, str, accessToken);
    }
}
