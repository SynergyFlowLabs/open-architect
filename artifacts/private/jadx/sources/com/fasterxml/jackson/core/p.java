package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes4.dex */
public class p extends com.fasterxml.jackson.core.io.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f102683d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f102684e = com.fasterxml.jackson.core.io.b.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.fasterxml.jackson.core.io.m f102685f = new com.fasterxml.jackson.core.io.m("\\u2028");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.fasterxml.jackson.core.io.m f102686g = new com.fasterxml.jackson.core.io.m("\\u2029");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p f102687h = new p();

    public static p d() {
        return f102687h;
    }

    @Override // com.fasterxml.jackson.core.io.b
    public int[] a() {
        return f102684e;
    }

    @Override // com.fasterxml.jackson.core.io.b
    public s b(int i10) {
        if (i10 == 8232) {
            return f102685f;
        }
        if (i10 != 8233) {
            return null;
        }
        return f102686g;
    }
}
