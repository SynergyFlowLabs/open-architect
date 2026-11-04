package androidx.media3.common;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class x0 extends Exception {
    public static final int A3 = 6001;
    public static final int B3 = 6002;
    public static final int C3 = 6003;
    public static final int D3 = 6004;
    public static final int E3 = 6005;
    public static final int F3 = 6006;
    public static final int G3 = 6007;
    public static final int H1 = 2002;
    public static final int H3 = 6008;

    @androidx.media3.common.util.b1
    public static final int I3 = 7000;

    @androidx.media3.common.util.b1
    public static final int J3 = 7001;
    public static final int K3 = 1000000;
    private static final String L3 = androidx.media3.common.util.k1.c1(0);
    private static final String M3 = androidx.media3.common.util.k1.c1(1);
    private static final String N3 = androidx.media3.common.util.k1.c1(2);
    private static final String O3 = androidx.media3.common.util.k1.c1(3);
    private static final String P3 = androidx.media3.common.util.k1.c1(4);
    private static final String Q3 = androidx.media3.common.util.k1.c1(5);

    @androidx.media3.common.util.b1
    protected static final int R3 = 1000;
    public static final int X = 1002;
    public static final int Y = 1003;
    public static final int Z = 1004;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61812d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f61813e = -3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61814f = -4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f61815g = -6;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f61816g3 = 2004;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f61817h = -100;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f61818h3 = 2005;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f61819i = -102;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f61820i3 = 2006;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f61821j = -103;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f61822j3 = 2007;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f61823k = -104;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f61824k3 = 2008;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f61825l = -105;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final int f61826l3 = 3001;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f61827m = -106;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final int f61828m3 = 3002;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f61829n = -107;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f61830n3 = 3003;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f61831o = -108;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f61832o3 = 3004;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f61833p0 = 2000;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f61834p1 = 2001;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f61835p2 = 2003;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f61836p3 = 4001;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final int f61837q3 = 4002;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final int f61838r3 = 4003;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f61839s = -109;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final int f61840s3 = 4004;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f61841t = -110;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final int f61842t3 = 4005;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final int f61843u3 = 4006;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f61844v = 1000;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f61845v3 = 5001;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f61846w = 1001;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final int f61847w3 = 5002;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f61848x3 = 5003;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f61849y3 = 5004;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f61850z3 = 6000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f61852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final Bundle f61853c;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @androidx.media3.common.util.b1
    public x0(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10) {
        this(str, th2, i10, Bundle.EMPTY, androidx.media3.common.util.j.f61520a.b());
    }

    private static RemoteException a(@androidx.annotation.p0 String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class<?> cls, @androidx.annotation.p0 String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    @androidx.media3.common.util.b1
    public static x0 d(Bundle bundle) {
        return new x0(bundle);
    }

    @androidx.annotation.p0
    private static Throwable e(Bundle bundle) {
        String string = bundle.getString(O3);
        String string2 = bundle.getString(P3);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, x0.class.getClassLoader());
            Throwable thB = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            return thB == null ? a(string2) : thB;
        } catch (Throwable unused) {
            return a(string2);
        }
    }

    public static String g(int i10) {
        if (i10 == -100) {
            return "ERROR_CODE_DISCONNECTED";
        }
        if (i10 == -6) {
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        if (i10 == -4) {
            return "ERROR_CODE_PERMISSION_DENIED";
        }
        if (i10 == -3) {
            return "ERROR_CODE_BAD_VALUE";
        }
        if (i10 == -2) {
            return "ERROR_CODE_INVALID_STATE";
        }
        if (i10 == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i10 == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i10) {
            case -110:
                return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
            case f61839s /* -109 */:
                return "ERROR_CODE_END_OF_PLAYLIST";
            case -108:
                return "ERROR_CODE_SETUP_REQUIRED";
            case -107:
                return "ERROR_CODE_SKIP_LIMIT_REACHED";
            case -106:
                return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
            case -105:
                return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
            case -104:
                return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
            case -103:
                return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
            case -102:
                return "ERROR_CODE_AUTHENTICATION_EXPIRED";
            default:
                switch (i10) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case 1001:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case 1004:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i10) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case f61834p1 /* 2001 */:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case H1 /* 2002 */:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case f61835p2 /* 2003 */:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case f61816g3 /* 2004 */:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case f61818h3 /* 2005 */:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case f61820i3 /* 2006 */:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case f61822j3 /* 2007 */:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case 2008:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i10) {
                                    case 3001:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case 3002:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case 3003:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case 3004:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i10) {
                                            case f61836p3 /* 4001 */:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case f61837q3 /* 4002 */:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case f61838r3 /* 4003 */:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case f61840s3 /* 4004 */:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case f61842t3 /* 4005 */:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            case f61843u3 /* 4006 */:
                                                return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            default:
                                                switch (i10) {
                                                    case f61845v3 /* 5001 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    case f61847w3 /* 5002 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    case f61848x3 /* 5003 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    case f61849y3 /* 5004 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                    default:
                                                        switch (i10) {
                                                            case 6000:
                                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                                            case A3 /* 6001 */:
                                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            case B3 /* 6002 */:
                                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            case C3 /* 6003 */:
                                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            case D3 /* 6004 */:
                                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            case E3 /* 6005 */:
                                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            case F3 /* 6006 */:
                                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            case G3 /* 6007 */:
                                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            case H3 /* 6008 */:
                                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            default:
                                                                return i10 >= 1000000 ? "custom error code" : "invalid error code";
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private static Bundle h(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Q3);
        return bundle2 != null ? bundle2 : Bundle.EMPTY;
    }

    @androidx.annotation.i
    public boolean c(@androidx.annotation.p0 x0 x0Var) {
        if (this == x0Var) {
            return true;
        }
        if (x0Var != null && getClass() == x0Var.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = x0Var.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.f61851a == x0Var.f61851a && Objects.equals(getMessage(), x0Var.getMessage()) && this.f61852b == x0Var.f61852b) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return g(this.f61851a);
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.i
    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putInt(L3, this.f61851a);
        bundle.putLong(M3, this.f61852b);
        bundle.putString(N3, getMessage());
        bundle.putBundle(Q3, this.f61853c);
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(O3, cause.getClass().getName());
            bundle.putString(P3, cause.getMessage());
        }
        return bundle;
    }

    @androidx.media3.common.util.b1
    public x0(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10, Bundle bundle) {
        this(str, th2, i10, bundle, androidx.media3.common.util.j.f61520a.b());
    }

    @androidx.media3.common.util.b1
    protected x0(Bundle bundle) {
        this(bundle.getString(N3), e(bundle), bundle.getInt(L3, 1000), h(bundle), bundle.getLong(M3, SystemClock.elapsedRealtime()));
    }

    @androidx.media3.common.util.b1
    protected x0(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10, Bundle bundle, long j10) {
        super(str, th2);
        this.f61851a = i10;
        this.f61853c = bundle;
        this.f61852b = j10;
    }
}
