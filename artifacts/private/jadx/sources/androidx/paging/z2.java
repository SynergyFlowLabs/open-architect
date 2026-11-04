package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class z2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f72817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<a3<T>, kotlin.coroutines.d<? super Unit>, Object> f72818c;

        /* JADX INFO: renamed from: androidx.paging.z2$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", i = {0, 1}, l = {67, com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {"producer", "producer"}, s = {"L$0", "L$0"})
        static final class C0687a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f72819a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f72820b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f72821c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<T> f72822d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function2<a3<T>, kotlin.coroutines.d<? super Unit>, Object> f72823e;

            /* JADX INFO: renamed from: androidx.paging.z2$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
            static final class C0688a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f72824a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.p<T> f72825b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function2<a3<T>, kotlin.coroutines.d<? super Unit>, Object> f72826c;

                /* JADX INFO: renamed from: androidx.paging.z2$a$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
                static final class C0689a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f72827a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f72828b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.p<T> f72829c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ Function2<a3<T>, kotlin.coroutines.d<? super Unit>, Object> f72830d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0689a(kotlinx.coroutines.channels.p<T> pVar, Function2<? super a3<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0689a> dVar) {
                        super(2, dVar);
                        this.f72829c = pVar;
                        this.f72830d = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                        C0689a c0689a = new C0689a(this.f72829c, this.f72830d, dVar);
                        c0689a.f72828b = obj;
                        return c0689a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f72827a;
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            b3 b3Var = new b3((kotlinx.coroutines.s0) this.f72828b, this.f72829c);
                            Function2<a3<T>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f72830d;
                            this.f72827a = 1;
                            if (function2.invoke(b3Var, this) == objL) {
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
                    @Nullable
                    public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C0689a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0688a(kotlinx.coroutines.channels.p<T> pVar, Function2<? super a3<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0688a> dVar) {
                    super(2, dVar);
                    this.f72825b = pVar;
                    this.f72826c = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0688a(this.f72825b, this.f72826c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f72824a;
                    try {
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            C0689a c0689a = new C0689a(this.f72825b, this.f72826c, null);
                            this.f72824a = 1;
                            if (kotlinx.coroutines.t0.g(c0689a, this) == objL) {
                                return objL;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                        }
                        kotlinx.coroutines.channels.o0.a.a(this.f72825b, null, 1, null);
                    } catch (Throwable th2) {
                        this.f72825b.F(th2);
                    }
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0688a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0687a(kotlinx.coroutines.flow.j<? super T> jVar, Function2<? super a3<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0687a> dVar) {
                super(2, dVar);
                this.f72822d = jVar;
                this.f72823e = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0687a c0687a = new C0687a(this.f72822d, this.f72823e, dVar);
                c0687a.f72821c = obj;
                return c0687a;
            }

            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0093 -> B:7:0x0022). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.paging.z2$a$a for r13v3 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
                /*
                    r13 = this;
                    r12 = 4
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r12 = 4
                    int r1 = r13.f72820b
                    r12 = 3
                    r2 = 2
                    r12 = 6
                    r3 = 1
                    r12 = 5
                    r4 = 0
                    r12 = 0
                    if (r1 == 0) goto L3d
                    if (r1 == r3) goto L2f
                    if (r1 != r2) goto L25
                    java.lang.Object r1 = r13.f72819a
                    kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                    java.lang.Object r5 = r13.f72821c
                    r12 = 2
                    kotlinx.coroutines.p2 r5 = (kotlinx.coroutines.p2) r5
                    r12 = 6
                    kotlin.ResultKt.m(r14)
                L22:
                    r14 = r1
                    r1 = r5
                    goto L64
                L25:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = " /sr l/ mon/ieen/e/wkirvstu trhoouoi/ eeco/ btf/cae"
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L2f:
                    java.lang.Object r1 = r13.f72819a
                    r12 = 0
                    kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                    java.lang.Object r5 = r13.f72821c
                    kotlinx.coroutines.p2 r5 = (kotlinx.coroutines.p2) r5
                    r12 = 4
                    kotlin.ResultKt.m(r14)
                    goto L77
                L3d:
                    r12 = 3
                    kotlin.ResultKt.m(r14)
                    java.lang.Object r14 = r13.f72821c
                    r5 = r14
                    kotlinx.coroutines.s0 r5 = (kotlinx.coroutines.s0) r5
                    r12 = 0
                    r14 = 0
                    r1 = 6
                    kotlinx.coroutines.channels.p r14 = kotlinx.coroutines.channels.s.d(r14, r4, r4, r1, r4)
                    androidx.paging.z2$a$a$a r8 = new androidx.paging.z2$a$a$a
                    kotlin.jvm.functions.Function2<androidx.paging.a3<T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r13.f72823e
                    r8.<init>(r14, r1, r4)
                    r9 = 3
                    r12 = 6
                    r10 = 0
                    r6 = 3
                    r6 = 0
                    r12 = 3
                    r7 = 0
                    kotlinx.coroutines.p2 r1 = kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)
                    r12 = 1
                    kotlinx.coroutines.channels.r r14 = r14.iterator()
                L64:
                    r13.f72821c = r1
                    r13.f72819a = r14
                    r13.f72820b = r3
                    java.lang.Object r5 = r14.c(r13)
                    if (r5 != r0) goto L71
                    goto L95
                L71:
                    r11 = r1
                    r11 = r1
                    r1 = r14
                    r14 = r5
                    r5 = r11
                    r5 = r11
                L77:
                    java.lang.Boolean r14 = (java.lang.Boolean) r14
                    r12 = 2
                    boolean r14 = r14.booleanValue()
                    r12 = 1
                    if (r14 == 0) goto L96
                    java.lang.Object r14 = r1.next()
                    kotlinx.coroutines.flow.j<T> r6 = r13.f72822d
                    r13.f72821c = r5
                    r12 = 4
                    r13.f72819a = r1
                    r13.f72820b = r2
                    java.lang.Object r14 = r6.emit(r14, r13)
                    r12 = 3
                    if (r14 != r0) goto L22
                L95:
                    return r0
                L96:
                    kotlinx.coroutines.p2.a.b(r5, r4, r3, r4)
                    r12 = 0
                    kotlin.Unit r13 = kotlin.Unit.f312394a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.z2.a.C0687a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0687a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super a3<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f72818c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f72818c, dVar);
            aVar.f72817b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72816a;
            if (i10 == 0) {
                ResultKt.m(obj);
                C0687a c0687a = new C0687a((kotlinx.coroutines.flow.j) this.f72817b, this.f72818c, null);
                this.f72816a = 1;
                if (kotlinx.coroutines.t0.g(c0687a, this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@NotNull Function2<? super a3<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return kotlinx.coroutines.flow.p.d(kotlinx.coroutines.flow.k.K0(new a(block, null)), -2, null, 2, null);
    }
}
