package com.planner5d.library.contest.application;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.list.o1;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.model.manager.y2;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.p0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@fg.h
@w0(parameters = 0)
public final class b {
    public static final int D = 8;

    @NotNull
    private final com.planner5d.library.contest.helper.b A;

    @NotNull
    private final com.planner5d.library.model.manager.w B;

    @NotNull
    private final o1 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f148397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f148398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f148399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y1 f148400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final l3 f148401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final r3 f148402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c2 f148403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.o1 f148404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.c2 f148405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final p0 f148406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f148407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.k f148408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.d f148409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f148410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f148411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final x2 f148412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.v f148413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final y2 f148414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final p5 f148415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.helper.g f148416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.q f148417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.i f148418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.k f148419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f148420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final f1 f148421y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.view.b0 f148422z;

    public b(@NotNull Application application, @NotNull com.planner5d.library.activity.fragment.x fragmentControllerNavigator, @NotNull ErrorMessageParser errorMessageParser, @NotNull y1 menuManager, @NotNull l3 statisticsEventContests, @NotNull r3 statisticsEventGeneric, @NotNull c2 messageManagerService, @NotNull com.planner5d.library.model.manager.o1 languageManagerService, @NotNull com.planner5d.library.services.utility.c2 networkStateUtility, @NotNull p0 formatter, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.model.manager.synchronization.k synchronizationManagerService, @NotNull com.planner5d.library.contest.d contestsSynchronizationExecutor, @NotNull com.planner5d.library.modules.user.user.w userAuthorizationService, @NotNull com.planner5d.library.model.manager.config.p sharedPreferencesManager, @NotNull x2 purchaseUnlocksItemsConfiguration, @NotNull com.planner5d.library.services.v mainComponentsProvider, @NotNull y2 rateUsManagerService, @NotNull p5 uriViewerService, @NotNull com.planner5d.library.contest.helper.g projectDestinationFactory, @NotNull com.planner5d.library.services.q imageManagerService, @NotNull com.planner5d.library.contest.data.i contestManagerService, @NotNull com.planner5d.library.contest.data.k projectManagerService, @NotNull com.planner5d.library.services.utility.t coroutineDispatchersProvider, @NotNull f1 globalCoroutineScope, @NotNull com.planner5d.library.contest.view.b0 contestViewProvider, @NotNull com.planner5d.library.contest.helper.b contestProjectSharer, @NotNull com.planner5d.library.model.manager.w featureConfigManagerService, @NotNull o1 synchronizationObserver) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fragmentControllerNavigator, "fragmentControllerNavigator");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(statisticsEventContests, "statisticsEventContests");
        Intrinsics.checkNotNullParameter(statisticsEventGeneric, "statisticsEventGeneric");
        Intrinsics.checkNotNullParameter(messageManagerService, "messageManagerService");
        Intrinsics.checkNotNullParameter(languageManagerService, "languageManagerService");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(synchronizationManagerService, "synchronizationManagerService");
        Intrinsics.checkNotNullParameter(contestsSynchronizationExecutor, "contestsSynchronizationExecutor");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(purchaseUnlocksItemsConfiguration, "purchaseUnlocksItemsConfiguration");
        Intrinsics.checkNotNullParameter(mainComponentsProvider, "mainComponentsProvider");
        Intrinsics.checkNotNullParameter(rateUsManagerService, "rateUsManagerService");
        Intrinsics.checkNotNullParameter(uriViewerService, "uriViewerService");
        Intrinsics.checkNotNullParameter(projectDestinationFactory, "projectDestinationFactory");
        Intrinsics.checkNotNullParameter(imageManagerService, "imageManagerService");
        Intrinsics.checkNotNullParameter(contestManagerService, "contestManagerService");
        Intrinsics.checkNotNullParameter(projectManagerService, "projectManagerService");
        Intrinsics.checkNotNullParameter(coroutineDispatchersProvider, "coroutineDispatchersProvider");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        Intrinsics.checkNotNullParameter(contestViewProvider, "contestViewProvider");
        Intrinsics.checkNotNullParameter(contestProjectSharer, "contestProjectSharer");
        Intrinsics.checkNotNullParameter(featureConfigManagerService, "featureConfigManagerService");
        Intrinsics.checkNotNullParameter(synchronizationObserver, "synchronizationObserver");
        this.f148397a = application;
        this.f148398b = fragmentControllerNavigator;
        this.f148399c = errorMessageParser;
        this.f148400d = menuManager;
        this.f148401e = statisticsEventContests;
        this.f148402f = statisticsEventGeneric;
        this.f148403g = messageManagerService;
        this.f148404h = languageManagerService;
        this.f148405i = networkStateUtility;
        this.f148406j = formatter;
        this.f148407k = dialogLauncher;
        this.f148408l = synchronizationManagerService;
        this.f148409m = contestsSynchronizationExecutor;
        this.f148410n = userAuthorizationService;
        this.f148411o = sharedPreferencesManager;
        this.f148412p = purchaseUnlocksItemsConfiguration;
        this.f148413q = mainComponentsProvider;
        this.f148414r = rateUsManagerService;
        this.f148415s = uriViewerService;
        this.f148416t = projectDestinationFactory;
        this.f148417u = imageManagerService;
        this.f148418v = contestManagerService;
        this.f148419w = projectManagerService;
        this.f148420x = coroutineDispatchersProvider;
        this.f148421y = globalCoroutineScope;
        this.f148422z = contestViewProvider;
        this.A = contestProjectSharer;
        this.B = featureConfigManagerService;
        this.C = synchronizationObserver;
    }

    @fg.i
    @NotNull
    public final o1 A() {
        return this.C;
    }

    @fg.i
    @NotNull
    public final p5 B() {
        return this.f148415s;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.modules.user.user.w C() {
        return this.f148410n;
    }

    @fg.i
    @NotNull
    public final Application a() {
        return this.f148397a;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.contest.data.i b() {
        return this.f148418v;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.contest.helper.b c() {
        return this.A;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.contest.view.b0 d() {
        return this.f148422z;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.contest.d e() {
        return this.f148409m;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.synchronization.k f() {
        return this.f148408l;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.utility.t g() {
        return this.f148420x;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k h() {
        return this.f148407k;
    }

    @fg.i
    @NotNull
    public final ErrorMessageParser i() {
        return this.f148399c;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.w j() {
        return this.B;
    }

    @fg.i
    @NotNull
    public final p0 k() {
        return this.f148406j;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.fragment.x l() {
        return this.f148398b;
    }

    @fg.i
    @NotNull
    public final f1 m() {
        return this.f148421y;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.q n() {
        return this.f148417u;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.o1 o() {
        return this.f148404h;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.v p() {
        return this.f148413q;
    }

    @fg.i
    @NotNull
    public final y1 q() {
        return this.f148400d;
    }

    @fg.i
    @NotNull
    public final c2 r() {
        return this.f148403g;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.utility.c2 s() {
        return this.f148405i;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.contest.helper.g t() {
        return this.f148416t;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.contest.data.k u() {
        return this.f148419w;
    }

    @fg.i
    @NotNull
    public final x2 v() {
        return this.f148412p;
    }

    @fg.i
    @NotNull
    public final y2 w() {
        return this.f148414r;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.config.p x() {
        return this.f148411o;
    }

    @fg.i
    @NotNull
    public final l3 y() {
        return this.f148401e;
    }

    @fg.i
    @NotNull
    public final r3 z() {
        return this.f148402f;
    }
}
