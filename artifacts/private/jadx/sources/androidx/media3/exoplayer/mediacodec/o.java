package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import com.google.common.util.concurrent.a2;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@b1
@w0(35)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<MediaCodec> f64122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f64123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private LoudnessCodecController f64124c;

    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return o.this.f64123b.b(bundle);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64126a = new b() { // from class: androidx.media3.exoplayer.mediacodec.p
            @Override // androidx.media3.exoplayer.mediacodec.o.b
            public final Bundle b(Bundle bundle) {
                return o.b.a(bundle);
            }
        };

        static /* synthetic */ Bundle a(Bundle bundle) {
            return bundle;
        }

        Bundle b(Bundle bundle);
    }

    public o() {
        this(b.f64126a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f64124c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            androidx.media3.common.util.a.i(this.f64122a.add(mediaCodec));
        }
    }

    public void c() {
        this.f64122a.clear();
        LoudnessCodecController loudnessCodecController = this.f64124c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f64122a.remove(mediaCodec) && (loudnessCodecController = this.f64124c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f64124c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f64124c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, a2.c(), new a());
        this.f64124c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.f64122a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public o(b bVar) {
        this.f64122a = new HashSet<>();
        this.f64123b = bVar;
    }
}
