package com.planner5d.library.dgenerator.fragment;

import com.planner5d.library.util.navigation.NavigationFragment;
import java.util.Set;
import kotlin.collections.SetsKt;
import lb.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DesignGeneratorNavigationFragment extends NavigationFragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f160102l = b.p.f320692c;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f160103m = SetsKt.emptySet();

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    protected int E() {
        return this.f160102l;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected Set<Integer> G() {
        return this.f160103m;
    }
}
