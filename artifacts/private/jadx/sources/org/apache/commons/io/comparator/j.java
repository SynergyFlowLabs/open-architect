package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.k;

/* JADX INFO: loaded from: classes14.dex */
public class j extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336475b = -1201561106411416190L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f336476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator<File> f336477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<File> f336478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f336479f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f336480a;

    static {
        j jVar = new j();
        f336476c = jVar;
        f336477d = new i(jVar);
        j jVar2 = new j(true);
        f336478e = jVar2;
        f336479f = new i(jVar2);
    }

    public j() {
        this.f336480a = false;
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
        long length;
        long length2;
        if (file.isDirectory()) {
            length = (this.f336480a && file.exists()) ? k.C0(file) : 0L;
        } else {
            length = file.length();
        }
        if (file2.isDirectory()) {
            length2 = (this.f336480a && file2.exists()) ? k.C0(file2) : 0L;
        } else {
            length2 = file2.length();
        }
        long j10 = length - length2;
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.f336480a + "]";
    }

    public j(boolean z10) {
        this.f336480a = z10;
    }
}
