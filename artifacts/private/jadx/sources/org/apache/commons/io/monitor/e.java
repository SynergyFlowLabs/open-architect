package org.apache.commons.io.monitor;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f336727i = -2505664948818681153L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final e[] f336728j = new e[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f336729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e[] f336730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f336731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f336732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f336733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f336734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f336735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f336736h;

    public e(File file) {
        this(null, file);
    }

    public e[] a() {
        e[] eVarArr = this.f336730b;
        return eVarArr != null ? eVarArr : f336728j;
    }

    public File b() {
        return this.f336731c;
    }

    public long c() {
        return this.f336735g;
    }

    public long d() {
        return this.f336736h;
    }

    public int e() {
        e eVar = this.f336729a;
        if (eVar == null) {
            return 0;
        }
        return eVar.e() + 1;
    }

    public e f() {
        return this.f336729a;
    }

    public boolean g() {
        return this.f336734f;
    }

    public String getName() {
        return this.f336732d;
    }

    public boolean h() {
        return this.f336733e;
    }

    public e i(File file) {
        return new e(this, file);
    }

    public boolean j(File file) {
        boolean z10 = this.f336733e;
        long j10 = this.f336735g;
        boolean z11 = this.f336734f;
        long j11 = this.f336736h;
        this.f336732d = file.getName();
        boolean zExists = file.exists();
        this.f336733e = zExists;
        this.f336734f = zExists && file.isDirectory();
        long length = 0;
        this.f336735g = this.f336733e ? file.lastModified() : 0L;
        if (this.f336733e && !this.f336734f) {
            length = file.length();
        }
        this.f336736h = length;
        return (this.f336733e == z10 && this.f336735g == j10 && this.f336734f == z11 && length == j11) ? false : true;
    }

    public void k(e[] eVarArr) {
        this.f336730b = eVarArr;
    }

    public void l(boolean z10) {
        this.f336734f = z10;
    }

    public void m(boolean z10) {
        this.f336733e = z10;
    }

    public void n(long j10) {
        this.f336735g = j10;
    }

    public void o(long j10) {
        this.f336736h = j10;
    }

    public void p(String str) {
        this.f336732d = str;
    }

    public e(e eVar, File file) {
        if (file == null) {
            throw new IllegalArgumentException("File is missing");
        }
        this.f336731c = file;
        this.f336729a = eVar;
        this.f336732d = file.getName();
    }
}
