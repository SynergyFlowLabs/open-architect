package com.planner5d.library.model.manager;

import android.app.Application;
import android.content.Context;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.identity.Registration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@com.planner5d.library.help.application.i0
public final class h1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<w> f191484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f191485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<e1> f191486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.w> f191487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<u1> f191488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f191489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f191490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f191491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Long f191492i;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.IntercomManager$onUserChange$1", f = "IntercomManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191493a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f191495c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(id.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f191495c = aVar;
            int i10 = 6 ^ 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h1.this.new a(this.f191495c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191493a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            h1.this.k(this.f191495c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b implements IntercomStatusCallback {
        b() {
        }

        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onFailure(IntercomError intercomError) {
            Intrinsics.checkNotNullParameter(intercomError, "intercomError");
            ((u1) h1.this.f191488e.get()).b("intercom", intercomError.getErrorMessage(), null);
        }

        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onSuccess() {
        }
    }

    @ij.a
    public h1(@NotNull fg.e<w> config, @NotNull Application application, @NotNull fg.e<e1> installationManager, @NotNull fg.e<com.planner5d.library.modules.user.user.w> userAuthorization, @NotNull fg.e<u1> logRecordManager, @NotNull com.planner5d.library.services.utility.f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f191484a = config;
        this.f191485b = application;
        this.f191486c = installationManager;
        this.f191487d = userAuthorization;
        this.f191488e = logRecordManager;
        this.f191489f = coroutineScope;
        this.f191490g = new Object();
        this.f191491h = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.model.manager.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1.h(this.f191458a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intercom h(h1 h1Var) {
        if (h1Var.j()) {
            return Intercom.Companion.client();
        }
        return null;
    }

    private final Intercom i() {
        return (Intercom) this.f191491h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public final void k(id.a aVar) {
        String str;
        long jA = com.planner5d.library.modules.user.user.x.a(aVar);
        synchronized (this.f191490g) {
            try {
                Long l10 = this.f191492i;
                if (l10 != null && l10.longValue() == jA) {
                    Intercom intercomI = i();
                    if (intercomI != null) {
                        intercomI.updateUser(m(aVar), new b());
                        Unit unit = Unit.f312394a;
                    }
                } else {
                    if (jA == 0) {
                        Intercom intercomI2 = i();
                        if (intercomI2 != null) {
                            Intercom.loginUnidentifiedUser$default(intercomI2, null, 1, null);
                        }
                    } else {
                        Intercom intercomI3 = i();
                        if (intercomI3 != null) {
                            Registration registrationWithUserAttributes = Registration.create().withUserId(String.valueOf(jA)).withUserAttributes(m(aVar));
                            Intrinsics.checkNotNullExpressionValue(registrationWithUserAttributes, "withUserAttributes(...)");
                            int i10 = 6 >> 2;
                            Intercom.loginIdentifiedUser$default(intercomI3, registrationWithUserAttributes, null, 2, null);
                        }
                        Intercom intercomI4 = i();
                        if (intercomI4 != null) {
                            if (aVar == null || (str = aVar.f287078d) == null) {
                                str = "";
                            }
                            intercomI4.setUserHash(str);
                        }
                    }
                    this.f191492i = Long.valueOf(jA);
                    Unit unit2 = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.m1
    private final UserAttributes m(id.a aVar) {
        Application application = this.f191485b;
        e1 e1Var = this.f191486c.get();
        Intrinsics.checkNotNullExpressionValue(e1Var, "get(...)");
        return n(aVar, application, e1Var, this.f191487d.get().h());
    }

    @androidx.annotation.m1
    private final UserAttributes n(id.a aVar, Context context, e1 e1Var, String str) {
        UserAttributes.Builder builder = new UserAttributes.Builder();
        if (aVar != null) {
            builder.withEmail(aVar.f287079e).withName(aVar.f287076b).withCustomAttribute(com.planner5d.library.services.r.userPaid.f224891a, Boolean.valueOf(aVar.e())).withLanguageOverride(str).withCustomAttribute(com.planner5d.library.services.r.application.f224891a, context.getPackageName()).withCustomAttribute(com.planner5d.library.services.r.applicationVersion.f224891a, Integer.valueOf(com.planner5d.library.services.utility.h3.j(context))).withCustomAttribute(com.planner5d.library.services.r.system.f224891a, e1Var.h()).withCustomAttribute("installationHash", e1Var.b()).withCustomAttribute(com.planner5d.library.services.r.language.f224891a, str);
            if (aVar.e()) {
                builder.withCustomAttribute(com.planner5d.library.services.r.userPaidDays.f224891a, Integer.valueOf(aVar.a()));
            }
        }
        UserAttributes userAttributesBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(userAttributesBuild, "build(...)");
        return userAttributesBuild;
    }

    @Override // com.planner5d.library.model.manager.i1
    public void a() {
        synchronized (this.f191490g) {
            try {
                Intercom intercomI = i();
                if (intercomI != null) {
                    intercomI.logout();
                }
                this.f191492i = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.i1
    @androidx.annotation.d
    public void b(@Nullable id.a aVar) {
        if (j()) {
            kotlinx.coroutines.k.f(this.f191489f, com.planner5d.library.services.utility.s.f229729a.d(), null, new a(aVar, null), 2, null);
        }
    }

    @Override // com.planner5d.library.model.manager.i1
    public void c(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intercom.Companion.initialize(application, application.getString(pc.b.r.f344358zd), application.getString(pc.b.r.Ad));
    }

    @Override // com.planner5d.library.model.manager.i1
    public void d(int i10) {
        Intercom intercomI = i();
        if (intercomI != null) {
            intercomI.setBottomPadding(i10);
        }
    }

    public final boolean j() {
        return this.f191484a.get().a(com.planner5d.library.model.manager.config.f.Intercom);
    }

    public final void l() {
        b(this.f191487d.get().a());
        Intercom intercomI = i();
        if (intercomI != null) {
            Intercom.present$default(intercomI, null, 1, null);
        }
    }
}
