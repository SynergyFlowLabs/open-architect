package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@jk.c
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f334508b = 4000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Map<String, String> f334510d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f334507a = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final CopyOnWriteArraySet<Logger> f334509c = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = b0.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = b0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = okhttp3.internal.http2.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = okhttp3.internal.concurrent.d.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f334510d = MapsKt.toMap(linkedHashMap);
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f334509c.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f334511a);
        }
    }

    private final String d(String str) {
        String strX8 = f334510d.get(str);
        if (strX8 == null) {
            strX8 = StringsKt.X8(str, 23);
        }
        return strX8;
    }

    public final void a(@NotNull String loggerName, int i10, @NotNull String message, @Nullable Throwable th2) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th2 != null) {
                message = message + '\n' + Log.getStackTraceString(th2);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iQ3 = StringsKt.q3(str, '\n', i11, false, 4, null);
                if (iQ3 == -1) {
                    iQ3 = length;
                }
                while (true) {
                    iMin = Math.min(iQ3, i11 + f334508b);
                    String strSubstring = str.substring(i11, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iQ3) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f334510d.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}
