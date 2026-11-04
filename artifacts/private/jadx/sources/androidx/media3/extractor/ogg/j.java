package androidx.media3.extractor.ogg;

import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.common.w;
import androidx.media3.extractor.x0;
import com.google.common.collect.l6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class j extends i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private a f68270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f68271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f68272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private x0.c f68273u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private x0.a f68274v;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0.c f68275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x0.a f68276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f68277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x0.b[] f68278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f68279e;

        public a(x0.c cVar, x0.a aVar, byte[] bArr, x0.b[] bVarArr, int i10) {
            this.f68275a = cVar;
            this.f68276b = aVar;
            this.f68277c = bArr;
            this.f68278d = bVarArr;
            this.f68279e = i10;
        }
    }

    j() {
    }

    @l1
    static void n(o0 o0Var, long j10) {
        if (o0Var.b() < o0Var.g() + 4) {
            o0Var.X(Arrays.copyOf(o0Var.e(), o0Var.g() + 4));
        } else {
            o0Var.Z(o0Var.g() + 4);
        }
        byte[] bArrE = o0Var.e();
        bArrE[o0Var.g() - 4] = (byte) (j10 & 255);
        bArrE[o0Var.g() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrE[o0Var.g() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrE[o0Var.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f68278d[p(b10, aVar.f68279e, 1)].f69636a ? aVar.f68275a.f69646g : aVar.f68275a.f69647h;
    }

    @l1
    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(o0 o0Var) {
        try {
            return x0.o(1, o0Var, true);
        } catch (v0 unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.ogg.i
    protected void e(long j10) {
        super.e(j10);
        this.f68272t = j10 != 0;
        x0.c cVar = this.f68273u;
        this.f68271s = cVar != null ? cVar.f69646g : 0;
    }

    @Override // androidx.media3.extractor.ogg.i
    protected long f(o0 o0Var) {
        if ((o0Var.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(o0Var.e()[0], (a) androidx.media3.common.util.a.k(this.f68270r));
        long j10 = this.f68272t ? (this.f68271s + iO) / 4 : 0;
        n(o0Var, j10);
        this.f68272t = true;
        this.f68271s = iO;
        return j10;
    }

    @Override // androidx.media3.extractor.ogg.i
    @il.e(expression = {"#3.format"}, result = false)
    protected boolean h(o0 o0Var, long j10, i.b bVar) throws IOException {
        if (this.f68270r != null) {
            androidx.media3.common.util.a.g(bVar.f68268a);
            return false;
        }
        a aVarQ = q(o0Var);
        this.f68270r = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        x0.c cVar = aVarQ.f68275a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f69649j);
        arrayList.add(aVarQ.f68277c);
        bVar.f68268a = new w.b().U(s0.f61318j0).u0("audio/vorbis").Q(cVar.f69644e).p0(cVar.f69643d).R(cVar.f69641b).v0(cVar.f69642c).g0(arrayList).n0(x0.d(l6.B(aVarQ.f68276b.f69634b))).N();
        return true;
    }

    @Override // androidx.media3.extractor.ogg.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f68270r = null;
            this.f68273u = null;
            this.f68274v = null;
        }
        this.f68271s = 0;
        this.f68272t = false;
    }

    @l1
    @p0
    a q(o0 o0Var) throws IOException {
        x0.c cVar = this.f68273u;
        if (cVar == null) {
            this.f68273u = x0.l(o0Var);
            return null;
        }
        x0.a aVar = this.f68274v;
        if (aVar == null) {
            this.f68274v = x0.j(o0Var);
            return null;
        }
        byte[] bArr = new byte[o0Var.g()];
        System.arraycopy(o0Var.e(), 0, bArr, 0, o0Var.g());
        x0.b[] bVarArrM = x0.m(o0Var, cVar.f69641b);
        return new a(cVar, aVar, bArr, bVarArrM, x0.b(bVarArrM.length - 1));
    }
}
