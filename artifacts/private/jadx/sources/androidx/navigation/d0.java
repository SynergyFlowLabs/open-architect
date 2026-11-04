package androidx.navigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class d0 {
    @NotNull
    public static final b0 a(@NotNull String name, @NotNull Function1<? super k0, Unit> builder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(builder, "builder");
        k0 k0Var = new k0();
        builder.invoke(k0Var);
        return new b0(name, k0Var.a());
    }
}
