package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@KeepName
public class UserRecoverableAuthException extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Intent f105068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final PendingIntent f105069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f105070c;

    public UserRecoverableAuthException(@p0 String str, @p0 Intent intent) {
        this(str, intent, null, t.LEGACY);
    }

    @NonNull
    public static UserRecoverableAuthException b(@p0 String str, @NonNull Intent intent, @NonNull PendingIntent pendingIntent) {
        w.r(intent);
        w.r(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, t.AUTH_INSTANTIATION);
    }

    @p0
    public Intent a() {
        Intent intent = this.f105068a;
        if (intent != null) {
            return new Intent(intent);
        }
        this.f105070c.ordinal();
        return null;
    }

    private UserRecoverableAuthException(@p0 String str, @p0 Intent intent, @p0 PendingIntent pendingIntent, t tVar) {
        super(str);
        this.f105069b = pendingIntent;
        this.f105068a = intent;
        this.f105070c = (t) w.r(tVar);
    }
}
