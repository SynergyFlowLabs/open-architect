package com.planner5d.library.model.manager.payments;

import android.app.Application;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.g3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.m2;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.p2;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
@SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n1#2:551\n54#3,8:552\n54#3,8:560\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository\n*L\n301#1:552,8\n340#1:560,8\n*E\n"})
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f192563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f192564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e1 f192565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u1 f192566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final NetworkErrorUtility f192567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.e f192568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.payments.paymentmethod.e> f192569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.v f192570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.r f192571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final g3 f192572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f192573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Map<String, Pair<Long, String>> f192574l;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getAllOrders$2", f = "PaymentsRepository.kt", i = {0, 1, 2, 2, 3}, l = {237, 242, com.planner5d.library.engine.input.f.b.R1, com.planner5d.library.engine.input.f.b.W1}, m = "invokeSuspend", n = {AttributeType.LIST, AttributeType.LIST, AttributeType.LIST, "order", AttributeType.LIST}, s = {"L$0", "L$0", "L$0", "L$2", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super fd.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192581g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ id.a f192583i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(id.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f192583i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new a(this.f192583i, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:54:0x0123  */
        /* JADX WARN: Code duplicated, block: B:55:0x0125 A[EDGE_INSN: B:55:0x0125->B:56:0x012b BREAK  A[LOOP:0: B:48:0x00db->B:60:0x0136]] */
        /* JADX WARN: Code duplicated, block: B:64:0x016b  */
        /* JADX WARN: Code duplicated, block: B:80:0x0147 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0125 -> B:56:0x012b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:54:0x0123
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 372
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super fd.a> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository", f = "PaymentsRepository.kt", i = {0}, l = {325}, m = "setPaymentPendingSafely", n = {"order"}, s = {"L$0"})
    static final class a0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192585b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192587d;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192585b = obj;
            this.f192587d |= Integer.MIN_VALUE;
            return p.this.R(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getAndValidateOrder$4", f = "PaymentsRepository.kt", i = {0, 3, 5, 6, 6, 6, 7, 8, 8, 8}, l = {552, 395, 395, 555, 555, 397, 560, com.google.android.vending.licensing.k.f115073b, 563, 563}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv", "payment", "$this$invokeSuspend_u24lambda_u243", "$receiver$iv", "$completion$iv", "$this$invokeSuspend_u24lambda_u243", "$this$invokeSuspend_u24lambda_u243", "$receiver$iv", "$completion$iv"}, s = {"L$0", "L$0", "L$0", "L$3", "L$4", "L$5", "L$3", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getAndValidateOrder$4\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n54#2,8:559\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getAndValidateOrder$4\n*L\n393#1:551,8\n406#1:559,8\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192594g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ id.a f192596i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192597j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Payment> f192598k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192599l;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getAndValidateOrder$4$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {265, 269, 269}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getAndValidateOrder$4\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:270\n394#3,2:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:270,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Pair<? extends Payment, ? extends JSONObject>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192600a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192601b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192602c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192603d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192604e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192605f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0 f192606g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ p f192607h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.a f192608i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ id.a f192609j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f192610k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f192611l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, Function0 function0, p pVar, com.planner5d.library.model.payments.a aVar2, id.a aVar3) {
                super(2, dVar);
                this.f192604e = aVar;
                this.f192605f = obj;
                this.f192606g = function0;
                this.f192607h = pVar;
                this.f192608i = aVar2;
                this.f192609j = aVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192604e, this.f192605f, dVar, this.f192606g, this.f192607h, this.f192608i, this.f192609j);
            }

            /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objInvoke;
                com.planner5d.library.model.manager.payments.r rVar;
                com.planner5d.library.model.payments.a aVar2;
                Object objW;
                Throwable th2;
                kotlinx.coroutines.sync.a aVar3;
                Object objJ;
                Object obj3;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192603d;
                int i11 = 4 & 2;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        aVar = this.f192604e;
                        obj2 = this.f192605f;
                        this.f192600a = aVar;
                        this.f192601b = obj2;
                        this.f192603d = 1;
                        if (aVar.h(obj2, this) != objL) {
                        }
                        return objL;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj3 = this.f192602c;
                            obj2 = this.f192601b;
                            aVar3 = (kotlinx.coroutines.sync.a) this.f192600a;
                            try {
                                ResultKt.m(obj);
                                Pair pair = TuplesKt.to(obj3, obj);
                                aVar3.i(obj2);
                                return pair;
                            } catch (Throwable th3) {
                                th2 = th3;
                                aVar3.i(obj2);
                                throw th2;
                            }
                        }
                        com.planner5d.library.model.manager.payments.r rVar2 = (com.planner5d.library.model.manager.payments.r) this.f192611l;
                        com.planner5d.library.model.payments.a aVar4 = (com.planner5d.library.model.payments.a) this.f192610k;
                        objInvoke = this.f192602c;
                        Object obj4 = this.f192601b;
                        kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f192600a;
                        try {
                            ResultKt.m(obj);
                            objW = obj;
                            aVar = aVar5;
                            aVar2 = aVar4;
                            rVar = rVar2;
                            obj2 = obj4;
                            id.a aVar6 = this.f192609j;
                            this.f192600a = aVar;
                            this.f192601b = obj2;
                            this.f192602c = objInvoke;
                            this.f192610k = null;
                            this.f192611l = null;
                            this.f192603d = 3;
                            objJ = rVar.j(aVar2, (fd.f) objW, aVar6, "order", this);
                            if (objJ != objL) {
                                kotlinx.coroutines.sync.a aVar7 = aVar;
                                obj = objJ;
                                aVar3 = aVar7;
                                obj3 = objInvoke;
                                Pair pair2 = TuplesKt.to(obj3, obj);
                                aVar3.i(obj2);
                                return pair2;
                            }
                            return objL;
                        } catch (Throwable th4) {
                            th2 = th4;
                            obj2 = obj4;
                            aVar3 = aVar5;
                            aVar3.i(obj2);
                            throw th2;
                        }
                    }
                    obj2 = this.f192601b;
                    kotlinx.coroutines.sync.a aVar8 = (kotlinx.coroutines.sync.a) this.f192600a;
                    ResultKt.m(obj);
                    aVar = aVar8;
                    objInvoke = this.f192606g.invoke();
                    rVar = this.f192607h.f192571i;
                    aVar2 = this.f192608i;
                    p pVar = this.f192607h;
                    id.a aVar9 = this.f192609j;
                    this.f192600a = aVar;
                    this.f192601b = obj2;
                    this.f192602c = objInvoke;
                    this.f192610k = aVar2;
                    this.f192611l = rVar;
                    this.f192603d = 2;
                    objW = pVar.w(aVar9, aVar2, this);
                    if (objW != objL) {
                        id.a aVar10 = this.f192609j;
                        this.f192600a = aVar;
                        this.f192601b = obj2;
                        this.f192602c = objInvoke;
                        this.f192610k = null;
                        this.f192611l = null;
                        this.f192603d = 3;
                        objJ = rVar.j(aVar2, (fd.f) objW, aVar10, "order", this);
                        if (objJ != objL) {
                            kotlinx.coroutines.sync.a aVar11 = aVar;
                            obj = objJ;
                            aVar3 = aVar11;
                            obj3 = objInvoke;
                            Pair pair3 = TuplesKt.to(obj3, obj);
                            aVar3.i(obj2);
                            return pair3;
                        }
                    }
                    return objL;
                } catch (Throwable th5) {
                    kotlinx.coroutines.sync.a aVar12 = aVar;
                    th2 = th5;
                    aVar3 = aVar12;
                    aVar3.i(obj2);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Pair<? extends Payment, ? extends JSONObject>> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.payments.p$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getAndValidateOrder$4$invokeSuspend$lambda$3$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getAndValidateOrder$4\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:271\n407#3,3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:271,2\n*E\n"})
        public static final class C1602b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192615d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192616e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192617f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Payment f192618g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ id.a f192619h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ p f192620i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1602b(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, Payment payment, id.a aVar2, p pVar) {
                super(2, dVar);
                this.f192616e = aVar;
                this.f192617f = obj;
                this.f192618g = payment;
                this.f192619h = aVar2;
                this.f192620i = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1602b(this.f192616e, this.f192617f, dVar, this.f192618g, this.f192619h, this.f192620i);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192615d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192616e;
                    Object obj3 = this.f192617f;
                    this.f192612a = aVar;
                    this.f192613b = obj3;
                    this.f192615d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192613b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192612a;
                    ResultKt.m(obj);
                }
                try {
                    this.f192618g.X(com.planner5d.library.modules.user.user.x.a(this.f192619h));
                    this.f192620i.f192568f.n(this.f192618g);
                    return Unit.f312394a;
                } finally {
                    aVar.i(obj2);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1602b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(id.a aVar, com.planner5d.library.model.payments.a aVar2, Function0<Payment> function0, com.planner5d.library.model.payments.paymentmethod.e eVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f192596i = aVar;
            this.f192597j = aVar2;
            this.f192598k = function0;
            this.f192599l = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new b(this.f192596i, this.f192597j, this.f192598k, this.f192599l, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x00a2 A[PHI: r0 r1 r2 r3 r4 r8
          0x00a2: PHI (r0v18 id.a) = (r0v6 id.a), (r0v22 id.a) binds: [B:35:0x0178, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r1v8 com.planner5d.library.model.payments.a) = (r1v2 com.planner5d.library.model.payments.a), (r1v10 com.planner5d.library.model.payments.a) binds: [B:35:0x0178, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r2v9 com.planner5d.library.model.manager.payments.p) = (r2v1 com.planner5d.library.model.manager.payments.p), (r2v11 com.planner5d.library.model.manager.payments.p) binds: [B:35:0x0178, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r3v11 kotlin.jvm.functions.Function0<com.planner5d.library.model.payments.Payment>) = 
          (r3v2 kotlin.jvm.functions.Function0<com.planner5d.library.model.payments.Payment>)
          (r3v13 kotlin.jvm.functions.Function0<com.planner5d.library.model.payments.Payment>)
         binds: [B:35:0x0178, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r4v10 kotlinx.coroutines.sync.a) = (r4v3 kotlinx.coroutines.sync.a), (r4v12 kotlinx.coroutines.sync.a) binds: [B:35:0x0178, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v14 java.lang.Object) = (r8v6 java.lang.Object), (r8v17 java.lang.Object) binds: [B:35:0x0178, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x0126  */
        /* JADX WARN: Code duplicated, block: B:29:0x0143  */
        /* JADX WARN: Code duplicated, block: B:34:0x0165  */
        /* JADX WARN: Code duplicated, block: B:40:0x019a A[PHI: r0
          0x019a: PHI (r0v23 java.lang.Object) = (r0v15 java.lang.Object), (r0v20 java.lang.Object), (r0v28 java.lang.Object) binds: [B:33:0x0160, B:38:0x0196, B:14:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x01bb A[PHI: r0 r1
          0x01bb: PHI (r0v29 java.lang.Object) = (r0v27 java.lang.Object), (r0v40 java.lang.Object) binds: [B:41:0x01b7, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x01bb: PHI (r1v13 com.planner5d.library.model.payments.Payment) = (r1v12 com.planner5d.library.model.payments.Payment), (r1v18 com.planner5d.library.model.payments.Payment) binds: [B:41:0x01b7, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:45:0x01c3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:46:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:49:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:52:0x021d  */
        /* JADX WARN: Code duplicated, block: B:55:0x022c  */
        /* JADX WARN: Code duplicated, block: B:58:0x024f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0250  */
        /* JADX WARN: Code duplicated, block: B:62:0x0269  */
        /* JADX WARN: Code duplicated, block: B:66:0x028c A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x015c, code lost:
        
            if (r0 == r6) goto L65;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 680
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setPaymentState$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentState$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentState$2\n*L\n228#1:551,8\n*E\n"})
    static final class b0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192625e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192627g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Payment.b f192628h;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setPaymentState$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentState$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:270\n229#3,2:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:270,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192629a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192630b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192631c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192632d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192633e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192634f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192635g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.a f192636h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ Payment.b f192637i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, com.planner5d.library.model.payments.a aVar2, Payment.b bVar) {
                super(2, dVar);
                this.f192633e = aVar;
                this.f192634f = obj;
                this.f192635g = pVar;
                this.f192636h = aVar2;
                this.f192637i = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192633e, this.f192634f, dVar, this.f192635g, this.f192636h, this.f192637i);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192632d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192633e;
                    Object obj3 = this.f192634f;
                    this.f192629a = aVar;
                    this.f192630b = obj3;
                    this.f192632d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192630b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192629a;
                    ResultKt.m(obj);
                }
                try {
                    this.f192635g.f192568f.r(this.f192636h, this.f192637i);
                    Unit unit = Unit.f312394a;
                    aVar.i(obj2);
                    return unit;
                } catch (Throwable th2) {
                    aVar.i(obj2);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(com.planner5d.library.model.payments.a aVar, Payment.b bVar, kotlin.coroutines.d<? super b0> dVar) {
            super(2, dVar);
            this.f192627g = aVar;
            this.f192628h = bVar;
            int i10 = 6 | 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new b0(this.f192627g, this.f192628h, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
        
            if (kotlin.Unit.f312394a == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
        
            if (kotlinx.coroutines.i.h((kotlin.coroutines.CoroutineContext) r4, r8, r16) == r1) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getByStatesWithOrder$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getByStatesWithOrder$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getByStatesWithOrder$2\n*L\n320#1:551,8\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Payment[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192641d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Payment.b[] f192643f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getByStatesWithOrder$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getByStatesWithOrder$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n320#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Payment[]>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192644a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192645b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192646c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192647d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192648e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192649f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192650g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Payment.b[] f192651h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, Payment.b[] bVarArr) {
                super(2, dVar);
                this.f192648e = aVar;
                this.f192649f = obj;
                this.f192650g = pVar;
                this.f192651h = bVarArr;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192648e, this.f192649f, dVar, this.f192650g, this.f192651h);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192647d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192648e;
                    Object obj3 = this.f192649f;
                    this.f192644a = aVar;
                    this.f192645b = obj3;
                    this.f192647d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192645b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192644a;
                    ResultKt.m(obj);
                }
                try {
                    com.planner5d.library.model.manager.payments.e eVar = this.f192650g.f192568f;
                    Payment.b[] bVarArr = this.f192651h;
                    Payment[] paymentArrH = eVar.h((Payment.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                    aVar.i(obj2);
                    return paymentArrH;
                } catch (Throwable th2) {
                    aVar.i(obj2);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Payment[]> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Payment.b[] bVarArr, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f192643f = bVarArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new c(this.f192643f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.sync.a aVar;
            p pVar;
            Payment.b[] bVarArr;
            p pVar2;
            kotlinx.coroutines.sync.a aVar2;
            Object objH;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192641d;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                kotlinx.coroutines.sync.a aVarZ = p.this.z();
                p pVar3 = p.this;
                Payment.b[] bVarArr2 = this.f192643f;
                p2.a aVar3 = p2.f229701c;
                this.f192638a = aVarZ;
                this.f192639b = pVar3;
                this.f192640c = bVarArr2;
                this.f192641d = 1;
                Object objB = aVar3.b(aVarZ, this);
                if (objB != objL) {
                    aVar = aVarZ;
                    obj = objB;
                    pVar = pVar3;
                    bVarArr = bVarArr2;
                }
                return objL;
            }
            if (i10 == 1) {
                bVarArr = (Payment.b[]) this.f192640c;
                pVar = (p) this.f192639b;
                aVar = (kotlinx.coroutines.sync.a) this.f192638a;
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    ResultKt.m(obj);
                    return obj;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                bVarArr = (Payment.b[]) this.f192640c;
                p pVar4 = (p) this.f192639b;
                kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) this.f192638a;
                ResultKt.m(obj);
                pVar2 = pVar4;
                aVar2 = aVar4;
            }
            a aVar5 = new a(aVar2, null, null, pVar2, bVarArr);
            this.f192638a = null;
            this.f192639b = null;
            this.f192640c = null;
            this.f192641d = 4;
            objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar5, this);
            if (objH != objL) {
                return objL;
            }
            return objH;
            if (((Boolean) obj).booleanValue()) {
                this.f192638a = pVar;
                this.f192639b = bVarArr;
                this.f192640c = null;
                this.f192641d = 2;
                Object objH2 = pVar.f192568f.h((Payment.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                if (objH2 != objL) {
                    return objH2;
                }
            } else {
                p2.a aVar6 = p2.f229701c;
                this.f192638a = aVar;
                this.f192639b = pVar;
                this.f192640c = bVarArr;
                this.f192641d = 3;
                obj = aVar6.a(aVar, this);
                if (obj != objL) {
                    pVar2 = pVar;
                    aVar2 = aVar;
                    a aVar7 = new a(aVar2, null, null, pVar2, bVarArr);
                    this.f192638a = null;
                    this.f192639b = null;
                    this.f192640c = null;
                    this.f192641d = 4;
                    objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar7, this);
                    if (objH != objL) {
                        return objH;
                    }
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Payment[]> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$updateOrders$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$updateOrders$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$updateOrders$2\n*L\n314#1:551,8\n*E\n"})
    static final class c0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192656e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192658g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a[] f192659h;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$updateOrders$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$updateOrders$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n314#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192661b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192662c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192663d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192664e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192665f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192666g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192667h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.a[] f192668i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, com.planner5d.library.model.payments.paymentmethod.e eVar, com.planner5d.library.model.payments.a[] aVarArr) {
                super(2, dVar);
                this.f192664e = aVar;
                this.f192665f = obj;
                this.f192666g = pVar;
                this.f192667h = eVar;
                this.f192668i = aVarArr;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192664e, this.f192665f, dVar, this.f192666g, this.f192667h, this.f192668i);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192663d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192664e;
                    Object obj3 = this.f192665f;
                    this.f192660a = aVar;
                    this.f192661b = obj3;
                    this.f192663d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192661b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192660a;
                    ResultKt.m(obj);
                }
                try {
                    this.f192666g.f192568f.t(this.f192667h, this.f192668i);
                    return Unit.f312394a;
                } finally {
                    aVar.i(obj2);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(com.planner5d.library.model.payments.paymentmethod.e eVar, com.planner5d.library.model.payments.a[] aVarArr, kotlin.coroutines.d<? super c0> dVar) {
            super(2, dVar);
            this.f192658g = eVar;
            this.f192659h = aVarArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new c0(this.f192658g, this.f192659h, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
        
            if (kotlin.Unit.f312394a == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
        
            if (kotlinx.coroutines.i.h((kotlin.coroutines.CoroutineContext) r4, r8, r16) == r1) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getOrderedProduct$2", f = "PaymentsRepository.kt", i = {0, 0}, l = {453}, m = "invokeSuspend", n = {"payment", "userId"}, s = {"L$0", "J$0"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super fd.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f192669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f192672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f192673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192674f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(id.a aVar, p pVar, com.planner5d.library.model.payments.a aVar2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f192672d = aVar;
            this.f192673e = pVar;
            this.f192674f = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f192672d, this.f192673e, this.f192674f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long jA;
            Payment paymentG;
            Object objH;
            Payment payment;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192671c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    jA = com.planner5d.library.modules.user.user.x.a(this.f192672d);
                    paymentG = this.f192673e.f192568f.g(this.f192674f);
                    if (paymentG == null) {
                        return null;
                    }
                    if (paymentG.D()) {
                        com.planner5d.library.model.payments.paymentmethod.e eVar = (com.planner5d.library.model.payments.paymentmethod.e) this.f192673e.f192569g.get();
                        id.a aVar = this.f192672d;
                        String[] strArr = {this.f192674f.d(jA).c()};
                        this.f192670b = paymentG;
                        this.f192669a = jA;
                        this.f192671c = 1;
                        objH = eVar.h(aVar, strArr, this);
                        if (objH == objL) {
                            return objL;
                        }
                        payment = paymentG;
                    }
                    fd.i iVarD = this.f192674f.d(jA);
                    Long lA = paymentG.A();
                    Intrinsics.checkNotNull(lA);
                    return new fd.f(iVarD, lA.longValue(), paymentG.z(), null, null, null, 48, null);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f192669a;
                payment = (Payment) this.f192670b;
                ResultKt.m(obj);
                jA = j10;
                objH = obj;
                fd.f fVar = (fd.f) ArraysKt.firstOrNull((Object[]) objH);
                if (fVar != null) {
                    this.f192673e.f192568f.q(payment, fVar);
                }
                paymentG = payment;
                fd.i iVarD2 = this.f192674f.d(jA);
                Long lA2 = paymentG.A();
                Intrinsics.checkNotNull(lA2);
                return new fd.f(iVarD2, lA2.longValue(), paymentG.z(), null, null, null, 48, null);
            } catch (Throwable th2) {
                this.f192673e.f192566d.b("product_ordered", this.f192674f.f222476b, th2);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super fd.f> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$validateEncryptedPaymentResponse$2", f = "PaymentsRepository.kt", i = {0, 0, 1}, l = {476, 478, 481, 484, 487, 495, 503}, m = "invokeSuspend", n = {"responseData", "result", "result"}, s = {"L$2", "J$1", "J$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$validateEncryptedPaymentResponse$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
    static final class d0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f192678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f192679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f192681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p f192682h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192683i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f192684j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(String str, p pVar, com.planner5d.library.model.payments.a aVar, long j10, kotlin.coroutines.d<? super d0> dVar) {
            super(2, dVar);
            this.f192681g = str;
            this.f192682h = pVar;
            this.f192683i = aVar;
            this.f192684j = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d0(this.f192681g, this.f192682h, this.f192683i, this.f192684j, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00de  */
        /* JADX WARN: Code duplicated, block: B:36:0x010f  */
        /* JADX WARN: Code duplicated, block: B:39:0x0125  */
        /* JADX WARN: Code duplicated, block: B:42:0x012c  */
        /* JADX WARN: Code duplicated, block: B:53:0x01ea A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:54:0x01eb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            p pVar;
            com.planner5d.library.model.payments.a aVar;
            long j10;
            JSONObject jSONObject;
            long jG;
            Exception exc;
            Payment.b bVar;
            long j11;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            switch (this.f192680f) {
                case 0:
                    ResultKt.m(obj);
                    String strC = com.planner5d.library.services.utility.e0.c(this.f192681g);
                    Intrinsics.checkNotNull(strC);
                    if (strC.length() <= 0) {
                        strC = null;
                    }
                    if (strC == null) {
                        p pVar2 = this.f192682h;
                        com.planner5d.library.model.payments.a aVar2 = this.f192683i;
                        Exception exc2 = new Exception("Corrupted data");
                        this.f192680f = 7;
                        if (pVar2.P(aVar2, exc2, this) == objL) {
                            return objL;
                        }
                        return null;
                    }
                    pVar = this.f192682h;
                    aVar = this.f192683i;
                    j10 = this.f192684j;
                    JSONObject jSONObjectQ = pVar.f192564b.q(strC);
                    Intrinsics.checkNotNull(jSONObjectQ);
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.success;
                    if (k1.a(jSONObjectQ, rVar)) {
                        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.purchase;
                        if (jSONObjectQ.has(rVar2.f224891a)) {
                            jSONObject = jSONObjectQ.getJSONObject(rVar2.f224891a);
                            com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.id;
                            if (jSONObject.has(rVar3.f224891a)) {
                                com.planner5d.library.services.r rVar4 = com.planner5d.library.services.r.cdate;
                                if (jSONObject.has(rVar4.f224891a)) {
                                    jG = pVar.f192564b.G(jSONObject.getString(rVar4.f224891a));
                                    com.planner5d.library.model.payments.paymentmethod.e eVar = (com.planner5d.library.model.payments.paymentmethod.e) pVar.f192569g.get();
                                    this.f192675a = pVar;
                                    this.f192676b = aVar;
                                    this.f192677c = jSONObject;
                                    this.f192678d = j10;
                                    this.f192679e = jG;
                                    this.f192680f = 1;
                                    obj = eVar.e(aVar, this);
                                    if (obj != objL) {
                                        if (((Boolean) obj).booleanValue()) {
                                            exc = new Exception("Acknowledge failed");
                                            this.f192675a = null;
                                            this.f192676b = null;
                                            this.f192677c = null;
                                            this.f192680f = 4;
                                            if (pVar.P(aVar, exc, this) != objL) {
                                                return null;
                                            }
                                        } else if (jSONObject.getLong(com.planner5d.library.services.r.uid.f224891a) != j10 || aVar.d(j10).k()) {
                                            bVar = Payment.b.Validated;
                                            this.f192675a = null;
                                            this.f192676b = null;
                                            this.f192677c = null;
                                            this.f192678d = jG;
                                            this.f192680f = 2;
                                            if (pVar.S(aVar, bVar, this) != objL) {
                                                j11 = jG;
                                                return kotlin.coroutines.jvm.internal.b.g(j11);
                                            }
                                        } else {
                                            Exception exc3 = new Exception("Purchase for another user");
                                            this.f192675a = null;
                                            this.f192676b = null;
                                            this.f192677c = null;
                                            this.f192680f = 3;
                                            if (pVar.P(aVar, exc3, this) != objL) {
                                                return null;
                                            }
                                        }
                                    }
                                }
                                return objL;
                            }
                            m2 m2Var = m2.f225330a;
                            Exception exc4 = new Exception("Invalid data - ic:" + m2Var.a(jSONObjectQ.has(rVar3.f224891a)) + ":" + m2Var.a(jSONObjectQ.has(com.planner5d.library.services.r.cdate.f224891a)));
                            this.f192680f = 5;
                            if (pVar.P(aVar, exc4, this) == objL) {
                                return objL;
                            }
                            return null;
                        }
                    }
                    m2 m2Var2 = m2.f225330a;
                    Exception exc5 = new Exception("Invalid data - sp:" + m2Var2.a(jSONObjectQ.has(rVar.f224891a)) + ":" + m2Var2.a(jSONObjectQ.has(com.planner5d.library.services.r.purchase.f224891a)));
                    this.f192680f = 6;
                    if (pVar.P(aVar, exc5, this) == objL) {
                        return objL;
                    }
                    return null;
                case 1:
                    jG = this.f192679e;
                    j10 = this.f192678d;
                    jSONObject = (JSONObject) this.f192677c;
                    aVar = (com.planner5d.library.model.payments.a) this.f192676b;
                    pVar = (p) this.f192675a;
                    ResultKt.m(obj);
                    if (((Boolean) obj).booleanValue()) {
                        exc = new Exception("Acknowledge failed");
                        this.f192675a = null;
                        this.f192676b = null;
                        this.f192677c = null;
                        this.f192680f = 4;
                        if (pVar.P(aVar, exc, this) != objL) {
                            return objL;
                        }
                        return null;
                    }
                    if (jSONObject.getLong(com.planner5d.library.services.r.uid.f224891a) != j10) {
                        bVar = Payment.b.Validated;
                        this.f192675a = null;
                        this.f192676b = null;
                        this.f192677c = null;
                        this.f192678d = jG;
                        this.f192680f = 2;
                        if (pVar.S(aVar, bVar, this) != objL) {
                            j11 = jG;
                            return kotlin.coroutines.jvm.internal.b.g(j11);
                        }
                    } else {
                        bVar = Payment.b.Validated;
                        this.f192675a = null;
                        this.f192676b = null;
                        this.f192677c = null;
                        this.f192678d = jG;
                        this.f192680f = 2;
                        if (pVar.S(aVar, bVar, this) != objL) {
                            j11 = jG;
                            return kotlin.coroutines.jvm.internal.b.g(j11);
                        }
                    }
                    return objL;
                case 2:
                    j11 = this.f192678d;
                    ResultKt.m(obj);
                    return kotlin.coroutines.jvm.internal.b.g(j11);
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    ResultKt.m(obj);
                    return null;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((d0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository", f = "PaymentsRepository.kt", i = {}, l = {258, 258}, m = "getOrdersCached", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192687c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192689e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192687c = obj;
            this.f192689e |= Integer.MIN_VALUE;
            return p.this.x(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$validateOrder$2", f = "PaymentsRepository.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {201, 201, 206, 219, 223}, m = "invokeSuspend", n = {"responseDataRaw", "key", "userId", "responseDataRaw", "key", "userId", "error"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$validateOrder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
    static final class e0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f192694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ id.a f192696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192697h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f192698i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(id.a aVar, com.planner5d.library.model.payments.a aVar2, p pVar, kotlin.coroutines.d<? super e0> dVar) {
            super(2, dVar);
            this.f192696g = aVar;
            this.f192697h = aVar2;
            this.f192698i = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e0(this.f192696g, this.f192697h, this.f192698i, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0131  */
        /* JADX WARN: Code duplicated, block: B:50:0x013f  */
        /* JADX WARN: Code duplicated, block: B:58:0x018b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:79:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            i1.h hVar;
            long jA;
            T t10;
            Object objW;
            i1.h hVar2;
            com.planner5d.library.model.payments.a aVar;
            String str;
            com.planner5d.library.model.manager.payments.r rVar;
            long j10;
            Object objN;
            String str2;
            i1.h hVar3;
            Object objU;
            com.planner5d.library.api.c cVar;
            p pVar;
            com.planner5d.library.model.payments.a aVar2;
            Exception exc;
            JSONObject jSONObjectA;
            com.planner5d.library.services.r rVar2;
            Map map;
            p pVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192695f;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    hVar = new i1.h();
                    jA = com.planner5d.library.modules.user.user.x.a(this.f192696g);
                    String str3 = jA + "_" + this.f192697h.f222475a;
                    i1.h hVar4 = new i1.h();
                    Map map2 = this.f192698i.f192574l;
                    p pVar3 = this.f192698i;
                    synchronized (map2) {
                        try {
                            t10 = pVar3.f192574l.containsKey(str3) ? (Pair) pVar3.f192574l.get(str3) : 0;
                            hVar4.f312751a = t10;
                            Unit unit = Unit.f312394a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (t10 == 0 || System.currentTimeMillis() - ((Number) ((Pair) hVar4.f312751a).getFirst()).longValue() >= 3600000) {
                        com.planner5d.library.model.manager.payments.r rVar3 = this.f192698i.f192571i;
                        com.planner5d.library.model.payments.a aVar3 = this.f192697h;
                        p pVar4 = this.f192698i;
                        id.a aVar4 = this.f192696g;
                        this.f192690a = hVar;
                        this.f192691b = str3;
                        this.f192692c = rVar3;
                        this.f192693d = aVar3;
                        this.f192694e = jA;
                        this.f192695f = 1;
                        objW = pVar4.w(aVar4, aVar3, this);
                        if (objW != objL) {
                            hVar2 = hVar;
                            aVar = aVar3;
                            str = str3;
                            rVar = rVar3;
                            j10 = jA;
                        }
                    } else {
                        hVar.f312751a = ((Pair) hVar4.f312751a).getSecond();
                        p pVar5 = this.f192698i;
                        String str4 = (String) hVar.f312751a;
                        com.planner5d.library.model.payments.a aVar5 = this.f192697h;
                        this.f192690a = null;
                        this.f192691b = null;
                        this.f192695f = 5;
                        objU = pVar5.U(str4, aVar5, jA, this);
                        if (objU != objL) {
                            return objU;
                        }
                    }
                    return objL;
                }
                if (i10 == 1) {
                    long j11 = this.f192694e;
                    aVar = (com.planner5d.library.model.payments.a) this.f192693d;
                    rVar = (com.planner5d.library.model.manager.payments.r) this.f192692c;
                    String str5 = (String) this.f192691b;
                    i1.h hVar5 = (i1.h) this.f192690a;
                    ResultKt.m(obj);
                    str = str5;
                    hVar2 = hVar5;
                    j10 = j11;
                    objW = obj;
                } else if (i10 == 2) {
                    long j12 = this.f192694e;
                    str2 = (String) this.f192691b;
                    hVar3 = (i1.h) this.f192690a;
                    ResultKt.m(obj);
                    j10 = j12;
                    objN = obj;
                    cVar = (com.planner5d.library.api.c) objN;
                    if (!cVar.h()) {
                        jSONObjectA = cVar.a();
                        rVar2 = com.planner5d.library.services.r.crypted;
                        if (jSONObjectA.has(rVar2.f224891a)) {
                            map = this.f192698i.f192574l;
                            pVar2 = this.f192698i;
                            synchronized (map) {
                                Map map3 = pVar2.f192574l;
                                Long lG = kotlin.coroutines.jvm.internal.b.g(System.currentTimeMillis());
                                ?? string = cVar.a().getString(rVar2.f224891a);
                                hVar3.f312751a = string;
                                Unit unit2 = Unit.f312394a;
                            }
                            hVar = hVar3;
                            jA = j10;
                            p pVar6 = this.f192698i;
                            String str6 = (String) hVar.f312751a;
                            com.planner5d.library.model.payments.a aVar6 = this.f192697h;
                            this.f192690a = null;
                            this.f192691b = null;
                            this.f192695f = 5;
                            objU = pVar6.U(str6, aVar6, jA, this);
                            if (objU != objL) {
                                return objU;
                            }
                        }
                        return objL;
                    }
                    pVar = this.f192698i;
                    aVar2 = this.f192697h;
                    exc = new Exception("No data");
                    this.f192690a = null;
                    this.f192691b = null;
                    this.f192695f = 4;
                    if (pVar.P(aVar2, exc, this) != objL) {
                        return objL;
                    }
                } else {
                    if (i10 == 3) {
                        Throwable th3 = (Throwable) this.f192690a;
                        ResultKt.m(obj);
                        throw th3;
                    }
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                        return obj;
                    }
                    ResultKt.m(obj);
                }
                return null;
                id.a aVar7 = this.f192696g;
                this.f192690a = hVar2;
                this.f192691b = str;
                this.f192692c = null;
                this.f192693d = null;
                this.f192694e = j10;
                this.f192695f = 2;
                objN = rVar.n(aVar, (fd.f) objW, aVar7, null, this);
                if (objN != objL) {
                    str2 = str;
                    hVar3 = hVar2;
                    cVar = (com.planner5d.library.api.c) objN;
                    if (!cVar.h()) {
                        jSONObjectA = cVar.a();
                        rVar2 = com.planner5d.library.services.r.crypted;
                        if (jSONObjectA.has(rVar2.f224891a)) {
                            map = this.f192698i.f192574l;
                            pVar2 = this.f192698i;
                            synchronized (map) {
                                Map map4 = pVar2.f192574l;
                                Long lG2 = kotlin.coroutines.jvm.internal.b.g(System.currentTimeMillis());
                                ?? string2 = cVar.a().getString(rVar2.f224891a);
                                hVar3.f312751a = string2;
                                Unit unit3 = Unit.f312394a;
                                hVar = hVar3;
                                jA = j10;
                                p pVar7 = this.f192698i;
                                String str7 = (String) hVar.f312751a;
                                com.planner5d.library.model.payments.a aVar8 = this.f192697h;
                                this.f192690a = null;
                                this.f192691b = null;
                                this.f192695f = 5;
                                objU = pVar7.U(str7, aVar8, jA, this);
                                if (objU != objL) {
                                    return objU;
                                }
                            }
                        }
                    }
                    pVar = this.f192698i;
                    aVar2 = this.f192697h;
                    exc = new Exception("No data");
                    this.f192690a = null;
                    this.f192691b = null;
                    this.f192695f = 4;
                    if (pVar.P(aVar2, exc, this) != objL) {
                        return null;
                    }
                }
            } catch (Throwable th4) {
                if (th4 instanceof CancellationException) {
                    throw th4;
                }
                p pVar8 = this.f192698i;
                com.planner5d.library.model.payments.a aVar9 = this.f192697h;
                this.f192690a = th4;
                this.f192691b = null;
                this.f192692c = null;
                this.f192693d = null;
                this.f192695f = 3;
                if (pVar8.P(aVar9, th4, this) != objL) {
                    throw th4;
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((e0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getPayment$2", f = "PaymentsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Payment>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192699a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f192701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f192701c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new f(this.f192701c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192699a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return p.this.f192568f.f(this.f192701c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Payment> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$verifyLicense$2", f = "PaymentsRepository.kt", i = {0}, l = {105, 109, com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {"info"}, s = {"L$0"})
    static final class f0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192705d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f192707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f192708g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f192709h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str, String str2, String str3, kotlin.coroutines.d<? super f0> dVar) {
            super(2, dVar);
            this.f192707f = str;
            this.f192708g = str2;
            this.f192709h = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new f0(this.f192707f, this.f192708g, this.f192709h, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00fe, code lost:
        
            if (r13 == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws com.planner5d.library.services.exceptions.ErrorMessageException, org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 401
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getPaymentsWithOrders$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getPaymentsWithOrders$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getPaymentsWithOrders$2\n*L\n444#1:551,8\n*E\n"})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.manager.payments.t>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192712c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getPaymentsWithOrders$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getPaymentsWithOrders$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n444#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.manager.payments.t>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192714a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192715b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192716c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192717d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192718e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192719f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192720g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar) {
                super(2, dVar);
                this.f192718e = aVar;
                this.f192719f = obj;
                this.f192720g = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192718e, this.f192719f, dVar, this.f192720g);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192717d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192718e;
                    Object obj3 = this.f192719f;
                    this.f192714a = aVar;
                    this.f192715b = obj3;
                    this.f192717d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192715b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192714a;
                    ResultKt.m(obj);
                }
                try {
                    com.planner5d.library.model.manager.payments.t tVarJ = this.f192720g.f192568f.j((com.planner5d.library.model.payments.paymentmethod.e) this.f192720g.f192569g.get());
                    aVar.i(obj2);
                    return tVarJ;
                } catch (Throwable th2) {
                    aVar.i(obj2);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.manager.payments.t> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new g(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00bd A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p pVar;
            kotlinx.coroutines.sync.a aVar;
            kotlinx.coroutines.sync.a aVar2;
            Object objH;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192712c;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                kotlinx.coroutines.sync.a aVarZ = p.this.z();
                pVar = p.this;
                p2.a aVar3 = p2.f229701c;
                this.f192710a = aVarZ;
                this.f192711b = pVar;
                this.f192712c = 1;
                Object objB = aVar3.b(aVarZ, this);
                if (objB != objL) {
                    aVar = aVarZ;
                    obj = objB;
                }
                return objL;
            }
            if (i10 == 1) {
                pVar = (p) this.f192711b;
                aVar = (kotlinx.coroutines.sync.a) this.f192710a;
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    ResultKt.m(obj);
                    return obj;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                pVar = (p) this.f192711b;
                aVar2 = (kotlinx.coroutines.sync.a) this.f192710a;
                ResultKt.m(obj);
            }
            a aVar4 = new a(aVar2, null, null, pVar);
            this.f192710a = null;
            this.f192711b = null;
            this.f192712c = 4;
            objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar4, this);
            if (objH != objL) {
                return objL;
            }
            return objH;
            if (((Boolean) obj).booleanValue()) {
                this.f192710a = pVar;
                this.f192711b = null;
                this.f192712c = 2;
                com.planner5d.library.model.manager.payments.t tVarJ = pVar.f192568f.j((com.planner5d.library.model.payments.paymentmethod.e) pVar.f192569g.get());
                if (tVarJ != objL) {
                    return tVarJ;
                }
            } else {
                p2.a aVar5 = p2.f229701c;
                this.f192710a = aVar;
                this.f192711b = pVar;
                this.f192712c = 3;
                obj = aVar5.a(aVar, this);
                if (obj != objL) {
                    aVar2 = aVar;
                    a aVar6 = new a(aVar2, null, null, pVar);
                    this.f192710a = null;
                    this.f192711b = null;
                    this.f192712c = 4;
                    objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar6, this);
                    if (objH != objL) {
                        return objH;
                    }
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.manager.payments.t> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository", f = "PaymentsRepository.kt", i = {0, 0}, l = {138, 138}, m = "getPurchasedStatus", n = {"this", "user"}, s = {"L$0", "L$1"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192723c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192725e;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192723c = obj;
            this.f192725e |= Integer.MIN_VALUE;
            return p.this.B(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getPurchasedStatus$2", f = "PaymentsRepository.kt", i = {1}, l = {143, com.planner5d.library.engine.input.f.b.F1, com.planner5d.library.engine.input.f.b.H1}, m = "invokeSuspend", n = {"nonce"}, s = {"L$0"})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super fd.o>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f192727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f192728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f192729d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(id.a aVar, p pVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f192728c = aVar;
            this.f192729d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f192728c, this.f192729d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x009a A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:33:0x0090, B:35:0x009a, B:30:0x005d, B:22:0x003c, B:27:0x0048), top: B:55:0x003c }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            i iVar;
            String strB;
            String str;
            com.planner5d.library.api.c cVar;
            Object objJ;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192727b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    try {
                        if (this.f192728c == null) {
                            return fd.o.f275196f.b();
                        }
                        com.planner5d.library.model.manager.payments.r rVar = this.f192729d.f192571i;
                        this.f192727b = 1;
                        obj = rVar.k("active", this);
                        if (obj == objL) {
                        }
                        return objL;
                    } catch (Throwable th3) {
                        th = th3;
                        iVar = this;
                        th2 = th;
                        if (!iVar.f192729d.f192567e.isNetworkError(iVar.f192729d.f192563a, th2)) {
                            iVar.f192729d.f192566d.b("purchased_status", null, th2);
                        }
                        if (th2 instanceof CancellationException) {
                            throw th2;
                        }
                        return null;
                    }
                }
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                        return obj;
                    }
                    strB = (String) this.f192726a;
                    ResultKt.m(obj);
                }
                str = strB;
                cVar = (com.planner5d.library.api.c) obj;
                if (!cVar.h()) {
                    p pVar = this.f192729d;
                    JSONObject jSONObjectA = cVar.a();
                    long j10 = this.f192728c.f287075a;
                    this.f192726a = null;
                    this.f192727b = 3;
                    iVar = this;
                    try {
                        objJ = pVar.J(jSONObjectA, j10, str, iVar);
                        if (objJ != objL) {
                            return objL;
                        }
                        return objJ;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        if (!iVar.f192729d.f192567e.isNetworkError(iVar.f192729d.f192563a, th2)) {
                            iVar.f192729d.f192566d.b("purchased_status", null, th2);
                        }
                        if (th2 instanceof CancellationException) {
                            throw th2;
                        }
                        return null;
                    }
                }
                return null;
                JSONObject jSONObject = (JSONObject) obj;
                strB = com.planner5d.library.services.utility.e0.b();
                Intrinsics.checkNotNullExpressionValue(strB, "createNonce(...)");
                jSONObject.put(com.planner5d.library.services.r.uid.f224891a, this.f192728c.f287075a);
                jSONObject.put(com.planner5d.library.services.r.nonce.f224891a, strB);
                com.planner5d.library.model.manager.payments.r rVar2 = this.f192729d.f192571i;
                this.f192726a = strB;
                this.f192727b = 2;
                obj = rVar2.o(jSONObject, this);
                if (obj != objL) {
                    str = strB;
                    cVar = (com.planner5d.library.api.c) obj;
                    if (!cVar.h()) {
                        p pVar2 = this.f192729d;
                        JSONObject jSONObjectA2 = cVar.a();
                        long j11 = this.f192728c.f287075a;
                        this.f192726a = null;
                        this.f192727b = 3;
                        iVar = this;
                        objJ = pVar2.J(jSONObjectA2, j11, str, iVar);
                        if (objJ != objL) {
                            return objJ;
                        }
                    }
                    return null;
                }
                return objL;
            } catch (Throwable th5) {
                th2 = th5;
                iVar = this;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super fd.o> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getUnconsumedFinishedOrders$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getUnconsumedFinishedOrders$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getUnconsumedFinishedOrders$2\n*L\n297#1:551,8\n*E\n"})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192733d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Payment.b f192735f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getUnconsumedFinishedOrders$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$getUnconsumedFinishedOrders$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n297#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192736a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192737b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192738c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192739d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192740e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192741f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192742g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Payment.b f192743h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, Payment.b bVar) {
                super(2, dVar);
                this.f192740e = aVar;
                this.f192741f = obj;
                this.f192742g = pVar;
                this.f192743h = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192740e, this.f192741f, dVar, this.f192742g, this.f192743h);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192739d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192740e;
                    Object obj3 = this.f192741f;
                    this.f192736a = aVar;
                    this.f192737b = obj3;
                    this.f192739d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192737b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192736a;
                    ResultKt.m(obj);
                }
                try {
                    return this.f192742g.f192568f.l(this.f192743h);
                } finally {
                    aVar.i(obj2);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Payment.b bVar, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f192735f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new j(this.f192735f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00be A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.sync.a aVar;
            p pVar;
            Payment.b bVar;
            p pVar2;
            kotlinx.coroutines.sync.a aVar2;
            Object objH;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192733d;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                kotlinx.coroutines.sync.a aVarZ = p.this.z();
                p pVar3 = p.this;
                Payment.b bVar2 = this.f192735f;
                p2.a aVar3 = p2.f229701c;
                this.f192730a = aVarZ;
                this.f192731b = pVar3;
                this.f192732c = bVar2;
                this.f192733d = 1;
                Object objB = aVar3.b(aVarZ, this);
                if (objB != objL) {
                    aVar = aVarZ;
                    obj = objB;
                    pVar = pVar3;
                    bVar = bVar2;
                }
                return objL;
            }
            if (i10 == 1) {
                bVar = (Payment.b) this.f192732c;
                pVar = (p) this.f192731b;
                aVar = (kotlinx.coroutines.sync.a) this.f192730a;
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    ResultKt.m(obj);
                    return obj;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                bVar = (Payment.b) this.f192732c;
                p pVar4 = (p) this.f192731b;
                kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) this.f192730a;
                ResultKt.m(obj);
                pVar2 = pVar4;
                aVar2 = aVar4;
            }
            a aVar5 = new a(aVar2, null, null, pVar2, bVar);
            this.f192730a = null;
            this.f192731b = null;
            this.f192732c = null;
            this.f192733d = 4;
            objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar5, this);
            if (objH != objL) {
                return objL;
            }
            return objH;
            if (((Boolean) obj).booleanValue()) {
                this.f192730a = pVar;
                this.f192731b = bVar;
                this.f192732c = null;
                this.f192733d = 2;
                Object objL2 = pVar.f192568f.l(bVar);
                if (objL2 != objL) {
                    return objL2;
                }
            } else {
                p2.a aVar6 = p2.f229701c;
                this.f192730a = aVar;
                this.f192731b = pVar;
                this.f192732c = bVar;
                this.f192733d = 3;
                obj = aVar6.a(aVar, this);
                if (obj != objL) {
                    pVar2 = pVar;
                    aVar2 = aVar;
                    a aVar7 = new a(aVar2, null, null, pVar2, bVar);
                    this.f192730a = null;
                    this.f192731b = null;
                    this.f192732c = null;
                    this.f192733d = 4;
                    objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar7, this);
                    if (objH != objL) {
                        return objH;
                    }
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository", f = "PaymentsRepository.kt", i = {0}, l = {53, 61, 61}, m = "getUserUsingOrders", n = {"this"}, s = {"L$0"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192745b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192747d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192745b = obj;
            this.f192747d |= Integer.MIN_VALUE;
            return p.this.E(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$getUserUsingOrders$3", f = "PaymentsRepository.kt", i = {}, l = {70, 76}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super id.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192748a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ fd.a f192750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(fd.a aVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f192750c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new l(this.f192750c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
        
            if (r7 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super id.a> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$hasActive$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$hasActive$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$hasActive$2\n*L\n381#1:551,8\n*E\n"})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192754d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192756f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$hasActive$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$hasActive$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n381#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192758b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192759c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192760d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192761e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192762f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192763g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192764h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, com.planner5d.library.model.payments.paymentmethod.e eVar) {
                super(2, dVar);
                this.f192761e = aVar;
                this.f192762f = obj;
                this.f192763g = pVar;
                this.f192764h = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192761e, this.f192762f, dVar, this.f192763g, this.f192764h);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192760d;
                boolean z10 = true;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192761e;
                    Object obj3 = this.f192762f;
                    this.f192757a = aVar;
                    this.f192758b = obj3;
                    this.f192760d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192758b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192757a;
                    ResultKt.m(obj);
                }
                try {
                    if (this.f192763g.f192568f.d(this.f192764h) == null) {
                        z10 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                } finally {
                    aVar.i(obj2);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.planner5d.library.model.payments.paymentmethod.e eVar, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f192756f = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new m(this.f192756f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00ca A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.sync.a aVar;
            p pVar;
            com.planner5d.library.model.payments.paymentmethod.e eVar;
            p pVar2;
            Object objH;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192754d;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                kotlinx.coroutines.sync.a aVarZ = p.this.z();
                p pVar3 = p.this;
                com.planner5d.library.model.payments.paymentmethod.e eVar2 = this.f192756f;
                p2.a aVar2 = p2.f229701c;
                this.f192751a = aVarZ;
                this.f192752b = pVar3;
                this.f192753c = eVar2;
                this.f192754d = 1;
                Object objB = aVar2.b(aVarZ, this);
                if (objB != objL) {
                    aVar = aVarZ;
                    obj = objB;
                    pVar = pVar3;
                    eVar = eVar2;
                }
                return objL;
            }
            if (i10 == 1) {
                eVar = (com.planner5d.library.model.payments.paymentmethod.e) this.f192753c;
                pVar = (p) this.f192752b;
                aVar = (kotlinx.coroutines.sync.a) this.f192751a;
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    ResultKt.m(obj);
                    return obj;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                eVar = (com.planner5d.library.model.payments.paymentmethod.e) this.f192753c;
                p pVar4 = (p) this.f192752b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f192751a;
                ResultKt.m(obj);
                pVar2 = pVar4;
                aVar = aVar3;
            }
            a aVar4 = new a(aVar, null, null, pVar2, eVar);
            this.f192751a = null;
            this.f192752b = null;
            this.f192753c = null;
            this.f192754d = 4;
            objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar4, this);
            if (objH != objL) {
                return objL;
            }
            return objH;
            if (((Boolean) obj).booleanValue()) {
                this.f192751a = pVar;
                this.f192752b = eVar;
                this.f192753c = null;
                this.f192754d = 2;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(pVar.f192568f.d(eVar) != null);
                if (boolA != objL) {
                    return boolA;
                }
            } else {
                p2.a aVar5 = p2.f229701c;
                this.f192751a = aVar;
                this.f192752b = pVar;
                this.f192753c = eVar;
                this.f192754d = 3;
                obj = aVar5.a(aVar, this);
                if (obj != objL) {
                    pVar2 = pVar;
                    a aVar6 = new a(aVar, null, null, pVar2, eVar);
                    this.f192751a = null;
                    this.f192752b = null;
                    this.f192753c = null;
                    this.f192754d = 4;
                    objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar6, this);
                    if (objH != objL) {
                        return objH;
                    }
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$isPaymentConsumed$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$isPaymentConsumed$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$isPaymentConsumed$2\n*L\n309#1:551,8\n*E\n"})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192768d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192770f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$isPaymentConsumed$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$isPaymentConsumed$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n309#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192771a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192772b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192773c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192774d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192775e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192776f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192777g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.a f192778h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, com.planner5d.library.model.payments.a aVar2) {
                super(2, dVar);
                this.f192775e = aVar;
                this.f192776f = obj;
                this.f192777g = pVar;
                this.f192778h = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192775e, this.f192776f, dVar, this.f192777g, this.f192778h);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192774d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192775e;
                    Object obj3 = this.f192776f;
                    this.f192771a = aVar;
                    this.f192772b = obj3;
                    this.f192774d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192772b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192771a;
                    ResultKt.m(obj);
                }
                try {
                    Payment paymentG = this.f192777g.f192568f.g(this.f192778h);
                    return kotlin.coroutines.jvm.internal.b.a(paymentG != null ? paymentG.H() : false);
                } finally {
                    aVar.i(obj2);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(com.planner5d.library.model.payments.a aVar, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f192770f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new n(this.f192770f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00cb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.sync.a aVar;
            p pVar;
            com.planner5d.library.model.payments.a aVar2;
            p pVar2;
            kotlinx.coroutines.sync.a aVar3;
            Object objH;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192768d;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                kotlinx.coroutines.sync.a aVarZ = p.this.z();
                p pVar3 = p.this;
                com.planner5d.library.model.payments.a aVar4 = this.f192770f;
                p2.a aVar5 = p2.f229701c;
                this.f192765a = aVarZ;
                this.f192766b = pVar3;
                this.f192767c = aVar4;
                this.f192768d = 1;
                Object objB = aVar5.b(aVarZ, this);
                if (objB != objL) {
                    aVar = aVarZ;
                    obj = objB;
                    pVar = pVar3;
                    aVar2 = aVar4;
                }
                return objL;
            }
            if (i10 == 1) {
                aVar2 = (com.planner5d.library.model.payments.a) this.f192767c;
                pVar = (p) this.f192766b;
                aVar = (kotlinx.coroutines.sync.a) this.f192765a;
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    ResultKt.m(obj);
                    return obj;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                aVar2 = (com.planner5d.library.model.payments.a) this.f192767c;
                p pVar4 = (p) this.f192766b;
                kotlinx.coroutines.sync.a aVar6 = (kotlinx.coroutines.sync.a) this.f192765a;
                ResultKt.m(obj);
                pVar2 = pVar4;
                aVar3 = aVar6;
            }
            a aVar7 = new a(aVar3, null, null, pVar2, aVar2);
            this.f192765a = null;
            this.f192766b = null;
            this.f192767c = null;
            this.f192768d = 4;
            objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar7, this);
            if (objH != objL) {
                return objL;
            }
            return objH;
            if (((Boolean) obj).booleanValue()) {
                this.f192765a = pVar;
                this.f192766b = aVar2;
                this.f192767c = null;
                this.f192768d = 2;
                Payment paymentG = pVar.f192568f.g(aVar2);
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(paymentG != null ? paymentG.H() : false);
                if (boolA != objL) {
                    return boolA;
                }
            } else {
                p2.a aVar8 = p2.f229701c;
                this.f192765a = aVar;
                this.f192766b = pVar;
                this.f192767c = aVar2;
                this.f192768d = 3;
                obj = aVar8.a(aVar, this);
                if (obj != objL) {
                    pVar2 = pVar;
                    aVar3 = aVar;
                    a aVar9 = new a(aVar3, null, null, pVar2, aVar2);
                    this.f192765a = null;
                    this.f192766b = null;
                    this.f192767c = null;
                    this.f192768d = 4;
                    objH = kotlinx.coroutines.i.h((CoroutineContext) obj, aVar9, this);
                    if (objH != objL) {
                        return objH;
                    }
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository", f = "PaymentsRepository.kt", i = {}, l = {166}, m = "parsePurchaseStatus", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192780b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192782d;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192780b = obj;
            this.f192782d |= Integer.MIN_VALUE;
            return p.this.J(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.payments.p$p, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$paymentStart$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0, 1, 1}, l = {265, 268}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:271\n302#3,3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:271,2\n*E\n"})
    public static final class C1603p extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Payment>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f192787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f192788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f192789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192790h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ fd.f f192791i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1603p(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, com.planner5d.library.model.payments.paymentmethod.e eVar, fd.f fVar) {
            super(2, dVar);
            this.f192787e = aVar;
            this.f192788f = obj;
            this.f192789g = pVar;
            this.f192790h = eVar;
            this.f192791i = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1603p(this.f192787e, this.f192788f, dVar, this.f192789g, this.f192790h, this.f192791i);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object obj3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192786d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192787e;
                    obj2 = this.f192788f;
                    this.f192783a = aVar;
                    this.f192784b = obj2;
                    this.f192786d = 1;
                    if (aVar.h(obj2, this) == objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f192784b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f192783a;
                    try {
                        ResultKt.m(obj);
                        aVar2.i(obj3);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(obj3);
                        throw th2;
                    }
                }
                obj2 = this.f192784b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f192783a;
                ResultKt.m(obj);
                aVar = aVar3;
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                r rVar = this.f192789g.new r(this.f192790h, this.f192791i, null);
                this.f192783a = aVar;
                this.f192784b = obj2;
                this.f192786d = 2;
                Object objH = kotlinx.coroutines.i.h(z1VarH, rVar, this);
                if (objH != objL) {
                    kotlinx.coroutines.sync.a aVar4 = aVar;
                    obj = objH;
                    aVar2 = aVar4;
                    obj3 = obj2;
                    aVar2.i(obj3);
                    return obj;
                }
                return objL;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar5 = aVar;
                th2 = th4;
                aVar2 = aVar5;
                obj3 = obj2;
                aVar2.i(obj3);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Payment> dVar) {
            return ((C1603p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository", f = "PaymentsRepository.kt", i = {0, 0, 0, 0, 2, 2, 2, 2}, l = {552, 302, 555, 555}, m = "paymentStart", n = {"this", "method", "product", "$receiver$iv", "this", "method", "product", "$receiver$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192796e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192798g;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192796e = obj;
            this.f192798g |= Integer.MIN_VALUE;
            return p.this.K(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$paymentStart$2$1", f = "PaymentsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Payment>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192799a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fd.f f192802d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(com.planner5d.library.model.payments.paymentmethod.e eVar, fd.f fVar, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f192801c = eVar;
            this.f192802d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new r(this.f192801c, this.f192802d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192799a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return p.this.f192568f.c(this.f192801c, this.f192802d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Payment> dVar) {
            return ((r) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$process$2", f = "PaymentsRepository.kt", i = {0, 0, 1, 2, 2, 3, 3}, l = {263, 268, com.badlogic.gdx.utils.compression.lzma.a.f95331z, 274}, m = "invokeSuspend", n = {"destination$iv$iv", MetricConsts.Install, "result", "result", "map", "result", "map"}, s = {"L$1", "L$3", "L$0", "L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$process$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1611#2,9:551\n1863#2:560\n1864#2:562\n1620#2:563\n1863#2,2:564\n1#3:561\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$process$2\n*L\n262#1:551,9\n262#1:560\n262#1:562\n262#1:563\n269#1:564,2\n262#1:561\n*E\n"})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends com.planner5d.library.model.payments.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<fd.c> f192809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p f192810h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ id.a f192811i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(List<fd.c> list, p pVar, id.a aVar, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f192809g = list;
            this.f192810h = pVar;
            this.f192811i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new s(this.f192809g, this.f192810h, this.f192811i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends com.planner5d.library.model.payments.a>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:38:0x010c  */
        /* JADX WARN: Code duplicated, block: B:40:0x0117  */
        /* JADX WARN: Code duplicated, block: B:42:0x0124  */
        /* JADX WARN: Code duplicated, block: B:45:0x013b A[PHI: r1 r4 r7 r8 r13 r15
          0x013b: PHI (r1v12 java.util.Iterator) = (r1v11 java.util.Iterator), (r1v13 java.util.Iterator) binds: [B:41:0x0122, B:39:0x0111] A[DONT_GENERATE, DONT_INLINE]
          0x013b: PHI (r4v8 java.util.List) = (r4v5 java.util.List), (r4v10 java.util.List) binds: [B:41:0x0122, B:39:0x0111] A[DONT_GENERATE, DONT_INLINE]
          0x013b: PHI (r7v10 com.planner5d.library.model.manager.payments.p) = (r7v7 com.planner5d.library.model.manager.payments.p), (r7v12 com.planner5d.library.model.manager.payments.p) binds: [B:41:0x0122, B:39:0x0111] A[DONT_GENERATE, DONT_INLINE]
          0x013b: PHI (r8v8 id.a) = (r8v5 id.a), (r8v10 id.a) binds: [B:41:0x0122, B:39:0x0111] A[DONT_GENERATE, DONT_INLINE]
          0x013b: PHI (r13v2 com.planner5d.library.model.manager.payments.p$s) = (r13v0 com.planner5d.library.model.manager.payments.p$s), (r13v3 com.planner5d.library.model.manager.payments.p$s) binds: [B:41:0x0122, B:39:0x0111] A[DONT_GENERATE, DONT_INLINE]
          0x013b: PHI (r15v19 com.planner5d.library.model.manager.payments.t) = (r15v18 com.planner5d.library.model.manager.payments.t), (r15v21 com.planner5d.library.model.manager.payments.t) binds: [B:41:0x0122, B:39:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x013d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0087 -> B:20:0x008b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0122 -> B:45:0x013b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>> dVar) {
            return ((s) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository", f = "PaymentsRepository.kt", i = {0}, l = {284}, m = "process", n = {"orderWithState"}, s = {"L$0"})
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192813b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192815d;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192813b = obj;
            this.f192815d |= Integer.MIN_VALUE;
            return p.this.L(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setFinished$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0, 1, 1}, l = {265, 268}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:270\n341#3:268\n377#3:269\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:270,2\n*E\n"})
    public static final class u extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f192820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f192821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Throwable f192822g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p f192823h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Long f192824i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192825j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, Throwable th2, p pVar, Long l10, com.planner5d.library.model.payments.a aVar2) {
            super(2, dVar);
            this.f192820e = aVar;
            this.f192821f = obj;
            this.f192822g = th2;
            this.f192823h = pVar;
            this.f192824i = l10;
            this.f192825j = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new u(this.f192820e, this.f192821f, dVar, this.f192822g, this.f192823h, this.f192824i, this.f192825j);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192819d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192820e;
                    obj2 = this.f192821f;
                    this.f192816a = aVar;
                    this.f192817b = obj2;
                    this.f192819d = 1;
                    if (aVar.h(obj2, this) == objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192817b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f192816a;
                    try {
                        ResultKt.m(obj);
                        Unit unit = Unit.f312394a;
                        aVar2.i(obj2);
                        return unit;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(obj2);
                        throw th2;
                    }
                }
                obj2 = this.f192817b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f192816a;
                ResultKt.m(obj);
                aVar = aVar3;
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                w wVar = new w(this.f192822g, this.f192823h, this.f192824i, this.f192825j, null);
                this.f192816a = aVar;
                this.f192817b = obj2;
                this.f192819d = 2;
                if (kotlinx.coroutines.i.h(z1VarH, wVar, this) != objL) {
                    aVar2 = aVar;
                    Unit unit2 = Unit.f312394a;
                    aVar2.i(obj2);
                    return unit2;
                }
                return objL;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar4 = aVar;
                th2 = th4;
                aVar2 = aVar4;
                aVar2.i(obj2);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((u) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository", f = "PaymentsRepository.kt", i = {0, 0, 0, 0, 0, 2, 2, 2, 2, 2}, l = {552, com.facebook.internal.p.f100031o, 555, 555}, m = "setFinished", n = {"this", "order", "error", "id", "$receiver$iv", "this", "order", "error", "id", "$receiver$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192831f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192833h;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192831f = obj;
            this.f192833h |= Integer.MIN_VALUE;
            return p.this.N(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setFinished$2$1", f = "PaymentsRepository.kt", i = {0}, l = {344}, m = "invokeSuspend", n = {"processedError"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setFinished$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
    static final class w extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f192835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f192836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f192837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Long f192838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192839f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Throwable th2, p pVar, Long l10, com.planner5d.library.model.payments.a aVar, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f192836c = th2;
            this.f192837d = pVar;
            this.f192838e = l10;
            this.f192839f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new w(this.f192836c, this.f192837d, this.f192838e, this.f192839f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable iOException;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192835b;
            if (i10 == 0) {
                ResultKt.m(obj);
                Throwable th2 = this.f192836c;
                p pVar = this.f192837d;
                Long l10 = this.f192838e;
                if (l10 == null) {
                    throw new RuntimeException("Payment not created");
                }
                long jLongValue = l10.longValue();
                this.f192834a = th2;
                this.f192835b = 1;
                Object objY = pVar.y(jLongValue, this);
                if (objY == objL) {
                    return objL;
                }
                iOException = th2;
                obj = objY;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iOException = (Throwable) this.f192834a;
                ResultKt.m(obj);
            }
            if (((Payment) obj).J()) {
                obj = null;
            }
            Payment payment = (Payment) obj;
            if (payment == null) {
                throw new RuntimeException("Payment already finished");
            }
            boolean zK = payment.K();
            if (zK && iOException != null) {
                try {
                    com.planner5d.library.model.payments.a aVar = this.f192839f;
                    if (aVar == null || !Intrinsics.areEqual(aVar, payment.s())) {
                        iOException = new IOException("Invalid pending payment");
                    }
                } catch (JSONException unused) {
                    iOException = new IOException("Failed to create pending payment");
                }
            }
            payment.N(new Date());
            if (iOException != null) {
                ErrorMessageException errorMessageExceptionExtract = ErrorMessageException.extract(iOException);
                if (errorMessageExceptionExtract != null) {
                    payment.P(errorMessageExceptionExtract.getMessageRaw(this.f192837d.f192563a));
                } else {
                    payment.P(iOException.getMessage());
                }
            }
            if (payment.L() || zK) {
                payment.W((iOException == null ? Payment.b.Finished : Payment.b.Failed).n());
            }
            if (!zK) {
                try {
                    payment.T(this.f192839f);
                } catch (JSONException e10) {
                    throw new RuntimeException(e10);
                }
            }
            this.f192837d.f192568f.n(payment);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setFinishedActive$2", f = "PaymentsRepository.kt", i = {0, 4}, l = {552, 431, 436, 438, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setFinishedActive$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setFinishedActive$2\n*L\n421#1:551,8\n*E\n"})
    static final class x extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f192846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192847h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192849j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192850k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f192851l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ id.a f192852m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Throwable f192853n;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setFinishedActive$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {265, 277, 282, 284}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setFinishedActive$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:286\n422#3,18:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:286,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192854a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192855b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192856c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192857d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192858e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192859f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192860g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.paymentmethod.e f192861h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.a f192862i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f192863j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ id.a f192864k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Throwable f192865l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, com.planner5d.library.model.payments.paymentmethod.e eVar, com.planner5d.library.model.payments.a aVar2, boolean z10, id.a aVar3, Throwable th2) {
                super(2, dVar);
                this.f192858e = aVar;
                this.f192859f = obj;
                this.f192860g = pVar;
                this.f192861h = eVar;
                this.f192862i = aVar2;
                this.f192863j = z10;
                this.f192864k = aVar3;
                this.f192865l = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192858e, this.f192859f, dVar, this.f192860g, this.f192861h, this.f192862i, this.f192863j, this.f192864k, this.f192865l);
            }

            /* JADX WARN: Code duplicated, block: B:49:0x0109  */
            /* JADX WARN: Code duplicated, block: B:50:0x010a A[Catch: all -> 0x0098, PHI: r1 r2 r14
              0x010a: PHI (r1v8 java.lang.Object) = (r1v5 java.lang.Object), (r1v15 java.lang.Object) binds: [B:48:0x0107, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]
              0x010a: PHI (r2v5 java.lang.Object) = (r2v3 java.lang.Object), (r2v9 java.lang.Object) binds: [B:48:0x0107, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]
              0x010a: PHI (r14v13 kotlinx.coroutines.sync.a) = (r14v8 kotlinx.coroutines.sync.a), (r14v22 kotlinx.coroutines.sync.a) binds: [B:48:0x0107, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x0098, blocks: (B:50:0x010a, B:53:0x0117, B:47:0x00ef, B:46:0x00d9, B:29:0x0082, B:31:0x0090, B:33:0x0094, B:36:0x00a0, B:51:0x010e, B:52:0x0116), top: B:72:0x0082 }] */
            /* JADX WARN: Code duplicated, block: B:57:0x0130  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Throwable th2;
                kotlinx.coroutines.sync.a aVar2;
                Object obj3;
                Payment paymentD;
                kotlinx.coroutines.sync.a aVar3;
                Unit unit;
                fd.f[] fVarArr;
                Object objK;
                p pVar;
                com.planner5d.library.model.payments.a aVar4;
                Throwable th3;
                Long id2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192857d;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        aVar = this.f192858e;
                        obj2 = this.f192859f;
                        this.f192854a = aVar;
                        this.f192855b = obj2;
                        this.f192857d = 1;
                        if (aVar.h(obj2, this) != objL) {
                        }
                        return objL;
                    }
                    if (i10 != 1) {
                        if (i10 == 2) {
                            obj2 = this.f192855b;
                            aVar3 = (kotlinx.coroutines.sync.a) this.f192854a;
                            try {
                                ResultKt.m(obj);
                                kotlinx.coroutines.sync.a aVar5 = aVar3;
                                fVarArr = (fd.f[]) obj;
                                aVar = aVar5;
                            } catch (Throwable th4) {
                                kotlinx.coroutines.sync.a aVar6 = aVar3;
                                th = th4;
                                aVar = aVar6;
                                this.f192860g.f192566d.b("payment_finished_failed", this.f192862i.f222476b, th);
                                fVarArr = new fd.f[0];
                            }
                            p pVar2 = this.f192860g;
                            com.planner5d.library.model.payments.paymentmethod.e eVar = this.f192861h;
                            fd.f fVar = (fd.f) ArraysKt.getOrNull(fVarArr, 0);
                            this.f192854a = aVar;
                            this.f192855b = obj2;
                            this.f192857d = 3;
                            objK = pVar2.K(eVar, fVar, this);
                            if (objK == objL) {
                                paymentD = (Payment) objK;
                                pVar = this.f192860g;
                                aVar4 = this.f192862i;
                                th3 = this.f192865l;
                                id2 = paymentD.getId();
                                this.f192854a = aVar;
                                this.f192855b = obj2;
                                this.f192857d = 4;
                                if (pVar.N(aVar4, th3, id2, this) != objL) {
                                    aVar2 = aVar;
                                    obj3 = obj2;
                                    aVar = aVar2;
                                    unit = Unit.f312394a;
                                    obj2 = obj3;
                                    aVar.i(obj2);
                                    return unit;
                                }
                            }
                            return objL;
                        }
                        if (i10 != 3) {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj3 = this.f192855b;
                            aVar2 = (kotlinx.coroutines.sync.a) this.f192854a;
                            try {
                                ResultKt.m(obj);
                                aVar = aVar2;
                                unit = Unit.f312394a;
                                obj2 = obj3;
                                aVar.i(obj2);
                                return unit;
                            } catch (Throwable th5) {
                                th2 = th5;
                                aVar2.i(obj3);
                                throw th2;
                            }
                        }
                        obj2 = this.f192855b;
                        kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) this.f192854a;
                        try {
                            ResultKt.m(obj);
                            objK = obj;
                            aVar = aVar7;
                            paymentD = (Payment) objK;
                            pVar = this.f192860g;
                            aVar4 = this.f192862i;
                            th3 = this.f192865l;
                            id2 = paymentD.getId();
                            this.f192854a = aVar;
                            this.f192855b = obj2;
                            this.f192857d = 4;
                            if (pVar.N(aVar4, th3, id2, this) != objL) {
                                aVar2 = aVar;
                                obj3 = obj2;
                                aVar = aVar2;
                                unit = Unit.f312394a;
                                obj2 = obj3;
                                aVar.i(obj2);
                                return unit;
                            }
                            return objL;
                        } catch (Throwable th6) {
                            th2 = th6;
                            obj3 = obj2;
                            aVar2 = aVar7;
                            aVar2.i(obj3);
                            throw th2;
                        }
                    }
                    obj2 = this.f192855b;
                    kotlinx.coroutines.sync.a aVar8 = (kotlinx.coroutines.sync.a) this.f192854a;
                    ResultKt.m(obj);
                    aVar = aVar8;
                    paymentD = this.f192860g.f192568f.d(this.f192861h);
                    if (paymentD == null) {
                        com.planner5d.library.model.payments.a aVar9 = this.f192862i;
                        if (aVar9 == null) {
                            unit = Unit.f312394a;
                        } else {
                            if (!this.f192863j) {
                                throw new RuntimeException("Active payment not found");
                            }
                            try {
                                com.planner5d.library.model.payments.paymentmethod.e eVar2 = this.f192861h;
                                id.a aVar10 = this.f192864k;
                                String[] strArr = {aVar9.d(com.planner5d.library.modules.user.user.x.a(aVar10)).c()};
                                this.f192854a = aVar;
                                this.f192855b = obj2;
                                this.f192857d = 2;
                                Object objH = eVar2.h(aVar10, strArr, this);
                                if (objH != objL) {
                                    aVar3 = aVar;
                                    obj = objH;
                                    kotlinx.coroutines.sync.a aVar11 = aVar3;
                                    fVarArr = (fd.f[]) obj;
                                    aVar = aVar11;
                                    p pVar3 = this.f192860g;
                                    com.planner5d.library.model.payments.paymentmethod.e eVar3 = this.f192861h;
                                    fd.f fVar2 = (fd.f) ArraysKt.getOrNull(fVarArr, 0);
                                    this.f192854a = aVar;
                                    this.f192855b = obj2;
                                    this.f192857d = 3;
                                    objK = pVar3.K(eVar3, fVar2, this);
                                    if (objK == objL) {
                                        paymentD = (Payment) objK;
                                        pVar = this.f192860g;
                                        aVar4 = this.f192862i;
                                        th3 = this.f192865l;
                                        id2 = paymentD.getId();
                                        this.f192854a = aVar;
                                        this.f192855b = obj2;
                                        this.f192857d = 4;
                                        if (pVar.N(aVar4, th3, id2, this) != objL) {
                                            aVar2 = aVar;
                                            obj3 = obj2;
                                            aVar = aVar2;
                                            unit = Unit.f312394a;
                                            obj2 = obj3;
                                        }
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                this.f192860g.f192566d.b("payment_finished_failed", this.f192862i.f222476b, th);
                                fVarArr = new fd.f[0];
                            }
                        }
                        aVar.i(obj2);
                        return unit;
                    }
                    pVar = this.f192860g;
                    aVar4 = this.f192862i;
                    th3 = this.f192865l;
                    id2 = paymentD.getId();
                    this.f192854a = aVar;
                    this.f192855b = obj2;
                    this.f192857d = 4;
                    if (pVar.N(aVar4, th3, id2, this) != objL) {
                        aVar2 = aVar;
                        obj3 = obj2;
                        aVar = aVar2;
                        unit = Unit.f312394a;
                        obj2 = obj3;
                        aVar.i(obj2);
                        return unit;
                    }
                    return objL;
                } catch (Throwable th8) {
                    kotlinx.coroutines.sync.a aVar12 = aVar;
                    th2 = th8;
                    aVar2 = aVar12;
                    obj3 = obj2;
                    aVar2.i(obj3);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(com.planner5d.library.model.payments.paymentmethod.e eVar, com.planner5d.library.model.payments.a aVar, boolean z10, id.a aVar2, Throwable th2, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.f192849j = eVar;
            this.f192850k = aVar;
            this.f192851l = z10;
            this.f192852m = aVar2;
            this.f192853n = th2;
            int i10 = 7 << 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new x(this.f192849j, this.f192850k, this.f192851l, this.f192852m, this.f192853n, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:25:0x00eb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:27:0x00f1 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:31:0x011a  */
        /* JADX WARN: Code duplicated, block: B:40:0x0150  */
        /* JADX WARN: Code duplicated, block: B:42:0x0158  */
        /* JADX WARN: Code duplicated, block: B:44:0x0162 A[PHI: r5 r7 r9 r10
          0x0162: PHI (r5v12 java.lang.Throwable) = (r5v2 java.lang.Throwable), (r5v13 java.lang.Throwable) binds: [B:24:0x00e9, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]
          0x0162: PHI (r7v13 com.planner5d.library.model.payments.a) = (r7v1 com.planner5d.library.model.payments.a), (r7v14 com.planner5d.library.model.payments.a) binds: [B:24:0x00e9, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]
          0x0162: PHI (r9v6 com.planner5d.library.model.manager.payments.p) = (r9v2 com.planner5d.library.model.manager.payments.p), (r9v8 com.planner5d.library.model.manager.payments.p) binds: [B:24:0x00e9, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]
          0x0162: PHI (r10v12 com.planner5d.library.model.payments.Payment) = (r10v6 com.planner5d.library.model.payments.Payment), (r10v14 com.planner5d.library.model.payments.Payment) binds: [B:24:0x00e9, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:48:0x017f  */
        /* JADX WARN: Code duplicated, block: B:51:0x0199  */
        /* JADX WARN: Code duplicated, block: B:57:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0179, code lost:
        
            if (r9.N(r7, r5, r0, r16) == r2) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01bd, code lost:
        
            if (kotlinx.coroutines.i.h((kotlin.coroutines.CoroutineContext) r3, r5, r16) == r2) goto L54;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((x) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setPaymentError$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentError$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentError$2\n*L\n509#1:551,8\n*E\n"})
    static final class y extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192870e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Throwable f192873h;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setPaymentError$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentError$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n509#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192874a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192875b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192876c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192877d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192878e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192879f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192880g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.a f192881h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ Throwable f192882i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, com.planner5d.library.model.payments.a aVar2, Throwable th2) {
                super(2, dVar);
                this.f192878e = aVar;
                this.f192879f = obj;
                this.f192880g = pVar;
                this.f192881h = aVar2;
                this.f192882i = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192878e, this.f192879f, dVar, this.f192880g, this.f192881h, this.f192882i);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192877d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192878e;
                    Object obj3 = this.f192879f;
                    this.f192874a = aVar;
                    this.f192875b = obj3;
                    this.f192877d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192875b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192874a;
                    ResultKt.m(obj);
                }
                try {
                    this.f192880g.f192568f.p(this.f192881h, this.f192882i);
                    Unit unit = Unit.f312394a;
                    aVar.i(obj2);
                    return unit;
                } catch (Throwable th2) {
                    aVar.i(obj2);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(com.planner5d.library.model.payments.a aVar, Throwable th2, kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
            this.f192872g = aVar;
            this.f192873h = th2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new y(this.f192872g, this.f192873h, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
        
            if (kotlin.Unit.f312394a == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
        
            if (kotlinx.coroutines.i.h((kotlin.coroutines.CoroutineContext) r4, r8, r16) == r1) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((y) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setPaymentPending$2", f = "PaymentsRepository.kt", i = {0, 2}, l = {552, 553, 555, 555}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaymentsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentPending$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,550:1\n54#2,8:551\n*S KotlinDebug\n*F\n+ 1 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentPending$2\n*L\n334#1:551,8\n*E\n"})
    static final class z extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192886d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192888f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsRepository$setPaymentPending$2$invokeSuspend$$inlined$withReentrantLock$default$1", f = "PaymentsRepository.kt", i = {0, 0}, l = {265}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsRepository.kt\ncom/planner5d/library/model/manager/payments/PaymentsRepository$setPaymentPending$2\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n334#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f192889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f192890b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f192891c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f192892d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.a f192893e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f192894f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f192895g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.payments.a f192896h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, p pVar, com.planner5d.library.model.payments.a aVar2) {
                super(2, dVar);
                this.f192893e = aVar;
                this.f192894f = obj;
                this.f192895g = pVar;
                this.f192896h = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192893e, this.f192894f, dVar, this.f192895g, this.f192896h);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.sync.a aVar;
                Object obj2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f192892d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192893e;
                    Object obj3 = this.f192894f;
                    this.f192889a = aVar;
                    this.f192890b = obj3;
                    this.f192892d = 1;
                    if (aVar.h(obj3, this) == objL) {
                        return objL;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192890b;
                    aVar = (kotlinx.coroutines.sync.a) this.f192889a;
                    ResultKt.m(obj);
                }
                try {
                    com.planner5d.library.model.manager.payments.e eVar = this.f192895g.f192568f;
                    Object obj4 = this.f192895g.f192569g.get();
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    eVar.s((com.planner5d.library.model.payments.paymentmethod.e) obj4, this.f192896h);
                    return Unit.f312394a;
                } finally {
                    aVar.i(obj2);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(com.planner5d.library.model.payments.a aVar, kotlin.coroutines.d<? super z> dVar) {
            super(2, dVar);
            this.f192888f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new z(this.f192888f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
        
            if (kotlin.Unit.f312394a == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
        
            if (kotlinx.coroutines.i.h((kotlin.coroutines.CoroutineContext) r15, r7, r14) == r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((z) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public p(@NotNull Application application, @NotNull p0 formatter, @NotNull e1 installationManager, @NotNull u1 logRecordManager, @NotNull NetworkErrorUtility networkErrorUtility, @NotNull com.planner5d.library.model.manager.payments.e paymentDao, @NotNull fg.e<com.planner5d.library.model.payments.paymentmethod.e> paymentMethod, @NotNull com.planner5d.library.model.manager.payments.v purchasedStatusCache, @NotNull com.planner5d.library.model.manager.payments.r serverDataSource, @NotNull g3 timeProvider) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(networkErrorUtility, "networkErrorUtility");
        Intrinsics.checkNotNullParameter(paymentDao, "paymentDao");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(purchasedStatusCache, "purchasedStatusCache");
        Intrinsics.checkNotNullParameter(serverDataSource, "serverDataSource");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f192563a = application;
        this.f192564b = formatter;
        this.f192565c = installationManager;
        this.f192566d = logRecordManager;
        this.f192567e = networkErrorUtility;
        this.f192568f = paymentDao;
        this.f192569g = paymentMethod;
        this.f192570h = purchasedStatusCache;
        this.f192571i = serverDataSource;
        this.f192572j = timeProvider;
        this.f192573k = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f192574l = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(fd.a aVar, kotlin.coroutines.d<? super id.a> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new l(aVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Payment H(id.a aVar, Payment payment, com.planner5d.library.model.payments.a aVar2, JSONObject jSONObject) throws JSONException {
        int iN;
        try {
            if (aVar2.d(com.planner5d.library.modules.user.user.x.a(aVar)).r()) {
                long jCurrentTimeMillis = this.f192572j.currentTimeMillis();
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.expiryTimeMillis;
                payment.W((jCurrentTimeMillis > jSONObject.getLong(rVar.f224891a) ? Payment.b.Consumed : Payment.b.Validated).n());
                payment.M(jSONObject.getBoolean(com.planner5d.library.services.r.autoRenewing.f224891a));
                payment.Q(Long.valueOf(jSONObject.getLong(rVar.f224891a)));
            } else {
                int i10 = jSONObject.getInt(com.planner5d.library.services.r.purchaseState.f224891a);
                int i11 = jSONObject.getInt(com.planner5d.library.services.r.consumptionState.f224891a);
                if (i10 == 2) {
                    iN = Payment.b.StartedAndPending.n();
                } else if (i11 == 1) {
                    iN = Payment.b.Consumed.n();
                } else {
                    iN = (i10 == 1 ? Payment.b.Consumed : Payment.b.Validated).n();
                }
                payment.W(iN);
            }
            if (Intrinsics.areEqual(aVar2.a(), com.planner5d.library.model.payments.a.f222474i)) {
                com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.orderId;
                if (jSONObject.has(rVar2.f224891a)) {
                    aVar2 = new com.planner5d.library.model.payments.a(aVar2, jSONObject.getString(rVar2.f224891a));
                }
            }
            payment.T(aVar2);
            return payment;
        } catch (com.planner5d.library.model.manager.payments.u.a unused) {
            return null;
        }
    }

    private final JSONObject I(JSONObject jSONObject) throws Exception {
        String strC;
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.crypted_full;
        if (jSONObject.has(rVar.f224891a)) {
            JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
            StringBuilder sb2 = new StringBuilder();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                sb2.append(com.planner5d.library.services.utility.e0.c(jSONArray.getString(i10)));
            }
            strC = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(strC, "toString(...)");
        } else {
            String strY = k1.y(jSONObject, com.planner5d.library.services.r.crypted, null, 4, null);
            if (strY == null) {
                strY = jSONObject.getString(com.planner5d.library.services.r.data.f224891a);
            }
            strC = com.planner5d.library.services.utility.e0.c(strY);
        }
        return new JSONObject(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J(JSONObject jSONObject, long j10, String str, kotlin.coroutines.d<? super fd.o> dVar) throws Exception {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f192782d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f192782d = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object obj = oVar.f192780b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f192782d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fd.o oVar2 = (fd.o) oVar.f192779a;
            ResultKt.m(obj);
            return oVar2;
        }
        ResultKt.m(obj);
        JSONObject jSONObjectI = I(jSONObject);
        if (jSONObjectI.getInt(com.planner5d.library.services.r.uid.f224891a) != j10 || !Intrinsics.areEqual(str, jSONObjectI.getString(com.planner5d.library.services.r.nonce.f224891a))) {
            return fd.o.f275196f.b();
        }
        fd.o oVarC = fd.o.f275196f.c(this.f192564b, jSONObjectI);
        com.planner5d.library.model.manager.payments.v vVar = this.f192570h;
        oVar.f192779a = oVarC;
        oVar.f192782d = 1;
        return vVar.f(oVarC, oVar) == objL ? objL : oVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object L(fd.c cVar, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
        t tVar;
        if (dVar instanceof t) {
            tVar = (t) dVar;
            int i10 = tVar.f192815d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f192815d = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(dVar);
            }
        } else {
            tVar = new t(dVar);
        }
        Object obj = tVar.f192813b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = tVar.f192815d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (cVar.b() != fd.b.PENDING) {
                    if (cVar.b() == fd.b.PURCHASED) {
                        return cVar.a();
                    }
                    return null;
                }
                com.planner5d.library.model.payments.a aVarA = cVar.a();
                tVar.f192812a = cVar;
                tVar.f192815d = 1;
                if (Q(aVarA, tVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (fd.c) tVar.f192812a;
                ResultKt.m(obj);
            }
            return cVar.a();
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P(com.planner5d.library.model.payments.a aVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 2 | 0;
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new y(aVar, th2, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U(String str, com.planner5d.library.model.payments.a aVar, long j10, kotlin.coroutines.d<? super Long> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new d0(str, this, aVar, j10, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Payment u(p pVar, com.planner5d.library.model.payments.a aVar) {
        return pVar.f192568f.g(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(long j10, kotlin.coroutines.d<? super Payment> dVar) throws IllegalArgumentException {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new f(j10, null), dVar);
    }

    @Nullable
    public final Object A(@NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.payments.t> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new g(null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object B(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super fd.o> dVar) {
        h hVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f192725e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f192725e = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objG = hVar.f192723c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f192725e;
        if (i11 == 0) {
            ResultKt.m(objG);
            com.planner5d.library.model.manager.payments.v vVar = this.f192570h;
            hVar.f192721a = this;
            hVar.f192722b = aVar;
            hVar.f192725e = 1;
            objG = vVar.g(hVar);
            if (objG != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objG);
            return objG;
        }
        aVar = (id.a) hVar.f192722b;
        this = (p) hVar.f192721a;
        ResultKt.m(objG);
        fd.o oVar = (fd.o) objG;
        if (oVar != null) {
            return oVar;
        }
        z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
        i iVar = new i(aVar, this, null);
        hVar.f192721a = null;
        hVar.f192722b = null;
        hVar.f192725e = 2;
        Object objH = kotlinx.coroutines.i.h(z1VarH, iVar, hVar);
        return objH == objL ? objL : objH;
    }

    @Nullable
    public final Object C(@NotNull n0 n0Var, @NotNull Payment.b bVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) {
        return kotlinx.coroutines.i.h(n0Var, new j(bVar, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object E(@NotNull kotlin.coroutines.d<? super id.a> dVar) {
        k kVar;
        Object objD;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f192747d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f192747d = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object objR = kVar.f192745b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f192747d;
        try {
            if (i11 == 0) {
                ResultKt.m(objR);
                com.planner5d.library.model.manager.payments.r rVar = this.f192571i;
                kVar.f192744a = this;
                kVar.f192747d = 1;
                if (rVar.p(null, false, kVar) == objL) {
                }
                return objL;
            }
            if (i11 == 1) {
                this = (p) kVar.f192744a;
                ResultKt.m(objR);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(objR);
                    return objR;
                }
                this = (p) kVar.f192744a;
                ResultKt.m(objR);
            }
            kVar.f192744a = null;
            kVar.f192747d = 3;
            objD = this.D((fd.a) objR, kVar);
            if (objD != objL) {
                return objL;
            }
            return objD;
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
            if (th2 instanceof CancellationException) {
                throw th2;
            }
        }
        if (com.planner5d.library.model.manager.payments.u.g(com.planner5d.library.modules.user.user.x.a(null)).length == 0) {
            return null;
        }
        kVar.f192744a = this;
        kVar.f192747d = 2;
        objR = this.r(null, kVar);
        if (objR != objL) {
            kVar.f192744a = null;
            kVar.f192747d = 3;
            objD = this.D((fd.a) objR, kVar);
            if (objD != objL) {
                return objD;
            }
        }
        return objL;
    }

    @Nullable
    public final Object F(@NotNull com.planner5d.library.model.payments.paymentmethod.e eVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new m(eVar, null), dVar);
    }

    @Nullable
    public final Object G(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new n(aVar, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object K(@NotNull com.planner5d.library.model.payments.paymentmethod.e eVar, @Nullable fd.f fVar, @NotNull kotlin.coroutines.d<? super Payment> dVar) {
        q qVar;
        kotlinx.coroutines.sync.a aVar;
        com.planner5d.library.model.payments.paymentmethod.e eVar2;
        Object obj;
        fd.f fVar2;
        p pVar;
        kotlinx.coroutines.sync.a aVar2;
        com.planner5d.library.model.payments.paymentmethod.e eVar3;
        Object objH;
        p pVar2 = this;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i10 = qVar.f192798g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f192798g = i10 - Integer.MIN_VALUE;
            } else {
                qVar = pVar2.new q(dVar);
            }
        } else {
            qVar = pVar2.new q(dVar);
        }
        Object obj2 = qVar.f192796e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = qVar.f192798g;
        if (i11 == 0) {
            ResultKt.m(obj2);
            com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
            aVar = pVar2.f192573k;
            p2.a aVar3 = p2.f229701c;
            qVar.f192792a = pVar2;
            qVar.f192793b = eVar;
            qVar.f192794c = fVar;
            qVar.f192795d = aVar;
            qVar.f192798g = 1;
            Object objB = aVar3.b(aVar, qVar);
            if (objB != objL) {
                eVar2 = eVar;
                obj = objB;
                fVar2 = fVar;
            }
            return objL;
        }
        if (i11 == 1) {
            kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) qVar.f192795d;
            fVar2 = (fd.f) qVar.f192794c;
            eVar2 = (com.planner5d.library.model.payments.paymentmethod.e) qVar.f192793b;
            p pVar3 = (p) qVar.f192792a;
            ResultKt.m(obj2);
            aVar = aVar4;
            pVar2 = pVar3;
            obj = obj2;
        } else {
            if (i11 == 2) {
                ResultKt.m(obj2);
                return obj2;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj2);
                return obj2;
            }
            kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) qVar.f192795d;
            fVar2 = (fd.f) qVar.f192794c;
            com.planner5d.library.model.payments.paymentmethod.e eVar4 = (com.planner5d.library.model.payments.paymentmethod.e) qVar.f192793b;
            p pVar4 = (p) qVar.f192792a;
            ResultKt.m(obj2);
            aVar2 = aVar5;
            eVar3 = eVar4;
            pVar = pVar4;
        }
        C1603p c1603p = new C1603p(aVar2, null, null, pVar, eVar3, fVar2);
        qVar.f192792a = null;
        qVar.f192793b = null;
        qVar.f192794c = null;
        qVar.f192795d = null;
        qVar.f192798g = 4;
        objH = kotlinx.coroutines.i.h((CoroutineContext) obj2, c1603p, qVar);
        if (objH != objL) {
            return objL;
        }
        return objH;
        if (((Boolean) obj).booleanValue()) {
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            r rVar = pVar2.new r(eVar2, fVar2, null);
            qVar.f192792a = null;
            qVar.f192793b = null;
            qVar.f192794c = null;
            qVar.f192795d = null;
            qVar.f192798g = 2;
            Object objH2 = kotlinx.coroutines.i.h(z1VarH, rVar, qVar);
            if (objH2 != objL) {
                return objH2;
            }
        } else {
            p2.a aVar6 = p2.f229701c;
            qVar.f192792a = pVar2;
            qVar.f192793b = eVar2;
            qVar.f192794c = fVar2;
            qVar.f192795d = aVar;
            qVar.f192798g = 3;
            Object objA = aVar6.a(aVar, qVar);
            if (objA != objL) {
                pVar = pVar2;
                aVar2 = aVar;
                obj2 = objA;
                eVar3 = eVar2;
                C1603p c1603p2 = new C1603p(aVar2, null, null, pVar, eVar3, fVar2);
                qVar.f192792a = null;
                qVar.f192793b = null;
                qVar.f192794c = null;
                qVar.f192795d = null;
                qVar.f192798g = 4;
                objH = kotlinx.coroutines.i.h((CoroutineContext) obj2, c1603p2, qVar);
                if (objH != objL) {
                    return objH;
                }
            }
        }
        return objL;
    }

    @Nullable
    public final Object M(@Nullable id.a aVar, @NotNull List<fd.c> list, @NotNull kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new s(list, this, aVar, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (kotlinx.coroutines.i.h(r0, r10, r2) == r3) goto L40;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(@org.jetbrains.annotations.Nullable com.planner5d.library.model.payments.a r24, @org.jetbrains.annotations.Nullable java.lang.Throwable r25, @org.jetbrains.annotations.Nullable java.lang.Long r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r27) throws java.lang.RuntimeException {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.p.N(com.planner5d.library.model.payments.a, java.lang.Throwable, java.lang.Long, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object O(@Nullable id.a aVar, @NotNull com.planner5d.library.model.payments.paymentmethod.e eVar, @Nullable com.planner5d.library.model.payments.a aVar2, @Nullable Throwable th2, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws RuntimeException {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new x(eVar, aVar2, z10, aVar, th2, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object Q(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new z(aVar, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object R(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) {
        a0 a0Var;
        if (dVar instanceof a0) {
            a0Var = (a0) dVar;
            int i10 = a0Var.f192587d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f192587d = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(dVar);
            }
        } else {
            a0Var = new a0(dVar);
        }
        Object obj = a0Var.f192585b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = a0Var.f192587d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                a0Var.f192584a = aVar;
                a0Var.f192587d = 1;
                return Q(aVar, a0Var) == objL ? objL : aVar;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.planner5d.library.model.payments.a aVar2 = (com.planner5d.library.model.payments.a) a0Var.f192584a;
            ResultKt.m(obj);
            return aVar2;
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
            return null;
        }
    }

    @Nullable
    public final Object S(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull Payment.b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b0(aVar, bVar, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object T(@NotNull n0 n0Var, @NotNull com.planner5d.library.model.payments.paymentmethod.e eVar, @NotNull com.planner5d.library.model.payments.a[] aVarArr, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(n0Var, new c0(eVar, aVarArr, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object V(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable id.a aVar2, @NotNull kotlin.coroutines.d<? super Long> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new e0(aVar2, aVar, this, null), dVar);
    }

    @Nullable
    public final Object W(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws ErrorMessageException, JSONException {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new f0(str3, str2, str, null), dVar);
    }

    @Nullable
    public final Object r(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super fd.a> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new a(aVar, null), dVar);
    }

    @Nullable
    public final Object s(@NotNull com.planner5d.library.model.payments.paymentmethod.e eVar, @Nullable id.a aVar, @NotNull final com.planner5d.library.model.payments.a aVar2, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) throws Exception {
        return t(new Function0() { // from class: com.planner5d.library.model.manager.payments.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.u(this.f192561a, aVar2);
            }
        }, eVar, aVar, aVar2, dVar);
    }

    @Nullable
    public final Object t(@NotNull Function0<Payment> function0, @NotNull com.planner5d.library.model.payments.paymentmethod.e eVar, @Nullable id.a aVar, @NotNull com.planner5d.library.model.payments.a aVar2, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) throws IllegalStateException, JSONException, com.planner5d.library.api.e {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new b(aVar, aVar2, function0, eVar, null), dVar);
    }

    @Nullable
    public final Object v(@NotNull Payment.b[] bVarArr, @NotNull kotlin.coroutines.d<? super Payment[]> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new c(bVarArr, null), dVar);
    }

    @Nullable
    public final Object w(@Nullable id.a aVar, @NotNull com.planner5d.library.model.payments.a aVar2, @NotNull kotlin.coroutines.d<? super fd.f> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new d(aVar, this, aVar2, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object x(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>> dVar) throws Throwable {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f192689e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f192689e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objA = eVar.f192687c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f192689e;
        int i12 = 7 << 2;
        if (i11 == 0) {
            ResultKt.m(objA);
            com.planner5d.library.model.payments.paymentmethod.e eVar2 = this.f192569g.get();
            eVar.f192685a = this;
            eVar.f192686b = aVar;
            eVar.f192689e = 1;
            objA = eVar2.a(eVar);
            if (objA != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objA);
            return objA;
        }
        aVar = (id.a) eVar.f192686b;
        this = (p) eVar.f192685a;
        ResultKt.m(objA);
        eVar.f192685a = null;
        eVar.f192686b = null;
        eVar.f192689e = 2;
        Object objM = this.M(aVar, (List) objA, eVar);
        return objM == objL ? objL : objM;
    }

    @NotNull
    public final kotlinx.coroutines.sync.a z() {
        return this.f192573k;
    }
}
