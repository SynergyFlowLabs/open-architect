package io.ktor.http;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface x1 extends io.ktor.util.o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f296128b = a.f296129a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f296129a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final x1 f296130b = l0.f295938d;

        private a() {
        }

        @NotNull
        public final x1 a(@NotNull Function1<? super y1, Unit> builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            y1 y1VarB = b2.b(0, 1, null);
            builder.invoke(y1VarB);
            return y1VarB.build();
        }

        @NotNull
        public final x1 b() {
            return f296130b;
        }
    }

    public static final class b {
        public static boolean a(@NotNull x1 x1Var, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return io.ktor.util.o1.b.a(x1Var, name);
        }

        public static boolean b(@NotNull x1 x1Var, @NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return io.ktor.util.o1.b.b(x1Var, name, value);
        }

        public static void c(@NotNull x1 x1Var, @NotNull Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            io.ktor.util.o1.b.c(x1Var, body);
        }

        @Nullable
        public static String d(@NotNull x1 x1Var, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return io.ktor.util.o1.b.d(x1Var, name);
        }
    }
}
