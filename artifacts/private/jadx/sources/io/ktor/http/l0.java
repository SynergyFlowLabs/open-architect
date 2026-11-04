package io.ktor.http;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 implements x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final l0 f295938d = new l0();

    private l0() {
    }

    @Override // io.ktor.util.o1
    @Nullable
    public List<String> b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // io.ktor.util.o1
    public boolean c() {
        return true;
    }

    @Override // io.ktor.util.o1
    public boolean contains(@NotNull String str) {
        return x1.b.a(this, str);
    }

    @Override // io.ktor.util.o1
    public boolean d(@NotNull String str, @NotNull String str2) {
        return x1.b.b(this, str, str2);
    }

    @Override // io.ktor.util.o1
    public void e(@NotNull Function2<? super String, ? super List<String>, Unit> function2) {
        x1.b.c(this, function2);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof x1) && ((x1) obj).isEmpty();
    }

    @Override // io.ktor.util.o1
    @Nullable
    public String get(@NotNull String str) {
        return x1.b.d(this, str);
    }

    @Override // io.ktor.util.o1
    public boolean isEmpty() {
        return true;
    }

    @Override // io.ktor.util.o1
    @NotNull
    public Set<Map.Entry<String, List<String>>> k() {
        return SetsKt.emptySet();
    }

    @Override // io.ktor.util.o1
    @NotNull
    public Set<String> names() {
        return SetsKt.emptySet();
    }

    @NotNull
    public String toString() {
        return "Parameters " + k();
    }
}
