package com.segment.analytics.kotlin.core.utilities;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@oj.i(name = "FileUtils")
public final class k {
    public static final void a(@NotNull File location) throws IOException {
        Intrinsics.checkNotNullParameter(location, "location");
        if (location.exists() || location.mkdirs() || location.isDirectory()) {
            return;
        }
        throw new IOException("Could not create directory at " + location);
    }

    @NotNull
    public static final String b(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        int iF3 = StringsKt.F3(fileName, '.', 0, false, 6, null);
        if (iF3 == -1 || iF3 <= 0) {
            return fileName;
        }
        String strSubstring = fileName.substring(0, iF3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
