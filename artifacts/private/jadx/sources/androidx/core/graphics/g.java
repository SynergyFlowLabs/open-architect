package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g {
    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float A(long j10) {
        return Color.luminance(j10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float B(long j10) {
        return Color.red(j10);
    }

    public static final int C(@androidx.annotation.l int i10) {
        return (i10 >> 16) & 255;
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final boolean D(long j10) {
        return Color.isSrgb(j10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final boolean E(long j10) {
        return Color.isWideGamut(j10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    @NotNull
    public static final Color F(@NotNull Color color, @NotNull Color color2) {
        return h.w(color2, color);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    @NotNull
    public static final Color G(@androidx.annotation.l int i10) {
        return Color.valueOf(i10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    @NotNull
    public static final Color H(long j10) {
        return Color.valueOf(j10);
    }

    @androidx.annotation.l
    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final int I(long j10) {
        return Color.toArgb(j10);
    }

    @androidx.annotation.l
    public static final int J(@NotNull String str) {
        return Color.parseColor(str);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final long K(@androidx.annotation.l int i10) {
        return Color.pack(i10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float a(long j10) {
        return Color.red(j10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float b(@NotNull Color color) {
        return color.getComponent(0);
    }

    public static final int c(@androidx.annotation.l int i10) {
        return (i10 >> 24) & 255;
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float d(long j10) {
        return Color.green(j10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float e(@NotNull Color color) {
        return color.getComponent(1);
    }

    public static final int f(@androidx.annotation.l int i10) {
        return (i10 >> 16) & 255;
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float g(long j10) {
        return Color.blue(j10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float h(@NotNull Color color) {
        return color.getComponent(2);
    }

    public static final int i(@androidx.annotation.l int i10) {
        return (i10 >> 8) & 255;
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float j(long j10) {
        return Color.alpha(j10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float k(@NotNull Color color) {
        return color.getComponent(3);
    }

    public static final int l(@androidx.annotation.l int i10) {
        return i10 & 255;
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final long m(@androidx.annotation.l int i10, @NotNull ColorSpace.Named named) {
        return Color.convert(i10, ColorSpace.get(named));
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final long n(@androidx.annotation.l int i10, @NotNull ColorSpace colorSpace) {
        return Color.convert(i10, colorSpace);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final long o(long j10, @NotNull ColorSpace.Named named) {
        return Color.convert(j10, ColorSpace.get(named));
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final long p(long j10, @NotNull ColorSpace colorSpace) {
        return Color.convert(j10, colorSpace);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    @NotNull
    public static final Color q(@NotNull Color color, @NotNull ColorSpace.Named named) {
        return color.convert(ColorSpace.get(named));
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    @NotNull
    public static final Color r(@NotNull Color color, @NotNull ColorSpace colorSpace) {
        return color.convert(colorSpace);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float s(long j10) {
        return Color.alpha(j10);
    }

    public static final int t(@androidx.annotation.l int i10) {
        return (i10 >> 24) & 255;
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float u(long j10) {
        return Color.blue(j10);
    }

    public static final int v(@androidx.annotation.l int i10) {
        return i10 & 255;
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    @NotNull
    public static final ColorSpace w(long j10) {
        return Color.colorSpace(j10);
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float x(long j10) {
        return Color.green(j10);
    }

    public static final int y(@androidx.annotation.l int i10) {
        return (i10 >> 8) & 255;
    }

    @e.a({"ClassVerificationFailure"})
    @w0(26)
    public static final float z(@androidx.annotation.l int i10) {
        return Color.luminance(i10);
    }
}
