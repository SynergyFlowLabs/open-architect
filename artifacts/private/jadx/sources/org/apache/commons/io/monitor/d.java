package org.apache.commons.io.monitor;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.io.comparator.g;
import org.apache.commons.io.k;
import org.apache.commons.io.n;

/* JADX INFO: loaded from: classes14.dex */
public class d implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336722e = 1185122225658782848L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f336723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f336724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FileFilter f336725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator<File> f336726d;

    public d(String str) {
        this(new File(str));
    }

    private void c(e eVar, e[] eVarArr, File[] fileArr) {
        e[] eVarArr2 = fileArr.length > 0 ? new e[fileArr.length] : e.f336728j;
        int i10 = 0;
        for (e eVar2 : eVarArr) {
            while (i10 < fileArr.length && this.f336726d.compare(eVar2.b(), fileArr[i10]) > 0) {
                e eVarD = d(eVar, fileArr[i10]);
                eVarArr2[i10] = eVarD;
                f(eVarD);
                i10++;
            }
            if (i10 >= fileArr.length || this.f336726d.compare(eVar2.b(), fileArr[i10]) != 0) {
                c(eVar2, eVar2.a(), k.f336705p);
                g(eVar2);
            } else {
                i(eVar2, fileArr[i10]);
                c(eVar2, eVar2.a(), n(fileArr[i10]));
                eVarArr2[i10] = eVar2;
                i10++;
            }
        }
        while (i10 < fileArr.length) {
            e eVarD2 = d(eVar, fileArr[i10]);
            eVarArr2[i10] = eVarD2;
            f(eVarD2);
            i10++;
        }
        eVar.k(eVarArr2);
    }

    private e d(e eVar, File file) {
        e eVarI = eVar.i(file);
        eVarI.j(file);
        eVarI.k(h(file, eVarI));
        return eVarI;
    }

    private void f(e eVar) {
        for (a aVar : this.f336723a) {
            if (eVar.g()) {
                aVar.c(eVar.b());
            } else {
                aVar.a(eVar.b());
            }
        }
        for (e eVar2 : eVar.a()) {
            f(eVar2);
        }
    }

    private void g(e eVar) {
        for (a aVar : this.f336723a) {
            if (eVar.g()) {
                aVar.g(eVar.b());
            } else {
                aVar.e(eVar.b());
            }
        }
    }

    private e[] h(File file, e eVar) {
        File[] fileArrN = n(file);
        e[] eVarArr = fileArrN.length > 0 ? new e[fileArrN.length] : e.f336728j;
        for (int i10 = 0; i10 < fileArrN.length; i10++) {
            eVarArr[i10] = d(eVar, fileArrN[i10]);
        }
        return eVarArr;
    }

    private void i(e eVar, File file) {
        if (eVar.j(file)) {
            for (a aVar : this.f336723a) {
                if (eVar.g()) {
                    aVar.b(file);
                } else {
                    aVar.f(file);
                }
            }
        }
    }

    private File[] n(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory()) {
            FileFilter fileFilter = this.f336725c;
            fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        } else {
            fileArrListFiles = null;
        }
        if (fileArrListFiles == null) {
            fileArrListFiles = k.f336705p;
        }
        Comparator<File> comparator = this.f336726d;
        if (comparator != null && fileArrListFiles.length > 1) {
            Arrays.sort(fileArrListFiles, comparator);
        }
        return fileArrListFiles;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f336723a.add(aVar);
        }
    }

    public void b() {
        Iterator<a> it = this.f336723a.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        File fileB = this.f336724b.b();
        if (fileB.exists()) {
            e eVar = this.f336724b;
            c(eVar, eVar.a(), n(fileB));
        } else if (this.f336724b.h()) {
            e eVar2 = this.f336724b;
            c(eVar2, eVar2.a(), k.f336705p);
        }
        Iterator<a> it2 = this.f336723a.iterator();
        while (it2.hasNext()) {
            it2.next().h(this);
        }
    }

    public void e() throws Exception {
    }

    public File j() {
        return this.f336724b.b();
    }

    public FileFilter k() {
        return this.f336725c;
    }

    public Iterable<a> l() {
        return this.f336723a;
    }

    public void m() throws Exception {
        e eVar = this.f336724b;
        eVar.j(eVar.b());
        this.f336724b.k(h(this.f336724b.b(), this.f336724b));
    }

    public void o(a aVar) {
        if (aVar != null) {
            while (this.f336723a.remove(aVar)) {
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[file='");
        sb2.append(j().getPath());
        sb2.append('\'');
        if (this.f336725c != null) {
            sb2.append(", ");
            sb2.append(this.f336725c.toString());
        }
        sb2.append(", listeners=");
        sb2.append(this.f336723a.size());
        sb2.append("]");
        return sb2.toString();
    }

    public d(String str, FileFilter fileFilter) {
        this(new File(str), fileFilter);
    }

    public d(String str, FileFilter fileFilter, n nVar) {
        this(new File(str), fileFilter, nVar);
    }

    public d(File file) {
        this(file, (FileFilter) null);
    }

    public d(File file, FileFilter fileFilter) {
        this(file, fileFilter, (n) null);
    }

    public d(File file, FileFilter fileFilter, n nVar) {
        this(new e(file), fileFilter, nVar);
    }

    protected d(e eVar, FileFilter fileFilter, n nVar) {
        this.f336723a = new CopyOnWriteArrayList();
        if (eVar != null) {
            if (eVar.b() != null) {
                this.f336724b = eVar;
                this.f336725c = fileFilter;
                if (nVar == null || nVar.equals(n.SYSTEM)) {
                    this.f336726d = g.f336462g;
                    return;
                } else if (nVar.equals(n.INSENSITIVE)) {
                    this.f336726d = g.f336460e;
                    return;
                } else {
                    this.f336726d = g.f336458c;
                    return;
                }
            }
            throw new IllegalArgumentException("Root directory is missing");
        }
        throw new IllegalArgumentException("Root entry is missing");
    }
}
