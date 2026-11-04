package androidx.media3.extractor.flv;

import androidx.media3.common.s0;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.common.w;
import androidx.media3.extractor.u0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67268e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67269f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67270g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67271h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f67272i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67273j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f67274k = {5512, 11025, 22050, AudioConstants.AUDIO_SAMPLE_RATE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f67275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f67276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67277d;

    public a(u0 u0Var) {
        super(u0Var);
    }

    @Override // androidx.media3.extractor.flv.e
    protected boolean b(o0 o0Var) throws e.a {
        if (this.f67275b) {
            o0Var.b0(1);
        } else {
            int iL = o0Var.L();
            int i10 = (iL >> 4) & 15;
            this.f67277d = i10;
            if (i10 == 2) {
                this.f67317a.e(new w.b().U(s0.f61343w).u0("audio/mpeg").R(1).v0(f67274k[(iL >> 2) & 3]).N());
                this.f67276c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f67317a.e(new w.b().U(s0.f61343w).u0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").R(1).v0(8000).N());
                this.f67276c = true;
            } else if (i10 != 10) {
                throw new e.a("Audio format not supported: " + this.f67277d);
            }
            this.f67275b = true;
        }
        return true;
    }

    @Override // androidx.media3.extractor.flv.e
    protected boolean c(o0 o0Var, long j10) throws v0 {
        if (this.f67277d == 2) {
            int iA = o0Var.a();
            this.f67317a.b(o0Var, iA);
            this.f67317a.g(j10, 1, iA, 0, null);
            return true;
        }
        int iL = o0Var.L();
        if (iL != 0 || this.f67276c) {
            if (this.f67277d == 10 && iL != 1) {
                return false;
            }
            int iA2 = o0Var.a();
            this.f67317a.b(o0Var, iA2);
            this.f67317a.g(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = o0Var.a();
        byte[] bArr = new byte[iA3];
        o0Var.n(bArr, 0, iA3);
        androidx.media3.extractor.a.c cVarF = androidx.media3.extractor.a.f(bArr);
        this.f67317a.e(new w.b().U(s0.f61343w).u0("audio/mp4a-latm").S(cVarF.f67009c).R(cVarF.f67008b).v0(cVarF.f67007a).g0(Collections.singletonList(bArr)).N());
        this.f67276c = true;
        return false;
    }

    @Override // androidx.media3.extractor.flv.e
    public void d() {
    }
}
