package io.intercom.android.sdk.utilities;

import androidx.annotation.p0;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class IoUtils {
    public static void closeQuietly(@p0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void safelyDelete(File file) {
        try {
            if (file.delete()) {
                return;
            }
            file.deleteOnExit();
        } catch (Exception unused) {
        }
    }
}
