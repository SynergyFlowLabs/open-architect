package androidx.compose.ui.graphics;

import android.graphics.BlendModeColorFilter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(29)
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f37761a = new f0();

    private f0() {
    }

    @NotNull
    public final BlendModeColorFilter a(long j10, int i10) {
        return new BlendModeColorFilter(s0.t(j10), a.b(i10));
    }

    @NotNull
    public final e0 b(@NotNull BlendModeColorFilter blendModeColorFilter) {
        return new e0(s0.b(blendModeColorFilter.getColor()), a.c(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
