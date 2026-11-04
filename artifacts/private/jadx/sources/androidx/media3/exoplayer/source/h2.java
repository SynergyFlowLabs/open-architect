package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.common.b4;
import com.google.common.collect.l6;
import com.google.common.collect.x7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class h2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f65073d = "TrackGroupArray";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h2 f65074e = new h2(new b4[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f65075f = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l6<b4> f65077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65078c;

    public h2(b4... b4VarArr) {
        this.f65077b = l6.B(b4VarArr);
        this.f65076a = b4VarArr.length;
        h();
    }

    public static h2 b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f65075f);
        return parcelableArrayList == null ? new h2(new b4[0]) : new h2((b4[]) androidx.media3.common.util.i.d(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.source.g2
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return b4.b((Bundle) obj);
            }
        }, parcelableArrayList).toArray(new b4[0]));
    }

    private void h() {
        int i10 = 0;
        while (i10 < this.f65077b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f65077b.size(); i12++) {
                if (this.f65077b.get(i10).equals(this.f65077b.get(i12))) {
                    androidx.media3.common.util.z.e(f65073d, "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public b4 c(int i10) {
        return this.f65077b.get(i10);
    }

    public l6<Integer> d() {
        return l6.w(x7.D(this.f65077b, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.source.e2
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return Integer.valueOf(((b4) obj).f60461c);
            }
        }));
    }

    public int e(b4 b4Var) {
        int iIndexOf = this.f65077b.indexOf(b4Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h2.class == obj.getClass()) {
            h2 h2Var = (h2) obj;
            if (this.f65076a == h2Var.f65076a && this.f65077b.equals(h2Var.f65077b)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        if (this.f65076a != 0) {
            return false;
        }
        int i10 = 0 >> 1;
        return true;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f65075f, androidx.media3.common.util.i.i(this.f65077b, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.source.f2
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return ((b4) obj).h();
            }
        }));
        return bundle;
    }

    public int hashCode() {
        if (this.f65078c == 0) {
            this.f65078c = this.f65077b.hashCode();
        }
        return this.f65078c;
    }

    public String toString() {
        return this.f65077b.toString();
    }
}
