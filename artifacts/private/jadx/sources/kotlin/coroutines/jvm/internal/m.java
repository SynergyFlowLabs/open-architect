package kotlin.coroutines.jvm.internal;

import kotlin.Unit;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class m {
    @e1(version = "1.3")
    public static final void a(@NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        l lVar = new l();
        kotlin.coroutines.f.h(block, lVar);
        lVar.a();
    }
}
