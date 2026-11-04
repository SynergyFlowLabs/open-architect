package com.planner5d.library.activity.fragment.dialog.authentication;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class a0 implements fg.g<AuthenticationExternalService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.auth.r> f131740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.b> f131741b;

    public a0(ij.c<com.planner5d.library.modules.user.auth.r> cVar, ij.c<com.planner5d.library.modules.user.user.b> cVar2) {
        this.f131740a = cVar;
        this.f131741b = cVar2;
    }

    public static fg.g<AuthenticationExternalService> a(ij.c<com.planner5d.library.modules.user.auth.r> cVar, ij.c<com.planner5d.library.modules.user.user.b> cVar2) {
        return new a0(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationExternalService.actionAfterLogInStandard")
    public static void b(AuthenticationExternalService authenticationExternalService, com.planner5d.library.modules.user.user.b bVar) {
        authenticationExternalService.actionAfterLogInStandard = bVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationExternalService.socialServiceAuthorization")
    public static void d(AuthenticationExternalService authenticationExternalService, com.planner5d.library.modules.user.auth.r rVar) {
        authenticationExternalService.socialServiceAuthorization = rVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(AuthenticationExternalService authenticationExternalService) {
        d(authenticationExternalService, this.f131740a.get());
        b(authenticationExternalService, this.f131741b.get());
    }
}
