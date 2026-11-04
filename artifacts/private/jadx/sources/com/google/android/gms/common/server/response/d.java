package com.google.android.gms.common.server.response;

import androidx.annotation.p0;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class d implements j {
    d() {
    }

    @Override // com.google.android.gms.common.server.response.j
    @p0
    public final /* synthetic */ Object a(a aVar, BufferedReader bufferedReader) throws IOException, a.C0972a {
        return Float.valueOf(aVar.m(bufferedReader));
    }
}
