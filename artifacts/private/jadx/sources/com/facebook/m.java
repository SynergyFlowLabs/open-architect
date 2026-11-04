package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class m extends BroadcastReceiver {
    protected void a(@NotNull String appCallId, @NotNull String action, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(extras, "extras");
    }

    protected void b(@NotNull String appCallId, @NotNull String action, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(extras, "extras");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra(com.facebook.internal.w0.J);
        String stringExtra2 = intent.getStringExtra(com.facebook.internal.w0.I);
        Bundle extras = intent.getExtras();
        if (stringExtra == null || stringExtra2 == null || extras == null) {
            return;
        }
        com.facebook.internal.w0 w0Var = com.facebook.internal.w0.f100148a;
        if (com.facebook.internal.w0.C(intent)) {
            a(stringExtra, stringExtra2, extras);
        } else {
            b(stringExtra, stringExtra2, extras);
        }
    }
}
