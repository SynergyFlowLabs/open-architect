package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f336513a = E(g(k(), C("CVS")));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n f336514b = E(g(k(), C(".svn")));

    public static n A(n nVar) {
        return nVar == null ? k.f336512b : new c(k.f336512b, nVar);
    }

    public static n B(n nVar) {
        return nVar == null ? f336514b : g(nVar, f336514b);
    }

    public static n C(String str) {
        return new p(str);
    }

    public static n D(String str, org.apache.commons.io.n nVar) {
        return new p(str, nVar);
    }

    public static n E(n nVar) {
        return new q(nVar);
    }

    public static n F(n... nVarArr) {
        return new r(O(nVarArr));
    }

    @Deprecated
    public static n G(n nVar, n nVar2) {
        return new r(nVar, nVar2);
    }

    public static n H(String str) {
        return new s(str);
    }

    public static n I(String str, org.apache.commons.io.n nVar) {
        return new s(str, nVar);
    }

    public static n J(long j10) {
        return new u(j10);
    }

    public static n K(long j10, boolean z10) {
        return new u(j10, z10);
    }

    public static n L(long j10, long j11) {
        int i10 = 6 >> 0;
        return new c(new u(j10, true), new u(j11 + 1, false));
    }

    public static n M(String str) {
        return new v(str);
    }

    public static n N(String str, org.apache.commons.io.n nVar) {
        return new v(str, nVar);
    }

    public static List<n> O(n... nVarArr) {
        if (nVarArr == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        ArrayList arrayList = new ArrayList(nVarArr.length);
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            n nVar = nVarArr[i10];
            if (nVar == null) {
                throw new IllegalArgumentException("The filter[" + i10 + "] is null");
            }
            arrayList.add(nVar);
        }
        return arrayList;
    }

    public static n P() {
        return w.f336540b;
    }

    public static n a(long j10) {
        return new b(j10);
    }

    public static n b(long j10, boolean z10) {
        return new b(j10, z10);
    }

    public static n c(File file) {
        return new b(file);
    }

    public static n d(File file, boolean z10) {
        return new b(file, z10);
    }

    public static n e(Date date) {
        return new b(date);
    }

    public static n f(Date date, boolean z10) {
        return new b(date, z10);
    }

    public static n g(n... nVarArr) {
        return new c(O(nVarArr));
    }

    @Deprecated
    public static n h(n nVar, n nVar2) {
        return new c(nVar, nVar2);
    }

    public static n i(FileFilter fileFilter) {
        return new g(fileFilter);
    }

    public static n j(FilenameFilter filenameFilter) {
        return new g(filenameFilter);
    }

    public static n k() {
        return h.f336503b;
    }

    public static n l() {
        return j.f336509b;
    }

    public static n m() {
        return k.f336512b;
    }

    private static <T extends Collection<File>> T n(n nVar, Iterable<File> iterable, T t10) {
        if (nVar == null) {
            throw new IllegalArgumentException("file filter is null");
        }
        if (iterable != null) {
            for (File file : iterable) {
                if (file == null) {
                    throw new IllegalArgumentException("file collection contains null");
                }
                if (nVar.accept(file)) {
                    t10.add(file);
                }
            }
        }
        return t10;
    }

    public static File[] o(n nVar, Iterable<File> iterable) {
        List<File> listQ = q(nVar, iterable);
        return (File[]) listQ.toArray(new File[listQ.size()]);
    }

    public static File[] p(n nVar, File... fileArr) {
        if (nVar == null) {
            throw new IllegalArgumentException("file filter is null");
        }
        if (fileArr == null) {
            return new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            if (file == null) {
                throw new IllegalArgumentException("file array contains null");
            }
            if (nVar.accept(file)) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    public static List<File> q(n nVar, Iterable<File> iterable) {
        return (List) n(nVar, iterable, new ArrayList());
    }

    public static List<File> r(n nVar, File... fileArr) {
        return Arrays.asList(p(nVar, fileArr));
    }

    public static Set<File> s(n nVar, Iterable<File> iterable) {
        return (Set) n(nVar, iterable, new HashSet());
    }

    public static Set<File> t(n nVar, File... fileArr) {
        return new HashSet(Arrays.asList(p(nVar, fileArr)));
    }

    public static n u(String str) {
        return new o(str);
    }

    public static n v(String str, long j10) {
        return new o(str, j10);
    }

    public static n w(byte[] bArr) {
        return new o(bArr);
    }

    public static n x(byte[] bArr, long j10) {
        return new o(bArr, j10);
    }

    public static n y(n nVar) {
        return nVar == null ? f336513a : g(nVar, f336513a);
    }

    public static n z(n nVar) {
        return nVar == null ? h.f336503b : new c(h.f336503b, nVar);
    }
}
