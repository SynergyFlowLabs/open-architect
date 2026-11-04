package androidx.media3.extractor.text;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class i extends androidx.media3.decoder.j<o, p, l> implements k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f68524o;

    class a extends p {
        a() {
        }

        @Override // androidx.media3.decoder.h
        public void D() {
            i.this.t(this);
        }
    }

    protected i(String str) {
        super(new o[2], new p[2]);
        this.f68524o = str;
        w(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.j
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final l k(Throwable th2) {
        return new l("Unexpected decode error", th2);
    }

    protected abstract j B(byte[] bArr, int i10, boolean z10) throws l;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.j
    @p0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final l l(o oVar, p pVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(oVar.f62700d);
            pVar.E(oVar.f62702f, B(byteBuffer.array(), byteBuffer.limit(), z10), oVar.f68548m);
            pVar.f62710d = false;
            return null;
        } catch (l e10) {
            return e10;
        }
    }

    @Override // androidx.media3.extractor.text.k
    public void d(long j10) {
    }

    @Override // androidx.media3.decoder.e
    public final String getName() {
        return this.f68524o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.j
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final o i() {
        return new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.j
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final p j() {
        return new a();
    }
}
