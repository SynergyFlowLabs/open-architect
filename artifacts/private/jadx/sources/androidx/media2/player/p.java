package androidx.media2.player;

import android.media.PlaybackParams;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.annotation.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58412e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f58413f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f58414g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f58415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Float f58416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f58417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PlaybackParams f58418d;

    @w0(23)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static PlaybackParams a() {
            return new PlaybackParams();
        }

        @androidx.annotation.u
        static int b(PlaybackParams playbackParams) {
            return playbackParams.getAudioFallbackMode();
        }

        @androidx.annotation.u
        static float c(PlaybackParams playbackParams) {
            return playbackParams.getPitch();
        }

        @androidx.annotation.u
        static float d(PlaybackParams playbackParams) {
            return playbackParams.getSpeed();
        }

        @androidx.annotation.u
        static PlaybackParams e(PlaybackParams playbackParams, int i10) {
            return playbackParams.setAudioFallbackMode(i10);
        }

        @androidx.annotation.u
        static PlaybackParams f(PlaybackParams playbackParams, float f10) {
            return playbackParams.setPitch(f10);
        }

        @androidx.annotation.u
        static PlaybackParams g(PlaybackParams playbackParams, float f10) {
            return playbackParams.setSpeed(f10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    p(Integer num, Float f10, Float f11) {
        this.f58415a = num;
        this.f58416b = f10;
        this.f58417c = f11;
    }

    @p0
    public Integer a() {
        try {
            return Integer.valueOf(a.b(this.f58418d));
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @p0
    public Float b() {
        try {
            return Float.valueOf(a.c(this.f58418d));
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @w0(23)
    @b1({b1.a.LIBRARY})
    public PlaybackParams c() {
        return this.f58418d;
    }

    @p0
    public Float d() {
        try {
            return Float.valueOf(a.d(this.f58418d));
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f58419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Float f58420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Float f58421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private PlaybackParams f58422d;

        public c() {
            this.f58422d = a.a();
        }

        @NonNull
        public p a() {
            return new p(this.f58422d);
        }

        @NonNull
        public c b(int i10) {
            a.e(this.f58422d, i10);
            return this;
        }

        @NonNull
        public c c(@x(from = 0.0d, fromInclusive = false, to = 3.4028234663852886E38d) float f10) {
            if (f10 == 0.0f) {
                throw new IllegalArgumentException("0 pitch is not allowed");
            }
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("pitch must not be negative");
            }
            a.f(this.f58422d, f10);
            return this;
        }

        @NonNull
        public c d(@x(from = 0.0d, fromInclusive = false, to = 3.4028234663852886E38d) float f10) {
            if (f10 == 0.0f) {
                throw new IllegalArgumentException("0 speed is not allowed");
            }
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("negative speed is not supported");
            }
            a.g(this.f58422d, f10);
            return this;
        }

        @w0(23)
        @b1({b1.a.LIBRARY})
        public c(PlaybackParams playbackParams) {
            this.f58422d = playbackParams;
        }

        public c(@NonNull p pVar) {
            if (pVar == null) {
                throw new NullPointerException("playbakcParams shouldn't be null");
            }
            this.f58422d = pVar.c();
        }
    }

    @w0(23)
    p(PlaybackParams playbackParams) {
        this.f58418d = playbackParams;
    }
}
