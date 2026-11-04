package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class o90 implements n90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f31321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.w1<Boolean> f31322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.n<? super Unit> f31323d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", i = {}, l = {1184, 1186}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31324a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f31326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f31327d;

        /* JADX INFO: renamed from: androidx.compose.material3.o90$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", i = {}, l = {1186}, m = "invokeSuspend", n = {}, s = {})
        static final class C0248a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f31328a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f31329b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0248a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super C0248a> dVar) {
                super(2, dVar);
                this.f31329b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0248a(this.f31329b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f31328a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f31329b;
                    this.f31328a = 1;
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
                return ((C0248a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, androidx.compose.foundation.q3 q3Var, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f31326c = function1;
            this.f31327d = q3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return o90.this.new a(this.f31326c, this.f31327d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        
            if (kotlinx.coroutines.b4.c(1500, r6, r5) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f31324a
                r4 = 1
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto Lf
                if (r1 != r2) goto L15
            Lf:
                kotlin.ResultKt.m(r6)     // Catch: java.lang.Throwable -> L13
                goto L4e
            L13:
                r6 = move-exception
                goto L5d
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                r4 = 0
                throw r5
            L1e:
                r4 = 2
                kotlin.ResultKt.m(r6)
                r4 = 2
                androidx.compose.material3.o90 r6 = androidx.compose.material3.o90.this     // Catch: java.lang.Throwable -> L13
                r4 = 1
                boolean r6 = r6.d()     // Catch: java.lang.Throwable -> L13
                r4 = 6
                if (r6 == 0) goto L3a
                r4 = 3
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r6 = r5.f31326c     // Catch: java.lang.Throwable -> L13
                r5.f31324a = r3     // Catch: java.lang.Throwable -> L13
                java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L13
                r4 = 5
                if (r6 != r0) goto L4e
                goto L4d
            L3a:
                r4 = 6
                androidx.compose.material3.o90$a$a r6 = new androidx.compose.material3.o90$a$a     // Catch: java.lang.Throwable -> L13
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r5.f31326c     // Catch: java.lang.Throwable -> L13
                r3 = 0
                r6.<init>(r1, r3)     // Catch: java.lang.Throwable -> L13
                r5.f31324a = r2     // Catch: java.lang.Throwable -> L13
                r1 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r6 = kotlinx.coroutines.b4.c(r1, r6, r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L4e
            L4d:
                return r0
            L4e:
                androidx.compose.foundation.q3 r6 = r5.f31327d
                androidx.compose.foundation.q3 r0 = androidx.compose.foundation.q3.PreventUserInput
                if (r6 == r0) goto L5a
                androidx.compose.material3.o90 r5 = androidx.compose.material3.o90.this
                r4 = 5
                r5.dismiss()
            L5a:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            L5d:
                androidx.compose.foundation.q3 r0 = r5.f31327d
                androidx.compose.foundation.q3 r1 = androidx.compose.foundation.q3.PreventUserInput
                r4 = 5
                if (r0 == r1) goto L69
                androidx.compose.material3.o90 r5 = androidx.compose.material3.o90.this
                r5.dismiss()
            L69:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.o90.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", i = {}, l = {1655}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1654:1\n318#2,11:1655\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipStateImpl$show$cancellableShow$1\n*L\n1173#1:1655,11\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31331b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return o90.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31331b;
            if (i10 == 0) {
                ResultKt.m(obj);
                o90 o90Var = o90.this;
                this.f31330a = o90Var;
                this.f31331b = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(this), 1);
                pVar.p0();
                o90Var.b().f(kotlin.coroutines.jvm.internal.b.a(true));
                o90Var.f31323d = pVar;
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

    public o90(boolean z10, boolean z11, @NotNull androidx.compose.foundation.s3 s3Var) {
        this.f31320a = z11;
        this.f31321b = s3Var;
        this.f31322c = new androidx.compose.animation.core.w1<>(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.material3.n90
    public void a() {
        kotlinx.coroutines.n<? super Unit> nVar = this.f31323d;
        if (nVar != null) {
            kotlinx.coroutines.n.a.a(nVar, null, 1, null);
        }
    }

    @Override // androidx.compose.material3.n90
    @NotNull
    public androidx.compose.animation.core.w1<Boolean> b() {
        return this.f31322c;
    }

    @Override // androidx.compose.material3.n90
    @Nullable
    public Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = this.f31321b.d(q3Var, new a(new b(null), q3Var, null), dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Override // androidx.compose.material3.n90
    public boolean d() {
        return this.f31320a;
    }

    @Override // androidx.compose.material3.n90
    public void dismiss() {
        kotlinx.coroutines.n<? super Unit> nVar;
        b().f(Boolean.FALSE);
        if (!d() || (nVar = this.f31323d) == null) {
            return;
        }
        kotlinx.coroutines.n.a.a(nVar, null, 1, null);
    }

    @Override // androidx.compose.material3.n90
    public boolean isVisible() {
        return b().a().booleanValue() || b().b().booleanValue();
    }
}
