package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.i;
import com.google.android.datatransport.runtime.backends.n;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class CctBackendFactory implements com.google.android.datatransport.runtime.backends.d {
    @Override // com.google.android.datatransport.runtime.backends.d
    public n create(i iVar) {
        return new d(iVar.c(), iVar.f(), iVar.e());
    }
}
