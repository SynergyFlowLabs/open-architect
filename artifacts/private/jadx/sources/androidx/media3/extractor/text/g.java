package androidx.media3.extractor.text;

import androidx.media3.common.util.b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g implements r.a {
    @Override // androidx.media3.extractor.text.r.a
    public int a(androidx.media3.common.w wVar) {
        String str = wVar.f61761o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // androidx.media3.extractor.text.r.a
    public boolean b(androidx.media3.common.w wVar) {
        String str = wVar.f61761o;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override // androidx.media3.extractor.text.r.a
    public r c(androidx.media3.common.w wVar) {
        String str = wVar.f61761o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new androidx.media3.extractor.text.dvb.a(wVar.f61764r);
                case "application/pgs":
                    return new androidx.media3.extractor.text.pgs.a();
                case "application/x-mp4-vtt":
                    return new androidx.media3.extractor.text.webvtt.a();
                case "text/vtt":
                    return new androidx.media3.extractor.text.webvtt.g();
                case "application/x-quicktime-tx3g":
                    return new androidx.media3.extractor.text.tx3g.a(wVar.f61764r);
                case "text/x-ssa":
                    return new androidx.media3.extractor.text.ssa.b(wVar.f61764r);
                case "application/vobsub":
                    return new androidx.media3.extractor.text.vobsub.a(wVar.f61764r);
                case "application/x-subrip":
                    return new androidx.media3.extractor.text.subrip.a();
                case "application/ttml+xml":
                    return new androidx.media3.extractor.text.ttml.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
