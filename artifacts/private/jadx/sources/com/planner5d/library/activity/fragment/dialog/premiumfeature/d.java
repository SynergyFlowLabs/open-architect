package com.planner5d.library.activity.fragment.dialog.premiumfeature;

import com.planner5d.library.activity.fragment.dialog.k;
import dagger.internal.e;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
public final class d implements g<PremiumFeaturesDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f132236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ia.b> f132237b;

    public d(ij.c<k> cVar, ij.c<ia.b> cVar2) {
        this.f132236a = cVar;
        this.f132237b = cVar2;
    }

    public static g<PremiumFeaturesDialog> a(ij.c<k> cVar, ij.c<ia.b> cVar2) {
        return new d(cVar, cVar2);
    }

    @j("com.planner5d.library.activity.fragment.dialog.premiumfeature.PremiumFeaturesDialog.dialogLauncher")
    public static void b(PremiumFeaturesDialog premiumFeaturesDialog, k kVar) {
        premiumFeaturesDialog.dialogLauncher = kVar;
    }

    @j("com.planner5d.library.activity.fragment.dialog.premiumfeature.PremiumFeaturesDialog.paywallStrategy")
    public static void d(PremiumFeaturesDialog premiumFeaturesDialog, ia.b bVar) {
        premiumFeaturesDialog.paywallStrategy = bVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PremiumFeaturesDialog premiumFeaturesDialog) {
        b(premiumFeaturesDialog, this.f132236a.get());
        d(premiumFeaturesDialog, this.f132237b.get());
    }
}
