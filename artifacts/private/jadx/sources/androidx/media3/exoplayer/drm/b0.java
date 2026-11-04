package androidx.media3.exoplayer.drm;

import android.os.Build;
import androidx.media3.common.util.b1;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b0 implements androidx.media3.decoder.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f63590d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f63591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f63592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final boolean f63593c;

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f63590d = z10;
    }

    public b0(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public b0(UUID uuid, byte[] bArr, boolean z10) {
        this.f63591a = uuid;
        this.f63592b = bArr;
        this.f63593c = z10;
    }
}
