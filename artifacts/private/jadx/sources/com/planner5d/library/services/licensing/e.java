package com.planner5d.library.services.licensing;

import androidx.annotation.m1;
import com.google.android.vending.licensing.p;

/* JADX INFO: loaded from: classes10.dex */
public class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f224425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.model.manager.payments.a f224426b;

    public e(com.planner5d.library.model.manager.payments.p pVar, String str) {
        this.f224425a = str;
        this.f224426b = new com.planner5d.library.model.manager.payments.a(pVar);
    }

    @Override // com.google.android.vending.licensing.p
    @m1
    public boolean a(String str, String str2) throws Throwable {
        return this.f224426b.b(str, str2, this.f224425a);
    }
}
