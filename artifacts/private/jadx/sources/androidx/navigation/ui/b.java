package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.f1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.appcompat.app.d f71318f;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(@NotNull androidx.appcompat.app.d activity, @NotNull d configuration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        androidx.appcompat.app.b.InterfaceC0030b drawerToggleDelegate = activity.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            Context contextD = drawerToggleDelegate.d();
            Intrinsics.checkNotNullExpressionValue(contextD, "getActionBarThemedContext(...)");
            super(contextD, configuration);
            this.f71318f = activity;
            return;
        }
        throw new IllegalStateException(("Activity " + activity + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // androidx.navigation.ui.a
    protected void c(@Nullable Drawable drawable, @f1 int i10) {
        androidx.appcompat.app.a supportActionBar = this.f71318f.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.f71318f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        supportActionBar.X(drawable != null);
        androidx.appcompat.app.b.InterfaceC0030b drawerToggleDelegate = this.f71318f.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            drawerToggleDelegate.b(drawable, i10);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f71318f + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // androidx.navigation.ui.a
    protected void d(@Nullable CharSequence charSequence) {
        androidx.appcompat.app.a supportActionBar = this.f71318f.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(charSequence);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f71318f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
