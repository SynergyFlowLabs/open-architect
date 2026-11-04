package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class x implements fg.g<AuthenticationSignInEnterCode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.b> f131972a;

    public x(ij.c<com.planner5d.library.modules.user.user.b> cVar) {
        this.f131972a = cVar;
    }

    public static fg.g<AuthenticationSignInEnterCode> a(ij.c<com.planner5d.library.modules.user.user.b> cVar) {
        return new x(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCode.actionAfterLogInStandard")
    public static void b(AuthenticationSignInEnterCode authenticationSignInEnterCode, com.planner5d.library.modules.user.user.b bVar) {
        authenticationSignInEnterCode.actionAfterLogInStandard = bVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(AuthenticationSignInEnterCode authenticationSignInEnterCode) {
        b(authenticationSignInEnterCode, this.f131972a.get());
    }
}
