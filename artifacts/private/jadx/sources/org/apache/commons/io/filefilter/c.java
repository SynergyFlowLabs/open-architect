package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class c extends a implements f, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336490b = 7215974688563965257L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<n> f336491a;

    public c() {
        this.f336491a = new ArrayList();
    }

    @Override // org.apache.commons.io.filefilter.f
    public void a(n nVar) {
        this.f336491a.add(nVar);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (this.f336491a.isEmpty()) {
            return false;
        }
        Iterator<n> it = this.f336491a.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.io.filefilter.f
    public boolean b(n nVar) {
        return this.f336491a.remove(nVar);
    }

    @Override // org.apache.commons.io.filefilter.f
    public void c(List<n> list) {
        this.f336491a.clear();
        this.f336491a.addAll(list);
    }

    @Override // org.apache.commons.io.filefilter.f
    public List<n> d() {
        return Collections.unmodifiableList(this.f336491a);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("(");
        if (this.f336491a != null) {
            for (int i10 = 0; i10 < this.f336491a.size(); i10++) {
                if (i10 > 0) {
                    sb2.append(",");
                }
                n nVar = this.f336491a.get(i10);
                sb2.append(nVar == null ? AbstractJsonLexerKt.NULL : nVar.toString());
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public c(List<n> list) {
        if (list == null) {
            this.f336491a = new ArrayList();
        } else {
            this.f336491a = new ArrayList(list);
        }
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (this.f336491a.isEmpty()) {
            return false;
        }
        Iterator<n> it = this.f336491a.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file, str)) {
                return false;
            }
        }
        return true;
    }

    public c(n nVar, n nVar2) {
        if (nVar != null && nVar2 != null) {
            this.f336491a = new ArrayList(2);
            a(nVar);
            a(nVar2);
            return;
        }
        throw new IllegalArgumentException("The filters must not be null");
    }
}
