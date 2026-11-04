package com.planner5d.library.services.download;

import dagger.internal.r;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
public final class f implements fg.g<DownloadService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.k> f224278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.service.b> f224279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<d> f224280c;

    public f(ij.c<com.planner5d.library.model.manager.k> cVar, ij.c<com.planner5d.library.services.service.b> cVar2, ij.c<d> cVar3) {
        this.f224278a = cVar;
        this.f224279b = cVar2;
        this.f224280c = cVar3;
    }

    public static fg.g<DownloadService> a(ij.c<com.planner5d.library.model.manager.k> cVar, ij.c<com.planner5d.library.services.service.b> cVar2, ij.c<d> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.services.download.DownloadService.crashReporter")
    public static void b(DownloadService downloadService, fg.e<com.planner5d.library.model.manager.k> eVar) {
        downloadService.f224241a = eVar;
    }

    @dagger.internal.j("com.planner5d.library.services.download.DownloadService.foregroundServiceWatchdog")
    public static void c(DownloadService downloadService, com.planner5d.library.services.service.b bVar) {
        downloadService.f224242b = bVar;
    }

    @dagger.internal.j("com.planner5d.library.services.download.DownloadService.status")
    public static void e(DownloadService downloadService, fg.e<d> eVar) {
        downloadService.f224243c = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DownloadService downloadService) {
        b(downloadService, dagger.internal.g.a(this.f224278a));
        c(downloadService, this.f224279b.get());
        e(downloadService, dagger.internal.g.a(this.f224280c));
    }
}
