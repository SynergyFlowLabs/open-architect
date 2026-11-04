package androidx.media2.exoplayer.external.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.extractor.ts.g0;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.s;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f55945d = ".aac";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f55946e = ".ac3";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f55947f = ".ec3";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f55948g = ".ac4";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f55949h = ".mp3";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f55950i = ".mp4";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f55951j = ".m4";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f55952k = ".mp4";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f55953l = ".cmf";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f55954m = ".vtt";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f55955n = ".webvtt";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f55957c;

    public c() {
        this(0, true);
    }

    private static f.a b(androidx.media2.exoplayer.external.extractor.i extractor) {
        return new f.a(extractor, (extractor instanceof androidx.media2.exoplayer.external.extractor.ts.h) || (extractor instanceof androidx.media2.exoplayer.external.extractor.ts.b) || (extractor instanceof androidx.media2.exoplayer.external.extractor.ts.e) || (extractor instanceof androidx.media2.exoplayer.external.extractor.mp3.e), g(extractor));
    }

    private static f.a c(androidx.media2.exoplayer.external.extractor.i previousExtractor, Format format, k0 timestampAdjuster) {
        if (previousExtractor instanceof q) {
            return b(new q(format.f53100g3, timestampAdjuster));
        }
        if (previousExtractor instanceof androidx.media2.exoplayer.external.extractor.ts.h) {
            return b(new androidx.media2.exoplayer.external.extractor.ts.h());
        }
        if (previousExtractor instanceof androidx.media2.exoplayer.external.extractor.ts.b) {
            return b(new androidx.media2.exoplayer.external.extractor.ts.b());
        }
        if (previousExtractor instanceof androidx.media2.exoplayer.external.extractor.ts.e) {
            return b(new androidx.media2.exoplayer.external.extractor.ts.e());
        }
        if (previousExtractor instanceof androidx.media2.exoplayer.external.extractor.mp3.e) {
            return b(new androidx.media2.exoplayer.external.extractor.mp3.e());
        }
        return null;
    }

    private androidx.media2.exoplayer.external.extractor.i d(Uri uri, Format format, List<Format> muxedCaptionFormats, DrmInitData drmInitData, k0 timestampAdjuster) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if ("text/vtt".equals(format.f53103i) || lastPathSegment.endsWith(f55955n) || lastPathSegment.endsWith(f55954m)) {
            return new q(format.f53100g3, timestampAdjuster);
        }
        if (lastPathSegment.endsWith(f55945d)) {
            return new androidx.media2.exoplayer.external.extractor.ts.h();
        }
        if (lastPathSegment.endsWith(f55946e) || lastPathSegment.endsWith(f55947f)) {
            return new androidx.media2.exoplayer.external.extractor.ts.b();
        }
        if (lastPathSegment.endsWith(f55948g)) {
            return new androidx.media2.exoplayer.external.extractor.ts.e();
        }
        if (lastPathSegment.endsWith(f55949h)) {
            return new androidx.media2.exoplayer.external.extractor.mp3.e(0, 0L);
        }
        return (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(f55951j, lastPathSegment.length() + (-4)) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() + (-5)) || lastPathSegment.startsWith(f55953l, lastPathSegment.length() + (-5))) ? e(timestampAdjuster, drmInitData, muxedCaptionFormats) : f(this.f55956b, this.f55957c, format, muxedCaptionFormats, timestampAdjuster);
    }

    private static androidx.media2.exoplayer.external.extractor.mp4.f e(k0 timestampAdjuster, DrmInitData drmInitData, @p0 List<Format> muxedCaptionFormats) {
        if (muxedCaptionFormats == null) {
            muxedCaptionFormats = Collections.EMPTY_LIST;
        }
        return new androidx.media2.exoplayer.external.extractor.mp4.f(0, timestampAdjuster, null, drmInitData, muxedCaptionFormats);
    }

    private static g0 f(int userProvidedPayloadReaderFactoryFlags, boolean exposeCea608WhenMissingDeclarations, Format format, List<Format> muxedCaptionFormats, k0 timestampAdjuster) {
        int i10 = userProvidedPayloadReaderFactoryFlags | 16;
        if (muxedCaptionFormats != null) {
            i10 = userProvidedPayloadReaderFactoryFlags | 48;
        } else {
            muxedCaptionFormats = exposeCea608WhenMissingDeclarations ? Collections.singletonList(Format.A(null, "application/cea-608", 0, null)) : Collections.EMPTY_LIST;
        }
        String str = format.f53098f;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(s.a(str))) {
                i10 |= 2;
            }
            if (!"video/avc".equals(s.j(str))) {
                i10 |= 4;
            }
        }
        return new g0(2, timestampAdjuster, new androidx.media2.exoplayer.external.extractor.ts.j(i10, muxedCaptionFormats));
    }

    private static boolean g(androidx.media2.exoplayer.external.extractor.i previousExtractor) {
        return (previousExtractor instanceof g0) || (previousExtractor instanceof androidx.media2.exoplayer.external.extractor.mp4.f);
    }

    private static boolean h(androidx.media2.exoplayer.external.extractor.i extractor, androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        try {
            return extractor.b(input);
        } catch (EOFException unused) {
            return false;
        } finally {
            input.l();
        }
    }

    @Override // androidx.media2.exoplayer.external.source.hls.f
    public f.a a(@p0 androidx.media2.exoplayer.external.extractor.i previousExtractor, Uri uri, Format format, @p0 List<Format> muxedCaptionFormats, @p0 DrmInitData drmInitData, k0 timestampAdjuster, Map<String, List<String>> responseHeaders, androidx.media2.exoplayer.external.extractor.j extractorInput) throws InterruptedException, IOException {
        if (previousExtractor != null) {
            if (g(previousExtractor)) {
                return b(previousExtractor);
            }
            if (c(previousExtractor, format, timestampAdjuster) == null) {
                String simpleName = previousExtractor.getClass().getSimpleName();
                throw new IllegalArgumentException(simpleName.length() != 0 ? "Unexpected previousExtractor type: ".concat(simpleName) : new String("Unexpected previousExtractor type: "));
            }
        }
        androidx.media2.exoplayer.external.extractor.i iVarD = d(uri, format, muxedCaptionFormats, drmInitData, timestampAdjuster);
        extractorInput.l();
        if (h(iVarD, extractorInput)) {
            return b(iVarD);
        }
        if (!(iVarD instanceof q)) {
            q qVar = new q(format.f53100g3, timestampAdjuster);
            if (h(qVar, extractorInput)) {
                return b(qVar);
            }
        }
        if (!(iVarD instanceof androidx.media2.exoplayer.external.extractor.ts.h)) {
            androidx.media2.exoplayer.external.extractor.ts.h hVar = new androidx.media2.exoplayer.external.extractor.ts.h();
            if (h(hVar, extractorInput)) {
                return b(hVar);
            }
        }
        if (!(iVarD instanceof androidx.media2.exoplayer.external.extractor.ts.b)) {
            androidx.media2.exoplayer.external.extractor.ts.b bVar = new androidx.media2.exoplayer.external.extractor.ts.b();
            if (h(bVar, extractorInput)) {
                return b(bVar);
            }
        }
        if (!(iVarD instanceof androidx.media2.exoplayer.external.extractor.ts.e)) {
            androidx.media2.exoplayer.external.extractor.ts.e eVar = new androidx.media2.exoplayer.external.extractor.ts.e();
            if (h(eVar, extractorInput)) {
                return b(eVar);
            }
        }
        if (!(iVarD instanceof androidx.media2.exoplayer.external.extractor.mp3.e)) {
            androidx.media2.exoplayer.external.extractor.mp3.e eVar2 = new androidx.media2.exoplayer.external.extractor.mp3.e(0, 0L);
            if (h(eVar2, extractorInput)) {
                return b(eVar2);
            }
        }
        if (!(iVarD instanceof androidx.media2.exoplayer.external.extractor.mp4.f)) {
            androidx.media2.exoplayer.external.extractor.mp4.f fVarE = e(timestampAdjuster, drmInitData, muxedCaptionFormats);
            if (h(fVarE, extractorInput)) {
                return b(fVarE);
            }
        }
        if (!(iVarD instanceof g0)) {
            g0 g0VarF = f(this.f55956b, this.f55957c, format, muxedCaptionFormats, timestampAdjuster);
            if (h(g0VarF, extractorInput)) {
                return b(g0VarF);
            }
        }
        return b(iVarD);
    }

    public c(int payloadReaderFactoryFlags, boolean exposeCea608WhenMissingDeclarations) {
        this.f55956b = payloadReaderFactoryFlags;
        this.f55957c = exposeCea608WhenMissingDeclarations;
    }
}
