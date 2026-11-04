package v2;

import androidx.lifecycle.f2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class i<T extends f2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<T> f381331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<a, T> f381332b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull kotlin.reflect.d<T> clazz, @NotNull Function1<? super a, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f381331a = clazz;
        this.f381332b = initializer;
    }

    @NotNull
    public final kotlin.reflect.d<T> a() {
        return this.f381331a;
    }

    @NotNull
    public final Function1<a, T> b() {
        return this.f381332b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Class<T> clazz, @NotNull Function1<? super a, ? extends T> initializer) {
        this(oj.b.i(clazz), initializer);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
    }
}
