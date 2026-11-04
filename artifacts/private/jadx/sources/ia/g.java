package ia;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.l;
import com.planner5d.library.activity.fragment.dialog.purchase.t;
import com.planner5d.library.model.manager.payments.a0;
import com.planner5d.library.model.manager.statistics.events.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class g implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f287064c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.a f287065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a0 f287066b;

    @ij.a
    public g(@NotNull com.planner5d.library.activity.a activityProvider, @NotNull a0 superwallPurchaseService) {
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(superwallPurchaseService, "superwallPurchaseService");
        this.f287065a = activityProvider;
        this.f287066b = superwallPurchaseService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, boolean z10, boolean z11) {
        function1.invoke(Boolean.valueOf(z10));
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void a(@NotNull l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar) {
        t.a.c(this, lVar, aVar, cVar);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void b(@NotNull l presenter, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @Nullable y3.c cVar, @Nullable Bundle bundle, @NotNull final Function1<? super Boolean, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        androidx.appcompat.app.d dVarA = this.f287065a.a();
        if (dVarA == null) {
            onFinished.invoke(Boolean.FALSE);
        } else {
            this.f287066b.d(dVarA, placementName, new Function2() { // from class: ia.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.e(onFinished, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            });
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void c(@NotNull l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar, @Nullable Bundle bundle) {
        t.a.d(this, lVar, aVar, cVar, bundle);
    }
}
