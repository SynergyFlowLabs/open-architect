package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.crashlytics.internal.j;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f121793h = ".com.google.firebase.crashlytics.files.v1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f121794i = ".com.google.firebase.crashlytics.files.v2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f121795j = ".crashlytics.v3";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f121796k = "open-sessions";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f121797l = "native";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f121798m = "reports";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f121799n = "priority-reports";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f121800o = "native-reports";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f121801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f121802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f121803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f121804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f121805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f121806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f121807g;

    public g(Context context) {
        String str;
        String strD = j.f121254a.g(context).d();
        this.f121801a = strD;
        File filesDir = context.getFilesDir();
        this.f121802b = filesDir;
        if (y()) {
            str = f121795j + File.separator + x(strD);
        } else {
            str = f121793h;
        }
        File fileT = t(new File(filesDir, str));
        this.f121803c = fileT;
        this.f121804d = t(new File(fileT, f121796k));
        this.f121805e = t(new File(fileT, "reports"));
        this.f121806f = t(new File(fileT, f121799n));
        this.f121807g = t(new File(fileT, f121800o));
    }

    private void b(String str) {
        File file = new File(this.f121802b, str);
        if (file.exists() && v(file)) {
            com.google.firebase.crashlytics.internal.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f121802b.exists() || (list = this.f121802b.list(new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File q(String str) {
        return u(new File(this.f121804d, str));
    }

    private static synchronized File t(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                com.google.firebase.crashlytics.internal.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                com.google.firebase.crashlytics.internal.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    static boolean v(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> w(@p0 T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    @l1
    static String x(String str) {
        return str.length() > 40 ? i.D(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f121801a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(f121793h);
            c(f121794i + File.pathSeparator);
        }
    }

    @l1
    public void e() {
        v(this.f121803c);
    }

    public boolean f(String str) {
        return v(new File(this.f121804d, str));
    }

    public List<String> g() {
        return w(this.f121804d.list());
    }

    public File h(String str) {
        return new File(this.f121803c, str);
    }

    public List<File> i(FilenameFilter filenameFilter) {
        return w(this.f121803c.listFiles(filenameFilter));
    }

    public File j(String str) {
        return new File(this.f121807g, str);
    }

    public List<File> k() {
        return w(this.f121807g.listFiles());
    }

    public File l(String str) {
        return u(new File(q(str), "native"));
    }

    public File m(String str) {
        return new File(this.f121806f, str);
    }

    public List<File> n() {
        return w(this.f121806f.listFiles());
    }

    public File o(String str) {
        return new File(this.f121805e, str);
    }

    public List<File> p() {
        return w(this.f121805e.listFiles());
    }

    public File r(String str, String str2) {
        return new File(q(str), str2);
    }

    public List<File> s(String str, FilenameFilter filenameFilter) {
        return w(q(str).listFiles(filenameFilter));
    }
}
