package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class j<T, R> extends h<T, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> f314524e;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T, R> f314527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f314528d;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.j$a$a, reason: collision with other inner class name */
        static final class C2288a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.h<p2> f314529a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s0 f314530b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<T, R> f314531c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f314532d;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.j$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
            static final class C2289a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f314533a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ j<T, R> f314534b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f314535c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f314536d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2289a(j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2, T t10, kotlin.coroutines.d<? super C2289a> dVar) {
                    super(2, dVar);
                    this.f314534b = jVar;
                    this.f314535c = jVar2;
                    this.f314536d = t10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C2289a(this.f314534b, this.f314535c, this.f314536d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f314533a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        pj.n nVar = ((j) this.f314534b).f314524e;
                        kotlinx.coroutines.flow.j<R> jVar = this.f314535c;
                        T t10 = this.f314536d;
                        this.f314533a = 1;
                        if (nVar.invoke(jVar, t10, this) == objL) {
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
                    return ((C2289a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.j$a$a$b */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {26}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f314537a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f314538b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f314539c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f314540d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ C2288a<T> f314541e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f314542f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C2288a<? super T> c2288a, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f314541e = c2288a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314540d = obj;
                    this.f314542f |= Integer.MIN_VALUE;
                    return this.f314541e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2288a(i1.h<p2> hVar, s0 s0Var, j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2) {
                this.f314529a = hVar;
                this.f314530b = s0Var;
                this.f314531c = jVar;
                this.f314532d = jVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                b bVar;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i10 = bVar.f314542f;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        bVar.f314542f = i10 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, dVar);
                    }
                } else {
                    bVar = new b(this, dVar);
                }
                Object obj = bVar.f314540d;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = bVar.f314542f;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    p2 p2Var = this.f314529a.f312751a;
                    if (p2Var != null) {
                        p2Var.e(new l());
                        bVar.f314537a = this;
                        bVar.f314538b = t10;
                        bVar.f314539c = p2Var;
                        bVar.f314542f = 1;
                        if (p2Var.d1(bVar) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t10 = (T) bVar.f314538b;
                    this = (C2288a) bVar.f314537a;
                    ResultKt.m(obj);
                }
                this.f314529a.f312751a = (T) kotlinx.coroutines.k.f(this.f314530b, null, u0.UNDISPATCHED, new C2289a(this.f314531c, this.f314532d, t10, null), 1, null);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314527c = jVar;
            this.f314528d = jVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f314527c, this.f314528d, dVar);
            aVar.f314526b = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.internal.j$a for r8v4 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f314525a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.m(r9)
                goto L3c
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L17:
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f314526b
                kotlinx.coroutines.s0 r9 = (kotlinx.coroutines.s0) r9
                kotlin.jvm.internal.i1$h r1 = new kotlin.jvm.internal.i1$h
                r7 = 1
                r1.<init>()
                kotlinx.coroutines.flow.internal.j<T, R> r3 = r8.f314527c
                kotlinx.coroutines.flow.i<S> r4 = r3.f314520d
                r7 = 6
                kotlinx.coroutines.flow.internal.j$a$a r5 = new kotlinx.coroutines.flow.internal.j$a$a
                kotlinx.coroutines.flow.j<R> r6 = r8.f314528d
                r7 = 0
                r5.<init>(r1, r9, r3, r6)
                r7 = 7
                r8.f314525a = r2
                java.lang.Object r8 = r4.collect(r5, r8)
                r7 = 6
                if (r8 != r0) goto L3c
                return r0
            L3c:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ j(pj.n nVar, kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, int i10, kotlinx.coroutines.channels.j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, iVar, (i11 & 4) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? kotlinx.coroutines.channels.j.SUSPEND : jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected e<R> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return new j(this.f314524e, this.f314520d, coroutineContext, i10, jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.h
    @Nullable
    protected Object r(@NotNull kotlinx.coroutines.flow.j<? super R> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new a(this, jVar, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(iVar, coroutineContext, i10, jVar);
        this.f314524e = nVar;
    }
}
