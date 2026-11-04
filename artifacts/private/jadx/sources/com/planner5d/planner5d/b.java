package com.planner5d.planner5d;

import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.h4;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.f1;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@fg.h
public final class b {

    public static final class a implements com.planner5d.library.model.manager.statistics.devtodev.d.a {
        a() {
        }

        @Override // com.planner5d.library.model.manager.statistics.devtodev.d.a
        public /* bridge */ /* synthetic */ String a() {
            return (String) b();
        }

        public Void b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.planner5d.b$b, reason: collision with other inner class name */
    public static final class C1751b implements com.planner5d.library.model.manager.statistics.devtodev.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.modules.user.user.t f258911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.payments.j f258912b;

        /* JADX INFO: renamed from: com.planner5d.planner5d.b$b$a */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.planner5d.AllStatisticsModule$provideDevToDevConfiguration$1$validSubscriptionHistory$1", f = "AllStatisticsModule.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<? extends String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f258913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.manager.payments.j f258914b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.planner5d.library.model.manager.payments.j jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f258914b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f258914b, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends String>> dVar) {
                return invoke2(s0Var, (kotlin.coroutines.d<? super List<String>>) dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f258913a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.j jVar = this.f258914b;
                this.f258913a = 1;
                Object objR0 = jVar.r0(this);
                return objR0 == objL ? objL : objR0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<String>> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        C1751b(com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.model.manager.payments.j jVar) {
            this.f258911a = tVar;
            this.f258912b = jVar;
        }

        @Override // com.planner5d.library.model.manager.statistics.devtodev.d.b
        public com.planner5d.library.model.manager.statistics.g0 a() {
            long jE = this.f258911a.e();
            return jE == 0 ? com.planner5d.library.model.manager.statistics.g0.a.f217777b : new com.planner5d.library.model.manager.statistics.g0.b(jE);
        }

        @Override // com.planner5d.library.model.manager.statistics.devtodev.d.b
        public List<String> b() {
            return (List) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new a(this.f258912b, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(com.planner5d.library.model.manager.config.p pVar) {
        pVar.b(com.planner5d.library.services.r.devtodevEvents);
        return Unit.f312394a;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.appsflyer.d b(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.contest.view.vote.a deepLinkResultHandler, @NotNull c1 installationManager, @NotNull t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(deepLinkResultHandler, "deepLinkResultHandler");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        return new com.planner5d.library.model.manager.statistics.appsflyer.d(application, deepLinkResultHandler, installationManager, logRecordManager);
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.push.b c(@NotNull com.planner5d.library.application.b application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new com.planner5d.library.model.manager.push.b(new bd.a(application));
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.customerio.c d(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.modules.user.user.w userAuthorizationService, @NotNull com.planner5d.library.modules.user.user.u0 userPurchasesService, @NotNull com.planner5d.library.services.e0 regionProvider, @NotNull f1 coroutineScope, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(userPurchasesService, "userPurchasesService");
        Intrinsics.checkNotNullParameter(regionProvider, "regionProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        return new com.planner5d.library.model.manager.statistics.customerio.c(application, userAuthorizationService, userPurchasesService, regionProvider, coroutineScope, coroutineDispatchers);
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.devtodev.d e(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.statistics.devtodev.d.b configuration, @NotNull fg.e<com.planner5d.library.model.manager.statistics.appsflyer.d> appsflyer, @NotNull t1 logRecordManager, @NotNull c1 installationManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(appsflyer, "appsflyer");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new com.planner5d.library.model.manager.statistics.devtodev.d(application, configuration, appsflyer, logRecordManager, installationManager, coroutineScope, new a());
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.devtodev.d.b f(@NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.model.manager.payments.j paymentManager) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        return new C1751b(userAuthorization, paymentManager);
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.i g(@NotNull com.planner5d.library.model.manager.statistics.devtodev.d devToDev) {
        Intrinsics.checkNotNullParameter(devToDev, "devToDev");
        return devToDev;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.f h(@NotNull cd.c firebase, @NotNull com.planner5d.library.model.manager.statistics.devtodev.d devToDev, @NotNull fg.e<com.planner5d.library.model.manager.statistics.debug.c> debug, @NotNull fg.e<com.planner5d.library.model.manager.statistics.customerio.c> customerIo, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager) {
        Intrinsics.checkNotNullParameter(firebase, "firebase");
        Intrinsics.checkNotNullParameter(devToDev, "devToDev");
        Intrinsics.checkNotNullParameter(debug, "debug");
        Intrinsics.checkNotNullParameter(customerIo, "customerIo");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(firebase);
        listCreateListBuilder.add(devToDev);
        com.planner5d.library.model.manager.config.g value = featureConfigManager.get().s(com.planner5d.library.model.manager.config.f.CustomerIo).getValue();
        if (value != null ? Intrinsics.areEqual(value.b(), Boolean.TRUE) : false) {
            com.planner5d.library.model.manager.statistics.customerio.c cVar = customerIo.get();
            Intrinsics.checkNotNullExpressionValue(cVar, "get(...)");
            listCreateListBuilder.add(cVar);
        }
        return new com.planner5d.library.model.manager.statistics.f(CollectionsKt.build(listCreateListBuilder));
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.database.migration.p i(@NotNull final com.planner5d.library.model.manager.config.p preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new com.planner5d.library.database.migration.p(new Function0() { // from class: com.planner5d.planner5d.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.j(preferences);
            }
        });
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.i k(@NotNull fg.e<com.planner5d.library.model.manager.statistics.appsflyer.d> appsflyer, @NotNull fg.e<com.planner5d.library.model.manager.statistics.customerio.c> customerIo, @NotNull fg.e<h4> superwallEvents, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull fg.e<com.planner5d.library.model.manager.statistics.f> immediateStatisticsBackends) {
        Intrinsics.checkNotNullParameter(appsflyer, "appsflyer");
        Intrinsics.checkNotNullParameter(customerIo, "customerIo");
        Intrinsics.checkNotNullParameter(superwallEvents, "superwallEvents");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(immediateStatisticsBackends, "immediateStatisticsBackends");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (featureConfigManager.get().a(com.planner5d.library.model.manager.config.f.Superwall)) {
            h4 h4Var = superwallEvents.get();
            Intrinsics.checkNotNullExpressionValue(h4Var, "get(...)");
            listCreateListBuilder.add(h4Var);
        }
        if (featureConfigManager.get().a(com.planner5d.library.model.manager.config.f.Appsflyer)) {
            com.planner5d.library.model.manager.statistics.appsflyer.d dVar = appsflyer.get();
            Intrinsics.checkNotNullExpressionValue(dVar, "get(...)");
            listCreateListBuilder.add(dVar);
        }
        if (featureConfigManager.get().a(com.planner5d.library.model.manager.config.f.CustomerIo)) {
            com.planner5d.library.model.manager.statistics.customerio.c cVar = customerIo.get();
            com.planner5d.library.model.manager.statistics.f fVar = immediateStatisticsBackends.get();
            Intrinsics.checkNotNull(cVar);
            if (!fVar.y(cVar)) {
                listCreateListBuilder.add(cVar);
            }
        }
        return new com.planner5d.library.model.manager.statistics.i(CollectionsKt.build(listCreateListBuilder));
    }
}
