package zm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f413531a = "UNKNOWN_THREAD_NAME";

    @NotNull
    public static final String a(@NotNull String threadName) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        int iF3 = StringsKt.F3(threadName, '@', 0, false, 6, null);
        if (iF3 < 0) {
            return threadName;
        }
        String strSubstring = threadName.substring(0, iF3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
