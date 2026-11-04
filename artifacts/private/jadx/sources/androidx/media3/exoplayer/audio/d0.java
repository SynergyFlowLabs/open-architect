package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d0 implements j0.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63178c = "offloadVariableRateSupported";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final Context f63179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f63180b;

    @androidx.annotation.w0(29)
    private static final class a {
        private a() {
        }

        public static j a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? j.f63218d : new j.b().e(true).g(z10).d();
        }
    }

    @androidx.annotation.w0(31)
    private static final class b {
        private b() {
        }

        public static j a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return j.f63218d;
            }
            return new j.b().e(true).f(k1.f61540a > 32 && playbackOffloadSupport == 2).g(z10).d();
        }
    }

    public d0() {
        this(null);
    }

    private boolean b(@androidx.annotation.p0 Context context) {
        Boolean bool = this.f63180b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = androidx.media3.common.audio.d.c(context).getParameters(f63178c);
            this.f63180b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f63180b = Boolean.FALSE;
        }
        return this.f63180b.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.j0.d
    public j a(androidx.media3.common.w wVar, androidx.media3.common.d dVar) {
        androidx.media3.common.util.a.g(wVar);
        androidx.media3.common.util.a.g(dVar);
        int i10 = k1.f61540a;
        if (i10 < 29 || wVar.F == -1) {
            return j.f63218d;
        }
        boolean zB = b(this.f63179a);
        int iF = androidx.media3.common.s0.f((String) androidx.media3.common.util.a.g(wVar.f61761o), wVar.f61757k);
        if (iF != 0 && i10 >= k1.X(iF)) {
            int iA0 = k1.a0(wVar.E);
            if (iA0 == 0) {
                return j.f63218d;
            }
            try {
                AudioFormat audioFormatZ = k1.Z(wVar.F, iA0, iF);
                return i10 >= 31 ? b.a(audioFormatZ, dVar.b().f60484a, zB) : a.a(audioFormatZ, dVar.b().f60484a, zB);
            } catch (IllegalArgumentException unused) {
                return j.f63218d;
            }
        }
        return j.f63218d;
    }

    public d0(@androidx.annotation.p0 Context context) {
        this.f63179a = context;
    }
}
