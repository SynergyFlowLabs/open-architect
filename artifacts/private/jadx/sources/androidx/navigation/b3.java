package androidx.navigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 {
    @NotNull
    public static final w2 a(@NotNull Function1<? super a3, Unit> optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        a3 a3Var = new a3();
        optionsBuilder.invoke(a3Var);
        return a3Var.e();
    }
}
