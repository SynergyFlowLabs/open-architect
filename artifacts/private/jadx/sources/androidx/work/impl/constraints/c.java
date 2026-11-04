package androidx.work.impl.constraints;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f76754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f76755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f76756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f76757d;

    public c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f76754a = z10;
        this.f76755b = z11;
        this.f76756c = z12;
        this.f76757d = z13;
    }

    public static /* synthetic */ c f(c cVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = cVar.f76754a;
        }
        if ((i10 & 2) != 0) {
            z11 = cVar.f76755b;
        }
        if ((i10 & 4) != 0) {
            z12 = cVar.f76756c;
        }
        if ((i10 & 8) != 0) {
            z13 = cVar.f76757d;
        }
        return cVar.e(z10, z11, z12, z13);
    }

    public final boolean a() {
        return this.f76754a;
    }

    public final boolean b() {
        return this.f76755b;
    }

    public final boolean c() {
        return this.f76756c;
    }

    public final boolean d() {
        return this.f76757d;
    }

    @NotNull
    public final c e(boolean z10, boolean z11, boolean z12, boolean z13) {
        return new c(z10, z11, z12, z13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f76754a == cVar.f76754a && this.f76755b == cVar.f76755b && this.f76756c == cVar.f76756c && this.f76757d == cVar.f76757d;
    }

    public final boolean g() {
        return this.f76754a;
    }

    public final boolean h() {
        return this.f76756c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z10 = this.f76754a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.f76755b;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.f76756c;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.f76757d;
        return i12 + (z13 ? 1 : z13);
    }

    public final boolean i() {
        return this.f76757d;
    }

    public final boolean j() {
        return this.f76755b;
    }

    @NotNull
    public String toString() {
        return "NetworkState(isConnected=" + this.f76754a + ", isValidated=" + this.f76755b + ", isMetered=" + this.f76756c + ", isNotRoaming=" + this.f76757d + ')';
    }
}
