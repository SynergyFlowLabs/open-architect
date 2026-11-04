package androidx.media3.exoplayer.trackselection;

import android.graphics.Point;
import android.os.SystemClock;
import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.i4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.source.h2;
import com.google.common.collect.l6;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j0 {

    public interface a {
        c0 a(c0.a aVar);
    }

    private j0() {
    }

    public static i4 a(e0.a aVar, h0[] h0VarArr) {
        List[] listArr = new List[h0VarArr.length];
        for (int i10 = 0; i10 < h0VarArr.length; i10++) {
            h0 h0Var = h0VarArr[i10];
            listArr[i10] = h0Var != null ? l6.G(h0Var) : l6.F();
        }
        return b(aVar, listArr);
    }

    public static i4 b(e0.a aVar, List<? extends h0>[] listArr) {
        boolean z10;
        l6.a aVar2 = new l6.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            h2 h2VarH = aVar.h(i10);
            List<? extends h0> list = listArr[i10];
            for (int i11 = 0; i11 < h2VarH.f65076a; i11++) {
                b4 b4VarC = h2VarH.c(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = b4VarC.f60459a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b4VarC.f60459a; i13++) {
                    iArr[i13] = aVar.i(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        h0 h0Var = list.get(i14);
                        if (h0Var.g().equals(b4VarC) && h0Var.f(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new i4.a(b4VarC, z11, iArr, zArr));
            }
        }
        h2 h2VarK = aVar.k();
        for (int i15 = 0; i15 < h2VarK.f65076a; i15++) {
            b4 b4VarC2 = h2VarK.c(i15);
            int[] iArr2 = new int[b4VarC2.f60459a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new i4.a(b4VarC2, false, iArr2, new boolean[b4VarC2.f60459a]));
        }
        return new i4(aVar2.e());
    }

    public static androidx.media3.exoplayer.upstream.m.a c(c0 c0Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = c0Var.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (c0Var.q(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new androidx.media3.exoplayer.upstream.m.a(1, 0, length, i10);
    }

    public static c0[] d(c0.a[] aVarArr, a aVar) {
        c0[] c0VarArr = new c0[aVarArr.length];
        boolean z10 = false;
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            c0.a aVar2 = aVarArr[i10];
            if (aVar2 != null) {
                int[] iArr = aVar2.f65677b;
                if (iArr.length <= 1 || z10) {
                    c0VarArr[i10] = new d0(aVar2.f65676a, iArr[0], aVar2.f65678c);
                } else {
                    c0VarArr[i10] = aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return c0VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0015  */
    public static Point e(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            if ((i12 > i13) == (i10 > i11)) {
                i11 = i10;
                i10 = i11;
            }
        } else {
            i11 = i10;
            i10 = i11;
        }
        int i14 = i12 * i10;
        int i15 = i13 * i11;
        return i14 >= i15 ? new Point(i11, k1.q(i15, i12)) : new Point(k1.q(i14, i13), i10);
    }

    @Deprecated
    public static n.e f(n.e eVar, int i10, h2 h2Var, boolean z10, @p0 n.g gVar) {
        n.e.a aVarZ1 = eVar.I().Y0(i10).Z1(i10, z10);
        if (gVar != null) {
            aVarZ1.b2(i10, h2Var, gVar);
        }
        return aVarZ1.G();
    }
}
