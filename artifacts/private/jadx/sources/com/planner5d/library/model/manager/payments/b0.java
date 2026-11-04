package com.planner5d.library.model.manager.payments;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface b0 {

    public static final class a {
        public static /* synthetic */ void a(b0 b0Var, androidx.fragment.app.s sVar, FragmentManager fragmentManager, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, Bundle bundle, Function0 function0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: purchasePremium");
            }
            if ((i10 & 8) != 0) {
                bundle = null;
            }
            b0Var.a(sVar, fragmentManager, aVar, bundle, function0);
        }
    }

    void a(@NotNull androidx.fragment.app.s sVar, @NotNull FragmentManager fragmentManager, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @Nullable Bundle bundle, @NotNull Function0<Unit> function0);
}
