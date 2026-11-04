package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        @Deprecated
        public static final int R = -3;
        public static final int S = -2;
        public static final int T = -1;
        public static final int U = 0;
        public static final int V = 1;
        public static final int W = 2;
        public static final int X = 3;
        public static final int Y = 4;
        public static final int Z = 5;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public static final int f89061a0 = 6;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public static final int f89062b0 = 7;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public static final int f89063c0 = 8;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final int f89064d0 = 12;
    }

    @androidx.annotation.d
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile String f89065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile y f89066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f89067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile d0 f89068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile y2 f89069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private volatile r2 f89070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile j1 f89071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile j0 f89072h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private volatile ExecutorService f89073i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile boolean f89074j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private volatile boolean f89075k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private volatile boolean f89076l;

        /* synthetic */ b(Context context, a4 a4Var) {
            this.f89067c = context;
        }

        private final boolean h() {
            try {
                return this.f89067c.getPackageManager().getApplicationInfo(this.f89067c.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }

        @NonNull
        public h a() {
            if (this.f89067c == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f89068d == null) {
                if (this.f89072h != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (!this.f89074j && !this.f89075k) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.f89067c;
                return h() ? new m2(null, context, null, null) : new i(null, context, null, null);
            }
            if (this.f89066b == null || !this.f89066b.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f89068d == null) {
                y yVar = this.f89066b;
                Context context2 = this.f89067c;
                if (!h()) {
                    return new i(null, yVar, context2, null, null, null);
                }
                int i10 = 4 >> 0;
                return new m2(null, yVar, context2, null, null, null);
            }
            if (this.f89072h != null) {
                y yVar2 = this.f89066b;
                Context context3 = this.f89067c;
                d0 d0Var = this.f89068d;
                j0 j0Var = this.f89072h;
                return h() ? new m2((String) null, yVar2, context3, d0Var, j0Var, (r2) null, (ExecutorService) null) : new i((String) null, yVar2, context3, d0Var, j0Var, (r2) null, (ExecutorService) null);
            }
            y yVar3 = this.f89066b;
            Context context4 = this.f89067c;
            d0 d0Var2 = this.f89068d;
            if (!h()) {
                return new i((String) null, yVar3, context4, d0Var2, (j1) null, (r2) null, (ExecutorService) null);
            }
            int i11 = 0 >> 0;
            return new m2((String) null, yVar3, context4, d0Var2, (j1) null, (r2) null, (ExecutorService) null);
        }

        @NonNull
        @r3
        public b b() {
            this.f89074j = true;
            return this;
        }

        @NonNull
        @s3
        public b c() {
            this.f89075k = true;
            return this;
        }

        @NonNull
        @Deprecated
        public b d() {
            y.a aVarC = y.c();
            aVarC.b();
            e(aVarC.a());
            return this;
        }

        @NonNull
        @v3
        public b e(@NonNull y yVar) {
            this.f89066b = yVar;
            return this;
        }

        @NonNull
        @w3
        public b f(@NonNull j0 j0Var) {
            this.f89072h = j0Var;
            return this;
        }

        @NonNull
        public b g(@NonNull d0 d0Var) {
            this.f89068d = d0Var;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public static final int f89077e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public static final int f89078f0 = 1;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public static final int f89079g0 = 2;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public static final int f89080h0 = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        @NonNull
        public static final String f89081i0 = "subscriptions";

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        @NonNull
        public static final String f89082j0 = "subscriptionsUpdate";

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        @NonNull
        public static final String f89083k0 = "priceChangeConfirmation";

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        @NonNull
        public static final String f89084l0 = "bbb";

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        @NonNull
        public static final String f89085m0 = "fff";

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        @NonNull
        @t3
        public static final String f89086n0 = "ggg";

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        @NonNull
        @r3
        public static final String f89087o0 = "jjj";

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        @s3
        public static final String f89088p0 = "kkk";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public static final String f89089q0 = "inapp";

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NonNull
        public static final String f89090r0 = "subs";
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface f {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NonNull
        public static final String f89091s0 = "inapp";

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @NonNull
        public static final String f89092t0 = "subs";
    }

    @NonNull
    @androidx.annotation.d
    public static b m(@NonNull Context context) {
        return new b(context, null);
    }

    @androidx.annotation.d
    public abstract void a(@NonNull com.android.billingclient.api.b bVar, @NonNull com.android.billingclient.api.c cVar);

    @androidx.annotation.d
    public abstract void b(@NonNull o oVar, @NonNull p pVar);

    @androidx.annotation.d
    @r3
    @g6.a
    public abstract void c(@NonNull g gVar);

    @androidx.annotation.d
    @s3
    public abstract void d(@NonNull t tVar);

    @androidx.annotation.d
    public abstract void e();

    @androidx.annotation.d
    @t3
    public abstract void f(@NonNull u uVar, @NonNull l lVar);

    @androidx.annotation.d
    public abstract int g();

    @androidx.annotation.d
    @r3
    @g6.a
    public abstract void h(@NonNull com.android.billingclient.api.d dVar);

    @androidx.annotation.d
    @s3
    public abstract void i(@NonNull q qVar);

    @NonNull
    @androidx.annotation.d
    public abstract n j(@NonNull String str);

    @androidx.annotation.d
    public abstract boolean k();

    @NonNull
    @androidx.annotation.k1
    public abstract n l(@NonNull Activity activity, @NonNull m mVar);

    @androidx.annotation.d
    public abstract void n(@NonNull e0 e0Var, @NonNull a0 a0Var);

    @androidx.annotation.d
    @Deprecated
    public abstract void o(@NonNull f0 f0Var, @NonNull b0 b0Var);

    @androidx.annotation.d
    @Deprecated
    public abstract void p(@NonNull String str, @NonNull b0 b0Var);

    @androidx.annotation.d
    public abstract void q(@NonNull g0 g0Var, @NonNull c0 c0Var);

    @androidx.annotation.d
    @Deprecated
    public abstract void r(@NonNull String str, @NonNull c0 c0Var);

    @androidx.annotation.d
    @Deprecated
    public abstract void s(@NonNull h0 h0Var, @NonNull i0 i0Var);

    @NonNull
    @androidx.annotation.k1
    @r3
    public abstract n t(@NonNull Activity activity, @NonNull com.android.billingclient.api.e eVar);

    @NonNull
    @androidx.annotation.k1
    @s3
    public abstract n u(@NonNull Activity activity, @NonNull r rVar);

    @NonNull
    @androidx.annotation.k1
    public abstract n v(@NonNull Activity activity, @NonNull v vVar, @NonNull w wVar);

    @androidx.annotation.d
    public abstract void w(@NonNull j jVar);
}
