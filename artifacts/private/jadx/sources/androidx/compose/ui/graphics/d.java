package androidx.compose.ui.graphics;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    @NotNull
    public static final ColorFilter a(@NotNull float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    @NotNull
    public static final float[] b(@NotNull ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && g()) {
            return v0.f38262a.a((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    @NotNull
    public static final ColorFilter c(long j10, long j11) {
        return new LightingColorFilter(s0.t(j10), s0.t(j11));
    }

    @NotNull
    public static final ColorFilter d(long j10, int i10) {
        return f0.f37761a.a(j10, i10);
    }

    @NotNull
    public static final ColorFilter e(@NotNull r0 r0Var) {
        return r0Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final r0 f(@NotNull ColorFilter colorFilter) {
        if (colorFilter instanceof BlendModeColorFilter) {
            return f0.f37761a.b((BlendModeColorFilter) colorFilter);
        }
        if (!(colorFilter instanceof LightingColorFilter) || !h()) {
            return ((colorFilter instanceof ColorMatrixColorFilter) && g()) ? new u0(null, colorFilter, 0 == true ? 1 : 0) : new r0(colorFilter);
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) colorFilter;
        return new a2(s0.b(lightingColorFilter.getColorMultiply()), s0.b(lightingColorFilter.getColorAdd()), colorFilter, null);
    }

    public static final boolean g() {
        return true;
    }

    public static final boolean h() {
        return true;
    }
}
