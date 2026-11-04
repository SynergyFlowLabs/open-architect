package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import com.google.common.collect.l6;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j implements m0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f69141c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f69142d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f69143e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f69144f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f69145g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f69146h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f69147i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f69148j = 134;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<androidx.media3.common.w> f69150b;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j() {
        this(0);
    }

    private g0 c(m0.b bVar) {
        return new g0(e(bVar), s0.f61329p);
    }

    private o0 d(m0.b bVar) {
        return new o0(e(bVar), s0.f61329p);
    }

    private List<androidx.media3.common.w> e(m0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f69150b;
        }
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(bVar.f69249e);
        List<androidx.media3.common.w> arrayList = this.f69150b;
        while (o0Var.a() > 0) {
            int iL = o0Var.L();
            int iF = o0Var.f() + o0Var.L();
            if (iL == 134) {
                arrayList = new ArrayList<>();
                int iL2 = o0Var.L() & 31;
                for (int i11 = 0; i11 < iL2; i11++) {
                    String strI = o0Var.I(3);
                    int iL3 = o0Var.L();
                    boolean z10 = (iL3 & 128) != 0;
                    if (z10) {
                        i10 = iL3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bL = (byte) o0Var.L();
                    o0Var.b0(1);
                    arrayList.add(new androidx.media3.common.w.b().u0(str).j0(strI).O(i10).g0(z10 ? androidx.media3.common.util.k.e((bL & com.google.common.primitives.t.f119782a) != 0) : null).N());
                }
            }
            o0Var.a0(iF);
        }
        return arrayList;
    }

    private boolean f(int i10) {
        return (this.f69149a & i10) != 0;
    }

    @Override // androidx.media3.extractor.ts.m0.c
    public SparseArray<m0> a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    @Override // androidx.media3.extractor.ts.m0.c
    @androidx.annotation.p0
    public m0 b(int i10, m0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new y(new t(bVar.f69246b, bVar.a(), s0.f61329p));
            }
            if (i10 == 21) {
                return new y(new r(s0.f61329p));
            }
            if (i10 == 27) {
                if (f(4)) {
                    return null;
                }
                return new y(new p(c(bVar), f(1), f(8), s0.f61329p));
            }
            if (i10 == 36) {
                return new y(new q(c(bVar), s0.f61329p));
            }
            if (i10 == 45) {
                return new y(new u(s0.f61329p));
            }
            if (i10 == 89) {
                return new y(new l(bVar.f69248d, s0.f61329p));
            }
            if (i10 == 172) {
                return new y(new f(bVar.f69246b, bVar.a(), s0.f61329p));
            }
            if (i10 == 257) {
                return new e0(new x(s0.R0, s0.f61329p));
            }
            if (i10 != 138) {
                if (i10 == 139) {
                    return new y(new k(bVar.f69246b, bVar.a(), 5408, s0.f61329p));
                }
                switch (i10) {
                    case 15:
                        if (f(2)) {
                            return null;
                        }
                        return new y(new i(false, bVar.f69246b, bVar.a(), s0.f61329p));
                    case 16:
                        return new y(new o(d(bVar), s0.f61329p));
                    case 17:
                        if (f(2)) {
                            return null;
                        }
                        return new y(new s(bVar.f69246b, bVar.a(), s0.f61329p));
                    default:
                        switch (i10) {
                            case 128:
                                break;
                            case 129:
                                return new y(new c(bVar.f69246b, bVar.a(), s0.f61329p));
                            case 130:
                                if (!f(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i10) {
                                    case 134:
                                        if (f(16)) {
                                            return null;
                                        }
                                        return new e0(new x("application/x-scte35", s0.f61329p));
                                    case 135:
                                        return new y(new c(bVar.f69246b, bVar.a(), s0.f61329p));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new y(new k(bVar.f69246b, bVar.a(), 4096, s0.f61329p));
        }
        return new y(new n(d(bVar), s0.f61329p));
    }

    public j(int i10) {
        this(i10, l6.F());
    }

    public j(int i10, List<androidx.media3.common.w> list) {
        this.f69149a = i10;
        this.f69150b = list;
    }
}
