package com.planner5d.library.model.manager.payments;

import android.app.Application;
import androidx.annotation.m1;
import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
@SourceDebugExtension({"SMAP\nPaymentDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentDao.kt\ncom/planner5d/library/model/manager/payments/PaymentDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,238:1\n1619#2:239\n1863#2:240\n1864#2:242\n1620#2:243\n1619#2:246\n1863#2:247\n1864#2:249\n1620#2:250\n1#3:241\n1#3:248\n1#3:253\n37#4,2:244\n37#4,2:251\n37#4,2:254\n*S KotlinDebug\n*F\n+ 1 PaymentDao.kt\ncom/planner5d/library/model/manager/payments/PaymentDao\n*L\n74#1:239\n74#1:240\n74#1:242\n74#1:243\n92#1:246\n92#1:247\n92#1:249\n92#1:250\n74#1:241\n92#1:248\n83#1:244,2\n101#1:251,2\n161#1:254,2\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f192263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<u1> f192264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.observable.c<Long, Payment> f192265c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentDao$observePaymentById$1", f = "PaymentDao.kt", i = {0, 0}, l = {146, 152, 152, 152}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nPaymentDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentDao.kt\ncom/planner5d/library/model/manager/payments/PaymentDao$observePaymentById$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super Payment>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f192270e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f192272g;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.payments.e$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentDao$observePaymentById$1$2", f = "PaymentDao.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1600a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Payment>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f192273a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f192274b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f192275c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1600a(e eVar, long j10, kotlin.coroutines.d<? super C1600a> dVar) {
                super(2, dVar);
                this.f192274b = eVar;
                this.f192275c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1600a(this.f192274b, this.f192275c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f192273a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f192274b.f(this.f192275c);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Payment> dVar) {
                return ((C1600a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f192272g = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(l0 l0Var, Payment payment) {
            l0Var.p(payment);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(i1.h hVar, e eVar) {
            Function1 function1 = (Function1) hVar.f312751a;
            if (function1 != null) {
                eVar.f192265c.d(function1);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = e.this.new a(this.f192272g, dVar);
            aVar.f192270e = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
        
            if (kotlinx.coroutines.channels.j0.b(r10, r3, r17) == r2) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
        
            if (kotlinx.coroutines.channels.j0.b(r9, r3, r17) == r2) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [T, com.planner5d.library.model.manager.payments.c] */
        /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.internal.i1$h] */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5, types: [com.planner5d.library.services.observable.c] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v9 */
        /* JADX WARN: Type inference failed for: r9v1, types: [kotlinx.coroutines.channels.l0, kotlinx.coroutines.channels.o0] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [kotlin.jvm.internal.i1$h] */
        /* JADX WARN: Type inference failed for: r9v6 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super Payment> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public e(@NotNull Application application, @NotNull fg.e<u1> logRecordManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f192263a = application;
        this.f192264b = logRecordManager;
        this.f192265c = new com.planner5d.library.services.observable.c<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(Payment.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return String.valueOf(it.n());
    }

    @m1
    @NotNull
    public final Payment c(@NotNull com.planner5d.library.model.payments.paymentmethod.e method, @Nullable fd.f fVar) {
        Intrinsics.checkNotNullParameter(method, "method");
        Payment payment = new Payment();
        payment.O(new Date());
        payment.S(method);
        payment.W(Payment.b.Started.n());
        payment.U(fVar);
        n(payment);
        return payment;
    }

    @m1
    @Nullable
    public final Payment d(@NotNull com.planner5d.library.model.payments.paymentmethod.e method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Payment) new Select().from(Payment.class).where("method = ? AND state = ?", Integer.valueOf(method.getId().n()), Integer.valueOf(Payment.b.Started.n())).orderBy("id DESC").limit(1).executeSingle();
    }

    @m1
    @NotNull
    public final Payment e(@NotNull com.planner5d.library.model.payments.paymentmethod.e method, @NotNull com.planner5d.library.model.payments.a order, @Nullable fd.f fVar) throws JSONException {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(order, "order");
        Payment paymentG = g(order);
        if (paymentG == null) {
            paymentG = new Payment();
        }
        paymentG.S(method);
        paymentG.T(order);
        try {
            paymentG.U(fVar);
            return paymentG;
        } catch (Throwable th2) {
            this.f192264b.get().b("create_missing_payment", order.f222476b, th2);
            return paymentG;
        }
    }

    @m1
    @NotNull
    public final Payment f(long j10) throws IllegalArgumentException {
        Payment payment = (Payment) new Select().from(Payment.class).where("id = ?", Long.valueOf(j10)).executeSingle();
        if (payment != null) {
            return payment;
        }
        throw new IllegalArgumentException("No payment found for ID = " + j10);
    }

    @m1
    @Nullable
    public final Payment g(@Nullable com.planner5d.library.model.payments.a aVar) {
        if (aVar == null) {
            return null;
        }
        return j(null).b(aVar);
    }

    @m1
    @NotNull
    public final Payment[] h(@NotNull Payment.b... states) {
        Intrinsics.checkNotNullParameter(states, "states");
        String strJoinToString$default = ArraysKt.joinToString$default(states, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.planner5d.library.model.manager.payments.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.i((Payment.b) obj);
            }
        }, 30, (Object) null);
        List listExecute = new Select().from(Payment.class).where("state IN (" + strJoinToString$default + ") AND purchase IS NOT NULL").execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return (Payment[]) listExecute.toArray(new Payment[0]);
    }

    @m1
    @NotNull
    public final t j(@Nullable com.planner5d.library.model.payments.paymentmethod.e eVar) {
        From fromWhere = new Select().from(Payment.class).where("length(purchase) IS NOT NULL");
        if (eVar != null) {
            fromWhere.where("method = ?", Integer.valueOf(eVar.getId().n()));
        }
        return new t(fromWhere.execute());
    }

    @m1
    @Nullable
    public final Payment k(@NotNull com.planner5d.library.model.payments.paymentmethod.e method, @NotNull com.planner5d.library.model.payments.a order) throws JSONException {
        Object next;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(order, "order");
        List listExecute = new Select().from(Payment.class).where("method = ? AND state = ?", Integer.valueOf(method.getId().n()), Integer.valueOf(Payment.b.StartedAndPending.n())).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        Iterator it = listExecute.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(order, ((Payment) next).s())) {
                return (Payment) next;
            }
        }
        next = null;
        return (Payment) next;
    }

    @m1
    @NotNull
    public final com.planner5d.library.model.payments.a[] l(@NotNull Payment.b state) {
        com.planner5d.library.model.payments.a aVarS;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == Payment.b.Consumed) {
            return new com.planner5d.library.model.payments.a[0];
        }
        List<Payment> listExecute = new Select().from(Payment.class).where("state = ?", state).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Payment payment : listExecute) {
            if (payment.E()) {
                try {
                    aVarS = payment.s();
                } catch (JSONException e10) {
                    timber.log.b.f381052a.e(e10);
                    aVarS = null;
                }
            } else {
                aVarS = null;
            }
            if (aVarS != null) {
                linkedHashSet.add(aVarS);
            }
        }
        return (com.planner5d.library.model.payments.a[]) linkedHashSet.toArray(new com.planner5d.library.model.payments.a[0]);
    }

    @m1
    @NotNull
    public final com.planner5d.library.model.payments.a[] m() {
        com.planner5d.library.model.payments.a aVarS;
        List<Payment> listExecute = new Select().from(Payment.class).where("state == ?", Integer.valueOf(Payment.b.Validated.n())).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Payment payment : listExecute) {
            if (payment.E()) {
                try {
                    aVarS = payment.s();
                } catch (JSONException e10) {
                    timber.log.b.f381052a.e(e10);
                    aVarS = null;
                }
            } else {
                aVarS = null;
            }
            if (aVarS != null) {
                linkedHashSet.add(aVarS);
            }
        }
        return (com.planner5d.library.model.payments.a[]) linkedHashSet.toArray(new com.planner5d.library.model.payments.a[0]);
    }

    @m1
    public final void n(@NotNull Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Long id2 = payment.getId();
        payment.save();
        if (id2 != null) {
            this.f192265c.c(id2, payment);
        }
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Payment> o(long j10) {
        return kotlinx.coroutines.flow.k.Y(kotlinx.coroutines.flow.k.t(new a(j10, null)));
    }

    @m1
    public final void p(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Payment paymentG = g(aVar);
        if (paymentG != null) {
            if (paymentG.H()) {
                paymentG = null;
            }
            if (paymentG != null) {
                paymentG.P(ErrorMessageException.getError(this.f192263a, error));
                n(paymentG);
            }
        }
    }

    @m1
    public final void q(@NotNull Payment payment, @Nullable fd.f fVar) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        payment.U(fVar);
        n(payment);
    }

    @m1
    public final void r(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull Payment.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Payment paymentG = g(aVar);
        if (paymentG == null || paymentG.H()) {
            return;
        }
        paymentG.W(state.n());
        n(paymentG);
    }

    @m1
    public final void s(@NotNull com.planner5d.library.model.payments.paymentmethod.e method, @NotNull com.planner5d.library.model.payments.a order) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(order, "order");
        try {
            if (k(method, order) != null) {
                return;
            }
            Payment paymentD = d(method);
            if (paymentD == null) {
                paymentD = new Payment();
                paymentD.O(new Date());
                paymentD.S(method);
            }
            paymentD.W(Payment.b.StartedAndPending.n());
            paymentD.T(order);
            n(paymentD);
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
        }
    }

    @m1
    public final void t(@NotNull com.planner5d.library.model.payments.paymentmethod.e method, @NotNull com.planner5d.library.model.payments.a[] list) {
        Payment payment;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(list, "list");
        t tVarJ = j(null);
        for (com.planner5d.library.model.payments.a aVar : list) {
            if (tVarJ.a(aVar)) {
                payment = tVarJ.b(aVar);
            } else {
                payment = new Payment();
                payment.O(new Date());
                payment.N(payment.v());
                payment.S(method);
                if (payment.y() == com.planner5d.library.model.payments.paymentmethod.e.a.Google.n()) {
                    payment.W(Payment.b.Finished.n());
                }
            }
            if (payment != null) {
                if (payment.L()) {
                    payment.W(Payment.b.Finished.n());
                }
                try {
                    payment.T(aVar);
                } catch (JSONException e10) {
                    timber.log.b.f381052a.e(e10);
                }
                n(payment);
            }
        }
    }
}
