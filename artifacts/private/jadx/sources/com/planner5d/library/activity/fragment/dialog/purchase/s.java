package com.planner5d.library.activity.fragment.dialog.purchase;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.o0;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.modules.user.user.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nPurchaseDialogFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseDialogFactory.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseDialogFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
public final class s implements t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f132758f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f132759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.n> f132760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<t0> f132761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.w> f132762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.activity.fragment.dialog.k> f132763e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132764a;

        static {
            int[] iArr = new int[fd.e.values().length];
            try {
                iArr[fd.e.PremiumGreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.e.PremiumGreenSquare.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fd.e.ProGreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fd.e.ProGreenSquare.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f132764a = iArr;
        }
    }

    @ij.a
    public s(@NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull fg.e<com.planner5d.library.model.manager.config.n> purchasePlacementManager, @NotNull fg.e<t0> userPurchases, @NotNull fg.e<com.planner5d.library.modules.user.user.w> userAuthorizationService, @NotNull fg.e<com.planner5d.library.activity.fragment.dialog.k> dialogLauncher) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(purchasePlacementManager, "purchasePlacementManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f132759a = featureConfigManager;
        this.f132760b = purchasePlacementManager;
        this.f132761c = userPurchases;
        this.f132762d = userAuthorizationService;
        this.f132763e = dialogLauncher;
    }

    private final PurchaseDialog g(com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, y3.c cVar, Bundle bundle, Function1<? super Boolean, Unit> function1) {
        com.planner5d.library.model.manager.config.purchaseplacement.b bVarP = p(aVar);
        if (bVarP != null) {
            return h(bVarP, false, cVar, bundle, function1);
        }
        return null;
    }

    private final PurchaseDialog h(com.planner5d.library.model.manager.config.purchaseplacement.b bVar, boolean z10, y3.c cVar, Bundle bundle, Function1<? super Boolean, Unit> function1) {
        if (q(bVar)) {
            return null;
        }
        PurchaseDialog purchaseDialogM = m(bVar, z10, function1);
        purchaseDialogM.setArguments(t(bundle, cVar, bVar.e(), z10));
        return purchaseDialogM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ PurchaseDialog i(s sVar, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, y3.c cVar, Bundle bundle, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.k(((Boolean) obj2).booleanValue());
                }
            };
        }
        return sVar.g(aVar, cVar, bundle, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ PurchaseDialog j(s sVar, com.planner5d.library.model.manager.config.purchaseplacement.b bVar, boolean z10, y3.c cVar, Bundle bundle, Function1 function1, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.l(((Boolean) obj2).booleanValue());
                }
            };
        }
        return sVar.h(bVar, z10, cVar, bundle, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(boolean z10) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(boolean z10) {
        return Unit.f312394a;
    }

    private final PurchaseDialog m(com.planner5d.library.model.manager.config.purchaseplacement.b bVar, boolean z10, Function1<? super Boolean, Unit> function1) {
        fd.e eVarC = null;
        if (z10) {
            if (bVar != null) {
                eVarC = bVar.a();
            }
        } else if (bVar != null) {
            eVarC = bVar.c();
        }
        int i10 = eVarC == null ? -1 : a.f132764a[eVarC.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? new PurchaseGreenDialog().setOnFinished(function1) : new PurchaseDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ PurchaseDialog n(s sVar, com.planner5d.library.model.manager.config.purchaseplacement.b bVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.o(((Boolean) obj2).booleanValue());
                }
            };
        }
        return sVar.m(bVar, z10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z10) {
        return Unit.f312394a;
    }

    private final com.planner5d.library.model.manager.config.purchaseplacement.b p(com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar) {
        return this.f132760b.get().c(aVar);
    }

    private final boolean r(com.planner5d.library.model.manager.config.purchaseplacement.b bVar) {
        if (this.f132761c.get().c()) {
            if (s(bVar != null ? bVar.c() : null)) {
                return true;
            }
        }
        return false;
    }

    private final boolean s(fd.e eVar) {
        return eVar == fd.e.PremiumReview || eVar == fd.e.PremiumGreen || eVar == fd.e.PremiumGreenSquare || eVar == fd.e.PremiumRecommendations || eVar == fd.e.PremiumBenefits;
    }

    private final Bundle t(Bundle bundle, y3.c cVar, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, boolean z10) {
        return new com.planner5d.library.services.utility.i(bundle).t(com.planner5d.library.services.r.source, cVar).t(com.planner5d.library.services.r.placementName, aVar).m(com.planner5d.library.services.r.fallback, z10).a();
    }

    public static /* synthetic */ Object x(s sVar, o0 o0Var, com.planner5d.library.activity.fragment.dialog.k kVar, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, y3.c cVar, Bundle bundle, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            bundle = null;
        }
        return sVar.v(o0Var, kVar, aVar, cVar, bundle, dVar);
    }

    public static /* synthetic */ Object y(s sVar, o0 o0Var, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, y3.c cVar, Bundle bundle, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            bundle = null;
        }
        return sVar.w(o0Var, aVar, cVar, bundle, dVar);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void a(@NotNull com.planner5d.library.activity.fragment.dialog.l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar) {
        t.a.c(this, lVar, aVar, cVar);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void b(@NotNull com.planner5d.library.activity.fragment.dialog.l presenter, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @Nullable y3.c cVar, @Nullable Bundle bundle, @NotNull Function1<? super Boolean, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        PurchaseDialog purchaseDialogG = g(placementName, cVar, bundle, onFinished);
        if (purchaseDialogG != null) {
            presenter.a(purchaseDialogG, PurchaseDialog.TAG);
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void c(@NotNull com.planner5d.library.activity.fragment.dialog.l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar, @Nullable Bundle bundle) {
        t.a.d(this, lVar, aVar, cVar, bundle);
    }

    public final boolean q(@Nullable com.planner5d.library.model.manager.config.purchaseplacement.b bVar) {
        com.planner5d.library.model.manager.config.purchaseplacement.b.a aVarE;
        if (!this.f132759a.get().a(com.planner5d.library.model.manager.config.f.ProAndroid)) {
            return r(bVar);
        }
        id.a aVarA = this.f132762d.get().a();
        if (aVarA == null || !aVarA.g()) {
            if (Intrinsics.areEqual("compare_plans_pro", (bVar == null || (aVarE = bVar.e()) == null) ? null : aVarE.n()) || !r(bVar)) {
                return false;
            }
        }
        return true;
    }

    public final void u(@NotNull com.planner5d.library.activity.fragment.dialog.l presenter, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b placement, boolean z10, @Nullable y3.c cVar, @Nullable Bundle bundle, @NotNull Function1<? super Boolean, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        PurchaseDialog purchaseDialogH = h(placement, z10, cVar, bundle, onFinished);
        if (purchaseDialogH != null) {
            presenter.a(purchaseDialogH, PurchaseDialog.TAG);
        }
    }

    @Nullable
    public final Object v(@NotNull o0 o0Var, @NotNull com.planner5d.library.activity.fragment.dialog.k kVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar, @Nullable Bundle bundle, @NotNull kotlin.coroutines.d<? super Bundle> dVar) {
        PurchaseDialog purchaseDialogI = i(this, aVar, cVar, bundle, null, 8, null);
        if (purchaseDialogI == null) {
            return null;
        }
        Object objE = kVar.e(o0Var, purchaseDialogI, PurchaseDialog.TAG, dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : (Bundle) objE;
    }

    @Nullable
    public final Object w(@NotNull o0 o0Var, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar, @Nullable Bundle bundle, @NotNull kotlin.coroutines.d<? super Bundle> dVar) {
        PurchaseDialog purchaseDialogI = i(this, aVar, cVar, bundle, null, 8, null);
        if (purchaseDialogI == null) {
            return null;
        }
        Object objE = this.f132763e.get().e(o0Var, purchaseDialogI, PurchaseDialog.TAG, dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : (Bundle) objE;
    }
}
