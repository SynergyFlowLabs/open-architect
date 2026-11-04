package com.planner5d.library.model.manager.payments;

import com.planner5d.library.services.utility.a2;
import com.planner5d.library.services.utility.f1;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
@SourceDebugExtension({"SMAP\nPurchasedStatusCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasedStatusCache.kt\ncom/planner5d/library/model/manager/payments/PurchasedStatusCache\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,105:1\n116#2,10:106\n116#2,10:116\n116#2,10:126\n*S KotlinDebug\n*F\n+ 1 PurchasedStatusCache.kt\ncom/planner5d/library/model/manager/payments/PurchasedStatusCache\n*L\n48#1:106,10\n62#1:116,10\n72#1:126,10\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f1 f193003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f193004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a2 f193005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f193006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private fd.o f193007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f193008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Long f193009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f193010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f193011i;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PurchasedStatusCache", f = "PurchasedStatusCache.kt", i = {0, 0, 0}, l = {110}, m = "cachePurchasedStatus", n = {"this", "status", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f193012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f193013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f193014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f193015d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193017f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f193015d = obj;
            this.f193017f |= Integer.MIN_VALUE;
            return v.this.f(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PurchasedStatusCache", f = "PurchasedStatusCache.kt", i = {0, 0}, l = {110}, m = "getCachedPurchasedStatus", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f193018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f193019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f193020c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193022e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f193020c = obj;
            this.f193022e |= Integer.MIN_VALUE;
            return v.this.g(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PurchasedStatusCache", f = "PurchasedStatusCache.kt", i = {0, 0}, l = {110}, m = "resetCache", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f193023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f193024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f193025c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193027e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f193025c = obj;
            this.f193027e |= Integer.MIN_VALUE;
            return v.this.j(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PurchasedStatusCache$setUpCacheResetOnUserChange$1", f = "PurchasedStatusCache.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f193028a;

        @SourceDebugExtension({"SMAP\nPurchasedStatusCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasedStatusCache.kt\ncom/planner5d/library/model/manager/payments/PurchasedStatusCache$setUpCacheResetOnUserChange$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,105:1\n116#2,10:106\n*S KotlinDebug\n*F\n+ 1 PurchasedStatusCache.kt\ncom/planner5d/library/model/manager/payments/PurchasedStatusCache$setUpCacheResetOnUserChange$1$1\n*L\n85#1:106,10\n*E\n"})
        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f193030a;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.payments.v$d$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PurchasedStatusCache$setUpCacheResetOnUserChange$1$1", f = "PurchasedStatusCache.kt", i = {0, 0}, l = {110}, m = "emit", n = {"$this$withLock_u24default$iv", "newUserId"}, s = {"L$0", "J$0"})
            static final class C1604a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                long f193031a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f193032b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f193033c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f193034d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ a<T> f193035e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f193036f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1604a(a<? super T> aVar, kotlin.coroutines.d<? super C1604a> dVar) {
                    super(dVar);
                    this.f193035e = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f193034d = obj;
                    this.f193036f |= Integer.MIN_VALUE;
                    return this.f193035e.emit(null, this);
                }
            }

            a(v vVar) {
                this.f193030a = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
                C1604a c1604a;
                v vVar;
                long j10;
                kotlinx.coroutines.sync.a aVar2;
                if (dVar instanceof C1604a) {
                    c1604a = (C1604a) dVar;
                    int i10 = c1604a.f193036f;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c1604a.f193036f = i10 - Integer.MIN_VALUE;
                    } else {
                        c1604a = new C1604a(this, dVar);
                    }
                } else {
                    c1604a = new C1604a(this, dVar);
                }
                Object obj = c1604a.f193034d;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c1604a.f193036f;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    long jA = com.planner5d.library.modules.user.user.x.a(aVar);
                    kotlinx.coroutines.sync.a aVar3 = this.f193030a.f193010h;
                    v vVar2 = this.f193030a;
                    c1604a.f193032b = aVar3;
                    c1604a.f193033c = vVar2;
                    c1604a.f193031a = jA;
                    c1604a.f193036f = 1;
                    if (aVar3.h(null, c1604a) == objL) {
                        return objL;
                    }
                    vVar = vVar2;
                    j10 = jA;
                    aVar2 = aVar3;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = c1604a.f193031a;
                    vVar = (v) c1604a.f193033c;
                    aVar2 = (kotlinx.coroutines.sync.a) c1604a.f193032b;
                    ResultKt.m(obj);
                }
                try {
                    Long l10 = vVar.f193009g;
                    if (l10 == null || l10.longValue() != j10) {
                        vVar.f193009g = kotlin.coroutines.jvm.internal.b.g(j10);
                        vVar.k();
                    }
                    Unit unit = Unit.f312394a;
                    aVar2.i(null);
                    return unit;
                } catch (Throwable th2) {
                    aVar2.i(null);
                    throw th2;
                }
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f193028a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0<id.a> o0VarD = v.this.f193006d.d();
                a aVar = new a(v.this);
                this.f193028a = 1;
                if (o0VarD.collect(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public v(@NotNull f1 coroutineScope, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers, @NotNull a2 timeProvider, @NotNull com.planner5d.library.modules.user.user.w userAuthorization) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f193003a = coroutineScope;
        this.f193004b = coroutineDispatchers;
        this.f193005c = timeProvider;
        this.f193006d = userAuthorization;
        this.f193010h = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f193011i = TimeUnit.MINUTES.toMillis(1L);
        l();
    }

    private final boolean h() {
        return this.f193005c.a() - this.f193008f > this.f193011i;
    }

    private final boolean i() {
        fd.o oVar = this.f193007e;
        return (oVar == null || oVar.k()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f193007e = null;
    }

    private final void l() {
        kotlinx.coroutines.k.f(this.f193003a, this.f193004b.h(), null, new d(null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object f(@NotNull fd.o oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f193017f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f193017f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f193015d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f193017f;
        int i12 = 5 >> 0;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar2 = this.f193010h;
            aVar.f193012a = this;
            aVar.f193013b = oVar;
            aVar.f193014c = aVar2;
            aVar.f193017f = 1;
            if (aVar2.h(null, aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) aVar.f193014c;
            oVar = (fd.o) aVar.f193013b;
            v vVar = (v) aVar.f193012a;
            ResultKt.m(obj);
            aVar2 = aVar3;
            this = vVar;
        }
        try {
            this.f193007e = oVar;
            this.f193008f = this.f193005c.a();
            Unit unit = Unit.f312394a;
            aVar2.i(null);
            return unit;
        } catch (Throwable th2) {
            aVar2.i(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object g(@NotNull kotlin.coroutines.d<? super fd.o> dVar) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        fd.o oVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f193022e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f193022e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f193020c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f193022e;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f193010h;
            bVar.f193018a = this;
            bVar.f193019b = aVar;
            bVar.f193022e = 1;
            if (aVar.h(null, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) bVar.f193019b;
            v vVar = (v) bVar.f193018a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = vVar;
        }
        try {
            if (this.i() || this.h()) {
                this.k();
                oVar = null;
            } else {
                oVar = this.f193007e;
            }
            return oVar;
        } finally {
            aVar.i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object j(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f193027e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f193027e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f193025c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f193027e;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f193010h;
            cVar.f193023a = this;
            cVar.f193024b = aVar;
            cVar.f193027e = 1;
            if (aVar.h(null, cVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) cVar.f193024b;
            v vVar = (v) cVar.f193023a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = vVar;
        }
        try {
            this.k();
            Unit unit = Unit.f312394a;
            aVar.i(null);
            return unit;
        } catch (Throwable th2) {
            aVar.i(null);
            throw th2;
        }
    }
}
