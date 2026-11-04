package com.android.volley.toolbox;

import androidx.annotation.p0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f89587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.android.volley.k> f89588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f89589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final InputStream f89590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final byte[] f89591e;

    public n(int i10, List<com.android.volley.k> list) {
        this(i10, list, -1, null);
    }

    @p0
    public final InputStream a() {
        InputStream inputStream = this.f89590d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f89591e != null) {
            return new ByteArrayInputStream(this.f89591e);
        }
        return null;
    }

    @p0
    public final byte[] b() {
        return this.f89591e;
    }

    public final int c() {
        return this.f89589c;
    }

    public final List<com.android.volley.k> d() {
        return Collections.unmodifiableList(this.f89588b);
    }

    public final int e() {
        return this.f89587a;
    }

    public n(int i10, List<com.android.volley.k> list, int i11, InputStream inputStream) {
        this.f89587a = i10;
        this.f89588b = list;
        this.f89589c = i11;
        this.f89590d = inputStream;
        this.f89591e = null;
    }

    public n(int i10, List<com.android.volley.k> list, byte[] bArr) {
        this.f89587a = i10;
        this.f89588b = list;
        this.f89589c = bArr.length;
        this.f89591e = bArr;
        this.f89590d = null;
    }
}
