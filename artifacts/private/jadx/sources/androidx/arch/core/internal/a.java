package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f11710e = new HashMap<>();

    public boolean contains(K k10) {
        return this.f11710e.containsKey(k10);
    }

    @Override // androidx.arch.core.internal.b
    @p0
    protected b.c<K, V> d(K k10) {
        return this.f11710e.get(k10);
    }

    @Override // androidx.arch.core.internal.b
    public V m(@NonNull K k10, @NonNull V v10) {
        b.c<K, V> cVarD = d(k10);
        if (cVarD != null) {
            return cVarD.f11716b;
        }
        this.f11710e.put(k10, l(k10, v10));
        return null;
    }

    @Override // androidx.arch.core.internal.b
    public V n(@NonNull K k10) {
        V v10 = (V) super.n(k10);
        this.f11710e.remove(k10);
        return v10;
    }

    @p0
    public Map.Entry<K, V> p(K k10) {
        if (contains(k10)) {
            return this.f11710e.get(k10).f11718d;
        }
        return null;
    }
}
