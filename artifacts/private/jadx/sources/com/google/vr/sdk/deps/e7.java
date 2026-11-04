package com.google.vr.sdk.deps;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f129360a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f129361b = new float[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f129362c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f129363d = new byte[0];

    public static final int a(t6 t6Var, int i10) throws IOException {
        int iT = t6Var.t();
        t6Var.i(i10);
        int i11 = 1;
        while (t6Var.a() == i10) {
            t6Var.i(i10);
            i11++;
        }
        t6Var.h(iT, i10);
        return i11;
    }
}
