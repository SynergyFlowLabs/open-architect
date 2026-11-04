package androidx.media2.exoplayer.external.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public interface x0 {

    public static class a implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f56491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f56492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f56493c;

        public a(int length) {
            this(length, new Random());
        }

        private static int[] h(int length, Random random) {
            int[] iArr = new int[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                int iNextInt = random.nextInt(i11);
                iArr[i10] = iArr[iNextInt];
                iArr[iNextInt] = i10;
                i10 = i11;
            }
            return iArr;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int a(int index) {
            int i10 = this.f56493c[index] - 1;
            if (i10 >= 0) {
                return this.f56492b[i10];
            }
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int b(int index) {
            int i10 = this.f56493c[index] + 1;
            int[] iArr = this.f56492b;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int c() {
            int[] iArr = this.f56492b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public x0 d() {
            return new a(0, new Random(this.f56491a.nextLong()));
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int e() {
            int[] iArr = this.f56492b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public x0 f(int indexFrom, int indexToExclusive) {
            int i10 = indexToExclusive - indexFrom;
            int[] iArr = new int[this.f56492b.length - i10];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.f56492b;
                if (i11 >= iArr2.length) {
                    return new a(iArr, new Random(this.f56491a.nextLong()));
                }
                int i13 = iArr2[i11];
                if (i13 < indexFrom || i13 >= indexToExclusive) {
                    int i14 = i11 - i12;
                    if (i13 >= indexFrom) {
                        i13 -= i10;
                    }
                    iArr[i14] = i13;
                } else {
                    i12++;
                }
                i11++;
            }
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public x0 g(int insertionIndex, int insertionCount) {
            int[] iArr = new int[insertionCount];
            int[] iArr2 = new int[insertionCount];
            int i10 = 0;
            int i11 = 0;
            while (i11 < insertionCount) {
                iArr[i11] = this.f56491a.nextInt(this.f56492b.length + 1);
                int i12 = i11 + 1;
                int iNextInt = this.f56491a.nextInt(i12);
                iArr2[i11] = iArr2[iNextInt];
                iArr2[iNextInt] = i11 + insertionIndex;
                i11 = i12;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f56492b.length + insertionCount];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f56492b;
                if (i10 >= iArr4.length + insertionCount) {
                    return new a(iArr3, new Random(this.f56491a.nextLong()));
                }
                if (i13 >= insertionCount || i14 != iArr[i13]) {
                    int i15 = i14 + 1;
                    int i16 = iArr4[i14];
                    iArr3[i10] = i16;
                    if (i16 >= insertionIndex) {
                        iArr3[i10] = i16 + insertionCount;
                    }
                    i14 = i15;
                } else {
                    iArr3[i10] = iArr2[i13];
                    i13++;
                }
                i10++;
            }
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int getLength() {
            return this.f56492b.length;
        }

        public a(int length, long randomSeed) {
            this(length, new Random(randomSeed));
        }

        public a(int[] shuffledIndices, long randomSeed) {
            this(Arrays.copyOf(shuffledIndices, shuffledIndices.length), new Random(randomSeed));
        }

        private a(int length, Random random) {
            this(h(length, random), random);
        }

        private a(int[] shuffled, Random random) {
            this.f56492b = shuffled;
            this.f56491a = random;
            this.f56493c = new int[shuffled.length];
            for (int i10 = 0; i10 < shuffled.length; i10++) {
                this.f56493c[shuffled[i10]] = i10;
            }
        }
    }

    public static final class b implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f56494a;

        public b(int length) {
            this.f56494a = length;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int a(int index) {
            int i10 = index - 1;
            if (i10 >= 0) {
                return i10;
            }
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int b(int index) {
            int i10 = index + 1;
            if (i10 < this.f56494a) {
                return i10;
            }
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int c() {
            int i10 = this.f56494a;
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public x0 d() {
            return new b(0);
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int e() {
            return this.f56494a > 0 ? 0 : -1;
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public x0 f(int indexFrom, int indexToExclusive) {
            return new b((this.f56494a - indexToExclusive) + indexFrom);
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public x0 g(int insertionIndex, int insertionCount) {
            return new b(this.f56494a + insertionCount);
        }

        @Override // androidx.media2.exoplayer.external.source.x0
        public int getLength() {
            return this.f56494a;
        }
    }

    int a(int index);

    int b(int index);

    int c();

    x0 d();

    int e();

    x0 f(int indexFrom, int indexToExclusive);

    x0 g(int insertionIndex, int insertionCount);

    int getLength();
}
