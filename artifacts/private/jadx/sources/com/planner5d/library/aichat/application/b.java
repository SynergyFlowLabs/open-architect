package com.planner5d.library.aichat.application;

import android.app.Application;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.statistics.events.i3;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.w;
import com.planner5d.library.modules.user.user.a0;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.services.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@fg.h
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f141898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f141899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.h f141900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w f141901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final a0 f141902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f141903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final i3 f141904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final va.b f141905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final va.c f141906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c2 f141907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final u0 f141908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final y f141909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final u1 f141910m;

    public b(@NotNull Application application, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.model.manager.h configManager, @NotNull w featureConfigManager, @NotNull a0 userAvatarService, @NotNull com.planner5d.library.modules.user.user.w userAuthorizationService, @NotNull i3 events, @NotNull va.b chatRepository, @NotNull va.c projectConversationRepository, @NotNull c2 messageManagerService, @NotNull u0 userPurchasesService, @NotNull y paywallService, @NotNull u1 logRecordManagerService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(userAvatarService, "userAvatarService");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(projectConversationRepository, "projectConversationRepository");
        Intrinsics.checkNotNullParameter(messageManagerService, "messageManagerService");
        Intrinsics.checkNotNullParameter(userPurchasesService, "userPurchasesService");
        Intrinsics.checkNotNullParameter(paywallService, "paywallService");
        Intrinsics.checkNotNullParameter(logRecordManagerService, "logRecordManagerService");
        this.f141898a = application;
        this.f141899b = userApiRequester;
        this.f141900c = configManager;
        this.f141901d = featureConfigManager;
        this.f141902e = userAvatarService;
        this.f141903f = userAuthorizationService;
        this.f141904g = events;
        this.f141905h = chatRepository;
        this.f141906i = projectConversationRepository;
        this.f141907j = messageManagerService;
        this.f141908k = userPurchasesService;
        this.f141909l = paywallService;
        this.f141910m = logRecordManagerService;
    }

    @fg.i
    @NotNull
    public final ya.a a(@NotNull com.planner5d.library.aichat.interactor.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final Application b() {
        return this.f141898a;
    }

    @fg.i
    @NotNull
    public final va.b c() {
        return this.f141905h;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.h d() {
        return this.f141900c;
    }

    @fg.i
    @NotNull
    public final w e() {
        return this.f141901d;
    }

    @fg.i
    @NotNull
    public final ya.b f(@NotNull com.planner5d.library.aichat.interactor.d interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final u1 g() {
        return this.f141910m;
    }

    @fg.i
    @NotNull
    public final c2 h() {
        return this.f141907j;
    }

    @fg.i
    @NotNull
    public final y i() {
        return this.f141909l;
    }

    @fg.i
    @NotNull
    public final va.c j() {
        return this.f141906i;
    }

    @fg.i
    @NotNull
    public final i3 k() {
        return this.f141904g;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.api.requests.c l() {
        return this.f141899b;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.modules.user.user.w m() {
        return this.f141903f;
    }

    @fg.i
    @NotNull
    public final a0 n() {
        return this.f141902e;
    }

    @fg.i
    @NotNull
    public final u0 o() {
        return this.f141908k;
    }
}
