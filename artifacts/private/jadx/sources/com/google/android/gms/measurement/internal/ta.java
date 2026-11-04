package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.fg;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ta extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.l1
    protected fa f110532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v8 f110533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f110534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f110535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f110536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f110537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f110538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f110539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w f110540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private w f110541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PriorityQueue f110542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f110543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.b0("consentLock")
    private r8 f110544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicLong f110545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f110546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final gf f110547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.l1
    protected boolean f110548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private w f110549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f110550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private w f110551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ye f110552w;

    protected ta(h7 h7Var) {
        super(h7Var);
        this.f110534e = new CopyOnWriteArraySet();
        this.f110537h = new Object();
        this.f110538i = false;
        this.f110539j = 1;
        this.f110548s = true;
        this.f110552w = new u9(this);
        this.f110536g = new AtomicReference();
        this.f110544o = r8.f110439c;
        this.f110546q = -1L;
        this.f110545p = new AtomicLong(0L);
        this.f110547r = new gf(h7Var);
    }

    private final bb f0(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.f110867c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strS = this.f110184a.L().s();
            h7 h7Var = this.f110184a;
            u5 u5VarW = h7Var.a().w();
            Long lValueOf = Long.valueOf(zzomVar.f110865a);
            u5VarW.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.f110867c, Integer.valueOf(zzomVar.f110866b.length));
            if (!TextUtils.isEmpty(zzomVar.f110871g)) {
                h7Var.a().w().c("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.f110871g);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.f110868d;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            ya yaVarF = h7Var.F();
            byte[] bArr = zzomVar.f110866b;
            va vaVar = new va() { // from class: com.google.android.gms.measurement.internal.ga
                /* JADX WARN: Code duplicated, block: B:10:0x001b  */
                /* JADX WARN: Code duplicated, block: B:11:0x0038 A[PHI: r9
                  0x0038: PHI (r9v7 int) = (r9v1 int), (r9v0 int) binds: [B:9:0x0019, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0079  */
                /* JADX WARN: Code duplicated, block: B:14:0x007c  */
                @Override // com.google.android.gms.measurement.internal.va
                public final /* synthetic */ void a(String str2, int i10, Throwable th2, byte[] bArr2, Map map2) {
                    bb bbVar;
                    ta taVar = this.f109989a;
                    taVar.h();
                    zzom zzomVar2 = zzomVar;
                    if (i10 == 200 || i10 == 204) {
                        if (th2 == null) {
                            taVar.f110184a.a().w().b("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.f110865a));
                            bbVar = bb.SUCCESS;
                        } else {
                            taVar.f110184a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f110865a), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) z4.f110797u.b(null)).split(",")).contains(String.valueOf(i10))) {
                                bbVar = bb.BACKOFF;
                            } else {
                                bbVar = bb.FAILURE;
                            }
                        }
                    } else if (i10 == 304) {
                        i10 = 304;
                        if (th2 == null) {
                            taVar.f110184a.a().w().b("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.f110865a));
                            bbVar = bb.SUCCESS;
                        } else {
                            taVar.f110184a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f110865a), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) z4.f110797u.b(null)).split(",")).contains(String.valueOf(i10))) {
                                bbVar = bb.BACKOFF;
                            } else {
                                bbVar = bb.FAILURE;
                            }
                        }
                    } else {
                        taVar.f110184a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f110865a), Integer.valueOf(i10), th2);
                        if (Arrays.asList(((String) z4.f110797u.b(null)).split(",")).contains(String.valueOf(i10))) {
                            bbVar = bb.BACKOFF;
                        } else {
                            bbVar = bb.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    xc xcVarJ = taVar.f110184a.J();
                    long j10 = zzomVar2.f110865a;
                    xcVarJ.l0(new zzaf(j10, bbVar.a(), zzomVar2.f110870f));
                    taVar.f110184a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j10), bbVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(bbVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            yaVarF.l();
            com.google.android.gms.common.internal.w.r(url);
            com.google.android.gms.common.internal.w.r(bArr);
            com.google.android.gms.common.internal.w.r(vaVar);
            yaVarF.f110184a.b().w(new xa(yaVarF, strS, url, bArr, map, vaVar));
            try {
                h7 h7Var2 = h7Var.C().f110184a;
                long jCurrentTimeMillis = h7Var2.e().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - h7Var2.e().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f110184a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? bb.UNKNOWN : (bb) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f110184a.a().o().d("[sgtm] Bad upload url for row_id", zzomVar.f110867c, Long.valueOf(zzomVar.f110865a), e10);
            return bb.FAILURE;
        }
    }

    @androidx.annotation.m1
    private final void g0(Boolean bool, boolean z10) {
        h();
        j();
        h7 h7Var = this.f110184a;
        h7Var.a().v().b("Setting app measurement enabled (FE)", bool);
        h7Var.x().s(bool);
        if (z10) {
            k6 k6VarX = h7Var.x();
            h7 h7Var2 = k6VarX.f110184a;
            k6VarX.h();
            SharedPreferences.Editor editorEdit = k6VarX.p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (!this.f110184a.j() && (bool == null || bool.booleanValue())) {
            return;
        }
        Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void Z() {
        ta taVar;
        h();
        h7 h7Var = this.f110184a;
        String strA = h7Var.x().f110169n.a();
        if (strA == null) {
            taVar = this;
        } else if ("unset".equals(strA)) {
            taVar = this;
            taVar.B("app", "_npa", null, h7Var.e().currentTimeMillis());
        } else {
            taVar = this;
            taVar.B("app", "_npa", Long.valueOf(true != com.facebook.internal.z0.P.equals(strA) ? 0L : 1L), h7Var.e().currentTimeMillis());
        }
        if (!taVar.f110184a.g() || !taVar.f110548s) {
            h7Var.a().v().a("Updating Scion state (FE)");
            taVar.f110184a.J().X();
        } else {
            h7Var.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            taVar.I();
            taVar.f110184a.z().f110366e.a();
            h7Var.b().t(new f9(taVar));
        }
    }

    final void A(String str, String str2, long j10, Object obj) {
        this.f110184a.b().t(new k9(this, str, str2, obj, j10));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    @androidx.annotation.m1
    final void B(String str, String str2, Object obj, long j10) {
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.l(str2);
        h();
        j();
        Object obj2 = obj;
        if (FirebaseAnalytics.e.f120685b.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j11 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    h7 h7Var = this.f110184a;
                    Long lValueOf = Long.valueOf(j11);
                    h7Var.x().f110169n.b(lValueOf.longValue() == 1 ? com.facebook.internal.z0.P : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.f110184a.x().f110169n.b("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.f110184a.x().f110169n.b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f110184a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        h7 h7Var2 = this.f110184a;
        if (!h7Var2.g()) {
            this.f110184a.a().w().a("User property not set since app measurement is disabled");
        } else if (h7Var2.m()) {
            this.f110184a.J().o(new zzpl(str4, j10, obj3, str));
        }
    }

    public final List C(boolean z10) {
        j();
        h7 h7Var = this.f110184a;
        h7Var.a().w().a("Getting user properties (FE)");
        if (h7Var.b().p()) {
            h7Var.a().o().a("Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        h7Var.c();
        if (f.a()) {
            h7Var.a().o().a("Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f110184a.b().u(atomicReference, 5000L, "get user properties", new m9(this, atomicReference, z10));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        h7Var.a().o().b("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
        return Collections.EMPTY_LIST;
    }

    public final Map D(String str, String str2, boolean z10) {
        h7 h7Var = this.f110184a;
        if (h7Var.b().p()) {
            h7Var.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        h7Var.c();
        if (f.a()) {
            h7Var.a().o().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f110184a.b().u(atomicReference, 5000L, "get user properties", new s9(this, atomicReference, null, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            h7Var.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        androidx.collection.a aVar = new androidx.collection.a(list.size());
        for (zzpl zzplVar : list) {
            Object objO1 = zzplVar.O1();
            if (objO1 != null) {
                aVar.put(zzplVar.f110875b, objO1);
            }
        }
        return aVar;
    }

    public final String E() {
        return (String) this.f110536g.get();
    }

    final void F(String str) {
        this.f110536g.set(str);
    }

    @androidx.annotation.m1
    public final void G() {
        h();
        h7 h7Var = this.f110184a;
        if (h7Var.x().f110176u.a()) {
            h7Var.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = h7Var.x().f110177v.a();
        h7Var.x().f110177v.b(1 + jA);
        h7Var.w();
        if (jA >= 5) {
            h7Var.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            h7Var.x().f110176u.b(true);
        } else {
            if (this.f110549t == null) {
                this.f110549t = new n9(this, this.f110184a);
            }
            this.f110549t.b(0L);
        }
    }

    public final void H(long j10) {
        this.f110536g.set(null);
        this.f110184a.b().t(new o9(this, j10));
    }

    @androidx.annotation.m1
    public final void I() {
        h();
        j();
        if (this.f110184a.m()) {
            h7 h7Var = this.f110184a;
            k kVarW = h7Var.w();
            kVarW.f110184a.c();
            Boolean boolJ = kVarW.J("google_analytics_deferred_deep_link_enabled");
            if (boolJ != null && boolJ.booleanValue()) {
                h7Var.a().v().a("Deferred Deep Link feature enabled.");
                h7Var.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.qa
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f110392a.G();
                    }
                });
            }
            this.f110184a.J().s();
            this.f110548s = false;
            k6 k6VarX = h7Var.x();
            k6VarX.h();
            String string = k6VarX.p().getString("previous_os_version", null);
            k6VarX.f110184a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = k6VarX.p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            h7Var.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    @androidx.annotation.m1
    public final void J(v8 v8Var) {
        v8 v8Var2;
        h();
        j();
        if (v8Var != null && v8Var != (v8Var2 = this.f110533d)) {
            com.google.android.gms.common.internal.w.y(v8Var2 == null, "EventInterceptor already set.");
        }
        this.f110533d = v8Var;
    }

    public final void K(w8 w8Var) {
        j();
        com.google.android.gms.common.internal.w.r(w8Var);
        if (!this.f110534e.add(w8Var)) {
            this.f110184a.a().r().a("OnEventListener already registered");
        }
    }

    public final void L(w8 w8Var) {
        j();
        com.google.android.gms.common.internal.w.r(w8Var);
        if (this.f110534e.remove(w8Var)) {
            return;
        }
        this.f110184a.a().r().a("OnEventListener had not been registered");
    }

    public final int M(String str) {
        com.google.android.gms.common.internal.w.l(str);
        this.f110184a.w();
        return 25;
    }

    public final void N(Bundle bundle) {
        O(bundle, this.f110184a.e().currentTimeMillis());
    }

    public final void O(Bundle bundle, long j10) {
        com.google.android.gms.common.internal.w.r(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f110184a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.w.r(bundle2);
        n8.b(bundle2, "app_id", String.class, null);
        n8.b(bundle2, "origin", String.class, null);
        n8.b(bundle2, "name", String.class, null);
        n8.b(bundle2, "value", Object.class, null);
        n8.b(bundle2, n6.a.C2338a.f332736d, String.class, null);
        n8.b(bundle2, n6.a.C2338a.f332737e, Long.class, 0L);
        n8.b(bundle2, n6.a.C2338a.f332738f, String.class, null);
        n8.b(bundle2, n6.a.C2338a.f332739g, Bundle.class, null);
        n8.b(bundle2, n6.a.C2338a.f332740h, String.class, null);
        n8.b(bundle2, n6.a.C2338a.f332741i, Bundle.class, null);
        n8.b(bundle2, n6.a.C2338a.f332742j, Long.class, 0L);
        n8.b(bundle2, n6.a.C2338a.f332743k, String.class, null);
        n8.b(bundle2, n6.a.C2338a.f332744l, Bundle.class, null);
        com.google.android.gms.common.internal.w.l(bundle2.getString("name"));
        com.google.android.gms.common.internal.w.l(bundle2.getString("origin"));
        com.google.android.gms.common.internal.w.r(bundle2.get("value"));
        bundle2.putLong(n6.a.C2338a.f332745m, j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        h7 h7Var = this.f110184a;
        if (h7Var.C().y0(string) != 0) {
            h7Var.a().o().b("Invalid conditional user property name", h7Var.D().c(string));
            return;
        }
        if (h7Var.C().y(string, obj) != 0) {
            h7Var.a().o().c("Invalid conditional user property value", h7Var.D().c(string), obj);
            return;
        }
        Object objZ = h7Var.C().z(string, obj);
        if (objZ == null) {
            h7Var.a().o().c("Unable to normalize conditional user property value", h7Var.D().c(string), obj);
            return;
        }
        n8.a(bundle2, objZ);
        long j11 = bundle2.getLong(n6.a.C2338a.f332737e);
        if (!TextUtils.isEmpty(bundle2.getString(n6.a.C2338a.f332736d))) {
            h7Var.w();
            if (j11 > 15552000000L || j11 < 1) {
                h7Var.a().o().c("Invalid conditional user property timeout", h7Var.D().c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong(n6.a.C2338a.f332742j);
        h7Var.w();
        if (j12 > 15552000000L || j12 < 1) {
            h7Var.a().o().c("Invalid conditional user property time to live", h7Var.D().c(string), Long.valueOf(j12));
        } else {
            h7Var.b().t(new p9(this, bundle2));
        }
    }

    public final void P(String str, String str2, Bundle bundle) {
        h7 h7Var = this.f110184a;
        long jCurrentTimeMillis = h7Var.e().currentTimeMillis();
        com.google.android.gms.common.internal.w.l(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(n6.a.C2338a.f332745m, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(n6.a.C2338a.f332743k, str2);
            bundle2.putBundle(n6.a.C2338a.f332744l, bundle);
        }
        h7Var.b().t(new q9(this, bundle2));
    }

    public final ArrayList Q(String str, String str2) {
        h7 h7Var = this.f110184a;
        if (h7Var.b().p()) {
            h7Var.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        h7Var.c();
        if (f.a()) {
            h7Var.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f110184a.b().u(atomicReference, 5000L, "get conditional user properties", new r9(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ze.h0(list);
        }
        h7Var.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String R() {
        eb ebVarU = this.f110184a.I().u();
        if (ebVarU != null) {
            return ebVarU.f109922a;
        }
        return null;
    }

    public final String S() {
        eb ebVarU = this.f110184a.I().u();
        if (ebVarU != null) {
            return ebVarU.f109923b;
        }
        return null;
    }

    public final String T() {
        try {
            return db.a(this.f110184a.d(), "google_app_id", this.f110184a.H());
        } catch (IllegalStateException e10) {
            this.f110184a.a().o().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    final /* synthetic */ void U(SharedPreferences sharedPreferences, String str) {
        h7 h7Var = this.f110184a;
        if (!h7Var.w().H(null, z4.f110747a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                h7Var.a().w().a("IABTCF_TCString change picked up in listener.");
                ((w) com.google.android.gms.common.internal.w.r(this.f110551v)).b(500L);
                return;
            }
            return;
        }
        if (!Objects.equals(str, "IABTCF_TCString") && !Objects.equals(str, "IABTCF_gdprApplies") && !Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            return;
        }
        h7Var.a().w().a("IABTCF_TCString change picked up in listener.");
        ((w) com.google.android.gms.common.internal.w.r(this.f110551v)).b(500L);
    }

    final /* synthetic */ void V(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            h7 h7Var = this.f110184a;
            bundle2 = new Bundle(h7Var.x().f110181z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (h7Var.C().B0(obj)) {
                        h7Var.C().B(this.f110552w, null, 27, null, null, 0);
                    }
                    h7Var.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (ze.N(next)) {
                    h7Var.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (h7Var.C().C0("param", next, h7Var.w().x(null, false), obj)) {
                    h7Var.C().A(bundle2, next, obj);
                }
            }
            h7Var.C();
            int iV = h7Var.w().v();
            if (bundle2.size() > iV) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iV) {
                        bundle2.remove(str);
                    }
                }
                h7Var.C().B(this.f110552w, null, 26, null, null, 0);
                h7Var.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        h7 h7Var2 = this.f110184a;
        h7Var2.x().f110181z.b(bundle2);
        if (!bundle.isEmpty() || h7Var2.w().H(null, z4.X0)) {
            this.f110184a.J().v(bundle2);
        }
    }

    final /* synthetic */ void W(int i10) {
        if (this.f110540k == null) {
            this.f110540k = new d9(this, this.f110184a);
        }
        this.f110540k.b(((long) i10) * 1000);
    }

    final /* synthetic */ void X(Boolean bool, boolean z10) {
        g0(bool, true);
    }

    final /* synthetic */ void Y(r8 r8Var, long j10, boolean z10, boolean z11) {
        h();
        j();
        h7 h7Var = this.f110184a;
        r8 r8VarW = h7Var.x().w();
        if (j10 <= this.f110546q && r8.u(r8VarW.b(), r8Var.b())) {
            h7Var.a().u().b("Dropped out-of-date consent setting, proposed settings", r8Var);
            return;
        }
        k6 k6VarX = h7Var.x();
        h7 h7Var2 = k6VarX.f110184a;
        k6VarX.h();
        int iB = r8Var.b();
        if (!k6VarX.v(iB)) {
            h7Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(r8Var.b()));
            return;
        }
        h7 h7Var3 = this.f110184a;
        SharedPreferences.Editor editorEdit = k6VarX.p().edit();
        editorEdit.putString("consent_settings", r8Var.l());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        h7Var.a().w().b("Setting storage consent(FE)", r8Var);
        this.f110546q = j10;
        if (h7Var3.J().D()) {
            h7Var3.J().Z(z10);
        } else {
            h7Var3.J().Y(z10);
        }
        if (z11) {
            h7Var3.J().q(new AtomicReference());
        }
    }

    final /* synthetic */ void a0(boolean z10) {
        this.f110538i = false;
    }

    final /* synthetic */ int b0() {
        return this.f110539j;
    }

    final /* synthetic */ void c0(int i10) {
        this.f110539j = i10;
    }

    final /* synthetic */ w d0() {
        return this.f110549t;
    }

    final /* synthetic */ int e0(Throwable th2) {
        String message = th2.getMessage();
        this.f110543n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f110543n = true;
        return 1;
    }

    public final void i0() {
        h7 h7Var = this.f110184a;
        if ((h7Var.d().getApplicationContext() instanceof Application) && this.f110532c != null) {
            ((Application) h7Var.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f110532c);
        }
    }

    public final Boolean j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f110184a.b().u(atomicReference, 15000L, "boolean test flag value", new l9(this, atomicReference));
    }

    public final String k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f110184a.b().u(atomicReference, 15000L, "String test flag value", new v9(this, atomicReference));
    }

    public final Long l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f110184a.b().u(atomicReference, 15000L, "long test flag value", new w9(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.b5
    protected final boolean m() {
        return false;
    }

    public final Integer m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f110184a.b().u(atomicReference, 15000L, "int test flag value", new x9(this, atomicReference));
    }

    public final Double n0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f110184a.b().u(atomicReference, 15000L, "double test flag value", new y9(this, atomicReference));
    }

    @androidx.annotation.m1
    final void o(r8 r8Var) {
        h();
        boolean z10 = (r8Var.o(q8.ANALYTICS_STORAGE) && r8Var.o(q8.AD_STORAGE)) || this.f110184a.J().C();
        h7 h7Var = this.f110184a;
        if (z10 != h7Var.j()) {
            h7Var.i(z10);
            k6 k6VarX = this.f110184a.x();
            h7 h7Var2 = k6VarX.f110184a;
            k6VarX.h();
            Boolean boolValueOf = k6VarX.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(k6VarX.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                g0(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void o0(Boolean bool) {
        j();
        this.f110184a.b().t(new z9(this, bool));
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f110184a.e().currentTimeMillis());
    }

    @androidx.annotation.l1
    final void p0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        j();
        r8 r8Var = r8.f110439c;
        q8[] q8VarArrL = p8.STORAGE.l();
        int length = q8VarArrL.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = q8VarArrL[i11].f110389a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            h7 h7Var = this.f110184a;
            h7Var.a().t().b("Ignoring invalid consent setting", obj);
            h7Var.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zP = this.f110184a.b().p();
        r8 r8VarE = r8.e(bundle, i10);
        if (r8VarE.c()) {
            r0(r8VarE, zP);
        }
        x xVarH = x.h(bundle, i10);
        if (xVarH.d()) {
            q0(xVarH, zP);
        }
        Boolean boolI = x.i(bundle);
        if (boolI != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (zP) {
                B(str2, FirebaseAnalytics.e.f120685b, boolI.toString(), j10);
            } else {
                z(str2, FirebaseAnalytics.e.f120685b, boolI.toString(), false, j10);
            }
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, FirebaseAnalytics.c.A)) {
            this.f110184a.I().s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f110533d != null && !ze.N(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = "app";
        }
        x(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    final void q0(x xVar, boolean z10) {
        aa aaVar = new aa(this, xVar);
        if (!z10) {
            this.f110184a.b().t(aaVar);
        } else {
            h();
            aaVar.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.m1
    public final void r() {
        qd qdVar;
        qd qdVar2;
        com.google.android.gms.internal.measurement.z9 z9Var;
        h();
        h7 h7Var = this.f110184a;
        h7Var.a().v().a("Handle tcf update.");
        SharedPreferences sharedPreferencesQ = h7Var.x().q();
        HashMap map = new HashMap();
        y4 y4Var = z4.f110747a1;
        if (((Boolean) y4Var.b(null)).booleanValue()) {
            int i10 = sd.f110488b;
            com.google.android.gms.internal.measurement.y9 y9Var = com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            rd rdVar = rd.CONSENT;
            Map.Entry entryA = sa.a(y9Var, rdVar);
            int i11 = 2;
            com.google.android.gms.internal.measurement.y9 y9Var2 = com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i12 = 1;
            rd rdVar2 = rd.FLEXIBLE_LEGITIMATE_INTEREST;
            com.google.common.collect.n6 n6VarC = com.google.common.collect.n6.C(entryA, sa.a(y9Var2, rdVar2), sa.a(com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, rdVar), sa.a(com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, rdVar), sa.a(com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, rdVar2), sa.a(com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, rdVar2), sa.a(com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, rdVar2));
            com.google.common.collect.z6 z6VarJ = com.google.common.collect.z6.J("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesQ.contains("IABTCF_TCString");
            int iB = sd.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            int iB2 = sd.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            int iB3 = sd.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            int iB4 = sd.b(sharedPreferencesQ, "IABTCF_PurposeOneTreatment");
            int iB5 = sd.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            String strA = sd.a(sharedPreferencesQ, "IABTCF_PublisherCC");
            com.google.common.collect.n6.b bVarB = com.google.common.collect.n6.b();
            com.google.common.collect.nb it = n6VarC.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.y9 y9Var3 = (com.google.android.gms.internal.measurement.y9) it.next();
                int iA = y9Var3.a();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iA).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iA);
                String strA2 = sd.a(sharedPreferencesQ, sb2.toString());
                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                    z9Var = com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.z9.values().length || iDigit == 0) {
                        z9Var = com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != i12) {
                        z9Var = iDigit != i11 ? com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        z9Var = com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                bVarB.i(y9Var3, z9Var);
                i11 = 2;
                i12 = 1;
            }
            com.google.common.collect.n6 n6VarD = bVarB.d();
            String strA3 = sd.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            String strA4 = sd.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = sd.a(sharedPreferencesQ, "IABTCF_PurposeLegitimateInterests");
            String strA6 = sd.a(sharedPreferencesQ, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = org.locationtech.jts.geom.l.f338162l;
            qdVar = new qd(sd.d(n6VarC, n6VarD, z6VarJ, cArr, iB, iB5, iB3, iB2, iB4, strA, strA3, strA5, z10, z11, zContains));
        } else {
            String strA7 = sd.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            if (!"".equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            int iB6 = sd.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            if (iB6 != -1) {
                map.put("gdprApplies", String.valueOf(iB6));
            }
            int iB7 = sd.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            if (iB7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iB7));
            }
            int iB8 = sd.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            if (iB8 != -1) {
                map.put("PolicyVersion", String.valueOf(iB8));
            }
            String strA8 = sd.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            if (!"".equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            int iB9 = sd.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            if (iB9 != -1) {
                map.put("CmpSdkID", String.valueOf(iB9));
            }
            qdVar = new qd(map);
        }
        h7Var.a().w().b("Tcf preferences read", qdVar);
        if (!h7Var.w().H(null, y4Var)) {
            if (h7Var.x().x(qdVar)) {
                Bundle bundleB = qdVar.b();
                h7Var.a().w().b("Consent generated from Tcf", bundleB);
                if (bundleB != Bundle.EMPTY) {
                    p0(bundleB, -30, h7Var.e().currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", qdVar.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        k6 k6VarX = h7Var.x();
        k6VarX.h();
        String string = k6VarX.p().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            qdVar2 = new qd(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && sd.f110487a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            qdVar2 = new qd(map2);
        }
        if (h7Var.x().x(qdVar)) {
            Bundle bundleB2 = qdVar.b();
            h7Var.a().w().b("Consent generated from Tcf", bundleB2);
            if (bundleB2 != Bundle.EMPTY) {
                p0(bundleB2, -30, h7Var.e().currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", qdVar.d(qdVar2));
            bundle2.putString("_tcfd2", qdVar.c());
            bundle2.putString("_tcfd", qdVar.e());
            t("auto", "_tcf", bundle2);
        }
    }

    public final void r0(r8 r8Var, boolean z10) {
        boolean z11;
        boolean zR;
        boolean z12;
        r8 r8Var2;
        j();
        int iB = r8Var.b();
        if (iB != -10) {
            o8 o8VarP = r8Var.p();
            o8 o8Var = o8.UNINITIALIZED;
            if (o8VarP == o8Var && r8Var.q() == o8Var) {
                this.f110184a.a().t().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f110537h) {
            try {
                z11 = false;
                if (r8.u(iB, this.f110544o.b())) {
                    zR = r8Var.r(this.f110544o);
                    q8 q8Var = q8.ANALYTICS_STORAGE;
                    if (r8Var.o(q8Var) && !this.f110544o.o(q8Var)) {
                        z11 = true;
                    }
                    r8Var = r8Var.t(this.f110544o);
                    this.f110544o = r8Var;
                    z12 = z11;
                    z11 = true;
                } else {
                    zR = false;
                    z12 = false;
                }
                r8Var2 = r8Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            this.f110184a.a().u().b("Ignoring lower-priority consent settings, proposed settings", r8Var2);
            return;
        }
        long andIncrement = this.f110545p.getAndIncrement();
        if (zR) {
            this.f110536g.set(null);
            ba baVar = new ba(this, r8Var2, andIncrement, z12);
            if (!z10) {
                this.f110184a.b().v(baVar);
                return;
            } else {
                h();
                baVar.run();
                return;
            }
        }
        ca caVar = new ca(this, r8Var2, andIncrement, z12);
        if (z10) {
            h();
            caVar.run();
            return;
        }
        if (iB != 30 && iB != -10) {
            this.f110184a.b().t(caVar);
            return;
        }
        this.f110184a.b().v(caVar);
    }

    @androidx.annotation.m1
    public final void s() {
        h();
        h7 h7Var = this.f110184a;
        h7Var.a().v().a("Register tcfPrefChangeListener.");
        if (this.f110550u == null) {
            this.f110551v = new i9(this, this.f110184a);
            this.f110550u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.na
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f110288a.U(sharedPreferences, str);
                }
            };
        }
        h7Var.x().q().registerOnSharedPreferenceChangeListener(this.f110550u);
    }

    final void s0(Runnable runnable) {
        j();
        h7 h7Var = this.f110184a;
        if (h7Var.b().p()) {
            h7Var.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (h7Var.b().q()) {
            h7Var.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        h7Var.c();
        if (f.a()) {
            h7Var.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        h7Var.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            h7Var.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            h7Var.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.ra
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f110446a.f110184a.J().k0(atomicReference, zzoo.O1(cb.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f110873a;
            if (!list.isEmpty()) {
                h7Var.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    bb bbVarF0 = f0((zzom) it.next());
                    if (bbVarF0 == bb.SUCCESS) {
                        i10++;
                    } else if (bbVarF0 == bb.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        h7Var.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        runnable.run();
    }

    @androidx.annotation.m1
    final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f110184a.e().currentTimeMillis(), bundle);
    }

    @androidx.annotation.m1
    final void t0(long j10) {
        h();
        if (this.f110541l == null) {
            this.f110541l = new a9(this, this.f110184a);
        }
        this.f110541l.b(j10);
    }

    @androidx.annotation.m1
    final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        boolean z10 = true;
        if (this.f110533d != null && !ze.N(str2)) {
            z10 = false;
        }
        v(str, str2, j10, bundle, true, z10, true, null);
    }

    @androidx.annotation.m1
    final void u0() {
        h();
        w wVar = this.f110541l;
        if (wVar != null) {
            wVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.m1
    protected final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        int i10;
        h7 h7Var;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        com.google.android.gms.common.internal.w.l(str5);
        com.google.android.gms.common.internal.w.r(bundle);
        h();
        j();
        h7 h7Var2 = this.f110184a;
        if (!h7Var2.g()) {
            this.f110184a.a().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List listW = this.f110184a.L().w();
        if (listW != null && !listW.contains(str2)) {
            this.f110184a.a().v().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f110535f) {
            this.f110535f = true;
            try {
                try {
                    (!h7Var2.G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f110184a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f110184a.d());
                } catch (Exception e10) {
                    this.f110184a.a().r().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f110184a.a().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        h7 h7Var3 = this.f110184a;
        if (!h7Var3.w().H(null, z4.f110765g1) && com.google.firebase.messaging.e.f.f123542l.equals(str2) && bundle.containsKey("gclid")) {
            h7Var3.c();
            B("auto", "_lgclid", bundle.getString("gclid"), h7Var3.e().currentTimeMillis());
        }
        ta taVar = this;
        h7Var3.c();
        if (z10 && ze.U(str2)) {
            h7Var3.C().w(bundle, h7Var3.x().f110181z.a());
        }
        if (!z12) {
            h7Var3.c();
            if (!"_iap".equals(str2)) {
                h7 h7Var4 = taVar.f110184a;
                ze zeVarC = h7Var4.C();
                int i11 = 2;
                if (zeVarC.t0(androidx.core.app.w.I0, str2)) {
                    if (zeVarC.v0(androidx.core.app.w.I0, s8.f110475a, s8.f110476b, str2)) {
                        zeVarC.f110184a.w();
                        if (zeVarC.w0(androidx.core.app.w.I0, 40, str2)) {
                            i11 = 0;
                        }
                    } else {
                        i11 = 13;
                    }
                }
                if (i11 != 0) {
                    h7Var3.a().q().b("Invalid public event name. Event will not be logged (FE)", h7Var3.D().a(str2));
                    ze zeVarC2 = h7Var4.C();
                    h7Var4.w();
                    h7Var4.C().B(taVar.f110552w, null, i11, "_ev", zeVarC2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        h7Var3.c();
        h7 h7Var5 = taVar.f110184a;
        eb ebVarQ = h7Var5.I().q(false);
        if (ebVarQ != null && !bundle.containsKey("_sc")) {
            ebVarQ.f109925d = true;
        }
        ze.k0(ebVarQ, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zN = ze.N(str2);
        if (!z10 || taVar.f110533d == null || zN) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                h7Var3.a().v().c("Passing event to registered event handler (FE)", h7Var3.D().a(str2), h7Var3.D().e(bundle));
                com.google.android.gms.common.internal.w.r(taVar.f110533d);
                taVar.f110533d.a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        h7 h7Var6 = taVar.f110184a;
        if (h7Var6.m()) {
            int iX0 = h7Var3.C().x0(str2);
            if (iX0 != 0) {
                h7Var3.a().q().b("Invalid event name. Event will not be logged (FE)", h7Var3.D().a(str2));
                ze zeVarC3 = h7Var3.C();
                h7Var3.w();
                h7Var6.C().B(taVar.f110552w, str3, iX0, "_ev", zeVarC3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleT = h7Var3.C().t(str3, str2, bundle, com.google.android.gms.common.util.h.d("_o", "_sn", "_sc", "_si"), z12);
            com.google.android.gms.common.internal.w.r(bundleT);
            h7Var3.c();
            if (h7Var5.I().q(false) == null || !"_ae".equals(str2)) {
                i10 = 0;
                h7Var = h7Var5;
                j11 = 0;
            } else {
                nd ndVar = h7Var5.z().f110367f;
                j11 = 0;
                long jB = ndVar.f110299d.f110184a.e().b();
                i10 = 0;
                h7Var = h7Var5;
                long j14 = jB - ndVar.f110297b;
                ndVar.f110297b = jB;
                if (j14 > 0) {
                    h7Var3.C().Z(bundleT, j14);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                ze zeVarC4 = h7Var3.C();
                String string = bundleT.getString("_ffr");
                if (com.google.android.gms.common.util.b0.b(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                h7 h7Var7 = zeVarC4.f110184a;
                if (Objects.equals(string, h7Var7.x().f110178w.a())) {
                    h7Var7.a().v().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                h7Var7.x().f110178w.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = h7Var3.C().f110184a.x().f110178w.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleT.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleT);
            boolean zP = h7Var3.w().H(null, z4.V0) ? h7Var.z().p() : h7Var3.x().f110175t.a();
            if (h7Var3.x().f110172q.a() > j11 && h7Var3.x().A(j10) && zP) {
                h7Var3.a().w().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                B("auto", "_sid", null, h7Var3.e().currentTimeMillis());
                B("auto", "_sno", null, h7Var3.e().currentTimeMillis());
                B("auto", "_se", null, h7Var3.e().currentTimeMillis());
                taVar = this;
                h7Var3.x().f110173r.b(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (bundleT.getLong(FirebaseAnalytics.d.f120665m, j12) == 1) {
                h7Var3.a().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                h7Var6.z().f110366e.b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(bundleT.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i12 = i10; i12 < size; i12++) {
                String str6 = (String) arrayList2.get(i12);
                if (str6 != null) {
                    h7Var3.C();
                    Object obj = bundleT.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i10] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleT.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i13 = i10;
            while (i13 < arrayList.size()) {
                Bundle bundleQ = (Bundle) arrayList.get(i13);
                String str7 = i13 != 0 ? "_ep" : str2;
                bundleQ.putString("_o", str5);
                if (z11) {
                    bundleQ = h7Var3.C().Q(bundleQ, null);
                }
                Bundle bundle2 = bundleQ;
                h7Var.J().c0(new zzbg(str7, new zzbe(bundle2), str5, j13), str3);
                if (!z13) {
                    Iterator it = taVar.f110534e.iterator();
                    while (it.hasNext()) {
                        ((w8) it.next()).a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                str5 = str;
                j13 = j10;
            }
            h7Var3.c();
            if (h7Var.I().q(i10) == null || !str4.equals(str2)) {
                return;
            }
            h7Var.z().f110367f.d(true, true, h7Var3.e().b());
        }
    }

    final void v0() {
        fg.a();
        h7 h7Var = this.f110184a;
        if (h7Var.w().H(null, z4.R0)) {
            if (h7Var.b().p()) {
                h7Var.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            h7Var.c();
            if (f.a()) {
                h7Var.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            h7Var.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            h7Var.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.ia
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ta taVar = this.f110085a;
                    taVar.f110184a.J().j0(atomicReference, taVar.f110184a.x().f110170o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                h7Var.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                h7Var.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.ka
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        ta taVar = this.f110190a;
                        taVar.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayR = taVar.f110184a.x().r();
                        for (zzoh zzohVar : list2) {
                            int i10 = zzohVar.f110864c;
                            if (!sparseArrayR.contains(i10) || ((Long) sparseArrayR.get(i10)).longValue() < zzohVar.f110863b) {
                                taVar.x0().add(zzohVar);
                            }
                        }
                        taVar.y0();
                    }
                });
            }
        }
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        h7.q();
        x("auto", str2, this.f110184a.e().currentTimeMillis(), bundle, false, true, true, str3);
    }

    final boolean w0() {
        return this.f110543n;
    }

    protected final void x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        int i10 = ze.f110835k;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.f110184a.b().t(new j9(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    @e.b(30)
    final PriorityQueue x0() {
        if (this.f110542m == null) {
            this.f110542m = new PriorityQueue(Comparator.comparing(la.f110233a, ma.f110256a));
        }
        return this.f110542m;
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        z("auto", "_ldl", obj, true, this.f110184a.e().currentTimeMillis());
    }

    @e.b(30)
    @androidx.annotation.m1
    final void y0() {
        zzoh zzohVar;
        h();
        this.f110543n = false;
        if (x0().isEmpty() || this.f110538i || (zzohVar = (zzoh) x0().poll()) == null) {
            return;
        }
        h7 h7Var = this.f110184a;
        androidx.privacysandbox.ads.adservices.java.measurement.a aVarH = h7Var.C().H();
        if (aVarH != null) {
            this.f110538i = true;
            u5 u5VarW = h7Var.a().w();
            String str = zzohVar.f110862a;
            u5VarW.b("Registering trigger URI", str);
            com.google.common.util.concurrent.t1<Unit> t1VarF = aVarH.f(Uri.parse(str));
            if (t1VarF != null) {
                com.google.common.util.concurrent.h1.c(t1VarF, new c9(this, zzohVar), new b9(this));
            } else {
                this.f110538i = false;
                x0().add(zzohVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void z(String str, String str2, Object obj, boolean z10, long j10) {
        int iY0;
        if (z10) {
            iY0 = this.f110184a.C().y0(str2);
        } else {
            ze zeVarC = this.f110184a.C();
            if (!zeVarC.t0("user property", str2)) {
                iY0 = 6;
            } else if (zeVarC.v0("user property", u8.f110583a, null, str2)) {
                zeVarC.f110184a.w();
                if (zeVarC.w0("user property", 24, str2)) {
                    iY0 = 0;
                } else {
                    iY0 = 6;
                }
            } else {
                iY0 = 15;
            }
        }
        if (iY0 != 0) {
            h7 h7Var = this.f110184a;
            ze zeVarC2 = h7Var.C();
            h7Var.w();
            this.f110184a.C().B(this.f110552w, null, iY0, "_ev", zeVarC2.q(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            A(str3, str2, j10, null);
            return;
        }
        h7 h7Var2 = this.f110184a;
        int iY = h7Var2.C().y(str2, obj);
        if (iY == 0) {
            Object objZ = h7Var2.C().z(str2, obj);
            if (objZ != null) {
                A(str3, str2, j10, objZ);
                return;
            }
            return;
        }
        ze zeVarC3 = h7Var2.C();
        h7Var2.w();
        this.f110184a.C().B(this.f110552w, null, iY, "_ev", zeVarC3.q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }
}
