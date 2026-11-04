package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public final class v<T> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f337527f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<T> f337528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f337529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f337530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f337531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient String f337532e;

    private enum a implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    private v(T t10, T t11, Comparator<T> comparator) {
        if (t10 == null || t11 == null) {
            throw new IllegalArgumentException("Elements in a range must not be null: element1=" + t10 + ", element2=" + t11);
        }
        if (comparator == null) {
            this.f337528a = a.INSTANCE;
        } else {
            this.f337528a = comparator;
        }
        if (this.f337528a.compare(t10, t11) < 1) {
            this.f337529b = t10;
            this.f337530c = t11;
        } else {
            this.f337529b = t11;
            this.f337530c = t10;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;TT;)Lorg/apache/commons/lang3/v<TT;>; */
    public static v a(Comparable comparable, Comparable comparable2) {
        return b(comparable, comparable2, null);
    }

    public static <T> v<T> b(T t10, T t11, Comparator<T> comparator) {
        return new v<>(t10, t11, comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;)Lorg/apache/commons/lang3/v<TT;>; */
    public static v j(Comparable comparable) {
        return b(comparable, comparable, null);
    }

    public static <T> v<T> k(T t10, Comparator<T> comparator) {
        return b(t10, t10, comparator);
    }

    public boolean c(T t10) {
        return t10 != null && this.f337528a.compare(t10, this.f337529b) > -1 && this.f337528a.compare(t10, this.f337530c) < 1;
    }

    public boolean d(v<T> vVar) {
        return vVar != null && c(vVar.f337529b) && c(vVar.f337530c);
    }

    public int e(T t10) {
        c0.P(t10, "Element is null", new Object[0]);
        if (l(t10)) {
            return -1;
        }
        return n(t10) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == v.class) {
            v vVar = (v) obj;
            if (this.f337529b.equals(vVar.f337529b) && this.f337530c.equals(vVar.f337530c)) {
                return true;
            }
        }
        return false;
    }

    public Comparator<T> f() {
        return this.f337528a;
    }

    public T g() {
        return this.f337530c;
    }

    public T h() {
        return this.f337529b;
    }

    public int hashCode() {
        int i10 = this.f337531d;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((629 + v.class.hashCode()) * 37) + this.f337529b.hashCode()) * 37) + this.f337530c.hashCode();
        this.f337531d = iHashCode;
        return iHashCode;
    }

    public v<T> i(v<T> vVar) {
        if (!r(vVar)) {
            throw new IllegalArgumentException(String.format("Cannot calculate intersection with non-overlapping range %s", vVar));
        }
        if (equals(vVar)) {
            return this;
        }
        return b(f().compare(this.f337529b, vVar.f337529b) < 0 ? vVar.f337529b : this.f337529b, f().compare(this.f337530c, vVar.f337530c) < 0 ? this.f337530c : vVar.f337530c, f());
    }

    public boolean l(T t10) {
        return t10 != null && this.f337528a.compare(t10, this.f337529b) < 0;
    }

    public boolean m(v<T> vVar) {
        if (vVar == null) {
            return false;
        }
        return l(vVar.f337530c);
    }

    public boolean n(T t10) {
        return t10 != null && this.f337528a.compare(t10, this.f337530c) > 0;
    }

    public boolean o(v<T> vVar) {
        if (vVar == null) {
            return false;
        }
        return n(vVar.f337529b);
    }

    public boolean p(T t10) {
        return t10 != null && this.f337528a.compare(t10, this.f337530c) == 0;
    }

    public boolean q() {
        return this.f337528a == a.INSTANCE;
    }

    public boolean r(v<T> vVar) {
        if (vVar == null) {
            return false;
        }
        return vVar.c(this.f337529b) || vVar.c(this.f337530c) || c(vVar.f337529b);
    }

    public boolean s(T t10) {
        return t10 != null && this.f337528a.compare(t10, this.f337529b) == 0;
    }

    public String t(String str) {
        return String.format(str, this.f337529b, this.f337530c, this.f337528a);
    }

    public String toString() {
        if (this.f337532e == null) {
            this.f337532e = "[" + this.f337529b + ".." + this.f337530c + "]";
        }
        return this.f337532e;
    }
}
