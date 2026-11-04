package com.planner5d.library.services;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f224441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f224442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f224443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private p2 f224444d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.SimpleTicker$startTickWithFixedDelays$2", f = "SimpleTicker.kt", i = {}, l = {23, 24}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f224445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f224446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f224447c;

        /* JADX INFO: renamed from: com.planner5d.library.services.n0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.SimpleTicker$startTickWithFixedDelays$2$1", f = "SimpleTicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1674a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f224448a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0 f224449b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1674a(n0 n0Var, kotlin.coroutines.d<? super C1674a> dVar) {
                super(2, dVar);
                this.f224449b = n0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1674a(this.f224449b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f224448a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Function0<Unit> function0C = this.f224449b.c();
                if (function0C == null) {
                    return null;
                }
                function0C.invoke();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1674a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, n0 n0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f224446b = j10;
            this.f224447c = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f224446b, this.f224447c, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:14:0x0031  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 2
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f224445a
                r6 = 7
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L11
                goto L22
            L11:
                r6 = 2
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "e/set/m//i u c/wl/ t rnsoeuiolkai /tr /oerveefoncbh"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1c:
                r6 = 2
                kotlin.ResultKt.m(r8)
                r6 = 3
                goto L31
            L22:
                kotlin.ResultKt.m(r8)
            L25:
                long r4 = r7.f224446b
                r7.f224445a = r3
                java.lang.Object r8 = kotlinx.coroutines.d1.b(r4, r7)
                r6 = 2
                if (r8 != r0) goto L31
                goto L48
            L31:
                com.planner5d.library.services.n0 r8 = r7.f224447c
                kotlin.coroutines.CoroutineContext r8 = com.planner5d.library.services.n0.a(r8)
                com.planner5d.library.services.n0$a$a r1 = new com.planner5d.library.services.n0$a$a
                com.planner5d.library.services.n0 r4 = r7.f224447c
                r5 = 0
                r1.<init>(r4, r5)
                r7.f224445a = r2
                java.lang.Object r8 = kotlinx.coroutines.i.h(r8, r1, r7)
                r6 = 4
                if (r8 != r0) goto L25
            L48:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.n0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void b() {
        p2 p2Var = this.f224444d;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f224444d = null;
    }

    @Nullable
    public final Function0<Unit> c() {
        return this.f224443c;
    }

    public final void d(@Nullable Function0<Unit> function0) {
        this.f224443c = function0;
    }

    public final void e(long j10) {
        p2 p2Var = this.f224444d;
        if (p2Var == null || !p2Var.isActive()) {
            int i10 = 7 >> 3;
            this.f224444d = kotlinx.coroutines.k.f(this.f224441a, null, null, new a(j10, this, null), 3, null);
        }
    }

    public n0(@NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull CoroutineContext tickDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(tickDispatcher, "tickDispatcher");
        this.f224441a = coroutineScope;
        this.f224442b = tickDispatcher;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n0(kotlinx.coroutines.s0 s0Var, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        s0Var = (i10 & 1) != 0 ? kotlinx.coroutines.t0.b() : s0Var;
        this(s0Var, (i10 & 2) != 0 ? s0Var.getCoroutineContext() : coroutineContext);
    }
}
