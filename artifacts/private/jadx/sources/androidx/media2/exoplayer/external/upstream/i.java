package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.b1;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f57327j = "data";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private o f57328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private byte[] f57329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f57330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f57331i;

    public i() {
        super(false);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        g(dataSpec);
        this.f57328f = dataSpec;
        this.f57331i = (int) dataSpec.f57375f;
        Uri uri = dataSpec.f57370a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String strValueOf = String.valueOf(scheme);
            throw new androidx.media2.exoplayer.external.k0(strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        }
        String[] strArrO0 = androidx.media2.exoplayer.external.util.q0.O0(uri.getSchemeSpecificPart(), ",");
        if (strArrO0.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 23);
            sb2.append("Unexpected URI format: ");
            sb2.append(strValueOf2);
            throw new androidx.media2.exoplayer.external.k0(sb2.toString());
        }
        String str = strArrO0[1];
        if (strArrO0[0].contains(";base64")) {
            try {
                this.f57329g = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                String strValueOf3 = String.valueOf(str);
                throw new androidx.media2.exoplayer.external.k0(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e10);
            }
        } else {
            this.f57329g = androidx.media2.exoplayer.external.util.q0.i0(URLDecoder.decode(str, "US-ASCII"));
        }
        long j10 = dataSpec.f57376g;
        int length = j10 != -1 ? ((int) j10) + this.f57331i : this.f57329g.length;
        this.f57330h = length;
        if (length > this.f57329g.length || this.f57331i > length) {
            this.f57329g = null;
            throw new m(0);
        }
        i(dataSpec);
        return ((long) this.f57330h) - ((long) this.f57331i);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() {
        if (this.f57329g != null) {
            this.f57329g = null;
            e();
        }
        this.f57328f = null;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        o oVar = this.f57328f;
        if (oVar != null) {
            return oVar.f57370a;
        }
        return null;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) {
        if (readLength == 0) {
            return 0;
        }
        int i10 = this.f57330h - this.f57331i;
        if (i10 == 0) {
            return -1;
        }
        int iMin = Math.min(readLength, i10);
        System.arraycopy(androidx.media2.exoplayer.external.util.q0.i(this.f57329g), this.f57331i, buffer, offset, iMin);
        this.f57331i += iMin;
        d(iMin);
        return iMin;
    }
}
