package androidx.media2.exoplayer.external.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.offline.StreamKey;
import com.facebook.appevents.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f56108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f56109o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f56110p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f56111q = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f56112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f56113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f56114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f56115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f56116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f56117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public final Format f56118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<Format> f56119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f56120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DrmInitData> f56121m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final Uri f56122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Format f56123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f56125d;

        public a(@p0 Uri url, Format format, String groupId, String name) {
            this.f56122a = url;
            this.f56123b = format;
            this.f56124c = groupId;
            this.f56125d = name;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f56126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Format f56127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final String f56128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f56129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final String f56130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        public final String f56131f;

        public b(Uri url, Format format, @p0 String videoGroupId, @p0 String audioGroupId, @p0 String subtitleGroupId, @p0 String captionGroupId) {
            this.f56126a = url;
            this.f56127b = format;
            this.f56128c = videoGroupId;
            this.f56129d = audioGroupId;
            this.f56130e = subtitleGroupId;
            this.f56131f = captionGroupId;
        }

        public static b b(Uri url) {
            return new b(url, Format.u(p.f99189d0, null, "application/x-mpegURL", null, null, -1, 0, 0, null), null, null, null, null);
        }

        public b a(Format format) {
            return new b(this.f56126a, format, this.f56128c, this.f56129d, this.f56130e, this.f56131f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f56108n = new e("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public e(String baseUri, List<String> tags, List<b> variants, List<a> videos, List<a> audios, List<a> subtitles, List<a> closedCaptions, @p0 Format muxedAudioFormat, List<Format> muxedCaptionFormats, boolean hasIndependentSegments, Map<String, String> variableDefinitions, List<DrmInitData> sessionKeyDrmInitData) {
        super(baseUri, tags, hasIndependentSegments);
        this.f56112d = Collections.unmodifiableList(f(variants, videos, audios, subtitles, closedCaptions));
        this.f56113e = Collections.unmodifiableList(variants);
        this.f56114f = Collections.unmodifiableList(videos);
        this.f56115g = Collections.unmodifiableList(audios);
        this.f56116h = Collections.unmodifiableList(subtitles);
        this.f56117i = Collections.unmodifiableList(closedCaptions);
        this.f56118j = muxedAudioFormat;
        this.f56119k = muxedCaptionFormats != null ? Collections.unmodifiableList(muxedCaptionFormats) : null;
        this.f56120l = Collections.unmodifiableMap(variableDefinitions);
        this.f56121m = Collections.unmodifiableList(sessionKeyDrmInitData);
    }

    private static void b(List<a> renditions, List<Uri> out) {
        for (int i10 = 0; i10 < renditions.size(); i10++) {
            Uri uri = renditions.get(i10).f56122a;
            if (uri != null && !out.contains(uri)) {
                out.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> streams, int groupIndex, List<StreamKey> streamKeys) {
        ArrayList arrayList = new ArrayList(streamKeys.size());
        for (int i10 = 0; i10 < streams.size(); i10++) {
            T t10 = streams.get(i10);
            for (int i11 = 0; i11 < streamKeys.size(); i11++) {
                StreamKey streamKey = streamKeys.get(i11);
                if (streamKey.f55608b == groupIndex && streamKey.f55609c == i10) {
                    arrayList.add(t10);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static e e(String variantUrl) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(variantUrl)));
        List list = Collections.EMPTY_LIST;
        return new e(null, list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List<Uri> f(List<b> variants, List<a> videos, List<a> audios, List<a> subtitles, List<a> closedCaptions) {
        ArrayList arrayList = new ArrayList();
        int i10 = 7 & 0;
        for (int i11 = 0; i11 < variants.size(); i11++) {
            Uri uri = variants.get(i11).f56126a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(videos, arrayList);
        b(audios, arrayList);
        b(subtitles, arrayList);
        b(closedCaptions, arrayList);
        return arrayList;
    }

    @Override // androidx.media2.exoplayer.external.offline.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e a(List<StreamKey> streamKeys) {
        String str = this.f56160a;
        List<String> list = this.f56161b;
        List listD = d(this.f56113e, 0, streamKeys);
        List list2 = Collections.EMPTY_LIST;
        return new e(str, list, listD, list2, d(this.f56115g, 1, streamKeys), d(this.f56116h, 2, streamKeys), list2, this.f56118j, this.f56119k, this.f56162c, this.f56120l, this.f56121m);
    }
}
