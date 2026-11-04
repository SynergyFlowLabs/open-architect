package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f60411g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f60412h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f60413i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f60414j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f60415k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f60416l = new b(null, new C0566b[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C0566b f60417m = new C0566b(0).o(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f60418n = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f60419o = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f60420p = androidx.media3.common.util.k1.c1(3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f60421q = androidx.media3.common.util.k1.c1(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    public final Object f60422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f60424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f60426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0566b[] f60427f;

    /* JADX INFO: renamed from: androidx.media3.common.b$b, reason: collision with other inner class name */
    public static final class C0566b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f60428l = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f60429m = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f60430n = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f60431o = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f60432p = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f60433q = androidx.media3.common.util.k1.c1(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f60434r = androidx.media3.common.util.k1.c1(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f60435s = androidx.media3.common.util.k1.c1(7);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @androidx.annotation.l1
        static final String f60436t = androidx.media3.common.util.k1.c1(8);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        static final String f60437u = androidx.media3.common.util.k1.c1(9);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final String f60438v = androidx.media3.common.util.k1.c1(10);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f60439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Uri[] f60442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final k0[] f60443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f60444f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f60445g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String[] f60446h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f60447i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f60448j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f60449k;

        @androidx.annotation.j
        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        @androidx.annotation.j
        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public static C0566b d(Bundle bundle) {
            long j10 = bundle.getLong(f60428l);
            int i10 = bundle.getInt(f60429m);
            int i11 = bundle.getInt(f60435s);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60430n);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f60436t);
            int[] intArray = bundle.getIntArray(f60431o);
            long[] longArray = bundle.getLongArray(f60432p);
            long j11 = bundle.getLong(f60433q);
            boolean z10 = bundle.getBoolean(f60434r);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f60437u);
            boolean z11 = bundle.getBoolean(f60438v);
            if (intArray == null) {
                intArray = new int[0];
            }
            k0[] k0VarArrH = h(parcelableArrayList2, parcelableArrayList);
            if (longArray == null) {
                longArray = new long[0];
            }
            String[] strArr = new String[0];
            if (stringArrayList != null) {
                strArr = (String[]) stringArrayList.toArray(strArr);
            }
            return new C0566b(j10, i10, i11, intArray, k0VarArrH, longArray, j11, z10, strArr, z11);
        }

        private ArrayList<Bundle> g() {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            k0[] k0VarArr = this.f60443e;
            int length = k0VarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                k0 k0Var = k0VarArr[i10];
                arrayList.add(k0Var == null ? null : k0Var.g());
            }
            return arrayList;
        }

        private static k0[] h(@androidx.annotation.p0 ArrayList<Bundle> arrayList, @androidx.annotation.p0 ArrayList<Uri> arrayList2) {
            int i10 = 0;
            if (arrayList != null) {
                k0[] k0VarArr = new k0[arrayList.size()];
                while (i10 < arrayList.size()) {
                    Bundle bundle = arrayList.get(i10);
                    k0VarArr[i10] = bundle == null ? null : k0.b(bundle);
                    i10++;
                }
                return k0VarArr;
            }
            if (arrayList2 == null) {
                return new k0[0];
            }
            k0[] k0VarArr2 = new k0[arrayList2.size()];
            while (i10 < arrayList2.size()) {
                Uri uri = arrayList2.get(i10);
                k0VarArr2[i10] = uri == null ? null : k0.c(uri);
                i10++;
            }
            return k0VarArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C0566b x(boolean z10, boolean z11) {
            return new C0566b(this.f60439a, this.f60440b, this.f60441c, this.f60444f, this.f60443e, this.f60445g, this.f60447i, z11, this.f60446h, z10);
        }

        public C0566b A(int i10) {
            return new C0566b(this.f60439a, this.f60440b, i10, this.f60444f, this.f60443e, this.f60445g, this.f60447i, this.f60448j, this.f60446h, this.f60449k);
        }

        @androidx.annotation.j
        public C0566b B(long j10) {
            return new C0566b(j10, this.f60440b, this.f60441c, this.f60444f, this.f60443e, this.f60445g, this.f60447i, this.f60448j, this.f60446h, this.f60449k);
        }

        public int e() {
            return i(-1);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0566b.class == obj.getClass()) {
                C0566b c0566b = (C0566b) obj;
                if (this.f60439a == c0566b.f60439a && this.f60440b == c0566b.f60440b && this.f60441c == c0566b.f60441c && Arrays.equals(this.f60443e, c0566b.f60443e) && Arrays.equals(this.f60444f, c0566b.f60444f) && Arrays.equals(this.f60445g, c0566b.f60445g) && this.f60447i == c0566b.f60447i && this.f60448j == c0566b.f60448j && Arrays.equals(this.f60446h, c0566b.f60446h) && this.f60449k == c0566b.f60449k) {
                    return true;
                }
            }
            return false;
        }

        public int f(String str) {
            int i10 = 0;
            while (true) {
                String[] strArr = this.f60446h;
                if (i10 >= strArr.length) {
                    return -1;
                }
                if (Objects.equals(strArr[i10], str)) {
                    return i10;
                }
                i10++;
            }
        }

        public int hashCode() {
            int i10 = ((this.f60440b * 31) + this.f60441c) * 31;
            long j10 = this.f60439a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f60443e)) * 31) + Arrays.hashCode(this.f60444f)) * 31) + Arrays.hashCode(this.f60445g)) * 31;
            long j11 = this.f60447i;
            return ((((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f60448j ? 1 : 0)) * 31) + Arrays.hashCode(this.f60446h)) * 31) + (this.f60449k ? 1 : 0);
        }

        public int i(@androidx.annotation.g0(from = -1) int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f60444f;
                if (i12 >= iArr.length || this.f60448j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean j() {
            int i10;
            if (this.f60440b == -1) {
                return true;
            }
            for (0; i10 < this.f60440b; i10 + 1) {
                int i11 = this.f60444f[i10];
                i10 = (i11 == 0 || i11 == 1) ? 0 : i10 + 1;
                return true;
            }
            return false;
        }

        public boolean k() {
            return this.f60449k && this.f60439a == Long.MIN_VALUE && this.f60440b == -1;
        }

        public boolean l(boolean z10) {
            return this.f60448j == z10 && k();
        }

        public boolean m() {
            return this.f60440b == -1 || e() < this.f60440b;
        }

        public Bundle n() {
            Bundle bundle = new Bundle();
            bundle.putLong(f60428l, this.f60439a);
            bundle.putInt(f60429m, this.f60440b);
            bundle.putInt(f60435s, this.f60441c);
            bundle.putParcelableArrayList(f60430n, new ArrayList<>(Arrays.asList(this.f60442d)));
            bundle.putParcelableArrayList(f60436t, g());
            bundle.putIntArray(f60431o, this.f60444f);
            bundle.putLongArray(f60432p, this.f60445g);
            bundle.putLong(f60433q, this.f60447i);
            bundle.putBoolean(f60434r, this.f60448j);
            bundle.putStringArrayList(f60437u, new ArrayList<>(Arrays.asList(this.f60446h)));
            bundle.putBoolean(f60438v, this.f60449k);
            return bundle;
        }

        @androidx.annotation.j
        public C0566b o(int i10) {
            int[] iArrC = c(this.f60444f, i10);
            long[] jArrB = b(this.f60445g, i10);
            return new C0566b(this.f60439a, i10, this.f60441c, iArrC, (k0[]) Arrays.copyOf(this.f60443e, i10), jArrB, this.f60447i, this.f60448j, (String[]) Arrays.copyOf(this.f60446h, i10), this.f60449k);
        }

        @androidx.annotation.j
        public C0566b p(long[] jArr) {
            int length = jArr.length;
            k0[] k0VarArr = this.f60443e;
            if (length < k0VarArr.length) {
                jArr = b(jArr, k0VarArr.length);
            } else if (this.f60440b != -1 && jArr.length > k0VarArr.length) {
                jArr = Arrays.copyOf(jArr, k0VarArr.length);
            }
            return new C0566b(this.f60439a, this.f60440b, this.f60441c, this.f60444f, this.f60443e, jArr, this.f60447i, this.f60448j, this.f60446h, this.f60449k);
        }

        @androidx.annotation.j
        public C0566b q(String str, @androidx.annotation.g0(from = 0) int i10) {
            int[] iArrC = c(this.f60444f, i10 + 1);
            long[] jArrB = this.f60445g;
            if (jArrB.length != iArrC.length) {
                jArrB = b(jArrB, iArrC.length);
            }
            long[] jArr = jArrB;
            k0[] k0VarArr = this.f60443e;
            if (k0VarArr.length != iArrC.length) {
                k0VarArr = (k0[]) Arrays.copyOf(k0VarArr, iArrC.length);
            }
            k0[] k0VarArr2 = k0VarArr;
            String[] strArr = this.f60446h;
            if (strArr.length != iArrC.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrC.length);
            }
            String[] strArr2 = strArr;
            strArr2[i10] = str;
            return new C0566b(this.f60439a, this.f60440b, this.f60441c, iArrC, k0VarArr2, jArr, this.f60447i, this.f60448j, strArr2, this.f60449k);
        }

        @androidx.annotation.j
        public C0566b r(k0 k0Var, @androidx.annotation.g0(from = 0) int i10) {
            int[] iArrC = c(this.f60444f, i10 + 1);
            long[] jArrB = this.f60445g;
            if (jArrB.length != iArrC.length) {
                jArrB = b(jArrB, iArrC.length);
            }
            long[] jArr = jArrB;
            k0[] k0VarArr = (k0[]) Arrays.copyOf(this.f60443e, iArrC.length);
            k0VarArr[i10] = k0Var;
            iArrC[i10] = 1;
            String[] strArr = this.f60446h;
            if (strArr.length != iArrC.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrC.length);
            }
            return new C0566b(this.f60439a, this.f60440b, this.f60441c, iArrC, k0VarArr, jArr, this.f60447i, this.f60448j, strArr, this.f60449k);
        }

        @androidx.annotation.j
        public C0566b s(int i10, @androidx.annotation.g0(from = 0) int i11) {
            int i12 = this.f60440b;
            androidx.media3.common.util.a.a(i12 == -1 || i11 < i12);
            int[] iArrC = c(this.f60444f, i11 + 1);
            int i13 = iArrC[i11];
            androidx.media3.common.util.a.a(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArrB = this.f60445g;
            if (jArrB.length != iArrC.length) {
                jArrB = b(jArrB, iArrC.length);
            }
            long[] jArr = jArrB;
            k0[] k0VarArr = this.f60443e;
            if (k0VarArr.length != iArrC.length) {
                k0VarArr = (k0[]) Arrays.copyOf(k0VarArr, iArrC.length);
            }
            k0[] k0VarArr2 = k0VarArr;
            String[] strArr = this.f60446h;
            if (strArr.length != iArrC.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrC.length);
            }
            String[] strArr2 = strArr;
            iArrC[i11] = i10;
            return new C0566b(this.f60439a, this.f60440b, this.f60441c, iArrC, k0VarArr2, jArr, this.f60447i, this.f60448j, strArr2, this.f60449k);
        }

        @androidx.annotation.j
        @Deprecated
        public C0566b t(Uri uri, @androidx.annotation.g0(from = 0) int i10) {
            return r(k0.c(uri), i10);
        }

        @androidx.annotation.j
        public C0566b u() {
            if (this.f60440b == -1) {
                return this;
            }
            int[] iArr = this.f60444f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 3 || i11 == 2 || i11 == 4) {
                    iArrCopyOf[i10] = this.f60443e[i10] == null ? 0 : 1;
                }
            }
            return new C0566b(this.f60439a, length, this.f60441c, iArrCopyOf, this.f60443e, this.f60445g, this.f60447i, this.f60448j, this.f60446h, this.f60449k);
        }

        @androidx.annotation.j
        public C0566b v() {
            if (this.f60440b == -1) {
                return new C0566b(this.f60439a, 0, this.f60441c, new int[0], new k0[0], new long[0], this.f60447i, this.f60448j, this.f60446h, this.f60449k);
            }
            int[] iArr = this.f60444f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new C0566b(this.f60439a, length, this.f60441c, iArrCopyOf, this.f60443e, this.f60445g, this.f60447i, this.f60448j, this.f60446h, this.f60449k);
        }

        @androidx.annotation.j
        public C0566b w(long j10) {
            return new C0566b(this.f60439a, this.f60440b, this.f60441c, this.f60444f, this.f60443e, this.f60445g, j10, this.f60448j, this.f60446h, this.f60449k);
        }

        @androidx.annotation.j
        public C0566b y(boolean z10) {
            return new C0566b(this.f60439a, this.f60440b, this.f60441c, this.f60444f, this.f60443e, this.f60445g, this.f60447i, z10, this.f60446h, this.f60449k);
        }

        public C0566b z() {
            int[] iArr = this.f60444f;
            int length = iArr.length - 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            k0[] k0VarArr = (k0[]) Arrays.copyOf(this.f60443e, length);
            long[] jArrCopyOf = this.f60445g;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new C0566b(this.f60439a, length, this.f60441c, iArrCopyOf, k0VarArr, jArr, androidx.media3.common.util.k1.q2(jArr), this.f60448j, (String[]) Arrays.copyOf(this.f60446h, length), this.f60449k);
        }

        public C0566b(long j10) {
            this(j10, -1, -1, new int[0], new k0[0], new long[0], 0L, false, new String[0], false);
        }

        private C0566b(long j10, int i10, int i11, int[] iArr, k0[] k0VarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            androidx.media3.common.util.a.a(iArr.length == k0VarArr.length);
            this.f60439a = j10;
            this.f60440b = i10;
            this.f60441c = i11;
            this.f60444f = iArr;
            this.f60443e = k0VarArr;
            this.f60445g = jArr;
            this.f60447i = j11;
            this.f60448j = z10;
            this.f60442d = new Uri[k0VarArr.length];
            while (true) {
                Uri[] uriArr = this.f60442d;
                if (i12 < uriArr.length) {
                    k0 k0Var = k0VarArr[i12];
                    uriArr[i12] = k0Var == null ? null : ((k0.h) androidx.media3.common.util.a.g(k0Var.f60822b)).f60920a;
                    i12++;
                } else {
                    this.f60446h = strArr;
                    this.f60449k = z11;
                    return;
                }
            }
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public b(Object obj, long... jArr) {
        this(obj, a(jArr), 0L, -9223372036854775807L, 0);
    }

    private static C0566b[] a(long[] jArr) {
        int length = jArr.length;
        C0566b[] c0566bArr = new C0566b[length];
        for (int i10 = 0; i10 < length; i10++) {
            c0566bArr[i10] = new C0566b(jArr[i10]);
        }
        return c0566bArr;
    }

    public static b d(Object obj, b bVar) {
        int i10 = bVar.f60423b - bVar.f60426e;
        C0566b[] c0566bArr = new C0566b[i10];
        int i11 = 0;
        while (i11 < i10) {
            C0566b c0566b = bVar.f60427f[i11];
            long j10 = c0566b.f60439a;
            int i12 = c0566b.f60440b;
            int i13 = c0566b.f60441c;
            int[] iArr = c0566b.f60444f;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            k0[] k0VarArr = c0566b.f60443e;
            k0[] k0VarArr2 = (k0[]) Arrays.copyOf(k0VarArr, k0VarArr.length);
            long[] jArr = c0566b.f60445g;
            c0566bArr[i11] = new C0566b(j10, i12, i13, iArrCopyOf, k0VarArr2, Arrays.copyOf(jArr, jArr.length), c0566b.f60447i, c0566b.f60448j, c0566b.f60446h, c0566b.f60449k);
            i11++;
            i10 = i10;
        }
        return new b(obj, c0566bArr, bVar.f60424c, bVar.f60425d, bVar.f60426e);
    }

    public static b e(Bundle bundle) {
        C0566b[] c0566bArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60418n);
        if (parcelableArrayList == null) {
            c0566bArr = new C0566b[0];
        } else {
            C0566b[] c0566bArr2 = new C0566b[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                c0566bArr2[i10] = C0566b.d((Bundle) parcelableArrayList.get(i10));
            }
            c0566bArr = c0566bArr2;
        }
        String str = f60419o;
        b bVar = f60416l;
        return new b(null, c0566bArr, bundle.getLong(str, bVar.f60424c), bundle.getLong(f60420p, bVar.f60425d), bundle.getInt(f60421q, bVar.f60426e));
    }

    private boolean m(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        C0566b c0566bF = f(i10);
        long j12 = c0566bF.f60439a;
        if (j12 != Long.MIN_VALUE) {
            return j10 < j12;
        }
        if (j11 != -9223372036854775807L && !c0566bF.k() && j10 >= j11) {
            return false;
        }
        return true;
    }

    @androidx.annotation.j
    public b A(@androidx.annotation.g0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        if (c0566bArr[i11].f60447i == j10) {
            return this;
        }
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i11] = c0566bArr2[i11].w(j10);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.l1
    b B(int i10, boolean z10, boolean z11) {
        int i11 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b c0566b = c0566bArr[i11];
        if (c0566b.f60449k == z10 && c0566b.f60448j == z11) {
            return this;
        }
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i11] = c0566bArr2[i11].x(z10, z11);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b C(@androidx.annotation.g0(from = 0) int i10, boolean z10) {
        int i11 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        if (c0566bArr[i11].f60448j == z10) {
            return this;
        }
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i11] = c0566bArr2[i11].y(z10);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b D(@androidx.annotation.g0(from = 0) int i10) {
        int i11 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i11] = c0566bArr2[i11].z();
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @z7.m(replacement = "this.withLivePostrollPlaceholderAppended(true)")
    @Deprecated
    public b E() {
        return F(true);
    }

    public b F(boolean z10) {
        return G(this.f60423b, Long.MIN_VALUE).B(this.f60423b, true, z10);
    }

    @androidx.annotation.j
    public b G(@androidx.annotation.g0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f60426e;
        C0566b c0566b = new C0566b(j10);
        C0566b[] c0566bArr = (C0566b[]) androidx.media3.common.util.k1.H1(this.f60427f, c0566b);
        System.arraycopy(c0566bArr, i11, c0566bArr, i11 + 1, this.f60427f.length - i11);
        c0566bArr[i11] = c0566b;
        return new b(this.f60422a, c0566bArr, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b H(@androidx.annotation.g0(from = 0) int i10, int i11) {
        int i12 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        if (c0566bArr[i12].f60441c == i11) {
            return this;
        }
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i12] = c0566bArr2[i12].A(i11);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b I(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        int i12 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i12] = c0566bArr2[i12].s(3, i11);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b J(@androidx.annotation.g0(from = 0) int i10) {
        int i11 = this.f60426e;
        if (i11 == i10) {
            return this;
        }
        androidx.media3.common.util.a.a(i10 > i11);
        int i12 = this.f60423b - i10;
        C0566b[] c0566bArr = new C0566b[i12];
        System.arraycopy(this.f60427f, i10 - this.f60426e, c0566bArr, 0, i12);
        return new b(this.f60422a, c0566bArr, this.f60424c, this.f60425d, i10);
    }

    @androidx.annotation.j
    public b K(@androidx.annotation.g0(from = 0) int i10) {
        int i11 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i11] = c0566bArr2[i11].u();
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b L(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        int i12 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i12] = c0566bArr2[i12].s(2, i11);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b M(@androidx.annotation.g0(from = 0) int i10) {
        int i11 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i11] = c0566bArr2[i11].v();
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    public boolean b() {
        int i10 = this.f60423b - 1;
        return i10 >= 0 && k(i10);
    }

    public boolean c(boolean z10) {
        int i10 = this.f60423b - 1;
        return i10 >= 0 && l(i10, z10);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (Objects.equals(this.f60422a, bVar.f60422a) && this.f60423b == bVar.f60423b && this.f60424c == bVar.f60424c && this.f60425d == bVar.f60425d && this.f60426e == bVar.f60426e && Arrays.equals(this.f60427f, bVar.f60427f)) {
                return true;
            }
        }
        return false;
    }

    public C0566b f(@androidx.annotation.g0(from = 0) int i10) {
        int i11 = this.f60426e;
        return i10 < i11 ? f60417m : this.f60427f[i10 - i11];
    }

    public int g(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f60426e;
            while (i10 < this.f60423b && ((f(i10).f60439a != Long.MIN_VALUE && f(i10).f60439a <= j10) || !f(i10).m())) {
                i10++;
            }
            if (i10 < this.f60423b) {
                return i10;
            }
        }
        return -1;
    }

    public int h(long j10, long j11) {
        b bVar;
        int i10 = this.f60423b - 1;
        int i11 = i10 - (k(i10) ? 1 : 0);
        while (true) {
            bVar = this;
            if (i11 < 0) {
                break;
            }
            long j12 = j10;
            long j13 = j11;
            if (!bVar.m(j12, j13, i11)) {
                break;
            }
            i11--;
            this = bVar;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !bVar.f(i11).j()) {
            return -1;
        }
        return i11;
    }

    public int hashCode() {
        int i10 = this.f60423b * 31;
        Object obj = this.f60422a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f60424c)) * 31) + ((int) this.f60425d)) * 31) + this.f60426e) * 31) + Arrays.hashCode(this.f60427f);
    }

    public int i(int i10, String str) {
        return f(i10).f(str);
    }

    public boolean j(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        C0566b c0566bF;
        int i12;
        return i10 < this.f60423b && (i12 = (c0566bF = f(i10)).f60440b) != -1 && i11 < i12 && c0566bF.f60444f[i11] == 4;
    }

    public boolean k(int i10) {
        return i10 == this.f60423b - 1 && f(i10).k();
    }

    public boolean l(int i10, boolean z10) {
        return i10 == this.f60423b - 1 && f(i10).l(z10);
    }

    public Bundle n() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C0566b c0566b : this.f60427f) {
            arrayList.add(c0566b.n());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f60418n, arrayList);
        }
        long j10 = this.f60424c;
        b bVar = f60416l;
        if (j10 != bVar.f60424c) {
            bundle.putLong(f60419o, j10);
        }
        long j11 = this.f60425d;
        if (j11 != bVar.f60425d) {
            bundle.putLong(f60420p, j11);
        }
        int i10 = this.f60426e;
        if (i10 != bVar.f60426e) {
            bundle.putInt(f60421q, i10);
        }
        return bundle;
    }

    @androidx.annotation.j
    public b o(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 1) int i11) {
        androidx.media3.common.util.a.a(i11 > 0);
        int i12 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        if (c0566bArr[i12].f60440b == i11) {
            return this;
        }
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i12] = this.f60427f[i12].o(i11);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b p(@androidx.annotation.g0(from = 0) int i10, long... jArr) {
        int i11 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i11] = c0566bArr2[i11].p(jArr);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b q(long[][] jArr) {
        androidx.media3.common.util.a.i(this.f60426e == 0);
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        for (int i10 = 0; i10 < this.f60423b; i10++) {
            c0566bArr2[i10] = c0566bArr2[i10].p(jArr[i10]);
        }
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b r(@androidx.annotation.g0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i11] = this.f60427f[i11].B(j10);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b s(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11, String str) {
        int i12 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i12] = c0566bArr2[i12].q(str, i11);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b t(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        int i12 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        c0566bArr2[i12] = c0566bArr2[i12].s(4, i11);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f60422a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f60424c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f60427f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f60427f[i10].f60439a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f60427f[i10].f60444f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f60427f[i10].f60444f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f60427f[i10].f60445g[i11]);
                sb2.append(')');
                if (i11 < this.f60427f[i10].f60444f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f60427f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    @androidx.annotation.j
    public b u(long j10) {
        return this.f60424c == j10 ? this : new b(this.f60422a, this.f60427f, j10, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b v(Object obj) {
        return new b(obj, this.f60427f, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    public b w(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        return x(i10, i11, k0.c(Uri.EMPTY));
    }

    @androidx.annotation.j
    public b x(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11, k0 k0Var) {
        k0.h hVar;
        int i12 = i10 - this.f60426e;
        C0566b[] c0566bArr = this.f60427f;
        C0566b[] c0566bArr2 = (C0566b[]) androidx.media3.common.util.k1.J1(c0566bArr, c0566bArr.length);
        androidx.media3.common.util.a.i(c0566bArr2[i12].f60448j || !((hVar = k0Var.f60822b) == null || hVar.f60920a.equals(Uri.EMPTY)));
        c0566bArr2[i12] = c0566bArr2[i12].r(k0Var, i11);
        return new b(this.f60422a, c0566bArr2, this.f60424c, this.f60425d, this.f60426e);
    }

    @androidx.annotation.j
    @Deprecated
    public b y(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11, Uri uri) {
        return x(i10, i11, k0.c(uri));
    }

    @androidx.annotation.j
    public b z(long j10) {
        return this.f60425d == j10 ? this : new b(this.f60422a, this.f60427f, this.f60424c, j10, this.f60426e);
    }

    private b(@androidx.annotation.p0 Object obj, C0566b[] c0566bArr, long j10, long j11, int i10) {
        this.f60422a = obj;
        this.f60424c = j10;
        this.f60425d = j11;
        this.f60423b = c0566bArr.length + i10;
        this.f60427f = c0566bArr;
        this.f60426e = i10;
    }
}
