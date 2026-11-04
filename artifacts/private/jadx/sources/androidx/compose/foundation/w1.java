package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w1 f21865a = new w1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21866b = 0;

    private w1() {
    }

    public final float a(@NotNull EdgeEffect edgeEffect, float f10, float f11, @NotNull androidx.compose.ui.unit.d dVar) {
        if (x1.b(dVar, f10) > c(edgeEffect) * f11) {
            return 0.0f;
        }
        d(edgeEffect, kotlin.math.b.L0(f10));
        return f10;
    }

    @NotNull
    public final EdgeEffect b(@NotNull Context context) {
        return Build.VERSION.SDK_INT >= 31 ? u.f21826a.a(context, null) : new k2(context);
    }

    public final float c(@NotNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u.f21826a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void d(@NotNull EdgeEffect edgeEffect, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else {
            if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb(i10);
            }
        }
    }

    public final float e(@NotNull EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u.f21826a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void f(@NotNull EdgeEffect edgeEffect, float f10) {
        if (edgeEffect instanceof k2) {
            ((k2) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}
