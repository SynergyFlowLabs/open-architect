package org.tensorflow.lite;

import androidx.constraintlayout.core.motion.utils.v;

/* JADX INFO: loaded from: classes14.dex */
class b {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339802a;

        static {
            int[] iArr = new int[org.tensorflow.lite.a.values().length];
            f339802a = iArr;
            try {
                iArr[org.tensorflow.lite.a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339802a[org.tensorflow.lite.a.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339802a[org.tensorflow.lite.a.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339802a[org.tensorflow.lite.a.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339802a[org.tensorflow.lite.a.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339802a[org.tensorflow.lite.a.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339802a[org.tensorflow.lite.a.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f339802a[org.tensorflow.lite.a.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private b() {
    }

    static org.tensorflow.lite.a a(int c10) {
        switch (c10) {
            case 1:
                return org.tensorflow.lite.a.FLOAT32;
            case 2:
                return org.tensorflow.lite.a.INT32;
            case 3:
                return org.tensorflow.lite.a.UINT8;
            case 4:
                return org.tensorflow.lite.a.INT64;
            case 5:
                return org.tensorflow.lite.a.STRING;
            case 6:
                return org.tensorflow.lite.a.BOOL;
            case 7:
                return org.tensorflow.lite.a.INT16;
            case 8:
            default:
                throw new IllegalArgumentException("DataType error: DataType " + c10 + " is not recognized in Java.");
            case 9:
                return org.tensorflow.lite.a.INT8;
        }
    }

    static String b(org.tensorflow.lite.a dataType) {
        switch (a.f339802a[dataType.ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return io.sentry.profilemeasurements.a.f306070m;
            case 6:
                return "long";
            case 7:
                return "bool";
            case 8:
                return v.b.f43988e;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + dataType + " is not supported yet");
        }
    }
}
