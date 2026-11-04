package androidx.media2.exoplayer.external.extractor.mp4;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.util.p;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f54525f = "TrackEncryptionBox";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f54527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.a f54528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final byte[] f54530e;

    public m(boolean isEncrypted, @p0 String schemeType, int perSampleIvSize, byte[] keyId, int defaultEncryptedBlocks, int defaultClearBlocks, @p0 byte[] defaultInitializationVector) {
        androidx.media2.exoplayer.external.util.a.a((defaultInitializationVector == null) ^ (perSampleIvSize == 0));
        this.f54526a = isEncrypted;
        this.f54527b = schemeType;
        this.f54529d = perSampleIvSize;
        this.f54530e = defaultInitializationVector;
        this.f54528c = new s.a(a(schemeType), keyId, defaultEncryptedBlocks, defaultClearBlocks);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(@p0 String schemeType) {
        if (schemeType == null) {
            return 1;
        }
        byte b10 = -1;
        switch (schemeType.hashCode()) {
            case 3046605:
                if (schemeType.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (schemeType.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (schemeType.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (schemeType.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                StringBuilder sb2 = new StringBuilder(schemeType.length() + 68);
                sb2.append("Unsupported protection scheme type '");
                sb2.append(schemeType);
                sb2.append("'. Assuming AES-CTR crypto mode.");
                p.l(f54525f, sb2.toString());
            case 2:
            case 3:
                return 1;
        }
    }
}
