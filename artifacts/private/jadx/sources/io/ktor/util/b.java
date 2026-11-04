package io.ktor.util;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    @SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nio/ktor/util/Attributes$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
    public static final class a {
        @NotNull
        public static <T> T a(@NotNull b bVar, @NotNull io.ktor.util.a<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            T t10 = (T) bVar.e(key);
            if (t10 != null) {
                return t10;
            }
            throw new IllegalStateException("No instance for key " + key);
        }

        @NotNull
        public static <T> T b(@NotNull b bVar, @NotNull io.ktor.util.a<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            T t10 = (T) bVar.f(key);
            bVar.c(key);
            return t10;
        }

        @Nullable
        public static <T> T c(@NotNull b bVar, @NotNull io.ktor.util.a<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            T t10 = (T) bVar.e(key);
            bVar.c(key);
            return t10;
        }
    }

    <T> void a(@NotNull io.ktor.util.a<T> aVar, @NotNull T t10);

    @NotNull
    List<io.ktor.util.a<?>> b();

    <T> void c(@NotNull io.ktor.util.a<T> aVar);

    boolean d(@NotNull io.ktor.util.a<?> aVar);

    @Nullable
    <T> T e(@NotNull io.ktor.util.a<T> aVar);

    @NotNull
    <T> T f(@NotNull io.ktor.util.a<T> aVar);

    @NotNull
    <T> T g(@NotNull io.ktor.util.a<T> aVar);

    @Nullable
    <T> T h(@NotNull io.ktor.util.a<T> aVar);

    @NotNull
    <T> T i(@NotNull io.ktor.util.a<T> aVar, @NotNull Function0<? extends T> function0);
}
