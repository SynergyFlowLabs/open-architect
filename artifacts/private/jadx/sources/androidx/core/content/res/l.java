package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.h1;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(26)
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f47678a = new l();

    private l() {
    }

    @oj.n
    @NotNull
    public static final Typeface a(@NotNull TypedArray typedArray, @h1 int i10) {
        Typeface font = typedArray.getFont(i10);
        Intrinsics.checkNotNull(font);
        return font;
    }
}
