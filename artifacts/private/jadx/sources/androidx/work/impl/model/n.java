package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f76964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76965b;

    public n(@NotNull String workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f76964a = workSpecId;
        this.f76965b = i10;
    }

    public static /* synthetic */ n d(n nVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nVar.f76964a;
        }
        if ((i11 & 2) != 0) {
            i10 = nVar.f76965b;
        }
        return nVar.c(str, i10);
    }

    @NotNull
    public final String a() {
        return this.f76964a;
    }

    public final int b() {
        return this.f76965b;
    }

    @NotNull
    public final n c(@NotNull String workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return new n(workSpecId, i10);
    }

    public final int e() {
        return this.f76965b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f76964a, nVar.f76964a) && this.f76965b == nVar.f76965b;
    }

    @NotNull
    public final String f() {
        return this.f76964a;
    }

    public int hashCode() {
        return (this.f76964a.hashCode() * 31) + Integer.hashCode(this.f76965b);
    }

    @NotNull
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f76964a + ", generation=" + this.f76965b + ')';
    }
}
