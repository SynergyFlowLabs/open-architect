package io.ktor.network.sockets;

import io.ktor.network.sockets.m;
import io.ktor.network.sockets.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface m<T extends m<? extends T, Options>, Options extends p0> {

    public static final class a {
        @NotNull
        public static <T extends m<? extends T, Options>, Options extends p0> T a(@NotNull m<? extends T, Options> mVar, @NotNull Function1<? super Options, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            p0 p0VarA = mVar.b().a();
            Intrinsics.checkNotNull(p0VarA, "null cannot be cast to non-null type Options of io.ktor.network.sockets.Configurable");
            block.invoke(p0VarA);
            mVar.a(p0VarA);
            Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type T of io.ktor.network.sockets.Configurable");
            return mVar;
        }
    }

    void a(@NotNull Options options);

    @NotNull
    Options b();

    @NotNull
    T c(@NotNull Function1<? super Options, Unit> function1);
}
