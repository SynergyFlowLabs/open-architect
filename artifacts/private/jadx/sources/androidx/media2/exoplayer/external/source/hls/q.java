package androidx.media2.exoplayer.external.source.hls;

import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class q implements androidx.media2.exoplayer.external.extractor.i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f56216j = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f56217k = Pattern.compile("MPEGTS:(\\d+)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f56218l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f56219m = 9;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final String f56220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0 f56221e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.k f56223g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f56225i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f56222f = new x();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f56224h = new byte[1024];

    public q(@p0 String language, k0 timestampAdjuster) {
        this.f56220d = language;
        this.f56221e = timestampAdjuster;
    }

    private s d(long subsampleOffsetUs) {
        s sVarA = this.f56223g.a(0, 3);
        boolean z10 = false;
        sVarA.c(Format.E(null, "text/vtt", null, -1, 0, this.f56220d, null, subsampleOffsetUs));
        this.f56223g.l();
        return sVarA;
    }

    private void e() throws androidx.media2.exoplayer.external.k0 {
        x xVar = new x(this.f56224h);
        androidx.media2.exoplayer.external.text.webvtt.h.e(xVar);
        long jF = 0;
        long jD = 0;
        while (true) {
            String strN = xVar.n();
            if (TextUtils.isEmpty(strN)) {
                Matcher matcherA = androidx.media2.exoplayer.external.text.webvtt.h.a(xVar);
                if (matcherA == null) {
                    d(0L);
                    return;
                }
                long jD2 = androidx.media2.exoplayer.external.text.webvtt.h.d(matcherA.group(1));
                long jB = this.f56221e.b(k0.i((jF + jD2) - jD));
                s sVarD = d(jB - jD2);
                this.f56222f.O(this.f56224h, this.f56225i);
                sVarD.d(this.f56222f, this.f56225i);
                sVarD.b(jB, 1, this.f56225i, 0, null);
                return;
            }
            if (strN.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f56216j.matcher(strN);
                if (!matcher.find()) {
                    throw new androidx.media2.exoplayer.external.k0(strN.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher2 = f56217k.matcher(strN);
                if (!matcher2.find()) {
                    throw new androidx.media2.exoplayer.external.k0(strN.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                jD = androidx.media2.exoplayer.external.text.webvtt.h.d(matcher.group(1));
                jF = k0.f(Long.parseLong(matcher2.group(1)));
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        throw new IllegalStateException();
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        input.k(this.f56224h, 0, 6, false);
        this.f56222f.O(this.f56224h, 6);
        if (androidx.media2.exoplayer.external.text.webvtt.h.b(this.f56222f)) {
            return true;
        }
        input.k(this.f56224h, 6, 3, false);
        this.f56222f.O(this.f56224h, 9);
        return androidx.media2.exoplayer.external.text.webvtt.h.b(this.f56222f);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(androidx.media2.exoplayer.external.extractor.k output) {
        this.f56223g = output;
        output.q(new androidx.media2.exoplayer.external.extractor.q.b(-9223372036854775807L));
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPosition) throws InterruptedException, IOException {
        int length = (int) input.getLength();
        int i10 = this.f56225i;
        byte[] bArr = this.f56224h;
        if (i10 == bArr.length) {
            this.f56224h = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f56224h;
        int i11 = this.f56225i;
        int i12 = input.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f56225i + i12;
            this.f56225i = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }
}
