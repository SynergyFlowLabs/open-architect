package com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.s;
import java.io.Closeable;
import java.io.IOException;
import java.security.InvalidParameterException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class a implements pa.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f135668f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f135669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f135670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.d f135671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b2 f135672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f135673e;

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a$a, reason: collision with other inner class name */
    private enum EnumC1491a {
        Format("format");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f135676d = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f135677a;

        EnumC1491a(String str) {
            this.f135677a = str;
        }

        @NotNull
        public static kotlin.enums.a<EnumC1491a> l() {
            return f135676d;
        }

        @NotNull
        public final String n() {
            return this.f135677a;
        }
    }

    private static final class b implements pe.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k0<Pair<pa.b.EnumC2457b, JSONObject>> f135678a;

        public b(@NotNull k0<Pair<pa.b.EnumC2457b, JSONObject>> publisher) {
            Intrinsics.checkNotNullParameter(publisher, "publisher");
            this.f135678a = publisher;
        }

        @Override // pe.e
        public void a(@Nullable JSONObject jSONObject) {
            this.f135678a.setValue(TuplesKt.to(pa.b.EnumC2457b.ConnectedWaitingForData, null));
        }

        @Override // pe.e
        public void b(@Nullable JSONObject jSONObject) {
            JSONObject jSONObject2;
            if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(r.rabbitMQData.f224891a)) == null) {
                return;
            }
            this.f135678a.setValue(TuplesKt.to(pa.b.EnumC2457b.LoadedData, jSONObject2));
        }

        @Override // pe.e
        public void c(@Nullable JSONObject jSONObject) {
            this.f135678a.setValue(TuplesKt.to(pa.b.EnumC2457b.Finished, jSONObject));
        }

        @Override // pe.e
        public void d(@Nullable JSONObject jSONObject) {
            this.f135678a.setValue(TuplesKt.to(pa.b.EnumC2457b.Error, null));
            timber.log.b.f381052a.d("Error with data:" + jSONObject, new Object[0]);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.ExportToCadInteractor", f = "ExportToCadInteractor.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "exportToCad", n = {"publisher"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135680b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f135682d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135680b = obj;
            this.f135682d |= Integer.MIN_VALUE;
            return a.this.a(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.ExportToCadInteractor$exportToCad$2", f = "ExportToCadInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements n<kotlinx.coroutines.flow.j<? super Pair<? extends pa.b.EnumC2457b, ? extends JSONObject>>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Closeable f135684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Closeable closeable, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.f135684b = closeable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f135683a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f135684b.close();
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<? super Pair<? extends pa.b.EnumC2457b, ? extends JSONObject>> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            return new d(this.f135684b, dVar).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.ExportToCadInteractor$exportToCad$closeable$1", f = "ExportToCadInteractor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Closeable>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135685a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0<Pair<pa.b.EnumC2457b, JSONObject>> f135687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pa.b.a f135688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f135689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.rabbitmq.g f135690f;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a$e$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.ExportToCadInteractor$exportToCad$closeable$1$1", f = "ExportToCadInteractor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.C0}, m = "invokeSuspend", n = {}, s = {})
        static final class C1492a extends o implements Function2<s0, kotlin.coroutines.d<? super Closeable>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f135691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.rabbitmq.g f135692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f135693c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1492a(com.planner5d.library.rabbitmq.g gVar, String str, kotlin.coroutines.d<? super C1492a> dVar) {
                super(2, dVar);
                this.f135692b = gVar;
                this.f135693c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1492a(this.f135692b, this.f135693c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f135691a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.rabbitmq.g gVar = this.f135692b;
                String str = this.f135693c;
                this.f135691a = 1;
                Object objN = gVar.n(str, this);
                return objN == objL ? objL : objN;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Closeable> dVar) {
                return ((C1492a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k0<Pair<pa.b.EnumC2457b, JSONObject>> k0Var, pa.b.a aVar, String str, com.planner5d.library.rabbitmq.g gVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f135687c = k0Var;
            this.f135688d = aVar;
            this.f135689e = str;
            this.f135690f = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.api.c m(JSONObject jSONObject, String str, a aVar, com.planner5d.library.api.b bVar, id.a aVar2) {
            return bVar.G(aVar2, jSONObject, str, aVar.f135670b.getPackageName(), h3.j(aVar.f135670b), h3.a());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new e(this.f135687c, this.f135688d, this.f135689e, this.f135690f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135685a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put(EnumC1491a.Format.n(), this.f135688d.n());
            com.planner5d.library.api.requests.c cVar = a.this.f135669a;
            id.a aVarA = a.this.f135673e.a();
            final String str = this.f135689e;
            final a aVar = a.this;
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) cVar.j(aVarA, new Function2() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return a.e.m(jSONObject, str, aVar, (com.planner5d.library.api.b) obj2, (id.a) obj3);
                }
            });
            if (cVar2.h()) {
                throw a.this.h();
            }
            int i11 = 4 & 0;
            String strZ = k1.z(cVar2.a(), r.responseQueue.f224891a, null, 4, null);
            if (strZ == null) {
                throw a.this.h();
            }
            timber.log.b.f381052a.a("queueName %s", strZ);
            this.f135687c.setValue(TuplesKt.to(pa.b.EnumC2457b.ConnectingToQueue, null));
            z1 z1VarH = s.f229729a.h();
            C1492a c1492a = new C1492a(this.f135690f, strZ, null);
            this.f135685a = 1;
            Object objH = kotlinx.coroutines.i.h(z1VarH, c1492a, this);
            return objH == objL ? objL : objH;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Closeable> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class f implements pe.b {
        f() {
        }

        @Override // pe.b
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            a.this.f135672d.s(message);
        }
    }

    public static final class g implements com.planner5d.library.rabbitmq.h {
        g() {
        }

        @Override // com.planner5d.library.rabbitmq.h
        public Object a(kotlin.coroutines.d<? super String> dVar) {
            return a.this.f135671c.f(dVar);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.api.requests.c api, @NotNull Application application, @NotNull com.planner5d.library.model.manager.config.d configManager, @NotNull b2 messageManager, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f135669a = api;
        this.f135670b = application;
        this.f135671c = configManager;
        this.f135672d = messageManager;
        this.f135673e = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvalidParameterException h() {
        return new InvalidParameterException("Unable to create export task");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pa.b
    @Nullable
    public Object a(@NotNull String str, @NotNull pa.b.a aVar, @NotNull kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends Pair<? extends pa.b.EnumC2457b, ? extends JSONObject>>> dVar) throws InvalidParameterException, IOException, com.planner5d.library.api.e {
        c cVar;
        k0 k0Var;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f135682d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f135682d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objH = cVar.f135680b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f135682d;
        if (i11 == 0) {
            ResultKt.m(objH);
            k0 k0VarA = b1.a(TuplesKt.to(pa.b.EnumC2457b.UploadingDataToGetQueueName, null));
            com.planner5d.library.rabbitmq.g gVar = new com.planner5d.library.rabbitmq.g(new b(k0VarA), new f(), new g());
            n0 n0VarB = s.f229729a.b();
            e eVar = new e(k0VarA, aVar, str, gVar, null);
            cVar.f135679a = k0VarA;
            cVar.f135682d = 1;
            objH = kotlinx.coroutines.i.h(n0VarB, eVar, cVar);
            if (objH == objL) {
                return objL;
            }
            k0Var = k0VarA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (k0) cVar.f135679a;
            ResultKt.m(objH);
        }
        return k.g1(k0Var, new d((Closeable) objH, null));
    }
}
