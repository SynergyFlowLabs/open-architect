package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102749e;

    e(String str, int i10, int i11, int i12, int i13) {
        super(str, i10);
        this.f102747c = i11;
        this.f102748d = i12;
        this.f102749e = i13;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean a(int i10) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean b(int i10, int i11) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean c(int i10, int i11, int i12) {
        return this.f102747c == i10 && this.f102748d == i11 && this.f102749e == i12;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean d(int[] iArr, int i10) {
        return i10 == 3 && iArr[0] == this.f102747c && iArr[1] == this.f102748d && iArr[2] == this.f102749e;
    }
}
