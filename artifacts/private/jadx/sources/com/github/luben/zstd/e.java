package com.github.luben.zstd;

/* JADX INFO: loaded from: classes4.dex */
public enum e {
    CONTINUE(0),
    FLUSH(1),
    END(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103031a;

    e(int i10) {
        this.f103031a = i10;
    }

    int k() {
        return this.f103031a;
    }
}
