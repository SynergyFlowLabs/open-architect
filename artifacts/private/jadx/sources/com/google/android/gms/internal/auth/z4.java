package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public interface z4 extends com.google.android.gms.common.api.m {
    Task P(@NonNull AccountChangeEventsRequest accountChangeEventsRequest);

    Task Q(zzbw zzbwVar);

    Task V(@NonNull Account account, @NonNull String str, Bundle bundle);

    Task a(@NonNull String str);

    Task o(@NonNull Account account);
}
