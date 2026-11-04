package org.apache.commons.lang3.concurrent;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class n<T> implements k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f337105b = "ConstantInitializer@%d [ object = %s ]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f337106a;

    public n(T t10) {
        this.f337106a = t10;
    }

    public final T a() {
        return this.f337106a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return Objects.equals(a(), ((n) obj).a());
        }
        return false;
    }

    @Override // org.apache.commons.lang3.concurrent.k
    public T get() throws j {
        return a();
    }

    public int hashCode() {
        if (a() != null) {
            return a().hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.format(f337105b, Integer.valueOf(System.identityHashCode(this)), String.valueOf(a()));
    }
}
