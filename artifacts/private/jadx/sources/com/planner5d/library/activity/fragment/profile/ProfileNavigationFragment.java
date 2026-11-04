package com.planner5d.library.activity.fragment.profile;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.util.navigation.NavigationFragment;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class ProfileNavigationFragment extends NavigationFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f134511l = com.planner5d.library.f.p.f168930d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f134512m = SetsKt.setOf(Integer.valueOf(com.planner5d.library.f.j.Zl));

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected com.planner5d.library.activity.helper.ui.d.b C(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d.b bVarW = super.C(context).w(true);
        Intrinsics.checkNotNullExpressionValue(bVarW, "bottomNavigationVisible(...)");
        return bVarW;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    protected int E() {
        return this.f134511l;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected Set<Integer> G() {
        return this.f134512m;
    }
}
