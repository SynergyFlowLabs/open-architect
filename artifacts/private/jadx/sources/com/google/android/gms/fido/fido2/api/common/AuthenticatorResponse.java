package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AuthenticatorResponse extends AbstractSafeParcelable {
    @NonNull
    public abstract byte[] O1();

    @NonNull
    public abstract byte[] T1();
}
