package androidx.media2.session;

import androidx.annotation.b1;
import androidx.media.AudioAttributesCompat;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class PlaybackInfoParcelizer {
    public static MediaController.PlaybackInfo read(androidx.versionedparcelable.e eVar) {
        MediaController.PlaybackInfo playbackInfo = new MediaController.PlaybackInfo();
        playbackInfo.f58514q = eVar.M(playbackInfo.f58514q, 1);
        playbackInfo.f58515r = eVar.M(playbackInfo.f58515r, 2);
        playbackInfo.f58516s = eVar.M(playbackInfo.f58516s, 3);
        playbackInfo.f58517t = eVar.M(playbackInfo.f58517t, 4);
        playbackInfo.f58518u = (AudioAttributesCompat) eVar.h0(playbackInfo.f58518u, 5);
        return playbackInfo;
    }

    public static void write(MediaController.PlaybackInfo playbackInfo, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.M0(playbackInfo.f58514q, 1);
        eVar.M0(playbackInfo.f58515r, 2);
        eVar.M0(playbackInfo.f58516s, 3);
        eVar.M0(playbackInfo.f58517t, 4);
        eVar.m1(playbackInfo.f58518u, 5);
    }
}
