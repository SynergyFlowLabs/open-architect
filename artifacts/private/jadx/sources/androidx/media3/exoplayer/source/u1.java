package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface u1 {

    public static class a implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f65475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f65476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f65477c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int a(int i10) {
            int i11 = 0 & (-1);
            int i12 = this.f65477c[i10] - 1;
            if (i12 >= 0) {
                return this.f65476b[i12];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int b(int i10) {
            int i11 = this.f65477c[i10] + 1;
            int[] iArr = this.f65476b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int c() {
            int[] iArr = this.f65476b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public u1 d() {
            return new a(0, new Random(this.f65475a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int e() {
            int[] iArr = this.f65476b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public u1 f(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f65476b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f65476b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f65475a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // androidx.media3.exoplayer.source.u1
        public u1 g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f65475a.nextInt(this.f65476b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f65475a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f65476b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f65476b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f65475a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int getLength() {
            return this.f65476b.length;
        }

        public a(int i10, long j10) {
            this(i10, new Random(j10));
        }

        public a(int[] iArr, long j10) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j10));
        }

        private a(int i10, Random random) {
            this(h(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f65476b = iArr;
            this.f65475a = random;
            this.f65477c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f65477c[iArr[i10]] = i10;
            }
        }
    }

    public static final class b implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f65478a;

        public b(int i10) {
            this.f65478a = i10;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int a(int i10) {
            int i11 = i10 - 1;
            if (i11 >= 0) {
                return i11;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int b(int i10) {
            int i11 = i10 + 1;
            if (i11 < this.f65478a) {
                return i11;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int c() {
            int i10 = this.f65478a;
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public u1 d() {
            return new b(0);
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int e() {
            return this.f65478a > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.u1
        public u1 f(int i10, int i11) {
            return new b((this.f65478a - i11) + i10);
        }

        @Override // androidx.media3.exoplayer.source.u1
        public u1 g(int i10, int i11) {
            return new b(this.f65478a + i11);
        }

        @Override // androidx.media3.exoplayer.source.u1
        public int getLength() {
            return this.f65478a;
        }
    }

    int a(int i10);

    int b(int i10);

    int c();

    u1 d();

    int e();

    u1 f(int i10, int i11);

    u1 g(int i10, int i11);

    int getLength();
}
