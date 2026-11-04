package com.devtodev.core.utils.log;

/* JADX INFO: loaded from: classes3.dex */
public class CoreLog {
    public static final String TAG = "DevToDev";
    public static final String TRACKING_DISABLED = "Tracking was disabled for this device";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LogLevel f98356a = LogLevel.No;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f98357b = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f98358a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f98358a = iArr;
            try {
                iArr[LogLevel.Verbose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98358a[LogLevel.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98358a[LogLevel.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98358a[LogLevel.No.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98358a[LogLevel.Warn.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98358a[LogLevel.Error.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98358a[LogLevel.Assert.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface b {
        void a(String str, LogLevel logLevel);
    }

    public static void d(String str, String str2) {
        int i10 = a.f98358a[f98356a.ordinal()];
        b bVar = f98357b;
        if (bVar != null) {
            bVar.a(str2, LogLevel.Debug);
        }
    }

    public static void e(String str, String str2) {
        int i10 = a.f98358a[f98356a.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 != 5) {
        }
        b bVar = f98357b;
        if (bVar != null) {
            bVar.a(str2, LogLevel.Error);
        }
    }

    public static void i(String str, String str2) {
        int i10 = a.f98358a[f98356a.ordinal()];
        if (i10 == 1 || i10 != 2) {
        }
        b bVar = f98357b;
        if (bVar != null) {
            bVar.a(str2, LogLevel.Info);
        }
    }

    public static void notInitializedMessage() {
        i("DevToDev", "Initialize SDK first");
    }

    public static void setDebugEvent(b bVar) {
        f98357b = bVar;
    }

    public static void setLogEnabled(boolean z10) {
        if (z10) {
            f98356a = LogLevel.Verbose;
        } else {
            f98356a = LogLevel.No;
        }
    }

    public static void setLogLevel(LogLevel logLevel) {
        f98356a = logLevel;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    public static void e(String str, String str2, Exception exc) {
        int i10 = a.f98358a[f98356a.ordinal()];
        if (i10 == 1 || i10 == 2) {
            exc.printStackTrace();
        } else {
            int i11 = 0 ^ 3;
            if (i10 == 3 || i10 == 5 || i10 == 6) {
                exc.printStackTrace();
            }
        }
        b bVar = f98357b;
        if (bVar != null) {
            bVar.a(str2, LogLevel.Error);
        }
    }

    public static void i(String str, String str2, Exception exc) {
        int i10 = a.f98358a[f98356a.ordinal()];
        if (i10 == 1 || i10 != 2) {
        }
        b bVar = f98357b;
        if (bVar != null) {
            bVar.a(str2, LogLevel.Info);
        }
    }
}
