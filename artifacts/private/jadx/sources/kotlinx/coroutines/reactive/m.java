package kotlinx.coroutines.reactive;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.flow.internal.a0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.u;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/PublisherAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
final class m<T> extends kotlinx.coroutines.flow.internal.e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u<T> f315269d;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160703k1, 96}, m = "collectImpl", n = {"this", "collector", "subscriber", "consumed", "this", "collector", "subscriber", "consumed"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f315272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f315273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f315274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m<T> f315275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f315276g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<T> mVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f315275f = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315274e = obj;
            this.f315276g |= Integer.MIN_VALUE;
            return this.f315275f.p(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", f = "ReactiveFlow.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f315278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f315279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f315280d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.flow.j<? super T> jVar, m<T> mVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f315279c = jVar;
            this.f315280d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f315279c, this.f315280d, dVar);
            bVar.f315278b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315277a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f315278b;
                kotlinx.coroutines.flow.j<T> jVar = this.f315279c;
                m<T> mVar = this.f315280d;
                n0<T> n0VarM = mVar.m(t0.m(s0Var, mVar.f314495a));
                this.f315277a = 1;
                if (kotlinx.coroutines.flow.k.n0(jVar, n0VarM, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ m(u uVar, CoroutineContext coroutineContext, int i10, kotlinx.coroutines.channels.j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, (i11 & 2) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? kotlinx.coroutines.channels.j.SUSPEND : jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:34:0x00ac, B:36:0x00b7, B:24:0x0077, B:31:0x0094, B:20:0x0057), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r2.emit(r15, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlinx.coroutines.flow.j<? super T>] */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlinx.coroutines.reactive.p] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlinx.coroutines.reactive.p] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlinx.coroutines.reactive.p] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [kotlinx.coroutines.reactive.p] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a9 -> B:34:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(kotlin.coroutines.CoroutineContext r13, kotlinx.coroutines.flow.j<? super T> r14, kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof kotlinx.coroutines.reactive.m.a
            if (r0 == 0) goto L14
            r0 = r15
            r0 = r15
            kotlinx.coroutines.reactive.m$a r0 = (kotlinx.coroutines.reactive.m.a) r0
            int r1 = r0.f315276g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f315276g = r1
            goto L19
        L14:
            kotlinx.coroutines.reactive.m$a r0 = new kotlinx.coroutines.reactive.m$a
            r0.<init>(r12, r15)
        L19:
            java.lang.Object r15 = r0.f315274e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f315276g
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5b
            if (r2 == r6) goto L49
            if (r2 != r5) goto L41
            long r12 = r0.f315273d
            java.lang.Object r14 = r0.f315272c
            kotlinx.coroutines.reactive.p r14 = (kotlinx.coroutines.reactive.p) r14
            java.lang.Object r2 = r0.f315271b
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            java.lang.Object r7 = r0.f315270a
            kotlinx.coroutines.reactive.m r7 = (kotlinx.coroutines.reactive.m) r7
            kotlin.ResultKt.m(r15)     // Catch: java.lang.Throwable -> L3e
            goto Lac
        L3e:
            r12 = move-exception
            goto Lc2
        L41:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L49:
            long r12 = r0.f315273d
            java.lang.Object r14 = r0.f315272c
            kotlinx.coroutines.reactive.p r14 = (kotlinx.coroutines.reactive.p) r14
            java.lang.Object r2 = r0.f315271b
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            java.lang.Object r7 = r0.f315270a
            kotlinx.coroutines.reactive.m r7 = (kotlinx.coroutines.reactive.m) r7
            kotlin.ResultKt.m(r15)     // Catch: java.lang.Throwable -> L3e
            goto L8c
        L5b:
            kotlin.ResultKt.m(r15)
            kotlinx.coroutines.reactive.p r15 = new kotlinx.coroutines.reactive.p
            int r2 = r12.f314496b
            kotlinx.coroutines.channels.j r7 = r12.f314497c
            long r8 = r12.r()
            r15.<init>(r2, r7, r8)
            org.reactivestreams.u<T> r2 = r12.f315269d
            org.reactivestreams.u r13 = kotlinx.coroutines.reactive.o.e(r2, r13)
            r13.e(r15)
            r13 = r14
            r14 = r15
        L76:
            r7 = r3
        L77:
            r0.f315270a = r12     // Catch: java.lang.Throwable -> L3e
            r0.f315271b = r13     // Catch: java.lang.Throwable -> L3e
            r0.f315272c = r14     // Catch: java.lang.Throwable -> L3e
            r0.f315273d = r7     // Catch: java.lang.Throwable -> L3e
            r0.f315276g = r6     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r15 = r14.c(r0)     // Catch: java.lang.Throwable -> L3e
            if (r15 != r1) goto L88
            goto Lab
        L88:
            r2 = r13
            r10 = r7
            r7 = r12
            r12 = r10
        L8c:
            if (r15 != 0) goto L94
            r14.a()
            kotlin.Unit r12 = kotlin.Unit.f312394a
            return r12
        L94:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()     // Catch: java.lang.Throwable -> L3e
            kotlinx.coroutines.s2.y(r8)     // Catch: java.lang.Throwable -> L3e
            r0.f315270a = r7     // Catch: java.lang.Throwable -> L3e
            r0.f315271b = r2     // Catch: java.lang.Throwable -> L3e
            r0.f315272c = r14     // Catch: java.lang.Throwable -> L3e
            r0.f315273d = r12     // Catch: java.lang.Throwable -> L3e
            r0.f315276g = r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r15 = r2.emit(r15, r0)     // Catch: java.lang.Throwable -> L3e
            if (r15 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r8 = 1
            long r12 = r12 + r8
            long r8 = r7.r()     // Catch: java.lang.Throwable -> L3e
            int r15 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r15 != 0) goto Lbd
            r14.b()     // Catch: java.lang.Throwable -> L3e
            r13 = r2
            r12 = r7
            goto L76
        Lbd:
            r10 = r12
            r12 = r7
            r7 = r10
            r13 = r2
            goto L77
        Lc2:
            r14.a()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.m.p(kotlin.coroutines.CoroutineContext, kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new b(jVar, this, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    private final long r() {
        if (this.f314497c != kotlinx.coroutines.channels.j.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i10 = this.f314496b;
        if (i10 == -2) {
            return kotlinx.coroutines.channels.p.N2.a();
        }
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j10 = i10;
        if (j10 >= 1) {
            return j10;
        }
        throw new IllegalStateException("Check failed.");
    }

    private static /* synthetic */ void s() {
    }

    @Override // kotlinx.coroutines.flow.internal.e, kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        CoroutineContext context = dVar.getContext();
        CoroutineContext coroutineContext = this.f314495a;
        kotlin.coroutines.e.b bVar = kotlin.coroutines.e.K2;
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) coroutineContext.get(bVar);
        if (eVar == null || Intrinsics.areEqual(eVar, context.get(bVar))) {
            Object objP = p(context.plus(this.f314495a), jVar, dVar);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
        Object objQ = q(jVar, dVar);
        return objQ == kotlin.coroutines.intrinsics.b.l() ? objQ : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @Nullable
    protected Object g(@NotNull l0<? super T> l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = p(l0Var.getCoroutineContext(), new a0(l0Var.s()), dVar);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected kotlinx.coroutines.flow.internal.e<T> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return new m(this.f315269d, coroutineContext, i10, jVar);
    }

    public m(@NotNull u<T> uVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(coroutineContext, i10, jVar);
        this.f315269d = uVar;
    }
}
