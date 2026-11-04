package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class w0 implements fg.g<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f137187a;

    public w0(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar) {
        this.f137187a = cVar;
    }

    public static fg.g<t0> a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar) {
        return new w0(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPermissions.dialogLauncher")
    public static void b(t0 t0Var, com.planner5d.library.activity.fragment.dialog.k kVar) {
        t0Var.f137119c = kVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(t0 t0Var) {
        b(t0Var, this.f137187a.get());
    }
}
