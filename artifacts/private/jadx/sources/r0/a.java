package r0;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f359024c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f359025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f359026b;

    public a(long j10, float f10) {
        this.f359025a = j10;
        this.f359026b = f10;
    }

    public static /* synthetic */ a d(a aVar, long j10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.f359025a;
        }
        if ((i10 & 2) != 0) {
            f10 = aVar.f359026b;
        }
        return aVar.c(j10, f10);
    }

    public final long a() {
        return this.f359025a;
    }

    public final float b() {
        return this.f359026b;
    }

    @NotNull
    public final a c(long j10, float f10) {
        return new a(j10, f10);
    }

    public final float e() {
        return this.f359026b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f359025a == aVar.f359025a && Float.compare(this.f359026b, aVar.f359026b) == 0;
    }

    public final long f() {
        return this.f359025a;
    }

    public final void g(float f10) {
        this.f359026b = f10;
    }

    public final void h(long j10) {
        this.f359025a = j10;
    }

    public int hashCode() {
        return (Long.hashCode(this.f359025a) * 31) + Float.hashCode(this.f359026b);
    }

    @NotNull
    public String toString() {
        return "DataPointAtTime(time=" + this.f359025a + ", dataPoint=" + this.f359026b + ')';
    }
}
