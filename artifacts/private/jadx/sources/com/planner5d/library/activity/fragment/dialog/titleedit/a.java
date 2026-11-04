package com.planner5d.library.activity.fragment.dialog.titleedit;

import com.planner5d.library.model.manager.c0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.f1;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class a implements g<FolderEdit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c0> f133075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f133076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f133077c;

    public a(ij.c<c0> cVar, ij.c<t> cVar2, ij.c<f1> cVar3) {
        this.f133075a = cVar;
        this.f133076b = cVar2;
        this.f133077c = cVar3;
    }

    public static g<FolderEdit> a(ij.c<c0> cVar, ij.c<t> cVar2, ij.c<f1> cVar3) {
        return new a(cVar, cVar2, cVar3);
    }

    @j("com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit.coroutineScope")
    public static void b(FolderEdit folderEdit, f1 f1Var) {
        folderEdit.coroutineScope = f1Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit.folderManager")
    public static void c(FolderEdit folderEdit, c0 c0Var) {
        folderEdit.folderManager = c0Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit.userAuthorization")
    public static void e(FolderEdit folderEdit, t tVar) {
        folderEdit.userAuthorization = tVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(FolderEdit folderEdit) {
        c(folderEdit, this.f133075a.get());
        e(folderEdit, this.f133076b.get());
        b(folderEdit, this.f133077c.get());
    }
}
