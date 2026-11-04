package androidx.compose.runtime.collection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @NotNull
    public static final <T> T[] a(@NotNull T[] tArr, @NotNull T[] tArr2, int i10, int i11, int i12) {
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }
}
