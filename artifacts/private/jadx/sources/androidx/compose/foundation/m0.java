package androidx.compose.foundation;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,390:1\n85#2:391\n117#2,2:392\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n*L\n286#1:391\n286#1:392,2\n*E\n"})
final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s3 f18079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f18080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.n<? super Unit> f18081d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", i = {}, l = {310, 312}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18082a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f18084c;

        /* JADX INFO: renamed from: androidx.compose.foundation.m0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {})
        static final class C0117a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f18085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f18086b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0117a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super C0117a> dVar) {
                super(2, dVar);
                this.f18086b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0117a(this.f18086b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f18085a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f18086b;
                    this.f18085a = 1;
                    if (function1.invoke(this) == objL) {
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
                return ((C0117a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f18084c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return m0.this.new a(this.f18084c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            if (kotlinx.coroutines.b4.c(1500, r7, r6) == r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f18082a
                r5 = 4
                r2 = 0
                r3 = 2
                r5 = r3
                r4 = 1
                int r5 = r5 >> r4
                if (r1 == 0) goto L25
                if (r1 == r4) goto L13
                r5 = 3
                if (r1 != r3) goto L1a
            L13:
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L18
                r5 = 0
                goto L56
            L18:
                r7 = move-exception
                goto L60
            L1a:
                r5 = 4
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "euslieo / ewkmirn /bnefhr/////al u oiv o/ecetootcst"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L25:
                kotlin.ResultKt.m(r7)
                r5 = 2
                androidx.compose.foundation.m0 r7 = androidx.compose.foundation.m0.this     // Catch: java.lang.Throwable -> L18
                boolean r7 = r7.d()     // Catch: java.lang.Throwable -> L18
                r5 = 6
                if (r7 == 0) goto L3f
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r7 = r6.f18084c     // Catch: java.lang.Throwable -> L18
                r5 = 4
                r6.f18082a = r4     // Catch: java.lang.Throwable -> L18
                r5 = 3
                java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L18
                if (r7 != r0) goto L56
                goto L55
            L3f:
                r5 = 0
                androidx.compose.foundation.m0$a$a r7 = new androidx.compose.foundation.m0$a$a     // Catch: java.lang.Throwable -> L18
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f18084c     // Catch: java.lang.Throwable -> L18
                r5 = 4
                r4 = 0
                r7.<init>(r1, r4)     // Catch: java.lang.Throwable -> L18
                r5 = 0
                r6.f18082a = r3     // Catch: java.lang.Throwable -> L18
                r3 = 1500(0x5dc, double:7.41E-321)
                r5 = 2
                java.lang.Object r7 = kotlinx.coroutines.b4.c(r3, r7, r6)     // Catch: java.lang.Throwable -> L18
                if (r7 != r0) goto L56
            L55:
                return r0
            L56:
                r5 = 5
                androidx.compose.foundation.m0 r6 = androidx.compose.foundation.m0.this
                r6.f(r2)
                r5 = 2
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L60:
                androidx.compose.foundation.m0 r6 = androidx.compose.foundation.m0.this
                r6.f(r2)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.m0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,390:1\n318#2,11:391\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl$show$cancellableShow$1\n*L\n299#1:391,11\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f18087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18088b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return m0.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18088b;
            if (i10 == 0) {
                ResultKt.m(obj);
                m0 m0Var = m0.this;
                this.f18087a = m0Var;
                this.f18088b = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(this), 1);
                pVar.p0();
                m0Var.f(true);
                m0Var.f18081d = pVar;
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objU == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public m0(boolean z10, boolean z11, @NotNull s3 s3Var) {
        this.f18078a = z11;
        this.f18079b = s3Var;
        this.f18080c = d7.g(Boolean.valueOf(z10), null, 2, null);
    }

    @Override // androidx.compose.foundation.l0
    public void a() {
        kotlinx.coroutines.n<? super Unit> nVar = this.f18081d;
        if (nVar != null) {
            kotlinx.coroutines.n.a.a(nVar, null, 1, null);
        }
    }

    @Override // androidx.compose.foundation.l0
    @Nullable
    public Object c(@NotNull q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = this.f18079b.d(q3Var, new a(new b(null), null), dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.l0
    public boolean d() {
        return this.f18078a;
    }

    @Override // androidx.compose.foundation.l0
    public void dismiss() {
        f(false);
    }

    public void f(boolean z10) {
        this.f18080c.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.l0
    public boolean isVisible() {
        return ((Boolean) this.f18080c.getValue()).booleanValue();
    }
}
