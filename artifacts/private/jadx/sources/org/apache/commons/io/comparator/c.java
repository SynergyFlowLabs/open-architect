package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class c extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336440a = 3260141861365313518L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<File> f336441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f336442c;

    static {
        c cVar = new c();
        f336441b = cVar;
        f336442c = new i(cVar);
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
        return file.compareTo(file2);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
