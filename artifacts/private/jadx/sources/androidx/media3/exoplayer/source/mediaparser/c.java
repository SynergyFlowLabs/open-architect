package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.exoplayer.analytics.j4;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f65217a = "android.media.mediaparser.inBandCryptoInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65218b = "android.media.mediaparser.includeSupplementalData";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65219c = "android.media.mediaparser.eagerlyExposeTrackType";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f65220d = "android.media.mediaparser.exposeDummySeekMap";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65221e = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65222f = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65223g = "android.media.mediaParser.exposeCaptionFormats";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65224h = "android.media.mediaparser.ignoreTimestampOffset";

    @w0(31)
    private static final class a {
        private a() {
        }

        public static void a(MediaParser mediaParser, j4 j4Var) {
            LogSessionId logSessionIdA = j4Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionIdA);
        }
    }

    private c() {
    }

    @w0(31)
    public static void a(MediaParser mediaParser, j4 j4Var) {
        a.a(mediaParser, j4Var);
    }

    public static MediaFormat b(w wVar) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", wVar.f61761o);
        int i10 = wVar.J;
        if (i10 != -1) {
            mediaFormat.setInteger("caption-service-number", i10);
        }
        return mediaFormat;
    }
}
