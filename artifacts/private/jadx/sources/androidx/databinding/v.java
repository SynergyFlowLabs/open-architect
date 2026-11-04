package androidx.databinding;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class v<T> extends ArrayList<T> implements y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient s f49440a = new s();

    private void c(int i10, int i11) {
        s sVar = this.f49440a;
        if (sVar != null) {
            sVar.u(this, i10, i11);
        }
    }

    private void d(int i10, int i11) {
        s sVar = this.f49440a;
        if (sVar != null) {
            sVar.w(this, i10, i11);
        }
    }

    @Override // androidx.databinding.y
    public void X2(y.a aVar) {
        if (this.f49440a == null) {
            this.f49440a = new s();
        }
        this.f49440a.a(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t10) {
        super.add(t10);
        c(size() - 1, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            c(size, size() - size);
        }
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            int i10 = 1 >> 0;
            d(0, size);
        }
    }

    @Override // androidx.databinding.y
    public void f3(y.a aVar) {
        s sVar = this.f49440a;
        if (sVar != null) {
            sVar.n(aVar);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i10) {
        T t10 = (T) super.remove(i10);
        d(i10, 1);
        return t10;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        super.removeRange(i10, i11);
        d(i10, i11 - i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        T t11 = (T) super.set(i10, t10);
        s sVar = this.f49440a;
        if (sVar != null) {
            sVar.t(this, i10, 1);
        }
        return t11;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        super.add(i10, t10);
        c(i10, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean zAddAll = super.addAll(i10, collection);
        if (zAddAll) {
            c(i10, collection.size());
        }
        return zAddAll;
    }
}
