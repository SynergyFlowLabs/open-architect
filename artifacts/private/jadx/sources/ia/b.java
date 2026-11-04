package ia;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.l;
import com.planner5d.library.activity.fragment.dialog.purchase.s;
import com.planner5d.library.activity.fragment.dialog.purchase.t;
import com.planner5d.library.model.manager.config.n;
import com.planner5d.library.model.manager.statistics.events.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@ij.f
public final class b implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f287051e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<n> f287052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<s> f287053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<d> f287054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<g> f287055d;

    @ij.a
    public b(@NotNull fg.e<n> purchasePlacementManager, @NotNull fg.e<s> purchaseDialogFactory, @NotNull fg.e<d> dialogPaywallStrategy, @NotNull fg.e<g> superwallPaywallStrategy) {
        Intrinsics.checkNotNullParameter(purchasePlacementManager, "purchasePlacementManager");
        Intrinsics.checkNotNullParameter(purchaseDialogFactory, "purchaseDialogFactory");
        Intrinsics.checkNotNullParameter(dialogPaywallStrategy, "dialogPaywallStrategy");
        Intrinsics.checkNotNullParameter(superwallPaywallStrategy, "superwallPaywallStrategy");
        this.f287052a = purchasePlacementManager;
        this.f287053b = purchaseDialogFactory;
        this.f287054c = dialogPaywallStrategy;
        this.f287055d = superwallPaywallStrategy;
    }

    private final com.planner5d.library.model.manager.config.purchaseplacement.b e(com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar) {
        return this.f287052a.get().c(aVar);
    }

    private final boolean f(com.planner5d.library.model.manager.config.purchaseplacement.b bVar) {
        return this.f287053b.get().q(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(b bVar, l lVar, com.planner5d.library.model.manager.config.purchaseplacement.b bVar2, y3.c cVar, Bundle bundle, Function1 function1, boolean z10) {
        if (z10) {
            function1.invoke(Boolean.TRUE);
        } else {
            bVar.f287054c.get().d(lVar, bVar2, true, cVar, bundle, function1);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void a(@NotNull l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar) {
        t.a.c(this, lVar, aVar, cVar);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void b(@NotNull final l presenter, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @Nullable final y3.c cVar, @Nullable final Bundle bundle, @NotNull final Function1<? super Boolean, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        final com.planner5d.library.model.manager.config.purchaseplacement.b bVarE = e(placementName);
        if (f(bVarE)) {
            onFinished.invoke(Boolean.FALSE);
        } else if (bVarE == null || !bVarE.f()) {
            this.f287054c.get().b(presenter, placementName, cVar, bundle, onFinished);
        } else {
            this.f287055d.get().b(presenter, placementName, cVar, bundle, new Function1() { // from class: ia.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.g(this.f287045a, presenter, bVarE, cVar, bundle, onFinished, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void c(@NotNull l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar, @Nullable Bundle bundle) {
        t.a.d(this, lVar, aVar, cVar, bundle);
    }
}
