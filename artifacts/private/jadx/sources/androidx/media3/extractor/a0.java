package androidx.media3.extractor;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f67010m = "FlacStreamMetadata";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f67011n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f67018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f67019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f67020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f67021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    public final a f67022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.common.r0 f67023l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f67024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f67025b;

        public a(long[] jArr, long[] jArr2) {
            this.f67024a = jArr;
            this.f67025b = jArr2;
        }
    }

    public a0(byte[] bArr, int i10) {
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0(bArr);
        n0Var.q(i10 * 8);
        this.f67012a = n0Var.h(16);
        this.f67013b = n0Var.h(16);
        this.f67014c = n0Var.h(24);
        this.f67015d = n0Var.h(24);
        int iH = n0Var.h(20);
        this.f67016e = iH;
        this.f67017f = m(iH);
        this.f67018g = n0Var.h(3) + 1;
        int i11 = 5 & 5;
        int iH2 = n0Var.h(5) + 1;
        this.f67019h = iH2;
        this.f67020i = f(iH2);
        this.f67021j = n0Var.j(36);
        this.f67022k = null;
        this.f67023l = null;
    }

    @androidx.annotation.p0
    private static androidx.media3.common.r0 a(List<String> list, List<androidx.media3.extractor.metadata.flac.a> list2) {
        androidx.media3.common.r0 r0VarD = x0.d(list);
        if (r0VarD == null && list2.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.r0(list2).b(r0VarD);
    }

    private static int f(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int m(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case androidx.media3.extractor.a.f66991g /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case AudioConstants.AUDIO_SAMPLE_RATE /* 44100 */:
                return 9;
            case m0.f67467a /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case o.f68165f /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public a0 b(List<androidx.media3.extractor.metadata.flac.a> list) {
        return new a0(this.f67012a, this.f67013b, this.f67014c, this.f67015d, this.f67016e, this.f67018g, this.f67019h, this.f67021j, this.f67022k, k(new androidx.media3.common.r0(list)));
    }

    public a0 c(@androidx.annotation.p0 a aVar) {
        return new a0(this.f67012a, this.f67013b, this.f67014c, this.f67015d, this.f67016e, this.f67018g, this.f67019h, this.f67021j, aVar, this.f67023l);
    }

    public a0 d(List<String> list) {
        return new a0(this.f67012a, this.f67013b, this.f67014c, this.f67015d, this.f67016e, this.f67018g, this.f67019h, this.f67021j, this.f67022k, k(x0.d(list)));
    }

    public long e() {
        long j10;
        long j11;
        int i10 = this.f67015d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f67014c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f67012a;
            j10 = ((((i11 != this.f67013b || i11 <= 0) ? PlaybackStateCompat.H1 : i11) * ((long) this.f67018g)) * ((long) this.f67019h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int g() {
        return this.f67019h * this.f67016e * this.f67018g;
    }

    public long h() {
        long j10 = this.f67021j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f67016e);
    }

    public androidx.media3.common.w i(byte[] bArr, @androidx.annotation.p0 androidx.media3.common.r0 r0Var) {
        bArr[4] = -128;
        int i10 = this.f67015d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new androidx.media3.common.w.b().u0("audio/flac").k0(i10).R(this.f67018g).v0(this.f67016e).o0(k1.B0(this.f67019h)).g0(Collections.singletonList(bArr)).n0(k(r0Var)).N();
    }

    public int j() {
        return this.f67013b * this.f67018g * (this.f67019h / 8);
    }

    @androidx.annotation.p0
    public androidx.media3.common.r0 k(@androidx.annotation.p0 androidx.media3.common.r0 r0Var) {
        androidx.media3.common.r0 r0Var2 = this.f67023l;
        return r0Var2 == null ? r0Var : r0Var2.b(r0Var);
    }

    public long l(long j10) {
        return k1.x((j10 * ((long) this.f67016e)) / 1000000, 0L, this.f67021j - 1);
    }

    public a0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<androidx.media3.extractor.metadata.flac.a> arrayList2) {
        this(i10, i11, i12, i13, i14, i15, i16, j10, (a) null, a(arrayList, arrayList2));
    }

    private a0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @androidx.annotation.p0 a aVar, @androidx.annotation.p0 androidx.media3.common.r0 r0Var) {
        this.f67012a = i10;
        this.f67013b = i11;
        this.f67014c = i12;
        this.f67015d = i13;
        this.f67016e = i14;
        this.f67017f = m(i14);
        this.f67018g = i15;
        this.f67019h = i16;
        this.f67020i = f(i16);
        this.f67021j = j10;
        this.f67022k = aVar;
        this.f67023l = r0Var;
    }
}
