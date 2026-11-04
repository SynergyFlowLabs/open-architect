package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class m0 implements j0.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f63322i = 250000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f63323j = 750000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f63324k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f63325l = 250000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f63326m = 50000000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f63327n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f63328o = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f63329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f63330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f63331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f63332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f63333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f63334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f63335h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f63336a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f63337b = m0.f63323j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f63338c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f63339d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f63340e = m0.f63326m;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f63341f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f63342g = 4;

        public m0 h() {
            return new m0(this);
        }

        @z7.a
        public a i(int i10) {
            this.f63341f = i10;
            return this;
        }

        @z7.a
        public a j(int i10) {
            this.f63342g = i10;
            return this;
        }

        @z7.a
        public a k(int i10) {
            this.f63337b = i10;
            return this;
        }

        @z7.a
        public a l(int i10) {
            this.f63336a = i10;
            return this;
        }

        @z7.a
        public a m(int i10) {
            this.f63340e = i10;
            return this;
        }

        @z7.a
        public a n(int i10) {
            this.f63339d = i10;
            return this;
        }

        @z7.a
        public a o(int i10) {
            this.f63338c = i10;
            return this;
        }
    }

    protected m0(a aVar) {
        this.f63329b = aVar.f63336a;
        this.f63330c = aVar.f63337b;
        this.f63331d = aVar.f63338c;
        this.f63332e = aVar.f63339d;
        this.f63333f = aVar.f63340e;
        this.f63334g = aVar.f63341f;
        this.f63335h = aVar.f63342g;
    }

    protected static int b(int i10, int i11, int i12) {
        return com.google.common.primitives.l.e(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int d(int i10) {
        if (i10 == 20) {
            return androidx.media3.extractor.m0.f67468b;
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                    return androidx.media3.extractor.b.f67118a;
                case 6:
                    break;
                case 7:
                    return androidx.media3.extractor.o.f68165f;
                case 8:
                    break;
                case 9:
                    return 40000;
                case 10:
                    return 100000;
                case 11:
                    return androidx.media3.extractor.a.f66991g;
                case 12:
                    return 7000;
                default:
                    switch (i10) {
                        case 14:
                            return androidx.media3.extractor.b.f67120c;
                        case 15:
                            return 8000;
                        case 16:
                            return androidx.media3.extractor.a.f66993i;
                        case 17:
                            return androidx.media3.extractor.c.f67165t;
                        case 18:
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
            return 768000;
        }
        return androidx.media3.extractor.o.f68166g;
    }

    @Override // androidx.media3.exoplayer.audio.j0.f
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i10) {
        return com.google.common.primitives.l.e((((long) this.f63333f) * ((long) d(i10))) / 1000000);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    protected int f(int i10, int i11) {
        int i12;
        int iD;
        int i13 = this.f63332e;
        if (i10 != 5) {
            if (i10 == 8) {
                i12 = this.f63335h;
            }
            if (i11 != -1) {
                iD = com.google.common.math.f.g(i11, 8, RoundingMode.CEILING);
            } else {
                iD = d(i10);
            }
            return com.google.common.primitives.l.e((((long) i13) * ((long) iD)) / 1000000);
        }
        i12 = this.f63334g;
        i13 *= i12;
        if (i11 != -1) {
            iD = com.google.common.math.f.g(i11, 8, RoundingMode.CEILING);
        } else {
            iD = d(i10);
        }
        return com.google.common.primitives.l.e((((long) i13) * ((long) iD)) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return k1.w(i10 * this.f63331d, b(this.f63329b, i11, i12), b(this.f63330c, i11, i12));
    }
}
