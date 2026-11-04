package com.fasterxml.jackson.core.sym;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f102755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f102756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f102757h;

    g(String str, int i10, int i11, int i12, int i13, int i14, int[] iArr, int i15) {
        super(str, i10);
        this.f102752c = i11;
        this.f102753d = i12;
        this.f102754e = i13;
        this.f102755f = i14;
        this.f102757h = iArr;
        this.f102756g = i15;
    }

    private final boolean f(int[] iArr) {
        int i10 = this.f102756g - 4;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11 + 4] != this.f102757h[i11]) {
                return false;
            }
        }
        return true;
    }

    public static g g(String str, int i10, int[] iArr, int i11) {
        if (i11 >= 4) {
            return new g(str, i10, iArr[0], iArr[1], iArr[2], iArr[3], i11 + (-4) > 0 ? Arrays.copyOfRange(iArr, 4, i11) : null, i11);
        }
        throw new IllegalArgumentException();
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
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.f
    public boolean d(int[] iArr, int i10) {
        if (i10 == this.f102756g && iArr[0] == this.f102752c && iArr[1] == this.f102753d && iArr[2] == this.f102754e && iArr[3] == this.f102755f) {
            switch (i10) {
                case 8:
                    if (iArr[7] != this.f102757h[3]) {
                        return false;
                    }
                case 7:
                    if (iArr[6] != this.f102757h[2]) {
                        return false;
                    }
                case 6:
                    if (iArr[5] != this.f102757h[1]) {
                        return false;
                    }
                case 5:
                    if (iArr[4] != this.f102757h[0]) {
                        return false;
                    }
                case 4:
                    return true;
                default:
                    return f(iArr);
            }
        }
        return false;
    }
}
