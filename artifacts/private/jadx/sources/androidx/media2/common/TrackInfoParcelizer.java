package androidx.media2.common;

import androidx.annotation.b1;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class TrackInfoParcelizer {
    public static SessionPlayer.TrackInfo read(e eVar) {
        SessionPlayer.TrackInfo trackInfo = new SessionPlayer.TrackInfo();
        trackInfo.f53063q = eVar.M(trackInfo.f53063q, 1);
        trackInfo.f53064r = eVar.M(trackInfo.f53064r, 3);
        trackInfo.f53067u = eVar.q(trackInfo.f53067u, 4);
        trackInfo.d();
        return trackInfo;
    }

    public static void write(SessionPlayer.TrackInfo trackInfo, e eVar) {
        eVar.j0(false, false);
        trackInfo.f(eVar.i());
        eVar.M0(trackInfo.f53063q, 1);
        eVar.M0(trackInfo.f53064r, 3);
        eVar.r0(trackInfo.f53067u, 4);
    }
}
