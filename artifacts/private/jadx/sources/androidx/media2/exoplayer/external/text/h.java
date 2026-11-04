package androidx.media2.exoplayer.external.text;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f56772a = new a();

    class a implements h {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.text.h
        public f a(Format format) {
            String str = format.f53103i;
            str.getClass();
            switch (str) {
                case "application/dvbsubs":
                    return new androidx.media2.exoplayer.external.text.dvb.a(format.f53107k);
                case "application/pgs":
                    return new androidx.media2.exoplayer.external.text.pgs.a();
                case "application/x-mp4-vtt":
                    return new androidx.media2.exoplayer.external.text.webvtt.b();
                case "text/vtt":
                    return new androidx.media2.exoplayer.external.text.webvtt.g();
                case "application/x-quicktime-tx3g":
                    return new androidx.media2.exoplayer.external.text.tx3g.a(format.f53107k);
                case "text/x-ssa":
                    return new androidx.media2.exoplayer.external.text.ssa.a(format.f53107k);
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new androidx.media2.exoplayer.external.text.cea.a(format.f53103i, format.f53102h3);
                case "application/cea-708":
                    return new androidx.media2.exoplayer.external.text.cea.c(format.f53102h3, format.f53107k);
                case "application/x-subrip":
                    return new androidx.media2.exoplayer.external.text.subrip.a();
                case "application/ttml+xml":
                    return new androidx.media2.exoplayer.external.text.ttml.a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }

        @Override // androidx.media2.exoplayer.external.text.h
        public boolean b(Format format) {
            String str = format.f53103i;
            if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str)) {
                return false;
            }
            return true;
        }
    }

    f a(Format format);

    boolean b(Format format);
}
