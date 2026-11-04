package androidx.constraintlayout.core.motion.utils;

import io.sentry.protocol.d0;

/* JADX INFO: loaded from: classes2.dex */
public interface v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43951a = "CUSTOM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f43952b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43953c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43954d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43955e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f43956f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43957g = 101;

    public interface a {
        public static final String A = "rotationX";
        public static final String B = "rotationY";
        public static final String C = "rotationZ";
        public static final String D = "scaleX";
        public static final String E = "scaleY";
        public static final String F = "pivotX";
        public static final String G = "pivotY";
        public static final String H = "progress";
        public static final String I = "pathRotate";
        public static final String J = "easing";
        public static final String K = "CUSTOM";
        public static final String L = "frame";
        public static final String M = "target";
        public static final String N = "pivotTarget";
        public static final String[] O = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", L, M, N};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f43958a = "KeyAttributes";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f43959b = 301;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f43960c = 302;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f43961d = 303;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f43962e = 304;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f43963f = 305;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f43964g = 306;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f43965h = 307;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f43966i = 308;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f43967j = 309;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f43968k = 310;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f43969l = 311;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f43970m = 312;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f43971n = 313;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f43972o = 314;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f43973p = 315;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f43974q = 316;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f43975r = 317;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f43976s = 318;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f43977t = "curveFit";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f43978u = "visibility";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f43979v = "alpha";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f43980w = "translationX";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f43981x = "translationY";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f43982y = "translationZ";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f43983z = "elevation";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x000f  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        static int a(String str) {
            byte b10;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    if (!str.equals("easing")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case -1249320806:
                    if (!str.equals("rotationX")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1249320805:
                    if (!str.equals("rotationY")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -1249320804:
                    if (!str.equals("rotationZ")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -1225497657:
                    if (!str.equals("translationX")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case -1225497656:
                    if (!str.equals("translationY")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -1225497655:
                    if (!str.equals("translationZ")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case -1001078227:
                    if (!str.equals("progress")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -987906986:
                    if (!str.equals("pivotX")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case -987906985:
                    if (!str.equals("pivotY")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case -908189618:
                    if (!str.equals("scaleX")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -908189617:
                    if (!str.equals("scaleY")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case -880905839:
                    if (!str.equals(M)) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116461n;
                    }
                    break;
                case -4379043:
                    if (!str.equals("elevation")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116462o;
                    }
                    break;
                case 92909918:
                    if (!str.equals("alpha")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116463p;
                    }
                    break;
                case 97692013:
                    if (!str.equals(L)) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116464q;
                    }
                    break;
                case 579057826:
                    if (!str.equals("curveFit")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116465r;
                    }
                    break;
                case 803192288:
                    if (!str.equals("pathRotate")) {
                        b10 = -1;
                    } else {
                        b10 = 17;
                    }
                    break;
                case 1167159411:
                    if (!str.equals(N)) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116468u;
                    }
                    break;
                case 1941332754:
                    if (!str.equals("visibility")) {
                        b10 = -1;
                    } else {
                        b10 = 19;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return f43975r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case 8:
                    return 313;
                case 9:
                    return 314;
                case 10:
                    return 311;
                case 11:
                    return 312;
                case 12:
                    return 101;
                case 13:
                    return 307;
                case 14:
                    return 303;
                case 15:
                    return 100;
                case 16:
                    return 301;
                case 17:
                    return f43974q;
                case 18:
                    return f43976s;
                case 19:
                    return 302;
                default:
                    return -1;
            }
        }

        static int getType(int i10) {
            if (i10 == 100) {
                return 2;
            }
            if (i10 != 101) {
                switch (i10) {
                    case 301:
                    case 302:
                        return 2;
                    case 303:
                    case 304:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 315:
                    case f43974q /* 316 */:
                        return 4;
                    case f43975r /* 317 */:
                    case f43976s /* 318 */:
                        break;
                    default:
                        return -1;
                }
            }
            return 8;
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f43984a = "Custom";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f43985b = "integer";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f43986c = "float";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f43987d = "color";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f43989f = "boolean";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f43990g = "dimension";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f43993j = 900;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f43994k = 901;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f43995l = 902;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f43996m = 903;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f43997n = 904;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f43998o = 905;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f43999p = 906;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f43988e = "string";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f43991h = "reference";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String[] f43992i = {"float", "color", f43988e, "boolean", "dimension", f43991h};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x000f  */
        static int a(String str) {
            str.getClass();
            switch (str) {
                case "dimension":
                    return f43998o;
                case "reference":
                    return f43999p;
                case "string":
                    return f43996m;
                case "boolean":
                    return f43997n;
                case "color":
                    return 902;
                case "float":
                    return 901;
                case "integer":
                    return 900;
                default:
                    return -1;
            }
        }
    }

    public interface c {
        public static final String A = "translationX";
        public static final String B = "translationY";
        public static final String C = "translationZ";
        public static final String D = "elevation";
        public static final String E = "rotationX";
        public static final String F = "rotationY";
        public static final String G = "rotationZ";
        public static final String H = "scaleX";
        public static final String I = "scaleY";
        public static final String J = "pivotX";
        public static final String K = "pivotY";
        public static final String L = "progress";
        public static final String M = "pathRotate";
        public static final String N = "easing";
        public static final String O = "waveShape";
        public static final String P = "customWave";
        public static final String Q = "period";
        public static final String R = "offset";
        public static final String S = "phase";
        public static final String[] T = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", P, Q, R, S};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f44000a = "KeyCycle";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f44001b = 401;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f44002c = 402;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f44003d = 403;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f44004e = 304;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f44005f = 305;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f44006g = 306;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f44007h = 307;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f44008i = 308;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f44009j = 309;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f44010k = 310;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f44011l = 311;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f44012m = 312;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f44013n = 313;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f44014o = 314;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f44015p = 315;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f44016q = 416;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f44017r = 420;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f44018s = 421;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f44019t = 422;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f44020u = 423;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f44021v = 424;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f44022w = 425;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f44023x = "curveFit";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f44024y = "visibility";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f44025z = "alpha";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x0010  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        static int a(String str) {
            byte b10;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    if (!str.equals("easing")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case -1249320806:
                    if (!str.equals("rotationX")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1249320805:
                    if (!str.equals("rotationY")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -1249320804:
                    if (!str.equals("rotationZ")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -1225497657:
                    if (!str.equals("translationX")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case -1225497656:
                    if (!str.equals("translationY")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -1225497655:
                    if (!str.equals("translationZ")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case -1001078227:
                    if (!str.equals("progress")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -987906986:
                    if (!str.equals("pivotX")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case -987906985:
                    if (!str.equals("pivotY")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case -908189618:
                    if (!str.equals("scaleX")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -908189617:
                    if (!str.equals("scaleY")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 92909918:
                    if (!str.equals("alpha")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116461n;
                    }
                    break;
                case 579057826:
                    if (!str.equals("curveFit")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116462o;
                    }
                    break;
                case 803192288:
                    if (!str.equals("pathRotate")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116463p;
                    }
                    break;
                case 1941332754:
                    if (!str.equals("visibility")) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116464q;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return f44017r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case 8:
                    return 313;
                case 9:
                    return 314;
                case 10:
                    return 311;
                case 11:
                    return 312;
                case 12:
                    return 403;
                case 13:
                    return 401;
                case 14:
                    return f44016q;
                case 15:
                    return 402;
                default:
                    return -1;
            }
        }

        static int getType(int i10) {
            if (i10 == 100) {
                return 2;
            }
            if (i10 == 101) {
                return 8;
            }
            if (i10 == 416) {
                return 4;
            }
            if (i10 == 420 || i10 == 421) {
                return 8;
            }
            switch (i10) {
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                    return 4;
                default:
                    switch (i10) {
                        case 401:
                        case 402:
                            return 2;
                        case 403:
                            return 4;
                        default:
                            switch (i10) {
                                case f44020u /* 423 */:
                                case f44021v /* 424 */:
                                case f44022w /* 425 */:
                                    return 4;
                                default:
                                    return -1;
                            }
                    }
            }
        }
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f44026a = "MotionScene";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f44029d = 600;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f44030e = 601;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f44027b = "defaultDuration";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f44028c = "layoutDuringTransition";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String[] f44031f = {f44027b, f44028c};

        static int a(String str) {
            str.getClass();
            if (str.equals(f44027b)) {
                return 600;
            }
            if (str.equals(f44028c)) {
                return 601;
            }
            int i10 = 0 | (-1);
            return -1;
        }

        static int getType(int i10) {
            if (i10 != 600) {
                return i10 != 601 ? -1 : 1;
            }
            return 2;
        }
    }

    public interface e {
        public static final int A = 611;
        public static final int B = 612;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f44032a = "Motion";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f44033b = "Stagger";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f44034c = "PathRotate";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f44035d = "QuantizeMotionPhase";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f44036e = "TransitionEasing";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f44037f = "QuantizeInterpolator";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f44038g = "AnimateRelativeTo";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f44039h = "AnimateCircleAngleTo";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f44040i = "PathMotionArc";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f44041j = "DrawPath";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f44042k = "PolarRelativeTo";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f44043l = "QuantizeMotionSteps";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f44044m = "QuantizeInterpolatorType";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f44045n = "QuantizeInterpolatorID";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String[] f44046o = {f44033b, f44034c, f44035d, f44036e, f44037f, f44038g, f44039h, f44040i, f44041j, f44042k, f44043l, f44044m, f44045n};

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f44047p = 600;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f44048q = 601;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f44049r = 602;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f44050s = 603;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f44051t = 604;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f44052u = 605;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f44053v = 606;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f44054w = 607;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f44055x = 608;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f44056y = 609;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f44057z = 610;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x000e  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        static int a(String str) {
            byte b10;
            str.getClass();
            switch (str.hashCode()) {
                case -2033446275:
                    if (!str.equals(f44039h)) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case -1532277420:
                    if (!str.equals(f44035d)) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1529145600:
                    if (!str.equals(f44043l)) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -1498310144:
                    if (!str.equals(f44034c)) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -1030753096:
                    if (!str.equals(f44037f)) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case -762370135:
                    if (!str.equals(f44041j)) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -232872051:
                    if (!str.equals(f44033b)) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 1138491429:
                    if (!str.equals(f44042k)) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 1539234834:
                    if (!str.equals(f44044m)) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 1583722451:
                    if (!str.equals(f44045n)) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 1639368448:
                    if (!str.equals(f44036e)) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 1900899336:
                    if (!str.equals(f44038g)) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 2109694967:
                    if (!str.equals(f44040i)) {
                        b10 = -1;
                    } else {
                        b10 = com.google.common.base.c.f116461n;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return f44053v;
                case 1:
                    return f44049r;
                case 2:
                    return f44057z;
                case 3:
                    return 601;
                case 4:
                    return f44051t;
                case 5:
                    return f44055x;
                case 6:
                    return 600;
                case 7:
                    return f44056y;
                case 8:
                    return A;
                case 9:
                    return B;
                case 10:
                    return f44050s;
                case 11:
                    return f44052u;
                case 12:
                    return f44054w;
                default:
                    return -1;
            }
        }
    }

    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f44058a = "dragscale";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f44059b = "dragthreshold";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f44060c = "maxvelocity";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f44061d = "maxacceleration";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f44062e = "springmass";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f44063f = "springstiffness";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f44064g = "springdamping";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f44065h = "springstopthreshold";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f44066i = "dragdirection";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f44067j = "touchanchorid";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f44068k = "touchanchorside";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f44069l = "rotationcenterid";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f44070m = "touchregionid";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f44071n = "limitboundsto";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f44072o = "movewhenscrollattop";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f44073p = "ontouchup";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f44075r = "springboundary";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f44077t = "autocompletemode";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f44079v = "nestedscrollflags";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String[] f44074q = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", "decelerate", "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String[] f44076s = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String[] f44078u = {"continuousVelocity", d0.f306177c};

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String[] f44080w = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    public interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f44081a = "KeyPosition";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f44082b = "transitionEasing";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f44083c = "drawPath";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f44084d = "percentWidth";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f44085e = "percentHeight";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f44086f = "sizePercent";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f44087g = "percentX";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f44088h = "percentY";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f44089i = 501;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f44090j = 502;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f44091k = 503;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f44092l = 504;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f44093m = 505;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f44094n = 506;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f44095o = 507;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f44096p = 508;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f44097q = 509;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f44098r = 510;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String[] f44099s = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x000e  */
        static int a(String str) {
            str.getClass();
            switch (str) {
                case "transitionEasing":
                    return 501;
                case "percentWidth":
                    return 503;
                case "percentHeight":
                    return 504;
                case "drawPath":
                    return 502;
                case "sizePercent":
                    return 505;
                case "percentX":
                    return 506;
                case "percentY":
                    return f44095o;
                default:
                    return -1;
            }
        }

        static int getType(int i10) {
            if (i10 != 100) {
                if (i10 != 101) {
                    switch (i10) {
                        case 501:
                        case 502:
                            break;
                        case 503:
                        case 504:
                        case 505:
                        case 506:
                        case f44095o /* 507 */:
                            return 4;
                        case f44096p /* 508 */:
                            break;
                        default:
                            return -1;
                    }
                }
                return 8;
            }
            return 2;
        }
    }

    public interface h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f44100a = "Transitions";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f44101b = "duration";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f44102c = "from";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f44103d = "to";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f44109j = 700;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f44110k = 701;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f44111l = 702;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f44112m = 509;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f44113n = 704;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f44114o = 705;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f44115p = 706;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f44116q = 707;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f44104e = "pathMotionArc";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f44105f = "autoTransition";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f44106g = "motionInterpolator";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f44107h = "staggered";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f44108i = "transitionFlags";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String[] f44117r = {"duration", "from", "to", f44104e, f44105f, f44106g, f44107h, "from", f44108i};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x000e  */
        static int a(String str) {
            str.getClass();
            switch (str) {
                case "transitionFlags":
                    return f44116q;
                case "duration":
                    return 700;
                case "motionInterpolator":
                    return f44114o;
                case "autoTransition":
                    return 704;
                case "to":
                    return 702;
                case "from":
                    return 701;
                case "pathMotionArc":
                    return 509;
                case "staggered":
                    return f44115p;
                default:
                    return -1;
            }
        }

        static int getType(int i10) {
            if (i10 != 509) {
                switch (i10) {
                    case 700:
                        break;
                    case 701:
                    case 702:
                        break;
                    default:
                        switch (i10) {
                            case f44114o /* 705 */:
                            case f44116q /* 707 */:
                                break;
                            case f44115p /* 706 */:
                                return 4;
                            default:
                                return -1;
                        }
                        break;
                }
                return 8;
            }
            return 2;
        }
    }

    public interface i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f44118a = "KeyTrigger";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f44119b = "viewTransitionOnCross";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f44120c = "viewTransitionOnPositiveCross";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f44121d = "viewTransitionOnNegativeCross";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f44122e = "postLayout";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f44123f = "triggerSlack";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f44124g = "triggerCollisionView";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f44125h = "triggerCollisionId";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f44126i = "triggerID";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f44127j = "positiveCross";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f44128k = "negativeCross";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f44129l = "triggerReceiver";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f44130m = "CROSS";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String[] f44131n = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f44132o = 301;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f44133p = 302;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f44134q = 303;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f44135r = 304;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f44136s = 305;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f44137t = 306;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f44138u = 307;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f44139v = 308;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f44140w = 309;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f44141x = 310;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f44142y = 311;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f44143z = 312;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x000f  */
        static int a(String str) {
            str.getClass();
            switch (str) {
                case "positiveCross":
                    return 309;
                case "viewTransitionOnPositiveCross":
                    return 302;
                case "triggerCollisionId":
                    return 307;
                case "triggerID":
                    return 308;
                case "negativeCross":
                    return 310;
                case "triggerCollisionView":
                    return 306;
                case "viewTransitionOnNegativeCross":
                    return 303;
                case "CROSS":
                    return 312;
                case "triggerSlack":
                    return 305;
                case "viewTransitionOnCross":
                    return 301;
                case "postLayout":
                    return 304;
                case "triggerReceiver":
                    return 311;
                default:
                    return -1;
            }
        }
    }

    int a(String str);

    boolean b(int i10, int i11);

    boolean c(int i10, float f10);

    boolean d(int i10, boolean z10);

    boolean e(int i10, String str);
}
