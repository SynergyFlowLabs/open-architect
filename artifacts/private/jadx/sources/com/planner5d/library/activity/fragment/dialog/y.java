package com.planner5d.library.activity.fragment.dialog;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.premiumfeature.PremiumFeaturesDialog;
import com.planner5d.library.model.manager.statistics.events.n1;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.model.manager.statistics.events.y3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class y implements z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f133144b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f133145a;

    @ij.a
    public y(@NotNull k dialogLauncher) {
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f133145a = dialogLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(t3.d dVar, Boolean bool) {
        n1.f217163b.O0(t3.a.closed, t3.c.editor, bool, dVar);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.z
    public void a(@NotNull y3.c source, @Nullable String str, @Nullable final t3.d dVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f133145a.c(PremiumFeaturesDialog.class).h(com.planner5d.library.activity.fragment.dialog.premiumfeature.b.f132233a.a(source, str)).m(new u() { // from class: com.planner5d.library.activity.fragment.dialog.x
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                y.c(dVar, (Boolean) obj);
            }
        }).g();
    }
}
