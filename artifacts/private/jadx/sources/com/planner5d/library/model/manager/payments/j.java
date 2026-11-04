package com.planner5d.library.model.manager.payments;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.m1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.model.manager.q2;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.o2;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
@SourceDebugExtension({"SMAP\nPaymentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,732:1\n1734#2,3:733\n1611#2,9:739\n1863#2:748\n1864#2:750\n1620#2:751\n37#3,2:736\n1#4:738\n1#4:749\n54#5,8:752\n*S KotlinDebug\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager\n*L\n134#1:733,3\n308#1:739,9\n308#1:748\n308#1:750\n308#1:751\n171#1:736,2\n308#1:749\n374#1:752,8\n*E\n"})
public final class j implements com.planner5d.library.model.manager.payments.k, x1, com.planner5d.library.model.payments.paymentmethod.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Application f192281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.h> f192282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f192283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.payments.paymentmethod.e> f192284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.payments.paymentmethod.i> f192285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.payments.p> f192286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.payments.r> f192287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c2 f192288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.e f192289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final q2 f192290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.v f192291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.w> f192292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f192293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final u0 f192294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final u1 f192295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final f1 f192296r;

    private static final class a extends Exception {
        public a() {
            super("Order SKU not found");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0}, l = {656}, m = "processSuccessfulOrdersUpdate", n = {"this", "user"}, s = {"L$0", "L$1"})
    static final class a0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192299c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192301e;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192299c = obj;
            this.f192301e |= Integer.MIN_VALUE;
            return j.this.y0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {2, 2, 2, 3, 3, 3}, l = {671, 675, 678, 678, 679}, m = "assignNotCanceledOrRefundedOrder", n = {"this", "order", "orderSku", "this", "order", "orderSku"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f192305d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192307f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192305d = obj;
            this.f192307f |= Integer.MIN_VALUE;
            return j.this.Y(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$processSuccessfulOrdersUpdate$2", f = "PaymentManager.kt", i = {}, l = {659}, m = "invokeSuspend", n = {}, s = {})
    static final class b0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192308a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f192310c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(id.a aVar, kotlin.coroutines.d<? super b0> dVar) {
            super(2, dVar);
            this.f192310c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new b0(this.f192310c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192308a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = j.this;
                    id.a aVar = this.f192310c;
                    this.f192308a = 1;
                    if (jVar.o(aVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$assignOrder$2", f = "PaymentManager.kt", i = {}, l = {619, 623}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.paymentmethod.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f192313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f192314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f192315e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.planner5d.library.model.payments.a aVar, boolean z10, j jVar, id.a aVar2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f192312b = aVar;
            this.f192313c = z10;
            this.f192314d = jVar;
            this.f192315e = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f192312b, this.f192313c, this.f192314d, this.f192315e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r6 == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Exception {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f192311a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.m(r6)
                return r6
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                r4 = 7
                kotlin.ResultKt.m(r6)
                goto L3d
            L1f:
                kotlin.ResultKt.m(r6)
                r4 = 7
                com.planner5d.library.model.payments.a r6 = r5.f192312b
                boolean r6 = r6.f()
                if (r6 == 0) goto L4c
                boolean r6 = r5.f192313c
                if (r6 == 0) goto L49
                com.planner5d.library.model.manager.payments.j r6 = r5.f192314d
                r4 = 5
                com.planner5d.library.model.payments.a r1 = r5.f192312b
                r5.f192311a = r3
                java.lang.Object r6 = r6.k(r1, r5)
                if (r6 != r0) goto L3d
                goto L5c
            L3d:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r5 = r6.booleanValue()
                r4 = 7
                if (r5 == 0) goto L49
                com.planner5d.library.model.payments.paymentmethod.b r5 = com.planner5d.library.model.payments.paymentmethod.b.ORDER_CONSUMED
                return r5
            L49:
                com.planner5d.library.model.payments.paymentmethod.b r5 = com.planner5d.library.model.payments.paymentmethod.b.ORDER_UNASSIGNED
                return r5
            L4c:
                com.planner5d.library.model.manager.payments.j r6 = r5.f192314d
                r4 = 5
                id.a r1 = r5.f192315e
                com.planner5d.library.model.payments.a r3 = r5.f192312b
                r4 = 6
                r5.f192311a = r2
                java.lang.Object r5 = com.planner5d.library.model.manager.payments.j.w(r6, r1, r3, r5)
                if (r5 != r0) goto L5d
            L5c:
                return r0
            L5d:
                r4 = 2
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.paymentmethod.b> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0, 0, 0}, l = {191}, m = FirebaseAnalytics.c.D, n = {"this", "user", "product", "activity"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class c0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192320e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192322g;

        c0(kotlin.coroutines.d<? super c0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192320e = obj;
            this.f192322g |= Integer.MIN_VALUE;
            return j.this.z0(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0}, l = {685, 686}, m = "autoConsume", n = {"this", "order"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192325c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192327e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192325c = obj;
            this.f192327e |= Integer.MIN_VALUE;
            return j.this.Z(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$purchase$2", f = "PaymentManager.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    static final class d0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192328a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f192330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fd.f f192331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f192332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f192333f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$purchase$2$1", f = "PaymentManager.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f192334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f192335b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.a f192336c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f192337d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, com.planner5d.library.model.payments.a aVar, long j10, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f192335b = jVar;
                this.f192336c = aVar;
                this.f192337d = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192335b, this.f192336c, this.f192337d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192334a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = this.f192335b;
                    com.planner5d.library.model.payments.a aVar = this.f192336c;
                    Long lG = kotlin.coroutines.jvm.internal.b.g(this.f192337d);
                    this.f192334a = 1;
                    if (jVar.E0(aVar, null, lG, this) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$purchase$2$2", f = "PaymentManager.kt", i = {}, l = {200, 202, 205}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f192338a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f192339b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ id.a f192340c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ fd.f f192341d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f192342e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Activity f192343f;

            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$purchase$2$2$1", f = "PaymentManager.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Throwable, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f192344a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f192345b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ j f192346c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f192347d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar, long j10, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f192346c = jVar;
                    this.f192347d = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    a aVar = new a(this.f192346c, this.f192347d, dVar);
                    aVar.f192345b = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f192344a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Throwable th2 = (Throwable) this.f192345b;
                        j jVar = this.f192346c;
                        Long lG = kotlin.coroutines.jvm.internal.b.g(this.f192347d);
                        this.f192344a = 1;
                        if (jVar.E0(null, th2, lG, this) == objL) {
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
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((a) create(th2, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, id.a aVar, fd.f fVar, long j10, Activity activity, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f192339b = jVar;
                this.f192340c = aVar;
                this.f192341d = fVar;
                this.f192342e = j10;
                this.f192343f = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f192339b, this.f192340c, this.f192341d, this.f192342e, this.f192343f, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
            
                if (r5.g(r6, r7, r8, r10, r11, r12, r15) == r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
            
                if (r3.E0(null, r0, r5, r15) == r1) goto L30;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                /*
                    r15 = this;
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r0 = r15.f192338a
                    r2 = 0
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r0 == 0) goto L2a
                    if (r0 == r5) goto L22
                    if (r0 == r4) goto L1e
                    if (r0 != r3) goto L16
                    kotlin.ResultKt.m(r16)     // Catch: java.lang.Throwable -> L73
                    goto L7a
                L16:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1e:
                    kotlin.ResultKt.m(r16)
                    goto L8e
                L22:
                    kotlin.ResultKt.m(r16)     // Catch: java.lang.Exception -> L28
                    r0 = r16
                    goto L46
                L28:
                    r0 = move-exception
                    goto L7d
                L2a:
                    kotlin.ResultKt.m(r16)
                    com.planner5d.library.model.manager.payments.j r0 = r15.f192339b     // Catch: java.lang.Exception -> L28
                    fg.e r0 = com.planner5d.library.model.manager.payments.j.I(r0)     // Catch: java.lang.Exception -> L28
                    java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L28
                    com.planner5d.library.model.manager.payments.r r0 = (com.planner5d.library.model.manager.payments.r) r0     // Catch: java.lang.Exception -> L28
                    id.a r6 = r15.f192340c     // Catch: java.lang.Exception -> L28
                    fd.f r7 = r15.f192341d     // Catch: java.lang.Exception -> L28
                    r15.f192338a = r5     // Catch: java.lang.Exception -> L28
                    java.lang.Object r0 = r0.i(r6, r7, r15)     // Catch: java.lang.Exception -> L28
                    if (r0 != r1) goto L46
                    goto L8d
                L46:
                    r11 = r0
                    r11 = r0
                    java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L28
                    com.planner5d.library.model.manager.payments.j r0 = r15.f192339b     // Catch: java.lang.Throwable -> L73
                    com.planner5d.library.model.payments.paymentmethod.e r5 = r0.l0()     // Catch: java.lang.Throwable -> L73
                    fd.f r6 = r15.f192341d     // Catch: java.lang.Throwable -> L73
                    android.app.Activity r7 = r15.f192343f     // Catch: java.lang.Throwable -> L73
                    long r8 = r15.f192342e     // Catch: java.lang.Throwable -> L73
                    id.a r0 = r15.f192340c     // Catch: java.lang.Throwable -> L73
                    long r12 = com.planner5d.library.modules.user.user.x.a(r0)     // Catch: java.lang.Throwable -> L73
                    java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L73
                    com.planner5d.library.model.manager.payments.j$d0$b$a r12 = new com.planner5d.library.model.manager.payments.j$d0$b$a     // Catch: java.lang.Throwable -> L73
                    com.planner5d.library.model.manager.payments.j r0 = r15.f192339b     // Catch: java.lang.Throwable -> L73
                    long r13 = r15.f192342e     // Catch: java.lang.Throwable -> L73
                    r12.<init>(r0, r13, r2)     // Catch: java.lang.Throwable -> L73
                    r15.f192338a = r3     // Catch: java.lang.Throwable -> L73
                    r13 = r15
                    java.lang.Object r15 = r5.g(r6, r7, r8, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L73
                    if (r15 != r1) goto L7a
                    goto L8d
                L73:
                    r0 = move-exception
                    r15 = r0
                    timber.log.b$b r0 = timber.log.b.f381052a
                    r0.e(r15)
                L7a:
                    kotlin.Unit r15 = kotlin.Unit.f312394a
                    return r15
                L7d:
                    com.planner5d.library.model.manager.payments.j r3 = r15.f192339b
                    long r5 = r15.f192342e
                    java.lang.Long r5 = kotlin.coroutines.jvm.internal.b.g(r5)
                    r15.f192338a = r4
                    java.lang.Object r15 = com.planner5d.library.model.manager.payments.j.U(r3, r2, r0, r5, r15)
                    if (r15 != r1) goto L8e
                L8d:
                    return r1
                L8e:
                    kotlin.Unit r15 = kotlin.Unit.f312394a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.d0.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(id.a aVar, fd.f fVar, long j10, Activity activity, kotlin.coroutines.d<? super d0> dVar) {
            super(2, dVar);
            this.f192330c = aVar;
            this.f192331d = fVar;
            this.f192332e = j10;
            this.f192333f = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new d0(this.f192330c, this.f192331d, this.f192332e, this.f192333f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192328a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = j.this;
                    id.a aVar = this.f192330c;
                    fd.f fVar = this.f192331d;
                    fd.i iVarK = fVar != null ? fVar.k() : null;
                    this.f192328a = 1;
                    obj = jVar.D0(aVar, iVarK, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                int i11 = 6 | 0;
                kotlinx.coroutines.k.f(j.this.f192296r, null, null, new a(j.this, (com.planner5d.library.model.payments.a) obj, this.f192332e, null), 3, null);
            } catch (Throwable unused) {
                kotlinx.coroutines.k.f(j.this.f192296r, com.planner5d.library.services.utility.s.f229729a.n(), null, new b(j.this, this.f192330c, this.f192331d, this.f192332e, this.f192333f, null), 2, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0}, l = {419, 419}, m = "consume", n = {"this", "order"}, s = {"L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192350c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192352e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192350c = obj;
            this.f192352e |= Integer.MIN_VALUE;
            return j.this.b0(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0, 1, 1, 2, 2}, l = {450, 453, 460, 462}, m = "refreshPayments", n = {"this", "user", "this", "user", "this", "user"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class e0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192355c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192357e;

        e0(kotlin.coroutines.d<? super e0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192355c = obj;
            this.f192357e |= Integer.MIN_VALUE;
            return j.this.A0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$consume$3", f = "PaymentManager.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.g.f44095o, androidx.constraintlayout.core.motion.utils.v.g.f44098r, androidx.constraintlayout.core.motion.utils.v.g.f44098r, androidx.core.view.f0.f48707j}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192358a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.planner5d.library.model.payments.a aVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f192360c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new f(this.f192360c, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007c  */
        /* JADX WARN: Code duplicated, block: B:30:0x0090 A[PHI: r9
          0x0090: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:28:0x008d, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x009a  */
        /* JADX WARN: Code duplicated, block: B:33:0x009c  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        
            if (r9.h(r1, r8) == r0) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 3
                int r1 = r8.f192358a
                r7 = 7
                r2 = 4
                r3 = 3
                int r7 = r7 >> r3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L30
                r7 = 4
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1d
                kotlin.ResultKt.m(r9)
                goto Lac
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 0
                r8.<init>(r9)
                r7 = 2
                throw r8
            L27:
                kotlin.ResultKt.m(r9)
                goto L90
            L2b:
                kotlin.ResultKt.m(r9)
                r7 = 3
                goto L72
            L30:
                r7 = 1
                kotlin.ResultKt.m(r9)
                goto L47
            L35:
                kotlin.ResultKt.m(r9)
                com.planner5d.library.model.manager.payments.j r9 = com.planner5d.library.model.manager.payments.j.this
                r7 = 7
                com.planner5d.library.model.payments.a r1 = r8.f192360c
                r8.f192358a = r5
                java.lang.Object r9 = r9.j(r1, r8)
                if (r9 != r0) goto L47
                r7 = 5
                goto Laa
            L47:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L55
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r5)
                r7 = 7
                return r8
            L55:
                com.planner5d.library.model.manager.payments.j r9 = com.planner5d.library.model.manager.payments.j.this
                com.planner5d.library.model.payments.a r1 = r8.f192360c
                fg.e r6 = com.planner5d.library.model.manager.payments.j.L(r9)
                r7 = 3
                java.lang.Object r6 = r6.get()
                r7 = 6
                com.planner5d.library.modules.user.user.w r6 = (com.planner5d.library.modules.user.user.w) r6
                id.a r6 = r6.a()
                r8.f192358a = r4
                java.lang.Object r9 = r9.a(r1, r6, r8)
                if (r9 != r0) goto L72
                goto Laa
            L72:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                r7 = 6
                boolean r9 = r9.booleanValue()
                r7 = 1
                if (r9 == 0) goto Lb2
                r7 = 3
                com.planner5d.library.model.manager.payments.j r9 = com.planner5d.library.model.manager.payments.j.this
                com.planner5d.library.model.payments.paymentmethod.e r9 = r9.l0()
                r7 = 4
                com.planner5d.library.model.payments.a r1 = r8.f192360c
                r8.f192358a = r3
                java.lang.Object r9 = r9.f(r1, r8)
                r7 = 2
                if (r9 != r0) goto L90
                goto Laa
            L90:
                r7 = 2
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                r7 = 6
                if (r9 != 0) goto L9c
                r7 = 1
                goto Lb2
            L9c:
                com.planner5d.library.model.manager.payments.j r9 = com.planner5d.library.model.manager.payments.j.this
                r7 = 4
                com.planner5d.library.model.payments.a r1 = r8.f192360c
                r8.f192358a = r2
                r7 = 6
                java.lang.Object r8 = r9.h(r1, r8)
                if (r8 != r0) goto Lac
            Laa:
                r7 = 2
                return r0
            Lac:
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r5)
                r7 = 5
                return r8
            Lb2:
                r8 = 0
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$refreshPaymentsInternal$2", f = "PaymentManager.kt", i = {0, 1, 1, 2}, l = {579, 582, 585}, m = "invokeSuspend", n = {"assigned", "order", "assigned", "assigned"}, s = {"I$0", "L$1", "I$0", "I$0"})
    static final class f0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192364d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ id.a f192366f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(id.a aVar, kotlin.coroutines.d<? super f0> dVar) {
            super(2, dVar);
            this.f192366f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new f0(this.f192366f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0074 A[PHI: r1 r6
          0x0074: PHI (r1v7 int) = (r1v3 int), (r1v4 int), (r1v6 int), (r1v8 int), (r1v9 int) binds: [B:24:0x0068, B:41:0x00bf, B:33:0x009e, B:39:0x00ba, B:40:0x00bc] A[DONT_GENERATE, DONT_INLINE]
          0x0074: PHI (r6v4 java.util.Iterator<com.planner5d.library.model.payments.a>) = 
          (r6v0 java.util.Iterator<com.planner5d.library.model.payments.a>)
          (r6v1 java.util.Iterator<com.planner5d.library.model.payments.a>)
          (r6v3 java.util.Iterator<com.planner5d.library.model.payments.a>)
          (r6v5 java.util.Iterator<com.planner5d.library.model.payments.a>)
          (r6v5 java.util.Iterator<com.planner5d.library.model.payments.a>)
         binds: [B:24:0x0068, B:41:0x00bf, B:33:0x009e, B:39:0x00ba, B:40:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x007b  */
        /* JADX WARN: Code duplicated, block: B:30:0x0095  */
        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a0 A[Catch: Exception -> 0x0021, TryCatch #1 {Exception -> 0x0021, blocks: (B:8:0x001c, B:37:0x00b7, B:28:0x0082, B:32:0x009a, B:34:0x00a0), top: B:48:0x001c }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009e -> B:25:0x0074). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b4 -> B:37:0x00b7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$consumeOrder$2", f = "PaymentManager.kt", i = {}, l = {426, androidx.constraintlayout.core.motion.utils.v.c.f44022w}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192369c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ id.a f192372f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.planner5d.library.model.payments.a aVar, id.a aVar2, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f192371e = aVar;
            this.f192372f = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new g(this.f192371e, this.f192372f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        
            if (r11 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$sendOrdered$2", f = "PaymentManager.kt", i = {}, l = {240, com.planner5d.library.engine.input.f.b.P1}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaymentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$sendOrdered$2\n+ 2 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager\n*L\n1#1,732:1\n282#2,4:733\n282#2,4:737\n282#2,4:741\n282#2,4:745\n*S KotlinDebug\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$sendOrdered$2\n*L\n238#1:733,4\n242#1:737,4\n248#1:741,4\n251#1:745,4\n*E\n"})
    static final class g0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192373a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f192376d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(com.planner5d.library.model.payments.a aVar, id.a aVar2, kotlin.coroutines.d<? super g0> dVar) {
            super(2, dVar);
            this.f192375c = aVar;
            this.f192376d = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new g0(this.f192375c, this.f192376d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        
            if (r7 == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.planner5d.library.services.exceptions.ErrorMessageException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f192373a
                r5 = 4
                r2 = 0
                r5 = 1
                r3 = 2
                r4 = 5
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L23
                if (r1 != r3) goto L19
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L17
                goto L5a
            L17:
                r7 = move-exception
                goto L75
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "/osfr/orov iowl ae/lnmtceete nbsr/i/ hcutu/  ke//io"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L23:
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L28
                r5 = 4
                goto L49
            L28:
                r7 = move-exception
                goto L83
            L2a:
                kotlin.ResultKt.m(r7)
                com.planner5d.library.model.manager.payments.j r7 = com.planner5d.library.model.manager.payments.j.this
                com.planner5d.library.model.payments.a r1 = r6.f192375c
                boolean r7 = r7.b(r1)
                r5 = 0
                if (r7 == 0) goto L3a
                r5 = 6
                return r1
            L3a:
                com.planner5d.library.model.manager.payments.j r7 = com.planner5d.library.model.manager.payments.j.this     // Catch: java.lang.Throwable -> L28
                r5 = 7
                id.a r1 = r6.f192376d     // Catch: java.lang.Throwable -> L28
                r6.f192373a = r4     // Catch: java.lang.Throwable -> L28
                java.lang.Object r7 = r7.f(r1, r2, r6)     // Catch: java.lang.Throwable -> L28
                r5 = 0
                if (r7 != r0) goto L49
                goto L59
            L49:
                com.planner5d.library.model.payments.a[] r7 = (com.planner5d.library.model.payments.a[]) r7     // Catch: java.lang.Throwable -> L28
                com.planner5d.library.model.manager.payments.j r1 = com.planner5d.library.model.manager.payments.j.this     // Catch: java.lang.Throwable -> L17
                id.a r4 = r6.f192376d     // Catch: java.lang.Throwable -> L17
                r5 = 5
                r6.f192373a = r3     // Catch: java.lang.Throwable -> L17
                r5 = 0
                java.lang.Object r7 = r1.d(r7, r4, r6)     // Catch: java.lang.Throwable -> L17
                if (r7 != r0) goto L5a
            L59:
                return r0
            L5a:
                r5 = 1
                com.planner5d.library.model.payments.a[] r7 = (com.planner5d.library.model.payments.a[]) r7     // Catch: java.lang.Throwable -> L17
                com.planner5d.library.model.manager.payments.j r7 = com.planner5d.library.model.manager.payments.j.this
                r5 = 1
                com.planner5d.library.model.payments.a r6 = r6.f192375c
                boolean r7 = r7.b(r6)
                if (r7 == 0) goto L6a
                r5 = 4
                return r6
            L6a:
                com.planner5d.library.services.exceptions.ErrorMessageException r6 = new com.planner5d.library.services.exceptions.ErrorMessageException
                int r7 = qd.b.q.f352806c9
                java.lang.String[] r0 = new java.lang.String[r2]
                r6.<init>(r7, r0)
                r5 = 1
                throw r6
            L75:
                com.planner5d.library.model.manager.payments.j r0 = com.planner5d.library.model.manager.payments.j.this
                com.planner5d.library.model.payments.a r6 = r6.f192375c
                r5 = 3
                boolean r0 = r0.b(r6)
                r5 = 2
                if (r0 == 0) goto L82
                return r6
            L82:
                throw r7
            L83:
                com.planner5d.library.model.manager.payments.j r0 = com.planner5d.library.model.manager.payments.j.this
                com.planner5d.library.model.payments.a r6 = r6.f192375c
                boolean r0 = r0.b(r6)
                if (r0 == 0) goto L8e
                return r6
            L8e:
                r5 = 3
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
            return ((g0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0, 0}, l = {169}, m = "filterProducts", n = {"this", "user", "result"}, s = {"L$0", "L$1", "L$2"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f192380d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192382f;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192380d = obj;
            this.f192382f |= Integer.MIN_VALUE;
            return j.this.c0(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$sendOrdered$4", f = "PaymentManager.kt", i = {0, 1}, l = {259, 268}, m = "invokeSuspend", n = {"userId", "userId"}, s = {"J$0", "J$0"})
    static final class h0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f192383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f192384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f192385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f192386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ fd.i f192387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(id.a aVar, j jVar, fd.i iVar, kotlin.coroutines.d<? super h0> dVar) {
            super(2, dVar);
            this.f192385c = aVar;
            this.f192386d = jVar;
            this.f192387e = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h0(this.f192385c, this.f192386d, this.f192387e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0078  */
        /* JADX WARN: Code duplicated, block: B:29:0x008a A[LOOP:0: B:25:0x0076->B:29:0x008a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:40:0x0089 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            long j10;
            long j11;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192384b;
            if (i10 == 0) {
                ResultKt.m(obj);
                long jA = com.planner5d.library.modules.user.user.x.a(this.f192385c);
                j jVar = this.f192386d;
                id.a aVar = this.f192385c;
                this.f192383a = jA;
                this.f192384b = 1;
                obj = jVar.f(aVar, false, this);
                if (obj != objL) {
                    j10 = jA;
                }
                return objL;
            }
            if (i10 == 1) {
                j10 = this.f192383a;
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = this.f192383a;
                ResultKt.m(obj);
            }
            for (com.planner5d.library.model.payments.a aVar2 : (com.planner5d.library.model.payments.a[]) obj) {
                if (Intrinsics.areEqual(aVar2.d(j11), this.f192387e)) {
                    return aVar2;
                }
            }
            throw new Exception("Order error");
            com.planner5d.library.model.payments.a[] aVarArr = (com.planner5d.library.model.payments.a[]) obj;
            int length = aVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    throw new a();
                }
                try {
                    if (Intrinsics.areEqual(aVarArr[i11].d(j10), this.f192387e)) {
                        j jVar2 = this.f192386d;
                        id.a aVar3 = this.f192385c;
                        this.f192383a = j10;
                        this.f192384b = 2;
                        obj = jVar2.d(aVarArr, aVar3, this);
                        if (obj != objL) {
                            j11 = j10;
                            break;
                        }
                        return objL;
                    }
                    i11++;
                } catch (com.planner5d.library.model.manager.payments.u.a e10) {
                    timber.log.b.f381052a.e(e10);
                }
            }
            while (i < r2) {
                if (Intrinsics.areEqual(aVar2.d(j11), this.f192387e)) {
                    return aVar2;
                }
            }
            throw new Exception("Order error");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
            return ((h0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0}, l = {129}, m = "filterProductsForAbTests", n = {"targetBackend", "result"}, s = {"L$0", "L$1"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192390c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192392e;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192390c = obj;
            this.f192392e |= Integer.MIN_VALUE;
            return j.this.d0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$sendOrdersToApi$2", f = "PaymentManager.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.e.B}, m = "invokeSuspend", n = {}, s = {})
    static final class i0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192393a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a[] f192395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f192396d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(com.planner5d.library.model.payments.a[] aVarArr, id.a aVar, kotlin.coroutines.d<? super i0> dVar) {
            super(2, dVar);
            this.f192395c = aVarArr;
            this.f192396d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new i0(this.f192395c, this.f192396d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192393a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            j jVar = j.this;
            Object obj2 = jVar.f192285g.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            com.planner5d.library.model.payments.paymentmethod.c cVar = new com.planner5d.library.model.payments.paymentmethod.c(jVar, jVar, (com.planner5d.library.model.payments.paymentmethod.i) obj2, j.this.f192294p);
            com.planner5d.library.model.payments.a[] aVarArr = this.f192395c;
            id.a aVar = this.f192396d;
            this.f192393a = 1;
            Object objG = cVar.g(aVarArr, aVar, this);
            return objG == objL ? objL : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) {
            return ((i0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.payments.j$j, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$getActiveCatalogProducts$2", f = "PaymentManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {}, s = {})
    static final class C1601j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super fd.g[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192397a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f192399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.a.EnumC1573a f192400d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1601j(id.a aVar, com.planner5d.library.model.manager.config.a.EnumC1573a enumC1573a, kotlin.coroutines.d<? super C1601j> dVar) {
            super(2, dVar);
            this.f192399c = aVar;
            this.f192400d = enumC1573a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new C1601j(this.f192399c, this.f192400d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192397a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            j jVar = j.this;
            fd.k kVar = fd.k.CATALOG;
            id.a aVar = this.f192399c;
            com.planner5d.library.model.manager.config.a.EnumC1573a enumC1573a = this.f192400d;
            this.f192397a = 1;
            Object objN0 = jVar.n0(kVar, aVar, enumC1573a, this);
            return objN0 == objL ? objL : objN0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super fd.g[]> dVar) {
            return ((C1601j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0}, l = {598}, m = "synchronizeOrders", n = {"this", "user"}, s = {"L$0", "L$1"})
    static final class j0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192403c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192405e;

        j0(kotlin.coroutines.d<? super j0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192403c = obj;
            this.f192405e |= Integer.MIN_VALUE;
            return j.this.o(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$getOrders$2", f = "PaymentManager.kt", i = {1, 2, 3, 4, 4}, l = {560, com.google.android.vending.licensing.k.f115073b, 562, 568, 568}, m = "invokeSuspend", n = {AttributeType.LIST, AttributeType.LIST, AttributeType.LIST, AttributeType.LIST, "destination$iv$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nPaymentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$getOrders$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,732:1\n1611#2,9:733\n1863#2:742\n1864#2:744\n1620#2:745\n1#3:743\n*S KotlinDebug\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$getOrders$2\n*L\n568#1:733,9\n568#1:742\n568#1:744\n568#1:745\n568#1:743\n*E\n"})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192411f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ id.a f192413h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n0 f192414i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f192415j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(id.a aVar, kotlinx.coroutines.n0 n0Var, boolean z10, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f192413h = aVar;
            this.f192414i = n0Var;
            this.f192415j = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new k(this.f192413h, this.f192414i, this.f192415j, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00af A[PHI: r1 r10
          0x00af: PHI (r1v4 fd.a) = (r1v3 fd.a), (r1v13 fd.a) binds: [B:26:0x00ac, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]
          0x00af: PHI (r10v9 java.lang.Object) = (r10v8 java.lang.Object), (r10v0 java.lang.Object) binds: [B:26:0x00ac, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b7 A[LOOP:0: B:29:0x00b5->B:30:0x00b7, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:47:0x011f  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
        
            if (r10 == r0) goto L42;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:28:0x00af, please report this as an issue */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0110 -> B:44:0x0114). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$synchronizeOrders$2", f = "PaymentManager.kt", i = {}, l = {601}, m = "invokeSuspend", n = {}, s = {})
    static final class k0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192416a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a[] f192418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f192419d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(com.planner5d.library.model.payments.a[] aVarArr, id.a aVar, kotlin.coroutines.d<? super k0> dVar) {
            super(2, dVar);
            this.f192418c = aVarArr;
            this.f192419d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new k0(this.f192418c, this.f192419d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192416a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = j.this;
                    com.planner5d.library.model.payments.a[] aVarArr = this.f192418c;
                    id.a aVar = this.f192419d;
                    this.f192416a = 1;
                    if (jVar.d(aVarArr, aVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Throwable unused) {
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$getPaymentIdByOrder$2", f = "PaymentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192420a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.planner5d.library.model.payments.a aVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f192422c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new l(this.f192422c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192420a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Payment paymentG = j.this.f192289k.g(this.f192422c);
            if (paymentG != null) {
                return paymentG.getId();
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0}, l = {androidx.constraintlayout.core.motion.utils.v.h.f44115p}, m = "updateSkuAndSynchronizeOrders", n = {"this", "user"}, s = {"L$0", "L$1"})
    static final class l0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192425c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192427e;

        l0(kotlin.coroutines.d<? super l0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192425c = obj;
            this.f192427e |= Integer.MIN_VALUE;
            return j.this.J0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {com.rabbitmq.client.impl.k.b.p.f265340a, 113, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 123}, m = "getProducts", n = {"this", "type", "user", "targetBackend", "this", "type", "user", "targetBackend", "this", "type", "user", "targetBackend", "products"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192433f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192435h;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192433f = obj;
            this.f192435h |= Integer.MIN_VALUE;
            return j.this.n0(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$updateSkuAndSynchronizeOrders$2", f = "PaymentManager.kt", i = {}, l = {715}, m = "invokeSuspend", n = {}, s = {})
    static final class m0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192436a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f192438c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$updateSkuAndSynchronizeOrders$2$1", f = "PaymentManager.kt", i = {}, l = {724}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f192439a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f192440b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ id.a f192441c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, id.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f192440b = jVar;
                this.f192441c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192440b, this.f192441c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192439a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        j jVar = this.f192440b;
                        id.a aVar = this.f192441c;
                        this.f192439a = 1;
                        if (jVar.o(aVar, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                } catch (Throwable unused) {
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(id.a aVar, kotlin.coroutines.d<? super m0> dVar) {
            super(2, dVar);
            this.f192438c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new m0(this.f192438c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192436a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.payments.r rVar = (com.planner5d.library.model.manager.payments.r) j.this.f192287i.get();
                    id.a aVar = this.f192438c;
                    this.f192436a = 1;
                    if (rVar.p(aVar, false, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
            }
            kotlinx.coroutines.k.f(j.this.f192296r, null, null, new a(j.this, this.f192438c, null), 3, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$getProductsFromServer$2", f = "PaymentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaymentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$getProductsFromServer$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,732:1\n37#2,2:733\n*S KotlinDebug\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$getProductsFromServer$2\n*L\n187#1:733,2\n*E\n"})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super fd.g[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ id.a f192443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(id.a aVar, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f192443b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new n(this.f192443b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192442a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            id.a aVar = this.f192443b;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            for (fd.i iVar : com.planner5d.library.model.manager.payments.u.h(com.planner5d.library.modules.user.user.x.a(aVar))) {
                listCreateListBuilder.add(new fd.g(new fd.f(iVar, 0L, null, null, null, null, 62, null), 0, true));
            }
            return CollectionsKt.build(listCreateListBuilder).toArray(new fd.g[0]);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super fd.g[]> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {}, l = {694}, m = "validateApiForUser", n = {}, s = {})
    static final class n0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f192444a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192446c;

        n0(kotlin.coroutines.d<? super n0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192444a = obj;
            this.f192446c |= Integer.MIN_VALUE;
            return j.this.K0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$getPurchasableProducts$2", f = "PaymentManager.kt", i = {0, 1, 1, 2, 2, 2}, l = {521, 526, 533}, m = "invokeSuspend", n = {"userId", "result", "userId", "result", "orders", "userId"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0"})
    @SourceDebugExtension({"SMAP\nPaymentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$getPurchasableProducts$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,732:1\n37#2,2:733\n295#3,2:735\n*S KotlinDebug\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$getPurchasableProducts$2\n*L\n523#1:733,2\n543#1:735,2\n*E\n"})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super fd.g[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f192447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f192451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f192452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f192453g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(id.a aVar, j jVar, boolean z10, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f192451e = aVar;
            this.f192452f = jVar;
            this.f192453g = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new o(this.f192451e, this.f192452f, this.f192453g, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d9 A[Catch: a -> 0x00d7, TryCatch #0 {a -> 0x00d7, blocks: (B:37:0x00c2, B:39:0x00c8, B:44:0x00d9, B:46:0x00df, B:47:0x00e9, B:49:0x00ef), top: B:69:0x00c2 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00df A[Catch: a -> 0x00d7, TryCatch #0 {a -> 0x00d7, blocks: (B:37:0x00c2, B:39:0x00c8, B:44:0x00d9, B:46:0x00df, B:47:0x00e9, B:49:0x00ef), top: B:69:0x00c2 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00ef A[Catch: a -> 0x00d7, TRY_LEAVE, TryCatch #0 {a -> 0x00d7, blocks: (B:37:0x00c2, B:39:0x00c8, B:44:0x00d9, B:46:0x00df, B:47:0x00e9, B:49:0x00ef), top: B:69:0x00c2 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x010b  */
        /* JADX WARN: Code duplicated, block: B:60:0x011c  */
        /* JADX WARN: Code duplicated, block: B:61:0x011e  */
        /* JADX WARN: Code duplicated, block: B:78:0x0113 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x0113 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x0108 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            long jA;
            Object objH;
            fd.f[] fVarArr;
            Object objF;
            com.planner5d.library.model.payments.a[] aVarArr;
            Object objI;
            com.planner5d.library.model.payments.a[] aVarArr2;
            fd.a aVar;
            int length;
            fd.g[] gVarArr;
            int i10;
            fd.f fVar;
            int length2;
            int i11;
            int i12;
            boolean z10;
            Iterator<T> it;
            Object next;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i13 = this.f192450d;
            int i14 = 0;
            try {
                if (i13 == 0) {
                    ResultKt.m(obj);
                    jA = com.planner5d.library.modules.user.user.x.a(this.f192451e);
                    com.planner5d.library.model.payments.paymentmethod.e eVarL0 = this.f192452f.l0();
                    id.a aVar2 = this.f192451e;
                    String[] strArr = (String[]) (this.f192453g ? com.planner5d.library.model.manager.payments.u.i(jA) : com.planner5d.library.model.manager.payments.u.j(jA)).toArray(new String[0]);
                    String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                    this.f192447a = jA;
                    this.f192450d = 1;
                    objH = eVarL0.h(aVar2, strArr2, this);
                    if (objH != objL) {
                    }
                    return objL;
                }
                if (i13 == 1) {
                    jA = this.f192447a;
                    ResultKt.m(obj);
                    objH = obj;
                } else {
                    if (i13 == 2) {
                        jA = this.f192447a;
                        fVarArr = (fd.f[]) this.f192448b;
                        ResultKt.m(obj);
                        objF = obj;
                        aVarArr = (com.planner5d.library.model.payments.a[]) objF;
                        j jVar = this.f192452f;
                        id.a aVar3 = this.f192451e;
                        this.f192448b = fVarArr;
                        this.f192449c = aVarArr;
                        this.f192447a = jA;
                        this.f192450d = 3;
                        objI = jVar.i(aVar3, this);
                        if (objI != objL) {
                            aVarArr2 = aVarArr;
                        }
                        return objL;
                    }
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j10 = this.f192447a;
                    aVarArr2 = (com.planner5d.library.model.payments.a[]) this.f192449c;
                    fd.f[] fVarArr2 = (fd.f[]) this.f192448b;
                    ResultKt.m(obj);
                    jA = j10;
                    fVarArr = fVarArr2;
                    objI = obj;
                }
                aVar = (fd.a) objI;
                length = fVarArr.length;
                gVarArr = new fd.g[length];
                i10 = 0;
                while (i10 < length) {
                    fVar = fVarArr[i10];
                    length2 = aVarArr2.length;
                    i11 = i14;
                    i12 = i11;
                    while (i11 < length2) {
                        com.planner5d.library.model.payments.a aVar4 = aVarArr2[i11];
                        try {
                            if (fVar.k() == null && Intrinsics.areEqual(fVar.k(), aVar4.d(jA))) {
                                i12++;
                            } else if (fVar.o()) {
                                it = aVar.e().iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!Intrinsics.areEqual(((com.planner5d.library.model.payments.a) next).d(jA), fVar.k()));
                                if (next != null) {
                                    i12++;
                                }
                            }
                        } catch (com.planner5d.library.model.manager.payments.u.a e10) {
                            timber.log.b.f381052a.e(e10);
                        }
                        i11++;
                    }
                    if (i12 <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gVarArr[i10] = new fd.g(fVar, i12, z10);
                    i10++;
                    i14 = 0;
                }
                return gVarArr;
                fVarArr = (fd.f[]) objH;
                j jVar2 = this.f192452f;
                id.a aVar5 = this.f192451e;
                this.f192448b = fVarArr;
                this.f192447a = jA;
                this.f192450d = 2;
                objF = jVar2.f(aVar5, true, this);
                if (objF != objL) {
                    aVarArr = (com.planner5d.library.model.payments.a[]) objF;
                    j jVar3 = this.f192452f;
                    id.a aVar6 = this.f192451e;
                    this.f192448b = fVarArr;
                    this.f192449c = aVarArr;
                    this.f192447a = jA;
                    this.f192450d = 3;
                    objI = jVar3.i(aVar6, this);
                    if (objI != objL) {
                        aVarArr2 = aVarArr;
                        aVar = (fd.a) objI;
                        length = fVarArr.length;
                        gVarArr = new fd.g[length];
                        i10 = 0;
                        while (i10 < length) {
                            fVar = fVarArr[i10];
                            length2 = aVarArr2.length;
                            i11 = i14;
                            i12 = i11;
                            while (i11 < length2) {
                                com.planner5d.library.model.payments.a aVar7 = aVarArr2[i11];
                                if (fVar.k() == null) {
                                    if (fVar.o()) {
                                        it = aVar.e().iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!Intrinsics.areEqual(((com.planner5d.library.model.payments.a) next).d(jA), fVar.k()));
                                        if (next != null) {
                                            i12++;
                                        }
                                    }
                                } else if (fVar.o()) {
                                    it = aVar.e().iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!Intrinsics.areEqual(((com.planner5d.library.model.payments.a) next).d(jA), fVar.k()));
                                    if (next != null) {
                                        i12++;
                                    }
                                }
                                i11++;
                            }
                            if (i12 <= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            gVarArr[i10] = new fd.g(fVar, i12, z10);
                            i10++;
                            i14 = 0;
                        }
                        return gVarArr;
                    }
                }
                return objL;
            } catch (Throwable th2) {
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                return new fd.g[0];
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super fd.g[]> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0, 1, 1, 1, 2}, l = {222, 230, 231}, m = "waitForPaymentToFinish", n = {"this", "user", "this", "user", "order", "order"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
    static final class o0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f192457d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192459f;

        o0(kotlin.coroutines.d<? super o0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192457d = obj;
            this.f192459f |= Integer.MIN_VALUE;
            return j.this.L0(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$getUnconsumedDesignGeneratorOrder$2", f = "PaymentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaymentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$getUnconsumedDesignGeneratorOrder$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,732:1\n1310#2,2:733\n*S KotlinDebug\n*F\n+ 1 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager$getUnconsumedDesignGeneratorOrder$2\n*L\n405#1:733,2\n*E\n"})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192460a;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new p(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192460a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            id.a aVarA = ((com.planner5d.library.modules.user.user.w) j.this.f192292n.get()).a();
            if (aVarA != null) {
                long j10 = aVarA.f287075a;
                for (com.planner5d.library.model.payments.a aVar : j.this.f192289k.m()) {
                    if (aVar.d(j10).i() == fd.k.DESIGN_GENERATOR) {
                        return aVar;
                    }
                }
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$waitForPaymentToFinish$order$1", f = "PaymentManager.kt", i = {1}, l = {223, 225}, m = "invokeSuspend", n = {"originalOrder"}, s = {"L$0"})
    static final class p0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f192463b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f192465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f192466e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(long j10, id.a aVar, kotlin.coroutines.d<? super p0> dVar) {
            super(2, dVar);
            this.f192465d = j10;
            this.f192466e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new p0(this.f192465d, this.f192466e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            com.planner5d.library.model.payments.a aVar;
            com.planner5d.library.model.payments.a aVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192463b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = j.this;
                    long j10 = this.f192465d;
                    id.a aVar3 = this.f192466e;
                    this.f192463b = 1;
                    obj = jVar.m(j10, aVar3, this);
                    if (obj != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (com.planner5d.library.model.payments.a) this.f192462a;
                    try {
                        ResultKt.m(obj);
                        return (com.planner5d.library.model.payments.a) obj;
                    } catch (a unused) {
                        return aVar2;
                    }
                }
                ResultKt.m(obj);
                j jVar2 = j.this;
                id.a aVar4 = this.f192466e;
                this.f192462a = aVar;
                this.f192463b = 2;
                Object objC0 = jVar2.C0(aVar4, aVar, this);
                if (objC0 != objL) {
                    obj = objC0;
                    aVar2 = aVar;
                    return (com.planner5d.library.model.payments.a) obj;
                }
                return objL;
            } catch (a unused2) {
                return aVar;
            }
            aVar = (com.planner5d.library.model.payments.a) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
            return ((p0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0, 1, 1, 1}, l = {308, 308}, m = "getUserAndAnonymousSubscriptionsAsString", n = {"this", "user", "this", "user", "destination$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192471e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192473g;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192471e = obj;
            this.f192473g |= Integer.MIN_VALUE;
            return j.this.r0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0}, l = {497}, m = "waitForUserAndSkus", n = {"this"}, s = {"L$0"})
    static final class q0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192475b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192477d;

        q0(kotlin.coroutines.d<? super q0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192475b = obj;
            this.f192477d |= Integer.MIN_VALUE;
            return j.this.M0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160697i1}, m = "initialize", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f192478a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192480c;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192478a = obj;
            this.f192480c |= Integer.MIN_VALUE;
            return j.this.s0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {}, l = {481}, m = "isReadyToConsume", n = {}, s = {})
    static final class s extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f192481a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192483c;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192481a = obj;
            this.f192483c |= Integer.MIN_VALUE;
            return j.this.p(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$observeOrdersUpdates$1", f = "PaymentManager.kt", i = {}, l = {630}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192484a;

        /* synthetic */ class a implements kotlinx.coroutines.flow.j, kotlin.jvm.internal.c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f192486a;

            a(j jVar) {
                this.f192486a = jVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.planner5d.library.model.payments.paymentmethod.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
                Object objM = t.m(this.f192486a, dVar, dVar2);
                return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
            }

            @Override // kotlin.jvm.internal.c0
            public final kotlin.x<?> b() {
                return new kotlin.jvm.internal.a(2, this.f192486a, j.class, "processOrdersUpdate", "processOrdersUpdate(Lcom/planner5d/library/model/payments/paymentmethod/OrdersUpdate;)V", 4);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.j) && (obj instanceof kotlin.jvm.internal.c0)) {
                    return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        t(kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(j jVar, com.planner5d.library.model.payments.paymentmethod.d dVar, kotlin.coroutines.d dVar2) {
            jVar.x0(dVar);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new t(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192484a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarZ = kotlinx.coroutines.flow.k.Z(j.this.l0().d());
                a aVar = new a(j.this);
                this.f192484a = 1;
                if (iVarZ.collect(aVar, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((t) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$orderToDTDAnalyticsString$2", f = "PaymentManager.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
    static final class u extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ id.a f192488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f192490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192491e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(id.a aVar, com.planner5d.library.model.payments.a aVar2, j jVar, com.planner5d.library.model.payments.paymentmethod.e eVar, kotlin.coroutines.d<? super u> dVar) {
            super(2, dVar);
            this.f192488b = aVar;
            this.f192489c = aVar2;
            this.f192490d = jVar;
            this.f192491e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new u(this.f192488b, this.f192489c, this.f192490d, this.f192491e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0089 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            u uVar;
            com.planner5d.library.model.payments.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192487a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long jA = com.planner5d.library.modules.user.user.x.a(this.f192488b);
                fd.i iVarD = this.f192489c.d(jA);
                j jVar = this.f192490d;
                com.planner5d.library.model.payments.a aVar2 = this.f192489c;
                if (!iVarD.r()) {
                    return null;
                }
                if (iVarD.l()) {
                    return jVar.w0(aVar2);
                }
                Payment paymentG = this.f192490d.f192289k.g(this.f192489c);
                if (paymentG == null || paymentG.C() != jA) {
                    j jVar2 = this.f192490d;
                    com.planner5d.library.model.payments.paymentmethod.e eVar = this.f192491e;
                    id.a aVar3 = this.f192488b;
                    com.planner5d.library.model.payments.a aVar4 = this.f192489c;
                    this.f192487a = 1;
                    uVar = this;
                    obj = jVar2.f0(paymentG, eVar, aVar3, aVar4, uVar);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    aVar = this.f192489c;
                    uVar = this;
                }
                if (aVar != null) {
                    return uVar.f192490d.w0(uVar.f192489c);
                }
                return null;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            uVar = this;
            aVar = (com.planner5d.library.model.payments.a) obj;
            if (aVar != null) {
                return uVar.f192490d.w0(uVar.f192489c);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((u) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$paymentWaitForResult$$inlined$withReentrantLock$default$1", f = "PaymentManager.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {265, com.badlogic.gdx.utils.compression.lzma.a.A, 274}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "order"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentManager.kt\ncom/planner5d/library/model/manager/payments/PaymentManager\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:290\n375#3,22:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:290,2\n*E\n"})
    public static final class v extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f192496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f192497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Payment f192498g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j f192499h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ id.a f192500i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f192501j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, Payment payment, j jVar, id.a aVar2, long j10) {
            super(2, dVar);
            this.f192496e = aVar;
            this.f192497f = obj;
            this.f192498g = payment;
            this.f192499h = jVar;
            this.f192500i = aVar2;
            this.f192501j = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new v(this.f192496e, this.f192497f, dVar, this.f192498g, this.f192499h, this.f192500i, this.f192501j);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:43:0x00da A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #4 {all -> 0x00db, blocks: (B:41:0x00ce, B:43:0x00da), top: B:67:0x00ce }] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object objH;
            Throwable th3;
            com.planner5d.library.model.payments.a aVar3;
            Object objN;
            com.planner5d.library.model.payments.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192495d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192496e;
                    obj2 = this.f192497f;
                    this.f192492a = aVar;
                    this.f192493b = obj2;
                    this.f192495d = 1;
                    if (aVar.h(obj2, this) != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        obj2 = this.f192493b;
                        kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f192492a;
                        try {
                            ResultKt.m(obj);
                            objH = obj;
                            aVar = aVar5;
                            aVar3 = (com.planner5d.library.model.payments.a) objH;
                            j jVar = this.f192499h;
                            id.a aVar6 = this.f192500i;
                            this.f192492a = aVar;
                            this.f192493b = obj2;
                            this.f192494c = aVar3;
                            this.f192495d = 3;
                            objN = jVar.n(aVar3, aVar6, this);
                            if (objN != objL) {
                                kotlinx.coroutines.sync.a aVar7 = aVar;
                                obj = objN;
                                aVar2 = aVar7;
                                aVar4 = aVar3;
                            }
                            return objL;
                        } catch (Throwable th4) {
                            th3 = th4;
                            aVar2 = aVar5;
                            timber.log.b.f381052a.e(th3);
                            if (th3 instanceof CancellationException) {
                                throw th3;
                            }
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar4 = (com.planner5d.library.model.payments.a) this.f192494c;
                        obj2 = this.f192493b;
                        aVar2 = (kotlinx.coroutines.sync.a) this.f192492a;
                        try {
                            ResultKt.m(obj);
                        } catch (Throwable th5) {
                            th3 = th5;
                            timber.log.b.f381052a.e(th3);
                            if (th3 instanceof CancellationException) {
                                throw th3;
                            }
                        }
                    }
                    try {
                        timber.log.b.f381052a.e(th3);
                        if (th3 instanceof CancellationException) {
                            throw th3;
                        }
                        throw new ErrorMessageException(o2.q.I9, new String[0]);
                    } catch (Throwable th6) {
                        th2 = th6;
                        aVar2.i(obj2);
                        throw th2;
                    }
                }
                obj2 = this.f192493b;
                kotlinx.coroutines.sync.a aVar8 = (kotlinx.coroutines.sync.a) this.f192492a;
                ResultKt.m(obj);
                aVar = aVar8;
                if (obj != null) {
                    aVar2.i(obj2);
                    return aVar4;
                }
                throw new ErrorMessageException(o2.q.I9, new String[0]);
                if (!this.f192498g.E()) {
                    if (this.f192498g.w() != null) {
                        throw new Exception(this.f192498g.w());
                    }
                    this.f192499h.f192295q.b("payment_misses_both_order_and_error", "Payment ID = " + this.f192501j, null);
                    throw new Exception();
                }
                if (this.f192498g.B() == Payment.b.StartedAndPending.n()) {
                    throw new ErrorMessageException(o2.q.Pk, new String[0]);
                }
                try {
                    z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                    x xVar = new x(this.f192498g, null);
                    this.f192492a = aVar;
                    this.f192493b = obj2;
                    this.f192495d = 2;
                    objH = kotlinx.coroutines.i.h(z1VarH, xVar, this);
                    if (objH != objL) {
                        aVar3 = (com.planner5d.library.model.payments.a) objH;
                        j jVar2 = this.f192499h;
                        id.a aVar9 = this.f192500i;
                        this.f192492a = aVar;
                        this.f192493b = obj2;
                        this.f192494c = aVar3;
                        this.f192495d = 3;
                        objN = jVar2.n(aVar3, aVar9, this);
                        if (objN != objL) {
                            kotlinx.coroutines.sync.a aVar10 = aVar;
                            obj = objN;
                            aVar2 = aVar10;
                            aVar4 = aVar3;
                            if (obj != null) {
                                aVar2.i(obj2);
                                return aVar4;
                            }
                            throw new ErrorMessageException(o2.q.I9, new String[0]);
                        }
                    }
                    return objL;
                } catch (Throwable th7) {
                    kotlinx.coroutines.sync.a aVar11 = aVar;
                    th3 = th7;
                    aVar2 = aVar11;
                    timber.log.b.f381052a.e(th3);
                    if (th3 instanceof CancellationException) {
                        throw th3;
                    }
                }
            } catch (Throwable th8) {
                kotlinx.coroutines.sync.a aVar12 = aVar;
                th2 = th8;
                aVar2 = aVar12;
                aVar2.i(obj2);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
            return ((v) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager", f = "PaymentManager.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 6}, l = {373, 734, 380, 381, 737, 737, 398}, m = "paymentWaitForResult", n = {"this", "user", "paymentId", "this", "user", "resultPayment", "$receiver$iv", "paymentId", "this", "user", "this", "user", "order", "this", "user", "resultPayment", "$receiver$iv", "paymentId", "this", "user", "resultOrder"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$0"})
    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f192506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192507f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192509h;

        w(kotlin.coroutines.d<? super w> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192507f = obj;
            this.f192509h |= Integer.MIN_VALUE;
            return j.this.m(0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$paymentWaitForResult$resultOrder$1$order$1", f = "PaymentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class x extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Payment f192511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(Payment payment, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.f192511b = payment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new x(this.f192511b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192510a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f192511b.s();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
            return ((x) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$paymentWaitForResult$resultPayment$1", f = "PaymentManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class y extends kotlin.coroutines.jvm.internal.o implements Function2<Payment, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192513b;

        y(kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            y yVar = new y(dVar);
            yVar.f192513b = obj;
            return yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192512a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Payment payment = (Payment) this.f192513b;
            return kotlin.coroutines.jvm.internal.b.a(payment.E() || payment.w() != null);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Payment payment, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((y) create(payment, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$processOrdersUpdate$1", f = "PaymentManager.kt", i = {}, l = {638}, m = "invokeSuspend", n = {}, s = {})
    static final class z extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192514a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.d f192516c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentManager$processOrdersUpdate$1$1", f = "PaymentManager.kt", i = {}, l = {640, 641, 642}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f192517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.d f192518b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f192519c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ id.a f192520d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.planner5d.library.model.payments.paymentmethod.d dVar, j jVar, id.a aVar, kotlin.coroutines.d<? super a> dVar2) {
                super(3, dVar2);
                this.f192518b = dVar;
                this.f192519c = jVar;
                this.f192520d = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x005f  */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
            
                if (r12.y0(r1, r2, r11) == r0) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
            
                if (r3.O(r4, r5, null, r7, false, r11) == r0) goto L26;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    r10 = 4
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r11.f192517a
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L29
                    r10 = 6
                    if (r1 == r4) goto L25
                    r10 = 7
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L15
                    goto L25
                L15:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "r sael//e v me cewl sou/b/frntn/te/utierkohc oio/oi"
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    r10 = 1
                    throw r11
                L20:
                    r10 = 2
                    kotlin.ResultKt.m(r12)
                    goto L57
                L25:
                    kotlin.ResultKt.m(r12)
                    goto L83
                L29:
                    kotlin.ResultKt.m(r12)
                    r10 = 3
                    com.planner5d.library.model.payments.paymentmethod.d r12 = r11.f192518b
                    r10 = 5
                    java.lang.Exception r12 = r12.a()
                    r10 = 5
                    if (r12 != 0) goto L4b
                    com.planner5d.library.model.manager.payments.j r12 = r11.f192519c
                    r10 = 0
                    id.a r1 = r11.f192520d
                    com.planner5d.library.model.payments.paymentmethod.d r2 = r11.f192518b
                    java.util.List r2 = r2.b()
                    r11.f192517a = r4
                    java.lang.Object r11 = com.planner5d.library.model.manager.payments.j.Q(r12, r1, r2, r11)
                    if (r11 != r0) goto L83
                    goto L81
                L4b:
                    com.planner5d.library.model.manager.payments.j r12 = r11.f192519c
                    r10 = 6
                    r11.f192517a = r3
                    java.lang.Object r12 = r12.c(r11)
                    if (r12 != r0) goto L57
                    goto L81
                L57:
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    if (r12 == 0) goto L83
                    com.planner5d.library.model.manager.payments.j r12 = r11.f192519c
                    com.planner5d.library.model.manager.payments.p r3 = com.planner5d.library.model.manager.payments.j.H(r12)
                    id.a r4 = r11.f192520d
                    com.planner5d.library.model.manager.payments.j r12 = r11.f192519c
                    com.planner5d.library.model.payments.paymentmethod.e r5 = r12.l0()
                    r10 = 7
                    com.planner5d.library.model.payments.paymentmethod.d r12 = r11.f192518b
                    java.lang.Exception r7 = r12.a()
                    r11.f192517a = r2
                    r6 = 0
                    r8 = 0
                    r8 = 0
                    r9 = r11
                    r10 = 3
                    java.lang.Object r11 = r3.O(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L83
                L81:
                    r10 = 0
                    return r0
                L83:
                    r10 = 3
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
                return new a(this.f192518b, this.f192519c, this.f192520d, dVar).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(com.planner5d.library.model.payments.paymentmethod.d dVar, kotlin.coroutines.d<? super z> dVar2) {
            super(2, dVar2);
            this.f192516c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new z(this.f192516c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192514a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    id.a aVarA = ((com.planner5d.library.modules.user.user.w) j.this.f192292n.get()).a();
                    com.planner5d.library.api.requests.c cVar = j.this.f192293o;
                    a aVar = new a(this.f192516c, j.this, aVarA, null);
                    this.f192514a = 1;
                    int i11 = 7 | 0;
                    if (com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, this, 2, null) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((z) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public j(@NotNull Application application, @NotNull fg.e<com.planner5d.library.model.manager.h> configManager, @NotNull com.planner5d.library.services.utility.p0 formatter, @NotNull fg.e<com.planner5d.library.model.payments.paymentmethod.e> lazyPaymentMethod, @NotNull fg.e<com.planner5d.library.model.payments.paymentmethod.i> paymentSetter, @NotNull fg.e<com.planner5d.library.model.manager.payments.p> lazyPaymentsRepository, @NotNull fg.e<com.planner5d.library.model.manager.payments.r> paymentsServerDataSource, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.model.manager.payments.e paymentDao, @NotNull q2 paymentMethodIdProvider, @NotNull com.planner5d.library.model.manager.payments.v purchasedStatusCache, @NotNull fg.e<com.planner5d.library.modules.user.user.w> userAuthorization, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull u0 userPurchases, @NotNull u1 logRecordManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(lazyPaymentMethod, "lazyPaymentMethod");
        Intrinsics.checkNotNullParameter(paymentSetter, "paymentSetter");
        Intrinsics.checkNotNullParameter(lazyPaymentsRepository, "lazyPaymentsRepository");
        Intrinsics.checkNotNullParameter(paymentsServerDataSource, "paymentsServerDataSource");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(paymentDao, "paymentDao");
        Intrinsics.checkNotNullParameter(paymentMethodIdProvider, "paymentMethodIdProvider");
        Intrinsics.checkNotNullParameter(purchasedStatusCache, "purchasedStatusCache");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f192281c = application;
        this.f192282d = configManager;
        this.f192283e = formatter;
        this.f192284f = lazyPaymentMethod;
        this.f192285g = paymentSetter;
        this.f192286h = lazyPaymentsRepository;
        this.f192287i = paymentsServerDataSource;
        this.f192288j = networkStateUtility;
        this.f192289k = paymentDao;
        this.f192290l = paymentMethodIdProvider;
        this.f192291m = purchasedStatusCache;
        this.f192292n = userAuthorization;
        this.f192293o = userApiRequester;
        this.f192294p = userPurchases;
        this.f192295q = logRecordManager;
        this.f192296r = coroutineScope;
        u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B0(id.a aVar, kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new f0(aVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C0(id.a aVar, com.planner5d.library.model.payments.a aVar2, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new g0(aVar2, aVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D0(id.a aVar, fd.i iVar, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new h0(aVar, this, iVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E0(com.planner5d.library.model.payments.a aVar, Throwable th2, Long l10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN = m0().N(aVar, th2, l10, dVar);
        return objN == kotlin.coroutines.intrinsics.b.l() ? objN : Unit.f312394a;
    }

    private final void F0(id.a aVar, List<fd.g> list) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        CollectionsKt.addAll(listCreateListBuilder, com.planner5d.library.model.manager.payments.u.g(com.planner5d.library.modules.user.user.x.a(aVar)));
        final List listBuild = CollectionsKt.build(listCreateListBuilder);
        final Function2 function2 = new Function2() { // from class: com.planner5d.library.model.manager.payments.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(j.G0(listBuild, (fd.g) obj, (fd.g) obj2));
            }
        };
        CollectionsKt.sortWith(list, new Comparator() { // from class: com.planner5d.library.model.manager.payments.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j.H0(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int G0(List list, fd.g gVar, fd.g gVar2) {
        return CollectionsKt.indexOf((List<? extends fd.i>) list, gVar.f275144a.k()) - CollectionsKt.indexOf((List<? extends fd.i>) list, gVar2.f275144a.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H0(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I0(kotlinx.coroutines.n0 n0Var, com.planner5d.library.model.payments.a[] aVarArr, kotlin.coroutines.d<? super Unit> dVar) {
        Object objT = m0().T(n0Var, l0(), aVarArr, dVar);
        return objT == kotlin.coroutines.intrinsics.b.l() ? objT : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object J0(id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        l0 l0Var;
        if (dVar instanceof l0) {
            l0Var = (l0) dVar;
            int i10 = l0Var.f192427e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                l0Var.f192427e = i10 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(dVar);
            }
        } else {
            l0Var = new l0(dVar);
        }
        Object obj = l0Var.f192425c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = l0Var.f192427e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.r rVar = this.f192287i.get();
                l0Var.f192423a = this;
                l0Var.f192424b = aVar;
                l0Var.f192427e = 1;
                if (rVar.p(aVar, true, l0Var) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (id.a) l0Var.f192424b;
                this = (j) l0Var.f192423a;
                ResultKt.m(obj);
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
            if (th2 instanceof CancellationException) {
                throw th2;
            }
        }
        kotlinx.coroutines.k.f(this.f192296r, com.planner5d.library.services.utility.s.f229729a.n(), null, this.new m0(aVar, null), 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object K0(id.a aVar, com.planner5d.library.model.payments.a aVar2, kotlin.coroutines.d<? super Boolean> dVar) {
        n0 n0Var;
        if (dVar instanceof n0) {
            n0Var = (n0) dVar;
            int i10 = n0Var.f192446c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                n0Var.f192446c = i10 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(dVar);
            }
        } else {
            n0Var = new n0(dVar);
        }
        Object objN = n0Var.f192444a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = n0Var.f192446c;
        try {
            if (i11 == 0) {
                ResultKt.m(objN);
                if (aVar != null) {
                    n0Var.f192446c = 1;
                    objN = n(aVar2, aVar, n0Var);
                    if (objN == objL) {
                        return objL;
                    }
                }
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objN);
            if (objN != null) {
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r15 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (r15 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        if (r15 == r1) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(id.a r13, com.planner5d.library.model.payments.a r14, kotlin.coroutines.d<? super com.planner5d.library.model.payments.paymentmethod.b> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.Y(id.a, com.planner5d.library.model.payments.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Z(com.planner5d.library.model.payments.a aVar, fd.i iVar, kotlin.coroutines.d<? super Boolean> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f192327e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f192327e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objQ = dVar2.f192325c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f192327e;
        if (i11 == 0) {
            ResultKt.m(objQ);
            dVar2.f192323a = this;
            dVar2.f192324b = aVar;
            dVar2.f192327e = 1;
            objQ = q(iVar, dVar2);
            if (objQ != objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objQ);
            return objQ;
        }
        aVar = (com.planner5d.library.model.payments.a) dVar2.f192324b;
        this = (j) dVar2.f192323a;
        ResultKt.m(objQ);
        if (!((Boolean) objQ).booleanValue()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        dVar2.f192323a = null;
        dVar2.f192324b = null;
        dVar2.f192327e = 2;
        Object objK = this.k(aVar, dVar2);
        if (objK != objL) {
            return objK;
        }
        return objL;
    }

    @m1
    private final void a0(com.planner5d.library.model.payments.a aVar, Function1<? super com.planner5d.library.model.payments.a, Unit> function1) {
        if (b(aVar)) {
            function1.invoke(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final Object c0(fd.g[] gVarArr, fd.k kVar, id.a aVar, com.planner5d.library.model.manager.config.a.EnumC1573a enumC1573a, kotlin.coroutines.d<? super fd.g[]> dVar) {
        h hVar;
        List<fd.g> arrayList;
        id.a aVar2;
        boolean z10;
        int i10;
        boolean z11;
        j jVar = this;
        fd.g[] gVarArr2 = gVarArr;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i11 = hVar.f192382f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f192382f = i11 - Integer.MIN_VALUE;
            } else {
                hVar = jVar.new h(dVar);
            }
        } else {
            hVar = jVar.new h(dVar);
        }
        Object obj = hVar.f192380d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = hVar.f192382f;
        if (i12 == 0) {
            ResultKt.m(obj);
            arrayList = new ArrayList<>();
            boolean zD = jVar.f192294p.d(jVar.f192292n.get().a());
            boolean z12 = (jVar.f192294p.u(aVar) || zD) ? false : true;
            int length = gVarArr2.length;
            int i13 = 0;
            while (i13 < length) {
                fd.g gVar = gVarArr2[i13];
                fd.i iVarK = gVar.f275144a.k();
                if (iVarK != null && iVarK.i() == kVar && iVarK.j()) {
                    fd.k kVarI = iVarK.i();
                    fd.k kVar2 = fd.k.CATALOG;
                    if (kVarI != kVar2 || ((aVar != null || iVarK.l()) && ((aVar == null || !iVarK.l()) && (!(aVar == null && iVarK.p()) && (aVar == null || !iVarK.q()))))) {
                        fd.f fVar = gVar.f275144a;
                        int i14 = gVar.f275145b;
                        fd.i iVarK2 = fVar.k();
                        if (iVarK2 != null) {
                            boolean zM = iVarK2.m();
                            z10 = zD;
                            if (zM && z10) {
                                i10 = 1;
                            }
                            int i15 = i14 + i10;
                            if (iVarK.i() == kVar2) {
                                z11 = gVar.f275146c;
                            } else if (gVar.f275146c || !z12) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            arrayList.add(new fd.g(fVar, i15, z11));
                        } else {
                            z10 = zD;
                        }
                        i10 = 0;
                        int i16 = i14 + i10;
                        if (iVarK.i() == kVar2) {
                            z11 = gVar.f275146c;
                        } else if (gVar.f275146c) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new fd.g(fVar, i16, z11));
                    } else {
                        z10 = zD;
                    }
                } else {
                    z10 = zD;
                }
                i13++;
                gVarArr2 = gVarArr;
                zD = z10;
            }
            hVar.f192377a = jVar;
            hVar.f192378b = aVar;
            hVar.f192379c = arrayList;
            hVar.f192382f = 1;
            if (jVar.d0(enumC1573a, arrayList, hVar) == objL) {
                return objL;
            }
            aVar2 = aVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<fd.g> list = (List) hVar.f192379c;
            aVar2 = (id.a) hVar.f192378b;
            j jVar2 = (j) hVar.f192377a;
            ResultKt.m(obj);
            arrayList = list;
            jVar = jVar2;
        }
        jVar.F0(aVar2, arrayList);
        return arrayList.toArray(new fd.g[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object d0(com.planner5d.library.model.manager.config.a.EnumC1573a enumC1573a, List<fd.g> list, kotlin.coroutines.d<? super Unit> dVar) {
        i iVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f192392e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f192392e = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objD = iVar.f192390c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f192392e;
        if (i11 == 0) {
            ResultKt.m(objD);
            com.planner5d.library.model.manager.h hVar = this.f192282d.get();
            iVar.f192388a = enumC1573a;
            iVar.f192389b = list;
            iVar.f192392e = 1;
            objD = hVar.d(iVar);
            if (objD == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) iVar.f192389b;
            enumC1573a = (com.planner5d.library.model.manager.config.a.EnumC1573a) iVar.f192388a;
            ResultKt.m(objD);
        }
        List list2 = (List) objD;
        Iterator<fd.g> it = list.iterator();
        while (it.hasNext()) {
            fd.i iVarK = it.next().f275144a.k();
            if (iVarK != null) {
                if (list2 != null) {
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((com.planner5d.library.model.manager.config.a) it2.next()).b(iVarK.c(), enumC1573a)) {
                                    if (list2 == null || !iVarK.o()) {
                                    }
                                }
                            }
                        }
                    }
                    it.remove();
                } else if (list2 == null) {
                }
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f0(final Payment payment, com.planner5d.library.model.payments.paymentmethod.e eVar, id.a aVar, com.planner5d.library.model.payments.a aVar2, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) throws Exception {
        return m0().t(new Function0() { // from class: com.planner5d.library.model.manager.payments.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.h0(payment);
            }
        }, eVar, aVar, aVar2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g0(id.a aVar, com.planner5d.library.model.payments.a aVar2, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) throws Exception {
        return m0().s(l0(), aVar, aVar2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Payment h0(Payment payment) {
        return payment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.model.manager.payments.p m0() {
        com.planner5d.library.model.manager.payments.p pVar = this.f192286h.get();
        Intrinsics.checkNotNullExpressionValue(pVar, "get(...)");
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o0(id.a aVar, kotlin.coroutines.d<? super fd.g[]> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new n(aVar, null), dVar);
    }

    private final boolean t0() {
        if (this.f192288j.d(this.f192281c)) {
            id.a aVarA = this.f192292n.get().a();
            if (aVarA != null ? com.planner5d.library.model.manager.payments.u.j(aVarA.f287075a).isEmpty() : true) {
                return true;
            }
        }
        return false;
    }

    private final void u0() {
        kotlinx.coroutines.k.f(this.f192296r, null, null, new t(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v0(com.planner5d.library.model.payments.paymentmethod.e eVar, id.a aVar, com.planner5d.library.model.payments.a aVar2, kotlin.coroutines.d<? super String> dVar) throws Exception {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new u(aVar, aVar2, this, eVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String w0(com.planner5d.library.model.payments.a aVar) throws JSONException {
        String string = new JSONObject().put(com.planner5d.library.services.r.orderId.f224891a, aVar.a()).put(com.planner5d.library.services.r.productId.f224891a, aVar.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(com.planner5d.library.model.payments.paymentmethod.d dVar) {
        int i10 = (2 ^ 3) & 0;
        kotlinx.coroutines.k.f(this.f192296r, null, null, new z(dVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object y0(id.a aVar, List<fd.c> list, kotlin.coroutines.d<? super Unit> dVar) {
        a0 a0Var;
        if (dVar instanceof a0) {
            a0Var = (a0) dVar;
            int i10 = a0Var.f192301e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f192301e = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(dVar);
            }
        } else {
            a0Var = new a0(dVar);
        }
        Object obj = a0Var.f192299c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = a0Var.f192301e;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (list != null) {
                com.planner5d.library.model.manager.payments.p pVarM0 = m0();
                a0Var.f192297a = this;
                a0Var.f192298b = aVar;
                a0Var.f192301e = 1;
                if (pVarM0.M(aVar, list, a0Var) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar = (id.a) a0Var.f192298b;
        this = (j) a0Var.f192297a;
        ResultKt.m(obj);
        kotlinx.coroutines.k.f(this.f192296r, null, null, this.new b0(aVar, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7 A[Catch: all -> 0x0104, ErrorMessageException -> 0x0113, PHI: r9 r10 r11
      0x00d7: PHI (r9v11 id.a) = (r9v10 id.a), (r9v20 id.a) binds: [B:46:0x00d4, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r10v12 com.planner5d.library.model.manager.payments.j) = (r10v11 com.planner5d.library.model.manager.payments.j), (r10v19 com.planner5d.library.model.manager.payments.j) binds: [B:46:0x00d4, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r11v15 java.lang.Object) = (r11v14 java.lang.Object), (r11v1 java.lang.Object) binds: [B:46:0x00d4, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {ErrorMessageException -> 0x0113, all -> 0x0104, blocks: (B:56:0x00f0, B:58:0x00f4, B:59:0x00f5, B:60:0x00fe, B:21:0x0050, B:48:0x00d7, B:45:0x00c9, B:43:0x00be, B:63:0x0103, B:29:0x006e, B:36:0x0097, B:33:0x0079), top: B:77:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103 A[Catch: all -> 0x0104, ErrorMessageException -> 0x0113, TRY_ENTER, TRY_LEAVE, TryCatch #5 {ErrorMessageException -> 0x0113, all -> 0x0104, blocks: (B:56:0x00f0, B:58:0x00f4, B:59:0x00f5, B:60:0x00fe, B:21:0x0050, B:48:0x00d7, B:45:0x00c9, B:43:0x00be, B:63:0x0103, B:29:0x006e, B:36:0x0097, B:33:0x0079), top: B:77:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
    
        if (r10.o(r9, r0) == r1) goto L54;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(@org.jetbrains.annotations.Nullable id.a r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.A0(id.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object L0(@Nullable id.a aVar, long j10, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) throws Throwable {
        o0 o0Var;
        j jVar;
        id.a aVar2;
        j jVar2;
        com.planner5d.library.model.payments.a aVar3;
        u0 u0Var;
        if (dVar instanceof o0) {
            o0Var = (o0) dVar;
            int i10 = o0Var.f192459f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o0Var.f192459f = i10 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(dVar);
            }
        } else {
            o0Var = new o0(dVar);
        }
        o0 o0Var2 = o0Var;
        Object objH = o0Var2.f192457d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = o0Var2.f192459f;
        if (i11 == 0) {
            ResultKt.m(objH);
            kotlinx.coroutines.n0 n0VarN = com.planner5d.library.services.utility.s.f229729a.n();
            p0 p0Var = new p0(j10, aVar, null);
            o0Var2.f192454a = this;
            o0Var2.f192455b = aVar;
            o0Var2.f192459f = 1;
            objH = kotlinx.coroutines.i.h(n0VarN, p0Var, o0Var2);
            if (objH != objL) {
                jVar = this;
                aVar2 = aVar;
            }
            return objL;
        }
        if (i11 == 1) {
            id.a aVar4 = (id.a) o0Var2.f192455b;
            j jVar3 = (j) o0Var2.f192454a;
            ResultKt.m(objH);
            aVar2 = aVar4;
            jVar = jVar3;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.planner5d.library.model.payments.a aVar5 = (com.planner5d.library.model.payments.a) o0Var2.f192454a;
                ResultKt.m(objH);
                return aVar5;
            }
            aVar3 = (com.planner5d.library.model.payments.a) o0Var2.f192456c;
            id.a aVar6 = (id.a) o0Var2.f192455b;
            jVar2 = (j) o0Var2.f192454a;
            ResultKt.m(objH);
            aVar2 = aVar6;
        }
        u0Var = jVar2.f192294p;
        o0Var2.f192454a = aVar3;
        o0Var2.f192455b = null;
        o0Var2.f192456c = null;
        o0Var2.f192459f = 3;
        if (u0.b.a(u0Var, aVar2, false, o0Var2, 2, null) != objL) {
            return objL;
        }
        return aVar3;
        com.planner5d.library.model.payments.a aVar7 = (com.planner5d.library.model.payments.a) objH;
        com.planner5d.library.model.manager.payments.v vVar = jVar.f192291m;
        o0Var2.f192454a = jVar;
        o0Var2.f192455b = aVar2;
        o0Var2.f192456c = aVar7;
        o0Var2.f192459f = 2;
        if (vVar.j(o0Var2) != objL) {
            jVar2 = jVar;
            aVar3 = aVar7;
            u0Var = jVar2.f192294p;
            o0Var2.f192454a = aVar3;
            o0Var2.f192455b = null;
            o0Var2.f192456c = null;
            o0Var2.f192459f = 3;
            if (u0.b.a(u0Var, aVar2, false, o0Var2, 2, null) != objL) {
                return aVar3;
            }
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @kotlin.l(message = "Use coroutines or state flow")
    @Nullable
    public final Object M0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        q0 q0Var;
        if (dVar instanceof q0) {
            q0Var = (q0) dVar;
            int i10 = q0Var.f192477d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q0Var.f192477d = i10 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(dVar);
            }
        } else {
            q0Var = new q0(dVar);
        }
        Object obj = q0Var.f192475b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = q0Var.f192477d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (j) q0Var.f192474a;
        }
        ResultKt.m(obj);
        while (this.t0()) {
            q0Var.f192474a = this;
            q0Var.f192477d = 1;
            if (d1.b(200L, q0Var) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object a(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable id.a aVar2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new g(aVar, aVar2, null), dVar);
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @m1
    public boolean b(@Nullable com.planner5d.library.model.payments.a aVar) {
        Payment paymentG = this.f192289k.g(aVar);
        if (paymentG != null) {
            return paymentG.I();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object b0(long j10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        e eVar;
        com.planner5d.library.model.payments.a aVarS;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f192352e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f192352e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objA = eVar.f192350c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f192352e;
        if (i11 == 0) {
            ResultKt.m(objA);
            aVarS = this.f192289k.f(j10).s();
            id.a aVarA = this.f192292n.get().a();
            eVar.f192348a = this;
            eVar.f192349b = aVarS;
            eVar.f192352e = 1;
            objA = a(aVarS, aVarA, eVar);
            if (objA != objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objA);
            return objA;
        }
        com.planner5d.library.model.payments.a aVar = (com.planner5d.library.model.payments.a) eVar.f192349b;
        j jVar = (j) eVar.f192348a;
        ResultKt.m(objA);
        aVarS = aVar;
        this = jVar;
        if (!((Boolean) objA).booleanValue()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        eVar.f192348a = null;
        eVar.f192349b = null;
        eVar.f192352e = 2;
        Object objK = this.k(aVarS, eVar);
        if (objK != objL) {
            return objK;
        }
        return objL;
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return m0().F(l0(), dVar);
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object d(@NotNull com.planner5d.library.model.payments.a[] aVarArr, @Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new i0(aVarArr, aVar, null), dVar);
    }

    @Nullable
    public final Object e0(@Nullable id.a aVar, @NotNull com.planner5d.library.model.manager.config.a.EnumC1573a enumC1573a, @NotNull kotlin.coroutines.d<? super fd.g[]> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new C1601j(aVar, enumC1573a, null), dVar);
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object f(@Nullable id.a aVar, boolean z10, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) throws Throwable {
        kotlinx.coroutines.n0 n0VarN = com.planner5d.library.services.utility.s.f229729a.n();
        int i10 = 3 | 0;
        return kotlinx.coroutines.i.h(n0VarN, new k(aVar, n0VarN, z10, null), dVar);
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object h(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objS = m0().S(aVar, Payment.b.Consumed, dVar);
        return objS == kotlin.coroutines.intrinsics.b.l() ? objS : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object i(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super fd.a> dVar) {
        return m0().r(aVar, dVar);
    }

    @Nullable
    public final Object i0(@NotNull kotlin.coroutines.d<? super Payment[]> dVar) {
        return m0().v(new Payment.b[]{Payment.b.Finished, Payment.b.Validated, Payment.b.Consumed, Payment.b.Failed, Payment.b.StartedAndPending}, dVar);
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object j(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return m0().G(aVar, dVar);
    }

    @Nullable
    public final Object j0(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>> dVar) throws Throwable {
        return m0().x(aVar, dVar);
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object k(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new f(aVar, null), dVar);
    }

    @Nullable
    public final Object k0(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new l(aVar, null), dVar);
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.a
    @Nullable
    public Object l(@Nullable id.a aVar, @NotNull com.planner5d.library.model.payments.a aVar2, boolean z10, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.paymentmethod.b> dVar) throws Exception {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new c(aVar2, z10, this, aVar, null), dVar);
    }

    @NotNull
    public final com.planner5d.library.model.payments.paymentmethod.e l0() {
        com.planner5d.library.model.payments.paymentmethod.e eVar = this.f192284f.get();
        Intrinsics.checkNotNullExpressionValue(eVar, "get(...)");
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x011a A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #0 {all -> 0x0078, blocks: (B:18:0x0073, B:23:0x0083, B:44:0x013b, B:40:0x011a), top: B:74:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0136  */
    /* JADX WARN: Code duplicated, block: B:43:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x0167  */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x0177  */
    /* JADX WARN: Code duplicated, block: B:60:0x0181  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
    
        if (r3 == r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014f, code lost:
    
        if (r3 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0166, code lost:
    
        throw new com.planner5d.library.services.exceptions.ErrorMessageException(com.planner5d.library.services.utility.o2.q.I9, new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:
    
        if (r3 == r5) goto L72;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0181, please report this as an issue */
    @Override // com.planner5d.library.model.manager.payments.k
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(long r22, @org.jetbrains.annotations.Nullable id.a r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.m(long, id.a, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object n(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable id.a aVar2, @NotNull kotlin.coroutines.d<? super Long> dVar) throws Throwable {
        return m0().V(aVar, aVar2, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        if (r14 == r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e5, code lost:
    
        if (r14 == r7) goto L51;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n0(@org.jetbrains.annotations.NotNull fd.k r11, @org.jetbrains.annotations.Nullable id.a r12, @org.jetbrains.annotations.NotNull com.planner5d.library.model.manager.config.a.EnumC1573a r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super fd.g[]> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.n0(fd.k, id.a, com.planner5d.library.model.manager.config.a$a, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object o(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        j0 j0Var;
        if (dVar instanceof j0) {
            j0Var = (j0) dVar;
            int i10 = j0Var.f192405e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j0Var.f192405e = i10 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(dVar);
            }
        } else {
            j0Var = new j0(dVar);
        }
        Object objF = j0Var.f192403c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = j0Var.f192405e;
        if (i11 == 0) {
            ResultKt.m(objF);
            j0Var.f192401a = this;
            j0Var.f192402b = aVar;
            j0Var.f192405e = 1;
            objF = f(aVar, false, j0Var);
            if (objF == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (id.a) j0Var.f192402b;
            this = (j) j0Var.f192401a;
            ResultKt.m(objF);
        }
        kotlinx.coroutines.k.f(this.f192296r, null, null, this.new k0((com.planner5d.library.model.payments.a[]) objF, aVar, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object p(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        s sVar;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i10 = sVar.f192483c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f192483c = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(dVar);
            }
        } else {
            sVar = new s(dVar);
        }
        Object objG = sVar.f192481a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = sVar.f192483c;
        if (i11 == 0) {
            ResultKt.m(objG);
            if (b(aVar)) {
                com.planner5d.library.model.manager.payments.p pVarM0 = m0();
                sVar.f192483c = 1;
                objG = pVarM0.G(aVar, sVar);
                if (objG == objL) {
                    return objL;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objG);
        boolean z10 = ((Boolean) objG).booleanValue() ? false : true;
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    @Nullable
    public final Object p0(@Nullable id.a aVar, boolean z10, @NotNull kotlin.coroutines.d<? super fd.g[]> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.n(), new o(aVar, this, z10, null), dVar);
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object q(@NotNull fd.i iVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlin.coroutines.jvm.internal.b.a(iVar.i() != fd.k.DESIGN_GENERATOR);
    }

    @Nullable
    public final Object q0(@NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new p(null), dVar);
    }

    @Override // com.planner5d.library.model.manager.payments.k
    @Nullable
    public Object r(@NotNull kotlinx.coroutines.n0 n0Var, @NotNull Payment.b bVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) {
        return m0().C(n0Var, bVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:13:0x003e, B:30:0x00b4, B:25:0x008d, B:27:0x0094, B:33:0x00be, B:32:0x00b9, B:18:0x0054, B:24:0x007d, B:21:0x006f), top: B:41:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00be A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:13:0x003e, B:30:0x00b4, B:25:0x008d, B:27:0x0094, B:33:0x00be, B:32:0x00b9, B:18:0x0054, B:24:0x007d, B:21:0x006f), top: B:41:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b1 -> B:30:0x00b4). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r0(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<java.lang.String>> r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.j.r0(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object s0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        r rVar;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f192480c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f192480c = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(dVar);
            }
        } else {
            rVar = new r(dVar);
        }
        Object obj = rVar.f192478a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = rVar.f192480c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.r rVar2 = this.f192287i.get();
                id.a aVarA = this.f192292n.get().a();
                rVar.f192480c = 1;
                int i12 = 6 << 0;
                if (rVar2.p(aVarA, false, rVar) == objL) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object z0(@Nullable id.a aVar, @Nullable fd.f fVar, @Nullable Activity activity, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        c0 c0Var;
        j jVar;
        id.a aVar2;
        Activity activity2;
        fd.f fVar2;
        if (dVar instanceof c0) {
            c0Var = (c0) dVar;
            int i10 = c0Var.f192322g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.f192322g = i10 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(dVar);
            }
        } else {
            c0Var = new c0(dVar);
        }
        Object objK = c0Var.f192320e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c0Var.f192322g;
        if (i11 == 0) {
            ResultKt.m(objK);
            com.planner5d.library.model.manager.payments.p pVarM0 = m0();
            com.planner5d.library.model.payments.paymentmethod.e eVarL0 = l0();
            c0Var.f192316a = this;
            c0Var.f192317b = aVar;
            c0Var.f192318c = fVar;
            c0Var.f192319d = activity;
            c0Var.f192322g = 1;
            objK = pVarM0.K(eVarL0, fVar, c0Var);
            if (objK == objL) {
                return objL;
            }
            jVar = this;
            aVar2 = aVar;
            activity2 = activity;
            fVar2 = fVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Activity activity3 = (Activity) c0Var.f192319d;
            fd.f fVar3 = (fd.f) c0Var.f192318c;
            id.a aVar3 = (id.a) c0Var.f192317b;
            j jVar2 = (j) c0Var.f192316a;
            ResultKt.m(objK);
            activity2 = activity3;
            fVar2 = fVar3;
            jVar = jVar2;
            aVar2 = aVar3;
        }
        Long id2 = ((Payment) objK).getId();
        if (id2 == null) {
            throw new IllegalStateException("Started payment has no ID - this is a DB error shouldn't ever happen normally");
        }
        long jLongValue = id2.longValue();
        kotlinx.coroutines.k.f(jVar.f192296r, null, null, jVar.new d0(aVar2, fVar2, jLongValue, activity2, null), 3, null);
        return kotlin.coroutines.jvm.internal.b.g(jLongValue);
    }
}
