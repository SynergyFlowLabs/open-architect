package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.collection.h3;
import androidx.core.util.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s.a<ArrayList<T>> f46867a = new s.b(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h3<T, ArrayList<T>> f46868b = new h3<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f46869c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<T> f46870d = new HashSet<>();

    private void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (hashSet.contains(t10)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t10);
        ArrayList<T> arrayList2 = this.f46868b.get(t10);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t10);
        arrayList.add(t10);
    }

    @NonNull
    private ArrayList<T> f() {
        ArrayList<T> arrayListAcquire = this.f46867a.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    private void k(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.f46867a.a(arrayList);
    }

    public void a(@NonNull T t10, @NonNull T t11) {
        if (!this.f46868b.containsKey(t10) || !this.f46868b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f46868b.get(t10);
        if (arrayListF == null) {
            arrayListF = f();
            this.f46868b.put(t10, arrayListF);
        }
        arrayListF.add(t11);
    }

    public void b(@NonNull T t10) {
        if (!this.f46868b.containsKey(t10)) {
            boolean z10 = false & false;
            this.f46868b.put(t10, null);
        }
    }

    public void c() {
        int size = this.f46868b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f46868b.k(i10);
            if (arrayListK != null) {
                k(arrayListK);
            }
        }
        this.f46868b.clear();
    }

    public boolean d(@NonNull T t10) {
        return this.f46868b.containsKey(t10);
    }

    @p0
    public List g(@NonNull T t10) {
        return this.f46868b.get(t10);
    }

    @p0
    public List<T> h(@NonNull T t10) {
        int size = this.f46868b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f46868b.k(i10);
            if (arrayListK != null && arrayListK.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f46868b.g(i10));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> i() {
        this.f46869c.clear();
        this.f46870d.clear();
        int size = this.f46868b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f46868b.g(i10), this.f46869c, this.f46870d);
        }
        return this.f46869c;
    }

    public boolean j(@NonNull T t10) {
        int size = this.f46868b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f46868b.k(i10);
            if (arrayListK != null && arrayListK.contains(t10)) {
                return true;
            }
        }
        return false;
    }

    int l() {
        return this.f46868b.size();
    }
}
