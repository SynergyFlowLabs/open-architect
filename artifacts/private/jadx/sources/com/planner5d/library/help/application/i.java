package com.planner5d.library.help.application;

import android.app.Application;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.interactor.l0;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.h2;
import com.planner5d.library.model.manager.i2;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.model.manager.q4;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.v3;
import com.planner5d.library.model.manager.t2;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.model.manager.z4;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@fg.h
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i2 f179985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y1 f179986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f179987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f179988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Application f179989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u1 f179990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final p5 f179991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final h2 f179992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.h f179993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.w f179994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final z4 f179995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f179996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final v3 f179997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f179998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final c2 f179999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c2 f180000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.u f180001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final e1 f180002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final q4 f180003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final t2 f180004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f180005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final r3 f180006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final f1 f180007w;

    public i(@NotNull i2 navigationClassProvider, @NotNull y1 menuManager, @NotNull com.planner5d.library.activity.fragment.x fragmentControllerNavigator, int i10, @NotNull Application application, @NotNull u1 logRecordManagerService, @NotNull p5 uriViewerService, @NotNull h2 missingActivityForUriHandler, @NotNull com.planner5d.library.model.manager.h configManagerService, @NotNull com.planner5d.library.model.manager.w featureConfigManagerService, @NotNull z4 supportUrlProviderService, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull v3 statisticsEventOnboarding, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.model.manager.c2 messageManagerService, @NotNull com.planner5d.library.services.u libraryDialogFactory, @NotNull e1 installationManagerService, @NotNull q4 supportManagerDataService, @NotNull t2 paymentsManager, @NotNull com.planner5d.library.modules.user.user.w userAuthorizationService, @NotNull r3 statisticsEventGeneric, @NotNull f1 globalCoroutineScope) {
        Intrinsics.checkNotNullParameter(navigationClassProvider, "navigationClassProvider");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(fragmentControllerNavigator, "fragmentControllerNavigator");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(logRecordManagerService, "logRecordManagerService");
        Intrinsics.checkNotNullParameter(uriViewerService, "uriViewerService");
        Intrinsics.checkNotNullParameter(missingActivityForUriHandler, "missingActivityForUriHandler");
        Intrinsics.checkNotNullParameter(configManagerService, "configManagerService");
        Intrinsics.checkNotNullParameter(featureConfigManagerService, "featureConfigManagerService");
        Intrinsics.checkNotNullParameter(supportUrlProviderService, "supportUrlProviderService");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(statisticsEventOnboarding, "statisticsEventOnboarding");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(messageManagerService, "messageManagerService");
        Intrinsics.checkNotNullParameter(libraryDialogFactory, "libraryDialogFactory");
        Intrinsics.checkNotNullParameter(installationManagerService, "installationManagerService");
        Intrinsics.checkNotNullParameter(supportManagerDataService, "supportManagerDataService");
        Intrinsics.checkNotNullParameter(paymentsManager, "paymentsManager");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(statisticsEventGeneric, "statisticsEventGeneric");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        this.f179985a = navigationClassProvider;
        this.f179986b = menuManager;
        this.f179987c = fragmentControllerNavigator;
        this.f179988d = i10;
        this.f179989e = application;
        this.f179990f = logRecordManagerService;
        this.f179991g = uriViewerService;
        this.f179992h = missingActivityForUriHandler;
        this.f179993i = configManagerService;
        this.f179994j = featureConfigManagerService;
        this.f179995k = supportUrlProviderService;
        this.f179996l = preferences;
        this.f179997m = statisticsEventOnboarding;
        this.f179998n = dialogLauncher;
        this.f179999o = networkStateUtility;
        this.f180000p = messageManagerService;
        this.f180001q = libraryDialogFactory;
        this.f180002r = installationManagerService;
        this.f180003s = supportManagerDataService;
        this.f180004t = paymentsManager;
        this.f180005u = userAuthorizationService;
        this.f180006v = statisticsEventGeneric;
        this.f180007w = globalCoroutineScope;
    }

    @fg.i
    @NotNull
    public final Application a() {
        return this.f179989e;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.h b() {
        return this.f179993i;
    }

    @fg.i
    public final int c() {
        return this.f179988d;
    }

    @fg.i
    @NotNull
    public final Class<? extends FragmentController> d() {
        return this.f179985a.a();
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k e() {
        return this.f179998n;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.w f() {
        return this.f179994j;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.fragment.x g() {
        return this.f179987c;
    }

    @fg.i
    @NotNull
    public final f1 h() {
        return this.f180007w;
    }

    @fg.i
    @NotNull
    public final e1 i() {
        return this.f180002r;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.u j() {
        return this.f180001q;
    }

    @fg.i
    @NotNull
    public final u1 k() {
        return this.f179990f;
    }

    @fg.i
    @NotNull
    public final y1 l() {
        return this.f179986b;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.c2 m() {
        return this.f180000p;
    }

    @fg.i
    @NotNull
    public final h2 n() {
        return this.f179992h;
    }

    @fg.i
    @NotNull
    public final i2 o() {
        return this.f179985a;
    }

    @fg.i
    @NotNull
    public final c2 p() {
        return this.f179999o;
    }

    @fg.i
    @NotNull
    public final t2 q() {
        return this.f180004t;
    }

    @fg.i
    @NotNull
    public final le.n r(@NotNull l0 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.config.p s() {
        return this.f179996l;
    }

    @fg.i
    @NotNull
    public final r3 t() {
        return this.f180006v;
    }

    @fg.i
    @NotNull
    public final v3 u() {
        return this.f179997m;
    }

    @fg.i
    @NotNull
    public final q4 v() {
        return this.f180003s;
    }

    @fg.i
    @NotNull
    public final z4 w() {
        return this.f179995k;
    }

    @fg.i
    @NotNull
    public final p5 x() {
        return this.f179991g;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.modules.user.user.w y() {
        return this.f180005u;
    }
}
