package com.planner5d.library.uploadplan.view;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
public final class g0 implements fg.g<UploadPlanScaleRulerFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f231029a;

    public g0(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar) {
        this.f231029a = cVar;
    }

    public static fg.g<UploadPlanScaleRulerFragment> a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar) {
        return new g0(cVar);
    }

    @dagger.internal.j("com.planner5d.library.uploadplan.view.UploadPlanScaleRulerFragment.dialogLauncher")
    public static void b(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment, com.planner5d.library.activity.fragment.dialog.k kVar) {
        uploadPlanScaleRulerFragment.dialogLauncher = kVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment) {
        b(uploadPlanScaleRulerFragment, this.f231029a.get());
    }
}
