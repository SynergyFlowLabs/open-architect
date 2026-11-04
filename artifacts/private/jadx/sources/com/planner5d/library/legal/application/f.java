package com.planner5d.library.legal.application;

import com.planner5d.library.model.manager.h2;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.model.manager.statistics.d0;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.modules.user.user.r0;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@fg.h
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p5 f180323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.h f180324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h2 f180325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f180326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final r0 f180327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final w f180328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final d0 f180329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c2 f180330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final u1 f180331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final f1 f180332j;

    public f(@NotNull p5 uriViewerService, @NotNull com.planner5d.library.model.manager.h configManagerService, @NotNull h2 missingActivityForUriHandler, @NotNull com.planner5d.library.model.manager.config.p sharedPreferencesManager, @NotNull r0 userPropertiesService, @NotNull w userAuthorizationService, @NotNull d0 statisticsManagerService, @NotNull c2 networkStateUtility, @NotNull u1 logRecordManagerService, @NotNull f1 globalCoroutineScope) {
        Intrinsics.checkNotNullParameter(uriViewerService, "uriViewerService");
        Intrinsics.checkNotNullParameter(configManagerService, "configManagerService");
        Intrinsics.checkNotNullParameter(missingActivityForUriHandler, "missingActivityForUriHandler");
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(userPropertiesService, "userPropertiesService");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(statisticsManagerService, "statisticsManagerService");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(logRecordManagerService, "logRecordManagerService");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        this.f180323a = uriViewerService;
        this.f180324b = configManagerService;
        this.f180325c = missingActivityForUriHandler;
        this.f180326d = sharedPreferencesManager;
        this.f180327e = userPropertiesService;
        this.f180328f = userAuthorizationService;
        this.f180329g = statisticsManagerService;
        this.f180330h = networkStateUtility;
        this.f180331i = logRecordManagerService;
        this.f180332j = globalCoroutineScope;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.h a() {
        return this.f180324b;
    }

    @fg.i
    @NotNull
    public final f1 b() {
        return this.f180332j;
    }

    @fg.i
    @NotNull
    public final u1 c() {
        return this.f180331i;
    }

    @fg.i
    @NotNull
    public final h2 d() {
        return this.f180325c;
    }

    @fg.i
    @NotNull
    public final c2 e() {
        return this.f180330h;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.config.p f() {
        return this.f180326d;
    }

    @fg.i
    @NotNull
    public final d0 g() {
        return this.f180329g;
    }

    @fg.i
    @NotNull
    public final p5 h() {
        return this.f180323a;
    }

    @fg.i
    @NotNull
    public final w i() {
        return this.f180328f;
    }

    @fg.i
    @NotNull
    public final r0 j() {
        return this.f180327e;
    }
}
