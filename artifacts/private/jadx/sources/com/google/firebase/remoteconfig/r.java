package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.n1;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f124761n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f124762o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final double f124763p = 0.0d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f124764q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f124765r = new byte[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f124766s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f124767t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f124768u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f124769v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f124770w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f124771x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f124772y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f124773z = "FirebaseRemoteConfig";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f124774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.h f124775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final com.google.firebase.abt.d f124776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f124777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f124778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f124779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f124780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.n f124781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.p f124782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.u f124783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.firebase.installations.k f124784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.q f124785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.rollouts.e f124786m;

    r(Context context, com.google.firebase.h hVar, com.google.firebase.installations.k kVar, @p0 com.google.firebase.abt.d dVar, Executor executor, com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2, com.google.firebase.remoteconfig.internal.g gVar3, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.p pVar, com.google.firebase.remoteconfig.internal.u uVar, com.google.firebase.remoteconfig.internal.q qVar, com.google.firebase.remoteconfig.internal.rollouts.e eVar) {
        this.f124774a = context;
        this.f124775b = hVar;
        this.f124784k = kVar;
        this.f124776c = dVar;
        this.f124777d = executor;
        this.f124778e = gVar;
        this.f124779f = gVar2;
        this.f124780g = gVar3;
        this.f124781h = nVar;
        this.f124782i = pVar;
        this.f124783j = uVar;
        this.f124785l = qVar;
        this.f124786m = eVar;
    }

    private static boolean B(com.google.firebase.remoteconfig.internal.h hVar, @p0 com.google.firebase.remoteconfig.internal.h hVar2) {
        if (hVar2 != null && hVar.h().equals(hVar2.h())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C(Task<com.google.firebase.remoteconfig.internal.h> task) {
        if (!task.u()) {
            return false;
        }
        this.f124778e.d();
        com.google.firebase.remoteconfig.internal.h hVarQ = task.q();
        if (hVarQ == null) {
            return true;
        }
        N(hVarQ.e());
        this.f124786m.d(hVarQ);
        return true;
    }

    private Task<Void> K(Map<String, String> map) {
        try {
            return this.f124780g.k(com.google.firebase.remoteconfig.internal.h.l().b(map).a()).w(com.google.firebase.concurrent.y.a(), new com.google.android.gms.tasks.k() { // from class: com.google.firebase.remoteconfig.i
                @Override // com.google.android.gms.tasks.k
                public final Task a(Object obj) {
                    return com.google.android.gms.tasks.n.g(null);
                }
            });
        } catch (JSONException unused) {
            return com.google.android.gms.tasks.n.g(null);
        }
    }

    @l1
    static List<Map<String, String>> M(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public static /* synthetic */ Void a(r rVar, x xVar) {
        rVar.f124783j.o(xVar);
        return null;
    }

    public static /* synthetic */ Void c(r rVar, f fVar) {
        rVar.f124783j.q(fVar.f124466a);
        return null;
    }

    public static /* synthetic */ v e(Task task, Task task2) {
        return (v) task.q();
    }

    public static /* synthetic */ Task i(final r rVar, Task task, Task task2, Task task3) {
        rVar.getClass();
        if (!task.u() || task.q() == null) {
            return com.google.android.gms.tasks.n.g(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.h hVar = (com.google.firebase.remoteconfig.internal.h) task.q();
        return (!task2.u() || B(hVar, (com.google.firebase.remoteconfig.internal.h) task2.q())) ? rVar.f124779f.k(hVar).m(rVar.f124777d, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.j
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task4) {
                return Boolean.valueOf(this.f124739a.C(task4));
            }
        }) : com.google.android.gms.tasks.n.g(Boolean.FALSE);
    }

    public static /* synthetic */ Void j(r rVar) {
        rVar.f124779f.d();
        rVar.f124778e.d();
        rVar.f124780g.d();
        rVar.f124783j.a();
        return null;
    }

    @NonNull
    public static r u() {
        return v(com.google.firebase.h.p());
    }

    @NonNull
    public static r v(@NonNull com.google.firebase.h hVar) {
        return ((d0) hVar.l(d0.class)).g();
    }

    @NonNull
    public y A(@NonNull String str) {
        return this.f124782i.q(str);
    }

    @NonNull
    public Task<Void> D() {
        return com.google.android.gms.tasks.n.d(this.f124777d, new Callable() { // from class: com.google.firebase.remoteconfig.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.j(this.f124755a);
            }
        });
    }

    public void E(Runnable runnable) {
        this.f124777d.execute(runnable);
    }

    @NonNull
    public Task<Void> F(@NonNull final x xVar) {
        return com.google.android.gms.tasks.n.d(this.f124777d, new Callable() { // from class: com.google.firebase.remoteconfig.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.a(this.f124756a, xVar);
            }
        });
    }

    void G(boolean z10) {
        this.f124785l.e(z10);
    }

    @NonNull
    public Task<Void> H(@NonNull final f fVar) {
        return com.google.android.gms.tasks.n.d(this.f124777d, new Callable() { // from class: com.google.firebase.remoteconfig.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.c(this.f124753a, fVar);
            }
        });
    }

    @NonNull
    public Task<Void> I(@n1 int i10) {
        return K(com.google.firebase.remoteconfig.internal.w.a(this.f124774a, i10));
    }

    @NonNull
    public Task<Void> J(@NonNull Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put(entry.getKey(), new String((byte[]) value));
            } else {
                map2.put(entry.getKey(), value.toString());
            }
        }
        return K(map2);
    }

    void L() {
        this.f124779f.f();
        this.f124780g.f();
        this.f124778e.f();
    }

    @l1
    void N(@NonNull JSONArray jSONArray) {
        if (this.f124776c == null) {
            return;
        }
        try {
            this.f124776c.m(M(jSONArray));
        } catch (com.google.firebase.abt.a | JSONException unused) {
        }
    }

    @NonNull
    public Task<Boolean> k() {
        final Task<com.google.firebase.remoteconfig.internal.h> taskF = this.f124778e.f();
        final Task<com.google.firebase.remoteconfig.internal.h> taskF2 = this.f124779f.f();
        return com.google.android.gms.tasks.n.m(taskF, taskF2).o(this.f124777d, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.g
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task) {
                return r.i(this.f124474a, taskF, taskF2, task);
            }
        });
    }

    @NonNull
    public e l(@NonNull d dVar) {
        return this.f124785l.b(dVar);
    }

    @NonNull
    public Task<v> m() {
        Task<com.google.firebase.remoteconfig.internal.h> taskF = this.f124779f.f();
        Task<com.google.firebase.remoteconfig.internal.h> taskF2 = this.f124780g.f();
        Task<com.google.firebase.remoteconfig.internal.h> taskF3 = this.f124778e.f();
        final Task taskD = com.google.android.gms.tasks.n.d(this.f124777d, new Callable() { // from class: com.google.firebase.remoteconfig.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f124758a.t();
            }
        });
        return com.google.android.gms.tasks.n.m(taskF, taskF2, taskF3, taskD, this.f124784k.getId(), this.f124784k.b(false)).m(this.f124777d, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.p
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task) {
                return r.e(taskD, task);
            }
        });
    }

    @NonNull
    public Task<Void> n() {
        return this.f124781h.i().w(com.google.firebase.concurrent.y.a(), new com.google.android.gms.tasks.k() { // from class: com.google.firebase.remoteconfig.h
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                return com.google.android.gms.tasks.n.g(null);
            }
        });
    }

    @NonNull
    public Task<Void> o(long j10) {
        return this.f124781h.j(j10).w(com.google.firebase.concurrent.y.a(), new com.google.android.gms.tasks.k() { // from class: com.google.firebase.remoteconfig.k
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                return com.google.android.gms.tasks.n.g(null);
            }
        });
    }

    @NonNull
    public Task<Boolean> p() {
        return n().w(this.f124777d, new com.google.android.gms.tasks.k() { // from class: com.google.firebase.remoteconfig.q
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                return this.f124760a.k();
            }
        });
    }

    @NonNull
    public Map<String, y> q() {
        return this.f124782i.d();
    }

    public boolean r(@NonNull String str) {
        return this.f124782i.e(str);
    }

    public double s(@NonNull String str) {
        return this.f124782i.h(str);
    }

    @NonNull
    public v t() {
        return this.f124783j.e();
    }

    @NonNull
    public Set<String> w(@NonNull String str) {
        return this.f124782i.k(str);
    }

    public long x(@NonNull String str) {
        return this.f124782i.m(str);
    }

    com.google.firebase.remoteconfig.internal.rollouts.e y() {
        return this.f124786m;
    }

    @NonNull
    public String z(@NonNull String str) {
        return this.f124782i.o(str);
    }
}
