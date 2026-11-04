package androidx.media2.session;

import android.view.Surface;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.VideoSize;
import com.google.common.util.concurrent.t1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class o {

    interface a {
        t1<SessionPlayer.c> A();

        t1<SessionPlayer.c> B();

        t1<SessionPlayer.c> F(long j10);

        t1<SessionPlayer.c> G(float f10);

        long getCurrentPosition();

        long getDuration();

        int i1();

        t1<SessionPlayer.c> pause();

        int s0();

        float t0();

        long v();
    }

    interface b extends a, c {
        t1<SessionPlayer.c> A0(SessionPlayer.TrackInfo trackInfo);

        List<SessionPlayer.TrackInfo> G1();

        SessionPlayer.TrackInfo I1(int i10);

        t1<SessionPlayer.c> K0(SessionPlayer.TrackInfo trackInfo);

        VideoSize h0();

        t1<SessionPlayer.c> z0(Surface surface);
    }

    interface c {
        int C();

        t1<SessionPlayer.c> D(int i10);

        t1<SessionPlayer.c> G0(int i10);

        t1<SessionPlayer.c> H1(int i10);

        int J();

        t1<SessionPlayer.c> K(int i10);

        t1<SessionPlayer.c> N0();

        MediaMetadata V();

        List<MediaItem> V0();

        t1<SessionPlayer.c> Y0(List<MediaItem> list, MediaMetadata mediaMetadata);

        MediaItem Z();

        t1<SessionPlayer.c> Z0(int i10, int i11);

        t1<SessionPlayer.c> a(int i10, MediaItem mediaItem);

        int a0();

        t1<SessionPlayer.c> a1(MediaMetadata mediaMetadata);

        t1<SessionPlayer.c> b(int i10, MediaItem mediaItem);

        t1<SessionPlayer.c> c(MediaItem mediaItem);

        int e0();

        int l0();

        t1<SessionPlayer.c> n0();
    }

    private o() {
    }
}
