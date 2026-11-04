package com.planner5d.library.activity.fragment.dialog;

import com.planner5d.library.model.manager.b4;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class q implements fg.g<FolderSelection> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.c0> f132835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f132836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b4> f132837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f132838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<p0> f132839e;

    public q(ij.c<com.planner5d.library.model.manager.c0> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<b4> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<p0> cVar5) {
        this.f132835a = cVar;
        this.f132836b = cVar2;
        this.f132837c = cVar3;
        this.f132838d = cVar4;
        this.f132839e = cVar5;
    }

    public static fg.g<FolderSelection> a(ij.c<com.planner5d.library.model.manager.c0> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<b4> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<p0> cVar5) {
        return new q(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.FolderSelection.folderManager")
    public static void b(FolderSelection folderSelection, com.planner5d.library.model.manager.c0 c0Var) {
        folderSelection.f131625o3 = c0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.FolderSelection.formatter")
    public static void c(FolderSelection folderSelection, p0 p0Var) {
        folderSelection.f131629s3 = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.FolderSelection.projectManager")
    public static void e(FolderSelection folderSelection, fg.e<com.planner5d.library.model.manager.project.d0> eVar) {
        folderSelection.f131626p3 = eVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.FolderSelection.snapshotManager")
    public static void f(FolderSelection folderSelection, fg.e<b4> eVar) {
        folderSelection.f131627q3 = eVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.FolderSelection.userAuthorization")
    public static void g(FolderSelection folderSelection, fg.e<com.planner5d.library.modules.user.user.t> eVar) {
        folderSelection.f131628r3 = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(FolderSelection folderSelection) {
        b(folderSelection, this.f132835a.get());
        e(folderSelection, dagger.internal.g.a(this.f132836b));
        f(folderSelection, dagger.internal.g.a(this.f132837c));
        g(folderSelection, dagger.internal.g.a(this.f132838d));
        c(folderSelection, this.f132839e.get());
    }
}
