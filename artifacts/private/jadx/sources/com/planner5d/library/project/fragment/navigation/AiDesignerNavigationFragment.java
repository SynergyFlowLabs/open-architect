package com.planner5d.library.project.fragment.navigation;

import android.content.Context;
import com.planner5d.library.activity.helper.ui.d;
import com.planner5d.library.util.navigation.NavigationFragment;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import md.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class AiDesignerNavigationFragment extends NavigationFragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f223720l = b.p.f326319a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f223721m = SetsKt.emptySet();

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected d.b C(@Nullable Context context) {
        d.b bVarN = super.C(context).N(false);
        Intrinsics.checkNotNullExpressionValue(bVarN, "toolbarVisible(...)");
        return bVarN;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    protected int E() {
        return this.f223720l;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected Set<Integer> G() {
        return this.f223721m;
    }
}
