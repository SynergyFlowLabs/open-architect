package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f67182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f67188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f67189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f67190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f67191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f67192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f67193l;

    private d(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, @androidx.annotation.p0 String str) {
        this.f67182a = list;
        this.f67183b = i10;
        this.f67184c = i11;
        this.f67185d = i12;
        this.f67186e = i13;
        this.f67187f = i14;
        this.f67188g = i15;
        this.f67189h = i16;
        this.f67190i = i17;
        this.f67191j = i18;
        this.f67192k = f10;
        this.f67193l = str;
    }

    private static byte[] a(androidx.media3.common.util.o0 o0Var) {
        int iT = o0Var.T();
        int iF = o0Var.f();
        o0Var.b0(iT);
        return androidx.media3.common.util.k.h(o0Var.e(), iF, iT);
    }

    public static d b(androidx.media3.common.util.o0 o0Var) throws androidx.media3.common.v0 {
        String strD;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            o0Var.b0(4);
            int iL = (o0Var.L() & 3) + 1;
            if (iL == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iL2 = o0Var.L() & 31;
            for (int i18 = 0; i18 < iL2; i18++) {
                arrayList.add(a(o0Var));
            }
            int iL3 = o0Var.L();
            for (int i19 = 0; i19 < iL3; i19++) {
                arrayList.add(a(o0Var));
            }
            if (iL2 > 0) {
                androidx.media3.container.f.m mVarE = androidx.media3.container.f.E((byte[]) arrayList.get(0), androidx.media3.container.f.C.length, ((byte[]) arrayList.get(0)).length);
                int i20 = mVarE.f62195f;
                int i21 = mVarE.f62196g;
                int i22 = mVarE.f62198i + 8;
                int i23 = mVarE.f62199j + 8;
                int i24 = mVarE.f62206q;
                int i25 = mVarE.f62207r;
                int i26 = mVarE.f62208s;
                int i27 = mVarE.f62209t;
                float f11 = mVarE.f62197h;
                strD = androidx.media3.common.util.k.d(mVarE.f62190a, mVarE.f62191b, mVarE.f62192c);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strD = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new d(arrayList, iL, i10, i11, i12, i13, i16, i17, i14, i15, f10, strD);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw androidx.media3.common.v0.a("Error parsing AVC config", e10);
        }
    }
}
