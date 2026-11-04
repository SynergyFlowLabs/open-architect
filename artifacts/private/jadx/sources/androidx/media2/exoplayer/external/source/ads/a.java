package androidx.media2.exoplayer.external.source.ads;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.j;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55688f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55689g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55690h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f55691i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f55692j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f55693k = new a(new long[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f55695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0515a[] f55696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55698e;

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.source.ads.a$a, reason: collision with other inner class name */
    public static final class C0515a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri[] f55700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f55701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f55702d;

        public C0515a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        @j
        private static long[] a(long[] durationsUs, int count) {
            int length = durationsUs.length;
            int iMax = Math.max(count, length);
            long[] jArrCopyOf = Arrays.copyOf(durationsUs, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        @j
        private static int[] b(int[] states, int count) {
            int length = states.length;
            int iMax = Math.max(count, length);
            int[] iArrCopyOf = Arrays.copyOf(states, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int lastPlayedAdIndex) {
            int i10;
            int i11 = lastPlayedAdIndex + 1;
            while (true) {
                int[] iArr = this.f55701c;
                if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public boolean e() {
            return this.f55699a == -1 || c() < this.f55699a;
        }

        public boolean equals(@p0 Object o10) {
            if (this == o10) {
                return true;
            }
            if (o10 != null && C0515a.class == o10.getClass()) {
                C0515a c0515a = (C0515a) o10;
                if (this.f55699a == c0515a.f55699a && Arrays.equals(this.f55700b, c0515a.f55700b) && Arrays.equals(this.f55701c, c0515a.f55701c) && Arrays.equals(this.f55702d, c0515a.f55702d)) {
                    return true;
                }
            }
            return false;
        }

        @j
        public C0515a f(int count) {
            androidx.media2.exoplayer.external.util.a.a(this.f55699a == -1 && this.f55701c.length <= count);
            return new C0515a(count, b(this.f55701c, count), (Uri[]) Arrays.copyOf(this.f55700b, count), a(this.f55702d, count));
        }

        @j
        public C0515a g(long[] durationsUs) {
            androidx.media2.exoplayer.external.util.a.a(this.f55699a == -1 || durationsUs.length <= this.f55700b.length);
            int length = durationsUs.length;
            Uri[] uriArr = this.f55700b;
            if (length < uriArr.length) {
                durationsUs = a(durationsUs, uriArr.length);
            }
            return new C0515a(this.f55699a, this.f55701c, this.f55700b, durationsUs);
        }

        @j
        public C0515a h(int state, int index) {
            int i10 = this.f55699a;
            androidx.media2.exoplayer.external.util.a.a(i10 == -1 || index < i10);
            int[] iArrB = b(this.f55701c, index + 1);
            int i11 = iArrB[index];
            androidx.media2.exoplayer.external.util.a.a(i11 == 0 || i11 == 1 || i11 == state);
            long[] jArrA = this.f55702d;
            if (jArrA.length != iArrB.length) {
                jArrA = a(jArrA, iArrB.length);
            }
            Uri[] uriArr = this.f55700b;
            if (uriArr.length != iArrB.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrB.length);
            }
            iArrB[index] = state;
            return new C0515a(this.f55699a, iArrB, uriArr, jArrA);
        }

        public int hashCode() {
            return (((((this.f55699a * 31) + Arrays.hashCode(this.f55700b)) * 31) + Arrays.hashCode(this.f55701c)) * 31) + Arrays.hashCode(this.f55702d);
        }

        @j
        public C0515a i(Uri uri, int index) {
            int i10 = this.f55699a;
            int i11 = 1 >> 0;
            androidx.media2.exoplayer.external.util.a.a(i10 == -1 || index < i10);
            int[] iArrB = b(this.f55701c, index + 1);
            androidx.media2.exoplayer.external.util.a.a(iArrB[index] == 0);
            long[] jArrA = this.f55702d;
            if (jArrA.length != iArrB.length) {
                jArrA = a(jArrA, iArrB.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f55700b, iArrB.length);
            uriArr[index] = uri;
            iArrB[index] = 1;
            return new C0515a(this.f55699a, iArrB, uriArr, jArrA);
        }

        @j
        public C0515a j() {
            if (this.f55699a == -1) {
                return new C0515a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.f55701c;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new C0515a(length, iArrCopyOf, this.f55700b, this.f55702d);
        }

        private C0515a(int count, int[] states, Uri[] uris, long[] durationsUs) {
            androidx.media2.exoplayer.external.util.a.a(states.length == uris.length);
            this.f55699a = count;
            this.f55701c = states;
            this.f55700b = uris;
            this.f55702d = durationsUs;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public a(long... adGroupTimesUs) {
        int length = adGroupTimesUs.length;
        this.f55694a = length;
        this.f55695b = Arrays.copyOf(adGroupTimesUs, length);
        this.f55696c = new C0515a[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.f55696c[i10] = new C0515a();
        }
        this.f55697d = 0L;
        this.f55698e = -9223372036854775807L;
    }

    private boolean c(long positionUs, int adGroupIndex) {
        if (positionUs == Long.MIN_VALUE) {
            return false;
        }
        long j10 = this.f55695b[adGroupIndex];
        if (j10 != Long.MIN_VALUE) {
            return positionUs < j10;
        }
        long j11 = this.f55698e;
        return j11 == -9223372036854775807L || positionUs < j11;
    }

    public int a(long positionUs, long periodDurationUs) {
        if (positionUs != Long.MIN_VALUE && (periodDurationUs == -9223372036854775807L || positionUs < periodDurationUs)) {
            int i10 = 0;
            while (true) {
                long[] jArr = this.f55695b;
                if (i10 >= jArr.length) {
                    break;
                }
                long j10 = jArr[i10];
                if (j10 == Long.MIN_VALUE || (positionUs < j10 && this.f55696c[i10].e())) {
                    break;
                }
                i10++;
            }
            if (i10 < this.f55695b.length) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long positionUs) {
        int length = this.f55695b.length - 1;
        while (length >= 0 && c(positionUs, length)) {
            length--;
        }
        if (length < 0 || !this.f55696c[length].e()) {
            return -1;
        }
        return length;
    }

    @j
    public a d(int adGroupIndex, int adCount) {
        androidx.media2.exoplayer.external.util.a.a(adCount > 0);
        C0515a[] c0515aArr = this.f55696c;
        if (c0515aArr[adGroupIndex].f55699a == adCount) {
            return this;
        }
        C0515a[] c0515aArr2 = (C0515a[]) q0.A0(c0515aArr, c0515aArr.length);
        c0515aArr2[adGroupIndex] = this.f55696c[adGroupIndex].f(adCount);
        return new a(this.f55695b, c0515aArr2, this.f55697d, this.f55698e);
    }

    @j
    public a e(long[][] adDurationUs) {
        C0515a[] c0515aArr = this.f55696c;
        C0515a[] c0515aArr2 = (C0515a[]) q0.A0(c0515aArr, c0515aArr.length);
        for (int i10 = 0; i10 < this.f55694a; i10++) {
            c0515aArr2[i10] = c0515aArr2[i10].g(adDurationUs[i10]);
        }
        return new a(this.f55695b, c0515aArr2, this.f55697d, this.f55698e);
    }

    public boolean equals(@p0 Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && a.class == o10.getClass()) {
            a aVar = (a) o10;
            if (this.f55694a == aVar.f55694a && this.f55697d == aVar.f55697d && this.f55698e == aVar.f55698e && Arrays.equals(this.f55695b, aVar.f55695b) && Arrays.equals(this.f55696c, aVar.f55696c)) {
                return true;
            }
        }
        return false;
    }

    @j
    public a f(int adGroupIndex, int adIndexInAdGroup) {
        C0515a[] c0515aArr = this.f55696c;
        C0515a[] c0515aArr2 = (C0515a[]) q0.A0(c0515aArr, c0515aArr.length);
        c0515aArr2[adGroupIndex] = c0515aArr2[adGroupIndex].h(4, adIndexInAdGroup);
        return new a(this.f55695b, c0515aArr2, this.f55697d, this.f55698e);
    }

    @j
    public a g(long adResumePositionUs) {
        return this.f55697d == adResumePositionUs ? this : new a(this.f55695b, this.f55696c, adResumePositionUs, this.f55698e);
    }

    @j
    public a h(int adGroupIndex, int adIndexInAdGroup, Uri uri) {
        C0515a[] c0515aArr = this.f55696c;
        C0515a[] c0515aArr2 = (C0515a[]) q0.A0(c0515aArr, c0515aArr.length);
        c0515aArr2[adGroupIndex] = c0515aArr2[adGroupIndex].i(uri, adIndexInAdGroup);
        return new a(this.f55695b, c0515aArr2, this.f55697d, this.f55698e);
    }

    public int hashCode() {
        return (((((((this.f55694a * 31) + ((int) this.f55697d)) * 31) + ((int) this.f55698e)) * 31) + Arrays.hashCode(this.f55695b)) * 31) + Arrays.hashCode(this.f55696c);
    }

    @j
    public a i(long contentDurationUs) {
        return this.f55698e == contentDurationUs ? this : new a(this.f55695b, this.f55696c, this.f55697d, contentDurationUs);
    }

    @j
    public a j(int adGroupIndex, int adIndexInAdGroup) {
        C0515a[] c0515aArr = this.f55696c;
        C0515a[] c0515aArr2 = (C0515a[]) q0.A0(c0515aArr, c0515aArr.length);
        c0515aArr2[adGroupIndex] = c0515aArr2[adGroupIndex].h(3, adIndexInAdGroup);
        return new a(this.f55695b, c0515aArr2, this.f55697d, this.f55698e);
    }

    @j
    public a k(int adGroupIndex, int adIndexInAdGroup) {
        C0515a[] c0515aArr = this.f55696c;
        C0515a[] c0515aArr2 = (C0515a[]) q0.A0(c0515aArr, c0515aArr.length);
        c0515aArr2[adGroupIndex] = c0515aArr2[adGroupIndex].h(2, adIndexInAdGroup);
        return new a(this.f55695b, c0515aArr2, this.f55697d, this.f55698e);
    }

    @j
    public a l(int adGroupIndex) {
        C0515a[] c0515aArr = this.f55696c;
        C0515a[] c0515aArr2 = (C0515a[]) q0.A0(c0515aArr, c0515aArr.length);
        c0515aArr2[adGroupIndex] = c0515aArr2[adGroupIndex].j();
        return new a(this.f55695b, c0515aArr2, this.f55697d, this.f55698e);
    }

    private a(long[] adGroupTimesUs, C0515a[] adGroups, long adResumePositionUs, long contentDurationUs) {
        this.f55694a = adGroups.length;
        this.f55695b = adGroupTimesUs;
        this.f55696c = adGroups;
        this.f55697d = adResumePositionUs;
        this.f55698e = contentDurationUs;
    }
}
