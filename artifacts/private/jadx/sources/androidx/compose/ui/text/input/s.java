package androidx.compose.ui.text.input;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static final void a(@NotNull String str, @NotNull char[] cArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i11, i12, cArr, i10);
    }
}
