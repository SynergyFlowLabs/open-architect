package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f121118d = "aqs.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final FilenameFilter f121119e = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(l.f121118d);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Comparator<File> f121120f = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f121121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private String f121122b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private String f121123c = null;

    l(com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f121121a = gVar;
    }

    private static void d(com.google.firebase.crashlytics.internal.persistence.g gVar, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        if (str != null && str2 != null) {
            try {
                gVar.r(str, f121118d + str2).createNewFile();
            } catch (IOException e10) {
                com.google.firebase.crashlytics.internal.g.f().n("Failed to persist App Quality Sessions session id.", e10);
            }
        }
    }

    @l1
    @androidx.annotation.p0
    static String e(com.google.firebase.crashlytics.internal.persistence.g gVar, @NonNull String str) {
        List<File> listS = gVar.s(str, f121119e);
        if (!listS.isEmpty()) {
            return ((File) Collections.min(listS, f121120f)).getName().substring(4);
        }
        com.google.firebase.crashlytics.internal.g.f().m("Unable to read App Quality Sessions session id.");
        return null;
    }

    @androidx.annotation.p0
    public synchronized String c(@NonNull String str) {
        if (Objects.equals(this.f121122b, str)) {
            return this.f121123c;
        }
        return e(this.f121121a, str);
    }

    public synchronized void f(@NonNull String str) {
        if (!Objects.equals(this.f121123c, str)) {
            d(this.f121121a, this.f121122b, str);
            this.f121123c = str;
        }
    }

    public synchronized void g(@androidx.annotation.p0 String str) {
        try {
            if (!Objects.equals(this.f121122b, str)) {
                d(this.f121121a, str, this.f121123c);
                this.f121122b = str;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
