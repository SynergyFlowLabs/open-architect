package com.planner5d.library.widget.toolbar;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.ScrollingView;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nToolbarShadowVisibilityHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarShadowVisibilityHelper.kt\ncom/planner5d/library/widget/toolbar/ToolbarShadowVisibilityHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258841d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f258842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Float f258843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f258844c;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final float a(Resources resources) {
        Float f10 = this.f258843b;
        if (f10 != null) {
            return f10.floatValue();
        }
        float dimension = resources.getDimension(this.f258844c);
        this.f258843b = Float.valueOf(dimension);
        return dimension;
    }

    public final void b(@Nullable ScrollingView scrollingView, @NotNull AppBarLayout appBarLayout) {
        float fA;
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        if (scrollingView == null || scrollingView.computeVerticalScrollOffset() == 0) {
            fA = 0.0f;
        } else {
            Resources resources = appBarLayout.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            fA = a(resources);
        }
        appBarLayout.setDecoupledElevation(fA);
    }

    public final void c(@NotNull View rootView, @NotNull AppBarLayout appBarLayout) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        b(viewGroup != null ? this.f258842a.c(viewGroup) : null, appBarLayout);
    }

    public c(@NotNull a scrollingViewsFinder) {
        Intrinsics.checkNotNullParameter(scrollingViewsFinder, "scrollingViewsFinder");
        this.f258842a = scrollingViewsFinder;
        this.f258844c = c1.f.f251045gd;
    }

    public /* synthetic */ c(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new a() : aVar);
    }
}
