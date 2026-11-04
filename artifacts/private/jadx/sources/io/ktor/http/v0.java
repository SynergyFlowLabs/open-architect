package io.ktor.http;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface v0 extends io.ktor.util.o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f296123a = a.f296124a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f296124a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final v0 f296125b = k0.f295915d;

        private a() {
        }

        @NotNull
        public final v0 a(@NotNull Function1<? super w0, Unit> builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            w0 w0Var = new w0(0, 1, null);
            builder.invoke(w0Var);
            return w0Var.build();
        }

        @NotNull
        public final v0 b() {
            return f296125b;
        }
    }

    public static final class b {
        public static boolean a(@NotNull v0 v0Var, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return io.ktor.util.o1.b.a(v0Var, name);
        }

        public static boolean b(@NotNull v0 v0Var, @NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return io.ktor.util.o1.b.b(v0Var, name, value);
        }

        public static void c(@NotNull v0 v0Var, @NotNull Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            io.ktor.util.o1.b.c(v0Var, body);
        }

        @Nullable
        public static String d(@NotNull v0 v0Var, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return io.ktor.util.o1.b.d(v0Var, name);
        }
    }
}
