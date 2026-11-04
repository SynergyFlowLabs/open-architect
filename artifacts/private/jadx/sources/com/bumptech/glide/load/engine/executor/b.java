package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f96541a = "GlideRuntimeCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f96542b = "cpu[0-9]+";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f96543c = "/sys/devices/system/cpu/";

    class a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Pattern f96544a;

        a(Pattern pattern) {
            this.f96544a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f96544a.matcher(str).matches();
        }
    }

    private b() {
    }

    static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    private static int b() {
        File[] fileArrListFiles;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArrListFiles = new File(f96543c).listFiles(new a(Pattern.compile(f96542b)));
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (Throwable unused) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            fileArrListFiles = null;
        }
        return Math.max(1, fileArrListFiles != null ? fileArrListFiles.length : 0);
    }
}
