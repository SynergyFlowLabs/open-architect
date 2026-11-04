package com.planner5d.library.activity.fragment.startup;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.util.navigation.NavigationFragment;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class OnboardingSignInNavigationFragment extends NavigationFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f136428l = com.planner5d.library.f.p.f168930d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f136429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f136430n;

    public OnboardingSignInNavigationFragment() {
        int i10 = com.planner5d.library.f.j.hs;
        this.f136429m = i10;
        this.f136430n = SetsKt.setOf(Integer.valueOf(i10));
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    protected int E() {
        return this.f136428l;
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected Integer F() {
        return Integer.valueOf(this.f136429m);
    }

    @Override // com.planner5d.library.util.navigation.NavigationFragment
    @NotNull
    protected Set<Integer> G() {
        return this.f136430n;
    }
}
