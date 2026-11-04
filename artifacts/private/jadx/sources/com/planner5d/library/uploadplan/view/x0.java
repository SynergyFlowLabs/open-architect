package com.planner5d.library.uploadplan.view;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
public final class x0 implements fg.g<UploadPlanUploadFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ia.b> f231227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f231228b;

    public x0(ij.c<ia.b> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2) {
        this.f231227a = cVar;
        this.f231228b = cVar2;
    }

    public static fg.g<UploadPlanUploadFragment> a(ij.c<ia.b> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2) {
        return new x0(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.uploadplan.view.UploadPlanUploadFragment.featureConfigManager")
    public static void b(UploadPlanUploadFragment uploadPlanUploadFragment, com.planner5d.library.model.manager.config.j jVar) {
        uploadPlanUploadFragment.featureConfigManager = jVar;
    }

    @dagger.internal.j("com.planner5d.library.uploadplan.view.UploadPlanUploadFragment.paywallStrategy")
    public static void d(UploadPlanUploadFragment uploadPlanUploadFragment, ia.b bVar) {
        uploadPlanUploadFragment.paywallStrategy = bVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(UploadPlanUploadFragment uploadPlanUploadFragment) {
        d(uploadPlanUploadFragment, this.f231227a.get());
        b(uploadPlanUploadFragment, this.f231228b.get());
    }
}
