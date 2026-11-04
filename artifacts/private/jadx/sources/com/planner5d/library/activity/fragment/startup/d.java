package com.planner5d.library.activity.fragment.startup;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class d implements fg.g<OnboardingSignInDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<e> f136458a;

    public d(ij.c<e> cVar) {
        this.f136458a = cVar;
    }

    public static fg.g<OnboardingSignInDialog> a(ij.c<e> cVar) {
        return new d(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.OnboardingSignInDialog.oneLinkDeeplinkHandler")
    public static void c(OnboardingSignInDialog onboardingSignInDialog, e eVar) {
        onboardingSignInDialog.oneLinkDeeplinkHandler = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(OnboardingSignInDialog onboardingSignInDialog) {
        c(onboardingSignInDialog, this.f136458a.get());
    }
}
