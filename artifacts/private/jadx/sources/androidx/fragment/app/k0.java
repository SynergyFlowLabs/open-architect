package androidx.fragment.app;

import androidx.lifecycle.l2;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final Collection<Fragment> f51896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final Map<String, k0> f51897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final Map<String, l2> f51898c;

    k0(@androidx.annotation.p0 Collection<Fragment> collection, @androidx.annotation.p0 Map<String, k0> map, @androidx.annotation.p0 Map<String, l2> map2) {
        this.f51896a = collection;
        this.f51897b = map;
        this.f51898c = map2;
    }

    @androidx.annotation.p0
    Map<String, k0> a() {
        return this.f51897b;
    }

    @androidx.annotation.p0
    Collection<Fragment> b() {
        return this.f51896a;
    }

    @androidx.annotation.p0
    Map<String, l2> c() {
        return this.f51898c;
    }

    boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f51896a;
        if (collection != null) {
            return collection.contains(fragment);
        }
        int i10 = 3 << 0;
        return false;
    }
}
