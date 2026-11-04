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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nToolbarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarOnDestinationChangedListener.kt\nandroidx/navigation/ui/ToolbarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class v extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final WeakReference<Toolbar> f71366f;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(@NotNull Toolbar toolbar, @NotNull d configuration) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Context context = toolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        super(context, configuration);
        this.f71366f = new WeakReference<>(toolbar);
    }

    @Override // androidx.navigation.ui.a, androidx.navigation.w0.c
    public void a(@NotNull w0 controller, @NotNull y1 destination, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (this.f71366f.get() == null) {
            controller.R0(this);
        } else {
            super.a(controller, destination, bundle);
        }
    }

    @Override // androidx.navigation.ui.a
    protected void c(@Nullable Drawable drawable, @f1 int i10) {
        Toolbar toolbar = this.f71366f.get();
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
        Toolbar toolbar = this.f71366f.get();
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
    }
}
