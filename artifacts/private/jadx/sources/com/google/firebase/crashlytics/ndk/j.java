package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.internal.model.f0;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
class j implements com.google.firebase.crashlytics.internal.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f121971a;

    j(i iVar) {
        this.f121971a = iVar;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File a() {
        return this.f121971a.f121960f;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public f0.a b() {
        i.c cVar = this.f121971a.f121955a;
        if (cVar != null) {
            return cVar.f121970b;
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File c() {
        return this.f121971a.f121956b;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File d() {
        return this.f121971a.f121955a.f121969a;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File e() {
        return this.f121971a.f121959e;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File f() {
        return this.f121971a.f121961g;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File g() {
        return this.f121971a.f121958d;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File h() {
        return this.f121971a.f121957c;
    }
}
