package com.google.android.gms.internal.auth;

import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    @androidx.annotation.p0
    public final byte[] X() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
