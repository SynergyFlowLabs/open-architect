package com.planner5d.library.model.payments.paymentmethod;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.m1;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.d0;
import com.android.billingclient.api.n;
import com.android.billingclient.api.z;
import com.planner5d.library.model.manager.payments.u;
import com.planner5d.library.model.manager.v2;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@ij.f
@SourceDebugExtension({"SMAP\nPaymentMethodGooglePlayInApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,196:1\n1611#2,9:197\n1863#2:206\n1864#2:208\n1620#2:209\n1611#2,9:220\n1863#2:229\n1864#2:231\n1620#2:232\n1#3:207\n1#3:230\n37#4,2:210\n37#4,2:233\n54#5,8:212\n*S KotlinDebug\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp\n*L\n54#1:197,9\n54#1:206\n54#1:208\n54#1:209\n111#1:220,9\n111#1:229\n111#1:231\n111#1:232\n54#1:207\n111#1:230\n54#1:210,2\n112#1:233,2\n66#1:212,8\n*E\n"})
public final class g implements com.planner5d.library.model.payments.paymentmethod.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f222527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v2 f222528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f1 f222529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f222530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.payments.paymentmethod.e.a f222531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final p<com.planner5d.library.model.payments.paymentmethod.d> f222532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f222533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c f222534h;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodGooglePlayInApp$createPurchasesUpdatedListener$1$1", f = "PaymentMethodGooglePlayInApp.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaymentMethodGooglePlayInApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp$createPurchasesUpdatedListener$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1611#2,9:197\n1863#2:206\n1864#2:208\n1620#2:209\n1#3:207\n*S KotlinDebug\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp$createPurchasesUpdatedListener$1$1\n*L\n141#1:197,9\n141#1:206\n141#1:208\n141#1:209\n141#1:207\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222535a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Purchase> f222537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f222538d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<Purchase> list, n nVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f222537c = list;
            this.f222538d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(this.f222537c, this.f222538d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222535a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p pVar = g.this.f222532f;
                List<Purchase> list = this.f222537c;
                if (list != null) {
                    g gVar = g.this;
                    arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        fd.c cVarP = gVar.p((Purchase) it.next());
                        if (cVarP != null) {
                            arrayList.add(cVarP);
                        }
                    }
                } else {
                    arrayList = null;
                }
                com.planner5d.library.model.payments.paymentmethod.d dVar = new com.planner5d.library.model.payments.paymentmethod.d(arrayList, this.f222538d.b() != 0 ? new com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d(g.this.f222527a, this.f222538d) : null);
                this.f222535a = 1;
                if (pVar.G(dVar, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodGooglePlayInApp$getOrdersCached$2", f = "PaymentMethodGooglePlayInApp.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160690g0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaymentMethodGooglePlayInApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp$getOrdersCached$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1611#2,9:197\n1863#2:206\n1864#2:208\n1620#2:209\n1#3:207\n*S KotlinDebug\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp$getOrdersCached$2\n*L\n87#1:197,9\n87#1:206\n87#1:208\n87#1:209\n87#1:207\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super List<? extends fd.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222539a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends fd.c>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<fd.c>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222539a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c cVar = g.this.f222534h;
                this.f222539a = 1;
                obj = cVar.t(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            g gVar = g.this;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                fd.c cVarP = gVar.p((Purchase) it.next());
                if (cVarP != null) {
                    arrayList.add(cVarP);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<fd.c>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodGooglePlayInApp$getOrdersPending$2", f = "PaymentMethodGooglePlayInApp.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160700j1}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaymentMethodGooglePlayInApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp$getOrdersPending$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n774#2:197\n865#2,2:198\n1611#2,9:200\n1863#2:209\n1864#2:211\n1620#2:212\n1#3:210\n*S KotlinDebug\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp$getOrdersPending$2\n*L\n94#1:197\n94#1:198,2\n95#1:200,9\n95#1:209\n95#1:211\n95#1:212\n95#1:210\n*E\n"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super List<? extends com.planner5d.library.model.payments.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222541a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends com.planner5d.library.model.payments.a>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222541a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c cVar = g.this.f222534h;
                this.f222541a = 1;
                obj = cVar.t(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (((Purchase) obj2).h() == 2) {
                    arrayList.add(obj2);
                }
            }
            g gVar = g.this;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.planner5d.library.model.payments.a aVarO = gVar.o((Purchase) it.next());
                if (aVarO != null) {
                    arrayList2.add(aVarO);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodGooglePlayInApp", f = "PaymentMethodGooglePlayInApp.kt", i = {0}, l = {110}, m = "getOrdersUncached", n = {"this"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222544b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222546d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222544b = obj;
            this.f222546d |= Integer.MIN_VALUE;
            return g.this.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodGooglePlayInApp", f = "PaymentMethodGooglePlayInApp.kt", i = {0, 0}, l = {54}, m = "getProducts", n = {"this", "userId"}, s = {"L$0", "J$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f222548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222549c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222551e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222549c = obj;
            this.f222551e |= Integer.MIN_VALUE;
            return g.this.h(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodGooglePlayInApp$isOrderDelivered$2", f = "PaymentMethodGooglePlayInApp.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaymentMethodGooglePlayInApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp$isOrderDelivered$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f222553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f222554c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.planner5d.library.model.payments.a aVar, g gVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f222553b = aVar;
            this.f222554c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f222553b, this.f222554c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222552a;
            boolean z10 = true;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.payments.a aVar = this.f222553b;
                Purchase purchase = new Purchase(aVar.f222476b, aVar.f222475a);
                g gVar = this.f222554c;
                if (!purchase.n()) {
                    com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c cVar = gVar.f222534h;
                    this.f222552a = 1;
                    obj = cVar.i(purchase, this);
                    if (obj == objL) {
                        return objL;
                    }
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (!((Boolean) obj).booleanValue()) {
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.payments.paymentmethod.g$g, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodGooglePlayInApp$paymentStartPay$$inlined$withReentrantLock$default$1", f = "PaymentMethodGooglePlayInApp.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {265, 269, com.badlogic.gdx.utils.compression.lzma.a.A}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "error"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentMethodGooglePlayInApp.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodGooglePlayInApp\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:277\n67#3,9:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:277,2\n*E\n"})
    public static final class C1635g extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f222559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f222560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f222561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Activity f222562h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ fd.f f222563i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f222564j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f222565k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2 f222566l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1635g(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, g gVar, Activity activity, fd.f fVar, String str, String str2, Function2 function2) {
            super(2, dVar);
            this.f222559e = aVar;
            this.f222560f = obj;
            this.f222561g = gVar;
            this.f222562h = activity;
            this.f222563i = fVar;
            this.f222564j = str;
            this.f222565k = str2;
            this.f222566l = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1635g(this.f222559e, this.f222560f, dVar, this.f222561g, this.f222562h, this.f222563i, this.f222564j, this.f222565k, this.f222566l);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00a2 A[Catch: all -> 0x0094, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0094, blocks: (B:30:0x0084, B:32:0x008b, B:42:0x00a2), top: B:72:0x0084 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:51:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r11v4, types: [com.planner5d.library.model.payments.paymentmethod.g$g, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r13v0, types: [com.planner5d.library.model.payments.paymentmethod.g$g, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r13v1, types: [kotlinx.coroutines.sync.a] */
        /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0, types: [com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            kotlinx.coroutines.sync.a aVar;
            Object obj3;
            ?? r11;
            ?? r10;
            Activity activity;
            fd.f fVar;
            String strC;
            ?? r12;
            String str;
            fd.f fVar2;
            String strE;
            String str2;
            String str3;
            String str4;
            Object obj4;
            Object objInvoke;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222558d;
            try {
                try {
                    try {
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            kotlinx.coroutines.sync.a aVar2 = this.f222559e;
                            obj2 = this.f222560f;
                            this.f222555a = aVar2;
                            this.f222556b = obj2;
                            this.f222558d = 1;
                            if (aVar2.h(obj2, this) != objL) {
                                aVar = aVar2;
                            }
                            return objL;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                th = (Throwable) this.f222557c;
                                Object obj5 = this.f222556b;
                                ResultKt.m(obj);
                                throw th;
                            }
                            Object obj6 = this.f222556b;
                            aVar = (kotlinx.coroutines.sync.a) this.f222555a;
                            try {
                                ResultKt.m(obj);
                                obj4 = obj6;
                                kotlinx.coroutines.sync.a aVar3 = aVar;
                                Unit unit = Unit.f312394a;
                                aVar3.i(obj4);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                r12 = this;
                                obj3 = obj6;
                                this = aVar;
                                try {
                                    Function2 function2 = r12.f222566l;
                                    r12.f222555a = this;
                                    r12.f222556b = obj3;
                                    r12.f222557c = th;
                                    r12.f222558d = 3;
                                    h0.e(6);
                                    objInvoke = function2.invoke(th, r12);
                                    int i11 = 2 << 7;
                                    h0.e(7);
                                    if (objInvoke != objL) {
                                        throw th;
                                    }
                                    return objL;
                                } catch (Throwable th3) {
                                    th = th3;
                                    objL = obj3;
                                    Throwable th4 = th;
                                    this.i(objL);
                                    throw th4;
                                }
                            }
                        }
                        obj2 = this.f222556b;
                        aVar = (kotlinx.coroutines.sync.a) this.f222555a;
                        ResultKt.m(obj);
                        if (fVar != null) {
                            try {
                                fd.i iVarK = fVar.k();
                                if (iVarK != null) {
                                    strC = iVarK.c();
                                    if (strC == null) {
                                    }
                                }
                                str = strC;
                                fVar2 = this.f222563i;
                                if (fVar2 != null) {
                                    strE = fVar2.e();
                                } else {
                                    strE = null;
                                }
                                str2 = strE;
                                str3 = this.f222564j;
                                str4 = this.f222565k;
                                this.f222555a = aVar;
                                this.f222556b = obj3;
                                this.f222558d = 2;
                                r11 = this;
                                if (r10.r(activity, str, str2, str3, str4, r11) != objL) {
                                    obj4 = obj3;
                                    kotlinx.coroutines.sync.a aVar4 = aVar;
                                    Unit unit2 = Unit.f312394a;
                                    aVar4.i(obj4);
                                    return unit2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r12 = this;
                                this = aVar;
                                Function2 function3 = r12.f222566l;
                                r12.f222555a = this;
                                r12.f222556b = obj3;
                                r12.f222557c = th;
                                r12.f222558d = 3;
                                h0.e(6);
                                objInvoke = function3.invoke(th, r12);
                                int i12 = 2 << 7;
                                h0.e(7);
                                if (objInvoke != objL) {
                                    throw th;
                                }
                            }
                            return objL;
                        }
                        if (r10.r(activity, str, str2, str3, str4, r11) != objL) {
                            obj4 = obj3;
                            kotlinx.coroutines.sync.a aVar5 = aVar;
                            Unit unit3 = Unit.f312394a;
                            aVar5.i(obj4);
                            return unit3;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r12 = r11;
                        this = aVar;
                        Function2 function4 = r12.f222566l;
                        r12.f222555a = this;
                        r12.f222556b = obj3;
                        r12.f222557c = th;
                        r12.f222558d = 3;
                        h0.e(6);
                        objInvoke = function4.invoke(th, r12);
                        int i13 = 2 << 7;
                        h0.e(7);
                        if (objInvoke != objL) {
                            throw th;
                        }
                    }
                    r10 = this.f222561g.f222534h;
                    activity = this.f222562h;
                    Intrinsics.checkNotNull(activity);
                    fVar = this.f222563i;
                    strC = com.planner5d.library.model.payments.a.f222474i;
                    str = strC;
                    fVar2 = this.f222563i;
                    if (fVar2 != null) {
                        strE = fVar2.e();
                    } else {
                        strE = null;
                    }
                    str2 = strE;
                    str3 = this.f222564j;
                    str4 = this.f222565k;
                    this.f222555a = aVar;
                    this.f222556b = obj3;
                    this.f222558d = 2;
                    r11 = this;
                } catch (Throwable th7) {
                    th = th7;
                    r11 = this;
                }
                obj3 = obj2;
                return objL;
            } catch (Throwable th8) {
                th = th8;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1635g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodGooglePlayInApp", f = "PaymentMethodGooglePlayInApp.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 3, 3, 3, 3, 3, 3}, l = {198, com.planner5d.library.engine.input.f.b.V, 72, 201, 201}, m = "paymentStartPay", n = {"this", "product", "activity", "obfuscatedAccountId", "obfuscatedProfileId", "errorFallbackAction", "$receiver$iv", "errorFallbackAction", "error", "this", "product", "activity", "obfuscatedAccountId", "obfuscatedProfileId", "errorFallbackAction", "$receiver$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222573g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f222574h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f222576j;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222574h = obj;
            this.f222576j |= Integer.MIN_VALUE;
            return g.this.g(null, null, 0L, null, null, null, this);
        }
    }

    @ij.a
    public g(@NotNull Application application, @NotNull v2 publicKeyProvider, @NotNull f1 coroutineScope, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(publicKeyProvider, "publicKeyProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f222527a = application;
        this.f222528b = publicKeyProvider;
        this.f222529c = coroutineScope;
        this.f222530d = coroutineDispatchers;
        this.f222531e = com.planner5d.library.model.payments.paymentmethod.e.a.Google;
        this.f222532f = s.d(Integer.MAX_VALUE, null, null, 6, null);
        kotlinx.coroutines.sync.a aVarB = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f222533g = aVarB;
        this.f222534h = new com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c(application, new com.planner5d.library.model.payments.paymentmethod.googleplayinapp.a(application, r()), aVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final com.planner5d.library.model.payments.a o(Purchase purchase) {
        com.planner5d.library.model.payments.a.C1633a c1633a = com.planner5d.library.model.payments.a.f222473h;
        String strL = purchase.l();
        Intrinsics.checkNotNullExpressionValue(strL, "getSignature(...)");
        String strD = purchase.d();
        Intrinsics.checkNotNullExpressionValue(strD, "getOriginalJson(...)");
        return c1633a.a(strL, strD, this.f222528b.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final fd.c p(Purchase purchase) {
        com.planner5d.library.model.payments.a aVarO = o(purchase);
        if (aVarO != null) {
            return new fd.c(aVarO, t(purchase));
        }
        return null;
    }

    private final fd.f q(long j10, z zVar) throws u.a {
        long jB;
        String strA;
        String str;
        String strC;
        String str2;
        z.f fVar;
        fd.i iVarE = u.e(j10, zVar.d());
        if (Intrinsics.areEqual(zVar.e(), "subs")) {
            List<z.f> listF = zVar.f();
            if (listF == null || (fVar = (z.f) CollectionsKt.firstOrNull((List) listF)) == null) {
                return null;
            }
            List<z.c> listA = fVar.f().a();
            Intrinsics.checkNotNullExpressionValue(listA, "getPricingPhaseList(...)");
            z.c cVar = (z.c) CollectionsKt.firstOrNull((List) listA);
            if (cVar == null) {
                return null;
            }
            jB = cVar.d();
            String strE = cVar.e();
            String strC2 = cVar.c();
            String strE2 = fVar.e();
            strC = fVar.c();
            str2 = strE;
            strA = strC2;
            str = strE2;
        } else {
            z.b bVarC = zVar.c();
            if (bVarC == null) {
                return null;
            }
            jB = bVarC.b();
            String strC3 = bVarC.c();
            strA = bVarC.a();
            str = null;
            strC = null;
            str2 = strC3;
        }
        return new fd.f(iVarE, jB, str2, strA, str, strC);
    }

    private final d0 r() {
        return new d0() { // from class: com.planner5d.library.model.payments.paymentmethod.f
            @Override // com.android.billingclient.api.d0
            public final void onPurchasesUpdated(n nVar, List list) {
                g.s(this.f222526a, nVar, list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(g gVar, n result, List list) {
        Intrinsics.checkNotNullParameter(result, "result");
        kotlinx.coroutines.k.f(gVar.f222529c, gVar.f222530d.h(), null, gVar.new a(list, result, null), 2, null);
    }

    private final fd.b t(Purchase purchase) {
        int iH = purchase.h();
        if (iH == 1) {
            return fd.b.PURCHASED;
        }
        if (iH != 2) {
            return null;
        }
        return fd.b.PENDING;
    }

    private static Object u(g gVar) {
        return j1.t(new c1(gVar, g.class, "ordersUpdatesInternal", "getOrdersUpdatesInternal()Lkotlinx/coroutines/channels/Channel;", 0));
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super List<fd.c>> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(this.f222530d.h(), new b(null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) throws Throwable {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f222546d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f222546d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objV = dVar2.f222544b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f222546d;
        if (i11 == 0) {
            ResultKt.m(objV);
            com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c cVar = this.f222534h;
            dVar2.f222543a = this;
            dVar2.f222546d = 1;
            objV = cVar.v(dVar2);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (g) dVar2.f222543a;
            ResultKt.m(objV);
        }
        ArrayList arrayList = new ArrayList();
        for (PurchaseHistoryRecord purchaseHistoryRecord : (Iterable) objV) {
            com.planner5d.library.model.payments.a.C1633a c1633a = com.planner5d.library.model.payments.a.f222473h;
            String strG = purchaseHistoryRecord.g();
            Intrinsics.checkNotNullExpressionValue(strG, "getSignature(...)");
            String strB = purchaseHistoryRecord.b();
            Intrinsics.checkNotNullExpressionValue(strB, "getOriginalJson(...)");
            com.planner5d.library.model.payments.a aVarA = c1633a.a(strG, strB, this.f222528b.c());
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return arrayList.toArray(new com.planner5d.library.model.payments.a[0]);
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(this.f222530d.h(), new c(null), dVar);
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @NotNull
    public n0<com.planner5d.library.model.payments.paymentmethod.d> d() {
        return this.f222532f;
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object e(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        if (aVar.f222476b != null && aVar.f222475a != null) {
            return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new f(aVar, this, null), dVar);
        }
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object f(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        String str;
        return ((aVar != null ? aVar.f222476b : null) == null || (str = aVar.f222475a) == null) ? kotlin.coroutines.jvm.internal.b.a(false) : this.f222534h.l(aVar.f222476b, str, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0137, code lost:
    
        if (r0.r(r12, r1, r4, r13, r9, r32) == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a2, code lost:
    
        if (kotlinx.coroutines.i.h((kotlin.coroutines.CoroutineContext) r1, r16, r2) == r3) goto L64;
     */
    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@org.jetbrains.annotations.Nullable fd.f r27, @org.jetbrains.annotations.Nullable android.app.Activity r28, long r29, @org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r33, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.payments.paymentmethod.g.g(fd.f, android.app.Activity, long, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @NotNull
    public com.planner5d.library.model.payments.paymentmethod.e.a getId() {
        return this.f222531e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object h(@Nullable id.a aVar, @NotNull String[] strArr, @NotNull kotlin.coroutines.d<? super fd.f[]> dVar) throws Throwable {
        e eVar;
        long jA;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f222551e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f222551e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objP = eVar.f222549c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f222551e;
        if (i11 == 0) {
            ResultKt.m(objP);
            jA = x.a(aVar);
            com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c cVar = this.f222534h;
            List<String> list = ArraysKt.toList(strArr);
            eVar.f222547a = this;
            eVar.f222548b = jA;
            eVar.f222551e = 1;
            objP = cVar.p(list, eVar);
            if (objP == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = eVar.f222548b;
            g gVar = (g) eVar.f222547a;
            ResultKt.m(objP);
            jA = j10;
            this = gVar;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objP).iterator();
        while (it.hasNext()) {
            fd.f fVarQ = this.q(jA, (z) it.next());
            if (fVarQ != null) {
                arrayList.add(fVarQ);
            }
        }
        return arrayList.toArray(new fd.f[0]);
    }

    @Nullable
    public final Object v(@NotNull kotlin.coroutines.d<? super String[]> dVar) {
        return this.f222534h.q(dVar);
    }
}
