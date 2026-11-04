package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f43809d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f43810a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.motion.a[] f43811b = new androidx.constraintlayout.core.motion.a[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43812c;

        public a() {
            b();
        }

        public void a(int i10, androidx.constraintlayout.core.motion.a aVar) {
            if (this.f43811b[i10] != null) {
                e(i10);
            }
            this.f43811b[i10] = aVar;
            int[] iArr = this.f43810a;
            int i11 = this.f43812c;
            this.f43812c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f43810a, 999);
            Arrays.fill(this.f43811b, (Object) null);
            this.f43812c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f43810a, this.f43812c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f43812c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(g(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f43810a[i10];
        }

        public void e(int i10) {
            this.f43811b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f43812c;
                if (i11 >= i13) {
                    this.f43812c = i13 - 1;
                    return;
                }
                int[] iArr = this.f43810a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f43812c;
        }

        public androidx.constraintlayout.core.motion.a g(int i10) {
            return this.f43811b[this.f43810a[i10]];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f43813d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f43814a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.motion.b[] f43815b = new androidx.constraintlayout.core.motion.b[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43816c;

        public b() {
            b();
        }

        public void a(int i10, androidx.constraintlayout.core.motion.b bVar) {
            if (this.f43815b[i10] != null) {
                e(i10);
            }
            this.f43815b[i10] = bVar;
            int[] iArr = this.f43814a;
            int i11 = this.f43816c;
            this.f43816c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f43814a, 999);
            Arrays.fill(this.f43815b, (Object) null);
            this.f43816c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f43814a, this.f43816c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f43816c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(g(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f43814a[i10];
        }

        public void e(int i10) {
            this.f43815b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f43816c;
                if (i11 >= i13) {
                    this.f43816c = i13 - 1;
                    return;
                }
                int[] iArr = this.f43814a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f43816c;
        }

        public androidx.constraintlayout.core.motion.b g(int i10) {
            return this.f43815b[this.f43814a[i10]];
        }
    }

    static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f43817d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f43818a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float[][] f43819b = new float[101][];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43820c;

        c() {
            b();
        }

        public void a(int i10, float[] fArr) {
            if (this.f43819b[i10] != null) {
                e(i10);
            }
            this.f43819b[i10] = fArr;
            int[] iArr = this.f43818a;
            int i11 = this.f43820c;
            this.f43820c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f43818a, 999);
            Arrays.fill(this.f43819b, (Object) null);
            this.f43820c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f43818a, this.f43820c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f43820c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(Arrays.toString(g(i10)));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f43818a[i10];
        }

        public void e(int i10) {
            this.f43819b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f43820c;
                if (i11 >= i13) {
                    this.f43820c = i13 - 1;
                    return;
                }
                int[] iArr = this.f43818a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f43820c;
        }

        public float[] g(int i10) {
            return this.f43819b[this.f43818a[i10]];
        }
    }
}
