package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class f extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336454a = 7372168004395734046L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<File> f336455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f336456c;

    static {
        f fVar = new f();
        f336455b = fVar;
        f336456c = new i(fVar);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ List a(List list) {
        return super.a(list);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ File[] b(File[] fileArr) {
        return super.b(fileArr);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        long jLastModified = file.lastModified() - file2.lastModified();
        if (jLastModified < 0) {
            return -1;
        }
        return jLastModified > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
