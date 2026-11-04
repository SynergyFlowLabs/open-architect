package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes2.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f43401a = false;

    interface a<T> {
        boolean a(T t10);

        T acquire();

        void b(T[] tArr, int i10);
    }

    static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f43402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43403b;

        b(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f43402a = new Object[i10];
        }

        private boolean c(T t10) {
            for (int i10 = 0; i10 < this.f43403b; i10++) {
                if (this.f43402a[i10] == t10) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.g.a
        public boolean a(T t10) {
            int i10 = this.f43403b;
            Object[] objArr = this.f43402a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f43403b = i10 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.g.a
        public T acquire() {
            int i10 = this.f43403b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            Object[] objArr = this.f43402a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f43403b = i10 - 1;
            return t10;
        }

        @Override // androidx.constraintlayout.core.g.a
        public void b(T[] tArr, int i10) {
            if (i10 > tArr.length) {
                i10 = tArr.length;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                T t10 = tArr[i11];
                int i12 = this.f43403b;
                Object[] objArr = this.f43402a;
                if (i12 < objArr.length) {
                    objArr[i12] = t10;
                    this.f43403b = i12 + 1;
                }
            }
        }
    }

    private g() {
    }
}
