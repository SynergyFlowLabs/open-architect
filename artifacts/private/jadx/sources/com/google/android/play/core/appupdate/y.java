package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f114895a;

    y(Context context) {
        this.f114895a = context;
    }

    private static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jB = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jB += b(file2);
            }
        }
        return jB;
    }

    final long a() {
        return b(new File(this.f114895a.getFilesDir(), "assetpacks"));
    }
}
