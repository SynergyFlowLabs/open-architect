package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.annotation.w0;
import androidx.media3.common.util.k1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f64151a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f64152b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f64153c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f64154d = 2;

    @w0(29)
    private static final class a {
        private a() {
        }

        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                int iC = c(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10));
                if (iC == 1 && u.f64151a == null) {
                    Boolean unused = u.f64151a = Boolean.valueOf(d());
                    if (u.f64151a.booleanValue()) {
                        return 0;
                    }
                }
                return iC;
            }
            return 0;
        }

        private static int b(boolean z10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            try {
                androidx.media3.common.w wVarN = new androidx.media3.common.w.b().u0("video/avc").N();
                if (wVarN.f61761o != null) {
                    List<t> listP = f0.p(z.f64220a, wVarN, z10, false);
                    for (int i10 = 0; i10 < listP.size(); i10++) {
                        if (listP.get(i10).f64142d != null && listP.get(i10).f64142d.getVideoCapabilities() != null && (supportedPerformancePoints = listP.get(i10).f64142d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            return c(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                        }
                    }
                }
            } catch (f0.c unused) {
            }
            return 0;
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (k1.f61540a >= 35) {
                return false;
            }
            int iB = b(false);
            int iB2 = b(true);
            if (iB == 0) {
                return true;
            }
            if (iB2 == 0) {
                return iB != 2;
            }
            if (iB == 2 && iB2 == 2) {
                return false;
            }
            return true;
        }
    }

    private u() {
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Boolean bool;
        if (k1.f61540a < 29 || ((bool = f64151a) != null && bool.booleanValue())) {
            return 0;
        }
        return a.a(videoCapabilities, i10, i11, d10);
    }
}
