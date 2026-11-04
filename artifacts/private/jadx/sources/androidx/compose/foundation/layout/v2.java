package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {
    @NotNull
    public static final kotlin.f0<Integer> a(@NotNull String str, @NotNull Function0<Integer> function0) {
        return new l4(function0, str);
    }

    public static /* synthetic */ kotlin.f0 b(String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return a(str, function0);
    }
}
