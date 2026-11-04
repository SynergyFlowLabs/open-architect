package androidx.savedstate;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class d {
    public static final <T> T a(@NotNull Bundle bundle, @NotNull Function1<? super f, ? extends T> block) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(f.a(f.b(bundle)));
    }

    public static final <T> T b(@NotNull Bundle bundle, @NotNull Function1<? super n, ? extends T> block) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(n.a(n.c(bundle)));
    }
}
