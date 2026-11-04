package androidx.media2.exoplayer.external.extractor.flv;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f54018e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f54019f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f54020g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54021h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54022i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54023j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f54024k = {5512, 11025, 22050, AudioConstants.AUDIO_SAMPLE_RATE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54027d;

    public a(s output) {
        super(output);
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    protected boolean b(x data) throws e.a {
        if (this.f54025b) {
            data.R(1);
        } else {
            int iD = data.D();
            int i10 = (iD >> 4) & 15;
            this.f54027d = i10;
            if (i10 == 2) {
                this.f54063a.c(Format.s(null, "audio/mpeg", null, -1, -1, 1, f54024k[(iD >> 2) & 3], null, null, 0, null));
                this.f54026c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f54063a.c(Format.r(null, i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, (iD & 1) == 1 ? 2 : 3, null, null, 0, null));
                this.f54026c = true;
            } else if (i10 != 10) {
                int i11 = this.f54027d;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Audio format not supported: ");
                sb2.append(i11);
                throw new e.a(sb2.toString());
            }
            this.f54025b = true;
        }
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    protected boolean c(x data, long timeUs) throws k0 {
        if (this.f54027d == 2) {
            int iA = data.a();
            this.f54063a.d(data, iA);
            this.f54063a.b(timeUs, 1, iA, 0, null);
            return true;
        }
        int iD = data.D();
        if (iD != 0 || this.f54026c) {
            if (this.f54027d == 10 && iD != 1) {
                return false;
            }
            int iA2 = data.a();
            this.f54063a.d(data, iA2);
            this.f54063a.b(timeUs, 1, iA2, 0, null);
            return true;
        }
        int iA3 = data.a();
        byte[] bArr = new byte[iA3];
        data.i(bArr, 0, iA3);
        Pair<Integer, Integer> pairJ = androidx.media2.exoplayer.external.util.d.j(bArr);
        this.f54063a.c(Format.s(null, "audio/mp4a-latm", null, -1, -1, ((Integer) pairJ.second).intValue(), ((Integer) pairJ.first).intValue(), Collections.singletonList(bArr), null, 0, null));
        this.f54026c = true;
        return false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    public void d() {
    }
}
