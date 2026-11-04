package com.planner5d.library.activity.fragment.dialog.snapshots;

import com.planner5d.library.model.manager.y1;
import com.planner5d.library.modules.user.user.t0;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class m implements fg.g<SnapshotSetupDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t0> f132968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y1> f132969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f132970c;

    public m(ij.c<t0> cVar, ij.c<y1> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3) {
        this.f132968a = cVar;
        this.f132969b = cVar2;
        this.f132970c = cVar3;
    }

    public static fg.g<SnapshotSetupDialog> a(ij.c<t0> cVar, ij.c<y1> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3) {
        return new m(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.snapshots.SnapshotSetupDialog.dialogLauncher")
    public static void b(SnapshotSetupDialog snapshotSetupDialog, com.planner5d.library.activity.fragment.dialog.k kVar) {
        snapshotSetupDialog.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.snapshots.SnapshotSetupDialog.menuManager")
    public static void d(SnapshotSetupDialog snapshotSetupDialog, y1 y1Var) {
        snapshotSetupDialog.menuManager = y1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.snapshots.SnapshotSetupDialog.userPurchases")
    public static void e(SnapshotSetupDialog snapshotSetupDialog, t0 t0Var) {
        snapshotSetupDialog.userPurchases = t0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(SnapshotSetupDialog snapshotSetupDialog) {
        e(snapshotSetupDialog, this.f132968a.get());
        d(snapshotSetupDialog, this.f132969b.get());
        b(snapshotSetupDialog, this.f132970c.get());
    }
}
