package io.ktor.network.util;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f296381a = Long.MAX_VALUE;

    @NotNull
    public static final b b(@NotNull s0 s0Var, @NotNull String name, long j10, @NotNull Function0<Long> clock, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> onTimeout) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        return new b(name, j10, clock, s0Var, onTimeout);
    }

    public static /* synthetic */ b c(s0 s0Var, String str, long j10, Function0 function0, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            function0 = new Function0() { // from class: io.ktor.network.util.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(d.d());
                }
            };
        }
        return b(s0Var, str, j10, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d() {
        return ni.a.d();
    }

    public static final <T> T e(@Nullable b bVar, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (bVar == null) {
            return block.invoke();
        }
        bVar.f();
        try {
            T tInvoke = block.invoke();
            h0.d(1);
            return tInvoke;
        } finally {
            h0.d(1);
            bVar.g();
            h0.c(1);
        }
    }
}
