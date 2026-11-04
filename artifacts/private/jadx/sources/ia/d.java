package ia;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.l;
import com.planner5d.library.activity.fragment.dialog.purchase.s;
import com.planner5d.library.activity.fragment.dialog.purchase.t;
import com.planner5d.library.model.manager.statistics.events.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class d implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f287060b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s f287061a;

    @ij.a
    public d(@NotNull s dialogFactory) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        this.f287061a = dialogFactory;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void a(@NotNull l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar) {
        t.a.c(this, lVar, aVar, cVar);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void b(@NotNull l presenter, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @Nullable y3.c cVar, @Nullable Bundle bundle, @NotNull Function1<? super Boolean, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        this.f287061a.b(presenter, placementName, cVar, bundle, onFinished);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.t
    public void c(@NotNull l lVar, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable y3.c cVar, @Nullable Bundle bundle) {
        t.a.d(this, lVar, aVar, cVar, bundle);
    }

    public final void d(@NotNull l presenter, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b placement, boolean z10, @Nullable y3.c cVar, @Nullable Bundle bundle, @NotNull Function1<? super Boolean, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        this.f287061a.u(presenter, placement, z10, cVar, bundle, onFinished);
    }
}
