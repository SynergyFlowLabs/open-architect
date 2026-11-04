package androidx.work.impl.utils.futures;

import androidx.annotation.b1;
import androidx.annotation.p0;
import com.google.common.util.concurrent.t1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> u() {
        return new c<>();
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean p(@p0 V value) {
        return super.p(value);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean q(Throwable throwable) {
        return super.q(throwable);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean r(t1<? extends V> future) {
        return super.r(future);
    }
}
