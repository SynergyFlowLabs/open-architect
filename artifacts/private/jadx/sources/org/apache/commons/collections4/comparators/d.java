package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class d<T> implements Comparator<T>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335628e = 82794675842863201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<T, Integer> f335629a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f335630b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335631c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f335632d = b.EXCEPTION;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f335633a;

        static {
            int[] iArr = new int[b.values().length];
            f335633a = iArr;
            try {
                iArr[b.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f335633a[b.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f335633a[b.EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        BEFORE,
        AFTER,
        EXCEPTION
    }

    public d() {
    }

    public boolean a(T t10) {
        c();
        Map<T, Integer> map = this.f335629a;
        int i10 = this.f335630b;
        this.f335630b = i10 + 1;
        return map.put(t10, Integer.valueOf(i10)) == null;
    }

    public boolean b(T t10, T t11) {
        c();
        Integer num = this.f335629a.get(t10);
        if (num != null) {
            return this.f335629a.put(t11, num) == null;
        }
        throw new IllegalArgumentException(t10 + " not known to " + this);
    }

    protected void c() {
        if (e()) {
            throw new UnsupportedOperationException("Cannot modify a FixedOrderComparator after a comparison");
        }
    }

    @Override // java.util.Comparator
    public int compare(T t10, T t11) {
        this.f335631c = true;
        Integer num = this.f335629a.get(t10);
        Integer num2 = this.f335629a.get(t11);
        if (num != null && num2 != null) {
            return num.compareTo(num2);
        }
        int i10 = a.f335633a[this.f335632d.ordinal()];
        if (i10 == 1) {
            if (num == null) {
                return num2 == null ? 0 : -1;
            }
            return 1;
        }
        if (i10 == 2) {
            if (num == null) {
                return num2 == null ? 0 : 1;
            }
            return -1;
        }
        if (i10 != 3) {
            throw new UnsupportedOperationException("Unknown unknownObjectBehavior: " + this.f335632d);
        }
        if (num != null) {
            t10 = t11;
        }
        throw new IllegalArgumentException("Attempting to compare unknown object " + t10);
    }

    public b d() {
        return this.f335632d;
    }

    public boolean e() {
        return this.f335631c;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        b bVar;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            d dVar = (d) obj;
            Map<T, Integer> map = this.f335629a;
            if (map != null ? map.equals(dVar.f335629a) : dVar.f335629a == null) {
                b bVar2 = this.f335632d;
                if (bVar2 != null ? !(bVar2 != (bVar = dVar.f335632d) || this.f335630b != dVar.f335630b || this.f335631c != dVar.f335631c || bVar2 != bVar) : dVar.f335632d == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(b bVar) {
        c();
        if (bVar == null) {
            throw new NullPointerException("Unknown object behavior must not be null");
        }
        this.f335632d = bVar;
    }

    public int hashCode() {
        Map<T, Integer> map = this.f335629a;
        int iHashCode = 0;
        int iHashCode2 = (629 + (map == null ? 0 : map.hashCode())) * 37;
        b bVar = this.f335632d;
        if (bVar != null) {
            iHashCode = bVar.hashCode();
        }
        return ((((iHashCode2 + iHashCode) * 37) + this.f335630b) * 37) + (!this.f335631c ? 1 : 0);
    }

    public d(T... tArr) {
        if (tArr != null) {
            for (T t10 : tArr) {
                a(t10);
            }
            return;
        }
        throw new NullPointerException("The list of items must not be null");
    }

    public d(List<T> list) {
        if (list == null) {
            throw new NullPointerException("The list of items must not be null");
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
