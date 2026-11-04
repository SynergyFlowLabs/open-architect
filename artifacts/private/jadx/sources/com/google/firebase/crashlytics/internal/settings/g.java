package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.f1;
import com.google.firebase.crashlytics.internal.common.h0;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.common.j0;
import com.google.firebase.crashlytics.internal.common.n0;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g implements k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f121878j = "existing_instance_identifier";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f121879k = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f121880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f121881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f121882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f121883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.a f121884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f121885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i0 f121886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference<d> f121887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference<com.google.android.gms.tasks.l<d>> f121888i;

    class a implements com.google.android.gms.tasks.k<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.concurrency.n f121889a;

        a(com.google.firebase.crashlytics.internal.concurrency.n nVar) {
            this.f121889a = nVar;
        }

        @Override // com.google.android.gms.tasks.k
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Task<Void> a(@p0 Void r10) throws Exception {
            JSONObject jSONObject = (JSONObject) this.f121889a.f121236d.i().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.settings.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g.a aVar = this.f121877a;
                    return g.this.f121885f.a(g.this.f121881b, true);
                }
            }).get();
            if (jSONObject != null) {
                d dVarB = g.this.f121882c.b(jSONObject);
                g.this.f121884e.c(dVarB.f121862c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f121881b.f121921f);
                g.this.f121887h.set(dVarB);
                ((com.google.android.gms.tasks.l) g.this.f121888i.get()).e(dVarB);
            }
            return com.google.android.gms.tasks.n.g(null);
        }
    }

    g(Context context, l lVar, h0 h0Var, i iVar, com.google.firebase.crashlytics.internal.settings.a aVar, m mVar, i0 i0Var) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f121887h = atomicReference;
        this.f121888i = new AtomicReference<>(new com.google.android.gms.tasks.l());
        this.f121880a = context;
        this.f121881b = lVar;
        this.f121883d = h0Var;
        this.f121882c = iVar;
        this.f121884e = aVar;
        this.f121885f = mVar;
        this.f121886g = i0Var;
        atomicReference.set(b.b(h0Var));
    }

    public static g l(Context context, String str, n0 n0Var, f8.b bVar, String str2, String str3, com.google.firebase.crashlytics.internal.persistence.g gVar, i0 i0Var) {
        String strG = n0Var.g();
        f1 f1Var = new f1();
        return new g(context, new l(str, n0Var.h(), n0Var.i(), n0Var.j(), n0Var, com.google.firebase.crashlytics.internal.common.i.h(com.google.firebase.crashlytics.internal.common.i.n(context), str, str3, str2), str3, str2, j0.l(strG).n()), f1Var, new i(f1Var), new com.google.firebase.crashlytics.internal.settings.a(gVar), new c(String.format(Locale.US, f121879k, str), bVar), i0Var);
    }

    private d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f121884e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f121882c.b(jSONObjectB);
                    if (dVarB == null) {
                        com.google.firebase.crashlytics.internal.g.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(jSONObjectB, "Loaded cached settings: ");
                    long jA = this.f121883d.a();
                    if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && dVarB.a(jA)) {
                        com.google.firebase.crashlytics.internal.g.f().k("Cached settings have expired.");
                        return null;
                    }
                    try {
                        com.google.firebase.crashlytics.internal.g.f().k("Returning cached settings.");
                        return dVarB;
                    } catch (Exception e10) {
                        e = e10;
                        dVar = dVarB;
                        com.google.firebase.crashlytics.internal.g.f().e("Failed to get cached settings", e);
                        return dVar;
                    }
                }
                com.google.firebase.crashlytics.internal.g.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.i.r(this.f121880a).getString(f121878j, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        com.google.firebase.crashlytics.internal.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @e.a({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = com.google.firebase.crashlytics.internal.common.i.r(this.f121880a).edit();
        editorEdit.putString(f121878j, str);
        editorEdit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.k
    public d a() {
        return this.f121887h.get();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.k
    public Task<d> b() {
        return this.f121888i.get().a();
    }

    boolean k() {
        return !n().equals(this.f121881b.f121921f);
    }

    public Task<Void> o(com.google.firebase.crashlytics.internal.concurrency.n nVar) {
        return p(e.USE_CACHE, nVar);
    }

    public Task<Void> p(e eVar, com.google.firebase.crashlytics.internal.concurrency.n nVar) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f121887h.set(dVarM);
            this.f121888i.get().e(dVarM);
            return com.google.android.gms.tasks.n.g(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f121887h.set(dVarM2);
            this.f121888i.get().e(dVarM2);
        }
        return this.f121886g.k().w(nVar.f121233a, new a(nVar));
    }
}
