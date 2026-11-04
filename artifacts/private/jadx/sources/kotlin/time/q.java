package kotlin.time;

import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {j.class})
@e1(version = "1.9")
public final class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f313436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f313437b;

    public /* synthetic */ q(Object obj, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q d(q qVar, Object obj, long j10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = qVar.f313436a;
        }
        if ((i10 & 2) != 0) {
            j10 = qVar.f313437b;
        }
        return qVar.c(obj, j10);
    }

    public final T a() {
        return this.f313436a;
    }

    public final long b() {
        return this.f313437b;
    }

    @NotNull
    public final q<T> c(T t10, long j10) {
        return new q<>(t10, j10, null);
    }

    public final long e() {
        return this.f313437b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f313436a, qVar.f313436a) && c.D(this.f313437b, qVar.f313437b);
    }

    public final T f() {
        return this.f313436a;
    }

    public int hashCode() {
        T t10 = this.f313436a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + c.s0(this.f313437b);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.f313436a + ", duration=" + ((Object) c.N0(this.f313437b)) + ')';
    }

    private q(T t10, long j10) {
        this.f313436a = t10;
        this.f313437b = j10;
    }
}
