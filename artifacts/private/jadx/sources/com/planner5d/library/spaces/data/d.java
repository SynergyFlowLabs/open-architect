package com.planner5d.library.spaces.data;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.k;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.f1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s("com.planner5d.library.spaces.application.SpacesScope")
public final class d implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f230108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<k> f230109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<fe.a> f230110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<fe.b> f230111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<f1> f230112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<p> f230113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<e> f230114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<w> f230115h;

    public d(ij.c<com.planner5d.library.api.requests.c> apiProvider, ij.c<k> crashReporterServiceProvider, ij.c<fe.a> findHouseInfoUseCaseProvider, ij.c<fe.b> findProjectUseCaseProvider, ij.c<f1> globalScopeProvider, ij.c<p> sharedPreferencesProvider, ij.c<e> spacesManagerServiceProvider, ij.c<w> userAuthorizationServiceProvider) {
        this.f230108a = apiProvider;
        this.f230109b = crashReporterServiceProvider;
        this.f230110c = findHouseInfoUseCaseProvider;
        this.f230111d = findProjectUseCaseProvider;
        this.f230112e = globalScopeProvider;
        this.f230113f = sharedPreferencesProvider;
        this.f230114g = spacesManagerServiceProvider;
        this.f230115h = userAuthorizationServiceProvider;
    }

    public static d a(ij.c<com.planner5d.library.api.requests.c> apiProvider, ij.c<k> crashReporterServiceProvider, ij.c<fe.a> findHouseInfoUseCaseProvider, ij.c<fe.b> findProjectUseCaseProvider, ij.c<f1> globalScopeProvider, ij.c<p> sharedPreferencesProvider, ij.c<e> spacesManagerServiceProvider, ij.c<w> userAuthorizationServiceProvider) {
        return new d(apiProvider, crashReporterServiceProvider, findHouseInfoUseCaseProvider, findProjectUseCaseProvider, globalScopeProvider, sharedPreferencesProvider, spacesManagerServiceProvider, userAuthorizationServiceProvider);
    }

    public static a c(com.planner5d.library.api.requests.c api, k crashReporterService, fe.a findHouseInfoUseCase, fe.b findProjectUseCase, f1 globalScope, p sharedPreferences, e spacesManagerService, w userAuthorizationService) {
        return new a(api, crashReporterService, findHouseInfoUseCase, findProjectUseCase, globalScope, sharedPreferences, spacesManagerService, userAuthorizationService);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f230108a.get(), this.f230109b.get(), this.f230110c.get(), this.f230111d.get(), this.f230112e.get(), this.f230113f.get(), this.f230114g.get(), this.f230115h.get());
    }
}
