package androidx.media3.extractor.mp4;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f68122f = "TrackEncryptionBox";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f68124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0.a f68125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final byte[] f68127e;

    public w(boolean z10, @p0 String str, int i10, byte[] bArr, int i11, int i12, @p0 byte[] bArr2) {
        androidx.media3.common.util.a.a((bArr2 == null) ^ (i10 == 0));
        this.f68123a = z10;
        this.f68124b = str;
        this.f68126d = i10;
        this.f68127e = bArr2;
        this.f68125c = new u0.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(@p0 String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                androidx.media3.common.util.z.n(f68122f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
