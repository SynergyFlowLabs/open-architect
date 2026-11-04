package androidx.media2.exoplayer.external.drm;

import androidx.annotation.b1;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class v implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f53910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f53911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f53912c;

    public v(UUID uuid, byte[] sessionId, boolean forceAllowInsecureDecoderComponents) {
        this.f53910a = uuid;
        this.f53911b = sessionId;
        this.f53912c = forceAllowInsecureDecoderComponents;
    }
}
