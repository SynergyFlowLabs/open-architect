package com.sun.jna;

/* JADX INFO: loaded from: classes13.dex */
public class NativeLong extends IntegerType {
    public static final int SIZE = Native.LONG_SIZE;
    private static final long serialVersionUID = 1;

    public NativeLong() {
        this(0L);
    }

    public NativeLong(long j10) {
        this(j10, false);
    }

    public NativeLong(long j10, boolean z10) {
        super(SIZE, j10, z10);
    }
}
