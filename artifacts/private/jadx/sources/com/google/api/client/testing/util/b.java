package com.google.api.client.testing.util;

import com.google.api.client.util.h0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class b implements com.google.api.client.util.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f116021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f116022e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f116023f;

    @Override // com.google.api.client.util.c
    public long a() throws IOException {
        int i10 = this.f116023f;
        if (i10 < this.f116022e) {
            long j10 = this.f116021d;
            if (j10 != -1) {
                this.f116023f = i10 + 1;
                return j10;
            }
        }
        return -1L;
    }

    public final int b() {
        return this.f116023f;
    }

    public final int c() {
        return this.f116023f;
    }

    public b d(long j10) {
        h0.a(j10 == -1 || j10 >= 0);
        this.f116021d = j10;
        return this;
    }

    public b e(int i10) {
        h0.a(i10 >= 0);
        this.f116022e = i10;
        return this;
    }

    @Override // com.google.api.client.util.c
    public void reset() throws IOException {
        this.f116023f = 0;
    }
}
