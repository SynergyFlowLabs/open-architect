package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a implements io.sentry.internal.gestures.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f304212b = "old_view_system";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f304213a;

    public a(boolean z10) {
        this.f304213a = z10;
    }

    private io.sentry.internal.gestures.b b(@NotNull View view) {
        try {
            return new io.sentry.internal.gestures.b(view, io.sentry.android.core.internal.util.j.a(view), i.b(view), null, f304212b);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean c(@NotNull View view, boolean z10) {
        if (z10) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean d(@NotNull View view, boolean z10) {
        if ((!c(view, z10) && !AbsListView.class.isAssignableFrom(view.getClass()) && !ScrollView.class.isAssignableFrom(view.getClass())) || view.getVisibility() != 0) {
            return false;
        }
        int i10 = 1 << 1;
        return true;
    }

    private static boolean e(@NotNull View view) {
        if (!view.isClickable() || view.getVisibility() != 0) {
            return false;
        }
        boolean z10 = true & true;
        return true;
    }

    @Override // io.sentry.internal.gestures.a
    @Nullable
    public io.sentry.internal.gestures.b a(@Nullable Object obj, float f10, float f11, io.sentry.internal.gestures.b.a aVar) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (aVar == io.sentry.internal.gestures.b.a.CLICKABLE && e(view)) {
            return b(view);
        }
        if (aVar == io.sentry.internal.gestures.b.a.SCROLLABLE && d(view, this.f304213a)) {
            return b(view);
        }
        return null;
    }
}
