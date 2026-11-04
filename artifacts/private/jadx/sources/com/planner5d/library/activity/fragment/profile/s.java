package com.planner5d.library.activity.fragment.profile;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class s implements fg.g<ProfileFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ia.b> f134849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f134850b;

    public s(ij.c<ia.b> cVar, ij.c<com.planner5d.library.activity.fragment.x> cVar2) {
        this.f134849a = cVar;
        this.f134850b = cVar2;
    }

    public static fg.g<ProfileFragment> a(ij.c<ia.b> cVar, ij.c<com.planner5d.library.activity.fragment.x> cVar2) {
        return new s(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.profile.ProfileFragment.navigator")
    public static void c(ProfileFragment profileFragment, com.planner5d.library.activity.fragment.x xVar) {
        profileFragment.navigator = xVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.profile.ProfileFragment.paywallStrategy")
    public static void d(ProfileFragment profileFragment, ia.b bVar) {
        profileFragment.paywallStrategy = bVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ProfileFragment profileFragment) {
        d(profileFragment, this.f134849a.get());
        c(profileFragment, this.f134850b.get());
    }
}
