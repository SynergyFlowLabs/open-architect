package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EdgeEffect f49135a;

    @w0(21)
    static class a {
        private a() {
        }

        static void a(EdgeEffect edgeEffect, float f10, float f11) {
            edgeEffect.onPull(f10, f11);
        }
    }

    @w0(31)
    private static class b {
        private b() {
        }

        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public j(Context context) {
        this.f49135a = new EdgeEffect(context);
    }

    @NonNull
    public static EdgeEffect a(@NonNull Context context, @p0 AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public static float d(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void g(@NonNull EdgeEffect edgeEffect, float f10, float f11) {
        a.a(edgeEffect, f10, f11);
    }

    public static float j(@NonNull EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f10, f11);
        }
        g(edgeEffect, f10, f11);
        return f10;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.f49135a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.f49135a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.f49135a.isFinished();
    }

    @Deprecated
    public boolean f(int i10) {
        this.f49135a.onAbsorb(i10);
        return true;
    }

    @Deprecated
    public boolean h(float f10) {
        this.f49135a.onPull(f10);
        return true;
    }

    @Deprecated
    public boolean i(float f10, float f11) {
        g(this.f49135a, f10, f11);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.f49135a.onRelease();
        return this.f49135a.isFinished();
    }

    @Deprecated
    public void l(int i10, int i11) {
        this.f49135a.setSize(i10, i11);
    }
}
