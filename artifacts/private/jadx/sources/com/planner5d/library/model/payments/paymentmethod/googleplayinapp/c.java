package com.planner5d.library.model.payments.paymentmethod.googleplayinapp;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.a0;
import com.android.billingclient.api.b0;
import com.android.billingclient.api.e0;
import com.android.billingclient.api.f0;
import com.android.billingclient.api.g0;
import com.android.billingclient.api.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.p2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import kotlinx.coroutines.z3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nGooglePlayInAppRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 6 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,218:1\n1#2:219\n1557#3:220\n1628#3,3:221\n37#4,2:224\n116#5,10:226\n54#6,8:236\n*S KotlinDebug\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests\n*L\n103#1:220\n103#1:221,3\n178#1:224,2\n182#1:226,10\n209#1:236,8\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f222585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.payments.paymentmethod.googleplayinapp.a f222586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f222587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<String> f222588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f222589e;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0, 0, 0, 1, 1, 1}, l = {223, 183}, m = "acknowledge", n = {"this", FirebaseAnalytics.c.D, "$this$withLock_u24default$iv", "this", FirebaseAnalytics.c.D, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f222593d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f222595f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222593d = obj;
            this.f222595f |= Integer.MIN_VALUE;
            return c.this.i(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {}, l = {com.facebook.internal.p.f100029m}, m = "acknowledgeInternal", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f222596a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f222598c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222596a = obj;
            this.f222598c |= Integer.MIN_VALUE;
            return c.this.j(null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$acknowledgeInternal$2", f = "GooglePlayInAppRequests.kt", i = {0}, l = {219}, m = "invokeSuspend", n = {"client"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGooglePlayInAppRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$acknowledgeInternal$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,218:1\n243#2,7:219\n*S KotlinDebug\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$acknowledgeInternal$2\n*L\n191#1:219,7\n*E\n"})
    static final class C1637c extends kotlin.coroutines.jvm.internal.o implements Function2<com.android.billingclient.api.h, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f222600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Purchase f222602d;

        /* JADX INFO: renamed from: com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c$c$a */
        static final class a implements com.android.billingclient.api.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f222603a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Boolean, Unit> function1) {
                this.f222603a = function1;
            }

            @Override // com.android.billingclient.api.c
            public final void b(com.android.billingclient.api.n response) {
                Intrinsics.checkNotNullParameter(response, "response");
                this.f222603a.invoke(Boolean.valueOf(response.b() == 0));
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c$c$b */
        public static final class b implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.d f222604a;

            public b(kotlin.coroutines.d dVar) {
                this.f222604a = dVar;
            }

            public final void c(Boolean bool) {
                kotlin.coroutines.d dVar = this.f222604a;
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(bool));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                c(bool);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1637c(Purchase purchase, kotlin.coroutines.d<? super C1637c> dVar) {
            super(2, dVar);
            this.f222602d = purchase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C1637c c1637c = new C1637c(this.f222602d, dVar);
            c1637c.f222601c = obj;
            return c1637c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222600b;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.android.billingclient.api.h hVar = (com.android.billingclient.api.h) this.f222601c;
            c0 c0Var = c0.f225068a;
            Purchase purchase = this.f222602d;
            this.f222601c = hVar;
            this.f222599a = purchase;
            this.f222600b = 1;
            kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
            try {
                hVar.a(com.android.billingclient.api.b.b().b(purchase.j()).a(), new a(new b(jVar)));
            } catch (Exception e10) {
                Result.a aVar = Result.Companion;
                jVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
            }
            Object objA = jVar.a();
            if (objA == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            return objA == objL ? objL : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.android.billingclient.api.h hVar, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C1637c) create(hVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {}, l = {55}, m = "consume", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f222605a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f222607c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222605a = obj;
            this.f222607c |= Integer.MIN_VALUE;
            return c.this.l(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$consume$2", f = "GooglePlayInAppRequests.kt", i = {0}, l = {219}, m = "invokeSuspend", n = {"client"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGooglePlayInAppRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$consume$2\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,218:1\n243#2,7:219\n*S KotlinDebug\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$consume$2\n*L\n56#1:219,7\n*E\n"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<com.android.billingclient.api.h, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f222609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Purchase f222611d;

        static final class a implements com.android.billingclient.api.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f222612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Purchase f222613b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Boolean, Unit> function1, Purchase purchase) {
                this.f222612a = function1;
                this.f222613b = purchase;
            }

            @Override // com.android.billingclient.api.p
            public final void d(com.android.billingclient.api.n result, String resultToken) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(resultToken, "resultToken");
                this.f222612a.invoke(Boolean.valueOf(result.b() == 0 && Intrinsics.areEqual(resultToken, this.f222613b.j())));
            }
        }

        public static final class b implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.d f222614a;

            public b(kotlin.coroutines.d dVar) {
                this.f222614a = dVar;
            }

            public final void c(Boolean bool) {
                kotlin.coroutines.d dVar = this.f222614a;
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(bool));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                c(bool);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Purchase purchase, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f222611d = purchase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f222611d, dVar);
            eVar.f222610c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222609b;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.android.billingclient.api.h hVar = (com.android.billingclient.api.h) this.f222610c;
            c0 c0Var = c0.f225068a;
            Purchase purchase = this.f222611d;
            this.f222610c = hVar;
            this.f222608a = purchase;
            this.f222609b = 1;
            kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
            try {
                hVar.b(com.android.billingclient.api.o.b().b(purchase.j()).a(), new a(new b(jVar), purchase));
            } catch (Exception e10) {
                Result.a aVar = Result.Companion;
                jVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
            }
            Object objA = jVar.a();
            if (objA == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            return objA == objL ? objL : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.android.billingclient.api.h hVar, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((e) create(hVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$execute$$inlined$withReentrantLock$default$1", f = "GooglePlayInAppRequests.kt", i = {0, 0, 1, 1, 2, 2}, l = {265, 269, 268}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:273\n210#3,5:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:273,2\n*E\n"})
    public static final class f<T> extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f222619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f222620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2 f222621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ c f222622h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, Function2 function2, c cVar) {
            super(2, dVar);
            this.f222619e = aVar;
            this.f222620f = obj;
            this.f222621g = function2;
            this.f222622h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f222619e, this.f222620f, dVar, this.f222621g, this.f222622h);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Function2 function2;
            Object objH;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object obj3;
            Object objInvoke;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222618d;
            int i11 = 1 & 3;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f222619e;
                    obj2 = this.f222620f;
                    this.f222615a = aVar;
                    this.f222616b = obj2;
                    this.f222618d = 1;
                    if (aVar.h(obj2, this) != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        Function2 function3 = (Function2) this.f222617c;
                        Object obj4 = this.f222616b;
                        kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f222615a;
                        try {
                            ResultKt.m(obj);
                            objH = obj;
                            aVar = aVar3;
                            function2 = function3;
                            obj2 = obj4;
                            this.f222615a = aVar;
                            this.f222616b = obj2;
                            this.f222617c = null;
                            this.f222618d = 3;
                            int i12 = 3 << 6;
                            h0.e(6);
                            objInvoke = function2.invoke(objH, this);
                            h0.e(7);
                            if (objInvoke != objL) {
                                kotlinx.coroutines.sync.a aVar4 = aVar;
                                obj = objInvoke;
                                aVar2 = aVar4;
                                obj3 = obj2;
                            }
                            return objL;
                        } catch (Throwable th3) {
                            th2 = th3;
                            obj3 = obj4;
                            aVar2 = aVar3;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj3 = this.f222616b;
                        aVar2 = (kotlinx.coroutines.sync.a) this.f222615a;
                        try {
                            ResultKt.m(obj);
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    }
                    aVar2.i(obj3);
                    throw th2;
                }
                obj2 = this.f222616b;
                kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f222615a;
                ResultKt.m(obj);
                aVar = aVar5;
                aVar2.i(obj3);
                return obj;
                function2 = this.f222621g;
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                h hVar = this.f222622h.new h(null);
                this.f222615a = aVar;
                this.f222616b = obj2;
                this.f222617c = function2;
                this.f222618d = 2;
                objH = kotlinx.coroutines.i.h(z1VarH, hVar, this);
                if (objH != objL) {
                    this.f222615a = aVar;
                    this.f222616b = obj2;
                    this.f222617c = null;
                    this.f222618d = 3;
                    int i13 = 3 << 6;
                    h0.e(6);
                    objInvoke = function2.invoke(objH, this);
                    h0.e(7);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar6 = aVar;
                        obj = objInvoke;
                        aVar2 = aVar6;
                        obj3 = obj2;
                        aVar2.i(obj3);
                        return obj;
                    }
                }
                return objL;
            } catch (Throwable th5) {
                kotlinx.coroutines.sync.a aVar7 = aVar;
                th2 = th5;
                aVar2 = aVar7;
                obj3 = obj2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0, 0, 0, 3, 3, 3}, l = {220, 211, 210, 223, 223}, m = "execute", n = {"this", "handler", "$receiver$iv", "this", "handler", "$receiver$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f222626d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f222628f;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222626d = obj;
            this.f222628f |= Integer.MIN_VALUE;
            int i10 = 4 ^ 0;
            return c.this.m(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$execute$2$1", f = "GooglePlayInAppRequests.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.android.billingclient.api.h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222629a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f222629a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return c.this.f222586b.c();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.android.billingclient.api.h> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0, 0}, l = {27}, m = "find", n = {"sku", "signature"}, s = {"L$0", "L$1"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222633c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222635e;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222633c = obj;
            this.f222635e |= Integer.MIN_VALUE;
            return c.this.n(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160725s, com.planner5d.library.engine.input.f.b.C0}, m = "getProductDetails", n = {"this", "listSku"}, s = {"L$0", "L$1"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222638c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222640e;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222638c = obj;
            this.f222640e |= Integer.MIN_VALUE;
            return c.this.p(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0}, l = {80}, m = "getProductDetails", n = {"error"}, s = {"L$1"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222643c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222645e;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222643c = obj;
            this.f222645e |= Integer.MIN_VALUE;
            return c.this.o(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$getProductDetails$3$1", f = "GooglePlayInAppRequests.kt", i = {0}, l = {219}, m = "invokeSuspend", n = {"client"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGooglePlayInAppRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$getProductDetails$3$1\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,218:1\n243#2,7:219\n*S KotlinDebug\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$getProductDetails$3$1\n*L\n81#1:219,7\n*E\n"})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<com.android.billingclient.api.h, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f222651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222652g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List<String> f222654i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f222655j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<z> f222656k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ i1.h<Throwable> f222657l;

        static final class a implements a0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<z> f222658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1.h<Throwable> f222659b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f222660c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<Unit, Unit> f222661d;

            /* JADX WARN: Multi-variable type inference failed */
            a(List<z> list, i1.h<Throwable> hVar, c cVar, Function1<? super Unit, Unit> function1) {
                this.f222658a = list;
                this.f222659b = hVar;
                this.f222660c = cVar;
                this.f222661d = function1;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [T, com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d] */
            @Override // com.android.billingclient.api.a0
            public final void onProductDetailsResponse(com.android.billingclient.api.n result, List<z> resultList) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(resultList, "resultList");
                try {
                    if (result.b() == 0) {
                        this.f222658a.addAll(resultList);
                    } else {
                        this.f222659b.f312751a = new com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d(this.f222660c.f222585a, result);
                    }
                    this.f222661d.invoke(Unit.f312394a);
                } catch (Throwable th2) {
                    this.f222661d.invoke(Unit.f312394a);
                    throw th2;
                }
            }
        }

        public static final class b implements Function1<Unit, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.d f222662a;

            public b(kotlin.coroutines.d dVar) {
                this.f222662a = dVar;
            }

            public final void c(Unit unit) {
                kotlin.coroutines.d dVar = this.f222662a;
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(unit));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                c(unit);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List<String> list, String str, List<z> list2, i1.h<Throwable> hVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f222654i = list;
            this.f222655j = str;
            this.f222656k = list2;
            this.f222657l = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            l lVar = c.this.new l(this.f222654i, this.f222655j, this.f222656k, this.f222657l, dVar);
            lVar.f222652g = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222651f;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.android.billingclient.api.h hVar = (com.android.billingclient.api.h) this.f222652g;
                c0 c0Var = c0.f225068a;
                c cVar = c.this;
                List<String> list = this.f222654i;
                String str = this.f222655j;
                List<z> list2 = this.f222656k;
                i1.h<Throwable> hVar2 = this.f222657l;
                this.f222652g = hVar;
                this.f222646a = cVar;
                this.f222647b = list;
                this.f222648c = str;
                this.f222649d = list2;
                this.f222650e = hVar2;
                this.f222651f = 1;
                kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                try {
                    hVar.n(e0.a().b(cVar.k(list, str)).a(), new a(list2, hVar2, cVar, new b(jVar)));
                } catch (Exception e10) {
                    Result.a aVar = Result.Companion;
                    jVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
                }
                Object objA = jVar.a();
                if (objA == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objA == objL) {
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
        public final Object invoke(com.android.billingclient.api.h hVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(hVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0}, l = {164}, m = "getSupportedBillingTypes", n = {"result"}, s = {"L$0"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222664b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222666d;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222664b = obj;
            this.f222666d |= Integer.MIN_VALUE;
            return c.this.q(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$getSupportedBillingTypes$2", f = "GooglePlayInAppRequests.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<com.android.billingclient.api.h, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f222669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List<String> list, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f222669c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.f222669c, dVar);
            nVar.f222668b = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f222667a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.android.billingclient.api.h hVar = (com.android.billingclient.api.h) this.f222668b;
            if (hVar.k()) {
                this.f222669c.add("inapp");
            }
            if (hVar.j("subscriptions").b() == 0) {
                this.f222669c.add("subs");
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.android.billingclient.api.h hVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(hVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0, 0, 0, 0, 0, 0}, l = {38, 39}, m = FirebaseAnalytics.c.D, n = {"this", "activity", "sku", "offerToken", "obfuscatedAccountId", "obfuscatedProfileId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222676g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f222678i;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222676g = obj;
            this.f222678i |= Integer.MIN_VALUE;
            return c.this.r(null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$purchase$2", f = "GooglePlayInAppRequests.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGooglePlayInAppRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$purchase$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<com.android.billingclient.api.h, kotlin.coroutines.d<? super com.android.billingclient.api.n>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f222681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f222682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Activity f222683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f222684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f222685g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(z zVar, String str, Activity activity, String str2, String str3, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f222681c = zVar;
            this.f222682d = str;
            this.f222683e = activity;
            this.f222684f = str2;
            this.f222685g = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            p pVar = new p(this.f222681c, this.f222682d, this.f222683e, this.f222684f, this.f222685g, dVar);
            pVar.f222680b = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f222679a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.android.billingclient.api.h hVar = (com.android.billingclient.api.h) this.f222680b;
            com.android.billingclient.api.m.b.a aVarC = com.android.billingclient.api.m.b.a().c(this.f222681c);
            Intrinsics.checkNotNullExpressionValue(aVarC, "setProductDetails(...)");
            String str = this.f222682d;
            if (str != null) {
                aVarC.b(str);
            }
            return hVar.l(this.f222683e, com.android.billingclient.api.m.a().e(CollectionsKt.listOf(aVarC.a())).c(this.f222684f).d(this.f222685g).a());
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.android.billingclient.api.h hVar, kotlin.coroutines.d<? super com.android.billingclient.api.n> dVar) {
            return ((p) create(hVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160745y1, com.planner5d.library.engine.input.f.b.f160745y1}, m = "queryPurchases", n = {"this"}, s = {"L$0"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222687b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222689d;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222687b = obj;
            this.f222689d |= Integer.MIN_VALUE;
            return c.this.t(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {}, l = {110}, m = "queryPurchases", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f222690a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f222692c;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222690a = obj;
            this.f222692c |= Integer.MIN_VALUE;
            return c.this.s(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$queryPurchases$3", f = "GooglePlayInAppRequests.kt", i = {0, 0}, l = {114}, m = "invokeSuspend", n = {"result", "purchasesList"}, s = {"L$0", "L$1"})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function2<com.android.billingclient.api.h, kotlin.coroutines.d<? super List<? extends Purchase>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f222694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222695c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f222697e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$queryPurchases$3$1", f = "GooglePlayInAppRequests.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nGooglePlayInAppRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$queryPurchases$3$1\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,218:1\n243#2,7:219\n*S KotlinDebug\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$queryPurchases$3$1\n*L\n115#1:219,7\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f222698a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f222699b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f222700c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f222701d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f222702e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ com.android.billingclient.api.h f222703f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f222704g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ i1.h<com.android.billingclient.api.n> f222705h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ i1.h<List<Purchase>> f222706i;

            /* JADX INFO: renamed from: com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c$s$a$a, reason: collision with other inner class name */
            static final class C1638a implements com.android.billingclient.api.c0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ i1.h<com.android.billingclient.api.n> f222707a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ i1.h<List<Purchase>> f222708b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1<Unit, Unit> f222709c;

                /* JADX WARN: Multi-variable type inference failed */
                C1638a(i1.h<com.android.billingclient.api.n> hVar, i1.h<List<Purchase>> hVar2, Function1<? super Unit, Unit> function1) {
                    this.f222707a = hVar;
                    this.f222708b = hVar2;
                    this.f222709c = function1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.android.billingclient.api.c0
                public final void onQueryPurchasesResponse(com.android.billingclient.api.n billingResult, List<Purchase> purchases) {
                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                    Intrinsics.checkNotNullParameter(purchases, "purchases");
                    this.f222707a.f312751a = billingResult;
                    this.f222708b.f312751a = purchases;
                    this.f222709c.invoke(Unit.f312394a);
                }
            }

            public static final class b implements Function1<Unit, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlin.coroutines.d f222710a;

                public b(kotlin.coroutines.d dVar) {
                    this.f222710a = dVar;
                }

                public final void c(Unit unit) {
                    kotlin.coroutines.d dVar = this.f222710a;
                    Result.a aVar = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(unit));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                    c(unit);
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.android.billingclient.api.h hVar, String str, i1.h<com.android.billingclient.api.n> hVar2, i1.h<List<Purchase>> hVar3, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f222703f = hVar;
                this.f222704g = str;
                this.f222705h = hVar2;
                this.f222706i = hVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f222703f, this.f222704g, this.f222705h, this.f222706i, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f222702e;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c0 c0Var = c0.f225068a;
                    com.android.billingclient.api.h hVar = this.f222703f;
                    String str = this.f222704g;
                    i1.h<com.android.billingclient.api.n> hVar2 = this.f222705h;
                    i1.h<List<Purchase>> hVar3 = this.f222706i;
                    this.f222698a = hVar;
                    this.f222699b = str;
                    this.f222700c = hVar2;
                    this.f222701d = hVar3;
                    this.f222702e = 1;
                    kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                    try {
                        hVar.q(g0.a().b(str).a(), new C1638a(hVar2, hVar3, new b(jVar)));
                    } catch (Exception e10) {
                        Result.a aVar = Result.Companion;
                        jVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
                    }
                    Object objA = jVar.a();
                    if (objA == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    if (objA == objL) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f222697e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            s sVar = c.this.new s(this.f222697e, dVar);
            sVar.f222695c = obj;
            return sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v3, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
            i1.h hVar;
            i1.h hVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222694b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.android.billingclient.api.h hVar3 = (com.android.billingclient.api.h) this.f222695c;
                    i1.h hVar4 = new i1.h();
                    i1.h hVar5 = new i1.h();
                    hVar5.f312751a = CollectionsKt.emptyList();
                    long millis = TimeUnit.SECONDS.toMillis(30L);
                    a aVar = new a(hVar3, this.f222697e, hVar4, hVar5, null);
                    this.f222695c = hVar4;
                    this.f222693a = hVar5;
                    this.f222694b = 1;
                    if (b4.c(millis, aVar, this) == objL) {
                        return objL;
                    }
                    hVar = hVar4;
                    hVar2 = hVar5;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar2 = (i1.h) this.f222693a;
                    hVar = (i1.h) this.f222695c;
                    ResultKt.m(obj);
                }
                com.android.billingclient.api.n nVar = (com.android.billingclient.api.n) hVar.f312751a;
                if (nVar == null || nVar.b() != 0) {
                    throw new com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d(c.this.f222585a, (com.android.billingclient.api.n) hVar.f312751a);
                }
                return (List) hVar2.f312751a;
            } catch (z3 unused) {
                throw new com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d(c.this.f222585a, null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.android.billingclient.api.h hVar, kotlin.coroutines.d<? super List<? extends Purchase>> dVar) {
            return ((s) create(hVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0}, l = {androidx.media2.widget.f.i.f59767c0, 138}, m = "queryPurchasesUnCached", n = {"this"}, s = {"L$0"})
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222712b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222714d;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222712b = obj;
            this.f222714d |= Integer.MIN_VALUE;
            return c.this.v(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests", f = "GooglePlayInAppRequests.kt", i = {0}, l = {143}, m = "queryPurchasesUnCached", n = {"result"}, s = {"L$0"})
    static final class u extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222716b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222718d;

        u(kotlin.coroutines.d<? super u> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222716b = obj;
            this.f222718d |= Integer.MIN_VALUE;
            return c.this.u(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.googleplayinapp.GooglePlayInAppRequests$queryPurchasesUnCached$3", f = "GooglePlayInAppRequests.kt", i = {0}, l = {219}, m = "invokeSuspend", n = {"client"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGooglePlayInAppRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$queryPurchasesUnCached$3\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,218:1\n243#2,7:219\n*S KotlinDebug\n*F\n+ 1 GooglePlayInAppRequests.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppRequests$queryPurchasesUnCached$3\n*L\n144#1:219,7\n*E\n"})
    static final class v extends kotlin.coroutines.jvm.internal.o implements Function2<com.android.billingclient.api.h, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f222721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f222722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f222723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<PurchaseHistoryRecord> f222724f;

        static final class a implements b0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Unit, Unit> f222725a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<PurchaseHistoryRecord> f222726b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Unit, Unit> function1, List<PurchaseHistoryRecord> list) {
                this.f222725a = function1;
                this.f222726b = list;
            }

            @Override // com.android.billingclient.api.b0
            public final void c(com.android.billingclient.api.n response, List<PurchaseHistoryRecord> list) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.b() == 0 && list != null) {
                    this.f222726b.addAll(list);
                }
                this.f222725a.invoke(Unit.f312394a);
            }
        }

        public static final class b implements Function1<Unit, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.d f222727a;

            public b(kotlin.coroutines.d dVar) {
                this.f222727a = dVar;
            }

            public final void c(Unit unit) {
                kotlin.coroutines.d dVar = this.f222727a;
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(unit));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                c(unit);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, List<PurchaseHistoryRecord> list, kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
            this.f222723e = str;
            this.f222724f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            v vVar = new v(this.f222723e, this.f222724f, dVar);
            vVar.f222722d = obj;
            return vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222721c;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.android.billingclient.api.h hVar = (com.android.billingclient.api.h) this.f222722d;
                c0 c0Var = c0.f225068a;
                String str = this.f222723e;
                List<PurchaseHistoryRecord> list = this.f222724f;
                this.f222722d = hVar;
                this.f222719a = str;
                this.f222720b = list;
                this.f222721c = 1;
                kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                try {
                    hVar.o(f0.a().b(str).a(), new a(new b(jVar), list));
                } catch (Exception e10) {
                    Result.a aVar = Result.Companion;
                    jVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
                }
                Object objA = jVar.a();
                if (objA == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objA == objL) {
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
        public final Object invoke(com.android.billingclient.api.h hVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((v) create(hVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c(@NotNull Context context, @NotNull com.planner5d.library.model.payments.paymentmethod.googleplayinapp.a connection, @NotNull kotlinx.coroutines.sync.a mutex) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.f222585a = context;
        this.f222586b = connection;
        this.f222587c = mutex;
        this.f222588d = new ArrayList();
        int i10 = 1 << 1;
        this.f222589e = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object j(Purchase purchase, kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        boolean zAreEqual;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f222598c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f222598c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objM = bVar.f222596a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f222598c;
        try {
            if (i11 == 0) {
                ResultKt.m(objM);
                timber.log.b.f381052a.a("acknowledge: start", new Object[0]);
                C1637c c1637c = new C1637c(purchase, null);
                bVar.f222598c = 1;
                objM = m(c1637c, bVar);
                if (objM == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objM);
            }
            zAreEqual = Intrinsics.areEqual(objM, kotlin.coroutines.jvm.internal.b.a(true));
        } catch (com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d e10) {
            timber.log.b.f381052a.e(e10);
            zAreEqual = false;
        }
        Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zAreEqual);
        boolA.getClass();
        timber.log.b.f381052a.a("acknowledge: end", new Object[0]);
        return boolA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<e0.b> k(List<String> list, String str) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(e0.b.a().b((String) it.next()).c(str).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final <T> Object m(Function2<? super com.android.billingclient.api.h, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super T> dVar) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
        g gVar;
        kotlinx.coroutines.sync.a aVar;
        Object obj;
        Function2<? super com.android.billingclient.api.h, ? super kotlin.coroutines.d<? super T>, ? extends Object> function3;
        c cVar;
        kotlinx.coroutines.sync.a aVar2;
        Function2<? super com.android.billingclient.api.h, ? super kotlin.coroutines.d<? super T>, ? extends Object> function4;
        Object objInvoke;
        Object objH;
        c cVar2 = this;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f222628f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f222628f = i10 - Integer.MIN_VALUE;
            } else {
                gVar = cVar2.new g(dVar);
            }
        } else {
            gVar = cVar2.new g(dVar);
        }
        Object objH2 = gVar.f222626d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f222628f;
        if (i11 == 0) {
            ResultKt.m(objH2);
            c0 c0Var = c0.f225068a;
            aVar = cVar2.f222587c;
            p2.a aVar3 = p2.f229701c;
            gVar.f222623a = cVar2;
            gVar.f222624b = function2;
            gVar.f222625c = aVar;
            gVar.f222628f = 1;
            Object objB = aVar3.b(aVar, gVar);
            if (objB != objL) {
                obj = objB;
                function3 = function2;
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                function4 = (Function2) gVar.f222623a;
                ResultKt.m(objH2);
                gVar.f222623a = null;
                gVar.f222628f = 3;
                objInvoke = function4.invoke(objH2, gVar);
                if (objInvoke != objL) {
                    return objL;
                }
                return objInvoke;
            }
            if (i11 == 3) {
                ResultKt.m(objH2);
                return objH2;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objH2);
                return objH2;
            }
            kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) gVar.f222625c;
            function3 = (Function2) gVar.f222624b;
            c cVar3 = (c) gVar.f222623a;
            ResultKt.m(objH2);
            aVar2 = aVar4;
            cVar = cVar3;
            f fVar = new f(aVar2, null, null, function3, cVar);
            gVar.f222623a = null;
            gVar.f222624b = null;
            gVar.f222625c = null;
            gVar.f222628f = 5;
            objH = kotlinx.coroutines.i.h((CoroutineContext) objH2, fVar, gVar);
            if (objH != objL) {
                return objL;
            }
            return objH;
        }
        kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) gVar.f222625c;
        function3 = (Function2) gVar.f222624b;
        c cVar4 = (c) gVar.f222623a;
        ResultKt.m(objH2);
        aVar = aVar5;
        cVar2 = cVar4;
        obj = objH2;
        if (((Boolean) obj).booleanValue()) {
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            h hVar = cVar2.new h(null);
            gVar.f222623a = function3;
            gVar.f222624b = null;
            gVar.f222625c = null;
            gVar.f222628f = 2;
            objH2 = kotlinx.coroutines.i.h(z1VarH, hVar, gVar);
            if (objH2 != objL) {
                function4 = function3;
                gVar.f222623a = null;
                gVar.f222628f = 3;
                objInvoke = function4.invoke(objH2, gVar);
                if (objInvoke != objL) {
                    return objInvoke;
                }
            }
        } else {
            p2.a aVar6 = p2.f229701c;
            gVar.f222623a = cVar2;
            gVar.f222624b = function3;
            gVar.f222625c = aVar;
            gVar.f222628f = 4;
            Object objA = aVar6.a(aVar, gVar);
            if (objA != objL) {
                cVar = cVar2;
                aVar2 = aVar;
                objH2 = objA;
                f fVar2 = new f(aVar2, null, null, function3, cVar);
                gVar.f222623a = null;
                gVar.f222624b = null;
                gVar.f222625c = null;
                gVar.f222628f = 5;
                objH = kotlinx.coroutines.i.h((CoroutineContext) objH2, fVar2, gVar);
                if (objH != objL) {
                    return objH;
                }
            }
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object o(List<String> list, String str, kotlin.coroutines.d<? super List<z>> dVar) throws Throwable {
        k kVar;
        List list2;
        i1.h hVar;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f222645e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f222645e = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object obj = kVar.f222643c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f222645e;
        int i12 = 2 ^ 1;
        if (i11 == 0) {
            ResultKt.m(obj);
            ArrayList arrayList = new ArrayList();
            i1.h hVar2 = new i1.h();
            l lVar = new l(list, str, arrayList, hVar2, null);
            kVar.f222641a = arrayList;
            kVar.f222642b = hVar2;
            kVar.f222645e = 1;
            if (m(lVar, kVar) == objL) {
                return objL;
            }
            list2 = arrayList;
            hVar = hVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (i1.h) kVar.f222642b;
            list2 = (List) kVar.f222641a;
            ResultKt.m(obj);
        }
        Throwable th2 = (Throwable) hVar.f312751a;
        if (th2 == null) {
            return list2;
        }
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object s(String str, kotlin.coroutines.d<? super List<? extends Purchase>> dVar) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
        r rVar;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f222692c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f222692c = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(dVar);
            }
        } else {
            rVar = new r(dVar);
        }
        Object objM = rVar.f222690a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = rVar.f222692c;
        if (i11 == 0) {
            ResultKt.m(objM);
            s sVar = new s(str, null);
            rVar.f222692c = 1;
            objM = m(sVar, rVar);
            if (objM == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objM);
        }
        List list = (List) objM;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object u(String str, kotlin.coroutines.d<? super List<? extends PurchaseHistoryRecord>> dVar) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
        u uVar;
        if (dVar instanceof u) {
            uVar = (u) dVar;
            int i10 = uVar.f222718d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f222718d = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(dVar);
            }
        } else {
            uVar = new u(dVar);
        }
        Object obj = uVar.f222716b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = uVar.f222718d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) uVar.f222715a;
            ResultKt.m(obj);
            return list;
        }
        ResultKt.m(obj);
        ArrayList arrayList = new ArrayList();
        v vVar = new v(str, arrayList, null);
        uVar.f222715a = arrayList;
        uVar.f222718d = 1;
        return m(vVar, uVar) == objL ? objL : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:13:0x0043, B:30:0x00a3, B:37:0x00ba, B:43:0x00cc, B:46:0x00e3), top: B:53:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object i(@NotNull Purchase purchase, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        kotlinx.coroutines.sync.a aVar3;
        c cVar;
        boolean z10;
        Boolean boolA;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f222595f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f222595f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f222593d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f222595f;
        boolean z11 = false;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar2 = this.f222589e;
                aVar.f222590a = this;
                aVar.f222591b = purchase;
                aVar.f222592c = aVar2;
                aVar.f222595f = 1;
                if (aVar2.h(null, aVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (kotlinx.coroutines.sync.a) aVar.f222592c;
                purchase = (Purchase) aVar.f222591b;
                cVar = (c) aVar.f222590a;
                try {
                    ResultKt.m(obj);
                    if (((Boolean) obj).booleanValue()) {
                        aVar2 = aVar3;
                        this = cVar;
                        cVar = this;
                        aVar3 = aVar2;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolA = kotlin.coroutines.jvm.internal.b.a(z10);
                    if (boolA.booleanValue()) {
                        boolA = null;
                    }
                    if (boolA != null) {
                        List<String> list = cVar.f222588d;
                        String strJ = purchase.j();
                        Intrinsics.checkNotNullExpressionValue(strJ, "getPurchaseToken(...)");
                        list.add(strJ);
                        if (boolA.booleanValue()) {
                            z11 = true;
                        }
                    }
                    Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(z11);
                    aVar3.i(null);
                    return boolA2;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.i(null);
                    throw th;
                }
            }
            kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) aVar.f222592c;
            purchase = (Purchase) aVar.f222591b;
            c cVar2 = (c) aVar.f222590a;
            ResultKt.m(obj);
            aVar2 = aVar4;
            this = cVar2;
            if (!this.f222588d.contains(purchase.j())) {
                aVar.f222590a = this;
                aVar.f222591b = purchase;
                aVar.f222592c = aVar2;
                aVar.f222595f = 2;
                Object objJ = this.j(purchase, aVar);
                if (objJ != objL) {
                    cVar = this;
                    aVar3 = aVar2;
                    obj = objJ;
                    if (((Boolean) obj).booleanValue()) {
                        aVar2 = aVar3;
                        this = cVar;
                        cVar = this;
                        aVar3 = aVar2;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                return objL;
            }
            cVar = this;
            aVar3 = aVar2;
            z10 = true;
            boolA = kotlin.coroutines.jvm.internal.b.a(z10);
            if (boolA.booleanValue()) {
                boolA = null;
            }
            if (boolA != null) {
                List<String> list2 = cVar.f222588d;
                String strJ2 = purchase.j();
                Intrinsics.checkNotNullExpressionValue(strJ2, "getPurchaseToken(...)");
                list2.add(strJ2);
                if (boolA.booleanValue()) {
                    z11 = true;
                }
            }
            Boolean boolA3 = kotlin.coroutines.jvm.internal.b.a(z11);
            aVar3.i(null);
            return boolA3;
        } catch (Throwable th3) {
            th = th3;
            aVar3 = aVar2;
            aVar3.i(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object l(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        d dVar2;
        boolean zAreEqual;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f222607c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f222607c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objM = dVar2.f222605a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f222607c;
        try {
            if (i11 == 0) {
                ResultKt.m(objM);
                e eVar = new e(new Purchase(str, str2), null);
                dVar2.f222607c = 1;
                objM = m(eVar, dVar2);
                if (objM == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objM);
            }
            zAreEqual = Intrinsics.areEqual(objM, kotlin.coroutines.jvm.internal.b.a(true));
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
            zAreEqual = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(zAreEqual);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object n(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d<? super Purchase> dVar) {
        i iVar;
        Object next;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f222635e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f222635e = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objT = iVar.f222633c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f222635e;
        try {
            if (i11 == 0) {
                ResultKt.m(objT);
                iVar.f222631a = str;
                iVar.f222632b = str2;
                iVar.f222635e = 1;
                objT = t(iVar);
                if (objT == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) iVar.f222632b;
                str = (String) iVar.f222631a;
                ResultKt.m(objT);
            }
            Iterator it = ((Iterable) objT).iterator();
            while (it.hasNext()) {
                next = it.next();
                Purchase purchase = (Purchase) next;
                if (purchase.g().contains(str) && Intrinsics.areEqual(str2, purchase.l())) {
                    return (Purchase) next;
                }
            }
            next = null;
            return (Purchase) next;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object p(@NotNull List<String> list, @NotNull kotlin.coroutines.d<? super List<z>> dVar) throws Throwable {
        j jVar;
        Collection collection;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f222640e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f222640e = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objO = jVar.f222638c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f222640e;
        if (i11 == 0) {
            ResultKt.m(objO);
            jVar.f222636a = this;
            jVar.f222637b = list;
            jVar.f222640e = 1;
            objO = o(list, "inapp", jVar);
            if (objO == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            list = (List) jVar.f222637b;
            this = (c) jVar.f222636a;
            ResultKt.m(objO);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) jVar.f222636a;
            ResultKt.m(objO);
        }
        return CollectionsKt.plus(collection, (Iterable) objO);
        Collection collection2 = (Collection) objO;
        jVar.f222636a = collection2;
        jVar.f222637b = null;
        jVar.f222640e = 2;
        Object objO2 = this.o(list, "subs", jVar);
        if (objO2 != objL) {
            objO = objO2;
            collection = collection2;
            return CollectionsKt.plus(collection, (Iterable) objO);
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object q(@NotNull kotlin.coroutines.d<? super String[]> dVar) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
        m mVar;
        com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d e10;
        List list;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f222666d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f222666d = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object obj = mVar.f222664b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar.f222666d;
        if (i11 == 0) {
            ResultKt.m(obj);
            ArrayList arrayList = new ArrayList();
            try {
                n nVar = new n(arrayList, null);
                mVar.f222663a = arrayList;
                mVar.f222666d = 1;
                Object objM = m(nVar, mVar);
                if (objM == objL) {
                    return objL;
                }
                obj = objM;
                list = arrayList;
            } catch (com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d e11) {
                e10 = e11;
                list = arrayList;
                timber.log.b.f381052a.e(e10);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) mVar.f222663a;
            try {
                ResultKt.m(obj);
            } catch (com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d e12) {
                e10 = e12;
                timber.log.b.f381052a.e(e10);
            }
        }
        return list.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        if (r9.m(r7, r2) == r3) goto L24;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(@org.jetbrains.annotations.NotNull android.app.Activity r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.Nullable java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.payments.paymentmethod.googleplayinapp.c.r(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object t(@NotNull kotlin.coroutines.d<? super List<? extends Purchase>> dVar) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
        q qVar;
        Collection collection;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i10 = qVar.f222689d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f222689d = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object objS = qVar.f222687b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = qVar.f222689d;
        if (i11 == 0) {
            ResultKt.m(objS);
            qVar.f222686a = this;
            qVar.f222689d = 1;
            objS = s("inapp", qVar);
            if (objS != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (c) qVar.f222686a;
            ResultKt.m(objS);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) qVar.f222686a;
            ResultKt.m(objS);
        }
        return CollectionsKt.plus(collection, (Iterable) objS);
        Collection collection2 = (Collection) objS;
        qVar.f222686a = collection2;
        qVar.f222689d = 2;
        Object objS2 = this.s("subs", qVar);
        if (objS2 != objL) {
            objS = objS2;
            collection = collection2;
            return CollectionsKt.plus(collection, (Iterable) objS);
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object v(@NotNull kotlin.coroutines.d<? super List<? extends PurchaseHistoryRecord>> dVar) throws com.planner5d.library.model.payments.paymentmethod.googleplayinapp.d {
        t tVar;
        Collection collection;
        if (dVar instanceof t) {
            tVar = (t) dVar;
            int i10 = tVar.f222714d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f222714d = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(dVar);
            }
        } else {
            tVar = new t(dVar);
        }
        Object objU = tVar.f222712b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = tVar.f222714d;
        if (i11 == 0) {
            ResultKt.m(objU);
            tVar.f222711a = this;
            tVar.f222714d = 1;
            objU = u("inapp", tVar);
            if (objU == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (c) tVar.f222711a;
            ResultKt.m(objU);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) tVar.f222711a;
            ResultKt.m(objU);
        }
        return CollectionsKt.plus(collection, (Iterable) objU);
        Collection collection2 = (Collection) objU;
        tVar.f222711a = collection2;
        tVar.f222714d = 2;
        Object objU2 = this.u("subs", tVar);
        if (objU2 != objL) {
            objU = objU2;
            collection = collection2;
            return CollectionsKt.plus(collection, (Iterable) objU);
        }
        return objL;
    }
}
