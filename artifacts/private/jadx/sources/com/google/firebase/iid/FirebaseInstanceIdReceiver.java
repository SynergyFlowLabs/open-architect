package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.a;
import com.google.android.gms.tasks.n;
import com.google.firebase.messaging.n0;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseInstanceIdReceiver extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f122112c = "FirebaseMessaging";

    private static Intent f(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.a
    @m1
    protected int b(@NonNull Context context, @NonNull CloudMessage cloudMessage) {
        try {
            return ((Integer) n.a(new com.google.firebase.messaging.n(context).g(cloudMessage.e2()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.a
    @m1
    protected void c(@NonNull Context context, @NonNull Bundle bundle) {
        Intent intentF = f(context, a.C0963a.f105751b, bundle);
        if (n0.E(intentF)) {
            n0.v(intentF);
        }
    }
}
