package androidx.media3.exoplayer;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface e5 {
    @androidx.annotation.p0
    default z4 a(z4 z4Var, Handler handler, androidx.media3.exoplayer.video.l0 l0Var, androidx.media3.exoplayer.audio.w wVar, androidx.media3.exoplayer.text.h hVar, androidx.media3.exoplayer.metadata.b bVar) {
        return null;
    }

    z4[] b(Handler handler, androidx.media3.exoplayer.video.l0 l0Var, androidx.media3.exoplayer.audio.w wVar, androidx.media3.exoplayer.text.h hVar, androidx.media3.exoplayer.metadata.b bVar);
}
