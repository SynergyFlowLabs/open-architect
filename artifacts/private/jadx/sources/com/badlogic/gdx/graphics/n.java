package com.badlogic.gdx.graphics;

import com.badlogic.gdx.utils.t;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Iterable<m>, Comparable<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m[] f94832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f94834c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a<m> f94835d;

    private static class a<T> implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T[] f94836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f94837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f94838c;

        public a(T[] tArr) {
            this.f94836a = tArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (this.f94837b == null) {
                this.f94837b = new b(this.f94836a);
                this.f94838c = new b(this.f94836a);
            }
            b bVar = this.f94837b;
            int i10 = 3 | 1;
            if (!bVar.f94841c) {
                bVar.f94840b = 0;
                bVar.f94841c = true;
                this.f94838c.f94841c = false;
                return bVar;
            }
            b bVar2 = this.f94838c;
            bVar2.f94840b = 0;
            bVar2.f94841c = true;
            bVar.f94841c = false;
            return bVar2;
        }
    }

    private static class b<T> implements Iterator<T>, Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T[] f94839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f94840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f94841c = true;

        public b(T[] tArr) {
            this.f94839a = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f94841c) {
                return this.f94840b < this.f94839a.length;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f94840b;
            T[] tArr = this.f94839a;
            if (i10 >= tArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f94840b));
            }
            if (!this.f94841c) {
                throw new t("#iterator() cannot be used nested.");
            }
            this.f94840b = i10 + 1;
            return tArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new t("Remove not allowed.");
        }

        public void reset() {
            this.f94840b = 0;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f94842a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f94843b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f94844c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f94845d = 8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f94846e = 16;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f94847f = 32;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f94848g = 64;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f94849h = 128;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f94850i = 256;
    }

    public n(m... mVarArr) {
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("attributes must be >= 1");
        }
        m[] mVarArr2 = new m[mVarArr.length];
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            mVarArr2[i10] = mVarArr[i10];
        }
        this.f94832a = mVarArr2;
        this.f94833b = k();
    }

    private int k() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            m[] mVarArr = this.f94832a;
            if (i10 >= mVarArr.length) {
                return i11;
            }
            m mVar = mVarArr[i10];
            mVar.f94828e = i11;
            i11 = mVar.f94824a == 4 ? i11 + 4 : i11 + (mVar.f94825b * 4);
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f94832a.length != nVar.f94832a.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            m[] mVarArr = this.f94832a;
            if (i10 >= mVarArr.length) {
                return true;
            }
            if (!mVarArr[i10].i(nVar.f94832a[i10])) {
                return false;
            }
            i10++;
        }
    }

    public int hashCode() {
        long length = this.f94832a.length * 61;
        int i10 = 0;
        while (true) {
            m[] mVarArr = this.f94832a;
            if (i10 >= mVarArr.length) {
                return (int) (length ^ (length >> 32));
            }
            length = (length * 61) + ((long) mVarArr[i10].hashCode());
            i10++;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<m> iterator() {
        if (this.f94835d == null) {
            this.f94835d = new a<>(this.f94832a);
        }
        return this.f94835d.iterator();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        m[] mVarArr = this.f94832a;
        int length = mVarArr.length;
        m[] mVarArr2 = nVar.f94832a;
        if (length != mVarArr2.length) {
            return mVarArr.length - mVarArr2.length;
        }
        long jR = r();
        long jR2 = nVar.r();
        if (jR != jR2) {
            return jR < jR2 ? -1 : 1;
        }
        for (int length2 = this.f94832a.length - 1; length2 >= 0; length2--) {
            m mVar = this.f94832a[length2];
            m mVar2 = nVar.f94832a[length2];
            int i10 = mVar.f94824a;
            int i11 = mVar2.f94824a;
            if (i10 != i11) {
                return i10 - i11;
            }
            int i12 = mVar.f94830g;
            int i13 = mVar2.f94830g;
            if (i12 != i13) {
                return i12 - i13;
            }
            int i14 = mVar.f94825b;
            int i15 = mVar2.f94825b;
            if (i14 != i15) {
                return i14 - i15;
            }
            boolean z10 = mVar.f94826c;
            if (z10 != mVar2.f94826c) {
                return z10 ? 1 : -1;
            }
            int i16 = mVar.f94827d;
            int i17 = mVar2.f94827d;
            if (i16 != i17) {
                return i16 - i17;
            }
        }
        return 0;
    }

    public m n(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (p(i11).f94824a == i10) {
                return p(i11);
            }
        }
        return null;
    }

    public m p(int i10) {
        return this.f94832a[i10];
    }

    public long r() {
        if (this.f94834c == -1) {
            long j10 = 0;
            int i10 = 0;
            while (true) {
                m[] mVarArr = this.f94832a;
                if (i10 >= mVarArr.length) {
                    break;
                }
                j10 |= (long) mVarArr[i10].f94824a;
                i10++;
            }
            this.f94834c = j10;
        }
        return this.f94834c;
    }

    public int s(int i10) {
        m mVarN = n(i10);
        if (mVarN == null) {
            return 0;
        }
        return mVarN.f94828e / 4;
    }

    public int size() {
        return this.f94832a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (int i10 = 0; i10 < this.f94832a.length; i10++) {
            sb2.append("(");
            sb2.append(this.f94832a[i10].f94829f);
            sb2.append(", ");
            sb2.append(this.f94832a[i10].f94824a);
            sb2.append(", ");
            sb2.append(this.f94832a[i10].f94825b);
            sb2.append(", ");
            sb2.append(this.f94832a[i10].f94828e);
            sb2.append(")");
            sb2.append("\n");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
