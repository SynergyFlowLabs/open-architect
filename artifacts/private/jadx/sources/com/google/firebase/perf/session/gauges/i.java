package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.l1;
import com.google.firebase.perf.util.m;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124109e = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f124110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ActivityManager f124111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f124112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f124113d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return m.d(com.google.firebase.perf.util.j.f124248f.p(this.f124112c.totalMem));
    }

    public int b() {
        return m.d(com.google.firebase.perf.util.j.f124248f.p(this.f124110a.maxMemory()));
    }

    public int c() {
        return m.d(com.google.firebase.perf.util.j.f124246d.p(this.f124111b.getMemoryClass()));
    }

    @l1
    int d(String str) {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            do {
                try {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return 0;
                    }
                    return 0;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                f124109e.l("Unable to read '" + str + "' file: " + e.getMessage());
            } while (!line.startsWith("MemTotal"));
            Matcher matcher = Pattern.compile("\\d+").matcher(line);
            int i10 = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
            bufferedReader.close();
            return i10;
        } catch (IOException e10) {
            f124109e.l("Unable to read '" + str + "' file: " + e10.getMessage());
        } catch (NumberFormatException e11) {
            f124109e.l("Unable to parse '" + str + "' file: " + e11.getMessage());
        }
    }

    @l1
    i(Runtime runtime, Context context) {
        this.f124110a = runtime;
        this.f124113d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f124111b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f124112c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
