package dagger.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class n<K, V> extends dagger.internal.a<K, V, ij.c<V>> implements fg.e<Map<K, ij.c<V>>> {

    public static final class b<K, V> extends dagger.internal.a.AbstractC1893a<K, V, ij.c<V>> {
        public n<K, V> c() {
            return new n<>(this.f269713a);
        }

        @Override // dagger.internal.a.AbstractC1893a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<K, V> a(K k10, ij.c<V> cVar) {
            super.a(k10, cVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.a.AbstractC1893a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b<K, V> b(ij.c<Map<K, ij.c<V>>> cVar) {
            super.b(cVar);
            return this;
        }

        private b(int i10) {
            super(i10);
        }
    }

    public static <K, V> b<K, V> c(int i10) {
        return new b<>(i10);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map<K, ij.c<V>> get() {
        return b();
    }

    private n(Map<K, ij.c<V>> map) {
        super(map);
    }
}
