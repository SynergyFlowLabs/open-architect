package androidx.media3.exoplayer.metadata;

import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.extractor.metadata.id3.h;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f64222a = new C0583a();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.metadata.a$a, reason: collision with other inner class name */
    class C0583a implements a {
        C0583a() {
        }

        @Override // androidx.media3.exoplayer.metadata.a
        public androidx.media3.extractor.metadata.a a(w wVar) {
            String str = wVar.f61761o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new androidx.media3.extractor.metadata.dvbsi.b();
                    case "application/x-icy":
                        return new androidx.media3.extractor.metadata.icy.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new androidx.media3.extractor.metadata.emsg.b();
                    case "application/x-scte35":
                        return new androidx.media3.extractor.metadata.scte35.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // androidx.media3.exoplayer.metadata.a
        public boolean b(w wVar) {
            String str = wVar.f61761o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || s0.R0.equals(str);
        }
    }

    androidx.media3.extractor.metadata.a a(w wVar);

    boolean b(w wVar);
}
