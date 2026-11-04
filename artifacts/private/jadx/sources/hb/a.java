package hb;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f280388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f280389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f280390c;

    public a(int i10, int i11, int i12) {
        this.f280388a = i10;
        this.f280389b = i11;
        this.f280390c = i12;
    }

    public static /* synthetic */ a e(a aVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = aVar.f280388a;
        }
        if ((i13 & 2) != 0) {
            i11 = aVar.f280389b;
        }
        if ((i13 & 4) != 0) {
            i12 = aVar.f280390c;
        }
        return aVar.d(i10, i11, i12);
    }

    public final int a() {
        return this.f280388a;
    }

    public final int b() {
        return this.f280389b;
    }

    public final int c() {
        return this.f280390c;
    }

    @NotNull
    public final a d(int i10, int i11, int i12) {
        return new a(i10, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f280388a == aVar.f280388a && this.f280389b == aVar.f280389b && this.f280390c == aVar.f280390c) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f280388a;
    }

    public final int g() {
        return this.f280389b;
    }

    public final int h() {
        return this.f280390c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f280388a) * 31) + Integer.hashCode(this.f280389b)) * 31) + Integer.hashCode(this.f280390c);
    }

    @NotNull
    public String toString() {
        return "ContestPrizeRow(rank=" + this.f280388a + ", renders=" + this.f280389b + ", textures=" + this.f280390c + ")";
    }
}
