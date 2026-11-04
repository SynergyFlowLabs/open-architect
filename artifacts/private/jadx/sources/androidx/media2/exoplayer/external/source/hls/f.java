package androidx.media2.exoplayer.external.source.hls;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.util.k0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f55984a = new c();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media2.exoplayer.external.extractor.i f55985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f55986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f55987c;

        public a(androidx.media2.exoplayer.external.extractor.i extractor, boolean isPackedAudioExtractor, boolean isReusable) {
            this.f55985a = extractor;
            this.f55986b = isPackedAudioExtractor;
            this.f55987c = isReusable;
        }
    }

    a a(@p0 androidx.media2.exoplayer.external.extractor.i previousExtractor, Uri uri, Format format, @p0 List<Format> muxedCaptionFormats, @p0 DrmInitData drmInitData, k0 timestampAdjuster, Map<String, List<String>> responseHeaders, androidx.media2.exoplayer.external.extractor.j sniffingExtractorInput) throws InterruptedException, IOException;
}
