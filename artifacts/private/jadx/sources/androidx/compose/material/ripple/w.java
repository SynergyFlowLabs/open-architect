package androidx.compose.material.ripple;

import androidx.compose.runtime.c0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(level = kotlin.n.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f24839a = a.f24840a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f24840a = new a();

        private a() {
        }

        @kotlin.l(level = kotlin.n.WARNING, message = "The default ripple alpha varies between design system versions: this function technically implements the default used by the material library, but is not used by the material3 library. To remove confusion and link the defaults more strongly to the design system library, these default values have been moved to the material and material3 libraries. For material, use RippleDefaults#rippleAlpha. For material3, use RippleDefaults#RippleAlpha.")
        @NotNull
        public final l a(long j10, boolean z10) {
            if (z10) {
                return ((double) s0.r(j10)) > 0.5d ? y.f24842b : y.f24843c;
            }
            return y.f24844d;
        }

        @kotlin.l(level = kotlin.n.WARNING, message = "The default ripple color varies between design system versions: this function technically implements the default used by the material library, but is not used by the material3 library. To remove confusion and link the defaults more strongly to the design system library, these default values have been moved to the material and material3 libraries. For material, use RippleDefaults#rippleColor. For material3, use content color directly.")
        public final long b(long j10, boolean z10) {
            return (z10 || ((double) s0.r(j10)) >= 0.5d) ? j10 : q0.f38131b.w();
        }
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    long a(@Nullable c0 c0Var, int i10);

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    @NotNull
    l b(@Nullable c0 c0Var, int i10);
}
