package androidx.media2.exoplayer.external.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j implements h0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54883c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54884d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f54885e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f54886f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f54887g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f54888h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f54889i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54890j = 134;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Format> f54892b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j() {
        this(0);
    }

    private b0 c(h0.b esInfo) {
        return new b0(e(esInfo));
    }

    private j0 d(h0.b esInfo) {
        return new j0(e(esInfo));
    }

    private List<Format> e(h0.b esInfo) {
        String str;
        int i10;
        if (f(32)) {
            return this.f54892b;
        }
        androidx.media2.exoplayer.external.util.x xVar = new androidx.media2.exoplayer.external.util.x(esInfo.f54850d);
        List<Format> arrayList = this.f54892b;
        while (xVar.a() > 0) {
            int iD = xVar.D();
            int iC = xVar.c() + xVar.D();
            if (iD == 134) {
                arrayList = new ArrayList<>();
                int iD2 = xVar.D() & 31;
                for (int i11 = 0; i11 < iD2; i11++) {
                    String strA = xVar.A(3);
                    int iD3 = xVar.D();
                    boolean z10 = (iD3 & 128) != 0;
                    if (z10) {
                        str = "application/cea-708";
                        i10 = iD3 & 63;
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bD = (byte) xVar.D();
                    xVar.R(1);
                    arrayList.add(Format.D(null, str, null, -1, 0, strA, i10, null, Long.MAX_VALUE, z10 ? androidx.media2.exoplayer.external.text.cea.d.a((bD & com.google.common.primitives.t.f119782a) != 0) : null));
                }
            }
            xVar.Q(iC);
        }
        return arrayList;
    }

    private boolean f(int flag) {
        return (this.f54891a & flag) != 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.h0.c
    public SparseArray<h0> a() {
        return new SparseArray<>();
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.h0.c
    public h0 b(int streamType, h0.b esInfo) {
        if (streamType == 2) {
            return new u(new n(d(esInfo)));
        }
        if (streamType == 3 || streamType == 4) {
            return new u(new s(esInfo.f54848b));
        }
        if (streamType == 15) {
            if (f(2)) {
                return null;
            }
            return new u(new i(false, esInfo.f54848b));
        }
        if (streamType == 17) {
            if (f(2)) {
                return null;
            }
            return new u(new r(esInfo.f54848b));
        }
        if (streamType == 21) {
            return new u(new q());
        }
        if (streamType == 27) {
            if (f(4)) {
                return null;
            }
            return new u(new o(c(esInfo), f(1), f(8)));
        }
        if (streamType == 36) {
            return new u(new p(c(esInfo)));
        }
        if (streamType == 89) {
            return new u(new l(esInfo.f54849c));
        }
        if (streamType != 138) {
            if (streamType == 172) {
                return new u(new f(esInfo.f54848b));
            }
            if (streamType != 129) {
                if (streamType != 130) {
                    if (streamType == 134) {
                        if (f(16)) {
                            return null;
                        }
                        return new a0(new c0());
                    }
                    if (streamType != 135) {
                        return null;
                    }
                } else if (!f(64)) {
                    return null;
                }
            }
            return new u(new c(esInfo.f54848b));
        }
        return new u(new k(esInfo.f54848b));
    }

    public j(int flags) {
        this(flags, Collections.singletonList(Format.A(null, "application/cea-608", 0, null)));
    }

    public j(int flags, List<Format> closedCaptionFormats) {
        this.f54891a = flags;
        this.f54892b = closedCaptionFormats;
    }
}
