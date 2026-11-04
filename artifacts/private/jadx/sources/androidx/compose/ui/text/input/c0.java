package androidx.compose.ui.text.input;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final int a(int i10, int i11, @NotNull Function0<Integer> function0) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? function0.invoke().intValue() : i12;
    }

    public static final int b(int i10, int i11, @NotNull Function0<Integer> function0) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? function0.invoke().intValue() : i12;
    }
}
