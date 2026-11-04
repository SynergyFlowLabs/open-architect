package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
final class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameLayout f107031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ LayoutInflater f107032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewGroup f107033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f107034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f107035e;

    m(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f107031a = frameLayout;
        this.f107032b = layoutInflater;
        this.f107033c = viewGroup;
        this.f107034d = bundle;
        this.f107035e = aVar;
    }

    @Override // com.google.android.gms.dynamic.q
    public final void a(e eVar) {
        this.f107031a.removeAllViews();
        this.f107031a.addView(this.f107035e.f107015a.j(this.f107032b, this.f107033c, this.f107034d));
    }

    @Override // com.google.android.gms.dynamic.q
    public final int c() {
        return 2;
    }
}
