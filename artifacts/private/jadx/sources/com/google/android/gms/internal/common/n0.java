package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
final class n0 extends p0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ h0 f107982h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(b bVar, CharSequence charSequence, h0 h0Var) {
        super(bVar, charSequence);
        this.f107982h = h0Var;
    }

    @Override // com.google.android.gms.internal.common.p0
    final int c(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.common.p0
    final int d(int i10) {
        CharSequence charSequence = this.f107988c;
        int length = charSequence.length();
        l0.b(i10, length, FirebaseAnalytics.d.f120644b0);
        while (i10 < length) {
            if (this.f107982h.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
