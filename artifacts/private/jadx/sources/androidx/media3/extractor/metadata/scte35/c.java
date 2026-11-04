package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.n0;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.w0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c extends androidx.media3.extractor.metadata.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f67609d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67610e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67611f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67612g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67613h = 255;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f67614a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f67615b = new n0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w0 f67616c;

    @Override // androidx.media3.extractor.metadata.c
    protected r0 b(androidx.media3.extractor.metadata.b bVar, ByteBuffer byteBuffer) {
        r0.a eVar;
        w0 w0Var = this.f67616c;
        if (w0Var == null || bVar.f67471m != w0Var.f()) {
            w0 w0Var2 = new w0(bVar.f62702f);
            this.f67616c = w0Var2;
            w0Var2.a(bVar.f62702f - bVar.f67471m);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f67614a.Y(bArrArray, iLimit);
        this.f67615b.p(bArrArray, iLimit);
        this.f67615b.s(39);
        long jH = (((long) this.f67615b.h(1)) << 32) | ((long) this.f67615b.h(32));
        this.f67615b.s(20);
        int iH = this.f67615b.h(12);
        int iH2 = this.f67615b.h(8);
        this.f67614a.b0(14);
        if (iH2 == 0) {
            eVar = new e();
        } else if (iH2 == 255) {
            eVar = a.b(this.f67614a, iH, jH);
        } else if (iH2 != 4) {
            int i10 = 1 & 5;
            if (iH2 != 5) {
                eVar = iH2 != 6 ? null : g.b(this.f67614a, jH, this.f67616c);
            } else {
                eVar = d.b(this.f67614a, jH, this.f67616c);
            }
        } else {
            eVar = f.b(this.f67614a);
        }
        return eVar == null ? new r0(new r0.a[0]) : new r0(eVar);
    }
}
