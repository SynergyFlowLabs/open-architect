package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class t<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f269728b = "Set contributions cannot be null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f269729a;

    private t(int i10) {
        this.f269729a = new ArrayList(i10);
    }

    public static <T> t<T> d(int i10) {
        return new t<>(i10);
    }

    public t<T> a(T t10) {
        this.f269729a.add((T) p.c(t10, f269728b));
        return this;
    }

    public t<T> b(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            p.c(it.next(), f269728b);
        }
        this.f269729a.addAll(collection);
        return this;
    }

    public Set<T> c() {
        if (this.f269729a.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.f269729a.size() == 1 ? Collections.singleton(this.f269729a.get(0)) : Collections.unmodifiableSet(new HashSet(this.f269729a));
    }
}
