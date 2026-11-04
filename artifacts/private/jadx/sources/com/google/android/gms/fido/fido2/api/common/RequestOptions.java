package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    @androidx.annotation.p0
    public abstract AuthenticationExtensions O1();

    @NonNull
    public abstract byte[] T1();

    @androidx.annotation.p0
    public abstract Integer b2();

    @androidx.annotation.p0
    public abstract Double e2();

    @androidx.annotation.p0
    public abstract TokenBinding f2();

    @NonNull
    public byte[] n2() {
        return i6.c.n(this);
    }
}
