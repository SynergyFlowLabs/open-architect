package com.planner5d.library.activity.fragment.profile.about;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.services.u;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class d implements g<AboutFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c2> f134532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<k> f134533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<o4> f134534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<u> f134535d;

    public d(ij.c<c2> cVar, ij.c<k> cVar2, ij.c<o4> cVar3, ij.c<u> cVar4) {
        this.f134532a = cVar;
        this.f134533b = cVar2;
        this.f134534c = cVar3;
        this.f134535d = cVar4;
    }

    public static g<AboutFragment> a(ij.c<c2> cVar, ij.c<k> cVar2, ij.c<o4> cVar3, ij.c<u> cVar4) {
        return new d(cVar, cVar2, cVar3, cVar4);
    }

    @j("com.planner5d.library.activity.fragment.profile.about.AboutFragment.dialogLauncher")
    public static void b(AboutFragment aboutFragment, k kVar) {
        aboutFragment.dialogLauncher = kVar;
    }

    @j("com.planner5d.library.activity.fragment.profile.about.AboutFragment.libraryDialogFactory")
    public static void c(AboutFragment aboutFragment, u uVar) {
        aboutFragment.libraryDialogFactory = uVar;
    }

    @j("com.planner5d.library.activity.fragment.profile.about.AboutFragment.messageManager")
    public static void e(AboutFragment aboutFragment, c2 c2Var) {
        aboutFragment.messageManager = c2Var;
    }

    @j("com.planner5d.library.activity.fragment.profile.about.AboutFragment.supportManager")
    public static void f(AboutFragment aboutFragment, o4 o4Var) {
        aboutFragment.supportManager = o4Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(AboutFragment aboutFragment) {
        e(aboutFragment, this.f134532a.get());
        b(aboutFragment, this.f134533b.get());
        f(aboutFragment, this.f134534c.get());
        c(aboutFragment, this.f134535d.get());
    }
}
