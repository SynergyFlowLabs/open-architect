package com.planner5d.library.activity.fragment.dialog;

import com.planner5d.library.activity.helper.j2;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.manager.b2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class k0 implements fg.g<RemovePersonalData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f132127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.m0> f132128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f132129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<m2> f132130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<j2> f132131e;

    public k0(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.modules.user.user.m0> cVar2, ij.c<b2> cVar3, ij.c<m2> cVar4, ij.c<j2> cVar5) {
        this.f132127a = cVar;
        this.f132128b = cVar2;
        this.f132129c = cVar3;
        this.f132130d = cVar4;
        this.f132131e = cVar5;
    }

    public static fg.g<RemovePersonalData> a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.modules.user.user.m0> cVar2, ij.c<b2> cVar3, ij.c<m2> cVar4, ij.c<j2> cVar5) {
        return new k0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.RemovePersonalData.messageManager")
    public static void c(RemovePersonalData removePersonalData, b2 b2Var) {
        removePersonalData.f131645q3 = b2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.RemovePersonalData.missingActivityForUriHandler")
    public static void d(RemovePersonalData removePersonalData, j2 j2Var) {
        removePersonalData.f131647s3 = j2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.RemovePersonalData.uriViewer")
    public static void e(RemovePersonalData removePersonalData, m2 m2Var) {
        removePersonalData.f131646r3 = m2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.RemovePersonalData.userAuthorization")
    public static void f(RemovePersonalData removePersonalData, com.planner5d.library.modules.user.user.t tVar) {
        removePersonalData.f131643o3 = tVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.RemovePersonalData.userPrivateData")
    public static void g(RemovePersonalData removePersonalData, com.planner5d.library.modules.user.user.m0 m0Var) {
        removePersonalData.f131644p3 = m0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(RemovePersonalData removePersonalData) {
        f(removePersonalData, this.f132127a.get());
        g(removePersonalData, this.f132128b.get());
        c(removePersonalData, this.f132129c.get());
        e(removePersonalData, this.f132130d.get());
        d(removePersonalData, this.f132131e.get());
    }
}
