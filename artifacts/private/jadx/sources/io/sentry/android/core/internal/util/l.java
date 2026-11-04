package io.sentry.android.core.internal.util;

import io.sentry.m1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l f304312c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f304313d = "/sys/devices/system/cpu";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @lm.r
    @NotNull
    static final String f304314e = "cpufreq/cpuinfo_max_freq";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304315a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Integer> f304316b = new ArrayList();

    private l() {
    }

    public static l b() {
        return f304312c;
    }

    @lm.n
    final void a() {
        this.f304316b.clear();
    }

    @lm.r
    @NotNull
    String c() {
        return f304313d;
    }

    @NotNull
    public List<Integer> d() {
        m1 m1VarA = this.f304315a.a();
        try {
            if (!this.f304316b.isEmpty()) {
                List<Integer> list = this.f304316b;
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(c()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    File file2 = new File(file, f304314e);
                    if (file2.exists() && file2.canRead()) {
                        try {
                            String strC = io.sentry.util.i.c(file2);
                            if (strC != null) {
                                this.f304316b.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                            }
                        } catch (IOException | NumberFormatException unused) {
                        }
                    }
                }
            }
            List<Integer> list2 = this.f304316b;
            if (m1VarA != null) {
                m1VarA.close();
            }
            return list2;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @lm.n
    public void e(List<Integer> list) {
        this.f304316b.clear();
        this.f304316b.addAll(list);
    }
}
