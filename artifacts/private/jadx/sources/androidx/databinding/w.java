package androidx.databinding;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class w<K, V> extends androidx.collection.a<K, V> implements z<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient t f49441g;

    private void p(Object obj) {
        t tVar = this.f49441g;
        if (tVar != null) {
            tVar.h(this, 0, obj);
        }
    }

    @Override // androidx.collection.h3, java.util.Map
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        p(null);
    }

    @Override // androidx.collection.h3
    public V i(int i10) {
        K kG = g(i10);
        V v10 = (V) super.i(i10);
        if (v10 != null) {
            p(kG);
        }
        return v10;
    }

    @Override // androidx.collection.h3
    public V j(int i10, V v10) {
        K kG = g(i10);
        V v11 = (V) super.j(i10, v10);
        p(kG);
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.a
    public boolean n(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            int iE = e(it.next());
            if (iE >= 0) {
                i(iE);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.collection.a
    public boolean o(Collection<?> collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(g(size))) {
                i(size);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.collection.h3, java.util.Map
    public V put(K k10, V v10) {
        super.put(k10, v10);
        p(k10);
        return v10;
    }

    @Override // androidx.databinding.z
    public void s3(z.a<? extends z<K, V>, K, V> aVar) {
        t tVar = this.f49441g;
        if (tVar != null) {
            tVar.n(aVar);
        }
    }

    @Override // androidx.databinding.z
    public void y2(z.a<? extends z<K, V>, K, V> aVar) {
        if (this.f49441g == null) {
            this.f49441g = new t();
        }
        this.f49441g.a(aVar);
    }
}
