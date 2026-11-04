package androidx.concurrent.futures;

import androidx.annotation.b1;
import androidx.annotation.p0;
import com.google.common.util.concurrent.t1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class e<V> extends a<V> {
    private e() {
    }

    public static <V> e<V> N() {
        return new e<>();
    }

    @Override // androidx.concurrent.futures.a
    public boolean E(@p0 V v10) {
        return super.E(v10);
    }

    @Override // androidx.concurrent.futures.a
    public boolean H(Throwable th2) {
        return super.H(th2);
    }

    @Override // androidx.concurrent.futures.a
    public boolean I(t1<? extends V> t1Var) {
        return super.I(t1Var);
    }
}
