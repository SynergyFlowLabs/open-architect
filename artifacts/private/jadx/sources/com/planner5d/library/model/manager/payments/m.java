package com.planner5d.library.model.manager.payments;

import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.services.utility.i0;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.w> f192537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<j> f192538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u0 f192539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f192540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f192541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f192542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f192543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f192544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Long f192545i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f192546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f192547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f192548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f192549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f192550e;

        public a(boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
            this.f192546a = z10;
            this.f192547b = z11;
            this.f192548c = z12;
            this.f192549d = z13;
            this.f192550e = j10;
        }

        public static /* synthetic */ a g(a aVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f192546a;
            }
            if ((i10 & 2) != 0) {
                z11 = aVar.f192547b;
            }
            if ((i10 & 4) != 0) {
                z12 = aVar.f192548c;
            }
            if ((i10 & 8) != 0) {
                z13 = aVar.f192549d;
            }
            if ((i10 & 16) != 0) {
                j10 = aVar.f192550e;
            }
            long j11 = j10;
            return aVar.f(z10, z11, z12, z13, j11);
        }

        public final boolean a() {
            return this.f192546a;
        }

        public final boolean b() {
            return this.f192547b;
        }

        public final boolean c() {
            return this.f192548c;
        }

        public final boolean d() {
            return this.f192549d;
        }

        public final long e() {
            return this.f192550e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f192546a == aVar.f192546a && this.f192547b == aVar.f192547b && this.f192548c == aVar.f192548c && this.f192549d == aVar.f192549d && this.f192550e == aVar.f192550e;
        }

        @NotNull
        public final a f(boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
            return new a(z10, z11, z12, z13, j10);
        }

        public final boolean h() {
            return this.f192547b;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.f192546a) * 31) + Boolean.hashCode(this.f192547b)) * 31) + Boolean.hashCode(this.f192548c)) * 31) + Boolean.hashCode(this.f192549d)) * 31) + Long.hashCode(this.f192550e);
        }

        public final boolean i() {
            return this.f192546a;
        }

        public final boolean j() {
            return this.f192548c;
        }

        public final long k() {
            return this.f192550e;
        }

        public final boolean l() {
            return this.f192549d;
        }

        @NotNull
        public String toString() {
            return "SubscriptionInfo(subscribed=" + this.f192546a + ", neverSubscribed=" + this.f192547b + ", subscriptionCanceled=" + this.f192548c + ", willEnd=" + this.f192549d + ", subscriptionRemainingDays=" + this.f192550e + ")";
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentSubscription$getSubscriptionInfo$2", f = "PaymentSubscription.kt", i = {0, 0, 1, 1, 2}, l = {45, 46, com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {"user", "userId", "user", "userId", "userId"}, s = {"L$0", "J$0", "L$0", "J$0", "J$0"})
    @SourceDebugExtension({"SMAP\nPaymentSubscription.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSubscription.kt\ncom/planner5d/library/model/manager/payments/PaymentSubscription$getSubscriptionInfo$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n13409#2,2:132\n1#3:134\n*S KotlinDebug\n*F\n+ 1 PaymentSubscription.kt\ncom/planner5d/library/model/manager/payments/PaymentSubscription$getSubscriptionInfo$2\n*L\n62#1:132,2\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f192552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192553c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new b(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:32:0x00da  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            id.a aVarA;
            long jA;
            b bVar;
            id.a aVar;
            long j10;
            m mVar;
            int i10;
            Long l10;
            Payment payment;
            com.planner5d.library.model.payments.a aVarP;
            fd.i iVarQ;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f192553c;
            if (i11 == 0) {
                ResultKt.m(obj);
                aVarA = ((com.planner5d.library.modules.user.user.w) m.this.f192537a.get()).a();
                jA = com.planner5d.library.modules.user.user.x.a(aVarA);
                m mVar2 = m.this;
                this.f192551a = aVarA;
                this.f192552b = jA;
                this.f192553c = 1;
                if (mVar2.t(aVarA, this) != objL) {
                }
                return objL;
            }
            if (i11 == 1) {
                jA = this.f192552b;
                aVarA = (id.a) this.f192551a;
                ResultKt.m(obj);
            } else {
                if (i11 == 2) {
                    jA = this.f192552b;
                    aVar = (id.a) this.f192551a;
                    ResultKt.m(obj);
                    bVar = this;
                    if (aVar != null) {
                        m.this.f192540d = aVar.e();
                        m.this.f192541e = aVar.l();
                        if (aVar.e()) {
                            m.this.f192544h = aVar.a();
                        }
                    }
                    j jVar = (j) m.this.f192538b.get();
                    bVar.f192551a = null;
                    bVar.f192552b = jA;
                    bVar.f192553c = 3;
                    obj = jVar.i0(bVar);
                    if (obj != objL) {
                        j10 = jA;
                    }
                    return objL;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f192552b;
                ResultKt.m(obj);
                bVar = this;
            }
            mVar = m.this;
            for (Object obj2 : (Object[]) obj) {
                payment = (Payment) obj2;
                if (payment.C() == j10 && (aVarP = mVar.p(payment)) != null && (iVarQ = mVar.q(aVarP, j10)) != null && iVarQ.r()) {
                    mVar.f192541e = true;
                    mVar.s(payment, aVarP);
                }
            }
            if (!m.this.f192540d && m.this.f192541e && (l10 = m.this.f192545i) != null) {
                m.this.f192544h = l10.longValue();
            }
            return m.this.o();
            id.a aVar2 = aVarA;
            u0 u0Var = m.this.f192539c;
            this.f192551a = aVar2;
            this.f192552b = jA;
            this.f192553c = 2;
            bVar = this;
            if (u0.b.a(u0Var, aVar2, false, bVar, 2, null) != objL) {
                aVar = aVar2;
                if (aVar != null) {
                    m.this.f192540d = aVar.e();
                    m.this.f192541e = aVar.l();
                    if (aVar.e()) {
                        m.this.f192544h = aVar.a();
                    }
                }
                j jVar2 = (j) m.this.f192538b.get();
                bVar.f192551a = null;
                bVar.f192552b = jA;
                bVar.f192553c = 3;
                obj = jVar2.i0(bVar);
                if (obj != objL) {
                    j10 = jA;
                    mVar = m.this;
                    while (i10 < r2) {
                        payment = (Payment) obj2;
                        if (payment.C() == j10) {
                            mVar.f192541e = true;
                            mVar.s(payment, aVarP);
                        }
                    }
                    if (!m.this.f192540d) {
                        m.this.f192544h = l10.longValue();
                    }
                    return m.this.o();
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super a> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentSubscription", f = "PaymentSubscription.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160745y1}, m = "refreshPayments", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f192555a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192557c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192555a = obj;
            this.f192557c |= Integer.MIN_VALUE;
            return m.this.t(null, this);
        }
    }

    @ij.a
    public m(@NotNull fg.e<com.planner5d.library.modules.user.user.w> userAuthorization, @NotNull fg.e<j> paymentManager, @NotNull u0 userPurchases) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        this.f192537a = userAuthorization;
        this.f192538b = paymentManager;
        this.f192539c = userPurchases;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a o() {
        return new a(this.f192540d, !this.f192541e, this.f192543g, this.f192542f, this.f192544h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.model.payments.a p(Payment payment) {
        try {
            return payment.s();
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fd.i q(com.planner5d.library.model.payments.a aVar, long j10) {
        try {
            return aVar.d(j10);
        } catch (u.a e10) {
            timber.log.b.f381052a.e(e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Payment payment, com.planner5d.library.model.payments.a aVar) {
        Long lX = payment.x();
        long jLongValue = ((lX != null ? lX.longValue() : 0L) - new Date().getTime()) / i0.b(1L);
        if (payment.F()) {
            this.f192540d = true;
            this.f192542f = !payment.G();
            this.f192543g = aVar.f();
            this.f192544h = jLongValue;
            return;
        }
        if (payment.x() != null) {
            Long l10 = this.f192545i;
            this.f192545i = Long.valueOf(Math.max(jLongValue, l10 != null ? l10.longValue() : Long.MIN_VALUE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object t(id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f192557c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f192557c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f192555a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f192557c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                j jVar = this.f192538b.get();
                cVar.f192557c = 1;
                if (jVar.A0(aVar, cVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
        return Unit.f312394a;
    }

    @Nullable
    public final Object r(@NotNull kotlin.coroutines.d<? super a> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(null), dVar);
    }
}
