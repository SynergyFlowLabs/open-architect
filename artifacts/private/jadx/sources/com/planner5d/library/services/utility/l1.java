package com.planner5d.library.services.utility;

import androidx.fragment.app.Fragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l1 f225303a = new l1();

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.LifecycleUtils$collectOnLifecycle$1", f = "LifecycleUtils.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f225305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.o0 f225306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.c0.b f225307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f225308e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T> iVar, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.b bVar, kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f225305b = iVar;
            this.f225306c = o0Var;
            this.f225307d = bVar;
            this.f225308e = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f225305b, this.f225306c, this.f225307d, this.f225308e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f225304a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarA = androidx.lifecycle.u.a(this.f225305b, this.f225306c.getLifecycle(), this.f225307d);
                Object obj2 = this.f225308e;
                this.f225304a = 1;
                if (iVarA.collect(obj2, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.LifecycleUtils$collectOnLifecycle$2", f = "LifecycleUtils.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLifecycleUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleUtils.kt\ncom/planner5d/library/services/utility/LifecycleUtils$collectOnLifecycle$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,43:1\n49#2:44\n51#2:48\n46#3:45\n51#3:47\n105#4:46\n*S KotlinDebug\n*F\n+ 1 LifecycleUtils.kt\ncom/planner5d/library/services/utility/LifecycleUtils$collectOnLifecycle$2\n*L\n38#1:44\n38#1:48\n38#1:45\n38#1:47\n38#1:46\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f225310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f225311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.o0 f225312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.c0.b f225313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f225314f;

        /* JADX INFO: Add missing generic type declarations: [R] */
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
        public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f225315a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f225316b;

            /* JADX INFO: renamed from: com.planner5d.library.services.utility.l1$b$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n50#2:219\n*E\n"})
            public static final class C1688a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j f225317a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2 f225318b;

                /* JADX INFO: renamed from: com.planner5d.library.services.utility.l1$b$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.LifecycleUtils$collectOnLifecycle$2$invokeSuspend$$inlined$map$1$2", f = "LifecycleUtils.kt", i = {}, l = {219, 219}, m = "emit", n = {}, s = {})
                public static final class C1689a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f225319a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f225320b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f225321c;

                    public C1689a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f225319a = obj;
                        this.f225320b |= Integer.MIN_VALUE;
                        return C1688a.this.emit(null, this);
                    }
                }

                public C1688a(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                    this.f225317a = jVar;
                    this.f225318b = function2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
                
                    if (r7.emit(r9, r0) == r1) goto L23;
                 */
                @Override // kotlinx.coroutines.flow.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r9) {
                    /*
                        r7 = this;
                        java.lang.String r6 = "Androeed.ru"
                        boolean r0 = r9 instanceof com.planner5d.library.services.utility.l1.b.a.C1688a.C1689a
                        r6 = 4
                        if (r0 == 0) goto L19
                        r0 = r9
                        r6 = 6
                        com.planner5d.library.services.utility.l1$b$a$a$a r0 = (com.planner5d.library.services.utility.l1.b.a.C1688a.C1689a) r0
                        int r1 = r0.f225320b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        r6 = 0
                        if (r3 == 0) goto L19
                        int r1 = r1 - r2
                        r6 = 4
                        r0.f225320b = r1
                        goto L1f
                    L19:
                        com.planner5d.library.services.utility.l1$b$a$a$a r0 = new com.planner5d.library.services.utility.l1$b$a$a$a
                        r6 = 0
                        r0.<init>(r9)
                    L1f:
                        r6 = 2
                        java.lang.Object r9 = r0.f225319a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        r6 = 2
                        int r2 = r0.f225320b
                        r6 = 4
                        r3 = 2
                        r4 = 1
                        r6 = 3
                        if (r2 == 0) goto L4a
                        if (r2 == r4) goto L42
                        r6 = 6
                        if (r2 != r3) goto L38
                        kotlin.ResultKt.m(r9)
                        goto L72
                    L38:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "//se/eou  voehrcrc/tnf///stneiiowkm  uole orbtl e/i"
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L42:
                        java.lang.Object r7 = r0.f225321c
                        kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                        kotlin.ResultKt.m(r9)
                        goto L63
                    L4a:
                        kotlin.ResultKt.m(r9)
                        kotlinx.coroutines.flow.j r9 = r7.f225317a
                        kotlin.jvm.functions.Function2 r7 = r7.f225318b
                        r6 = 5
                        r0.f225321c = r9
                        r6 = 5
                        r0.f225320b = r4
                        java.lang.Object r7 = r7.invoke(r8, r0)
                        if (r7 != r1) goto L5e
                        goto L71
                    L5e:
                        r5 = r9
                        r9 = r7
                        r9 = r7
                        r7 = r5
                        r7 = r5
                    L63:
                        r6 = 6
                        r8 = 0
                        r6 = 7
                        r0.f225321c = r8
                        r0.f225320b = r3
                        java.lang.Object r7 = r7.emit(r9, r0)
                        r6 = 2
                        if (r7 != r1) goto L72
                    L71:
                        return r1
                    L72:
                        kotlin.Unit r7 = kotlin.Unit.f312394a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.l1.b.a.C1688a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            public a(kotlinx.coroutines.flow.i iVar, Function2 function2) {
                this.f225315a = iVar;
                this.f225316b = function2;
            }

            @Override // kotlinx.coroutines.flow.i
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
                Object objCollect = this.f225315a.collect(new C1688a(jVar, this.f225316b), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.flow.i<? extends T> iVar, Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.b bVar, kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f225310b = iVar;
            this.f225311c = function2;
            this.f225312d = o0Var;
            this.f225313e = bVar;
            this.f225314f = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f225310b, this.f225311c, this.f225312d, this.f225313e, this.f225314f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f225309a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarA = androidx.lifecycle.u.a(kotlinx.coroutines.flow.k.i0(new a(this.f225310b, this.f225311c)), this.f225312d.getLifecycle(), this.f225313e);
                Object obj2 = this.f225314f;
                this.f225309a = 1;
                if (iVarA.collect(obj2, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private l1() {
    }

    public static /* synthetic */ void c(l1 l1Var, androidx.lifecycle.o0 o0Var, kotlinx.coroutines.flow.i iVar, androidx.lifecycle.c0.b bVar, kotlinx.coroutines.flow.j jVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = androidx.lifecycle.c0.b.STARTED;
        }
        l1Var.a(o0Var, iVar, bVar, jVar);
    }

    public static /* synthetic */ void d(l1 l1Var, androidx.lifecycle.o0 o0Var, kotlinx.coroutines.flow.i iVar, Function2 function2, androidx.lifecycle.c0.b bVar, kotlinx.coroutines.flow.j jVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = androidx.lifecycle.c0.b.STARTED;
        }
        l1Var.b(o0Var, iVar, function2, bVar, jVar);
    }

    public final <T> void a(@NotNull androidx.lifecycle.o0 o0Var, @NotNull kotlinx.coroutines.flow.i<? extends T> flow, @NotNull androidx.lifecycle.c0.b minActiveState, @NotNull kotlinx.coroutines.flow.j<? super T> collector) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(collector, "collector");
        if (!(o0Var instanceof Fragment)) {
            kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(o0Var), null, null, new a(flow, o0Var, minActiveState, collector, null), 3, null);
            return;
        }
        androidx.lifecycle.o0 viewLifecycleOwner = ((Fragment) o0Var).getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        a(viewLifecycleOwner, flow, minActiveState, collector);
    }

    public final <T, R> void b(@NotNull androidx.lifecycle.o0 o0Var, @NotNull kotlinx.coroutines.flow.i<? extends T> flow, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> transform, @NotNull androidx.lifecycle.c0.b minActiveState, @NotNull kotlinx.coroutines.flow.j<? super R> collector) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(collector, "collector");
        if (!(o0Var instanceof Fragment)) {
            kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(o0Var), null, null, new b(flow, transform, o0Var, minActiveState, collector, null), 3, null);
            return;
        }
        androidx.lifecycle.o0 viewLifecycleOwner = ((Fragment) o0Var).getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        b(viewLifecycleOwner, flow, transform, minActiveState, collector);
    }
}
