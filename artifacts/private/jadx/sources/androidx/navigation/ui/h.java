package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.f1;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.w0;
import androidx.navigation.y1;
import androidx.transition.p0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final WeakReference<com.google.android.material.appbar.c> f71330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final WeakReference<Toolbar> f71331g;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(@NotNull com.google.android.material.appbar.c collapsingToolbarLayout, @NotNull Toolbar toolbar, @NotNull d configuration) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Context context = collapsingToolbarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        super(context, configuration);
        this.f71330f = new WeakReference<>(collapsingToolbarLayout);
        this.f71331g = new WeakReference<>(toolbar);
    }

    @Override // androidx.navigation.ui.a, androidx.navigation.w0.c
    public void a(@NotNull w0 controller, @NotNull y1 destination, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        com.google.android.material.appbar.c cVar = this.f71330f.get();
        Toolbar toolbar = this.f71331g.get();
        if (cVar == null || toolbar == null) {
            controller.R0(this);
        } else {
            super.a(controller, destination, bundle);
        }
    }

    @Override // androidx.navigation.ui.a
    protected void c(@Nullable Drawable drawable, @f1 int i10) {
        Toolbar toolbar = this.f71331g.get();
        if (toolbar != null) {
            boolean z10 = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i10);
            if (z10) {
                p0.a(toolbar);
            }
        }
    }

    @Override // androidx.navigation.ui.a
    protected void d(@Nullable CharSequence charSequence) {
        com.google.android.material.appbar.c cVar = this.f71330f.get();
        if (cVar != null) {
            cVar.setTitle(charSequence);
        }
    }
}
