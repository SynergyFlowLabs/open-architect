package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class mb extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile eb f110257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile eb f110258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.l1
    protected eb f110259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f110260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("activityLock")
    private zzdf f110261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("activityLock")
    private volatile boolean f110262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile eb f110263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private eb f110264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("activityLock")
    private boolean f110265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f110266l;

    public mb(h7 h7Var) {
        super(h7Var);
        this.f110266l = new Object();
        this.f110260f = new ConcurrentHashMap();
    }

    @androidx.annotation.l0
    private final void F(String str, eb ebVar, boolean z10) {
        eb ebVar2;
        eb ebVar3 = this.f110257c == null ? this.f110258d : this.f110257c;
        if (ebVar.f109923b == null) {
            ebVar2 = new eb(ebVar.f109922a, str != null ? r(str, "Activity") : null, ebVar.f109924c, ebVar.f109926e, ebVar.f109927f);
        } else {
            ebVar2 = ebVar;
        }
        this.f110258d = this.f110257c;
        this.f110257c = ebVar2;
        h7 h7Var = this.f110184a;
        h7Var.b().t(new gb(this, ebVar2, ebVar3, h7Var.e().b(), z10));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    @androidx.annotation.m1
    private final void G(eb ebVar, eb ebVar2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        h();
        boolean z12 = false;
        if (ebVar2 != null) {
            if (ebVar2.f109924c == ebVar.f109924c && Objects.equals(ebVar2.f109923b, ebVar.f109923b) && Objects.equals(ebVar2.f109922a, ebVar.f109922a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f110259e != null) {
            z12 = true;
        }
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            ze.k0(ebVar, bundle2, true);
            if (ebVar2 != null) {
                String str = ebVar2.f109922a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = ebVar2.f109923b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", ebVar2.f109924c);
            }
            if (z12) {
                nd ndVar = this.f110184a.z().f110367f;
                long j12 = j10 - ndVar.f110297b;
                ndVar.f110297b = j10;
                if (j12 > 0) {
                    this.f110184a.C().Z(bundle2, j12);
                }
            }
            h7 h7Var = this.f110184a;
            if (!h7Var.w().N()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z13 = ebVar.f109926e;
            String str3 = true != z13 ? "auto" : "app";
            long jCurrentTimeMillis = h7Var.e().currentTimeMillis();
            if (z13) {
                long j13 = ebVar.f109927f;
                if (j13 == 0) {
                    j11 = jCurrentTimeMillis;
                } else {
                    j11 = j13;
                }
            } else {
                j11 = jCurrentTimeMillis;
            }
            this.f110184a.B().u(str3, "_vs", j11, bundle2);
        }
        if (z12) {
            o(this.f110259e, true, j10);
        }
        this.f110259e = ebVar;
        if (ebVar.f109926e) {
            this.f110264j = ebVar;
        }
        this.f110184a.J().u(ebVar);
    }

    @androidx.annotation.m1
    private final void o(eb ebVar, boolean z10, long j10) {
        h7 h7Var = this.f110184a;
        h7Var.M().k(h7Var.e().b());
        if (h7Var.z().f110367f.d(ebVar != null && ebVar.f109925d, z10, j10) && ebVar != null) {
            ebVar.f109925d = false;
        }
    }

    @androidx.annotation.l0
    private final eb p(@NonNull zzdf zzdfVar) {
        com.google.android.gms.common.internal.w.r(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.f109035a);
        Map map = this.f110260f;
        eb ebVar = (eb) map.get(numValueOf);
        if (ebVar == null) {
            eb ebVar2 = new eb(null, r(zzdfVar.f109036b, "Activity"), this.f110184a.C().p0());
            map.put(numValueOf, ebVar2);
            ebVar = ebVar2;
        }
        return this.f110263i != null ? this.f110263i : ebVar;
    }

    final /* synthetic */ void A(Bundle bundle, eb ebVar, eb ebVar2, long j10) {
        bundle.remove(FirebaseAnalytics.d.f120672p0);
        bundle.remove(FirebaseAnalytics.d.f120670o0);
        G(ebVar, ebVar2, j10, true, this.f110184a.C().t(null, FirebaseAnalytics.c.A, bundle, null, false));
    }

    final /* synthetic */ void B(eb ebVar, eb ebVar2, long j10, boolean z10, Bundle bundle) {
        G(ebVar, ebVar2, j10, z10, null);
    }

    final /* synthetic */ void C(eb ebVar, boolean z10, long j10) {
        o(ebVar, false, j10);
    }

    final /* synthetic */ eb D() {
        return this.f110264j;
    }

    final /* synthetic */ void E(eb ebVar) {
        this.f110264j = null;
    }

    @Override // com.google.android.gms.measurement.internal.b5
    protected final boolean m() {
        return false;
    }

    @androidx.annotation.m1
    public final eb q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f110259e;
        }
        eb ebVar = this.f110259e;
        return ebVar != null ? ebVar : this.f110264j;
    }

    @androidx.annotation.l1
    final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        h7 h7Var = this.f110184a;
        return str3.length() > h7Var.w().x(null, false) ? str3.substring(0, h7Var.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f110266l) {
            try {
                if (!this.f110265k) {
                    this.f110184a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString(FirebaseAnalytics.d.f120672p0);
                if (string != null && (string.length() <= 0 || string.length() > this.f110184a.w().x(null, false))) {
                    this.f110184a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.d.f120670o0);
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f110184a.w().x(null, false))) {
                    this.f110184a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = this.f110261g;
                    string2 = zzdfVar != null ? r(zzdfVar.f109036b, "Activity") : "Activity";
                }
                eb ebVar = this.f110257c;
                if (this.f110262h && ebVar != null) {
                    this.f110262h = false;
                    boolean zEquals = Objects.equals(ebVar.f109923b, string2);
                    boolean zEquals2 = Objects.equals(ebVar.f109922a, string);
                    if (zEquals && zEquals2) {
                        this.f110184a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                h7 h7Var = this.f110184a;
                h7Var.a().w().c("Logging screen view with name, class", string == null ? AbstractJsonLexerKt.NULL : string, string2 == null ? AbstractJsonLexerKt.NULL : string2);
                eb ebVar2 = this.f110257c == null ? this.f110258d : this.f110257c;
                eb ebVar3 = new eb(string, string2, h7Var.C().p0(), true, j10);
                this.f110257c = ebVar3;
                this.f110258d = ebVar2;
                this.f110263i = ebVar3;
                h7Var.b().t(new fb(this, bundle, ebVar3, ebVar2, h7Var.e().b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void t(@NonNull zzdf zzdfVar, @androidx.annotation.d1(max = 36, min = 1) String str, @androidx.annotation.d1(max = 36, min = 1) String str2) {
        h7 h7Var = this.f110184a;
        if (!h7Var.w().N()) {
            h7Var.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        eb ebVar = this.f110257c;
        if (ebVar == null) {
            h7Var.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f110260f;
        Integer numValueOf = Integer.valueOf(zzdfVar.f109035a);
        if (map.get(numValueOf) == null) {
            h7Var.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(zzdfVar.f109036b, "Activity");
        }
        String str3 = ebVar.f109923b;
        String str4 = ebVar.f109922a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            h7Var.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > h7Var.w().x(null, false))) {
            h7Var.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > h7Var.w().x(null, false))) {
            h7Var.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        h7Var.a().w().c("Setting current screen to name, class", str == null ? AbstractJsonLexerKt.NULL : str, str2);
        eb ebVar2 = new eb(str, str2, h7Var.C().p0());
        map.put(numValueOf, ebVar2);
        boolean z10 = true & true;
        F(zzdfVar.f109036b, ebVar2, true);
    }

    public final eb u() {
        return this.f110257c;
    }

    @androidx.annotation.l0
    public final void v(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (this.f110184a.w().N() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f110260f.put(Integer.valueOf(zzdfVar.f109035a), new eb(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @androidx.annotation.l0
    public final void w(zzdf zzdfVar) {
        Object obj = this.f110266l;
        synchronized (obj) {
            try {
                this.f110265k = true;
                if (!Objects.equals(zzdfVar, this.f110261g)) {
                    synchronized (obj) {
                        this.f110261g = zzdfVar;
                        this.f110262h = false;
                        h7 h7Var = this.f110184a;
                        if (h7Var.w().N()) {
                            this.f110263i = null;
                            h7Var.b().t(new lb(this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h7 h7Var2 = this.f110184a;
        if (!h7Var2.w().N()) {
            this.f110257c = this.f110263i;
            h7Var2.b().t(new hb(this));
            return;
        }
        F(zzdfVar.f109036b, p(zzdfVar), false);
        y1 y1VarM = this.f110184a.M();
        h7 h7Var3 = y1VarM.f110184a;
        h7Var3.b().t(new x0(y1VarM, h7Var3.e().b()));
    }

    @androidx.annotation.l0
    public final void x(zzdf zzdfVar) {
        synchronized (this.f110266l) {
            this.f110265k = false;
            this.f110262h = true;
        }
        h7 h7Var = this.f110184a;
        long jB = h7Var.e().b();
        if (!h7Var.w().N()) {
            this.f110257c = null;
            h7Var.b().t(new ib(this, jB));
        } else {
            eb ebVarP = p(zzdfVar);
            this.f110258d = this.f110257c;
            this.f110257c = null;
            h7Var.b().t(new jb(this, ebVarP, jB));
        }
    }

    @androidx.annotation.l0
    public final void y(zzdf zzdfVar, Bundle bundle) {
        eb ebVar;
        if (this.f110184a.w().N() && bundle != null && (ebVar = (eb) this.f110260f.get(Integer.valueOf(zzdfVar.f109035a))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", ebVar.f109924c);
            bundle2.putString("name", ebVar.f109922a);
            bundle2.putString("referrer_name", ebVar.f109923b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @androidx.annotation.l0
    public final void z(zzdf zzdfVar) {
        synchronized (this.f110266l) {
            try {
                if (Objects.equals(this.f110261g, zzdfVar)) {
                    this.f110261g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f110184a.w().N()) {
            this.f110260f.remove(Integer.valueOf(zzdfVar.f109035a));
        }
    }
}
