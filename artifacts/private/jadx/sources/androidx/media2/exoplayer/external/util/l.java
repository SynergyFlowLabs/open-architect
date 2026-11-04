package androidx.media2.exoplayer.external.util;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.flac.PictureFrame;
import androidx.media2.exoplayer.external.metadata.flac.VorbisComment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f57592j = "FlacStreamMetadata";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f57593k = "=";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f57599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f57601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    public final Metadata f57602i;

    public l(byte[] data, int offset) {
        w wVar = new w(data);
        wVar.n(offset * 8);
        this.f57594a = wVar.h(16);
        this.f57595b = wVar.h(16);
        this.f57596c = wVar.h(24);
        this.f57597d = wVar.h(24);
        this.f57598e = wVar.h(20);
        this.f57599f = wVar.h(3) + 1;
        this.f57600g = wVar.h(5) + 1;
        this.f57601h = ((((long) wVar.h(4)) & 15) << 32) | (((long) wVar.h(32)) & com.rabbitmq.client.k0.f265952a);
        this.f57602i = null;
    }

    @androidx.annotation.p0
    private static Metadata b(List<String> vorbisComments, List<PictureFrame> pictureFrames) {
        if (vorbisComments.isEmpty() && pictureFrames.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < vorbisComments.size(); i10++) {
            String str = vorbisComments.get(i10);
            String[] strArrP0 = q0.P0(str, f57593k);
            if (strArrP0.length != 2) {
                String strValueOf = String.valueOf(str);
                p.l(f57592j, strValueOf.length() != 0 ? "Failed to parse vorbis comment: ".concat(strValueOf) : new String("Failed to parse vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(strArrP0[0], strArrP0[1]));
            }
        }
        arrayList.addAll(pictureFrames);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public int a() {
        return this.f57600g * this.f57598e;
    }

    public long c() {
        return (this.f57601h * 1000000) / ((long) this.f57598e);
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f57597d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f57596c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f57594a;
            j10 = ((((i11 != this.f57595b || i11 <= 0) ? PlaybackStateCompat.H1 : i11) * ((long) this.f57599f)) * ((long) this.f57600g)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long e(long timeUs) {
        return q0.s((timeUs * ((long) this.f57598e)) / 1000000, 0L, this.f57601h - 1);
    }

    public int f() {
        return this.f57595b * this.f57599f * (this.f57600g / 8);
    }

    public l(int minBlockSize, int maxBlockSize, int minFrameSize, int maxFrameSize, int sampleRate, int channels, int bitsPerSample, long totalSamples, List<String> vorbisComments, List<PictureFrame> pictureFrames) {
        this.f57594a = minBlockSize;
        this.f57595b = maxBlockSize;
        this.f57596c = minFrameSize;
        this.f57597d = maxFrameSize;
        this.f57598e = sampleRate;
        this.f57599f = channels;
        this.f57600g = bitsPerSample;
        this.f57601h = totalSamples;
        this.f57602i = b(vorbisComments, pictureFrames);
    }
}
