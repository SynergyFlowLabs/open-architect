package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.l;
import org.apache.commons.io.n;

/* JADX INFO: loaded from: classes14.dex */
public class e extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336446b = 1928235200184222815L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f336447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator<File> f336448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<File> f336449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f336450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Comparator<File> f336451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<File> f336452h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f336453a;

    static {
        e eVar = new e();
        f336447c = eVar;
        f336448d = new i(eVar);
        e eVar2 = new e(n.INSENSITIVE);
        f336449e = eVar2;
        f336450f = new i(eVar2);
        e eVar3 = new e(n.SYSTEM);
        f336451g = eVar3;
        f336452h = new i(eVar3);
    }

    public e() {
        this.f336453a = n.SENSITIVE;
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
        return this.f336453a.b(l.m(file.getName()), l.m(file2.getName()));
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f336453a + "]";
    }

    public e(n nVar) {
        this.f336453a = nVar == null ? n.SENSITIVE : nVar;
    }
}
