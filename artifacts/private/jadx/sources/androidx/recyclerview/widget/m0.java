package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
interface m0 {

    public static class a implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<x> f74444a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74445b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.m0$a$a, reason: collision with other inner class name */
        class C0732a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private SparseIntArray f74446a = new SparseIntArray(1);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private SparseIntArray f74447b = new SparseIntArray(1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final x f74448c;

            C0732a(x xVar) {
                this.f74448c = xVar;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int a(int i10) {
                int iIndexOfKey = this.f74446a.indexOfKey(i10);
                if (iIndexOfKey > -1) {
                    return this.f74446a.valueAt(iIndexOfKey);
                }
                int iC = a.this.c(this.f74448c);
                this.f74446a.put(i10, iC);
                this.f74447b.put(iC, i10);
                return iC;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int b(int i10) {
                int iIndexOfKey = this.f74447b.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return this.f74447b.valueAt(iIndexOfKey);
                }
                throw new IllegalStateException("requested global type " + i10 + " does not belong to the adapter:" + this.f74448c.f74600c);
            }

            @Override // androidx.recyclerview.widget.m0.c
            public void dispose() {
                a.this.d(this.f74448c);
            }
        }

        @Override // androidx.recyclerview.widget.m0
        @NonNull
        public x a(int i10) {
            x xVar = this.f74444a.get(i10);
            if (xVar != null) {
                return xVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.m0
        @NonNull
        public c b(@NonNull x xVar) {
            return new C0732a(xVar);
        }

        int c(x xVar) {
            int i10 = this.f74445b;
            this.f74445b = i10 + 1;
            this.f74444a.put(i10, xVar);
            return i10;
        }

        void d(@NonNull x xVar) {
            for (int size = this.f74444a.size() - 1; size >= 0; size--) {
                if (this.f74444a.valueAt(size) == xVar) {
                    this.f74444a.removeAt(size);
                }
            }
        }
    }

    public static class b implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<List<x>> f74450a = new SparseArray<>();

        class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final x f74451a;

            a(x xVar) {
                this.f74451a = xVar;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int a(int i10) {
                List<x> arrayList = b.this.f74450a.get(i10);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b.this.f74450a.put(i10, arrayList);
                }
                if (!arrayList.contains(this.f74451a)) {
                    arrayList.add(this.f74451a);
                }
                return i10;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int b(int i10) {
                return i10;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public void dispose() {
                b.this.c(this.f74451a);
            }
        }

        @Override // androidx.recyclerview.widget.m0
        @NonNull
        public x a(int i10) {
            List<x> list = this.f74450a.get(i10);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.m0
        @NonNull
        public c b(@NonNull x xVar) {
            return new a(xVar);
        }

        void c(@NonNull x xVar) {
            for (int size = this.f74450a.size() - 1; size >= 0; size--) {
                List<x> listValueAt = this.f74450a.valueAt(size);
                if (listValueAt.remove(xVar) && listValueAt.isEmpty()) {
                    this.f74450a.removeAt(size);
                }
            }
        }
    }

    public interface c {
        int a(int i10);

        int b(int i10);

        void dispose();
    }

    @NonNull
    x a(int i10);

    @NonNull
    c b(@NonNull x xVar);
}
