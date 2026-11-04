package ji;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {
    @NotNull
    public static final e a(@NotNull Function1<? super f, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        f fVar = new f();
        block.invoke(fVar);
        return fVar.a();
    }
}
