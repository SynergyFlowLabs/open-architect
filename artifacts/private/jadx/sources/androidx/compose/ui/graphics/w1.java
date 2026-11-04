package androidx.compose.ui.graphics;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 {
    public static final void a(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        b(function0.invoke());
    }

    public static final void b(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }
}
