package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.n;

/* JADX INFO: loaded from: classes14.dex */
public class h extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336465b = 6527501707585768673L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f336466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator<File> f336467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<File> f336468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f336469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Comparator<File> f336470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<File> f336471h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f336472a;

    static {
        h hVar = new h();
        f336466c = hVar;
        f336467d = new i(hVar);
        h hVar2 = new h(n.INSENSITIVE);
        f336468e = hVar2;
        f336469f = new i(hVar2);
        h hVar3 = new h(n.SYSTEM);
        f336470g = hVar3;
        f336471h = new i(hVar3);
    }

    public h() {
        this.f336472a = n.SENSITIVE;
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
        return this.f336472a.b(file.getPath(), file2.getPath());
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f336472a + "]";
    }

    public h(n nVar) {
        this.f336472a = nVar == null ? n.SENSITIVE : nVar;
    }
}
