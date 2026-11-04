package androidx.media3.common;

import android.os.Bundle;
import com.google.common.collect.l6;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f60468c = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f60469d = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4 f60470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6<Integer> f60471b;

    public c4(b4 b4Var, int i10) {
        this(b4Var, l6.G(Integer.valueOf(i10)));
    }

    @androidx.media3.common.util.b1
    public static c4 a(Bundle bundle) {
        return new c4(b4.b((Bundle) androidx.media3.common.util.a.g(bundle.getBundle(f60468c))), com.google.common.primitives.l.c((int[]) androidx.media3.common.util.a.g(bundle.getIntArray(f60469d))));
    }

    public int b() {
        return this.f60470a.f60461c;
    }

    @androidx.media3.common.util.b1
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f60468c, this.f60470a.h());
        bundle.putIntArray(f60469d, com.google.common.primitives.l.E(this.f60471b));
        return bundle;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            c4 c4Var = (c4) obj;
            if (this.f60470a.equals(c4Var.f60470a) && this.f60471b.equals(c4Var.f60471b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f60470a.hashCode() + (this.f60471b.hashCode() * 31);
    }

    public c4(b4 b4Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= b4Var.f60459a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f60470a = b4Var;
        this.f60471b = l6.w(list);
    }
}
