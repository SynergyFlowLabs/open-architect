package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@n
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f42556f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f42560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42561e;

    public m(int i10, int i11, int i12, @Nullable String str, int i13) {
        this.f42557a = i10;
        this.f42558b = i11;
        this.f42559c = i12;
        this.f42560d = str;
        this.f42561e = i13;
    }

    public static /* synthetic */ m g(m mVar, int i10, int i11, int i12, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = mVar.f42557a;
        }
        if ((i14 & 2) != 0) {
            i11 = mVar.f42558b;
        }
        if ((i14 & 4) != 0) {
            i12 = mVar.f42559c;
        }
        if ((i14 & 8) != 0) {
            str = mVar.f42560d;
        }
        if ((i14 & 16) != 0) {
            i13 = mVar.f42561e;
        }
        int i15 = i13;
        int i16 = i12;
        return mVar.f(i10, i11, i16, str, i15);
    }

    public final int a() {
        return this.f42557a;
    }

    public final int b() {
        return this.f42558b;
    }

    public final int c() {
        return this.f42559c;
    }

    @Nullable
    public final String d() {
        return this.f42560d;
    }

    public final int e() {
        return this.f42561e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f42557a == mVar.f42557a && this.f42558b == mVar.f42558b && this.f42559c == mVar.f42559c && Intrinsics.areEqual(this.f42560d, mVar.f42560d) && this.f42561e == mVar.f42561e;
    }

    @NotNull
    public final m f(int i10, int i11, int i12, @Nullable String str, int i13) {
        return new m(i10, i11, i12, str, i13);
    }

    public final int h() {
        return this.f42559c;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f42557a) * 31) + Integer.hashCode(this.f42558b)) * 31) + Integer.hashCode(this.f42559c)) * 31;
        String str = this.f42560d;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f42561e);
    }

    public final int i() {
        return this.f42557a;
    }

    public final int j() {
        return this.f42558b;
    }

    public final int k() {
        return this.f42561e;
    }

    @Nullable
    public final String l() {
        return this.f42560d;
    }

    @NotNull
    public String toString() {
        return "SourceLocation(lineNumber=" + this.f42557a + ", offset=" + this.f42558b + ", length=" + this.f42559c + ", sourceFile=" + this.f42560d + ", packageHash=" + this.f42561e + ')';
    }
}
