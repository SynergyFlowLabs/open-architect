package kotlinx.serialization.internal;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f315984a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f315984a = z10;
    }

    @NotNull
    public static final <T> w2<T> a(@NotNull Function1<? super kotlin.reflect.d<?>, ? extends KSerializer<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f315984a ? new t(factory) : new z(factory);
    }

    @NotNull
    public static final <T> d2<T> b(@NotNull Function2<? super kotlin.reflect.d<Object>, ? super List<? extends kotlin.reflect.s>, ? extends KSerializer<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f315984a ? new u(factory) : new a0(factory);
    }
}
