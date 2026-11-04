package io.intercom.android.sdk.ui.extension;

import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ModifierExtensionsKt {
    @NotNull
    public static final a0 ifTrue(@NotNull a0 a0Var, boolean z10, @NotNull Function1<? super a0, ? extends a0> modifier) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        if (z10) {
            a0Var = a0Var.B2(modifier.invoke(a0.E));
        }
        return a0Var;
    }
}
