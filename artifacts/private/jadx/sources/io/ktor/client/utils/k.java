package io.ktor.client.utils;

import io.ktor.http.v0;
import io.ktor.http.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k {
    @NotNull
    public static final v0 b(@NotNull Function1<? super w0, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        w0 w0Var = new w0(0, 1, null);
        block.invoke(w0Var);
        return w0Var.build();
    }

    public static /* synthetic */ v0 c(Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.utils.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k.d((w0) obj2);
                }
            };
        }
        return b(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        return Unit.f312394a;
    }
}
