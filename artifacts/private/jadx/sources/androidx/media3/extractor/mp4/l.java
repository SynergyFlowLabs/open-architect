package androidx.media3.extractor.mp4;

import androidx.media3.common.s0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class l {
    private l() {
    }

    public static String a(androidx.media3.common.w wVar) {
        String str = wVar.f61761o;
        if (s0.v(str)) {
            return "video/mp4";
        }
        if (s0.q(str)) {
            return "audio/mp4";
        }
        if (!s0.s(str)) {
            return "application/mp4";
        }
        if (Objects.equals(str, "image/heic")) {
            return "image/heif";
        }
        return Objects.equals(str, s0.f61294a1) ? s0.f61294a1 : "application/mp4";
    }

    public static String b(List<y> list) {
        Iterator<y> it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().f68146a.f68116g.f61761o;
            if (s0.v(str2)) {
                return "video/mp4";
            }
            if (s0.q(str2)) {
                z10 = true;
            } else if (s0.s(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, s0.f61294a1)) {
                    str = s0.f61294a1;
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
