package com.planner5d.library.model.manager.payments;

import android.app.Application;
import androidx.annotation.m1;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.services.e0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.o2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
@SourceDebugExtension({"SMAP\nPaymentsServerDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsServerDataSource.kt\ncom/planner5d/library/model/manager/payments/PaymentsServerDataSource\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,184:1\n54#2,8:185\n*S KotlinDebug\n*F\n+ 1 PaymentsServerDataSource.kt\ncom/planner5d/library/model/manager/payments/PaymentsServerDataSource\n*L\n61#1:185,8\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f192907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f192908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f192909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final NetworkErrorUtility f192910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c2 f192911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f192912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final e1 f192913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final e0 f192914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f192915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f192916j;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource", f = "PaymentsServerDataSource.kt", i = {0, 0, 0, 1, 1, 2}, l = {com.planner5d.library.engine.input.f.b.f160742x1, com.planner5d.library.engine.input.f.b.f160745y1, 124}, m = "createPaymentIntent", n = {"this", "user", "product", "this", "nonce", "nonce"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f192920d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192922f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192920d = obj;
            this.f192922f |= Integer.MIN_VALUE;
            return r.this.i(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$createPaymentIntent$decryptedResponseData$1", f = "PaymentsServerDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super JSONObject>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.api.c f192924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.api.c cVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f192924b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f192924b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192923a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new JSONObject(com.planner5d.library.services.utility.e0.c(this.f192924b.a().getString(com.planner5d.library.services.r.crypted.f224891a)));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super JSONObject> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$createPaymentIntent$nonce$1", f = "PaymentsServerDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192925a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192925a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return com.planner5d.library.services.utility.e0.b();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$createPaymentIntent$response$1", f = "PaymentsServerDataSource.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f192929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192930e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fd.f f192932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f192933h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(fd.f fVar, String str, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.f192932g = fVar;
            this.f192933h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            com.planner5d.library.api.b bVar;
            JSONObject jSONObjectPut;
            id.a aVar;
            String str;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192928c;
            if (i10 == 0) {
                ResultKt.m(obj);
                bVar = (com.planner5d.library.api.b) this.f192929d;
                id.a aVar2 = (id.a) this.f192930e;
                String strH = h3.h(r.this.f192907a);
                jSONObjectPut = new JSONObject().put(com.planner5d.library.services.r.product.f224891a, this.f192932g.k().c()).put(com.planner5d.library.services.r.paymentAmountMicros.f224891a, this.f192932g.i()).putOpt(com.planner5d.library.services.r.paymentCurrency.f224891a, this.f192932g.g()).putOpt(com.planner5d.library.services.r.country.f224891a, r.this.f192914h.a()).put(com.planner5d.library.services.r.userAgent.f224891a, strH).put(com.planner5d.library.services.r.application.f224891a, strH).put(com.planner5d.library.services.r.applicationVersionCamelCase.f224891a, h3.l(r.this.f192907a));
                String str2 = com.planner5d.library.services.r.installation.f224891a;
                e1 e1Var = r.this.f192913g;
                this.f192929d = bVar;
                this.f192930e = aVar2;
                this.f192926a = jSONObjectPut;
                this.f192927b = str2;
                this.f192928c = 1;
                Object objC = e1Var.c(this);
                if (objC == objL) {
                    return objL;
                }
                aVar = aVar2;
                obj = objC;
                str = str2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f192927b;
                jSONObjectPut = (JSONObject) this.f192926a;
                aVar = (id.a) this.f192930e;
                bVar = (com.planner5d.library.api.b) this.f192929d;
                ResultKt.m(obj);
            }
            return bVar.y(aVar, jSONObjectPut.put(str, obj).put(com.planner5d.library.services.r.nonce.f224891a, this.f192933h));
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            d dVar2 = r.this.new d(this.f192932g, this.f192933h, dVar);
            dVar2.f192929d = bVar;
            dVar2.f192930e = aVar;
            return dVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource", f = "PaymentsServerDataSource.kt", i = {0, 0, 0, 0, 1}, l = {com.planner5d.library.engine.input.f.b.f160705l0, com.planner5d.library.engine.input.f.b.f160717p0}, m = "createPaymentsActionRequestBody", n = {"this", "order", "orderedProduct", "user", PeopleCardEntry.json}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192938e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192940g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192938e = obj;
            this.f192940g |= Integer.MIN_VALUE;
            return r.this.j(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$createPaymentsActionRequestBody$2", f = "PaymentsServerDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super JSONObject>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f192942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f192943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fd.f f192944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f192945e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(JSONObject jSONObject, com.planner5d.library.model.payments.a aVar, fd.f fVar, id.a aVar2, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f192942b = jSONObject;
            this.f192943c = aVar;
            this.f192944d = fVar;
            this.f192945e = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f192942b, this.f192943c, this.f192944d, this.f192945e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192941a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f192942b.put(com.planner5d.library.services.r.signature.f224891a, this.f192943c.f222475a);
            this.f192942b.put(com.planner5d.library.services.r.data.f224891a, this.f192943c.f222476b);
            fd.f fVar = this.f192944d;
            if (fVar != null) {
                this.f192942b.put(com.planner5d.library.services.r.price.f224891a, fVar.h());
                this.f192942b.put(com.planner5d.library.services.r.priceCurrency.f224891a, this.f192944d.g());
            }
            return this.f192942b.put(com.planner5d.library.services.r.uid.f224891a, com.planner5d.library.modules.user.user.x.a(this.f192945e));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super JSONObject> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$createPaymentsRequest$2", f = "PaymentsServerDataSource.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {PeopleCardEntry.json}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super JSONObject>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f192950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r f192951f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, r rVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f192950e = str;
            this.f192951f = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f192950e, this.f192951f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            JSONObject jSONObject;
            String str;
            JSONObject jSONObject2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192949d;
            if (i10 == 0) {
                ResultKt.m(obj);
                jSONObject = new JSONObject();
                String str2 = this.f192950e;
                if (str2 != null) {
                    jSONObject.put(com.planner5d.library.services.r.action.f224891a, str2);
                }
                jSONObject.put(com.planner5d.library.services.r.os.f224891a, com.planner5d.library.api.f.a().f142267e);
                String str3 = com.planner5d.library.services.r.installation.f224891a;
                e1 e1Var = this.f192951f.f192913g;
                this.f192946a = jSONObject;
                this.f192947b = jSONObject;
                this.f192948c = str3;
                this.f192949d = 1;
                Object objC = e1Var.c(this);
                if (objC == objL) {
                    return objL;
                }
                str = str3;
                obj = objC;
                jSONObject2 = jSONObject;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f192948c;
                jSONObject = (JSONObject) this.f192947b;
                jSONObject2 = (JSONObject) this.f192946a;
                ResultKt.m(obj);
            }
            jSONObject.put(str, obj);
            jSONObject2.put(com.planner5d.library.services.r.packageName.f224891a, this.f192951f.f192907a.getPackageName());
            return jSONObject2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super JSONObject> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$parseProductsData$2", f = "PaymentsServerDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f192953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f192954c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j10, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f192953b = str;
            this.f192954c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f192953b, this.f192954c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ErrorMessageException {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192952a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                JSONObject jSONObject = new JSONObject(this.f192953b);
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.products;
                if (jSONObject.has(rVar.f224891a)) {
                    JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        fd.h.a aVar = fd.h.f275148a;
                        long j10 = this.f192954c;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                        aVar.b(j10, jSONObject2);
                    }
                }
                return Unit.f312394a;
            } catch (JSONException unused) {
                throw new ErrorMessageException(o2.q.Y7, new String[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource", f = "PaymentsServerDataSource.kt", i = {0, 1, 2}, l = {143, 146, 161}, m = "requestAndCacheProductsData", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192956b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192958d;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192956b = obj;
            this.f192958d |= Integer.MIN_VALUE;
            return r.this.m(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$requestAndCacheProductsData$2", f = "PaymentsServerDataSource.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f192960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192961c;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192959a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = (String) this.f192960b;
                ResultKt.m(obj);
                return str;
            }
            ResultKt.m(obj);
            String string = ((com.planner5d.library.api.b) this.f192960b).h((id.a) this.f192961c, r.this.f192907a.getPackageName(), h3.j(r.this.f192907a), h3.c(), h3.a(), h3.n()).a().toString();
            com.planner5d.library.model.manager.config.p pVar = r.this.f192912f;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.productCache;
            this.f192960b = string;
            this.f192959a = 1;
            return pVar.d(rVar, string, this) == objL ? objL : string;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super String> dVar) {
            j jVar = r.this.new j(dVar);
            jVar.f192960b = bVar;
            jVar.f192961c = aVar;
            return jVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$requestPaymentAction$$inlined$withReentrantLock$default$1", f = "PaymentsServerDataSource.kt", i = {0, 0, 1, 1}, l = {265, 268}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 PaymentsServerDataSource.kt\ncom/planner5d/library/model/manager/payments/PaymentsServerDataSource\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:269\n62#3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:269,2\n*E\n"})
    public static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f192967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f192968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f192969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ JSONObject f192970h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, r rVar, JSONObject jSONObject) {
            super(2, dVar);
            this.f192967e = aVar;
            this.f192968f = obj;
            this.f192969g = rVar;
            this.f192970h = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new k(this.f192967e, this.f192968f, dVar, this.f192969g, this.f192970h);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192966d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f192967e;
                    obj2 = this.f192968f;
                    this.f192963a = aVar;
                    this.f192964b = obj2;
                    this.f192966d = 1;
                    if (aVar.h(obj2, this) != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f192964b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f192963a;
                    try {
                        ResultKt.m(obj);
                        aVar2.i(obj2);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(obj2);
                        throw th2;
                    }
                }
                obj2 = this.f192964b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f192963a;
                ResultKt.m(obj);
                aVar = aVar3;
                com.planner5d.library.api.requests.c cVar = this.f192969g.f192909c;
                id.a aVarA = this.f192969g.f192915i.a();
                n nVar = new n(this.f192970h, null);
                this.f192963a = aVar;
                this.f192964b = obj2;
                this.f192966d = 2;
                int i11 = 3 >> 0;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, nVar, this, 2, null);
                if (objG != objL) {
                    kotlinx.coroutines.sync.a aVar4 = aVar;
                    obj = objG;
                    aVar2 = aVar4;
                    aVar2.i(obj2);
                    return obj;
                }
                return objL;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar5 = aVar;
                th2 = th4;
                aVar2 = aVar5;
                aVar2.i(obj2);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource", f = "PaymentsServerDataSource.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160707m, com.planner5d.library.engine.input.f.b.f160707m}, m = "requestPaymentAction", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192972b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192974d;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192972b = obj;
            this.f192974d |= Integer.MIN_VALUE;
            int i10 = 7 << 0;
            return r.this.n(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource", f = "PaymentsServerDataSource.kt", i = {0, 0, 0, 2, 2, 2}, l = {186, com.planner5d.library.engine.input.f.b.I0, 189, 189}, m = "requestPaymentAction", n = {"this", PeopleCardEntry.json, "$receiver$iv", "this", PeopleCardEntry.json, "$receiver$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f192978d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192980f;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192978d = obj;
            this.f192980f |= Integer.MIN_VALUE;
            return r.this.o(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource$requestPaymentAction$3$1", f = "PaymentsServerDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f192982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f192984d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(JSONObject jSONObject, kotlin.coroutines.d<? super n> dVar) {
            super(3, dVar);
            this.f192984d = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192981a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((com.planner5d.library.api.b) this.f192982b).q0((id.a) this.f192983c, this.f192984d);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            n nVar = new n(this.f192984d, dVar);
            nVar.f192982b = bVar;
            nVar.f192983c = aVar;
            return nVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.PaymentsServerDataSource", f = "PaymentsServerDataSource.kt", i = {}, l = {androidx.media2.widget.f.i.f59767c0, androidx.media2.widget.f.i.f59767c0}, m = "updateSku$P5D_Library_Payments_release", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f192986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f192987c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192989e;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192987c = obj;
            this.f192989e |= Integer.MIN_VALUE;
            return r.this.p(null, false, this);
        }
    }

    @ij.a
    public r(@NotNull Application application, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers, @NotNull com.planner5d.library.api.requests.c apiRequester, @NotNull NetworkErrorUtility networkErrorUtility, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull e1 installationManager, @NotNull e0 regionProvider, @NotNull com.planner5d.library.modules.user.user.w userAuthorizationService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(apiRequester, "apiRequester");
        Intrinsics.checkNotNullParameter(networkErrorUtility, "networkErrorUtility");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(regionProvider, "regionProvider");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        this.f192907a = application;
        this.f192908b = coroutineDispatchers;
        this.f192909c = apiRequester;
        this.f192910d = networkErrorUtility;
        this.f192911e = networkStateUtility;
        this.f192912f = preferences;
        this.f192913g = installationManager;
        this.f192914h = regionProvider;
        this.f192915i = userAuthorizationService;
        this.f192916j = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final Object l(long j10, String str, kotlin.coroutines.d<? super Unit> dVar) throws ErrorMessageException {
        Object objH = kotlinx.coroutines.i.h(this.f192908b.h(), new h(str, j10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r15 == r8) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(id.a r13, boolean r14, kotlin.coroutines.d<? super java.lang.String> r15) throws com.planner5d.library.services.exceptions.ErrorMessageException, java.lang.IllegalStateException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.r.m(id.a, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (r15 == r0) goto L38;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@org.jetbrains.annotations.Nullable id.a r13, @org.jetbrains.annotations.Nullable fd.f r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.String> r15) throws com.planner5d.library.services.exceptions.ErrorMessageException, org.json.JSONException, java.lang.NullPointerException, com.planner5d.library.api.e {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.r.i(id.a, fd.f, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object j(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable fd.f fVar, @Nullable id.a aVar2, @Nullable String str, @NotNull kotlin.coroutines.d<? super JSONObject> dVar) throws JSONException {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f192940g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f192940g = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objK = eVar.f192938e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f192940g;
        if (i11 == 0) {
            ResultKt.m(objK);
            eVar.f192934a = this;
            eVar.f192935b = aVar;
            eVar.f192936c = fVar;
            eVar.f192937d = aVar2;
            eVar.f192940g = 1;
            objK = k(str, eVar);
            if (objK != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            JSONObject jSONObject = (JSONObject) eVar.f192934a;
            ResultKt.m(objK);
            return jSONObject;
        }
        aVar2 = (id.a) eVar.f192937d;
        fVar = (fd.f) eVar.f192936c;
        aVar = (com.planner5d.library.model.payments.a) eVar.f192935b;
        this = (r) eVar.f192934a;
        ResultKt.m(objK);
        com.planner5d.library.model.payments.a aVar3 = aVar;
        fd.f fVar2 = fVar;
        id.a aVar4 = aVar2;
        JSONObject jSONObject2 = (JSONObject) objK;
        n0 n0VarD = this.f192908b.d();
        f fVar3 = new f(jSONObject2, aVar3, fVar2, aVar4, null);
        eVar.f192934a = jSONObject2;
        eVar.f192935b = null;
        eVar.f192936c = null;
        eVar.f192937d = null;
        eVar.f192940g = 2;
        return kotlinx.coroutines.i.h(n0VarD, fVar3, eVar) == objL ? objL : jSONObject2;
    }

    @Nullable
    public final Object k(@Nullable String str, @NotNull kotlin.coroutines.d<? super JSONObject> dVar) throws JSONException {
        return kotlinx.coroutines.i.h(this.f192908b.d(), new g(str, this, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object n(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable fd.f fVar, @Nullable id.a aVar2, @Nullable String str, @NotNull kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) throws IllegalStateException, JSONException, com.planner5d.library.api.e {
        l lVar;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f192974d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f192974d = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        l lVar2 = lVar;
        Object objJ = lVar2.f192972b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = lVar2.f192974d;
        if (i11 == 0) {
            ResultKt.m(objJ);
            lVar2.f192971a = this;
            lVar2.f192974d = 1;
            objJ = j(aVar, fVar, aVar2, str, lVar2);
            if (objJ != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objJ);
            return objJ;
        }
        this = (r) lVar2.f192971a;
        ResultKt.m(objJ);
        lVar2.f192971a = null;
        lVar2.f192974d = 2;
        Object objO = this.o((JSONObject) objJ, lVar2);
        return objO == objL ? objL : objO;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if (r1 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (r1 == r2) goto L37;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@org.jetbrains.annotations.NotNull org.json.JSONObject r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.planner5d.library.api.c> r19) throws java.lang.IllegalStateException, com.planner5d.library.api.e {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.r.o(org.json.JSONObject, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r8.l(r5, (java.lang.String) r11, r0) == r1) goto L22;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(@org.jetbrains.annotations.Nullable id.a r9, boolean r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) throws com.planner5d.library.services.exceptions.ErrorMessageException, java.lang.IllegalStateException, java.io.IOException {
        /*
            r8 = this;
            r7 = 5
            boolean r0 = r11 instanceof com.planner5d.library.model.manager.payments.r.o
            r7 = 4
            if (r0 == 0) goto L17
            r0 = r11
            com.planner5d.library.model.manager.payments.r$o r0 = (com.planner5d.library.model.manager.payments.r.o) r0
            int r1 = r0.f192989e
            r7 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f192989e = r1
            r7 = 3
            goto L1d
        L17:
            r7 = 2
            com.planner5d.library.model.manager.payments.r$o r0 = new com.planner5d.library.model.manager.payments.r$o
            r0.<init>(r11)
        L1d:
            java.lang.Object r11 = r0.f192987c
            r7 = 4
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 6
            int r2 = r0.f192989e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            r7 = 6
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r11)
            goto L72
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 7
            r8.<init>(r9)
            throw r8
        L3d:
            long r8 = r0.f192986b
            java.lang.Object r10 = r0.f192985a
            com.planner5d.library.model.manager.payments.r r10 = (com.planner5d.library.model.manager.payments.r) r10
            kotlin.ResultKt.m(r11)
            r5 = r8
            r8 = r10
            r7 = 5
            goto L60
        L4a:
            r7 = 3
            kotlin.ResultKt.m(r11)
            long r5 = com.planner5d.library.modules.user.user.x.a(r9)
            r0.f192985a = r8
            r0.f192986b = r5
            r7 = 1
            r0.f192989e = r4
            java.lang.Object r11 = r8.m(r9, r10, r0)
            if (r11 != r1) goto L60
            goto L71
        L60:
            java.lang.String r11 = (java.lang.String) r11
            r7 = 1
            r9 = 0
            r0.f192985a = r9
            r7 = 1
            r0.f192989e = r3
            r7 = 6
            java.lang.Object r8 = r8.l(r5, r11, r0)
            r7 = 7
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.payments.r.p(id.a, boolean, kotlin.coroutines.d):java.lang.Object");
    }
}
