package androidx.media3.common;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f61176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f61177b;

    public interface a {
        @androidx.annotation.p0
        default w O0() {
            return null;
        }

        @androidx.annotation.p0
        default byte[] Y() {
            return null;
        }

        default void a(q0.b bVar) {
        }
    }

    public r0(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public r0 a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new r0(this.f61177b, (a[]) androidx.media3.common.util.k1.I1(this.f61176a, aVarArr));
    }

    public r0 b(@androidx.annotation.p0 r0 r0Var) {
        return r0Var == null ? this : a(r0Var.f61176a);
    }

    public r0 c(long j10) {
        return this.f61177b == j10 ? this : new r0(j10, this.f61176a);
    }

    public a d(int i10) {
        return this.f61176a[i10];
    }

    public int e() {
        return this.f61176a.length;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (Arrays.equals(this.f61176a, r0Var.f61176a) && this.f61177b == r0Var.f61177b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f61176a) * 31) + com.google.common.primitives.n.l(this.f61177b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f61176a));
        if (this.f61177b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f61177b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public r0(long j10, a... aVarArr) {
        this.f61177b = j10;
        this.f61176a = aVarArr;
    }

    public r0(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public r0(long j10, List<? extends a> list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }
}
