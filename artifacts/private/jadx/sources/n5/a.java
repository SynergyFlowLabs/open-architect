package n5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f332729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f332730b;

    public a(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f332729a = name;
        this.f332730b = z10;
    }

    public static /* synthetic */ a d(a aVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f332729a;
        }
        if ((i10 & 2) != 0) {
            z10 = aVar.f332730b;
        }
        return aVar.c(str, z10);
    }

    @NotNull
    public final String a() {
        return this.f332729a;
    }

    public final boolean b() {
        return this.f332730b;
    }

    @NotNull
    public final a c(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new a(name, z10);
    }

    @NotNull
    public final String e() {
        return this.f332729a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f332729a, aVar.f332729a) && this.f332730b == aVar.f332730b;
    }

    public final boolean f() {
        return this.f332730b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = this.f332729a.hashCode() * 31;
        boolean z10 = this.f332730b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @NotNull
    public String toString() {
        return "GateKeeper(name=" + this.f332729a + ", value=" + this.f332730b + ')';
    }
}
