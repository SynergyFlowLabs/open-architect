package fd;

import androidx.annotation.f1;
import androidx.annotation.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f275193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f275194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f275195c;

    public n(@v int i10, @f1 int i11, @f1 int i12) {
        this.f275193a = i10;
        this.f275194b = i11;
        this.f275195c = i12;
    }

    public static /* synthetic */ n e(n nVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = nVar.f275193a;
        }
        if ((i13 & 2) != 0) {
            i11 = nVar.f275194b;
        }
        if ((i13 & 4) != 0) {
            i12 = nVar.f275195c;
        }
        return nVar.d(i10, i11, i12);
    }

    public final int a() {
        return this.f275193a;
    }

    public final int b() {
        return this.f275194b;
    }

    public final int c() {
        return this.f275195c;
    }

    @NotNull
    public final n d(@v int i10, @f1 int i11, @f1 int i12) {
        return new n(i10, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f275193a == nVar.f275193a && this.f275194b == nVar.f275194b && this.f275195c == nVar.f275195c;
    }

    public final int f() {
        return this.f275195c;
    }

    public final int g() {
        return this.f275193a;
    }

    public final int h() {
        return this.f275194b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f275193a) * 31) + Integer.hashCode(this.f275194b)) * 31) + Integer.hashCode(this.f275195c);
    }

    @NotNull
    public String toString() {
        return "PurchaseBenefit(icon=" + this.f275193a + ", title=" + this.f275194b + ", explanation=" + this.f275195c + ")";
    }
}
