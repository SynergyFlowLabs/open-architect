package k0;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f307518e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f307519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f307520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f307521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f307522d;

    public a(boolean z10, int i10, int i11, int i12) {
        this.f307519a = z10;
        this.f307520b = i10;
        this.f307521c = i11;
        this.f307522d = i12;
    }

    public static /* synthetic */ a f(a aVar, boolean z10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = aVar.f307519a;
        }
        if ((i13 & 2) != 0) {
            i10 = aVar.f307520b;
        }
        if ((i13 & 4) != 0) {
            i11 = aVar.f307521c;
        }
        if ((i13 & 8) != 0) {
            i12 = aVar.f307522d;
        }
        return aVar.e(z10, i10, i11, i12);
    }

    public final boolean a() {
        return this.f307519a;
    }

    public final int b() {
        return this.f307520b;
    }

    public final int c() {
        return this.f307521c;
    }

    public final int d() {
        return this.f307522d;
    }

    @NotNull
    public final a e(boolean z10, int i10, int i11, int i12) {
        return new a(z10, i10, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f307519a == aVar.f307519a && this.f307520b == aVar.f307520b && this.f307521c == aVar.f307521c && this.f307522d == aVar.f307522d;
    }

    public final int g() {
        return this.f307521c;
    }

    public final int h() {
        return this.f307522d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f307519a) * 31) + Integer.hashCode(this.f307520b)) * 31) + Integer.hashCode(this.f307521c)) * 31) + Integer.hashCode(this.f307522d);
    }

    public final int i() {
        return this.f307520b;
    }

    public final boolean j() {
        return this.f307519a;
    }

    @NotNull
    public String toString() {
        return "ComposableInfo(isComposable=" + this.f307519a + ", realParamsCount=" + this.f307520b + ", changedParams=" + this.f307521c + ", defaultParams=" + this.f307522d + ')';
    }
}
