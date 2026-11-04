package com.planner5d.library.activity.fragment.dialog.support;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.services.u;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class j implements fg.g<SupportDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c2> f133019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<u> f133020b;

    public j(ij.c<c2> cVar, ij.c<u> cVar2) {
        this.f133019a = cVar;
        this.f133020b = cVar2;
    }

    public static fg.g<SupportDialog> a(ij.c<c2> cVar, ij.c<u> cVar2) {
        return new j(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.support.SupportDialog.libraryDialogFactory")
    public static void b(SupportDialog supportDialog, u uVar) {
        supportDialog.libraryDialogFactory = uVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.support.SupportDialog.messageManager")
    public static void d(SupportDialog supportDialog, c2 c2Var) {
        supportDialog.messageManager = c2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(SupportDialog supportDialog) {
        d(supportDialog, this.f133019a.get());
        b(supportDialog, this.f133020b.get());
    }
}
