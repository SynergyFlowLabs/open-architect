package com.planner5d.library.modules.user.user;

import com.planner5d.library.services.utility.z2;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p1;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@ij.f
@SourceDebugExtension({"SMAP\nUserPaymentsSynchronizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPaymentsSynchronizer.kt\ncom/planner5d/library/modules/user/user/UserPaymentsSynchronizer\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,119:1\n116#2,10:120\n*S KotlinDebug\n*F\n+ 1 UserPaymentsSynchronizer.kt\ncom/planner5d/library/modules/user/user/UserPaymentsSynchronizer\n*L\n112#1:120,10\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f223053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f223054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final z2 f223055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f223056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.model.manager.payments.j f223057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final w f223058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("mutex")
    @Nullable
    private Long f223059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("mutex")
    @Nullable
    private WeakReference<p2> f223060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f223061i;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPaymentsSynchronizer", f = "UserPaymentsSynchronizer.kt", i = {0, 0, 0, 1}, l = {com.planner5d.library.engine.input.f.b.B0, com.planner5d.library.engine.input.f.b.f160706l1}, m = "initializeLatestSynchronizationUserId", n = {"this", "user", "resetLegacyState", "user"}, s = {"L$0", "L$1", "Z$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f223064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f223065d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f223067f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223065d = obj;
            this.f223067f |= Integer.MIN_VALUE;
            return g0.this.l(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPaymentsSynchronizer", f = "UserPaymentsSynchronizer.kt", i = {0, 0, 1, 2, 2}, l = {com.planner5d.library.engine.input.f.b.f160745y1, 109, 124}, m = "refreshPayments", n = {"this", "user", "this", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223070c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223072e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223070c = obj;
            this.f223072e |= Integer.MIN_VALUE;
            return g0.this.m(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPaymentsSynchronizer$synchronizeOnce$1", f = "UserPaymentsSynchronizer.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223073a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f223075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f223076d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(id.a aVar, boolean z10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f223075c = aVar;
            this.f223076d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g0.this.new c(this.f223075c, this.f223076d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223073a;
            if (i10 == 0) {
                ResultKt.m(obj);
                g0 g0Var = g0.this;
                id.a aVar = this.f223075c;
                boolean z10 = this.f223076d;
                this.f223073a = 1;
                if (g0Var.o(aVar, z10, this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPaymentsSynchronizer$synchronizeOnceInternal$2", f = "UserPaymentsSynchronizer.kt", i = {0, 1, 2, 3}, l = {124, 61, 67, 72}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nUserPaymentsSynchronizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPaymentsSynchronizer.kt\ncom/planner5d/library/modules/user/user/UserPaymentsSynchronizer$synchronizeOnceInternal$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,119:1\n116#2,10:120\n*S KotlinDebug\n*F\n+ 1 UserPaymentsSynchronizer.kt\ncom/planner5d/library/modules/user/user/UserPaymentsSynchronizer$synchronizeOnceInternal$2\n*L\n59#1:120,10\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f223080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f223081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f223082f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ id.a f223084h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f223085i;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPaymentsSynchronizer$synchronizeOnceInternal$2$1$1", f = "UserPaymentsSynchronizer.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223086a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g0 f223087b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ id.a f223088c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, id.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f223087b = g0Var;
                this.f223088c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f223087b, this.f223088c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f223086a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    g0 g0Var = this.f223087b;
                    id.a aVar = this.f223088c;
                    this.f223086a = 1;
                    if (g0Var.m(aVar, this) == objL) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(id.a aVar, boolean z10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f223084h = aVar;
            this.f223085i = z10;
            int i10 = 7 << 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g0.this.new d(this.f223084h, this.f223085i, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00d6 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[Catch: all -> 0x00c7, TryCatch #3 {all -> 0x00c7, blocks: (B:51:0x0107, B:53:0x010d, B:55:0x0115, B:36:0x00bf, B:39:0x00ce, B:47:0x00e5, B:42:0x00d7, B:44:0x00df, B:30:0x00a5, B:32:0x00ab), top: B:72:0x00a5 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0104  */
        /* JADX WARN: Code duplicated, block: B:50:0x0105  */
        /* JADX WARN: Code duplicated, block: B:53:0x010d A[Catch: all -> 0x00c7, TryCatch #3 {all -> 0x00c7, blocks: (B:51:0x0107, B:53:0x010d, B:55:0x0115, B:36:0x00bf, B:39:0x00ce, B:47:0x00e5, B:42:0x00d7, B:44:0x00df, B:30:0x00a5, B:32:0x00ab), top: B:72:0x00a5 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            g0 g0Var;
            boolean z10;
            id.a aVar2;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar3;
            Object objL;
            g0 g0Var2;
            Long l10;
            com.planner5d.library.model.manager.config.p pVar;
            com.planner5d.library.services.r rVar;
            g0 g0Var3;
            id.a aVar4;
            WeakReference weakReference;
            p2 p2Var;
            id.a aVar5;
            g0 g0Var4;
            Object objL2 = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223082f;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = g0.this.f223061i;
                    g0Var = g0.this;
                    id.a aVar6 = this.f223084h;
                    z10 = this.f223085i;
                    this.f223077a = aVar;
                    this.f223078b = g0Var;
                    this.f223079c = aVar6;
                    this.f223081e = z10;
                    this.f223082f = 1;
                    if (aVar.h(null, this) != objL2) {
                        aVar2 = aVar6;
                    }
                    return objL2;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        g0Var = (g0) this.f223080d;
                        id.a aVar7 = (id.a) this.f223079c;
                        g0 g0Var5 = (g0) this.f223078b;
                        kotlinx.coroutines.sync.a aVar8 = (kotlinx.coroutines.sync.a) this.f223077a;
                        try {
                            ResultKt.m(obj);
                            objL = obj;
                            aVar = aVar8;
                            g0Var2 = g0Var5;
                            aVar2 = aVar7;
                            g0Var.f223059g = (Long) objL;
                            g0Var = g0Var2;
                            l10 = g0Var.f223059g;
                            long j10 = aVar2.f287075a;
                            if (l10 == null && l10.longValue() == j10) {
                                Unit unit = Unit.f312394a;
                                aVar.i(null);
                                return unit;
                            }
                            g0Var.f223059g = kotlin.coroutines.jvm.internal.b.g(aVar2.f287075a);
                            pVar = g0Var.f223056d;
                            rVar = com.planner5d.library.services.r.userIdHavingPaymentsUpdated;
                            this.f223077a = aVar;
                            this.f223078b = g0Var;
                            this.f223079c = aVar2;
                            this.f223080d = null;
                            this.f223082f = 3;
                            if (pVar.d(rVar, null, this) != objL2) {
                                g0Var3 = g0Var;
                                aVar4 = aVar2;
                                weakReference = g0Var3.f223060h;
                                if (weakReference == null) {
                                }
                                aVar3 = aVar;
                                g0Var3.f223060h = new WeakReference(kotlinx.coroutines.k.f(g0Var3.f223053a, g0Var3.f223054b.h(), null, new a(g0Var3, aVar4, null), 2, null));
                                Unit unit2 = Unit.f312394a;
                                aVar3.i(null);
                                return unit2;
                            }
                            return objL2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar3 = aVar8;
                        }
                    } else if (i10 == 3) {
                        aVar4 = (id.a) this.f223079c;
                        g0Var3 = (g0) this.f223078b;
                        kotlinx.coroutines.sync.a aVar9 = (kotlinx.coroutines.sync.a) this.f223077a;
                        try {
                            ResultKt.m(obj);
                            aVar = aVar9;
                            weakReference = g0Var3.f223060h;
                            if (weakReference == null && (p2Var = (p2) weakReference.get()) != null) {
                                this.f223077a = aVar;
                                this.f223078b = g0Var3;
                                this.f223079c = aVar4;
                                this.f223082f = 4;
                                if (s2.l(p2Var, this) != objL2) {
                                    aVar3 = aVar;
                                    aVar5 = aVar4;
                                    g0Var4 = g0Var3;
                                    g0Var3 = g0Var4;
                                    aVar4 = aVar5;
                                }
                                return objL2;
                            }
                            aVar3 = aVar;
                            g0Var3.f223060h = new WeakReference(kotlinx.coroutines.k.f(g0Var3.f223053a, g0Var3.f223054b.h(), null, new a(g0Var3, aVar4, null), 2, null));
                            Unit unit3 = Unit.f312394a;
                            aVar3.i(null);
                            return unit3;
                        } catch (Throwable th4) {
                            th2 = th4;
                            aVar3 = aVar9;
                        }
                    } else {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar5 = (id.a) this.f223079c;
                        g0Var4 = (g0) this.f223078b;
                        aVar3 = (kotlinx.coroutines.sync.a) this.f223077a;
                        try {
                            ResultKt.m(obj);
                            g0Var3 = g0Var4;
                            aVar4 = aVar5;
                            g0Var3.f223060h = new WeakReference(kotlinx.coroutines.k.f(g0Var3.f223053a, g0Var3.f223054b.h(), null, new a(g0Var3, aVar4, null), 2, null));
                            Unit unit4 = Unit.f312394a;
                            aVar3.i(null);
                            return unit4;
                        } catch (Throwable th5) {
                            th2 = th5;
                        }
                    }
                    aVar3.i(null);
                    throw th2;
                }
                boolean z11 = this.f223081e;
                aVar2 = (id.a) this.f223079c;
                g0 g0Var6 = (g0) this.f223078b;
                kotlinx.coroutines.sync.a aVar10 = (kotlinx.coroutines.sync.a) this.f223077a;
                ResultKt.m(obj);
                aVar = aVar10;
                z10 = z11;
                g0Var = g0Var6;
                if (g0Var.f223059g == null) {
                    this.f223077a = aVar;
                    this.f223078b = g0Var;
                    this.f223079c = aVar2;
                    this.f223080d = g0Var;
                    this.f223082f = 2;
                    objL = g0Var.l(aVar2, z10, this);
                    if (objL != objL2) {
                        g0Var2 = g0Var;
                        g0Var.f223059g = (Long) objL;
                        g0Var = g0Var2;
                        l10 = g0Var.f223059g;
                        long j11 = aVar2.f287075a;
                        if (l10 == null) {
                            Unit unit5 = Unit.f312394a;
                            aVar.i(null);
                            return unit5;
                        }
                        g0Var.f223059g = kotlin.coroutines.jvm.internal.b.g(aVar2.f287075a);
                        pVar = g0Var.f223056d;
                        rVar = com.planner5d.library.services.r.userIdHavingPaymentsUpdated;
                        this.f223077a = aVar;
                        this.f223078b = g0Var;
                        this.f223079c = aVar2;
                        this.f223080d = null;
                        this.f223082f = 3;
                        if (pVar.d(rVar, null, this) != objL2) {
                            g0Var3 = g0Var;
                            aVar4 = aVar2;
                            weakReference = g0Var3.f223060h;
                            if (weakReference == null) {
                            }
                            aVar3 = aVar;
                            g0Var3.f223060h = new WeakReference(kotlinx.coroutines.k.f(g0Var3.f223053a, g0Var3.f223054b.h(), null, new a(g0Var3, aVar4, null), 2, null));
                            Unit unit6 = Unit.f312394a;
                            aVar3.i(null);
                            return unit6;
                        }
                    }
                } else {
                    l10 = g0Var.f223059g;
                    long j12 = aVar2.f287075a;
                    if (l10 == null) {
                        Unit unit7 = Unit.f312394a;
                        aVar.i(null);
                        return unit7;
                    }
                    g0Var.f223059g = kotlin.coroutines.jvm.internal.b.g(aVar2.f287075a);
                    pVar = g0Var.f223056d;
                    rVar = com.planner5d.library.services.r.userIdHavingPaymentsUpdated;
                    this.f223077a = aVar;
                    this.f223078b = g0Var;
                    this.f223079c = aVar2;
                    this.f223080d = null;
                    this.f223082f = 3;
                    if (pVar.d(rVar, null, this) != objL2) {
                        g0Var3 = g0Var;
                        aVar4 = aVar2;
                        weakReference = g0Var3.f223060h;
                        if (weakReference == null) {
                        }
                        aVar3 = aVar;
                        g0Var3.f223060h = new WeakReference(kotlinx.coroutines.k.f(g0Var3.f223053a, g0Var3.f223054b.h(), null, new a(g0Var3, aVar4, null), 2, null));
                        Unit unit8 = Unit.f312394a;
                        aVar3.i(null);
                        return unit8;
                    }
                }
                return objL2;
            } catch (Throwable th6) {
                kotlinx.coroutines.sync.a aVar11 = aVar;
                th2 = th6;
                aVar3 = aVar11;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public g0(@NotNull com.planner5d.library.services.utility.f1 globalCoroutineScope, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers, @NotNull z2 strictlyOrderedCoroutinesFactory, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull com.planner5d.library.model.manager.payments.j paymentManager, @NotNull w userAuthorization) {
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(strictlyOrderedCoroutinesFactory, "strictlyOrderedCoroutinesFactory");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f223053a = globalCoroutineScope;
        this.f223054b = coroutineDispatchers;
        this.f223055c = strictlyOrderedCoroutinesFactory;
        this.f223056d = preferences;
        this.f223057e = paymentManager;
        this.f223058f = userAuthorization;
        this.f223061i = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[Catch: p1 -> 0x00ab, TRY_LEAVE, TryCatch #1 {p1 -> 0x00ab, blocks: (B:15:0x0038, B:38:0x009a, B:40:0x00a2, B:34:0x0085), top: B:45:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object l(id.a aVar, boolean z10, kotlin.coroutines.d<? super Long> dVar) {
        a aVar2;
        long jLongValue;
        id.a aVar3;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i10 = aVar2.f223067f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f223067f = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object objG = aVar2.f223065d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f223067f;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(objG);
                    com.planner5d.library.model.manager.config.p pVar = this.f223056d;
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userIdHavingPaymentsUpdated;
                    aVar2.f223062a = this;
                    aVar2.f223063b = aVar;
                    aVar2.f223064c = z10;
                    aVar2.f223067f = 1;
                    objG = pVar.o(rVar, 0L, aVar2);
                    if (objG == objL) {
                    }
                    return objL;
                }
                if (i11 == 1) {
                    z10 = aVar2.f223064c;
                    aVar = (id.a) aVar2.f223063b;
                    this = (g0) aVar2.f223062a;
                    ResultKt.m(objG);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (id.a) aVar2.f223062a;
                    ResultKt.m(objG);
                }
                if (((Boolean) objG).booleanValue()) {
                    return kotlin.coroutines.jvm.internal.b.g(aVar3.f287075a);
                }
                return kotlin.coroutines.jvm.internal.b.g(0L);
                jLongValue = ((Number) objG).longValue();
            } catch (p1 unused) {
                jLongValue = 0;
            }
            if (jLongValue != 0) {
                return kotlin.coroutines.jvm.internal.b.g(jLongValue);
            }
            if (!z10) {
                com.planner5d.library.model.manager.config.p pVar2 = this.f223056d;
                com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.userIdHavingPaymentsUpdated;
                aVar2.f223062a = aVar;
                aVar2.f223063b = null;
                aVar2.f223067f = 2;
                objG = pVar2.G(rVar2, false, aVar2);
                if (objG != objL) {
                    aVar3 = aVar;
                    if (((Boolean) objG).booleanValue()) {
                        return kotlin.coroutines.jvm.internal.b.g(aVar3.f287075a);
                    }
                }
                return objL;
            }
            return kotlin.coroutines.jvm.internal.b.g(0L);
        } catch (p1 unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r13.r(r2, r7, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(id.a r12, kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.planner5d.library.modules.user.user.g0.b
            r10 = 5
            if (r0 == 0) goto L18
            r0 = r13
            com.planner5d.library.modules.user.user.g0$b r0 = (com.planner5d.library.modules.user.user.g0.b) r0
            int r1 = r0.f223072e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 7
            r3 = r1 & r2
            r10 = 3
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r10 = 2
            r0.f223072e = r1
            r10 = 3
            goto L1e
        L18:
            com.planner5d.library.modules.user.user.g0$b r0 = new com.planner5d.library.modules.user.user.g0$b
            r10 = 5
            r0.<init>(r13)
        L1e:
            java.lang.Object r13 = r0.f223070c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r10 = 2
            int r2 = r0.f223072e
            r10 = 3
            r3 = 3
            r4 = 2
            r10 = 3
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L63
            if (r2 == r5) goto L56
            if (r2 == r4) goto L4d
            r10 = 1
            if (r2 != r3) goto L42
            java.lang.Object r11 = r0.f223069b
            kotlinx.coroutines.sync.a r11 = (kotlinx.coroutines.sync.a) r11
            java.lang.Object r12 = r0.f223068a
            com.planner5d.library.modules.user.user.g0 r12 = (com.planner5d.library.modules.user.user.g0) r12
            kotlin.ResultKt.m(r13)
            goto La9
        L42:
            r10 = 2
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r10 = 3
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r10 = 4
            r11.<init>(r12)
            throw r11
        L4d:
            r10 = 6
            java.lang.Object r11 = r0.f223068a
            com.planner5d.library.modules.user.user.g0 r11 = (com.planner5d.library.modules.user.user.g0) r11
            kotlin.ResultKt.m(r13)     // Catch: java.lang.Exception -> L94
            goto Lb8
        L56:
            java.lang.Object r11 = r0.f223069b
            r12 = r11
            id.a r12 = (id.a) r12
            java.lang.Object r11 = r0.f223068a
            com.planner5d.library.modules.user.user.g0 r11 = (com.planner5d.library.modules.user.user.g0) r11
            kotlin.ResultKt.m(r13)     // Catch: java.lang.Exception -> L94
            goto L79
        L63:
            r10 = 4
            kotlin.ResultKt.m(r13)
            com.planner5d.library.model.manager.payments.j r13 = r11.f223057e     // Catch: java.lang.Exception -> L94
            r10 = 5
            r0.f223068a = r11     // Catch: java.lang.Exception -> L94
            r10 = 6
            r0.f223069b = r12     // Catch: java.lang.Exception -> L94
            r10 = 3
            r0.f223072e = r5     // Catch: java.lang.Exception -> L94
            java.lang.Object r13 = r13.A0(r12, r0)     // Catch: java.lang.Exception -> L94
            if (r13 != r1) goto L79
            goto La4
        L79:
            com.planner5d.library.modules.user.user.w r13 = r11.f223058f     // Catch: java.lang.Exception -> L94
            boolean r13 = r13.b()     // Catch: java.lang.Exception -> L94
            if (r13 == 0) goto Lb8
            com.planner5d.library.model.manager.config.p r13 = r11.f223056d     // Catch: java.lang.Exception -> L94
            com.planner5d.library.services.r r2 = com.planner5d.library.services.r.userIdHavingPaymentsUpdated     // Catch: java.lang.Exception -> L94
            long r7 = r12.f287075a     // Catch: java.lang.Exception -> L94
            r0.f223068a = r11     // Catch: java.lang.Exception -> L94
            r0.f223069b = r6     // Catch: java.lang.Exception -> L94
            r0.f223072e = r4     // Catch: java.lang.Exception -> L94
            java.lang.Object r11 = r13.r(r2, r7, r0)     // Catch: java.lang.Exception -> L94
            if (r11 != r1) goto Lb8
            goto La4
        L94:
            kotlinx.coroutines.sync.a r12 = r11.f223061i
            r10 = 3
            r0.f223068a = r11
            r0.f223069b = r12
            r0.f223072e = r3
            r10 = 1
            java.lang.Object r13 = r12.h(r6, r0)
            if (r13 != r1) goto La6
        La4:
            r10 = 4
            return r1
        La6:
            r9 = r12
            r12 = r11
            r11 = r9
        La9:
            r0 = 0
            java.lang.Long r13 = kotlin.coroutines.jvm.internal.b.g(r0)     // Catch: java.lang.Throwable -> Lbb
            r10 = 7
            r12.f223059g = r13     // Catch: java.lang.Throwable -> Lbb
            kotlin.Unit r12 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> Lbb
            r10 = 0
            r11.i(r6)
        Lb8:
            kotlin.Unit r11 = kotlin.Unit.f312394a
            return r11
        Lbb:
            r12 = move-exception
            r11.i(r6)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.g0.m(id.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(id.a aVar, boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(c3.f313552a, new d(aVar, z10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final void n(@Nullable id.a aVar, boolean z10) {
        if (aVar == null) {
            return;
        }
        z2.b(this.f223055c, this.f223053a, this.f223054b.h(), null, new c(aVar, z10, null), 4, null);
    }
}
