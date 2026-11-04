package com.planner5d.library.activity.fragment.spaces;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.ui.d;
import com.planner5d.library.f;
import com.planner5d.library.util.navigation.NavigationFragment;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class SpacesNavigationFragment extends NavigationFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f136109l = f.p.f168932f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f136110m = SetsKt.setOf(Integer.valueOf(f.j.M9));

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected d.b C(@Nullable Context context) {
        d.b bVarW = super.C(context).N(false).w(true);
        Intrinsics.checkNotNullExpressionValue(bVarW, "bottomNavigationVisible(...)");
        return bVarW;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    protected int E() {
        return this.f136109l;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected Set<Integer> G() {
        return this.f136110m;
    }
}
