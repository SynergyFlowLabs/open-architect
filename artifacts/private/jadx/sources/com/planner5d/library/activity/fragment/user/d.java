package com.planner5d.library.activity.fragment.user;

import com.planner5d.library.activity.fragment.n;
import com.planner5d.library.activity.helper.i0;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.manager.y1;
import dagger.internal.e;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
public final class d implements g<LicenseCheck> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i0> f136641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y1> f136642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<m2> f136643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n> f136644d;

    public d(ij.c<i0> cVar, ij.c<y1> cVar2, ij.c<m2> cVar3, ij.c<n> cVar4) {
        this.f136641a = cVar;
        this.f136642b = cVar2;
        this.f136643c = cVar3;
        this.f136644d = cVar4;
    }

    public static g<LicenseCheck> a(ij.c<i0> cVar, ij.c<y1> cVar2, ij.c<m2> cVar3, ij.c<n> cVar4) {
        return new d(cVar, cVar2, cVar3, cVar4);
    }

    @j("com.planner5d.library.activity.fragment.user.LicenseCheck.defaultFragmentProvider")
    public static void b(LicenseCheck licenseCheck, n nVar) {
        licenseCheck.f136632h = nVar;
    }

    @j("com.planner5d.library.activity.fragment.user.LicenseCheck.helperLicensing")
    public static void c(LicenseCheck licenseCheck, i0 i0Var) {
        licenseCheck.f136629e = i0Var;
    }

    @j("com.planner5d.library.activity.fragment.user.LicenseCheck.menuManager")
    public static void e(LicenseCheck licenseCheck, y1 y1Var) {
        licenseCheck.f136630f = y1Var;
    }

    @j("com.planner5d.library.activity.fragment.user.LicenseCheck.uriViewer")
    public static void f(LicenseCheck licenseCheck, m2 m2Var) {
        licenseCheck.f136631g = m2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(LicenseCheck licenseCheck) {
        c(licenseCheck, this.f136641a.get());
        e(licenseCheck, this.f136642b.get());
        f(licenseCheck, this.f136643c.get());
        b(licenseCheck, this.f136644d.get());
    }
}
