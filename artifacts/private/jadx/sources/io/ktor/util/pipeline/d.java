package io.ktor.util.pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipeline.kt\nio/ktor/util/pipeline/Pipeline\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,539:1\n1563#2:540\n1634#2,3:541\n1869#2,2:544\n808#2,11:546\n295#2,2:557\n1869#2,2:559\n*S KotlinDebug\n*F\n+ 1 Pipeline.kt\nio/ktor/util/pipeline/Pipeline\n*L\n60#1:540\n60#1:541,3\n83#1:544,2\n195#1:546,11\n196#1:557,2\n236#1:559,2\n*E\n"})
public class d<TSubject, TContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.b f296767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f296768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Object> f296769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f296770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f296771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private j f296772f;

    @NotNull
    private volatile /* synthetic */ Object interceptors$delegate;

    public d(@NotNull j... phases) {
        Intrinsics.checkNotNullParameter(phases, "phases");
        this.f296767a = io.ktor.util.d.a(true);
        this.f296769c = CollectionsKt.mutableListOf(Arrays.copyOf(phases, phases.length));
        this.interceptors$delegate = null;
    }

    private final void A() {
        B(null);
        this.f296771e = false;
        this.f296772f = null;
    }

    private final void B(List<? extends pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> list) {
        this.interceptors$delegate = list;
    }

    private final void C(d<TSubject, TContext> dVar) {
        B(dVar.E());
        this.f296771e = true;
        this.f296772f = null;
    }

    private final void D(c<TSubject, TContext> cVar) {
        B(cVar.m());
        this.f296771e = false;
        this.f296772f = cVar.g();
    }

    private final List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> E() {
        if (k() == null) {
            c();
        }
        this.f296771e = true;
        List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> listK = k();
        Intrinsics.checkNotNull(listK);
        return listK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean F(j jVar, pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> listK = k();
        if (this.f296769c.isEmpty() || listK == null || this.f296771e || !r1.F(listK)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f296772f, jVar)) {
            listK.add(nVar);
            return true;
        }
        if (!Intrinsics.areEqual(jVar, CollectionsKt.last((List) this.f296769c)) && h(jVar) != CollectionsKt.getLastIndex(this.f296769c)) {
            return false;
        }
        c<TSubject, TContext> cVarG = g(jVar);
        Intrinsics.checkNotNull(cVarG);
        cVarG.b(nVar);
        listK.add(nVar);
        return true;
    }

    private final List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> c() {
        int lastIndex;
        int i10 = this.f296770d;
        if (i10 == 0) {
            x(CollectionsKt.emptyList());
            return CollectionsKt.emptyList();
        }
        List<Object> list = this.f296769c;
        int i11 = 0;
        if (i10 == 1 && (lastIndex = CollectionsKt.getLastIndex(list)) >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i12);
                c<TSubject, TContext> cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && !cVar.k()) {
                    List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> listM = cVar.m();
                    D(cVar);
                    return listM;
                }
                if (i12 == lastIndex) {
                    break;
                }
                i12++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int lastIndex2 = CollectionsKt.getLastIndex(list);
        if (lastIndex2 >= 0) {
            while (true) {
                Object obj2 = list.get(i11);
                c cVar2 = obj2 instanceof c ? (c) obj2 : null;
                if (cVar2 != null) {
                    cVar2.d(arrayList);
                }
                if (i11 == lastIndex2) {
                    break;
                }
                i11++;
            }
        }
        x(arrayList);
        return arrayList;
    }

    private final e<TSubject, TContext> d(TContext tcontext, TSubject tsubject, CoroutineContext coroutineContext) {
        return f.a(tcontext, E(), tsubject, coroutineContext, j());
    }

    private final boolean f(d<TSubject, TContext> dVar) {
        if (dVar.f296769c.isEmpty()) {
            return true;
        }
        int i10 = 0;
        if (!this.f296769c.isEmpty()) {
            return false;
        }
        List<Object> list = dVar.f296769c;
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            while (true) {
                Object obj = list.get(i10);
                if (obj instanceof j) {
                    this.f296769c.add(obj);
                } else if (obj instanceof c) {
                    c cVar = (c) obj;
                    this.f296769c.add(new c(cVar.g(), cVar.h(), cVar.m()));
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        this.f296770d += dVar.f296770d;
        C(dVar);
        return true;
    }

    private final c<TSubject, TContext> g(j jVar) {
        List<Object> list = this.f296769c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == jVar) {
                c<TSubject, TContext> cVar = new c<>(jVar, k.c.f296785a);
                list.set(i10, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c<TSubject, TContext> cVar2 = (c) obj;
                if (cVar2.g() == jVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final int h(j jVar) {
        List<Object> list = this.f296769c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == jVar || ((obj instanceof c) && ((c) obj).g() == jVar)) {
                return i10;
            }
        }
        return -1;
    }

    private final List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> k() {
        return (List) this.interceptors$delegate;
    }

    private final boolean m(j jVar) {
        List<Object> list = this.f296769c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == jVar) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).g() == jVar) {
                return true;
            }
        }
        return false;
    }

    private final boolean p(Object obj, j jVar) throws b {
        k kVarH;
        if (obj == jVar) {
            kVarH = k.c.f296785a;
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
            kVarH = ((c) obj).h();
        }
        if (kVarH instanceof k.c) {
            a(jVar);
            return true;
        }
        if (kVarH instanceof k.b) {
            k.b bVar = (k.b) kVarH;
            if (m(bVar.a())) {
                o(bVar.a(), jVar);
                return true;
            }
        }
        if (!(kVarH instanceof k.a)) {
            return false;
        }
        n(((k.a) kVarH).a(), jVar);
        return true;
    }

    private final void v(d<TSubject, TContext> dVar) {
        if (this.f296770d == 0) {
            C(dVar);
        } else {
            A();
        }
        for (Object obj : dVar.f296769c) {
            j jVarG = obj instanceof j ? (j) obj : null;
            if (jVarG == null) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                jVarG = ((c) obj).g();
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!cVar.k()) {
                    c<TSubject, TContext> cVarG = g(jVarG);
                    Intrinsics.checkNotNull(cVarG);
                    cVar.c(cVarG);
                    this.f296770d += cVar.j();
                }
            }
        }
    }

    private final void x(List<? extends pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> list) {
        B(list);
        this.f296771e = false;
        this.f296772f = null;
    }

    public final void a(@NotNull j phase) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (m(phase)) {
            return;
        }
        this.f296769c.add(phase);
    }

    public void b() {
    }

    @Nullable
    public final Object e(@NotNull TContext tcontext, @NotNull TSubject tsubject, @NotNull kotlin.coroutines.d<? super TSubject> dVar) {
        return d(tcontext, tsubject, dVar.getContext()).c(tsubject, dVar);
    }

    @NotNull
    public final io.ktor.util.b i() {
        return this.f296767a;
    }

    public boolean j() {
        return this.f296768b;
    }

    @NotNull
    public final List<j> l() {
        List<Object> list = this.f296769c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            j jVar = obj instanceof j ? (j) obj : null;
            if (jVar == null) {
                c cVar = obj instanceof c ? (c) obj : null;
                j jVarG = cVar != null ? cVar.g() : null;
                Intrinsics.checkNotNull(jVarG);
                jVar = jVarG;
            }
            arrayList.add(jVar);
        }
        return arrayList;
    }

    public final void n(@NotNull j reference, @NotNull j phase) throws b {
        k kVarH;
        j jVarA;
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (m(phase)) {
            return;
        }
        int iH = h(reference);
        if (iH == -1) {
            throw new b("Phase " + reference + " was not registered for this pipeline");
        }
        int i10 = iH + 1;
        int lastIndex = CollectionsKt.getLastIndex(this.f296769c);
        if (i10 <= lastIndex) {
            while (true) {
                Object obj = this.f296769c.get(i10);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && (kVarH = cVar.h()) != null) {
                    k.a aVar = kVarH instanceof k.a ? (k.a) kVarH : null;
                    if (aVar != null && (jVarA = aVar.a()) != null && Intrinsics.areEqual(jVarA, reference)) {
                        iH = i10;
                    }
                    if (i10 == lastIndex) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f296769c.add(iH + 1, new c(phase, new k.a(reference)));
    }

    public final void o(@NotNull j reference, @NotNull j phase) throws b {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (m(phase)) {
            return;
        }
        int iH = h(reference);
        if (iH != -1) {
            this.f296769c.add(iH, new c(phase, new k.b(reference)));
            return;
        }
        throw new b("Phase " + reference + " was not registered for this pipeline");
    }

    public final void q(@NotNull j phase, @NotNull pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(block, "block");
        c<TSubject, TContext> cVarG = g(phase);
        if (cVarG == null) {
            throw new b("Phase " + phase + " was not registered for this pipeline");
        }
        if (F(phase, block)) {
            this.f296770d++;
            return;
        }
        cVarG.b(block);
        this.f296770d++;
        A();
        b();
    }

    @NotNull
    public final List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> r(@NotNull j phase) {
        Object next;
        Intrinsics.checkNotNullParameter(phase, "phase");
        List<Object> list = this.f296769c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((c) next).g(), phase));
        c cVar = (c) next;
        List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> listM = cVar != null ? cVar.m() : null;
        return listM == null ? CollectionsKt.emptyList() : listM;
    }

    @NotNull
    public final List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> s() {
        List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> listK = k();
        return listK == null ? c() : listK;
    }

    public final boolean t() {
        return this.f296770d == 0;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }

    public final void u(@NotNull d<TSubject, TContext> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (f(from)) {
            return;
        }
        w(from);
        v(from);
    }

    public final void w(@NotNull d<TSubject, TContext> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        List mutableList = CollectionsKt.toMutableList((Collection) from.f296769c);
        while (!mutableList.isEmpty()) {
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                j jVarG = next instanceof j ? (j) next : null;
                if (jVarG == null) {
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                    jVarG = ((c) next).g();
                }
                if (m(jVarG)) {
                    it.remove();
                } else if (p(next, jVarG)) {
                    it.remove();
                }
            }
        }
    }

    @NotNull
    public final List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> y(@NotNull j phase) {
        List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> listM;
        Intrinsics.checkNotNullParameter(phase, "phase");
        c<TSubject, TContext> cVarG = g(phase);
        return (cVarG == null || (listM = cVarG.m()) == null) ? CollectionsKt.emptyList() : listM;
    }

    public final void z(@NotNull d<TSubject, TContext> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f296769c.clear();
        if (this.f296770d != 0) {
            throw new IllegalStateException("Check failed.");
        }
        f(from);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull j phase, @NotNull List<? extends pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> interceptors) {
        this(phase);
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            q(phase, (pj.n) it.next());
        }
    }
}
