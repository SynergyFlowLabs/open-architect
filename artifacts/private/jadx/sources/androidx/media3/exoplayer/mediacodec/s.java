package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class s extends androidx.media3.decoder.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final t f64134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f64135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64136c;

    public s(Throwable th2, @p0 t tVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(tVar == null ? null : tVar.f64139a);
        super(sb2.toString(), th2);
        this.f64134a = tVar;
        String diagnosticInfo = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f64135b = diagnosticInfo;
        this.f64136c = k1.f61540a >= 23 ? a(th2) : k1.u0(diagnosticInfo);
    }

    @w0(23)
    private static int a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
