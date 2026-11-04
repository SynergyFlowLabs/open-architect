package androidx.compose.material3.internal;

import androidx.compose.material3.n90;
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
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,462:1\n85#2:463\n117#2,2:464\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl\n*L\n385#1:463\n385#1:464,2\n*E\n"})
final class h1 implements n90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f28912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f28913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.w1<Boolean> f28914d = new androidx.compose.animation.core.w1<>(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.n<? super Unit> f28915e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", i = {}, l = {410, 412}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28916a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f28918c;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.h1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", i = {}, l = {412}, m = "invokeSuspend", n = {}, s = {})
        static final class C0228a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28919a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f28920b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0228a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super C0228a> dVar) {
                super(2, dVar);
                this.f28920b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0228a(this.f28920b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28919a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f28920b;
                    this.f28919a = 1;
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
                return ((C0228a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f28918c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return h1.this.new a(this.f28918c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            if (kotlinx.coroutines.b4.c(1500, r7, r6) == r0) goto L22;
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
                r5 = 5
                int r1 = r6.f28916a
                r2 = 0
                r5 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                r5 = 1
                if (r1 == r4) goto L13
                r5 = 0
                if (r1 != r3) goto L1b
            L13:
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L18
                r5 = 3
                goto L55
            L18:
                r7 = move-exception
                r5 = 0
                goto L5e
            L1b:
                r5 = 2
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 5
                throw r6
            L25:
                r5 = 6
                kotlin.ResultKt.m(r7)
                androidx.compose.material3.internal.h1 r7 = androidx.compose.material3.internal.h1.this     // Catch: java.lang.Throwable -> L18
                r5 = 2
                boolean r7 = r7.d()     // Catch: java.lang.Throwable -> L18
                if (r7 == 0) goto L3d
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r7 = r6.f28918c     // Catch: java.lang.Throwable -> L18
                r6.f28916a = r4     // Catch: java.lang.Throwable -> L18
                java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L18
                if (r7 != r0) goto L55
                goto L54
            L3d:
                r5 = 1
                androidx.compose.material3.internal.h1$a$a r7 = new androidx.compose.material3.internal.h1$a$a     // Catch: java.lang.Throwable -> L18
                r5 = 4
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f28918c     // Catch: java.lang.Throwable -> L18
                r5 = 1
                r4 = 0
                r7.<init>(r1, r4)     // Catch: java.lang.Throwable -> L18
                r6.f28916a = r3     // Catch: java.lang.Throwable -> L18
                r5 = 0
                r3 = 1500(0x5dc, double:7.41E-321)
                r5 = 1
                java.lang.Object r7 = kotlinx.coroutines.b4.c(r3, r7, r6)     // Catch: java.lang.Throwable -> L18
                if (r7 != r0) goto L55
            L54:
                return r0
            L55:
                androidx.compose.material3.internal.h1 r6 = androidx.compose.material3.internal.h1.this
                r6.g(r2)
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 6
                return r6
            L5e:
                androidx.compose.material3.internal.h1 r6 = androidx.compose.material3.internal.h1.this
                r6.g(r2)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.h1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", i = {}, l = {463}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,462:1\n318#2,11:463\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl$show$cancellableShow$1\n*L\n399#1:463,11\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28922b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return h1.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28922b;
            if (i10 == 0) {
                ResultKt.m(obj);
                h1 h1Var = h1.this;
                this.f28921a = h1Var;
                this.f28922b = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(this), 1);
                pVar.p0();
                h1Var.g(true);
                h1Var.f28915e = pVar;
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

    public h1(boolean z10, boolean z11, @NotNull androidx.compose.foundation.s3 s3Var) {
        this.f28911a = z11;
        this.f28912b = s3Var;
        this.f28913c = d7.g(Boolean.valueOf(z10), null, 2, null);
    }

    @Override // androidx.compose.material3.n90
    public void a() {
        kotlinx.coroutines.n<? super Unit> nVar = this.f28915e;
        if (nVar != null) {
            kotlinx.coroutines.n.a.a(nVar, null, 1, null);
        }
    }

    @Override // androidx.compose.material3.n90
    @NotNull
    public androidx.compose.animation.core.w1<Boolean> b() {
        return this.f28914d;
    }

    @Override // androidx.compose.material3.n90
    @Nullable
    public Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = this.f28912b.d(q3Var, new a(new b(null), null), dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Override // androidx.compose.material3.n90
    public boolean d() {
        return this.f28911a;
    }

    @Override // androidx.compose.material3.n90
    public void dismiss() {
        g(false);
    }

    public void g(boolean z10) {
        this.f28913c.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.n90
    public boolean isVisible() {
        return ((Boolean) this.f28913c.getValue()).booleanValue();
    }
}
