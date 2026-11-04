package com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.a4;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.y2;
import java.io.Closeable;
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
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class i implements pa.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f135749e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f135750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pa.d f135751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f135752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.d f135753d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.SmartWizardNewRoomInteractor", f = "SmartWizardNewRoomInteractor.kt", i = {0, 0, 0, 1}, l = {49, com.planner5d.library.engine.input.f.b.D0}, m = "requestNewRoom", n = {"this", "publisher", "rabbitMQClient", "publisher"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f135756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f135757d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f135759f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135757d = obj;
            this.f135759f |= Integer.MIN_VALUE;
            return i.this.a(null, 0, 0, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.SmartWizardNewRoomInteractor$requestNewRoom$2", f = "SmartWizardNewRoomInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements n<kotlinx.coroutines.flow.j<? super Pair<? extends com.planner5d.library.activity.fragment.smartwizard.b, ? extends JSONObject>>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Closeable f135761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Closeable closeable, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f135761b = closeable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f135760a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            y2.a(this.f135761b);
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<? super Pair<? extends com.planner5d.library.activity.fragment.smartwizard.b, ? extends JSONObject>> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            return new b(this.f135761b, dVar).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.SmartWizardNewRoomInteractor$requestNewRoom$closeable$1", f = "SmartWizardNewRoomInteractor.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135762a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pa.a f135764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f135765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f135766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f135767f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f135768g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(pa.a aVar, int i10, int i11, String str, String str2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f135764c = aVar;
            this.f135765d = i10;
            this.f135766e = i11;
            this.f135767f = str;
            this.f135768g = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new c(this.f135764c, this.f135765d, this.f135766e, this.f135767f, this.f135768g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135762a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            pa.d dVar = i.this.f135751b;
            com.planner5d.library.application.b bVar = i.this.f135750a;
            pa.a aVar = this.f135764c;
            int i11 = this.f135765d;
            int i12 = this.f135766e;
            String str = this.f135767f;
            String str2 = this.f135768g;
            this.f135762a = 1;
            Object objA = dVar.a(bVar, aVar, i11, i12, str, str2, this);
            return objA == objL ? objL : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.SmartWizardNewRoomInteractor$requestNewRoom$closeable$2$2", f = "SmartWizardNewRoomInteractor.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Closeable>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.rabbitmq.g f135770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f135771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.planner5d.library.rabbitmq.g gVar, String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f135770b = gVar;
            this.f135771c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f135770b, this.f135771c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135769a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.rabbitmq.g gVar = this.f135770b;
            String str = this.f135771c;
            this.f135769a = 1;
            Object objN = gVar.n(str, this);
            return objN == objL ? objL : objN;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Closeable> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class e implements pe.b {
        e() {
        }

        @Override // pe.b
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            i.this.f135752c.s(message);
        }
    }

    public static final class f implements com.planner5d.library.rabbitmq.h {
        f() {
        }

        @Override // com.planner5d.library.rabbitmq.h
        public Object a(kotlin.coroutines.d<? super String> dVar) {
            return i.this.f135753d.f(dVar);
        }
    }

    @ij.a
    public i(@NotNull com.planner5d.library.application.b application, @NotNull pa.d smartWizardAIQueueRequestUseCase, @NotNull b2 messageManager, @NotNull com.planner5d.library.model.manager.config.d configManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(smartWizardAIQueueRequestUseCase, "smartWizardAIQueueRequestUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        this.f135750a = application;
        this.f135751b = smartWizardAIQueueRequestUseCase;
        this.f135752c = messageManager;
        this.f135753d = configManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // pa.e
    @Nullable
    public Object a(@NotNull pa.a aVar, int i10, int i11, @NotNull String str, @NotNull String str2, @NotNull a4.e eVar, @NotNull kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends Pair<? extends com.planner5d.library.activity.fragment.smartwizard.b, ? extends JSONObject>>> dVar) {
        a aVar2;
        k0 k0VarA;
        com.planner5d.library.rabbitmq.g gVar;
        k0 k0Var;
        Closeable closeable;
        i iVar = this;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i12 = aVar2.f135759f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar2.f135759f = i12 - Integer.MIN_VALUE;
            } else {
                aVar2 = iVar.new a(dVar);
            }
        } else {
            aVar2 = iVar.new a(dVar);
        }
        a aVar3 = aVar2;
        Object objH = aVar3.f135757d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = aVar3.f135759f;
        if (i13 == 0) {
            ResultKt.m(objH);
            k0VarA = b1.a(TuplesKt.to(com.planner5d.library.activity.fragment.smartwizard.b.UploadingDataToGetQueueName, null));
            gVar = new com.planner5d.library.rabbitmq.g(new com.planner5d.library.activity.fragment.smartwizard.c(iVar.f135752c, k0VarA, eVar), iVar.new e(), iVar.new f());
            n0 n0VarB = s.f229729a.b();
            c cVar = iVar.new c(aVar, i10, i11, str, str2, null);
            aVar3.f135754a = iVar;
            aVar3.f135755b = k0VarA;
            aVar3.f135756c = gVar;
            aVar3.f135759f = 1;
            objH = kotlinx.coroutines.i.h(n0VarB, cVar, aVar3);
            if (objH != objL) {
            }
            return objL;
        }
        if (i13 == 1) {
            com.planner5d.library.rabbitmq.g gVar2 = (com.planner5d.library.rabbitmq.g) aVar3.f135756c;
            k0 k0Var2 = (k0) aVar3.f135755b;
            i iVar2 = (i) aVar3.f135754a;
            ResultKt.m(objH);
            gVar = gVar2;
            k0VarA = k0Var2;
            iVar = iVar2;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (k0) aVar3.f135754a;
            ResultKt.m(objH);
        }
        closeable = (Closeable) objH;
        k0VarA = k0Var;
        return k.g1(k0VarA, new b(closeable, null));
        String str3 = (String) objH;
        timber.log.b.f381052a.a("queueName %s", str3);
        if (str3 != null) {
            k0VarA.setValue(TuplesKt.to(com.planner5d.library.activity.fragment.smartwizard.b.ConnectingToQueue, null));
            z1 z1VarH = s.f229729a.h();
            d dVar2 = new d(gVar, str3, null);
            aVar3.f135754a = k0VarA;
            aVar3.f135755b = null;
            aVar3.f135756c = null;
            aVar3.f135759f = 2;
            objH = kotlinx.coroutines.i.h(z1VarH, dVar2, aVar3);
            if (objH != objL) {
                k0Var = k0VarA;
                closeable = (Closeable) objH;
                k0VarA = k0Var;
            }
            return objL;
        }
        iVar.f135752c.b(com.planner5d.library.f.s.lC, new Object[0]);
        k0VarA.setValue(TuplesKt.to(com.planner5d.library.activity.fragment.smartwizard.b.Error, null));
        closeable = new Closeable() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.h
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                i.g();
            }
        };
        return k.g1(k0VarA, new b(closeable, null));
    }
}
