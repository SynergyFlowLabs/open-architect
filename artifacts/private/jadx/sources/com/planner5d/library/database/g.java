package com.planner5d.library.database;

import android.app.Application;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<ApplicationDatabase.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f154028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.migration.r> f154029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<ad.b> f154030c;

    public g(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.database.migration.r> migrationsProvider, ij.c<ad.b> loggingMiddlewareProvider) {
        this.f154028a = applicationProvider;
        this.f154029b = migrationsProvider;
        this.f154030c = loggingMiddlewareProvider;
    }

    public static g a(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.database.migration.r> migrationsProvider, ij.c<ad.b> loggingMiddlewareProvider) {
        return new g(applicationProvider, migrationsProvider, loggingMiddlewareProvider);
    }

    public static ApplicationDatabase.a c(Application application, com.planner5d.library.database.migration.r migrations, ad.b loggingMiddleware) {
        return new ApplicationDatabase.a(application, migrations, loggingMiddleware);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ApplicationDatabase.a get() {
        return c(this.f154028a.get(), this.f154029b.get(), this.f154030c.get());
    }
}
