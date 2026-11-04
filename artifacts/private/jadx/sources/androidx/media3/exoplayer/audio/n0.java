package androidx.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class n0 implements j0.g {
    private AudioTrack b(x.a aVar, androidx.media3.common.d dVar, int i10) {
        return new AudioTrack(e(dVar, aVar.f63442d), k1.Z(aVar.f63440b, aVar.f63441c, aVar.f63439a), aVar.f63444f, 1, i10);
    }

    @androidx.annotation.w0(23)
    private AudioTrack c(x.a aVar, androidx.media3.common.d dVar, int i10) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(dVar, aVar.f63442d)).setAudioFormat(k1.Z(aVar.f63440b, aVar.f63441c, aVar.f63439a)).setTransferMode(1).setBufferSizeInBytes(aVar.f63444f).setSessionId(i10);
        if (k1.f61540a >= 29) {
            g(sessionId, aVar.f63443e);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(androidx.media3.common.d dVar, boolean z10) {
        return z10 ? f() : dVar.b().f60484a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    @androidx.annotation.w0(29)
    private void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }

    @Override // androidx.media3.exoplayer.audio.j0.g
    public final AudioTrack a(x.a aVar, androidx.media3.common.d dVar, int i10) {
        return k1.f61540a >= 23 ? c(aVar, dVar, i10) : b(aVar, dVar, i10);
    }

    @z7.a
    @androidx.annotation.w0(23)
    protected AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}
