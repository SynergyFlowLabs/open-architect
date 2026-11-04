package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
class j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f74325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<a<T>> f74326b = new SparseArray<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a<T> f74327c;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T[] f74328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<T> f74331d;

        a(@NonNull Class<T> cls, int i10) {
            this.f74328a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        }

        boolean a(int i10) {
            int i11 = this.f74329b;
            return i11 <= i10 && i10 < i11 + this.f74330c;
        }

        T b(int i10) {
            return this.f74328a[i10 - this.f74329b];
        }
    }

    public j0(int i10) {
        this.f74325a = i10;
    }

    public a<T> a(a<T> aVar) {
        int iIndexOfKey = this.f74326b.indexOfKey(aVar.f74329b);
        if (iIndexOfKey < 0) {
            this.f74326b.put(aVar.f74329b, aVar);
            return null;
        }
        a<T> aVarValueAt = this.f74326b.valueAt(iIndexOfKey);
        this.f74326b.setValueAt(iIndexOfKey, aVar);
        if (this.f74327c == aVarValueAt) {
            this.f74327c = aVar;
        }
        return aVarValueAt;
    }

    public void b() {
        this.f74326b.clear();
    }

    public a<T> c(int i10) {
        if (i10 < 0 || i10 >= this.f74326b.size()) {
            return null;
        }
        return this.f74326b.valueAt(i10);
    }

    public T d(int i10) {
        a<T> aVar = this.f74327c;
        if (aVar == null || !aVar.a(i10)) {
            int iIndexOfKey = this.f74326b.indexOfKey(i10 - (i10 % this.f74325a));
            if (iIndexOfKey < 0) {
                return null;
            }
            this.f74327c = this.f74326b.valueAt(iIndexOfKey);
        }
        return this.f74327c.b(i10);
    }

    public a<T> e(int i10) {
        a<T> aVar = this.f74326b.get(i10);
        if (this.f74327c == aVar) {
            this.f74327c = null;
        }
        this.f74326b.delete(i10);
        return aVar;
    }

    public int f() {
        return this.f74326b.size();
    }
}
