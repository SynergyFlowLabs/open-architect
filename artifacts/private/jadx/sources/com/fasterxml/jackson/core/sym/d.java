package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102746d;

    d(String str, int i10, int i11, int i12) {
        super(str, i10);
        this.f102745c = i11;
        this.f102746d = i12;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean a(int i10) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean b(int i10, int i11) {
        return i10 == this.f102745c && i11 == this.f102746d;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean c(int i10, int i11, int i12) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean d(int[] iArr, int i10) {
        return i10 == 2 && iArr[0] == this.f102745c && iArr[1] == this.f102746d;
    }
}
