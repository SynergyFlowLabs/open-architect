package com.google.android.gms.auth.account;

import android.accounts.Account;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b {

    @Deprecated
    public interface a extends v {
        @NonNull
        Account r();
    }

    @Deprecated
    void a(@NonNull l lVar, boolean z10);

    @NonNull
    @Deprecated
    p<a> b(@NonNull l lVar, @NonNull String str);

    @NonNull
    @Deprecated
    p<v> c(@NonNull l lVar, boolean z10);

    @NonNull
    @Deprecated
    p<v> d(@NonNull l lVar, @NonNull Account account);
}
