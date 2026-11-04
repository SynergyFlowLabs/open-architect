package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(28)
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q1 f41694a = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41695b = 0;

    private q1() {
    }

    @androidx.annotation.w0(28)
    @NotNull
    public final Typeface a(@NotNull Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }
}
