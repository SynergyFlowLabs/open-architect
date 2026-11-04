package androidx.media2.common;

import androidx.annotation.b1;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class SubtitleDataParcelizer {
    public static SubtitleData read(e eVar) {
        SubtitleData subtitleData = new SubtitleData();
        subtitleData.f53073q = eVar.R(subtitleData.f53073q, 1);
        subtitleData.f53074r = eVar.R(subtitleData.f53074r, 2);
        subtitleData.f53075s = eVar.t(subtitleData.f53075s, 3);
        return subtitleData;
    }

    public static void write(SubtitleData subtitleData, e eVar) {
        eVar.j0(false, false);
        int i10 = 4 ^ 1;
        eVar.R0(subtitleData.f53073q, 1);
        eVar.R0(subtitleData.f53074r, 2);
        eVar.u0(subtitleData.f53075s, 3);
    }
}
