package c1;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class c<T> implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f82375c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f82376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f82377b;

    public c(T t10, T t11) {
        this.f82376a = t10;
        this.f82377b = t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c d(c cVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = cVar.f82376a;
        }
        if ((i10 & 2) != 0) {
            obj2 = cVar.f82377b;
        }
        return cVar.c(obj, obj2);
    }

    public final T a() {
        return this.f82376a;
    }

    public final T b() {
        return this.f82377b;
    }

    @NotNull
    public final c<T> c(T t10, T t11) {
        return new c<>(t10, t11);
    }

    public final T e() {
        return this.f82376a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f82376a, cVar.f82376a) && Intrinsics.areEqual(this.f82377b, cVar.f82377b);
    }

    public final T f() {
        return this.f82377b;
    }

    public int hashCode() {
        T t10 = this.f82376a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f82377b;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TargetState(initial=" + this.f82376a + ", target=" + this.f82377b + ')';
    }
}
