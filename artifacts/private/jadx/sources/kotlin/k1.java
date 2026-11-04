package kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k1 {
    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final <R> Function1<kotlin.coroutines.d<? super R>, Object> a(Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block;
    }
}
