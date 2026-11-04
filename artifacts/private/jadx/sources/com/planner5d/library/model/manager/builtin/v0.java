package com.planner5d.library.model.manager.builtin;

import androidx.annotation.m1;
import com.android.tools.r8.RecordTag;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.c2;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.application.b f181240a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.model.manager.config.p f181245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fg.e<t1> f181246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c2 f181247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.services.z f181248i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e1 f181251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.materialsmetadataloading.d f181252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.materialsmetadataloading.b.a f181253n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f181241b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f181242c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, ? extends com.planner5d.library.model.p> f181243d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f181244e = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f181249j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.planner5d.library.services.utility.m0 f181250k = new com.planner5d.library.services.utility.n0(60);

    private static final class a extends RecordTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, ? extends com.planner5d.library.model.p> f181254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, ? extends String> f181255b;

        private /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f181254a, aVar.f181254a) && Objects.equals(this.f181255b, aVar.f181255b);
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f181254a, this.f181255b};
        }

        public Map<String, ? extends String> e() {
            return this.f181255b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public Map<String, ? extends com.planner5d.library.model.p> f() {
            return this.f181254a;
        }

        public final int hashCode() {
            return u0.a(this.f181254a, this.f181255b);
        }

        public final String toString() {
            return com.planner5d.library.activity.helper.s0.a(b(), a.class, "a;b");
        }

        private a(Map<String, ? extends com.planner5d.library.model.p> materials, Map<String, ? extends String> hashes) {
            this.f181254a = materials;
            this.f181255b = hashes;
        }
    }

    @ij.a
    public v0(com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.config.p pVar, fg.e<t1> eVar, c2 c2Var, com.planner5d.library.services.z zVar, fg.e<com.planner5d.library.model.manager.y0> eVar2, fg.e<i> eVar3, fg.e<n> eVar4, com.planner5d.library.model.manager.builtin.materialsmetadataloading.d.a aVar, com.planner5d.library.model.manager.builtin.materialsmetadataloading.b.a aVar2) {
        this.f181240a = bVar;
        this.f181245f = pVar;
        this.f181246g = eVar;
        this.f181247h = c2Var;
        this.f181248i = zVar;
        e1 e1Var = new e1(eVar2, eVar3, eVar4);
        this.f181251l = e1Var;
        this.f181252m = aVar.a(e1Var);
        this.f181253n = aVar2;
    }

    @m1
    @androidx.annotation.p0
    private com.planner5d.library.model.d h() {
        try {
            synchronized (this.f181242c) {
                try {
                    com.planner5d.library.model.manager.config.p pVar = this.f181245f;
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.materialsDatafile;
                    if (!pVar.s(rVar)) {
                        return null;
                    }
                    return new com.planner5d.library.model.d(new JSONObject(this.f181245f.w(rVar, null)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean k(long j10) {
        synchronized (this.f181241b) {
            try {
                if (this.f181243d.isEmpty()) {
                    return this.f181247h.d(this.f181240a) && System.currentTimeMillis() - this.f181249j > j10 * 1000;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        q().toBlocking().lastOrDefault(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Subscriber subscriber) {
        try {
            this.f181249j = System.currentTimeMillis();
            a aVarN = n();
            this.f181251l.i(aVarN.f181255b);
            synchronized (this.f181241b) {
                this.f181243d = aVarN.f181254a;
                this.f181244e = true;
            }
        } catch (Throwable th2) {
            this.f181246g.get().u(new LogRecord("failed_to_load_materials", null, th2));
        }
        subscriber.onCompleted();
    }

    @m1
    private a n() throws Exception {
        o();
        com.planner5d.library.model.d dVarH = h();
        return new a(this.f181252m.e(dVarH), this.f181253n.a(this.f181251l, this.f181243d).e(dVarH));
    }

    @m1
    private void o() {
        File fileA = this.f181248i.a("materials_with_hashes");
        if (fileA.isFile()) {
            fileA.delete();
        }
        this.f181245f.b(com.planner5d.library.services.r.lastUpdatedMaterials);
        this.f181245f.b(com.planner5d.library.services.r.lastUpdatedHashes);
    }

    private Observable<Void> q() {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.builtin.s0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f181218a.m((Subscriber) obj);
            }
        });
    }

    @m1
    public void c() {
        this.f181250k.execute(new Runnable() { // from class: com.planner5d.library.model.manager.builtin.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f181220a.l();
            }
        });
    }

    public com.planner5d.library.model.p d(String str) {
        com.planner5d.library.model.p orDefault;
        String strC = com.planner5d.library.model.y.c(str);
        synchronized (this.f181241b) {
            try {
                orDefault = this.f181243d.getOrDefault(strC, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return orDefault;
    }

    public com.planner5d.library.model.p[] e() {
        com.planner5d.library.model.p[] pVarArr;
        synchronized (this.f181241b) {
            pVarArr = (com.planner5d.library.model.p[]) this.f181243d.values().toArray(new com.planner5d.library.model.p[0]);
        }
        return pVarArr;
    }

    @m1
    public String f(String str, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar) {
        return this.f181251l.c(d(str), aVar, bVar);
    }

    @m1
    public com.planner5d.library.services.download.g[] g(String str, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar) {
        return this.f181251l.d(h(), d(str), aVar, bVar);
    }

    @m1
    public boolean i(String str, com.planner5d.library.model.p.b bVar, com.planner5d.library.model.p.a aVar) {
        return this.f181251l.g(h(), d(str), aVar, bVar);
    }

    public boolean j() {
        boolean z10;
        synchronized (this.f181241b) {
            try {
                z10 = this.f181244e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @m1
    void p(@androidx.annotation.p0 JSONObject jSONObject) {
        if (jSONObject != null) {
            synchronized (this.f181242c) {
                this.f181245f.H(com.planner5d.library.services.r.materialsDatafile, jSONObject.toString());
            }
        }
    }

    @m1
    public void r() {
        if (k(60L)) {
            c();
        }
    }
}
