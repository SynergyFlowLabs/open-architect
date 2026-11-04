package androidx.media2.common;

import androidx.annotation.b1;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class VideoSizeParcelizer {
    public static VideoSize read(e eVar) {
        VideoSize videoSize = new VideoSize();
        videoSize.f53081q = eVar.M(videoSize.f53081q, 1);
        videoSize.f53082r = eVar.M(videoSize.f53082r, 2);
        return videoSize;
    }

    public static void write(VideoSize videoSize, e eVar) {
        eVar.j0(false, false);
        eVar.M0(videoSize.f53081q, 1);
        eVar.M0(videoSize.f53082r, 2);
    }
}
