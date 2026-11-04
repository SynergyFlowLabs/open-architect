package io.grpc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
final class e2 {

    static final class a<K, V> implements d<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f288741c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K[] f288742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V[] f288743b;

        a(K k10, V v10, K k11, V v11) {
            this(new Object[]{k10, k11}, new Object[]{v10, v11});
        }

        private int c(K k10) {
            int i10 = 0;
            while (true) {
                K[] kArr = this.f288742a;
                if (i10 >= kArr.length) {
                    return -1;
                }
                if (kArr[i10] == k10) {
                    return i10;
                }
                i10++;
            }
        }

        @Override // io.grpc.e2.d
        public V a(K k10, int i10, int i11) {
            int i12 = 0;
            while (true) {
                K[] kArr = this.f288742a;
                if (i12 >= kArr.length) {
                    return null;
                }
                if (kArr[i12] == k10) {
                    return this.f288743b[i12];
                }
                i12++;
            }
        }

        @Override // io.grpc.e2.d
        public d<K, V> b(K k10, V v10, int i10, int i11) {
            int iHashCode = this.f288742a[0].hashCode();
            if (iHashCode != i10) {
                return b.c(new c(k10, v10), i10, this, iHashCode, i11);
            }
            int iC = c(k10);
            if (iC != -1) {
                K[] kArr = this.f288742a;
                Object[] objArrCopyOf = Arrays.copyOf(kArr, kArr.length);
                Object[] objArrCopyOf2 = Arrays.copyOf(this.f288743b, this.f288742a.length);
                objArrCopyOf[iC] = k10;
                objArrCopyOf2[iC] = v10;
                return new a(objArrCopyOf, objArrCopyOf2);
            }
            K[] kArr2 = this.f288742a;
            Object[] objArrCopyOf3 = Arrays.copyOf(kArr2, kArr2.length + 1);
            Object[] objArrCopyOf4 = Arrays.copyOf(this.f288743b, this.f288742a.length + 1);
            K[] kArr3 = this.f288742a;
            objArrCopyOf3[kArr3.length] = k10;
            objArrCopyOf4[kArr3.length] = v10;
            return new a(objArrCopyOf3, objArrCopyOf4);
        }

        @Override // io.grpc.e2.d
        public int size() {
            return this.f288743b.length;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CollisionLeaf(");
            for (int i10 = 0; i10 < this.f288743b.length; i10++) {
                sb2.append("(key=");
                sb2.append(this.f288742a[i10]);
                sb2.append(" value=");
                sb2.append(this.f288743b[i10]);
                sb2.append(") ");
            }
            sb2.append(")");
            return sb2.toString();
        }

        private a(K[] kArr, V[] vArr) {
            this.f288742a = kArr;
            this.f288743b = vArr;
        }
    }

    static final class b<K, V> implements d<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f288744d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f288745e = 31;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f288746f = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f288747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<K, V>[] f288748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f288749c;

        private b(int i10, d<K, V>[] dVarArr, int i11) {
            this.f288747a = i10;
            this.f288748b = dVarArr;
            this.f288749c = i11;
        }

        static <K, V> d<K, V> c(d<K, V> dVar, int i10, d<K, V> dVar2, int i11, int i12) {
            int iE = e(i10, i12);
            int iE2 = e(i11, i12);
            if (iE == iE2) {
                d dVarC = c(dVar, i10, dVar2, i11, i12 + 5);
                return new b(iE, new d[]{dVarC}, dVarC.size());
            }
            if (f(i10, i12) > f(i11, i12)) {
                dVar2 = dVar;
                dVar = dVar2;
            }
            return new b(iE | iE2, new d[]{dVar, dVar2}, dVar.size() + dVar2.size());
        }

        private int d(int i10) {
            return Integer.bitCount(this.f288747a & (i10 - 1));
        }

        private static int e(int i10, int i11) {
            return 1 << f(i10, i11);
        }

        private static int f(int i10, int i11) {
            return (i10 >>> i11) & 31;
        }

        @Override // io.grpc.e2.d
        public V a(K k10, int i10, int i11) {
            int iE = e(i10, i11);
            if ((this.f288747a & iE) == 0) {
                return null;
            }
            return this.f288748b[d(iE)].a(k10, i10, i11 + 5);
        }

        @Override // io.grpc.e2.d
        public d<K, V> b(K k10, V v10, int i10, int i11) {
            int iE = e(i10, i11);
            int iD = d(iE);
            int i12 = this.f288747a;
            if ((i12 & iE) != 0) {
                d<K, V>[] dVarArr = this.f288748b;
                d[] dVarArr2 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
                dVarArr2[iD] = this.f288748b[iD].b(k10, v10, i10, i11 + 5);
                return new b(this.f288747a, dVarArr2, (size() + dVarArr2[iD].size()) - this.f288748b[iD].size());
            }
            int i13 = i12 | iE;
            d<K, V>[] dVarArr3 = this.f288748b;
            d[] dVarArr4 = new d[dVarArr3.length + 1];
            System.arraycopy(dVarArr3, 0, dVarArr4, 0, iD);
            dVarArr4[iD] = new c(k10, v10);
            d<K, V>[] dVarArr5 = this.f288748b;
            System.arraycopy(dVarArr5, iD, dVarArr4, iD + 1, dVarArr5.length - iD);
            return new b(i13, dVarArr4, size() + 1);
        }

        @Override // io.grpc.e2.d
        public int size() {
            return this.f288749c;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CompressedIndex(");
            sb2.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f288747a)));
            for (d<K, V> dVar : this.f288748b) {
                sb2.append(dVar);
                sb2.append(" ");
            }
            sb2.append(")");
            return sb2.toString();
        }
    }

    static final class c<K, V> implements d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f288750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f288751b;

        public c(K k10, V v10) {
            this.f288750a = k10;
            this.f288751b = v10;
        }

        @Override // io.grpc.e2.d
        public V a(K k10, int i10, int i11) {
            if (this.f288750a == k10) {
                return this.f288751b;
            }
            return null;
        }

        @Override // io.grpc.e2.d
        public d<K, V> b(K k10, V v10, int i10, int i11) {
            int iHashCode = this.f288750a.hashCode();
            if (iHashCode != i10) {
                return b.c(new c(k10, v10), i10, this, iHashCode, i11);
            }
            return this.f288750a == k10 ? new c(k10, v10) : new a(this.f288750a, this.f288751b, k10, v10);
        }

        @Override // io.grpc.e2.d
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f288750a, this.f288751b);
        }
    }

    interface d<K, V> {
        V a(K k10, int i10, int i11);

        d<K, V> b(K k10, V v10, int i10, int i11);

        int size();
    }

    private e2() {
    }

    static <K, V> V a(d<K, V> dVar, K k10) {
        if (dVar == null) {
            return null;
        }
        return dVar.a(k10, k10.hashCode(), 0);
    }

    static <K, V> d<K, V> b(d<K, V> dVar, K k10, V v10) {
        return dVar == null ? new c(k10, v10) : dVar.b(k10, v10, k10.hashCode(), 0);
    }
}
