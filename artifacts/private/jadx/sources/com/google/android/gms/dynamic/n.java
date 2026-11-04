package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
final class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f107036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f107037b;

    n(Context context, Intent intent) {
        this.f107036a = context;
        this.f107037b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f107036a.startActivity(this.f107037b);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
