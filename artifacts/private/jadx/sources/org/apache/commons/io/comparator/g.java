package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.n;

/* JADX INFO: loaded from: classes14.dex */
public class g extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336457b = 8397947749814525798L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f336458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator<File> f336459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<File> f336460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f336461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Comparator<File> f336462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<File> f336463h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f336464a;

    static {
        g gVar = new g();
        f336458c = gVar;
        f336459d = new i(gVar);
        g gVar2 = new g(n.INSENSITIVE);
        f336460e = gVar2;
        f336461f = new i(gVar2);
        g gVar3 = new g(n.SYSTEM);
        f336462g = gVar3;
        f336463h = new i(gVar3);
    }

    public g() {
        this.f336464a = n.SENSITIVE;
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
        return this.f336464a.b(file.getName(), file2.getName());
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f336464a + "]";
    }

    public g(n nVar) {
        this.f336464a = nVar == null ? n.SENSITIVE : nVar;
    }
}
