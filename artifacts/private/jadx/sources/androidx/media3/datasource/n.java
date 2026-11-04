package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class n extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62533j = "data";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private x f62534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private byte[] f62535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f62536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f62537i;

    public n() {
        super(false);
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        w(xVar);
        this.f62534f = xVar;
        Uri uriNormalizeScheme = xVar.f62594a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        androidx.media3.common.util.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrL2 = androidx.media3.common.util.k1.l2(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrL2.length != 2) {
            throw androidx.media3.common.v0.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrL2[1];
        if (strArrL2[0].contains(";base64")) {
            try {
                this.f62535g = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw androidx.media3.common.v0.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f62535g = androidx.media3.common.util.k1.Q0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j10 = xVar.f62600g;
        byte[] bArr = this.f62535g;
        if (j10 > bArr.length) {
            this.f62535g = null;
            throw new u(2008);
        }
        int i10 = (int) j10;
        this.f62536h = i10;
        int length = bArr.length - i10;
        this.f62537i = length;
        long j11 = xVar.f62601h;
        if (j11 != -1) {
            this.f62537i = (int) Math.min(length, j11);
        }
        x(xVar);
        long j12 = xVar.f62601h;
        return j12 != -1 ? j12 : this.f62537i;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() {
        if (this.f62535g != null) {
            this.f62535g = null;
            v();
        }
        this.f62534f = null;
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        x xVar = this.f62534f;
        if (xVar != null) {
            return xVar.f62594a;
        }
        return null;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f62537i;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(androidx.media3.common.util.k1.o(this.f62535g), this.f62536h, bArr, i10, iMin);
        this.f62536h += iMin;
        this.f62537i -= iMin;
        u(iMin);
        return iMin;
    }
}
