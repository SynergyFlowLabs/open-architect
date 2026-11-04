package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
@oj.g
final class y2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f17627a;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ y2(Object obj) {
        this.f17627a = obj;
    }

    public static final /* synthetic */ y2 a(Object obj) {
        return new y2(obj);
    }

    @NotNull
    public static <T> Object b(T t10) {
        return t10;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof y2) && Intrinsics.areEqual(obj, ((y2) obj2).h());
    }

    public static final boolean d(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String g(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public final T e() {
        return this.f17627a;
    }

    public boolean equals(Object obj) {
        return c(this.f17627a, obj);
    }

    public final /* synthetic */ Object h() {
        return this.f17627a;
    }

    public int hashCode() {
        return f(this.f17627a);
    }

    public String toString() {
        return g(this.f17627a);
    }
}
