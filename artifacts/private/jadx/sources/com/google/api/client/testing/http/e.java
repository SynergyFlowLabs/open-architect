package com.google.api.client.testing.http;

import com.google.api.client.http.c0;
import com.google.api.client.http.u;
import com.google.api.client.http.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class e implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f115988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f115989b;

    public e(boolean z10) {
        this.f115989b = z10;
    }

    public boolean a() {
        return this.f115988a;
    }

    @Override // com.google.api.client.http.c0
    public boolean c(u uVar, x xVar, boolean z10) throws IOException {
        this.f115988a = true;
        return this.f115989b;
    }
}
