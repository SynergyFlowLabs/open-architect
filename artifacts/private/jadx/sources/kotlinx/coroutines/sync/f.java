package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.f4;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlinx.coroutines.selects.o;
import kotlinx.coroutines.x0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n444#2,12:315\n1#3:327\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n171#1:315,12\n*E\n"})
public class f extends j implements kotlinx.coroutines.sync.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315589i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n<kotlinx.coroutines.selects.n<?>, Object, Object, n<Throwable, Object, CoroutineContext, Unit>> f315590h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    final class a implements kotlinx.coroutines.n<Unit>, f4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final p<Unit> f315591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Object f315592b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable p<? super Unit> pVar, Object obj) {
            this.f315591a = pVar;
            this.f315592b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(f fVar, a aVar, Throwable th2) {
            fVar.i(aVar.f315592b);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(f fVar, a aVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
            f.R().set(fVar, aVar.f315592b);
            fVar.i(aVar.f315592b);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.n
        @c2
        public void K(@NotNull n0 n0Var, @NotNull Throwable th2) {
            this.f315591a.K(n0Var, th2);
        }

        @Override // kotlinx.coroutines.f4
        public void b(@NotNull w0<?> w0Var, int i10) {
            this.f315591a.b(w0Var, i10);
        }

        @Override // kotlinx.coroutines.n
        @k2
        public void b0(@NotNull Object obj) {
            this.f315591a.b0(obj);
        }

        @Override // kotlinx.coroutines.n
        public boolean c(@Nullable Throwable th2) {
            return this.f315591a.c(th2);
        }

        @Override // kotlinx.coroutines.n
        @kotlin.l(level = kotlin.n.WARNING, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @b1(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void M(@NotNull Unit unit, @Nullable Function1<? super Throwable, Unit> function1) {
            this.f315591a.M(unit, function1);
        }

        @Override // kotlinx.coroutines.n
        public void e0(@NotNull Function1<? super Throwable, Unit> function1) {
            this.f315591a.e0(function1);
        }

        @Override // kotlinx.coroutines.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> void J(@NotNull R r10, @Nullable n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar) {
            f.R().set(f.this, this.f315592b);
            p<Unit> pVar = this.f315591a;
            final f fVar = f.this;
            pVar.M(r10, new Function1() { // from class: kotlinx.coroutines.sync.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.a.g(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // kotlin.coroutines.d
        @NotNull
        public CoroutineContext getContext() {
            return this.f315591a.getContext();
        }

        @Override // kotlinx.coroutines.n
        @c2
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void n0(@NotNull n0 n0Var, @NotNull Unit unit) {
            this.f315591a.n0(n0Var, unit);
        }

        @Override // kotlinx.coroutines.n
        @k2
        @Nullable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object c0(@NotNull Unit unit, @Nullable Object obj) {
            return this.f315591a.c0(unit, obj);
        }

        @Override // kotlinx.coroutines.n
        public boolean isActive() {
            return this.f315591a.isActive();
        }

        @Override // kotlinx.coroutines.n
        public boolean isCancelled() {
            return this.f315591a.isCancelled();
        }

        @Override // kotlinx.coroutines.n
        @Nullable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> Object P(@NotNull R r10, @Nullable Object obj, @Nullable n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar) {
            final f fVar = f.this;
            Object objP = this.f315591a.P(r10, obj, new n() { // from class: kotlinx.coroutines.sync.d
                @Override // pj.n
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return f.a.k(fVar, this, (Throwable) obj2, (Unit) obj3, (CoroutineContext) obj4);
                }
            });
            if (objP != null) {
                f.R().set(f.this, this.f315592b);
            }
            return objP;
        }

        @Override // kotlinx.coroutines.n
        @k2
        @Nullable
        public Object l0(@NotNull Throwable th2) {
            return this.f315591a.l0(th2);
        }

        @Override // kotlinx.coroutines.n
        @k2
        public void p0() {
            this.f315591a.p0();
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@NotNull Object obj) {
            this.f315591a.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.n
        public boolean x() {
            return this.f315591a.x();
        }
    }

    @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    private final class b<Q> implements o<Q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final o<Q> f315594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Object f315595b;

        public b(@Nullable o<Q> oVar, Object obj) {
            this.f315594a = oVar;
            this.f315595b = obj;
        }

        @Override // kotlinx.coroutines.f4
        public void b(@NotNull w0<?> w0Var, int i10) {
            this.f315594a.b(w0Var, i10);
        }

        @Override // kotlinx.coroutines.selects.n
        public void f(@Nullable Object obj) {
            f.R().set(f.this, this.f315595b);
            this.f315594a.f(obj);
        }

        @Override // kotlinx.coroutines.selects.n
        public void g(@NotNull o1 o1Var) {
            this.f315594a.g(o1Var);
        }

        @Override // kotlinx.coroutines.selects.n
        @NotNull
        public CoroutineContext getContext() {
            return this.f315594a.getContext();
        }

        @Override // kotlinx.coroutines.selects.n
        public boolean i(@NotNull Object obj, @Nullable Object obj2) {
            boolean zI = this.f315594a.i(obj, obj2);
            f fVar = f.this;
            if (zI) {
                f.R().set(fVar, this.f315595b);
            }
            return zI;
        }
    }

    /* synthetic */ class c extends g0 implements n<f, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f315597a = new c();

        c() {
            super(3, f.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(f fVar, kotlinx.coroutines.selects.n<?> nVar, Object obj) {
            fVar.W(nVar, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(f fVar, kotlinx.coroutines.selects.n<?> nVar, Object obj) {
            X(fVar, nVar, obj);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class d extends g0 implements n<f, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f315598a = new d();

        d() {
            super(3, f.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Object obj, Object obj2) {
            return fVar.V(obj, obj2);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f315599a;
        this.f315590h = new n() { // from class: kotlinx.coroutines.sync.c
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f.X(this.f315584a, (kotlinx.coroutines.selects.n) obj, obj2, obj3);
            }
        };
    }

    public static /* synthetic */ void P() {
    }

    private final /* synthetic */ Object Q() {
        return this.owner$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater R() {
        return f315589i;
    }

    private final int S(Object obj) {
        while (c()) {
            Object obj2 = f315589i.get(this);
            if (obj2 != g.f315599a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object T(f fVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        Object objU;
        if (!fVar.b(obj) && (objU = fVar.U(obj, dVar)) == kotlin.coroutines.intrinsics.b.l()) {
            return objU;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        p pVarB = r.b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            n(new a(pVarB, obj));
            Object objU = pVarB.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
        } catch (Throwable th2) {
            pVarB.R();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n X(final f fVar, kotlinx.coroutines.selects.n nVar, final Object obj, Object obj2) {
        return new n() { // from class: kotlinx.coroutines.sync.b
            @Override // pj.n
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.Y(this.f315582a, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(f fVar, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        fVar.i(obj);
        return Unit.f312394a;
    }

    private final /* synthetic */ void Z(Object obj) {
        this.owner$volatile = obj;
    }

    private final int a0(Object obj) {
        while (!a()) {
            if (obj == null) {
                return 1;
            }
            int iS = S(obj);
            if (iS == 1) {
                return 2;
            }
            if (iS == 2) {
                return 1;
            }
        }
        f315589i.set(this, obj);
        int i10 = 3 >> 0;
        return 0;
    }

    @Nullable
    protected Object V(@Nullable Object obj, @Nullable Object obj2) {
        if (!Intrinsics.areEqual(obj2, g.f315600b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    protected void W(@NotNull kotlinx.coroutines.selects.n<?> nVar, @Nullable Object obj) {
        if (obj != null && d(obj)) {
            nVar.f(g.f315600b);
        } else {
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            C(new b((o) nVar, obj), obj);
        }
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean b(@Nullable Object obj) {
        int iA0 = a0(obj);
        if (iA0 == 0) {
            return true;
        }
        if (iA0 == 1) {
            return false;
        }
        if (iA0 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean c() {
        return f() == 0;
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean d(@NotNull Object obj) {
        return S(obj) == 1;
    }

    @Override // kotlinx.coroutines.sync.a
    @NotNull
    public kotlinx.coroutines.selects.j<Object, kotlinx.coroutines.sync.a> e() {
        c cVar = c.f315597a;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        n nVar = (n) r1.q(cVar, 3);
        d dVar = d.f315598a;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.k(this, nVar, (n) r1.q(dVar, 3), this.f315590h);
    }

    @Override // kotlinx.coroutines.sync.a
    @Nullable
    public Object h(@Nullable Object obj, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return T(this, obj, dVar);
    }

    @Override // kotlinx.coroutines.sync.a
    public void i(@Nullable Object obj) {
        while (c()) {
            Object obj2 = f315589i.get(this);
            if (obj2 != g.f315599a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f315589i, this, obj2, g.f315599a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @NotNull
    public String toString() {
        return "Mutex@" + x0.b(this) + "[isLocked=" + c() + ",owner=" + f315589i.get(this) + AbstractJsonLexerKt.END_LIST;
    }
}
