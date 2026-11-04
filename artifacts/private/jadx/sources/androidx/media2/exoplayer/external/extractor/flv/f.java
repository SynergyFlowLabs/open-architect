package androidx.media2.exoplayer.external.extractor.flv;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.t;
import androidx.media2.exoplayer.external.util.x;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class f extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54064h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54065i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54066j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f54067k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54068l = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f54069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f54070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54074g;

    public f(s output) {
        super(output);
        this.f54069b = new x(t.f57686b);
        this.f54070c = new x(4);
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    protected boolean b(x data) throws e.a {
        int iD = data.D();
        int i10 = (iD >> 4) & 15;
        int i11 = iD & 15;
        if (i11 == 7) {
            this.f54074g = i10;
            return i10 != 5;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Video format not supported: ");
        sb2.append(i11);
        throw new e.a(sb2.toString());
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    protected boolean c(x data, long timeUs) throws k0 {
        int iD = data.D();
        long jM = timeUs + (((long) data.m()) * 1000);
        if (iD == 0 && !this.f54072e) {
            x xVar = new x(new byte[data.a()]);
            data.i(xVar.f57720a, 0, data.a());
            androidx.media2.exoplayer.external.video.a aVarB = androidx.media2.exoplayer.external.video.a.b(xVar);
            this.f54071d = aVarB.f57751b;
            this.f54063a.c(Format.H(null, "video/avc", null, -1, -1, aVarB.f57752c, aVarB.f57753d, -1.0f, aVarB.f57750a, -1, aVarB.f57754e, null));
            this.f54072e = true;
            return false;
        }
        if (iD != 1 || !this.f54072e) {
            return false;
        }
        int i10 = this.f54074g == 1 ? 1 : 0;
        if (!this.f54073f && i10 == 0) {
            return false;
        }
        byte[] bArr = this.f54070c.f57720a;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        int i11 = 4 - this.f54071d;
        int i12 = 0;
        while (data.a() > 0) {
            data.i(this.f54070c.f57720a, i11, this.f54071d);
            this.f54070c.Q(0);
            int iH = this.f54070c.H();
            this.f54069b.Q(0);
            this.f54063a.d(this.f54069b, 4);
            this.f54063a.d(data, iH);
            i12 = i12 + 4 + iH;
        }
        this.f54063a.b(jM, i10, i12, 0, null);
        this.f54073f = true;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    public void d() {
        this.f54073f = false;
    }
}
