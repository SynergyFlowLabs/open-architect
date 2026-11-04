package com.google.firebase.crashlytics.internal.common;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class b extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.model.f0 f120974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f120976c;

    b(com.google.firebase.crashlytics.internal.model.f0 f0Var, String str, File file) {
        if (f0Var == null) {
            throw new NullPointerException("Null report");
        }
        this.f120974a = f0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f120975b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f120976c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.f0
    public com.google.firebase.crashlytics.internal.model.f0 b() {
        return this.f120974a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.f0
    public File c() {
        return this.f120976c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.f0
    public String d() {
        return this.f120975b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f120974a.equals(f0Var.b()) && this.f120975b.equals(f0Var.d()) && this.f120976c.equals(f0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f120976c.hashCode() ^ ((((this.f120974a.hashCode() ^ 1000003) * 1000003) ^ this.f120975b.hashCode()) * 1000003);
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f120974a + ", sessionId=" + this.f120975b + ", reportFile=" + this.f120976c + "}";
    }
}
