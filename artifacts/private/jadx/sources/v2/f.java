package v2;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends a {
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // v2.a
    @Nullable
    public <T> T a(@NotNull a.c<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@NotNull a.c<T> key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        b().put(key, t10);
    }

    public f(@NotNull Map<a.c<?>, ? extends Object> initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        b().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull a initialExtras) {
        this((Map<a.c<?>, ? extends Object>) initialExtras.b());
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
    }

    public /* synthetic */ f(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.b.f381327c : aVar);
    }
}
