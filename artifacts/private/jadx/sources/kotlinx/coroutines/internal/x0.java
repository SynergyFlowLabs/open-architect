package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@oj.g
public final class x0<S extends w0<S>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f315135a;

    private /* synthetic */ x0(Object obj) {
        this.f315135a = obj;
    }

    public static final /* synthetic */ x0 a(Object obj) {
        return new x0(obj);
    }

    @NotNull
    public static <S extends w0<S>> Object b(@Nullable Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof x0) && Intrinsics.areEqual(obj, ((x0) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static /* synthetic */ void e() {
    }

    @NotNull
    public static final S f(Object obj) {
        if (obj == e.f315044b) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj == e.f315044b;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f315135a, obj);
    }

    public int hashCode() {
        return g(this.f315135a);
    }

    public final /* synthetic */ Object j() {
        return this.f315135a;
    }

    public String toString() {
        return i(this.f315135a);
    }
}
