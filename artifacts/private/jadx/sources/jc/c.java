package jc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f307410a;

    public c(int i10) {
        this.f307410a = i10;
    }

    public static /* synthetic */ c c(c cVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f307410a;
        }
        return cVar.b(i10);
    }

    public final int a() {
        return this.f307410a;
    }

    @NotNull
    public final c b(int i10) {
        return new c(i10);
    }

    public final int d() {
        return this.f307410a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f307410a == ((c) obj).f307410a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f307410a);
    }

    @NotNull
    public String toString() {
        return "Category(id=" + this.f307410a + ")";
    }
}
