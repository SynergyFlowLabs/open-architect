package com.planner5d.library.spaces.view;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.ui.d;
import com.planner5d.library.util.navigation.NavigationFragment;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class SpacesSearchNavigationFragment extends NavigationFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f230225l = de.b.o.f272639a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f230226m = SetsKt.setOf(Integer.valueOf(de.b.i.R9));

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected d.b C(@Nullable Context context) {
        d.b bVarN = super.C(context).N(false);
        Intrinsics.checkNotNullExpressionValue(bVarN, "toolbarVisible(...)");
        return bVarN;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    protected int E() {
        return this.f230225l;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected Set<Integer> G() {
        return this.f230226m;
    }
}
