package androidx.media;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesCompat implements androidx.versionedparcelable.h {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;
    public static final int D = 6;
    public static final int E = 7;
    public static final int F = 8;
    public static final int G = 9;
    public static final int H = 10;
    public static final int I = 11;
    public static final int J = 12;
    public static final int K = 13;
    public static final int L = 14;
    static final int M = 15;
    public static final int N = 16;
    private static final int O = 1;
    private static final int P = 2;
    private static final SparseIntArray Q;
    static boolean R = false;
    private static final int[] S;
    public static final int T = 1;
    static final int U = 2;
    static final int V = 4;
    static final int W = 8;
    public static final int X = 16;
    static final int Y = 32;
    static final int Z = 64;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final int f52685a0 = 128;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final int f52686b0 = 256;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final int f52687c0 = 512;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    static final int f52688d0 = 1023;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static final int f52689e0 = 273;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final int f52690f0 = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f52691r = "AudioAttributesCompat";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f52692s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f52693t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f52694u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f52695v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f52696w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f52697x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f52698y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f52699z = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public AudioAttributesImpl f52700q;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f52701a = 6;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f52702b = 7;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f52703c = 9;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f52704d = 10;

        private c() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        S = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    @b1({b1.a.LIBRARY})
    public AudioAttributesCompat() {
    }

    @b1({b1.a.LIBRARY})
    public static void d(boolean force) {
        R = force;
    }

    static int f(boolean fromGetVolumeControlStream, int flags, int usage) {
        if ((flags & 1) == 1) {
            return fromGetVolumeControlStream ? 1 : 7;
        }
        if ((flags & 4) == 4) {
            return fromGetVolumeControlStream ? 0 : 6;
        }
        switch (usage) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return fromGetVolumeControlStream ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!fromGetVolumeControlStream) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + usage + " in audio attributes");
        }
    }

    static String h(int usage) {
        switch (usage) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + usage;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @p0
    public static AudioAttributesCompat i(@NonNull final Object aa2) {
        if (R) {
            return null;
        }
        return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) aa2));
    }

    public int I() {
        return this.f52700q.I();
    }

    public int Z4() {
        return this.f52700q.Z4();
    }

    public int a5() {
        return this.f52700q.a5();
    }

    int b5() {
        return this.f52700q.b5();
    }

    public int c5() {
        return this.f52700q.c5();
    }

    public boolean equals(Object o10) {
        if (!(o10 instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) o10;
        AudioAttributesImpl audioAttributesImpl = this.f52700q;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f52700q == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f52700q);
    }

    @p0
    public Object g() {
        return this.f52700q.e();
    }

    public int getContentType() {
        return this.f52700q.getContentType();
    }

    public int hashCode() {
        return this.f52700q.hashCode();
    }

    public String toString() {
        return this.f52700q.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl impl) {
        this.f52700q = impl;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AudioAttributesImpl.a f52705a;

        public d() {
            if (AudioAttributesCompat.R) {
                this.f52705a = new AudioAttributesImplBase.a();
            } else {
                this.f52705a = new AudioAttributesImplApi26.a();
            }
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f52705a.build());
        }

        public d b(int contentType) {
            this.f52705a.c(contentType);
            return this;
        }

        public d c(int flags) {
            this.f52705a.v(flags);
            return this;
        }

        public d d(int streamType) {
            this.f52705a.b(streamType);
            return this;
        }

        public d e(int usage) {
            this.f52705a.a(usage);
            return this;
        }

        public d(AudioAttributesCompat aa2) {
            if (AudioAttributesCompat.R) {
                this.f52705a = new AudioAttributesImplBase.a(aa2);
            } else {
                this.f52705a = new AudioAttributesImplApi26.a(aa2.g());
            }
        }
    }
}
