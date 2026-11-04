package com.planner5d.library.spaces.application;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.model.manager.w;
import com.planner5d.library.services.utility.f1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@fg.h
@w0(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f229985m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f229986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.h f229987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w f229988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.k f229989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.q f229990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c2 f229991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f229992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c4 f229993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.e f229994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f229995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f1 f229996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f229997l;

    public static final class a implements com.planner5d.library.rabbitmq.h {
        a() {
        }

        @Override // com.planner5d.library.rabbitmq.h
        public Object a(kotlin.coroutines.d<? super String> dVar) {
            return f.this.f229987b.f(dVar);
        }
    }

    public f(@NotNull Application application, @NotNull com.planner5d.library.model.manager.h configManagerService, @NotNull w featureConfigManagerService, @NotNull com.planner5d.library.model.manager.k crashReporterService, @NotNull com.planner5d.library.services.q imageManagerService, @NotNull c2 messageManagerService, @NotNull com.planner5d.library.model.manager.config.p sharedPreferences, @NotNull c4 statisticsEventSpaces, @NotNull com.planner5d.library.spaces.data.e spacesManagerService, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull f1 globalCoroutineScope, @NotNull com.planner5d.library.modules.user.user.w userAuthorizationService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configManagerService, "configManagerService");
        Intrinsics.checkNotNullParameter(featureConfigManagerService, "featureConfigManagerService");
        Intrinsics.checkNotNullParameter(crashReporterService, "crashReporterService");
        Intrinsics.checkNotNullParameter(imageManagerService, "imageManagerService");
        Intrinsics.checkNotNullParameter(messageManagerService, "messageManagerService");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        Intrinsics.checkNotNullParameter(spacesManagerService, "spacesManagerService");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        this.f229986a = application;
        this.f229987b = configManagerService;
        this.f229988c = featureConfigManagerService;
        this.f229989d = crashReporterService;
        this.f229990e = imageManagerService;
        this.f229991f = messageManagerService;
        this.f229992g = sharedPreferences;
        this.f229993h = statisticsEventSpaces;
        this.f229994i = spacesManagerService;
        this.f229995j = userApiRequester;
        this.f229996k = globalCoroutineScope;
        this.f229997l = userAuthorizationService;
    }

    @fg.i
    @NotNull
    public final Application b() {
        return this.f229986a;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.k c() {
        return this.f229989d;
    }

    @fg.i
    @NotNull
    public final w d() {
        return this.f229988c;
    }

    @fg.i
    @NotNull
    public final fe.a e(@NotNull com.planner5d.library.spaces.interactor.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final fe.b f(@NotNull com.planner5d.library.spaces.interactor.c interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final f1 g() {
        return this.f229996k;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.q h() {
        return this.f229990e;
    }

    @fg.i
    @NotNull
    public final c2 i() {
        return this.f229991f;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.rabbitmq.h j() {
        return new a();
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.config.p k() {
        return this.f229992g;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.spaces.data.e l() {
        return this.f229994i;
    }

    @fg.i
    @NotNull
    public final c4 m() {
        return this.f229993h;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.api.requests.c n() {
        return this.f229995j;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.modules.user.user.w o() {
        return this.f229997l;
    }
}
