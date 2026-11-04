package org.commonmark.internal;

/* JADX INFO: loaded from: classes14.dex */
public class d extends org.commonmark.parser.block.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.commonmark.parser.block.d[] f337574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f337575b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f337576c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f337577d = false;

    public d(org.commonmark.parser.block.d... dVarArr) {
        this.f337574a = dVarArr;
    }

    @Override // org.commonmark.parser.block.f
    public org.commonmark.parser.block.f a(int i10) {
        this.f337576c = i10;
        return this;
    }

    @Override // org.commonmark.parser.block.f
    public org.commonmark.parser.block.f b(int i10) {
        this.f337575b = i10;
        return this;
    }

    @Override // org.commonmark.parser.block.f
    public org.commonmark.parser.block.f e() {
        this.f337577d = true;
        return this;
    }

    public org.commonmark.parser.block.d[] f() {
        return this.f337574a;
    }

    public int g() {
        return this.f337576c;
    }

    public int h() {
        return this.f337575b;
    }

    public boolean i() {
        return this.f337577d;
    }
}
