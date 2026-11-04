package com.planner5d.library.activity.fragment.dialog.projectsettings;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class q0 implements fg.g<ProjectSettingsBottomSheetDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f132296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f132297b;

    public q0(ij.c<com.planner5d.library.services.utility.p0> cVar, ij.c<com.planner5d.library.activity.fragment.x> cVar2) {
        this.f132296a = cVar;
        this.f132297b = cVar2;
    }

    public static fg.g<ProjectSettingsBottomSheetDialog> a(ij.c<com.planner5d.library.services.utility.p0> cVar, ij.c<com.planner5d.library.activity.fragment.x> cVar2) {
        return new q0(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsBottomSheetDialog.formatter")
    public static void b(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, com.planner5d.library.services.utility.p0 p0Var) {
        projectSettingsBottomSheetDialog.formatter = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsBottomSheetDialog.navigator")
    public static void d(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, com.planner5d.library.activity.fragment.x xVar) {
        projectSettingsBottomSheetDialog.navigator = xVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog) {
        b(projectSettingsBottomSheetDialog, this.f132296a.get());
        d(projectSettingsBottomSheetDialog, this.f132297b.get());
    }
}
