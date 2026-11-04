package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 {
    public static final int A = 20160327;

    @NotNull
    public static final String A0 = "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME";
    public static final int B = 20161017;

    @NotNull
    public static final String B0 = "com.facebook.platform.extra.ID_TOKEN";
    public static final int C = 20170213;

    @NotNull
    public static final String C0 = "access_token";
    public static final int D = 20170411;

    @NotNull
    public static final String D0 = "graph_domain";
    public static final int E = 20170417;

    @NotNull
    public static final String E0 = "signed request";
    public static final int F = 20171115;

    @NotNull
    public static final String F0 = "expires_seconds_since_epoch";
    public static final int G = 20210906;

    @NotNull
    public static final String G0 = "permissions";

    @NotNull
    public static final String H = "com.facebook.platform.protocol.PROTOCOL_VERSION";

    @NotNull
    public static final String H0 = "fbsdk:create_object";

    @NotNull
    public static final String I = "com.facebook.platform.protocol.PROTOCOL_ACTION";

    @NotNull
    public static final String I0 = "user_generated";

    @NotNull
    public static final String J = "com.facebook.platform.protocol.CALL_ID";

    @NotNull
    public static final String J0 = "url";

    @NotNull
    public static final String K = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";

    @NotNull
    public static final String K0 = "com.facebook.platform.status.ERROR_TYPE";

    @NotNull
    public static final String L = "com.facebook.platform.protocol.BRIDGE_ARGS";

    @NotNull
    public static final String L0 = "com.facebook.platform.status.ERROR_DESCRIPTION";

    @NotNull
    public static final String M = "com.facebook.platform.protocol.METHOD_ARGS";

    @NotNull
    public static final String M0 = "com.facebook.platform.status.ERROR_CODE";

    @NotNull
    public static final String N = "com.facebook.platform.protocol.RESULT_ARGS";

    @NotNull
    public static final String N0 = "com.facebook.platform.status.ERROR_SUBCODE";

    @NotNull
    public static final String O = "app_name";

    @NotNull
    public static final String O0 = "com.facebook.platform.status.ERROR_JSON";

    @NotNull
    public static final String P = "action_id";

    @NotNull
    public static final String P0 = "error_type";

    @NotNull
    public static final String Q = "error";

    @NotNull
    public static final String Q0 = "error_description";

    @NotNull
    public static final String R = "com.facebook.platform.extra.DID_COMPLETE";

    @NotNull
    public static final String R0 = "error_code";

    @NotNull
    public static final String S = "com.facebook.platform.extra.COMPLETION_GESTURE";

    @NotNull
    public static final String S0 = "error_subcode";

    @NotNull
    public static final String T = "didComplete";

    @NotNull
    public static final String T0 = "error_json";

    @NotNull
    public static final String U = "completionGesture";

    @NotNull
    public static final String U0 = "UnknownError";
    public static final int V = 65536;

    @NotNull
    public static final String V0 = "ProtocolError";
    public static final int W = 65537;

    @NotNull
    public static final String W0 = "UserCanceled";
    public static final int X = 65538;

    @NotNull
    public static final String X0 = "ApplicationError";
    public static final int Y = 65539;

    @NotNull
    public static final String Y0 = "NetworkError";
    public static final int Z = 65540;

    @NotNull
    public static final String Z0 = "PermissionDenied";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w0 f100148a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f100149a0 = 65541;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @NotNull
    public static final String f100150a1 = "ServiceDisabled";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100151b = -1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f100152b0 = 65542;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @NotNull
    public static final String f100153b1 = "url";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f100154c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f100155c0 = 65543;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NotNull
    public static final String f100156c1 = "action";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f100157d = "com.facebook.katana.ProxyAuth";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f100158d0 = 65544;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @NotNull
    public static final String f100159d1 = "params";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f100160e = "com.facebook.katana.platform.TokenRefreshService";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f100161e0 = 65545;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @NotNull
    public static final String f100162e1 = "is_fallback";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f100163f = "scope";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f100164f0 = 65546;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @NotNull
    public static final String f100165f1 = "only_me";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f100166g = "client_id";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f100167g0 = 65547;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @NotNull
    public static final String f100168g1 = "friends";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f100169h = "e2e";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final String f100170h0 = "com.facebook.platform.extra.PROTOCOL_VERSIONS";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @NotNull
    public static final String f100171h1 = "everyone";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f100172i = "facebook_sdk_version";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final String f100173i0 = "com.facebook.platform.action.request.FEED_DIALOG";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @NotNull
    private static final String f100174i1 = "content://";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f100175j = "com.facebook.platform.PLATFORM_ACTIVITY";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final String f100176j0 = "com.facebook.platform.action.request.MESSAGE_DIALOG";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @NotNull
    private static final String f100177j1 = ".provider.PlatformProvider";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f100178k = "com.facebook.platform.PLATFORM_SERVICE";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final String f100179k0 = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @NotNull
    private static final String f100180k1 = ".provider.PlatformProvider/versions";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100181l = 20121101;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final String f100182l0 = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @NotNull
    private static final String f100183l1 = "version";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100184m = 20130502;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public static final String f100185m0 = "com.facebook.platform.action.request.LIKE_DIALOG";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    @NotNull
    private static final List<e> f100186m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f100187n = 20130618;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final String f100188n0 = "com.facebook.platform.action.request.APPINVITES_DIALOG";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @NotNull
    private static final List<e> f100189n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f100190o = 20131024;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final String f100191o0 = "com.facebook.platform.action.request.CAMERA_EFFECT";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @NotNull
    private static final Map<String, List<e>> f100192o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f100193p = 20131107;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final String f100194p0 = "com.facebook.platform.action.request.SHARE_STORY";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f100195p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f100196q = 20140204;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final String f100197q0 = "com.facebook.platform.extra.PERMISSIONS";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @NotNull
    private static final Integer[] f100198q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f100199r = 20140313;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final String f100200r0 = "com.facebook.platform.extra.APPLICATION_ID";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f100201s = 20140324;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final String f100202s0 = "com.facebook.platform.extra.APPLICATION_NAME";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f100203t = 20140701;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final String f100204t0 = "com.facebook.platform.extra.USER_ID";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f100205u = 20141001;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final String f100206u0 = "com.facebook.platform.extra.LOGGER_REF";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f100207v = 20141028;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public static final String f100208v0 = "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f100209w = 20141107;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final String f100210w0 = "com.facebook.platform.extra.GRAPH_API_VERSION";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f100211x = 20141218;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final String f100212x0 = "com.facebook.platform.extra.NONCE";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f100213y = 20150401;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final String f100214y0 = "com.facebook.platform.extra.ACCESS_TOKEN";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f100215z = 20150702;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @NotNull
    public static final String f100216z0 = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";

    private static final class a extends e {
        @Override // com.facebook.internal.w0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.w0.e
        @NotNull
        public String d() {
            return "com.facebook.arstudio.player";
        }

        @Nullable
        public Void g() {
            return null;
        }
    }

    private static final class b extends e {
        @Override // com.facebook.internal.w0.e
        @NotNull
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.w0.e
        @NotNull
        public String d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.w0.e
        @NotNull
        public String e() {
            return z0.M;
        }
    }

    private static final class c extends e {
        private final boolean g() {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            return com.facebook.g0.n().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.w0.e
        @NotNull
        public String c() {
            return w0.f100157d;
        }

        @Override // com.facebook.internal.w0.e
        @NotNull
        public String d() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.w0.e
        public void f() {
            if (g()) {
                w0.c();
            }
        }
    }

    private static final class d extends e {
        @Override // com.facebook.internal.w0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.w0.e
        @NotNull
        public String d() {
            return "com.facebook.orca";
        }

        @Nullable
        public Void g() {
            return null;
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private TreeSet<Integer> f100217a;

        /* JADX WARN: Code duplicated, block: B:15:0x0024 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:5:0x0005, B:10:0x0018, B:16:0x002e, B:18:0x0032, B:20:0x0039, B:9:0x000f, B:15:0x0024), top: B:27:0x0005 }] */
        public final synchronized void a(boolean z10) {
            if (z10) {
                this.f100217a = w0.b(w0.f100148a, this);
            } else {
                try {
                    TreeSet<Integer> treeSet = this.f100217a;
                    if (treeSet == null) {
                        this.f100217a = w0.b(w0.f100148a, this);
                    } else {
                        if (!Intrinsics.areEqual(treeSet == null ? null : Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                            this.f100217a = w0.b(w0.f100148a, this);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            TreeSet<Integer> treeSet2 = this.f100217a;
            if (treeSet2 == null || treeSet2.isEmpty()) {
                f();
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @Nullable
        public final TreeSet<Integer> b() {
            TreeSet<Integer> treeSet = this.f100217a;
            if (treeSet == null) {
                a(false);
            } else {
                if (!Intrinsics.areEqual(treeSet == null ? null : Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    a(false);
                }
            }
            return this.f100217a;
        }

        @Nullable
        public abstract String c();

        @NotNull
        public abstract String d();

        @NotNull
        public String e() {
            return z0.O;
        }

        public void f() {
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f100218c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private e f100219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f100220b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            @NotNull
            public final f a(@Nullable e eVar, int i10) {
                f fVar = new f(null);
                fVar.f100219a = eVar;
                fVar.f100220b = i10;
                return fVar;
            }

            @oj.n
            @NotNull
            public final f b() {
                f fVar = new f(null);
                fVar.f100220b = -1;
                return fVar;
            }

            private a() {
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public static final f c(@Nullable e eVar, int i10) {
            return f100218c.a(eVar, i10);
        }

        @oj.n
        @NotNull
        public static final f d() {
            return f100218c.b();
        }

        @Nullable
        public final e e() {
            return this.f100219a;
        }

        public final int f() {
            return this.f100220b;
        }

        private f() {
        }
    }

    private static final class g extends e {
        @Override // com.facebook.internal.w0.e
        @NotNull
        public String c() {
            return w0.f100157d;
        }

        @Override // com.facebook.internal.w0.e
        @NotNull
        public String d() {
            return com.facebook.appevents.ondeviceprocessing.e.f99170e;
        }
    }

    static {
        w0 w0Var = new w0();
        f100148a = w0Var;
        f100154c = w0.class.getName();
        f100186m1 = w0Var.f();
        f100189n1 = w0Var.e();
        f100192o1 = w0Var.d();
        f100195p1 = new AtomicBoolean(false);
        f100198q1 = new Integer[]{Integer.valueOf(G), Integer.valueOf(F), Integer.valueOf(E), Integer.valueOf(D), Integer.valueOf(C), Integer.valueOf(B), Integer.valueOf(A), Integer.valueOf(f100215z), Integer.valueOf(f100213y), Integer.valueOf(f100211x), Integer.valueOf(f100209w), Integer.valueOf(f100207v), Integer.valueOf(f100205u), Integer.valueOf(f100203t), Integer.valueOf(f100201s), Integer.valueOf(f100199r), Integer.valueOf(f100196q), Integer.valueOf(f100193p), Integer.valueOf(f100190o), Integer.valueOf(f100187n), Integer.valueOf(f100184m), Integer.valueOf(f100181l)};
    }

    private w0() {
    }

    @oj.n
    public static final int A(@NotNull Intent intent) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra(H, 0);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return 0;
        }
    }

    @oj.n
    @Nullable
    public static final Bundle B(@NotNull Intent resultIntent) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            int iA = A(resultIntent);
            Bundle extras = resultIntent.getExtras();
            if (D(iA) && extras != null) {
                return extras.getBundle(N);
            }
            return extras;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    public static final boolean C(@NotNull Intent resultIntent) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            Bundle bundleR = r(resultIntent);
            Boolean boolValueOf = bundleR == null ? null : Boolean.valueOf(bundleR.containsKey("error"));
            return boolValueOf == null ? resultIntent.hasExtra(K0) : boolValueOf.booleanValue();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return false;
        }
    }

    @oj.n
    public static final boolean D(int i10) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return false;
        }
        try {
            return ArraysKt.contains(f100198q1, Integer.valueOf(i10)) && i10 >= 20140701;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return false;
        }
    }

    @oj.n
    public static final void E(@NotNull Intent intent, @Nullable String str, @Nullable String str2, int i10, @Nullable Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            String strO = com.facebook.g0.o();
            String strP = com.facebook.g0.p();
            intent.putExtra(H, i10).putExtra(I, str2).putExtra(f100200r0, strO);
            if (!D(i10)) {
                intent.putExtra(J, str);
                e1 e1Var = e1.f99794a;
                if (!e1.Z(strP)) {
                    intent.putExtra(f100202s0, strP);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            e1 e1Var2 = e1.f99794a;
            e1.o0(bundle2, "app_name", strP);
            intent.putExtra(L, bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra(M, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
        }
    }

    @oj.n
    public static final void F() {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return;
        }
        try {
            if (f100195p1.compareAndSet(false, true)) {
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.internal.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        w0.G();
                    }
                });
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G() {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return;
        }
        try {
            try {
                Iterator<e> it = f100186m1.iterator();
                while (it.hasNext()) {
                    it.next().a(true);
                }
                f100195p1.set(false);
            } catch (Throwable th2) {
                f100195p1.set(false);
                throw th2;
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, w0.class);
        }
    }

    @oj.n
    @Nullable
    public static final Intent H(@NotNull Context context, @Nullable Intent intent, @Nullable e eVar) {
        ResolveInfo resolveInfoResolveActivity;
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent != null && (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) != null) {
                q qVar = q.f100051a;
                String str = resolveInfoResolveActivity.activityInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
                if (q.a(context, str)) {
                    return intent;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final Intent I(@NotNull Context context, @Nullable Intent intent, @Nullable e eVar) {
        ResolveInfo resolveInfoResolveService;
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            q qVar = q.f100051a;
            String str = resolveInfoResolveService.serviceInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
            if (q.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(w0 w0Var, e eVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            return w0Var.q(eVar);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            return f100154c;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    private final Map<String, List<e>> d() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<e> list = f100186m1;
            map.put(f100179k0, list);
            map.put(f100173i0, list);
            map.put(f100185m0, list);
            map.put(f100188n0, list);
            map.put(f100176j0, arrayList);
            map.put(f100182l0, arrayList);
            map.put(f100191o0, f100189n1);
            map.put(f100194p0, list);
            return map;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final List<e> e() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new a());
            arrayListArrayListOf.addAll(f());
            return arrayListArrayListOf;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final List<e> f() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new c(), new g());
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final Uri g(e eVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse(f100174i1 + eVar.d() + f100180k1);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @oj.n
    public static final int h(@Nullable TreeSet<Integer> treeSet, int i10, @NotNull int[] versionSpec) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> itDescendingIterator = treeSet.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer fbAppVersion = itDescendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                iMax = Math.max(iMax, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 != 0) {
                        break;
                    }
                    return Math.min(iMax, i10);
                }
            }
            return -1;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return 0;
        }
    }

    @oj.n
    @Nullable
    public static final Bundle i(@Nullable com.facebook.u uVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class) || uVar == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", uVar.toString());
            if (!(uVar instanceof com.facebook.w)) {
                return bundle;
            }
            bundle.putString(P0, W0);
            return bundle;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final Intent j(@NotNull Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean z10, boolean z11, @NotNull com.facebook.login.e defaultAudience, @NotNull String clientState, @NotNull String authType, @Nullable String str, boolean z12, boolean z13, boolean z14) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            b bVar = new b();
            return H(context, f100148a.k(bVar, applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, false, str, z12, com.facebook.login.d0.INSTAGRAM, z13, z14, "", null, null), bVar);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    private final Intent k(e eVar, String str, Collection<String> collection, String str2, boolean z10, com.facebook.login.e eVar2, String str3, String str4, boolean z11, String str5, boolean z12, com.facebook.login.d0 d0Var, boolean z13, boolean z14, String str6, String str7, String str8) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            String strC = eVar.c();
            if (strC == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(eVar.d(), strC).putExtra("client_id", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            intentPutExtra.putExtra(f100172i, com.facebook.g0.I());
            e1 e1Var = e1.f99794a;
            if (!e1.a0(collection)) {
                intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!e1.Z(str2)) {
                intentPutExtra.putExtra("e2e", str2);
            }
            intentPutExtra.putExtra("state", str3);
            intentPutExtra.putExtra(z0.f100293x, eVar.e());
            intentPutExtra.putExtra("nonce", str6);
            intentPutExtra.putExtra(z0.f100294y, z0.P);
            if (z10) {
                intentPutExtra.putExtra("default_audience", eVar2.l());
            }
            intentPutExtra.putExtra(z0.f100289t, com.facebook.g0.B());
            intentPutExtra.putExtra(z0.f100277h, str4);
            if (z11) {
                intentPutExtra.putExtra(z0.E, true);
            }
            intentPutExtra.putExtra(z0.G, str5);
            intentPutExtra.putExtra(z0.H, z12);
            if (z13) {
                intentPutExtra.putExtra(z0.J, d0Var.toString());
            }
            if (z14) {
                intentPutExtra.putExtra(z0.K, true);
            }
            return intentPutExtra;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final Intent l(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable f fVar, @Nullable Bundle bundle) {
        e eVarE;
        Intent intentH;
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (fVar != null && (eVarE = fVar.e()) != null && (intentH = H(context, new Intent().setAction(f100175j).setPackage(eVarE.d()).addCategory("android.intent.category.DEFAULT"), eVarE)) != null) {
                E(intentH, str, str2, fVar.f(), bundle);
                return intentH;
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final Intent m(@NotNull Context context) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            for (e eVar : f100186m1) {
                Intent intentI = I(context, new Intent(f100178k).setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (intentI != null) {
                    return intentI;
                }
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final Intent n(@NotNull Intent requestIntent, @Nullable Bundle bundle, @Nullable com.facebook.u uVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
            UUID uuidS = s(requestIntent);
            if (uuidS == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra(H, A(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", uuidS.toString());
            if (uVar != null) {
                bundle2.putBundle("error", i(uVar));
            }
            intent.putExtra(L, bundle2);
            if (bundle != null) {
                intent.putExtra(N, bundle);
            }
            return intent;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @NotNull
    public static final List<Intent> o(@Nullable Context context, @NotNull String str, @NotNull Collection<String> collection, @NotNull String str2, boolean z10, boolean z11, @NotNull com.facebook.login.e eVar, @NotNull String str3, @NotNull String str4, boolean z12, @Nullable String str5, boolean z13, boolean z14, boolean z15, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        List<Intent> list;
        List<Intent> list2 = null;
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            String applicationId = str;
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Collection<String> permissions = collection;
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            String e2e = str2;
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            com.facebook.login.e defaultAudience = eVar;
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            String clientState = str3;
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            String authType = str4;
            Intrinsics.checkNotNullParameter(authType, "authType");
            List<e> list3 = f100186m1;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                list = list2;
                try {
                    Intent intentK = f100148a.k((e) it.next(), applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, z12, str5, z13, com.facebook.login.d0.FACEBOOK, z14, z15, str6, str7, str8);
                    if (intentK != null) {
                        arrayList2.add(intentK);
                    }
                    applicationId = str;
                    permissions = collection;
                    e2e = str2;
                    defaultAudience = eVar;
                    clientState = str3;
                    authType = str4;
                    arrayList = arrayList2;
                    list2 = list;
                } catch (Throwable th2) {
                    th = th2;
                    com.facebook.internal.instrument.crashshield.b.c(th, w0.class);
                    return list;
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            list = list2;
        }
    }

    public static /* synthetic */ List p(Context context, String str, Collection collection, String str2, boolean z10, boolean z11, com.facebook.login.e eVar, String str3, String str4, boolean z12, String str5, boolean z13, boolean z14, boolean z15, String str6, String str7, String str8, int i10, Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            return o(context, str, collection, str2, z10, z11, eVar, str3, str4, z12, str5, z13, z14, z15, str6, str7, (i10 & 65536) != 0 ? net.openid.appauth.f.f332949o : str8);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    private final TreeSet<Integer> q(e eVar) {
        Throwable th2;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            ContentResolver contentResolver = com.facebook.g0.n().getContentResolver();
            String[] strArr = {"version"};
            Uri uriG = g(eVar);
            try {
                try {
                    providerInfoResolveContentProvider = com.facebook.g0.n().getPackageManager().resolveContentProvider(Intrinsics.stringPlus(eVar.d(), f100177j1), 0);
                } catch (RuntimeException unused) {
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = contentResolver.query(uriG, strArr, null, null, null);
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th3) {
                                cursor = cursorQuery;
                                th2 = th3;
                                if (cursor == null) {
                                    throw th2;
                                }
                                cursor.close();
                                throw th2;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th4) {
                th2 = th4;
                cursor = null;
            }
        } catch (Throwable th5) {
            com.facebook.internal.instrument.crashshield.b.c(th5, this);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final Bundle r(@NotNull Intent intent) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (D(A(intent))) {
                return intent.getBundleExtra(L);
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final UUID s(@Nullable Intent intent) {
        String stringExtra;
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class) || intent == null) {
            return null;
        }
        try {
            if (D(A(intent))) {
                Bundle bundleExtra = intent.getBundleExtra(L);
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra(J);
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final Bundle t(@NotNull Intent resultIntent) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            if (!C(resultIntent)) {
                return null;
            }
            Bundle bundleR = r(resultIntent);
            return bundleR != null ? bundleR.getBundle("error") : resultIntent.getExtras();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final com.facebook.u u(@Nullable Bundle bundle) {
        int i10 = 5 >> 0;
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString(P0);
            if (string == null) {
                string = bundle.getString(K0);
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString(L0);
            }
            return (string == null || !StringsKt.N1(string, W0, true)) ? new com.facebook.u(string2) : new com.facebook.w(string2);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    @oj.n
    @NotNull
    public static final f v(@NotNull String action, @NotNull int[] versionSpec) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            List<e> listEmptyList = f100192o1.get(action);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return f100148a.w(listEmptyList, versionSpec);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }

    private final f w(List<? extends e> list, int[] iArr) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            F();
            if (list == null) {
                return f.f100218c.b();
            }
            for (e eVar : list) {
                int iH = h(eVar.b(), y(), iArr);
                if (iH != -1) {
                    return f.f100218c.a(eVar, iH);
                }
            }
            return f.f100218c.b();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @oj.n
    public static final int x(int i10) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return 0;
        }
        try {
            return f100148a.w(f100186m1, new int[]{i10}).f();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return 0;
        }
    }

    @oj.n
    public static final int y() {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return 0;
        }
        try {
            return f100198q1[0].intValue();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return 0;
        }
    }

    @oj.n
    @Nullable
    public static final Bundle z(@NotNull Intent intent) {
        if (com.facebook.internal.instrument.crashshield.b.e(w0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return !D(A(intent)) ? intent.getExtras() : intent.getBundleExtra(M);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, w0.class);
            return null;
        }
    }
}
