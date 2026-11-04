package androidx.media3.exoplayer.source;

import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.analytics.j4;
import com.google.common.collect.n6;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@androidx.annotation.w0(30)
public final class r0 implements g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final g1.a f65425e = new g1.a() { // from class: androidx.media3.exoplayer.source.q0
        @Override // androidx.media3.exoplayer.source.g1.a
        public final g1 a(j4 j4Var) {
            return r0.f(j4Var);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.mediaparser.l f65426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.mediaparser.a f65427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaParser f65428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f65429d;

    public static final class b implements g1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map<String, Object> f65430a = new HashMap();

        @Override // androidx.media3.exoplayer.source.g1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r0 a(j4 j4Var) {
            return new r0(j4Var, f65430a);
        }

        public void c(boolean z10) {
            if (!z10) {
                Map<String, Object> map = f65430a;
                map.remove("android.media.mediaparser.adts.enableCbrSeeking");
                map.remove("android.media.mediaparser.amr.enableCbrSeeking");
                map.remove("android.media.mediaparser.mp3.enableCbrSeeking");
                return;
            }
            Map<String, Object> map2 = f65430a;
            Boolean bool = Boolean.TRUE;
            map2.put("android.media.mediaparser.adts.enableCbrSeeking", bool);
            map2.put("android.media.mediaparser.amr.enableCbrSeeking", bool);
            map2.put("android.media.mediaparser.mp3.enableCbrSeeking", bool);
        }
    }

    public static /* synthetic */ g1 f(j4 j4Var) {
        return new r0(j4Var, n6.q());
    }

    @Override // androidx.media3.exoplayer.source.g1
    public void a(long j10, long j11) {
        this.f65427b.b(j10);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> pairI = this.f65426a.i(j11);
        this.f65428c.seek(k0.a(k0.a(pairI.second).position == j10 ? pairI.second : pairI.first));
    }

    @Override // androidx.media3.exoplayer.source.g1
    public void b(androidx.media3.common.l lVar, Uri uri, Map<String, List<String>> map, long j10, long j11, androidx.media3.extractor.t tVar) throws IOException {
        this.f65426a.m(tVar);
        this.f65427b.c(lVar, j11);
        this.f65427b.b(j10);
        String parserName = this.f65428c.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.f65428c.advance(this.f65427b);
            String parserName2 = this.f65428c.getParserName();
            this.f65429d = parserName2;
            this.f65426a.p(parserName2);
            return;
        }
        if (parserName.equals(this.f65429d)) {
            return;
        }
        String parserName3 = this.f65428c.getParserName();
        this.f65429d = parserName3;
        this.f65426a.p(parserName3);
    }

    @Override // androidx.media3.exoplayer.source.g1
    public long c() {
        return this.f65427b.getPosition();
    }

    @Override // androidx.media3.exoplayer.source.g1
    public void d() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f65429d)) {
            this.f65426a.a();
        }
    }

    @Override // androidx.media3.exoplayer.source.g1
    public int e(androidx.media3.extractor.n0 n0Var) throws IOException {
        boolean zAdvance = this.f65428c.advance(this.f65427b);
        long jA = this.f65427b.a();
        n0Var.f68159a = jA;
        if (zAdvance) {
            return jA != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.source.g1
    public void release() {
        this.f65428c.release();
    }

    @Deprecated
    public r0(j4 j4Var) {
        this(j4Var, n6.q());
    }

    @e.a({"WrongConstant"})
    private r0(j4 j4Var, Map<String, Object> map) {
        androidx.media3.exoplayer.source.mediaparser.l lVar = new androidx.media3.exoplayer.source.mediaparser.l();
        this.f65426a = lVar;
        this.f65427b = new androidx.media3.exoplayer.source.mediaparser.a();
        MediaParser mediaParserCreate = MediaParser.create(lVar, new String[0]);
        this.f65428c = mediaParserCreate;
        Boolean bool = Boolean.TRUE;
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65219c, bool);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65217a, bool);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.c.f65218b, bool);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.f65428c.setParameter(entry.getKey(), entry.getValue());
        }
        this.f65429d = "android.media.mediaparser.UNKNOWN";
        if (androidx.media3.common.util.k1.f61540a >= 31) {
            androidx.media3.exoplayer.source.mediaparser.c.a(this.f65428c, j4Var);
        }
    }
}
