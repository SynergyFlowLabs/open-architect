package com.planner5d.library.model.manager.synchronization;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.c0;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.d5;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.o3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f222166o = 2097152;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.model.manager.contest.g f222167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f222168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.e<t1> f222169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f222170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f222171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b4 f222172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d5 f222173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.api.requests.c f222174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f222175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f222176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f222177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Long f222178l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f222179m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f222180n;

    private enum a {
        SAVE_SYNCHRONIZATION_TIME,
        DROP_SYNCHRONIZATION_TIME
    }

    @ij.a
    public d(com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.contest.g gVar, c0 c0Var, fg.e<t1> eVar, d0 d0Var, p pVar, b4 b4Var, d5 d5Var, com.planner5d.library.api.requests.c cVar) {
        this.f222167a = gVar;
        this.f222168b = c0Var;
        this.f222169c = eVar;
        this.f222170d = d0Var;
        this.f222171e = pVar;
        this.f222172f = b4Var;
        this.f222173g = d5Var;
        this.f222174h = cVar;
        this.f222175i = bVar.getPackageName();
        this.f222176j = h3.j(bVar);
        this.f222177k = gVar.getClass().getName();
    }

    @m1
    private void A(boolean z10, JSONObject jSONObject, HashMap<String, kb.b<?>> map, id.a aVar) throws JSONException {
        String str = (z10 ? r.post : r.put).f224891a;
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            for (String str2 : map.keySet()) {
                if (!jSONObject2.has(str2)) {
                    return;
                }
                JSONArray jSONArray = jSONObject2.getJSONArray(str2);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    jSONObject3.put(r.synchronizedKey.f224891a, true);
                    kb.b<?> bVar = map.get(str2);
                    if (bVar != null) {
                        bVar.l(aVar, jSONObject3);
                    }
                }
            }
        }
    }

    @NonNull
    private List<Long> B(List<Long> list, long j10) {
        ArrayList arrayList = new ArrayList();
        for (Long l10 : list) {
            if (l10.longValue() > j10) {
                arrayList.add(l10);
            }
        }
        return arrayList;
    }

    @m1
    private void C() {
        synchronized (this.f222179m) {
            try {
                E(this.f222167a, this.f222180n == a.DROP_SYNCHRONIZATION_TIME ? null : new Date());
                this.f222180n = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    private void D(String str, @p0 Long l10) {
        this.f222173g.d(o(r.synchronizationLast, str), l10);
    }

    @m1
    private void F(id.a aVar) {
        try {
            this.f222167a.l0(aVar);
            C();
        } catch (Throwable unused) {
            C();
        }
    }

    @m1
    private void G(List<SynchronizedModel> list, id.a aVar) {
        for (final n nVar : e(list, aVar)) {
            y((com.planner5d.library.api.c) this.f222174h.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.synchronization.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).m((id.a) obj2, nVar.f());
                }
            }), nVar.d(), aVar);
        }
    }

    @m1
    private void H(id.a aVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f222168b.k(aVar));
        linkedList.addAll(this.f222170d.k(aVar));
        I(linkedList, aVar);
        G(linkedList, aVar);
    }

    @m1
    private void I(List<SynchronizedModel> list, id.a aVar) {
        LinkedList linkedList = new LinkedList();
        for (SynchronizedModel synchronizedModel : list) {
            if ((synchronizedModel instanceof Folder) && synchronizedModel.uid == null) {
                linkedList.add(synchronizedModel);
            }
        }
        Iterator<SynchronizedModel> it = linkedList.iterator();
        while (it.hasNext()) {
            list.remove(it.next());
        }
        G(linkedList, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x000c A[SYNTHETIC] */
    @m1
    private List<n> e(List<SynchronizedModel> list, id.a aVar) {
        n.a aVar2;
        n nVar = new n();
        for (SynchronizedModel synchronizedModel : list) {
            if (!synchronizedModel.deleted) {
                if (synchronizedModel.uid == null) {
                    SynchronizedModel synchronizedModelY = synchronizedModel instanceof Project ? this.f222170d.Y(aVar, synchronizedModel.getId().longValue()) : synchronizedModel instanceof Folder ? this.f222168b.y(aVar, synchronizedModel.getId().longValue()) : null;
                    if (synchronizedModelY != null) {
                        synchronizedModel.uid = synchronizedModelY.uid;
                    }
                    aVar2 = synchronizedModel.uid == null ? n.a.Create : n.a.Update;
                } else if (synchronizedModel.modifiedLocally) {
                    aVar2 = n.a.Update;
                }
                if (synchronizedModel instanceof Project) {
                    nVar.a(aVar2, synchronizedModel, this.f222170d.w(aVar, (Project) synchronizedModel));
                } else if (synchronizedModel instanceof Folder) {
                    nVar.a(aVar2, synchronizedModel, this.f222168b.w(aVar, (Folder) synchronizedModel));
                }
            } else if (synchronizedModel.uid != null) {
                aVar2 = n.a.Delete;
                try {
                    if (synchronizedModel instanceof Project) {
                        nVar.a(aVar2, synchronizedModel, this.f222170d.w(aVar, (Project) synchronizedModel));
                    } else if (synchronizedModel instanceof Folder) {
                        nVar.a(aVar2, synchronizedModel, this.f222168b.w(aVar, (Folder) synchronizedModel));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return nVar.e(2097152L);
    }

    @m1
    private void f(JSONArray jSONArray, kb.b<?> bVar, id.a aVar) throws JSONException {
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.l(aVar, jSONArray.getJSONObject(i10));
        }
    }

    @e.a({"ApplySharedPref"})
    @m1
    private void g(id.a aVar, String str) throws Throwable {
        String strD = this.f222171e.D(str, null);
        Long l10 = null;
        while (true) {
            com.planner5d.library.api.c cVarN = n(aVar, l10 == null ? null : String.valueOf(l10), strD);
            Long lW = w(cVarN, aVar);
            if (lW == null) {
                this.f222171e.B(str, cVarN.a().getString(r.date.f224891a));
                return;
            }
            l10 = lW;
        }
    }

    @e.a({"ApplySharedPref"})
    @m1
    private void h(id.a aVar, String str) throws Exception {
        com.planner5d.library.api.c cVar;
        String str2 = r.projects.f224891a;
        String str3 = str + "_thumbnails_" + str2;
        final String strD = this.f222171e.D(str3, null);
        final AtomicReference atomicReference = new AtomicReference(null);
        do {
            cVar = (com.planner5d.library.api.c) this.f222174h.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.synchronization.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return this.f222163a.s(strD, atomicReference, (com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            });
            if (cVar == null) {
                return;
            }
            x(cVar.a().getJSONArray(str2), aVar);
            atomicReference.set(k1.v(cVar.a(), r.last));
        } while (atomicReference.get() != null);
        this.f222171e.B(str3, cVar.a().getString(r.date.f224891a));
    }

    @m1
    private void i(String str, long j10) {
        synchronized (this.f222179m) {
            try {
                String strO = o(r.synchronizationNext, str);
                this.f222173g.e(strO, B(this.f222173g.b(strO, new ArrayList()), j10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    private void l(id.a aVar, String str, boolean z10) throws Exception {
        if (p(z10)) {
            F(aVar);
        }
        g(aVar, str);
        this.f222172f.R0(aVar).toBlocking().firstOrDefault(null);
        H(aVar);
        h(aVar, str);
    }

    @m1
    private void m(id.a aVar, String str) throws Throwable {
        g(aVar, str);
        H(aVar);
    }

    private com.planner5d.library.api.c n(id.a aVar, final String str, final String str2) {
        return (com.planner5d.library.api.c) this.f222174h.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.synchronization.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.f222159a.t(str, str2, (com.planner5d.library.api.b) obj, (id.a) obj2);
            }
        });
    }

    @NonNull
    private String o(r rVar, String str) {
        return rVar.f224891a + "_" + str;
    }

    @m1
    private boolean p(boolean z10) {
        synchronized (this.f222179m) {
            if (!z10) {
                try {
                    if (!q(this.f222167a)) {
                        return false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f222180n = a.SAVE_SYNCHRONIZATION_TIME;
            return true;
        }
    }

    @m1
    private boolean r(String str, long j10) {
        Iterator<Long> it = this.f222173g.b(o(r.synchronizationNext, str), Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            if (it.next().longValue() <= j10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.api.c s(String str, AtomicReference atomicReference, com.planner5d.library.api.b bVar, id.a aVar) {
        return bVar.F0(aVar, str, atomicReference.get() == null ? null : String.valueOf(this.f222178l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.api.c t(String str, String str2, com.planner5d.library.api.b bVar, id.a aVar) {
        return str == null ? bVar.w0(aVar, str2, this.f222175i, this.f222176j) : bVar.J0(aVar, str2, str, this.f222175i, this.f222176j);
    }

    private void u(long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l10 = this.f222178l;
        if (l10 != null && jCurrentTimeMillis - l10.longValue() < j10) {
            o3.c(Math.min(j10, Math.max(1L, j10 - (jCurrentTimeMillis - this.f222178l.longValue()))));
        }
        this.f222178l = Long.valueOf(jCurrentTimeMillis);
    }

    @m1
    private void v(Throwable th2) {
        fg.e<t1> eVar = this.f222169c;
        if (eVar == null) {
            throw new RuntimeException(th2);
        }
        eVar.get().u(new LogRecord("synchronization", null, th2));
    }

    @m1
    private Long w(com.planner5d.library.api.c cVar, id.a aVar) throws JSONException {
        f(cVar.a().getJSONArray(r.folders.f224891a), this.f222168b, aVar);
        f(cVar.a().getJSONArray(r.projects.f224891a), this.f222170d, aVar);
        return k1.v(cVar.a(), r.last);
    }

    @m1
    private void x(JSONArray jSONArray, id.a aVar) throws Exception {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            this.f222170d.R0(jSONObject.getString(r.hash.f224891a), jSONObject.getString(r.uri.f224891a), aVar);
        }
    }

    @m1
    private void y(com.planner5d.library.api.c cVar, List<SynchronizedModel> list, id.a aVar) {
        try {
            HashMap<String, kb.b<?>> map = new HashMap<>();
            map.put(r.folders.f224891a, this.f222168b);
            map.put(r.projects.f224891a, this.f222170d);
            A(false, cVar.a(), map, aVar);
            A(true, cVar.a(), map, aVar);
            z(list);
        } catch (JSONException unused) {
        }
    }

    @m1
    private void z(List<SynchronizedModel> list) {
        for (SynchronizedModel synchronizedModel : list) {
            if (synchronizedModel.deleted) {
                synchronizedModel.delete();
            }
        }
    }

    @m1
    public void E(kb.b<?> bVar, @p0 Date date) {
        D(bVar.getClass().getName(), date != null ? Long.valueOf(date.getTime()) : null);
    }

    @m1
    public void d(kb.b<?> bVar, long j10) {
        synchronized (this.f222179m) {
            try {
                String strO = o(r.synchronizationNext, bVar.getClass().getName());
                ArrayList arrayList = new ArrayList(this.f222173g.b(strO, Collections.EMPTY_LIST));
                arrayList.add(Long.valueOf(j10));
                this.f222173g.e(strO, arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    public void j(kb.b<?> bVar) {
        String name = bVar.getClass().getName();
        if (!(bVar instanceof com.planner5d.library.model.manager.contest.g)) {
            this.f222173g.c(o(r.synchronizationLast, name));
            return;
        }
        synchronized (this.f222179m) {
            try {
                if (this.f222180n != null) {
                    this.f222180n = a.DROP_SYNCHRONIZATION_TIME;
                } else {
                    this.f222173g.c(o(r.synchronizationLast, name));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    public void k(@p0 SynchronizedModel synchronizedModel, @NonNull id.a aVar, boolean z10, boolean z11) throws Throwable {
        u(1500L);
        try {
            if (synchronizedModel != null) {
                G(Collections.singletonList(synchronizedModel), aVar);
                return;
            }
            try {
                if (z11) {
                    m(aVar, "synchronization_user_" + aVar.f287075a);
                    return;
                }
                l(aVar, "synchronization_user_" + aVar.f287075a, z10);
            } catch (JSONException e10) {
                v(e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (!(th2 instanceof com.planner5d.library.api.e) || th2.a() != com.planner5d.library.api.e.b.NETWORK) {
                v(th2);
            }
            throw th2;
        }
    }

    @m1
    public boolean q(@p0 kb.b<?> bVar) {
        if (bVar instanceof com.planner5d.library.model.manager.contest.g) {
            String str = this.f222177k;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (r(str, jCurrentTimeMillis)) {
                i(str, jCurrentTimeMillis);
                return true;
            }
            Long lA = this.f222173g.a(o(r.synchronizationLast, str), null);
            if (lA != null && jCurrentTimeMillis - lA.longValue() < TimeUnit.HOURS.toMillis(2L) && !this.f222167a.Z()) {
                return false;
            }
        }
        return true;
    }
}
