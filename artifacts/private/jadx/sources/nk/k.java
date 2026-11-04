package nk;

import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public class k implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f333416a;

    @Deprecated
    public k() {
        this.f333416a = null;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        try {
            return ((Comparable) this.f333416a.a(obj)).compareTo((Comparable) this.f333416a.a(obj2));
        } catch (h unused) {
            return 0;
        }
    }

    public k(j jVar) {
        this.f333416a = jVar;
    }
}
