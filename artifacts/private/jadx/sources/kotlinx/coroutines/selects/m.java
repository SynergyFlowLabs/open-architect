package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@a1
@SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,904:1\n1#2:905\n2632#3,3:906\n1863#3,2:918\n1863#3,2:926\n1863#3,2:928\n426#4,9:909\n435#4,2:920\n149#5,4:922\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n529#1:906,3\n593#1:918,2\n749#1:926,2\n774#1:928,2\n569#1:909,9\n569#1:920,2\n734#1:922,4\n*E\n"})
public class m<R> implements kotlinx.coroutines.m, d<R>, o<R> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315528f = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f315529a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Object f315531c;
    private volatile /* synthetic */ Object state$volatile = p.f315555f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<m<R>.a> f315530b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f315532d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Object f315533e = p.f315558i;

    @SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,904:1\n1#2:905\n*E\n"})
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final Object f315534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final pj.n<Object, n<?>, Object, Unit> f315535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final pj.n<Object, Object, Object, Object> f315536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Object f315537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Object f315538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oj.f
        @Nullable
        public final pj.n<n<?>, Object, Object, pj.n<Throwable, Object, CoroutineContext, Unit>> f315539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oj.f
        @Nullable
        public Object f315540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @oj.f
        public int f315541h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Object obj, @NotNull pj.n<Object, ? super n<?>, Object, Unit> nVar, @Nullable pj.n<Object, Object, Object, ? extends Object> nVar2, @NotNull Object obj2, @Nullable Object obj3, pj.n<? super n<?>, Object, Object, ? extends pj.n<? super Throwable, Object, ? super CoroutineContext, Unit>> nVar3) {
            this.f315534a = obj;
            this.f315535b = nVar;
            this.f315536c = nVar2;
            this.f315537d = obj2;
            this.f315538e = obj3;
            this.f315539f = nVar3;
            int i10 = 2 & (-1);
        }

        @Nullable
        public final pj.n<Throwable, Object, CoroutineContext, Unit> a(@NotNull n<?> nVar, @Nullable Object obj) {
            pj.n<n<?>, Object, Object, pj.n<Throwable, Object, CoroutineContext, Unit>> nVar2 = this.f315539f;
            if (nVar2 != null) {
                return nVar2.invoke(nVar, this.f315537d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f315540g;
            m<R> mVar = m.this;
            if (obj instanceof w0) {
                ((w0) obj).z(this.f315541h, null, mVar.getContext());
                return;
            }
            o1 o1Var = obj instanceof o1 ? (o1) obj : null;
            if (o1Var != null) {
                o1Var.dispose();
            }
        }

        @Nullable
        public final Object c(@Nullable Object obj, @NotNull kotlin.coroutines.d<? super R> dVar) {
            Object obj2 = this.f315538e;
            if (this.f315537d == p.l()) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(dVar);
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, dVar);
        }

        @Nullable
        public final Object d(@Nullable Object obj) {
            return this.f315536c.invoke(this.f315534a, this.f315537d, obj);
        }

        public final boolean e(@NotNull m<R> mVar) {
            this.f315535b.invoke(this.f315534a, mVar, this.f315537d);
            return ((m) mVar).f315533e == p.f315558i;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {453, 456}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f315544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<R> f315545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f315546d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m<R> mVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f315545c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315544b = obj;
            this.f315546d |= Integer.MIN_VALUE;
            return this.f315545c.y(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {729}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f315547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<R> f315548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m<R> mVar, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f315548b = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315547a = obj;
            this.f315549c |= Integer.MIN_VALUE;
            return this.f315548b.G(null, null, this);
        }
    }

    public m(@NotNull CoroutineContext coroutineContext) {
        this.f315529a = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A() {
        Object obj = f315528f.get(this);
        return obj == p.f315555f || (obj instanceof List);
    }

    private final /* synthetic */ Object B() {
        return this.state$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater C() {
        return f315528f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D() {
        return f315528f.get(this) == p.f315557h;
    }

    private final boolean E() {
        return f315528f.get(this) instanceof a;
    }

    private final /* synthetic */ void F(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object G(m<R>.a aVar, Object obj, kotlin.coroutines.d<? super R> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f315549c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f315549c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, dVar);
            }
        } else {
            cVar = new c(this, dVar);
        }
        Object obj2 = cVar.f315547a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f315549c;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj2);
            return obj2;
        }
        ResultKt.m(obj2);
        Object objD = aVar.d(obj);
        cVar.f315549c = 1;
        Object objC = aVar.c(objD, cVar);
        return objC == objL ? objL : objC;
    }

    public static /* synthetic */ void I(m mVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        mVar.H(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Object obj) {
        m<R>.a aVarZ = z(obj);
        Intrinsics.checkNotNull(aVarZ);
        aVarZ.f315540g = null;
        aVarZ.f315541h = -1;
        H(aVarZ, true);
    }

    private final /* synthetic */ void K(Object obj) {
        this.state$volatile = obj;
    }

    private final int M(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f315528f.get(this);
            if (obj3 instanceof kotlinx.coroutines.n) {
                m<R>.a aVarZ = z(obj);
                if (aVarZ != null) {
                    pj.n<Throwable, Object, CoroutineContext, Unit> nVarA = aVarZ.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(f315528f, this, obj3, aVarZ)) {
                        this.f315533e = obj2;
                        if (p.o((kotlinx.coroutines.n) obj3, nVarA)) {
                            return 0;
                        }
                        this.f315533e = p.f315558i;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.areEqual(obj3, p.f315556g) || (obj3 instanceof a)) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, p.f315557h)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, p.f315555f)) {
                    if (androidx.concurrent.futures.b.a(f315528f, this, obj3, CollectionsKt.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.b.a(f315528f, this, obj3, CollectionsKt.plus((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final /* synthetic */ void N(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, ? extends Object> function1) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterC = C();
        while (true) {
            Object obj = atomicReferenceFieldUpdaterC.get(this);
            if (obj == p.f315555f) {
                if (androidx.concurrent.futures.b.a(C(), this, obj, pVar)) {
                    kotlinx.coroutines.r.c(pVar, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof a) {
                        pVar.J(Unit.f312394a, ((a) obj).a(this, this.f315533e));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (androidx.concurrent.futures.b.a(C(), this, obj, p.f315555f)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        J(it.next());
                    }
                }
            }
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    private final void t(Object obj) {
        List<m<R>.a> list = this.f315530b;
        Intrinsics.checkNotNull(list);
        List<m<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f315534a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void u(m<R>.a aVar) {
        List<m<R>.a> list = this.f315530b;
        if (list == null) {
            return;
        }
        for (m<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        f315528f.set(this, p.f315556g);
        this.f315533e = p.f315558i;
        this.f315530b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(kotlin.coroutines.d<? super R> dVar) {
        Object obj = f315528f.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        m<R>.a aVar = (a) obj;
        Object obj2 = this.f315533e;
        u(aVar);
        return aVar.c(aVar.d(obj2), dVar);
    }

    @a1
    static /* synthetic */ <R> Object x(m<R> mVar, kotlin.coroutines.d<? super R> dVar) {
        return mVar.E() ? mVar.v(dVar) : mVar.y(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(kotlin.coroutines.d<? super R> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f315546d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f315546d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f315544b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f315546d;
        if (i11 == 0) {
            ResultKt.m(obj);
            bVar.f315543a = this;
            bVar.f315546d = 1;
            if (O(bVar) == objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        this = (m) bVar.f315543a;
        ResultKt.m(obj);
        bVar.f315543a = null;
        bVar.f315546d = 2;
        Object objV = this.v(bVar);
        if (objV != objL) {
            return objV;
        }
        return objL;
    }

    private final m<R>.a z(Object obj) {
        List<m<R>.a> list = this.f315530b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((a) obj3).f315534a == obj) {
                obj2 = obj3;
                break;
            }
        }
        m<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    @oj.i(name = "register")
    public final void H(@NotNull m<R>.a aVar, boolean z10) {
        if (f315528f.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            t(aVar.f315534a);
        }
        if (!aVar.e(this)) {
            f315528f.set(this, aVar);
            return;
        }
        if (!z10) {
            List<m<R>.a> list = this.f315530b;
            Intrinsics.checkNotNull(list);
            list.add(aVar);
        }
        aVar.f315540g = this.f315531c;
        aVar.f315541h = this.f315532d;
        this.f315531c = null;
        this.f315532d = -1;
    }

    @NotNull
    public final s L(@NotNull Object obj, @Nullable Object obj2) {
        return p.d(M(obj, obj2));
    }

    @Override // kotlinx.coroutines.selects.d
    public void a(@NotNull f fVar, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
        int i10 = 3 & 0;
        I(this, new a(fVar.d(), fVar.c(), fVar.b(), p.l(), function1, fVar.a()), false, 1, null);
    }

    @Override // kotlinx.coroutines.f4
    public void b(@NotNull w0<?> w0Var, int i10) {
        this.f315531c = w0Var;
        this.f315532d = i10;
    }

    @Override // kotlinx.coroutines.selects.d
    public <P, Q> void c(@NotNull j<? super P, ? extends Q> jVar, P p10, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        I(this, new a(jVar.d(), jVar.c(), jVar.b(), p10, function2, jVar.a()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.d
    @kotlin.internal.h
    @c2
    @kotlin.l(level = kotlin.n.ERROR, message = "Replaced with the same extension function", replaceWith = @b1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    public void d(long j10, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
        d.a.b(this, j10, function1);
    }

    @Override // kotlinx.coroutines.m
    public void e(@Nullable Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315528f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == p.f315556g) {
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, p.f315557h));
        List<m<R>.a> list = this.f315530b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
            this.f315533e = p.f315558i;
            this.f315530b = null;
        }
    }

    @Override // kotlinx.coroutines.selects.n
    public void f(@Nullable Object obj) {
        this.f315533e = obj;
    }

    @Override // kotlinx.coroutines.selects.n
    public void g(@NotNull o1 o1Var) {
        this.f315531c = o1Var;
    }

    @Override // kotlinx.coroutines.selects.n
    @NotNull
    public CoroutineContext getContext() {
        return this.f315529a;
    }

    @Override // kotlinx.coroutines.selects.d
    public <P, Q> void h(@NotNull j<? super P, ? extends Q> jVar, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        d.a.a(this, jVar, function2);
    }

    @Override // kotlinx.coroutines.selects.n
    public boolean i(@NotNull Object obj, @Nullable Object obj2) {
        return M(obj, obj2) == 0;
    }

    @Override // kotlinx.coroutines.selects.d
    public <Q> void j(@NotNull h<? extends Q> hVar, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        I(this, new a(hVar.d(), hVar.c(), hVar.b(), null, function2, hVar.a()), false, 1, null);
    }

    @a1
    @Nullable
    public Object w(@NotNull kotlin.coroutines.d<? super R> dVar) {
        return x(this, dVar);
    }
}
