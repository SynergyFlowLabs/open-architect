package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.d1;
import androidx.annotation.l0;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.ua;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.n;
import com.google.firebase.installations.j;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f120604c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f4 f120605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f120606b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public static class c {

        @NonNull
        public static final String A = "screen_view";

        @NonNull
        public static final String B = "remove_from_cart";

        @NonNull
        public static final String C = "add_shipping_info";

        @NonNull
        public static final String D = "purchase";

        @NonNull
        public static final String E = "refund";

        @NonNull
        public static final String F = "select_item";

        @NonNull
        public static final String G = "select_promotion";

        @NonNull
        public static final String H = "view_cart";

        @NonNull
        public static final String I = "view_promotion";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public static final String f120615a = "ad_impression";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f120616b = "add_payment_info";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final String f120617c = "add_to_cart";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public static final String f120618d = "add_to_wishlist";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public static final String f120619e = "app_open";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public static final String f120620f = "begin_checkout";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public static final String f120621g = "campaign_details";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public static final String f120622h = "generate_lead";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public static final String f120623i = "join_group";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public static final String f120624j = "level_end";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public static final String f120625k = "level_start";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public static final String f120626l = "level_up";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NonNull
        public static final String f120627m = "login";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        public static final String f120628n = "post_score";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NonNull
        public static final String f120629o = "search";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NonNull
        public static final String f120630p = "select_content";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        public static final String f120631q = "share";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NonNull
        public static final String f120632r = "sign_up";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NonNull
        public static final String f120633s = "spend_virtual_currency";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NonNull
        public static final String f120634t = "tutorial_begin";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NonNull
        public static final String f120635u = "tutorial_complete";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public static final String f120636v = "unlock_achievement";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        public static final String f120637w = "view_item";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NonNull
        public static final String f120638x = "view_item_list";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NonNull
        public static final String f120639y = "view_search_results";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NonNull
        public static final String f120640z = "earn_virtual_currency";

        protected c() {
        }
    }

    public static class d {

        @NonNull
        public static final String A = "origin";

        @NonNull
        public static final String B = "price";

        @NonNull
        public static final String C = "quantity";

        @NonNull
        public static final String D = "score";

        @NonNull
        public static final String E = "shipping";

        @NonNull
        public static final String F = "transaction_id";

        @NonNull
        public static final String G = "search_term";

        @NonNull
        public static final String H = "success";

        @NonNull
        public static final String I = "tax";

        @NonNull
        public static final String J = "value";

        @NonNull
        public static final String K = "virtual_currency_name";

        @NonNull
        public static final String L = "campaign";

        @NonNull
        public static final String M = "source";

        @NonNull
        public static final String N = "medium";

        @NonNull
        public static final String O = "term";

        @NonNull
        public static final String P = "content";

        @NonNull
        public static final String Q = "aclid";

        @NonNull
        public static final String R = "cp1";

        @NonNull
        public static final String S = "campaign_id";

        @NonNull
        public static final String T = "source_platform";

        @NonNull
        public static final String U = "creative_format";

        @NonNull
        public static final String V = "marketing_tactic";

        @NonNull
        public static final String W = "item_brand";

        @NonNull
        public static final String X = "item_variant";

        @NonNull
        public static final String Y = "creative_name";

        @NonNull
        public static final String Z = "creative_slot";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public static final String f120641a = "achievement_id";

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        @NonNull
        public static final String f120642a0 = "affiliation";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f120643b = "ad_format";

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        @NonNull
        public static final String f120644b0 = "index";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final String f120645c = "ad_platform";

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        @NonNull
        public static final String f120646c0 = "discount";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public static final String f120647d = "ad_source";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        @NonNull
        public static final String f120648d0 = "item_category2";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public static final String f120649e = "ad_unit_name";

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        @NonNull
        public static final String f120650e0 = "item_category3";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public static final String f120651f = "character";

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        @NonNull
        public static final String f120652f0 = "item_category4";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public static final String f120653g = "travel_class";

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        @NonNull
        public static final String f120654g0 = "item_category5";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public static final String f120655h = "content_type";

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        @NonNull
        public static final String f120656h0 = "item_list_id";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public static final String f120657i = "currency";

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        @NonNull
        public static final String f120658i0 = "item_list_name";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public static final String f120659j = "coupon";

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        @NonNull
        public static final String f120660j0 = "items";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public static final String f120661k = "start_date";

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        @NonNull
        public static final String f120662k0 = "location_id";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public static final String f120663l = "end_date";

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        @NonNull
        public static final String f120664l0 = "payment_type";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NonNull
        public static final String f120665m = "extend_session";

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        @NonNull
        public static final String f120666m0 = "promotion_id";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        public static final String f120667n = "flight_number";

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        @NonNull
        public static final String f120668n0 = "promotion_name";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NonNull
        public static final String f120669o = "group_id";

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        @NonNull
        public static final String f120670o0 = "screen_class";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NonNull
        public static final String f120671p = "item_category";

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public static final String f120672p0 = "screen_name";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        public static final String f120673q = "item_id";

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public static final String f120674q0 = "shipping_tier";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NonNull
        public static final String f120675r = "item_name";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NonNull
        public static final String f120676s = "location";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NonNull
        public static final String f120677t = "level";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NonNull
        public static final String f120678u = "level_name";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public static final String f120679v = "method";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        public static final String f120680w = "number_of_nights";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NonNull
        public static final String f120681x = "number_of_passengers";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NonNull
        public static final String f120682y = "number_of_rooms";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NonNull
        public static final String f120683z = "destination";

        protected d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public static final String f120684a = "sign_up_method";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f120685b = "allow_personalized_ads";

        protected e() {
        }
    }

    public FirebaseAnalytics(f4 f4Var) {
        w.r(f4Var);
        this.f120605a = f4Var;
    }

    @NonNull
    @a1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f120604c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f120604c == null) {
                        f120604c = new FirebaseAnalytics(f4.v(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f120604c;
    }

    @Keep
    @p0
    public static ua getScionFrontendApiImplementation(Context context, @p0 Bundle bundle) {
        f4 f4VarV = f4.v(context, bundle);
        if (f4VarV == null) {
            return null;
        }
        return new h(f4VarV);
    }

    @il.d({"this.executor"})
    private final ExecutorService l() {
        FirebaseAnalytics firebaseAnalytics;
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f120606b == null) {
                    firebaseAnalytics = this;
                    firebaseAnalytics.f120606b = new com.google.firebase.analytics.e(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                } else {
                    firebaseAnalytics = this;
                }
                executorService = firebaseAnalytics.f120606b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    @NonNull
    public Task<String> a() {
        try {
            return n.d(l(), new f(this));
        } catch (RuntimeException e10) {
            this.f120605a.d(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return n.f(e10);
        }
    }

    @NonNull
    public Task<Long> b() {
        try {
            return n.d(l(), new g(this));
        } catch (RuntimeException e10) {
            this.f120605a.d(5, "Failed to schedule task for getSessionId", null, null, null);
            return n.f(e10);
        }
    }

    public void c(@NonNull @d1(max = 40, min = 1) String str, @p0 Bundle bundle) {
        this.f120605a.C(str, bundle);
    }

    public void d() {
        this.f120605a.N();
    }

    public void e(boolean z10) {
        this.f120605a.L(Boolean.valueOf(z10));
    }

    public void f(@NonNull Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f120605a.M(bundle);
    }

    public void g(@p0 Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f120605a.l(bundle);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) n.b(j.u().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(long j10) {
        this.f120605a.O(j10);
    }

    public void i(@p0 String str) {
        this.f120605a.J(str);
    }

    public void j(@NonNull @d1(max = 24, min = 1) String str, @d1(max = 36) @p0 String str2) {
        this.f120605a.F(null, str, str2, false);
    }

    final /* synthetic */ f4 k() {
        return this.f120605a;
    }

    @Keep
    @l0
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @d1(max = 36, min = 1) @p0 String str, @d1(max = 36, min = 1) @p0 String str2) {
        this.f120605a.K(zzdf.O1(activity), str, str2);
    }
}
