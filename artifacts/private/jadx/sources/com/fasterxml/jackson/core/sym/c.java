package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f102743d = new c("", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102744c;

    c(String str, int i10, int i11) {
        super(str, i10);
        this.f102744c = i11;
    }

    public static c f() {
        return f102743d;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean a(int i10) {
        return i10 == this.f102744c;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean b(int i10, int i11) {
        return i10 == this.f102744c && i11 == 0;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean c(int i10, int i11, int i12) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean d(int[] iArr, int i10) {
        return i10 == 1 && iArr[0] == this.f102744c;
    }
}
