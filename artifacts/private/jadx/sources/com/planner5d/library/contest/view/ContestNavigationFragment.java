package com.planner5d.library.contest.view;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.util.navigation.NavigationFragment;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class ContestNavigationFragment extends NavigationFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f153358l = com.planner5d.library.contest.e.o.f151356a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f153359m = SetsKt.setOf(Integer.valueOf(com.planner5d.library.contest.e.i.f150766a7));

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected com.planner5d.library.activity.helper.ui.d.b C(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d.b bVarW = super.C(context).N(false).w(true);
        Intrinsics.checkNotNullExpressionValue(bVarW, "bottomNavigationVisible(...)");
        return bVarW;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    protected int E() {
        return this.f153358l;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected Set<Integer> G() {
        return this.f153359m;
    }
}
