package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.b1;
import com.facebook.appevents.f0;
import com.facebook.appevents.q;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.w;
import com.facebook.internal.x;
import com.google.firebase.remoteconfig.e0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f99018a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99019b = i.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f99020c = "app_events_if_auto_log_subs";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final f0 f99021d;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private BigDecimal f99022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private Currency f99023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Bundle f99024c;

        public a(@NotNull BigDecimal purchaseAmount, @NotNull Currency currency, @NotNull Bundle param) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            this.f99022a = purchaseAmount;
            this.f99023b = currency;
            this.f99024c = param;
        }

        @NotNull
        public final Currency a() {
            return this.f99023b;
        }

        @NotNull
        public final Bundle b() {
            return this.f99024c;
        }

        @NotNull
        public final BigDecimal c() {
            return this.f99022a;
        }

        public final void d(@NotNull Currency currency) {
            Intrinsics.checkNotNullParameter(currency, "<set-?>");
            this.f99023b = currency;
        }

        public final void e(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            this.f99024c = bundle;
        }

        public final void f(@NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
            this.f99022a = bigDecimal;
        }
    }

    static {
        g0 g0Var = g0.f99617a;
        f99021d = new f0(g0.n());
    }

    private i() {
    }

    private final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    private final a b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence(j.f99031g, jSONObject.getString("productId"));
            bundle.putCharSequence(j.f99032h, jSONObject.getString("purchaseTime"));
            bundle.putCharSequence(j.f99033i, jSONObject.getString("purchaseToken"));
            bundle.putCharSequence(j.f99037m, jSONObject.optString(e0.b.f124460u2));
            bundle.putCharSequence(j.f99035k, jSONObject2.optString("title"));
            bundle.putCharSequence(j.f99036l, jSONObject2.optString("description"));
            String strOptString = jSONObject2.optString("type");
            bundle.putCharSequence(j.f99034j, strOptString);
            if (Intrinsics.areEqual(strOptString, "subs")) {
                bundle.putCharSequence(j.f99038n, Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence(j.f99039o, jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence(j.f99040p, jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() != 0) {
                    bundle.putCharSequence(j.f99041q, jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence(j.f99042r, introductoryPriceCycles);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException unused) {
            return null;
        }
    }

    @oj.n
    public static final boolean c() {
        g0 g0Var = g0.f99617a;
        String strO = g0.o();
        b0 b0Var = b0.f99725a;
        x xVarF = b0.f(strO);
        return xVarF != null && g0.s() && xVarF.g();
    }

    @oj.n
    public static final void d() {
        g0 g0Var = g0.f99617a;
        Context contextN = g0.n();
        String strO = g0.o();
        if (g0.s() && (contextN instanceof Application)) {
            q.f99234b.b((Application) contextN, strO);
        }
    }

    @oj.n
    public static final void e(@Nullable String str, long j10) {
        g0 g0Var = g0.f99617a;
        Context contextN = g0.n();
        String strO = g0.o();
        b0 b0Var = b0.f99725a;
        x xVarN = b0.n(strO, false);
        if (xVarN != null && xVarN.a() && j10 > 0) {
            f0 f0Var = new f0(contextN);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence(j.f99030f, str);
            f0Var.i(j.f99029e, j10, bundle);
        }
    }

    @oj.n
    public static final void f(@NotNull String purchase, @NotNull String skuDetails, boolean z10) {
        a aVarA;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        if (c() && (aVarA = f99018a.a(purchase, skuDetails)) != null) {
            if (z10) {
                w wVar = w.f100131a;
                g0 g0Var = g0.f99617a;
                if (w.d(f99020c, g0.o(), false)) {
                    f99021d.o(com.facebook.appevents.iap.i.f98934a.m(skuDetails) ? com.facebook.appevents.p.f99230y : com.facebook.appevents.p.A, aVarA.c(), aVarA.a(), aVarA.b());
                    return;
                }
            }
            f99021d.p(aVarA.c(), aVarA.a(), aVarA.b());
        }
    }
}
