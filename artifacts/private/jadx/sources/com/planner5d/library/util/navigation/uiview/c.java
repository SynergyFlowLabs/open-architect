package com.planner5d.library.util.navigation.uiview;

import androidx.viewpager2.widget.ViewPager2;
import com.planner5d.library.services.utility.k3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface c {

    public static final class a {
        public static /* synthetic */ c a(c cVar, boolean z10, k3 k3Var, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInProgress");
            }
            if ((i10 & 2) != 0) {
                k3Var = null;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return cVar.b(z10, k3Var, z11);
        }
    }

    @NotNull
    c a(@NotNull com.planner5d.library.widget.tab.f fVar, @NotNull ViewPager2 viewPager2);

    @NotNull
    c b(boolean z10, @Nullable k3 k3Var, boolean z11);

    @NotNull
    c c();

    void d(@NotNull com.planner5d.library.widget.tab.f fVar);

    @NotNull
    c e(@NotNull k3 k3Var);

    @NotNull
    c f();
}
