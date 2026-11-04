package com.planner5d.library.widget.toolbar;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.ScrollingView;
import androidx.core.view.a2;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nScrollingViewsFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollingViewsFinder.kt\ncom/planner5d/library/widget/toolbar/ScrollingViewsFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258833d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<ScrollingView> f258834a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f258835b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Rect f258836c = new Rect();

    private final void b(ViewGroup viewGroup) {
        for (View view : a2.e(viewGroup)) {
            ScrollingView scrollingViewD = d(view);
            if (scrollingViewD != null) {
                this.f258834a.add(scrollingViewD);
            } else {
                ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup2 != null) {
                    b(viewGroup2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ScrollingView d(View view) {
        if (!(view instanceof ScrollingView) || Intrinsics.areEqual(view.getClass().getPackage(), ViewPager2.class.getPackage())) {
            return null;
        }
        return (ScrollingView) view;
    }

    @Nullable
    public final ScrollingView a(@NotNull View sourceView) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        if (!(sourceView instanceof SwipeRefreshLayout)) {
            return d(sourceView);
        }
        Iterator<View> it = a2.e((ViewGroup) sourceView).iterator();
        while (it.hasNext()) {
            ScrollingView scrollingViewD = d(it.next());
            if (scrollingViewD != null) {
                return scrollingViewD;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.view.ScrollingView] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Nullable
    public final ScrollingView c(@NotNull ViewGroup containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        b(containerView);
        ?? r10 = 0;
        if (this.f258834a.isEmpty()) {
            return null;
        }
        DisplayMetrics displayMetrics = containerView.getResources().getDisplayMetrics();
        this.f258836c.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        for (Object obj : this.f258834a) {
            if (obj instanceof View) {
                ((View) obj).getGlobalVisibleRect(this.f258835b);
                if (this.f258835b.intersect(this.f258836c)) {
                    r10 = obj;
                    break;
                }
            }
        }
        this.f258834a.clear();
        return r10;
    }
}
