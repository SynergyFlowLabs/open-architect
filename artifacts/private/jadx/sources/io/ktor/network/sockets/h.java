package io.ktor.network.sockets;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    static final class a implements Function1<?, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f296230a = new a();

        a() {
        }

        public final void c(p0 configure) {
            Intrinsics.checkNotNullParameter(configure, "$this$configure");
            if (configure instanceof p0.e) {
                ((p0.e) configure).z(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c((p0) obj);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final n0 a(@NotNull io.ktor.network.selector.j selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new n0(selector, p0.f296304e.a());
    }

    @kotlin.l(message = "noDelay is true by default", replaceWith = @kotlin.b1(expression = "this", imports = {}))
    @NotNull
    public static final <T extends m<? extends T, ?>> T b(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return (T) t10.c(a.f296230a);
    }
}
