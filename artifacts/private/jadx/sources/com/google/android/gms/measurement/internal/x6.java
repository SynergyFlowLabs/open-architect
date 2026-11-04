package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.lh;
import com.google.android.gms.internal.measurement.mh;
import com.google.android.gms.internal.measurement.qg;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class x6 extends be implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f110668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.l1
    final Map f110669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.l1
    final Map f110670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.l1
    final Map f110671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f110672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f110673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.l1
    final androidx.collection.d1 f110674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final qg f110675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f110676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f110677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f110678n;

    x6(qe qeVar) {
        super(qeVar);
        this.f110668d = new androidx.collection.a();
        this.f110669e = new androidx.collection.a();
        this.f110670f = new androidx.collection.a();
        this.f110671g = new androidx.collection.a();
        this.f110672h = new androidx.collection.a();
        this.f110676l = new androidx.collection.a();
        this.f110677m = new androidx.collection.a();
        this.f110678n = new androidx.collection.a();
        this.f110673i = new androidx.collection.a();
        this.f110674j = new q6(this, 20);
        this.f110675k = new r6(this);
    }

    @androidx.annotation.m1
    private final void q(String str) throws Throwable {
        j();
        h();
        com.google.android.gms.common.internal.w.l(str);
        Map map = this.f110672h;
        if (map.get(str) == null) {
            o oVarN0 = this.f110700b.F0().N0(str);
            if (oVarN0 != null) {
                com.google.android.gms.internal.measurement.p5 p5Var = (com.google.android.gms.internal.measurement.p5) t(str, oVarN0.f110302a).q();
                r(str, p5Var);
                this.f110668d.put(str, u((com.google.android.gms.internal.measurement.q5) p5Var.r()));
                map.put(str, (com.google.android.gms.internal.measurement.q5) p5Var.r());
                s(str, (com.google.android.gms.internal.measurement.q5) p5Var.r());
                this.f110676l.put(str, p5Var.C());
                this.f110677m.put(str, oVarN0.f110303b);
                this.f110678n.put(str, oVarN0.f110304c);
                return;
            }
            this.f110668d.put(str, null);
            this.f110670f.put(str, null);
            this.f110669e.put(str, null);
            this.f110671g.put(str, null);
            map.put(str, null);
            this.f110676l.put(str, null);
            this.f110677m.put(str, null);
            this.f110678n.put(str, null);
            this.f110673i.put(str, null);
        }
    }

    private final void r(String str, com.google.android.gms.internal.measurement.p5 p5Var) {
        HashSet hashSet = new HashSet();
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        Iterator it = p5Var.B().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.m5) it.next()).E());
        }
        for (int i10 = 0; i10 < p5Var.u(); i10++) {
            com.google.android.gms.internal.measurement.n5 n5Var = (com.google.android.gms.internal.measurement.n5) p5Var.v(i10).q();
            if (n5Var.u().isEmpty()) {
                this.f110184a.a().r().a("EventConfig contained null event name");
            } else {
                String strU = n5Var.u();
                String strB = s8.b(n5Var.u());
                if (!TextUtils.isEmpty(strB)) {
                    n5Var.v(strB);
                    p5Var.w(i10, n5Var);
                }
                if (n5Var.w() && n5Var.x()) {
                    aVar.put(strU, Boolean.TRUE);
                }
                if (n5Var.z() && n5Var.A()) {
                    aVar2.put(n5Var.u(), Boolean.TRUE);
                }
                if (n5Var.B()) {
                    if (n5Var.C() < 2 || n5Var.C() > 65535) {
                        this.f110184a.a().r().c("Invalid sampling rate. Event name, sample rate", n5Var.u(), Integer.valueOf(n5Var.C()));
                    } else {
                        aVar3.put(n5Var.u(), Integer.valueOf(n5Var.C()));
                    }
                }
            }
        }
        this.f110669e.put(str, hashSet);
        this.f110670f.put(str, aVar);
        this.f110671g.put(str, aVar2);
        this.f110673i.put(str, aVar3);
    }

    @androidx.annotation.m1
    private final void s(final String str, com.google.android.gms.internal.measurement.q5 q5Var) {
        if (q5Var.N() == 0) {
            this.f110674j.l(str);
            return;
        }
        h7 h7Var = this.f110184a;
        h7Var.a().w().b("EES programs found", Integer.valueOf(q5Var.N()));
        com.google.android.gms.internal.measurement.i8 i8Var = (com.google.android.gms.internal.measurement.i8) q5Var.M().get(0);
        try {
            com.google.android.gms.internal.measurement.c1 c1Var = new com.google.android.gms.internal.measurement.c1();
            c1Var.a("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.w6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new com.google.android.gms.internal.measurement.lc("internal.remoteConfig", new s6(this.f110634a, str));
                }
            });
            c1Var.a("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.t6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final x6 x6Var = this.f110522a;
                    final String str2 = str;
                    return new mh("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.v6
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            x6 x6Var2 = x6Var;
                            t tVarF0 = x6Var2.f110700b.F0();
                            String str3 = str2;
                            c6 c6VarJ0 = tVarF0.J0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put(io.sentry.z7.b.f307198c, str3);
                            x6Var2.f110184a.w().A();
                            map.put("gmp_version", 133005L);
                            if (c6VarJ0 != null) {
                                String strD0 = c6VarJ0.D0();
                                if (strD0 != null) {
                                    map.put(io.sentry.protocol.a.b.f306114f, strD0);
                                }
                                map.put("app_version_int", Long.valueOf(c6VarJ0.F0()));
                                map.put("dynamite_version", Long.valueOf(c6VarJ0.b()));
                            }
                            return map;
                        }
                    });
                }
            });
            c1Var.a("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.u6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new lh(this.f110580a.f110675k);
                }
            });
            c1Var.f(i8Var);
            this.f110674j.j(str, c1Var);
            h7Var.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(i8Var.F().F()));
            Iterator it = i8Var.F().E().iterator();
            while (it.hasNext()) {
                h7Var.a().w().b("EES program activity", ((com.google.android.gms.internal.measurement.f8) it.next()).E());
            }
        } catch (com.google.android.gms.internal.measurement.d2 unused) {
            this.f110184a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    @androidx.annotation.m1
    private final com.google.android.gms.internal.measurement.q5 t(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.q5.V();
        }
        try {
            com.google.android.gms.internal.measurement.q5 q5Var = (com.google.android.gms.internal.measurement.q5) ((com.google.android.gms.internal.measurement.p5) ve.W(com.google.android.gms.internal.measurement.q5.U(), bArr)).r();
            this.f110184a.a().w().c("Parsed config. version, gmp_app_id", q5Var.E() ? Long.valueOf(q5Var.F()) : null, q5Var.G() ? q5Var.H() : null);
            return q5Var;
        } catch (com.google.android.gms.internal.measurement.cc e10) {
            this.f110184a.a().r().c("Unable to merge remote config. appId", w5.x(str), e10);
            return com.google.android.gms.internal.measurement.q5.V();
        } catch (RuntimeException e11) {
            this.f110184a.a().r().c("Unable to merge remote config. appId", w5.x(str), e11);
            return com.google.android.gms.internal.measurement.q5.V();
        }
    }

    private static final Map u(com.google.android.gms.internal.measurement.q5 q5Var) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (q5Var != null) {
            for (com.google.android.gms.internal.measurement.y5 y5Var : q5Var.I()) {
                aVar.put(y5Var.E(), y5Var.F());
            }
        }
        return aVar;
    }

    private static final q8 v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return q8.AD_STORAGE;
        }
        if (i11 == 2) {
            return q8.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return q8.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return q8.AD_PERSONALIZATION;
    }

    @androidx.annotation.m1
    protected final void A(String str) {
        h();
        this.f110677m.put(str, null);
    }

    @androidx.annotation.m1
    final void B(String str) {
        h();
        this.f110672h.remove(str);
    }

    @androidx.annotation.m1
    protected final boolean C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        j();
        h();
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.internal.measurement.p5 p5Var = (com.google.android.gms.internal.measurement.p5) t(str, bArr).q();
        r(str, p5Var);
        s(str, (com.google.android.gms.internal.measurement.q5) p5Var.r());
        this.f110672h.put(str, (com.google.android.gms.internal.measurement.q5) p5Var.r());
        this.f110676l.put(str, p5Var.C());
        this.f110677m.put(str, str2);
        this.f110678n.put(str, str3);
        this.f110668d.put(str, u((com.google.android.gms.internal.measurement.q5) p5Var.r()));
        this.f110700b.F0().Y(str, new ArrayList(p5Var.x()));
        try {
            p5Var.z();
            bArr = ((com.google.android.gms.internal.measurement.q5) p5Var.r()).g();
        } catch (RuntimeException e10) {
            this.f110184a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", w5.x(str), e10);
        }
        t tVarF0 = this.f110700b.F0();
        com.google.android.gms.common.internal.w.l(str);
        tVarF0.h();
        tVarF0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (tVarF0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                tVarF0.f110184a.a().o().b("Failed to update remote config (got 0). appId", w5.x(str));
            }
        } catch (SQLiteException e11) {
            tVarF0.f110184a.a().o().c("Error storing remote config. appId", w5.x(str), e11);
        }
        p5Var.A();
        this.f110672h.put(str, (com.google.android.gms.internal.measurement.q5) p5Var.r());
        return true;
    }

    @androidx.annotation.m1
    final boolean D(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if (H(str) && ze.N(str2)) {
            return true;
        }
        if (I(str) && ze.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f110670f.get(str);
        if (map != null && (bool = (Boolean) map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @androidx.annotation.m1
    final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if (!"ecommerce_purchase".equals(str2) && !FirebaseAnalytics.c.D.equals(str2) && !FirebaseAnalytics.c.E.equals(str2)) {
            Map map = (Map) this.f110671g.get(str);
            if (map == null || (bool = (Boolean) map.get(str2)) == null) {
                return false;
            }
            return bool.booleanValue();
        }
        return true;
    }

    @androidx.annotation.m1
    final Set F(String str) {
        h();
        q(str);
        return (Set) this.f110669e.get(str);
    }

    @androidx.annotation.m1
    final int G(String str, String str2) throws Throwable {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f110673i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final boolean H(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_internal"));
    }

    final boolean I(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_public"));
    }

    @androidx.annotation.m1
    final boolean J(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f110669e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains(io.sentry.k4.c.f305748d) || ((Set) map.get(str)).contains(com.facebook.devicerequests.internal.a.f99536c);
        }
        return false;
    }

    @androidx.annotation.m1
    final boolean K(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f110669e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains(com.facebook.devicerequests.internal.a.f99536c);
        }
        return false;
    }

    @androidx.annotation.m1
    final boolean L(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f110669e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    @androidx.annotation.m1
    final boolean M(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f110669e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    @androidx.annotation.m1
    final boolean N(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f110669e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    @androidx.annotation.m1
    final boolean O(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f110669e;
        if (map.get(str) == null || !((Set) map.get(str)).contains("enhanced_user_id")) {
            return false;
        }
        int i10 = 0 >> 1;
        return true;
    }

    @androidx.annotation.m1
    final boolean P(String str, q8 q8Var) throws Throwable {
        h();
        q(str);
        com.google.android.gms.internal.measurement.k5 k5VarR = R(str);
        if (k5VarR == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.y4 y4Var : k5VarR.E()) {
            if (q8Var == v(y4Var.F())) {
                if (y4Var.G() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @androidx.annotation.m1
    final q8 Q(String str, q8 q8Var) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.k5 k5VarR = R(str);
        if (k5VarR == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.a5 a5Var : k5VarR.F()) {
            if (q8Var == v(a5Var.F())) {
                return v(a5Var.G());
            }
        }
        return null;
    }

    @androidx.annotation.m1
    final com.google.android.gms.internal.measurement.k5 R(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.q5 q5VarW = w(str);
        if (q5VarW == null || !q5VarW.Q()) {
            return null;
        }
        return q5VarW.R();
    }

    @androidx.annotation.m1
    final boolean S(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.k5 k5VarR = R(str);
        if (k5VarR != null && k5VarR.H() && !k5VarR.I()) {
            return false;
        }
        return true;
    }

    @androidx.annotation.m1
    final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.k5 k5VarR = R(str);
        if (k5VarR != null) {
            Iterator it = k5VarR.G().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.h5) it.next()).E());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.j
    @androidx.annotation.m1
    public final String f(String str, String str2) throws Throwable {
        h();
        q(str);
        Map map = (Map) this.f110668d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.be
    protected final boolean l() {
        return false;
    }

    @androidx.annotation.m1
    final o8 m(String str, q8 q8Var) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.k5 k5VarR = R(str);
        if (k5VarR == null) {
            return o8.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.y4 y4Var : k5VarR.J()) {
            if (v(y4Var.F()) == q8Var) {
                int iG = y4Var.G() - 1;
                if (iG != 1) {
                    return iG != 2 ? o8.UNINITIALIZED : o8.DENIED;
                }
                return o8.GRANTED;
            }
        }
        return o8.UNINITIALIZED;
    }

    @androidx.annotation.m1
    final boolean n(String str) throws Throwable {
        h();
        q(str);
        com.google.android.gms.internal.measurement.k5 k5VarR = R(str);
        if (k5VarR == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.y4 y4Var : k5VarR.E()) {
            if (y4Var.F() == 3 && y4Var.H() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ com.google.android.gms.internal.measurement.c1 o(String str) throws Throwable {
        j();
        com.google.android.gms.common.internal.w.l(str);
        o oVarN0 = this.f110700b.F0().N0(str);
        if (oVarN0 == null) {
            return null;
        }
        this.f110184a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, oVarN0.f110302a));
        return (com.google.android.gms.internal.measurement.c1) this.f110674j.q().get(str);
    }

    final /* synthetic */ Map p() {
        return this.f110668d;
    }

    @androidx.annotation.m1
    protected final com.google.android.gms.internal.measurement.q5 w(String str) {
        j();
        h();
        com.google.android.gms.common.internal.w.l(str);
        q(str);
        return (com.google.android.gms.internal.measurement.q5) this.f110672h.get(str);
    }

    @androidx.annotation.m1
    final String x(String str) {
        h();
        q(str);
        return (String) this.f110676l.get(str);
    }

    @androidx.annotation.m1
    protected final String y(String str) {
        h();
        return (String) this.f110677m.get(str);
    }

    @androidx.annotation.m1
    protected final String z(String str) {
        h();
        return (String) this.f110678n.get(str);
    }
}
