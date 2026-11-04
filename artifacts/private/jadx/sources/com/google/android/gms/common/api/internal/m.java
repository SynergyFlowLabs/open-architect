package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @g6.a
    protected final n f106121a;

    @g6.a
    protected m(@NonNull n nVar) {
        this.f106121a = nVar;
    }

    @NonNull
    @g6.a
    public static n c(@NonNull Activity activity) {
        return e(new l(activity));
    }

    @NonNull
    @g6.a
    public static n d(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @g6.a
    protected static n e(@NonNull l lVar) {
        if (lVar.d()) {
            return h4.t(lVar.b());
        }
        if (lVar.c()) {
            return e4.c(lVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @androidx.annotation.l0
    @g6.a
    public void a(@NonNull String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
    }

    @NonNull
    @g6.a
    public Activity b() {
        Activity activityF = this.f106121a.f();
        com.google.android.gms.common.internal.w.r(activityF);
        return activityF;
    }

    @androidx.annotation.l0
    @g6.a
    public void f(int i10, int i11, @androidx.annotation.p0 Intent intent) {
    }

    @androidx.annotation.l0
    @g6.a
    public void g(@androidx.annotation.p0 Bundle bundle) {
    }

    @androidx.annotation.l0
    @g6.a
    public void h() {
    }

    @androidx.annotation.l0
    @g6.a
    public void i() {
    }

    @androidx.annotation.l0
    @g6.a
    public void j(@NonNull Bundle bundle) {
    }

    @androidx.annotation.l0
    @g6.a
    public void k() {
    }

    @androidx.annotation.l0
    @g6.a
    public void l() {
    }
}
