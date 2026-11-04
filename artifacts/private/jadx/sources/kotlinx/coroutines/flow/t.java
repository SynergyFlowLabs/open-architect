package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.z3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1#2:408\n*E\n"})
final /* synthetic */ class t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {215, 415}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n14#2:408\n14#2:410\n1#3:409\n54#4,5:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n212#1:408\n215#1:410\n222#1:411,5\n*E\n"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f314776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f314777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Long> f314778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i<T> f314779g;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n226#1:408\n*E\n"})
        static final class C2301a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314780a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j<T> f314781b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1.h<Object> f314782c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2301a(j<? super T> jVar, i1.h<Object> hVar, kotlin.coroutines.d<? super C2301a> dVar) {
                super(1, dVar);
                this.f314781b = jVar;
                this.f314782c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new C2301a(this.f314781b, this.f314782c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314780a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j<T> jVar = this.f314781b;
                    kotlinx.coroutines.internal.z0 z0Var = kotlinx.coroutines.flow.internal.u.f314619a;
                    T t10 = this.f314782c.f312751a;
                    if (t10 == z0Var) {
                        t10 = null;
                    }
                    this.f314780a = 1;
                    if (jVar.emit(t10, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                this.f314782c.f312751a = null;
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2301a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n1009#2,2:408\n1026#2:410\n1027#2:413\n1#3:411\n14#4:412\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n232#1:408,2\n233#1:410\n233#1:413\n236#1:412\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.t<? extends Object>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314783a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314784b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314785c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i1.h<Object> f314786d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ j<T> f314787e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(i1.h<Object> hVar, j<? super T> jVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f314786d = hVar;
                this.f314787e = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f314786d, this.f314787e, dVar);
                bVar.f314785c = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.t<? extends Object> tVar, kotlin.coroutines.d<? super Unit> dVar) {
                return k(tVar.o(), dVar);
            }

            /* JADX WARN: Type inference failed for: r7v4, types: [T, kotlinx.coroutines.internal.z0] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.t$a$b for r7v9 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r6 = 5
                    int r1 = r7.f314784b
                    r2 = 1
                    if (r1 == 0) goto L1f
                    r6 = 4
                    if (r1 != r2) goto L16
                    java.lang.Object r7 = r7.f314783a
                    kotlin.jvm.internal.i1$h r7 = (kotlin.jvm.internal.i1.h) r7
                    r6 = 2
                    kotlin.ResultKt.m(r8)
                    goto L59
                L16:
                    r6 = 5
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L1f:
                    r6 = 1
                    kotlin.ResultKt.m(r8)
                    java.lang.Object r8 = r7.f314785c
                    r6 = 5
                    kotlinx.coroutines.channels.t r8 = (kotlinx.coroutines.channels.t) r8
                    r6 = 5
                    java.lang.Object r8 = r8.o()
                    r6 = 2
                    kotlin.jvm.internal.i1$h<java.lang.Object> r1 = r7.f314786d
                    boolean r3 = r8 instanceof kotlinx.coroutines.channels.t.c
                    if (r3 != 0) goto L36
                    r1.f312751a = r8
                L36:
                    kotlinx.coroutines.flow.j<T> r4 = r7.f314787e
                    if (r3 == 0) goto L61
                    java.lang.Throwable r3 = kotlinx.coroutines.channels.t.f(r8)
                    if (r3 != 0) goto L60
                    r6 = 2
                    T r3 = r1.f312751a
                    r6 = 6
                    if (r3 == 0) goto L5a
                    kotlinx.coroutines.internal.z0 r5 = kotlinx.coroutines.flow.internal.u.f314619a
                    if (r3 != r5) goto L4b
                    r3 = 0
                L4b:
                    r7.f314785c = r8
                    r7.f314783a = r1
                    r7.f314784b = r2
                    java.lang.Object r7 = r4.emit(r3, r7)
                    if (r7 != r0) goto L58
                    return r0
                L58:
                    r7 = r1
                L59:
                    r1 = r7
                L5a:
                    r6 = 1
                    kotlinx.coroutines.internal.z0 r7 = kotlinx.coroutines.flow.internal.u.f314621c
                    r1.f312751a = r7
                    goto L61
                L60:
                    throw r3
                L61:
                    r6 = 4
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object k(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(kotlinx.coroutines.channels.t.b(obj), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super Object>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314788a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314789b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i<T> f314790c;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$a$c$a, reason: collision with other inner class name */
            static final class C2302a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.l0<Object> f314791a;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$a$c$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {204}, m = "emit", n = {}, s = {})
                static final class C2303a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f314792a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C2302a<T> f314793b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f314794c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2303a(C2302a<? super T> c2302a, kotlin.coroutines.d<? super C2303a> dVar) {
                        super(dVar);
                        this.f314793b = c2302a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f314792a = obj;
                        this.f314794c |= Integer.MIN_VALUE;
                        return this.f314793b.emit(null, this);
                    }
                }

                C2302a(kotlinx.coroutines.channels.l0<Object> l0Var) {
                    this.f314791a = l0Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                    C2303a c2303a;
                    if (dVar instanceof C2303a) {
                        c2303a = (C2303a) dVar;
                        int i10 = c2303a.f314794c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c2303a.f314794c = i10 - Integer.MIN_VALUE;
                        } else {
                            c2303a = new C2303a(this, dVar);
                        }
                    } else {
                        c2303a = new C2303a(this, dVar);
                    }
                    Object obj = c2303a.f314792a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c2303a.f314794c;
                    if (i11 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.channels.l0<Object> l0Var = this.f314791a;
                        if (t10 == null) {
                            t10 = (T) kotlinx.coroutines.flow.internal.u.f314619a;
                        }
                        c2303a.f314794c = 1;
                        if (l0Var.G(t10, c2303a) == objL) {
                            return objL;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(i<? extends T> iVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f314790c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.f314790c, dVar);
                cVar.f314789b = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.l0<? super Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return invoke2((kotlinx.coroutines.channels.l0<Object>) l0Var, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314788a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f314789b;
                    i<T> iVar = this.f314790c;
                    C2302a c2302a = new C2302a(l0Var);
                    this.f314788a = 1;
                    if (iVar.collect(c2302a, this) == objL) {
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

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.channels.l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super T, Long> function1, i<? extends T> iVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f314778f = function1;
            this.f314779g = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0068  */
        /* JADX WARN: Code duplicated, block: B:16:0x0071  */
        /* JADX WARN: Code duplicated, block: B:18:0x0077  */
        /* JADX WARN: Code duplicated, block: B:21:0x008a  */
        /* JADX WARN: Code duplicated, block: B:23:0x008e  */
        /* JADX WARN: Code duplicated, block: B:25:0x0092  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[PHI: r1 r5 r6 r7
          0x00a6: PHI (r1v3 kotlin.jvm.internal.i1$g) = (r1v5 kotlin.jvm.internal.i1$g), (r1v7 kotlin.jvm.internal.i1$g), (r1v7 kotlin.jvm.internal.i1$g) binds: [B:29:0x00a4, B:15:0x006f, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]
          0x00a6: PHI (r5v3 kotlin.jvm.internal.i1$h) = (r5v6 kotlin.jvm.internal.i1$h), (r5v7 kotlin.jvm.internal.i1$h), (r5v7 kotlin.jvm.internal.i1$h) binds: [B:29:0x00a4, B:15:0x006f, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]
          0x00a6: PHI (r6v2 kotlinx.coroutines.channels.n0) = (r6v4 kotlinx.coroutines.channels.n0), (r6v5 kotlinx.coroutines.channels.n0), (r6v5 kotlinx.coroutines.channels.n0) binds: [B:29:0x00a4, B:15:0x006f, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]
          0x00a6: PHI (r7v2 kotlinx.coroutines.flow.j) = (r7v4 kotlinx.coroutines.flow.j), (r7v5 kotlinx.coroutines.flow.j), (r7v5 kotlinx.coroutines.flow.j) binds: [B:29:0x00a4, B:15:0x006f, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        
            if (r7.emit(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
        
            if (r7.w(r14) == r0) goto L38;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e8 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.s0 s0Var, j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f314778f, this.f314779g, dVar);
            aVar.f314776d = s0Var;
            aVar.f314777e = jVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f314797c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f314797c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f314797c, dVar);
            bVar.f314796b = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c A[PHI: r1
          0x004c: PHI (r1v4 kotlinx.coroutines.channels.l0) = (r1v3 kotlinx.coroutines.channels.l0), (r1v5 kotlinx.coroutines.channels.l0), (r1v7 kotlinx.coroutines.channels.l0) binds: [B:13:0x0048, B:19:0x006b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r1
          0x0060: PHI (r1v5 kotlinx.coroutines.channels.l0) = (r1v4 kotlinx.coroutines.channels.l0), (r1v9 kotlinx.coroutines.channels.l0) binds: [B:16:0x005d, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006b -> B:15:0x004c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r7 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 4
                int r1 = r8.f314795a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L31
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L15
                r7 = 1
                goto L27
            L15:
                r7 = 5
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1e:
                java.lang.Object r1 = r8.f314796b
                kotlinx.coroutines.channels.l0 r1 = (kotlinx.coroutines.channels.l0) r1
                r7 = 6
                kotlin.ResultKt.m(r9)
                goto L60
            L27:
                java.lang.Object r1 = r8.f314796b
                kotlinx.coroutines.channels.l0 r1 = (kotlinx.coroutines.channels.l0) r1
                r7 = 3
                kotlin.ResultKt.m(r9)
                r7 = 6
                goto L4c
            L31:
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f314796b
                r1 = r9
                r1 = r9
                kotlinx.coroutines.channels.l0 r1 = (kotlinx.coroutines.channels.l0) r1
                r7 = 4
                long r5 = r8.f314797c
                r7 = 0
                r8.f314796b = r1
                r7 = 1
                r8.f314795a = r4
                java.lang.Object r9 = kotlinx.coroutines.d1.b(r5, r8)
                r7 = 3
                if (r9 != r0) goto L4c
                r7 = 5
                goto L6d
            L4c:
                kotlinx.coroutines.channels.o0 r9 = r1.s()
                r7 = 0
                kotlin.Unit r4 = kotlin.Unit.f312394a
                r7 = 1
                r8.f314796b = r1
                r8.f314795a = r3
                java.lang.Object r9 = r9.G(r4, r8)
                r7 = 1
                if (r9 != r0) goto L60
                goto L6d
            L60:
                long r4 = r8.f314797c
                r8.f314796b = r1
                r8.f314795a = r2
                java.lang.Object r9 = kotlinx.coroutines.d1.b(r4, r8)
                r7 = 1
                if (r9 != r0) goto L4c
            L6d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.channels.l0<? super Unit> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {412}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n54#2,5:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n278#1:408,5\n*E\n"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f314801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f314802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f314803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i<T> f314804g;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1009#2,2:408\n1026#2:410\n1027#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n281#1:408,2\n282#1:410\n282#1:412\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.t<? extends Object>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314805a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314806b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1.h<Object> f314807c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.n0<Unit> f314808d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i1.h<Object> hVar, kotlinx.coroutines.channels.n0<Unit> n0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f314807c = hVar;
                this.f314808d = n0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f314807c, this.f314808d, dVar);
                aVar.f314806b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.t<? extends Object> tVar, kotlin.coroutines.d<? super Unit> dVar) {
                return k(tVar.o(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f314805a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                T t10 = (T) ((kotlinx.coroutines.channels.t) this.f314806b).o();
                i1.h<Object> hVar = this.f314807c;
                boolean z10 = t10 instanceof kotlinx.coroutines.channels.t.c;
                if (!z10) {
                    hVar.f312751a = t10;
                }
                kotlinx.coroutines.channels.n0<Unit> n0Var = this.f314808d;
                if (z10) {
                    Throwable thF = kotlinx.coroutines.channels.t.f(t10);
                    if (thF != null) {
                        throw thF;
                    }
                    n0Var.e(new kotlinx.coroutines.flow.internal.l());
                    hVar.f312751a = (T) kotlinx.coroutines.flow.internal.u.f314621c;
                }
                return Unit.f312394a;
            }

            public final Object k(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(kotlinx.coroutines.channels.t.b(obj), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n293#1:408\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<Unit, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314809a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1.h<Object> f314810b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<T> f314811c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(i1.h<Object> hVar, j<? super T> jVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f314810b = hVar;
                this.f314811c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f314810b, this.f314811c, dVar);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.t$c$b for r6v5 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    r5 = 1
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 2
                    int r1 = r6.f314809a
                    r2 = 1
                    r5 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L12
                    kotlin.ResultKt.m(r7)
                    goto L41
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    r5 = 6
                    java.lang.String r7 = "els/v/oihblieoo  k/f cet /nw/in reateeoctm/ /suorru"
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1d:
                    kotlin.ResultKt.m(r7)
                    r5 = 3
                    kotlin.jvm.internal.i1$h<java.lang.Object> r7 = r6.f314810b
                    T r1 = r7.f312751a
                    r5 = 3
                    if (r1 != 0) goto L2b
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    return r6
                L2b:
                    r3 = 0
                    r5 = 4
                    r7.f312751a = r3
                    kotlinx.coroutines.flow.j<T> r7 = r6.f314811c
                    r5 = 4
                    kotlinx.coroutines.internal.z0 r4 = kotlinx.coroutines.flow.internal.u.f314619a
                    if (r1 != r4) goto L37
                    r1 = r3
                L37:
                    r5 = 7
                    r6.f314809a = r2
                    java.lang.Object r6 = r7.emit(r1, r6)
                    if (r6 != r0) goto L41
                    return r0
                L41:
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(unit, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$c$c, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {com.badlogic.gdx.utils.compression.lzma.a.A}, m = "invokeSuspend", n = {}, s = {})
        static final class C2304c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super Object>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314812a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314813b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i<T> f314814c;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$c$c$a */
            static final class a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.l0<Object> f314815a;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$c$c$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {com.badlogic.gdx.utils.compression.lzma.a.A}, m = "emit", n = {}, s = {})
                static final class C2305a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f314816a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ a<T> f314817b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f314818c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2305a(a<? super T> aVar, kotlin.coroutines.d<? super C2305a> dVar) {
                        super(dVar);
                        this.f314817b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f314816a = obj;
                        this.f314818c |= Integer.MIN_VALUE;
                        return this.f314817b.emit(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.l0<Object> l0Var) {
                    this.f314815a = l0Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                    C2305a c2305a;
                    if (dVar instanceof C2305a) {
                        c2305a = (C2305a) dVar;
                        int i10 = c2305a.f314818c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c2305a.f314818c = i10 - Integer.MIN_VALUE;
                        } else {
                            c2305a = new C2305a(this, dVar);
                        }
                    } else {
                        c2305a = new C2305a(this, dVar);
                    }
                    Object obj = c2305a.f314816a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c2305a.f314818c;
                    if (i11 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.channels.l0<Object> l0Var = this.f314815a;
                        if (t10 == null) {
                            t10 = (T) kotlinx.coroutines.flow.internal.u.f314619a;
                        }
                        c2305a.f314818c = 1;
                        if (l0Var.G(t10, c2305a) == objL) {
                            return objL;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2304c(i<? extends T> iVar, kotlin.coroutines.d<? super C2304c> dVar) {
                super(2, dVar);
                this.f314814c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C2304c c2304c = new C2304c(this.f314814c, dVar);
                c2304c.f314813b = obj;
                return c2304c;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.l0<? super Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return invoke2((kotlinx.coroutines.channels.l0<Object>) l0Var, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314812a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f314813b;
                    i<T> iVar = this.f314814c;
                    a aVar = new a(l0Var);
                    this.f314812a = 1;
                    if (iVar.collect(aVar, this) == objL) {
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

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.channels.l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2304c) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(long j10, i<? extends T> iVar, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f314803f = j10;
            this.f314804g = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.n0 n0Var;
            kotlinx.coroutines.channels.n0<Unit> n0VarA0;
            i1.h hVar;
            j jVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314800c;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f314801d;
                j jVar2 = (j) this.f314802e;
                kotlinx.coroutines.channels.n0 n0VarH = kotlinx.coroutines.channels.j0.h(s0Var, null, -1, new C2304c(this.f314804g, null), 1, null);
                i1.h hVar2 = new i1.h();
                n0Var = n0VarH;
                n0VarA0 = k.A0(s0Var, this.f314803f);
                hVar = hVar2;
                jVar = jVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0VarA0 = (kotlinx.coroutines.channels.n0) this.f314799b;
                hVar = (i1.h) this.f314798a;
                n0Var = (kotlinx.coroutines.channels.n0) this.f314802e;
                jVar = (j) this.f314801d;
                ResultKt.m(obj);
            }
            while (hVar.f312751a != kotlinx.coroutines.flow.internal.u.f314621c) {
                kotlinx.coroutines.selects.m mVar = new kotlinx.coroutines.selects.m(getContext());
                mVar.j(n0Var.u(), new a(hVar, n0VarA0, null));
                mVar.j(n0VarA0.D(), new b(hVar, jVar, null));
                this.f314801d = jVar;
                this.f314802e = n0Var;
                this.f314798a = hVar;
                this.f314799b = n0VarA0;
                this.f314800c = 1;
                if (mVar.w(this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.s0 s0Var, j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(this.f314803f, this.f314804g, dVar);
            cVar.f314801d = s0Var;
            cVar.f314802e = jVar;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {413}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n27#2:408\n28#2:414\n54#3,5:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n392#1:408\n392#1:414\n392#1:409,5\n*E\n"})
    static final class d<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f314819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f314820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f314821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f314822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f314823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i<T> f314824f;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1009#2,2:408\n1047#2:410\n1048#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n394#1:408,2\n396#1:410\n396#1:412\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.t<? extends T>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<T> f314827c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f314827c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f314827c, dVar);
                aVar.f314826b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
                return k(((kotlinx.coroutines.channels.t) obj).o(), dVar);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.t$d$a for r5v12 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.f314825a
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L11
                    java.lang.Object r5 = r5.f314826b
                    kotlin.ResultKt.m(r6)
                    goto L3e
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "f/s/ rnei/omn/ lk/aei o ewesloc ott/iut e//bevcrohr"
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1b:
                    kotlin.ResultKt.m(r6)
                    java.lang.Object r6 = r5.f314826b
                    r4 = 6
                    kotlinx.coroutines.channels.t r6 = (kotlinx.coroutines.channels.t) r6
                    java.lang.Object r6 = r6.o()
                    kotlinx.coroutines.flow.j<T> r1 = r5.f314827c
                    boolean r3 = r6 instanceof kotlinx.coroutines.channels.t.c
                    r4 = 4
                    if (r3 != 0) goto L3f
                    r5.f314826b = r6
                    r4 = 6
                    r5.f314825a = r2
                    r4 = 6
                    java.lang.Object r5 = r1.emit(r6, r5)
                    r4 = 2
                    if (r5 != r0) goto L3c
                    return r0
                L3c:
                    r5 = r6
                    r5 = r6
                L3e:
                    r6 = r5
                L3f:
                    r4 = 1
                    boolean r5 = r6 instanceof kotlinx.coroutines.channels.t.a
                    if (r5 == 0) goto L53
                    r4 = 6
                    java.lang.Throwable r5 = kotlinx.coroutines.channels.t.f(r6)
                    if (r5 != 0) goto L52
                    r4 = 3
                    r5 = 0
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    return r5
                L52:
                    throw r5
                L53:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object k(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(kotlinx.coroutines.channels.t.b(obj), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<?>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f314829b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10, kotlin.coroutines.d<? super b> dVar) {
                super(1, dVar);
                this.f314829b = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new b(this.f314829b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f314828a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                throw new z3("Timed out waiting for " + ((Object) kotlin.time.c.N0(this.f314829b)));
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<?> dVar) {
                return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j10, i<? extends T> iVar, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.f314823e = j10;
            this.f314824f = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0088 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0091  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0086 -> B:15:0x0089). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0091
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r9 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f314820b
                r2 = 1
                r9 = 7
                r3 = 0
                if (r1 == 0) goto L2b
                r9 = 0
                if (r1 != r2) goto L20
                r9 = 1
                long r4 = r10.f314819a
                java.lang.Object r1 = r10.f314822d
                kotlinx.coroutines.channels.n0 r1 = (kotlinx.coroutines.channels.n0) r1
                r9 = 6
                java.lang.Object r6 = r10.f314821c
                r9 = 4
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.ResultKt.m(r11)
                goto L89
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r9 = 7
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r9 = 7
                r10.<init>(r11)
                r9 = 1
                throw r10
            L2b:
                kotlin.ResultKt.m(r11)
                java.lang.Object r11 = r10.f314821c
                kotlinx.coroutines.s0 r11 = (kotlinx.coroutines.s0) r11
                java.lang.Object r1 = r10.f314822d
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                long r4 = r10.f314823e
                r9 = 5
                kotlin.time.c$a r6 = kotlin.time.c.f313406b
                long r6 = r6.W()
                r9 = 0
                int r4 = kotlin.time.c.s(r4, r6)
                r9 = 0
                if (r4 <= 0) goto L94
                kotlinx.coroutines.flow.i<T> r4 = r10.f314824f
                r5 = 0
                r6 = 2
                kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.k.r(r4, r5, r3, r6, r3)
                r9 = 7
                kotlinx.coroutines.channels.n0 r11 = kotlinx.coroutines.flow.k.q1(r4, r11)
                r9 = 5
                long r4 = r10.f314823e
                r6 = r1
                r1 = r11
            L59:
                r9 = 5
                kotlinx.coroutines.selects.m r11 = new kotlinx.coroutines.selects.m
                kotlin.coroutines.CoroutineContext r7 = r10.getContext()
                r11.<init>(r7)
                kotlinx.coroutines.selects.h r7 = r1.u()
                kotlinx.coroutines.flow.t$d$a r8 = new kotlinx.coroutines.flow.t$d$a
                r8.<init>(r6, r3)
                r9 = 5
                r11.j(r7, r8)
                kotlinx.coroutines.flow.t$d$b r7 = new kotlinx.coroutines.flow.t$d$b
                r7.<init>(r4, r3)
                kotlinx.coroutines.selects.c.b(r11, r4, r7)
                r9 = 2
                r10.f314821c = r6
                r10.f314822d = r1
                r10.f314819a = r4
                r9 = 4
                r10.f314820b = r2
                java.lang.Object r11 = r11.w(r10)
                if (r11 != r0) goto L89
                return r0
            L89:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto L59
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            L94:
                kotlinx.coroutines.z3 r10 = new kotlinx.coroutines.z3
                r9 = 6
                java.lang.String r11 = "oasdiyemidmltemu i tT"
                java.lang.String r11 = "Timed out immediately"
                r10.<init>(r11)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.s0 s0Var, j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            d dVar2 = new d(this.f314823e, this.f314824f, dVar);
            dVar2.f314821c = s0Var;
            dVar2.f314822d = jVar;
            return dVar2.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e2
    @NotNull
    public static final <T> i<T> c(@NotNull i<? extends T> iVar, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? iVar : i(iVar, new Function1() { // from class: kotlinx.coroutines.flow.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(t.e(j10, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    @kotlin.u0
    @e2
    @NotNull
    public static final <T> i<T> d(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, Long> function1) {
        return i(iVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j10, Object obj) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(Function1 function1, Object obj) {
        return kotlinx.coroutines.d1.e(((kotlin.time.c) function1.invoke(obj)).S0());
    }

    @e2
    @NotNull
    public static final <T> i<T> g(@NotNull i<? extends T> iVar, long j10) {
        return k.c0(iVar, kotlinx.coroutines.d1.e(j10));
    }

    @kotlin.u0
    @e2
    @NotNull
    @oj.i(name = "debounceDuration")
    public static final <T> i<T> h(@NotNull i<? extends T> iVar, @NotNull final Function1<? super T, kotlin.time.c> function1) {
        return i(iVar, new Function1() { // from class: kotlinx.coroutines.flow.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(t.f(function1, obj));
            }
        });
    }

    private static final <T> i<T> i(i<? extends T> iVar, Function1<? super T, Long> function1) {
        return kotlinx.coroutines.flow.internal.p.b(new a(function1, iVar, null));
    }

    @NotNull
    public static final kotlinx.coroutines.channels.n0<Unit> j(@NotNull kotlinx.coroutines.s0 s0Var, long j10) {
        int i10 = 3 ^ 0;
        return kotlinx.coroutines.channels.j0.h(s0Var, null, 0, new b(j10, null), 1, null);
    }

    @e2
    @NotNull
    public static final <T> i<T> k(@NotNull i<? extends T> iVar, long j10) {
        if (j10 > 0) {
            return kotlinx.coroutines.flow.internal.p.b(new c(j10, iVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    @e2
    @NotNull
    public static final <T> i<T> l(@NotNull i<? extends T> iVar, long j10) {
        return k.D1(iVar, kotlinx.coroutines.d1.e(j10));
    }

    @e2
    @NotNull
    public static final <T> i<T> m(@NotNull i<? extends T> iVar, long j10) {
        return n(iVar, j10);
    }

    private static final <T> i<T> n(i<? extends T> iVar, long j10) {
        return kotlinx.coroutines.flow.internal.p.b(new d(j10, iVar, null));
    }
}
