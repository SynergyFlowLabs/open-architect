package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class u<T> implements h<Set<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h<Set<Object>> f269730c = k.a(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ij.c<T>> f269731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ij.c<Collection<T>>> f269732b;

    public static final class b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f269733c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<ij.c<T>> f269734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ij.c<Collection<T>>> f269735b;

        public b<T> a(ij.c<? extends Collection<? extends T>> cVar) {
            this.f269735b.add(cVar);
            return this;
        }

        public b<T> b(ij.c<? extends T> cVar) {
            this.f269734a.add(cVar);
            return this;
        }

        public u<T> c() {
            return new u<>(this.f269734a, this.f269735b);
        }

        private b(int i10, int i11) {
            this.f269734a = d.e(i10);
            this.f269735b = d.e(i11);
        }
    }

    public static <T> b<T> a(int i10, int i11) {
        return new b<>(i10, i11);
    }

    public static <T> h<Set<T>> b() {
        return (h<Set<T>>) f269730c;
    }

    @Override // ij.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f269731a.size();
        ArrayList arrayList = new ArrayList(this.f269732b.size());
        int size2 = this.f269732b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection<T> collection = this.f269732b.get(i10).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetC = d.c(size);
        int size3 = this.f269731a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            hashSetC.add(p.b(this.f269731a.get(i11).get()));
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            Iterator it = ((Collection) arrayList.get(i12)).iterator();
            while (it.hasNext()) {
                hashSetC.add(p.b(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetC);
    }

    private u(List<ij.c<T>> list, List<ij.c<Collection<T>>> list2) {
        this.f269731a = list;
        this.f269732b = list2;
    }
}
