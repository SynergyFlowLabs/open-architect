package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class c0 extends androidx.work.k0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f76742j = androidx.work.v.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f76743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.m f76745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<? extends androidx.work.o0> f76746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f76747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f76748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<c0> f76749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f76750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.work.a0 f76751i;

    public c0(@NonNull r0 workManagerImpl, @NonNull List<? extends androidx.work.o0> work) {
        this(workManagerImpl, null, androidx.work.m.KEEP, work, null);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    private static boolean p(@NonNull c0 continuation, @NonNull Set<String> visited) {
        visited.addAll(continuation.j());
        Set<String> setS = s(continuation);
        Iterator<String> it = visited.iterator();
        while (it.hasNext()) {
            if (setS.contains(it.next())) {
                return true;
            }
        }
        List<c0> listL = continuation.l();
        if (listL != null && !listL.isEmpty()) {
            Iterator<c0> it2 = listL.iterator();
            while (it2.hasNext()) {
                if (p(it2.next(), visited)) {
                    return true;
                }
            }
        }
        visited.removeAll(continuation.j());
        return false;
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static Set<String> s(@NonNull c0 continuation) {
        HashSet hashSet = new HashSet();
        List<c0> listL = continuation.l();
        if (listL != null && !listL.isEmpty()) {
            Iterator<c0> it = listL.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().j());
            }
        }
        return hashSet;
    }

    @Override // androidx.work.k0
    @NonNull
    protected androidx.work.k0 b(@NonNull List<androidx.work.k0> continuations) {
        androidx.work.y yVarB = new androidx.work.y.a(CombineContinuationsWorker.class).C(ArrayCreatingInputMerger.class).b();
        ArrayList arrayList = new ArrayList(continuations.size());
        Iterator<androidx.work.k0> it = continuations.iterator();
        while (it.hasNext()) {
            arrayList.add((c0) it.next());
        }
        return new c0(this.f76743a, null, androidx.work.m.KEEP, Collections.singletonList(yVarB), arrayList);
    }

    @Override // androidx.work.k0
    @NonNull
    public androidx.work.a0 c() {
        if (this.f76750h) {
            androidx.work.v.e().l(f76742j, "Already enqueued work ids (" + TextUtils.join(", ", this.f76747e) + ")");
        } else {
            androidx.work.impl.utils.d dVar = new androidx.work.impl.utils.d(this);
            this.f76743a.U().b(dVar);
            this.f76751i = dVar.d();
        }
        return this.f76751i;
    }

    @Override // androidx.work.k0
    @NonNull
    public t1<List<androidx.work.l0>> d() {
        androidx.work.impl.utils.z<List<androidx.work.l0>> zVarA = androidx.work.impl.utils.z.a(this.f76743a, this.f76748f);
        this.f76743a.U().b(zVarA);
        return zVarA.f();
    }

    @Override // androidx.work.k0
    @NonNull
    public androidx.lifecycle.w0<List<androidx.work.l0>> e() {
        return this.f76743a.T(this.f76748f);
    }

    @Override // androidx.work.k0
    @NonNull
    public androidx.work.k0 g(@NonNull List<androidx.work.y> work) {
        return work.isEmpty() ? this : new c0(this.f76743a, this.f76744b, androidx.work.m.KEEP, work, Collections.singletonList(this));
    }

    @NonNull
    public List<String> h() {
        return this.f76748f;
    }

    @NonNull
    public androidx.work.m i() {
        return this.f76745c;
    }

    @NonNull
    public List<String> j() {
        return this.f76747e;
    }

    @androidx.annotation.p0
    public String k() {
        return this.f76744b;
    }

    @androidx.annotation.p0
    public List<c0> l() {
        return this.f76749g;
    }

    @NonNull
    public List<? extends androidx.work.o0> m() {
        return this.f76746d;
    }

    @NonNull
    public r0 n() {
        return this.f76743a;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public boolean o() {
        return p(this, new HashSet());
    }

    public boolean q() {
        return this.f76750h;
    }

    public void r() {
        this.f76750h = true;
    }

    public c0(@NonNull r0 workManagerImpl, @androidx.annotation.p0 String name, @NonNull androidx.work.m existingWorkPolicy, @NonNull List<? extends androidx.work.o0> work) {
        this(workManagerImpl, name, existingWorkPolicy, work, null);
    }

    public c0(@NonNull r0 workManagerImpl, @androidx.annotation.p0 String name, @NonNull androidx.work.m existingWorkPolicy, @NonNull List<? extends androidx.work.o0> work, @androidx.annotation.p0 List<c0> parents) {
        this.f76743a = workManagerImpl;
        this.f76744b = name;
        this.f76745c = existingWorkPolicy;
        this.f76746d = work;
        this.f76749g = parents;
        this.f76747e = new ArrayList(work.size());
        this.f76748f = new ArrayList();
        if (parents != null) {
            Iterator<c0> it = parents.iterator();
            while (it.hasNext()) {
                this.f76748f.addAll(it.next().f76748f);
            }
        }
        for (int i10 = 0; i10 < work.size(); i10++) {
            if (existingWorkPolicy == androidx.work.m.REPLACE && work.get(i10).d().D() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = work.get(i10).b();
            this.f76747e.add(strB);
            this.f76748f.add(strB);
        }
    }
}
