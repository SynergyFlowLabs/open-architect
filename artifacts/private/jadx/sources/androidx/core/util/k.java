package androidx.core.util;

import android.util.Half;
import androidx.annotation.w0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"ClassVerificationFailure"})
@SourceDebugExtension({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,57:1\n42#1:58\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n49#1:58\n*E\n"})
public final class k {
    @w0(26)
    @NotNull
    public static final Half a(double d10) {
        return Half.valueOf((float) d10);
    }

    @w0(26)
    @NotNull
    public static final Half b(float f10) {
        return Half.valueOf(f10);
    }

    @w0(26)
    @NotNull
    public static final Half c(@NotNull String str) {
        return Half.valueOf(str);
    }

    @w0(26)
    @NotNull
    public static final Half d(short s10) {
        return Half.valueOf(s10);
    }
}
