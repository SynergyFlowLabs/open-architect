package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class n1<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f312868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f312869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f312870c;

    public n1(A a10, B b10, C c10) {
        this.f312868a = a10;
        this.f312869b = b10;
        this.f312870c = c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n1 e(n1 n1Var, Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            obj = n1Var.f312868a;
        }
        if ((i10 & 2) != 0) {
            obj2 = n1Var.f312869b;
        }
        if ((i10 & 4) != 0) {
            obj3 = n1Var.f312870c;
        }
        return n1Var.d(obj, obj2, obj3);
    }

    public final A a() {
        return this.f312868a;
    }

    public final B b() {
        return this.f312869b;
    }

    public final C c() {
        return this.f312870c;
    }

    @NotNull
    public final n1<A, B, C> d(A a10, B b10, C c10) {
        return new n1<>(a10, b10, c10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.areEqual(this.f312868a, n1Var.f312868a) && Intrinsics.areEqual(this.f312869b, n1Var.f312869b) && Intrinsics.areEqual(this.f312870c, n1Var.f312870c);
    }

    public final A f() {
        return this.f312868a;
    }

    public final B g() {
        return this.f312869b;
    }

    public final C h() {
        return this.f312870c;
    }

    public int hashCode() {
        A a10 = this.f312868a;
        int iHashCode = 0;
        int iHashCode2 = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f312869b;
        int iHashCode3 = (iHashCode2 + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f312870c;
        if (c10 != null) {
            iHashCode = c10.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    @NotNull
    public String toString() {
        return '(' + this.f312868a + ", " + this.f312869b + ", " + this.f312870c + ')';
    }
}
