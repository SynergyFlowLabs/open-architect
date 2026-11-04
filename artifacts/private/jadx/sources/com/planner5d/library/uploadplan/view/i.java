package com.planner5d.library.uploadplan.view;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
public final class i implements fg.g<UploadPlanCreateFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.b0> f231047a;

    public i(ij.c<com.planner5d.library.model.manager.payments.b0> cVar) {
        this.f231047a = cVar;
    }

    public static fg.g<UploadPlanCreateFragment> a(ij.c<com.planner5d.library.model.manager.payments.b0> cVar) {
        return new i(cVar);
    }

    @dagger.internal.j("com.planner5d.library.uploadplan.view.UploadPlanCreateFragment.superwallUseCase")
    public static void c(UploadPlanCreateFragment uploadPlanCreateFragment, com.planner5d.library.model.manager.payments.b0 b0Var) {
        uploadPlanCreateFragment.superwallUseCase = b0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(UploadPlanCreateFragment uploadPlanCreateFragment) {
        c(uploadPlanCreateFragment, this.f231047a.get());
    }
}
