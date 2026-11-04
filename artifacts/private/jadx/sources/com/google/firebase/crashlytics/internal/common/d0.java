package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f121014b;

    public d0(String str, com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f121013a = str;
        this.f121014b = gVar;
    }

    private File b() {
        return this.f121014b.h(this.f121013a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().e("Error creating marker: " + this.f121013a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
