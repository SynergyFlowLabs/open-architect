package com.planner5d.library.activity.fragment.profile.edit;

import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class j implements fg.g<ProfileEditFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.auth.r> f134611a;

    public j(ij.c<com.planner5d.library.modules.user.auth.r> cVar) {
        this.f134611a = cVar;
    }

    public static fg.g<ProfileEditFragment> a(ij.c<com.planner5d.library.modules.user.auth.r> cVar) {
        return new j(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.profile.edit.ProfileEditFragment.socialServiceAuthorization")
    public static void c(ProfileEditFragment profileEditFragment, com.planner5d.library.modules.user.auth.r rVar) {
        profileEditFragment.socialServiceAuthorization = rVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ProfileEditFragment profileEditFragment) {
        c(profileEditFragment, this.f134611a.get());
    }
}
