package androidx.media3.extractor.ogg;

import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.common.w;
import androidx.media3.extractor.m0;
import androidx.media3.extractor.x0;
import com.google.common.collect.l6;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class h extends i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f68248s = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f68249t = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f68250r;

    h() {
    }

    private static boolean n(o0 o0Var, byte[] bArr) {
        if (o0Var.a() < bArr.length) {
            return false;
        }
        int iF = o0Var.f();
        byte[] bArr2 = new byte[bArr.length];
        o0Var.n(bArr2, 0, bArr.length);
        o0Var.a0(iF);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(o0 o0Var) {
        return n(o0Var, f68248s);
    }

    @Override // androidx.media3.extractor.ogg.i
    protected long f(o0 o0Var) {
        return c(m0.e(o0Var.e()));
    }

    @Override // androidx.media3.extractor.ogg.i
    @il.e(expression = {"#3.format"}, result = false)
    protected boolean h(o0 o0Var, long j10, i.b bVar) throws v0 {
        if (n(o0Var, f68248s)) {
            byte[] bArrCopyOf = Arrays.copyOf(o0Var.e(), o0Var.g());
            int iC = m0.c(bArrCopyOf);
            List<byte[]> listA = m0.a(bArrCopyOf);
            if (bVar.f68268a != null) {
                return true;
            }
            bVar.f68268a = new w.b().U(s0.f61318j0).u0("audio/opus").R(iC).v0(m0.f67467a).g0(listA).N();
            return true;
        }
        byte[] bArr = f68249t;
        if (!n(o0Var, bArr)) {
            androidx.media3.common.util.a.k(bVar.f68268a);
            return false;
        }
        androidx.media3.common.util.a.k(bVar.f68268a);
        if (this.f68250r) {
            return true;
        }
        this.f68250r = true;
        o0Var.b0(bArr.length);
        r0 r0VarD = x0.d(l6.B(x0.k(o0Var, false, false).f69634b));
        if (r0VarD == null) {
            return true;
        }
        bVar.f68268a = bVar.f68268a.b().n0(r0VarD.b(bVar.f68268a.f61758l)).N();
        return true;
    }

    @Override // androidx.media3.extractor.ogg.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f68250r = false;
        }
    }
}
