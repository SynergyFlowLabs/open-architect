package org.tensorflow.lite;

/* JADX INFO: loaded from: classes14.dex */
public enum a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f339800a;

    /* JADX INFO: renamed from: org.tensorflow.lite.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2444a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339801a;

        static {
            int[] iArr = new int[a.values().length];
            f339801a = iArr;
            try {
                iArr[a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339801a[a.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339801a[a.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339801a[a.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339801a[a.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339801a[a.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339801a[a.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f339801a[a.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        int i10 = (2 >> 2) << 3;
    }

    a(int value) {
        this.f339800a = value;
    }

    public int k() {
        switch (C2444a.f339801a[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
            case 5:
                return 1;
            case 6:
                return 8;
            case 7:
            case 8:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    int l() {
        return this.f339800a;
    }
}
