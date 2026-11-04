package com.planner5d.library.activity.fragment.compareplans;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.databinding.m0;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.textview.ButtonTextView;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComparePlansFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComparePlansFragment.kt\ncom/planner5d/library/activity/fragment/compareplans/ComparePlansFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,96:1\n12#2,6:97\n28#2:103\n257#3,2:104\n257#3,2:106\n*S KotlinDebug\n*F\n+ 1 ComparePlansFragment.kt\ncom/planner5d/library/activity/fragment/compareplans/ComparePlansFragment\n*L\n37#1:97,6\n37#1:103\n71#1:104,2\n74#1:106,2\n*E\n"})
public final class ComparePlansFragment extends FragmentController {
    public static final int $stable = 8;

    @ij.a
    public k dialogLauncher;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f131558e;

    @ij.a
    public ia.b paywallStrategy;

    @ij.a
    public t userAuthorization;

    @ij.a
    public t0 userPurchases;

    public ComparePlansFragment() {
        t3 t3Var = t3.f229751a;
        this.f131558e = new i2(j1.d(h.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    private final h C() {
        return (h) this.f131558e.getValue();
    }

    private final boolean D() {
        return getUserPurchases$P5D_Library_release().u(getUserAuthorization$P5D_Library_release().a()) && getUserPurchases$P5D_Library_release().Q() < 1;
    }

    private final void E() {
        androidx.navigation.w0 w0VarB;
        if (!this.f131538b.j() && (w0VarB = com.planner5d.library.util.navigation.k.f240224a.b(this)) != null) {
            w0VarB.A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(ComparePlansFragment comparePlansFragment, m0 m0Var) {
        if (comparePlansFragment.isVisible()) {
            m0Var.f159319f.setAdapter(new a(comparePlansFragment.C().U()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(ComparePlansFragment comparePlansFragment, y3.c cVar, View view) {
        com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar = com.planner5d.library.model.manager.config.purchaseplacement.b.a.compare_plans_pro;
        if (cVar == y3.c.snapshots) {
            cVar = y3.c.f217739w;
        }
        comparePlansFragment.I(aVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(ComparePlansFragment comparePlansFragment, j jVar, y3.c cVar, View view) {
        comparePlansFragment.I((jVar.f(r.snapshots, false) && comparePlansFragment.D()) ? com.planner5d.library.model.manager.config.purchaseplacement.b.a.snapshots : com.planner5d.library.model.manager.config.purchaseplacement.b.a.compare_plans_premium, cVar);
    }

    private final void I(com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, y3.c cVar) {
        getPaywallStrategy$P5D_Library_release().b(getDialogLauncher(), aVar, cVar, null, new Function1() { // from class: com.planner5d.library.activity.fragment.compareplans.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComparePlansFragment.J(this.f131575a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(ComparePlansFragment comparePlansFragment, boolean z10) {
        comparePlansFragment.E();
        return Unit.f312394a;
    }

    @NotNull
    public final k getDialogLauncher() {
        k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final ia.b getPaywallStrategy$P5D_Library_release() {
        ia.b bVar = this.paywallStrategy;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallStrategy");
        return null;
    }

    @NotNull
    public final t getUserAuthorization$P5D_Library_release() {
        t tVar = this.userAuthorization;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    @NotNull
    public final t0 getUserPurchases$P5D_Library_release() {
        t0 t0Var = this.userPurchases;
        if (t0Var != null) {
            return t0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userPurchases");
        boolean z10 = true | false;
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.application.b.f142455c.a().U0(this);
        final m0 m0VarD = m0.d(inflater, viewGroup, false);
        final j jVar = new j(getArguments());
        Serializable serializableS = jVar.s(r.source, y3.c.profile);
        Intrinsics.checkNotNull(serializableS, "null cannot be cast to non-null type com.planner5d.library.model.manager.statistics.events.StatisticsEventPurchase.Source");
        final y3.c cVar = (y3.c) serializableS;
        m0VarD.f159319f.post(new Runnable() { // from class: com.planner5d.library.activity.fragment.compareplans.b
            @Override // java.lang.Runnable
            public final void run() {
                ComparePlansFragment.F(this.f131568a, m0VarD);
            }
        });
        m0VarD.f159317d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.compareplans.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComparePlansFragment.G(this.f131570a, cVar, view);
            }
        });
        m0VarD.f159316c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.compareplans.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComparePlansFragment.H(this.f131572a, jVar, cVar, view);
            }
        });
        if (jVar.f(r.commercial, false) || getUserPurchases$P5D_Library_release().c()) {
            ButtonTextView continueWithPremium = m0VarD.f159316c;
            Intrinsics.checkNotNullExpressionValue(continueWithPremium, "continueWithPremium");
            continueWithPremium.setVisibility(8);
        }
        if (!jVar.f(r.newNavigation, true)) {
            Space space = m0VarD.f159320g;
            Intrinsics.checkNotNullExpressionValue(space, "space");
            space.setVisibility(8);
        }
        ConstraintLayout root = m0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void setDialogLauncher(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setPaywallStrategy$P5D_Library_release(@NotNull ia.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.paywallStrategy = bVar;
    }

    public final void setUserAuthorization$P5D_Library_release(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.userAuthorization = tVar;
    }

    public final void setUserPurchases$P5D_Library_release(@NotNull t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<set-?>");
        this.userPurchases = t0Var;
    }
}
