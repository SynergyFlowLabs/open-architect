package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.s;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f102409a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102410b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102411c = -2;

    public static int[] c() {
        int[] iArrE = a.e();
        return Arrays.copyOf(iArrE, iArrE.length);
    }

    public abstract int[] a();

    public abstract s b(int i10);
}
