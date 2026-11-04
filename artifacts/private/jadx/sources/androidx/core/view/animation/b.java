package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    @w0(21)
    static class a {
        private a() {
        }

        static Interpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        static Interpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    private b() {
    }

    @NonNull
    public static Interpolator a(float f10, float f11) {
        return a.a(f10, f11);
    }

    @NonNull
    public static Interpolator b(float f10, float f11, float f12, float f13) {
        return a.b(f10, f11, f12, f13);
    }

    @NonNull
    public static Interpolator c(@NonNull Path path) {
        return a.c(path);
    }
}
