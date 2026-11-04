package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class d extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336443a = 296132640160964395L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<File> f336444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f336445c;

    static {
        d dVar = new d();
        f336444b = dVar;
        f336445c = new i(dVar);
    }

    private int d(File file) {
        return file.isDirectory() ? 1 : 2;
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
        return d(file) - d(file2);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
