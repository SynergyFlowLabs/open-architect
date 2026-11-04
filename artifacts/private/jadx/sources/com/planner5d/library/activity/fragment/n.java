package com.planner5d.library.activity.fragment;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.feed.FeedFragment;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.spaces.SpacesNavigationFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@ij.f
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f134497b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f134498a;

    @ij.a
    public n(@NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f134498a = featureConfigManager;
    }

    @NotNull
    public final Class<? extends FragmentController> a() {
        if (this.f134498a.get().a(com.planner5d.library.model.manager.config.f.Spaces)) {
            return SpacesNavigationFragment.class;
        }
        return this.f134498a.get().a(com.planner5d.library.model.manager.config.f.FeedHome) ? FeedFragment.class : ProjectsPagesFragment.class;
    }
}
