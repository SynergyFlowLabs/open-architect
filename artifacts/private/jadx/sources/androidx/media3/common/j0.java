package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f60781c = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f60782d = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f60783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60784b;

    public j0(@androidx.annotation.p0 String str, String str2) {
        this.f60783a = androidx.media3.common.util.k1.G1(str);
        this.f60784b = str2;
    }

    public static j0 a(Bundle bundle) {
        return new j0(bundle.getString(f60781c), (String) androidx.media3.common.util.a.g(bundle.getString(f60782d)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f60783a;
        if (str != null) {
            bundle.putString(f60781c, str);
        }
        bundle.putString(f60782d, this.f60784b);
        return bundle;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (Objects.equals(this.f60783a, j0Var.f60783a) && Objects.equals(this.f60784b, j0Var.f60784b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f60784b.hashCode() * 31;
        String str = this.f60783a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
