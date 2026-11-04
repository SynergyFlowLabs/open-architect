package com.planner5d.library.model.manager.push;

import android.content.ComponentCallbacks2;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.planner5d.library.model.manager.a1;
import com.planner5d.library.model.manager.statistics.c0;
import com.planner5d.library.model.manager.statistics.d0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PushMessageReceiver extends FirebaseMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f193293a = g0.c(new Function0() { // from class: com.planner5d.library.model.manager.push.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PushMessageReceiver.o(this.f193304a);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f193294b = g0.c(new Function0() { // from class: com.planner5d.library.model.manager.push.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PushMessageReceiver.s(this.f193305a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f193295c = g0.c(new Function0() { // from class: com.planner5d.library.model.manager.push.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PushMessageReceiver.t(this.f193306a);
        }
    });

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.push.PushMessageReceiver$onMessageReceived$1", f = "PushMessageReceiver.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f193296a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PushMessageReceiver.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f193296a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a1 a1VarQ = PushMessageReceiver.this.q();
                this.f193296a = 1;
                if (a1VarQ.a(this) == objL) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(PushMessageReceiver pushMessageReceiver) {
        ComponentCallbacks2 application = pushMessageReceiver.getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.planner5d.library.model.manager.push.CompositePushBackendProvider");
        return ((c) application).e();
    }

    private final g p() {
        return (g) this.f193293a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a1 q() {
        return (a1) this.f193294b.getValue();
    }

    private final d0 r() {
        return (d0) this.f193295c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a1 s(PushMessageReceiver pushMessageReceiver) {
        ComponentCallbacks2 application = pushMessageReceiver.getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.planner5d.library.model.manager.InitializationManagerService.Provider");
        return ((a1.a) application).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 t(PushMessageReceiver pushMessageReceiver) {
        ComponentCallbacks2 application = pushMessageReceiver.getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.planner5d.library.model.manager.statistics.StatisticsManagerProvider");
        return ((c0) application).a();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) throws InterruptedException {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        timber.log.b.f381052a.H(FirebaseMessaging.f123333q).a("Message received", new Object[0]);
        kotlinx.coroutines.j.b(null, new a(null), 1, null);
        k kVar = new k(remoteMessage);
        r().d(kVar.c());
        if (p().b(remoteMessage)) {
            r().d(kVar.b());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        timber.log.b.f381052a.H(FirebaseMessaging.f123333q).a("New token: " + token, new Object[0]);
        p().a(token);
    }
}
