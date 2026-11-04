package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class j extends androidx.media3.exoplayer.mediacodec.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f66334e;

    public j(Throwable th2, @p0 androidx.media3.exoplayer.mediacodec.t tVar, @p0 Surface surface) {
        super(th2, tVar);
        this.f66333d = System.identityHashCode(surface);
        this.f66334e = surface == null || surface.isValid();
    }
}
