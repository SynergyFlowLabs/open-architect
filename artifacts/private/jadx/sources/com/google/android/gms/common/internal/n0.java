package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
final class n0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f106611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fragment f106612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f106613c;

    n0(Intent intent, Fragment fragment, int i10) {
        this.f106611a = intent;
        this.f106612b = fragment;
        this.f106613c = i10;
    }

    @Override // com.google.android.gms.common.internal.p0
    public final void a() {
        Intent intent = this.f106611a;
        if (intent != null) {
            this.f106612b.startActivityForResult(intent, this.f106613c);
        }
    }
}
