package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f99550f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f99551g = "AccessTokenManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f99552h = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f99553i = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f99554j = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f99555k = "com.facebook.AccessTokenManager.SharedPreferences";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f99556l = 86400;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f99557m = 3600;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f99558n = "me/permissions";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private static f f99559o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.localbroadcastmanager.content.a f99560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.facebook.a f99561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private AccessToken f99562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f99563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Date f99564e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest c(AccessToken accessToken, GraphRequest.b bVar) {
            e eVarF = f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVarF.a());
            bundle.putString("client_id", accessToken.i());
            bundle.putString(GraphRequest.f98513a0, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestH = GraphRequest.f98518n.H(accessToken, eVarF.b(), bVar);
            graphRequestH.r0(bundle);
            graphRequestH.q0(r0.GET);
            return graphRequestH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest d(AccessToken accessToken, GraphRequest.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.f98513a0, "permission,status");
            GraphRequest graphRequestH = GraphRequest.f98518n.H(accessToken, f.f99558n, bVar);
            graphRequestH.r0(bundle);
            graphRequestH.q0(r0.GET);
            return graphRequestH;
        }

        private final e f(AccessToken accessToken) {
            String strO = accessToken.o();
            if (strO == null) {
                strO = AccessToken.f98376v;
            }
            return Intrinsics.areEqual(strO, g0.O) ? new c() : new b();
        }

        @oj.n
        @NotNull
        public final f e() {
            f fVar;
            f fVar2 = f.f99559o;
            if (fVar2 != null) {
                return fVar2;
            }
            synchronized (this) {
                try {
                    fVar = f.f99559o;
                    if (fVar == null) {
                        g0 g0Var = g0.f99617a;
                        androidx.localbroadcastmanager.content.a aVarB = androidx.localbroadcastmanager.content.a.b(g0.n());
                        Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance(applicationContext)");
                        f fVar3 = new f(aVarB, new com.facebook.a());
                        a aVar = f.f99550f;
                        f.f99559o = fVar3;
                        fVar = fVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fVar;
        }

        private a() {
        }
    }

    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f99565a = "oauth/access_token";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f99566b = "fb_extend_sso_token";

        @Override // com.facebook.f.e
        @NotNull
        public String a() {
            return this.f99566b;
        }

        @Override // com.facebook.f.e
        @NotNull
        public String b() {
            return this.f99565a;
        }
    }

    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f99567a = "refresh_access_token";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f99568b = "ig_refresh_token";

        @Override // com.facebook.f.e
        @NotNull
        public String a() {
            return this.f99568b;
        }

        @Override // com.facebook.f.e
        @NotNull
        public String b() {
            return this.f99567a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f99569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f99570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f99571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Long f99572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private String f99573e;

        @Nullable
        public final String a() {
            return this.f99569a;
        }

        @Nullable
        public final Long b() {
            return this.f99572d;
        }

        public final int c() {
            return this.f99570b;
        }

        public final int d() {
            return this.f99571c;
        }

        @Nullable
        public final String e() {
            return this.f99573e;
        }

        public final void f(@Nullable String str) {
            this.f99569a = str;
        }

        public final void g(@Nullable Long l10) {
            this.f99572d = l10;
        }

        public final void h(int i10) {
            this.f99570b = i10;
        }

        public final void i(int i10) {
            this.f99571c = i10;
        }

        public final void j(@Nullable String str) {
            this.f99573e = str;
        }
    }

    public interface e {
        @NotNull
        String a();

        @NotNull
        String b();
    }

    public f(@NotNull androidx.localbroadcastmanager.content.a localBroadcastManager, @NotNull com.facebook.a accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.f99560a = localBroadcastManager;
        this.f99561b = accessTokenCache;
        this.f99563d = new AtomicBoolean(false);
        this.f99564e = new Date(0L);
    }

    @oj.n
    @NotNull
    public static final f j() {
        return f99550f.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(f this$0, AccessToken.b bVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n(bVar);
    }

    private final void n(final AccessToken.b bVar) {
        final AccessToken accessTokenI = i();
        if (accessTokenI == null) {
            if (bVar != null) {
                bVar.a(new u("No current access token to refresh"));
            }
        } else {
            if (this.f99563d.compareAndSet(false, true)) {
                this.f99564e = new Date();
                final HashSet hashSet = new HashSet();
                final HashSet hashSet2 = new HashSet();
                final HashSet hashSet3 = new HashSet();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final d dVar = new d();
                a aVar = f99550f;
                p0 p0Var = new p0(aVar.d(accessTokenI, new GraphRequest.b() { // from class: com.facebook.b
                    @Override // com.facebook.GraphRequest.b
                    public final void a(q0 q0Var) {
                        f.o(atomicBoolean, hashSet, hashSet2, hashSet3, q0Var);
                    }
                }), aVar.c(accessTokenI, new GraphRequest.b() { // from class: com.facebook.c
                    @Override // com.facebook.GraphRequest.b
                    public final void a(q0 q0Var) {
                        f.p(dVar, q0Var);
                    }
                }));
                p0Var.i(new p0.a() { // from class: com.facebook.d
                    @Override // com.facebook.p0.a
                    public final void a(p0 p0Var2) throws Throwable {
                        f.q(dVar, accessTokenI, bVar, atomicBoolean, hashSet, hashSet2, hashSet3, this, p0Var2);
                    }
                });
                p0Var.n();
                return;
            }
            if (bVar != null) {
                bVar.a(new u("Refresh already in progress"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    public static final void o(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, q0 response) {
        JSONArray jSONArrayOptJSONArray;
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectK = response.k();
        if (jSONObjectK != null && (jSONArrayOptJSONArray = jSONObjectK.optJSONArray("data")) != null) {
            permissionsCallSucceeded.set(true);
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("permission");
                        String status = jSONObjectOptJSONObject.optString("status");
                        com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                        if (!com.facebook.internal.e1.Z(strOptString) && !com.facebook.internal.e1.Z(status)) {
                            Intrinsics.checkNotNullExpressionValue(status, "status");
                            Locale US = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US, "US");
                            String status2 = status.toLowerCase(US);
                            Intrinsics.checkNotNullExpressionValue(status2, "(this as java.lang.String).toLowerCase(locale)");
                            Intrinsics.checkNotNullExpressionValue(status2, "status");
                            int iHashCode = status2.hashCode();
                            if (iHashCode != -1309235419) {
                                if (iHashCode != 280295099) {
                                    if (iHashCode == 568196142 && status2.equals("declined")) {
                                        declinedPermissions.add(strOptString);
                                    } else {
                                        Intrinsics.stringPlus("Unexpected status: ", status2);
                                    }
                                } else if (status2.equals("granted")) {
                                    permissions.add(strOptString);
                                } else {
                                    Intrinsics.stringPlus("Unexpected status: ", status2);
                                }
                            } else if (status2.equals("expired")) {
                                expiredPermissions.add(strOptString);
                            } else {
                                Intrinsics.stringPlus("Unexpected status: ", status2);
                            }
                        }
                    }
                    if (i11 >= length) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(d refreshResult, q0 response) {
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectK = response.k();
        if (jSONObjectK == null) {
            return;
        }
        refreshResult.f(jSONObjectK.optString("access_token"));
        refreshResult.h(jSONObjectK.optInt("expires_at"));
        refreshResult.i(jSONObjectK.optInt(AccessToken.f98369n));
        refreshResult.g(Long.valueOf(jSONObjectK.optLong(AccessToken.f98374s)));
        refreshResult.j(jSONObjectK.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(d refreshResult, AccessToken accessToken, AccessToken.b bVar, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set set, f this$0, p0 it) throws Throwable {
        AccessToken accessToken2;
        a aVar;
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Set expiredPermissions = set;
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String strA = refreshResult.a();
        int iC = refreshResult.c();
        Long lB = refreshResult.b();
        String strE = refreshResult.e();
        try {
            a aVar2 = f99550f;
            if (aVar2.e().i() != null) {
                AccessToken accessTokenI = aVar2.e().i();
                if ((accessTokenI == null ? null : accessTokenI.u()) == accessToken.u()) {
                    if (!permissionsCallSucceeded.get() && strA == null && iC == 0) {
                        if (bVar != null) {
                            bVar.a(new u("Failed to refresh access token"));
                        }
                        this$0.f99563d.set(false);
                        return;
                    }
                    Date dateN = accessToken.n();
                    if (refreshResult.c() != 0) {
                        aVar = aVar2;
                        dateN = new Date(((long) refreshResult.c()) * 1000);
                    } else {
                        aVar = aVar2;
                        if (refreshResult.d() != 0) {
                            dateN = new Date((((long) refreshResult.d()) * 1000) + new Date().getTime());
                        }
                    }
                    Date date = dateN;
                    if (strA == null) {
                        strA = accessToken.t();
                    }
                    String str = strA;
                    String strI = accessToken.i();
                    String strU = accessToken.u();
                    Set setQ = permissionsCallSucceeded.get() ? permissions : accessToken.q();
                    Set setL = permissionsCallSucceeded.get() ? declinedPermissions : accessToken.l();
                    if (!permissionsCallSucceeded.get()) {
                        expiredPermissions = accessToken.m();
                    }
                    Set set2 = expiredPermissions;
                    g gVarS = accessToken.s();
                    Date date2 = new Date();
                    Date date3 = lB != null ? new Date(lB.longValue() * 1000) : accessToken.k();
                    if (strE == null) {
                        strE = accessToken.o();
                    }
                    accessToken2 = new AccessToken(str, strI, strU, setQ, setL, set2, gVarS, date, date2, date3, strE);
                    try {
                        aVar.e().s(accessToken2);
                        this$0.f99563d.set(false);
                        if (bVar != null) {
                            bVar.b(accessToken2);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        this$0.f99563d.set(false);
                        if (bVar != null && accessToken2 != null) {
                            bVar.b(accessToken2);
                        }
                        throw th;
                    }
                }
            }
            if (bVar != null) {
                bVar.a(new u("No current access token to refresh"));
            }
            this$0.f99563d.set(false);
        } catch (Throwable th3) {
            th = th3;
            accessToken2 = null;
        }
    }

    private final void r(AccessToken accessToken, AccessToken accessToken2) {
        g0 g0Var = g0.f99617a;
        Intent intent = new Intent(g0.n(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction(f99552h);
        intent.putExtra(f99553i, accessToken);
        intent.putExtra(f99554j, accessToken2);
        this.f99560a.d(intent);
    }

    private final void t(AccessToken accessToken, boolean z10) {
        AccessToken accessToken2 = this.f99562c;
        this.f99562c = accessToken;
        this.f99563d.set(false);
        this.f99564e = new Date(0L);
        if (z10) {
            if (accessToken != null) {
                this.f99561b.g(accessToken);
            } else {
                this.f99561b.a();
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                g0 g0Var = g0.f99617a;
                com.facebook.internal.e1.i(g0.n());
            }
        }
        com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
        if (com.facebook.internal.e1.e(accessToken2, accessToken)) {
            return;
        }
        r(accessToken2, accessToken);
        u();
    }

    private final void u() {
        g0 g0Var = g0.f99617a;
        Context contextN = g0.n();
        AccessToken.d dVar = AccessToken.f98366l;
        AccessToken accessTokenI = dVar.i();
        AlarmManager alarmManager = (AlarmManager) contextN.getSystemService(androidx.core.app.w.K0);
        if (dVar.k()) {
            if ((accessTokenI == null ? null : accessTokenI.n()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextN, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction(f99552h);
            try {
                alarmManager.set(1, accessTokenI.n().getTime(), PendingIntent.getBroadcast(contextN, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean v() {
        AccessToken accessTokenI = i();
        if (accessTokenI == null) {
            return false;
        }
        long time = new Date().getTime();
        return accessTokenI.s().l() && time - this.f99564e.getTime() > 3600000 && time - accessTokenI.p().getTime() > 86400000;
    }

    public final void g() {
        r(i(), i());
    }

    public final void h() {
        if (v()) {
            l(null);
        }
    }

    @Nullable
    public final AccessToken i() {
        return this.f99562c;
    }

    public final boolean k() {
        AccessToken accessTokenF = this.f99561b.f();
        if (accessTokenF == null) {
            return false;
        }
        t(accessTokenF, false);
        return true;
    }

    public final void l(@Nullable final AccessToken.b bVar) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            n(bVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.m(this.f99546a, bVar);
                }
            });
        }
    }

    public final void s(@Nullable AccessToken accessToken) {
        t(accessToken, true);
    }
}
