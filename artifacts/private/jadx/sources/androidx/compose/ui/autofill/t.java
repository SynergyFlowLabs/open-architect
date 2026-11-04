package androidx.compose.ui.autofill;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    @NotNull
    public static final s a(int i10) {
        return f.a(f.b(i10));
    }

    public static final int b(@NotNull s sVar) {
        Intrinsics.checkNotNull(sVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((f) sVar).h();
    }
}
