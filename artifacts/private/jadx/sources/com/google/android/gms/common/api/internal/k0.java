package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class k0 extends com.google.android.gms.common.api.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f106109e = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public k0(String str) {
    }

    @Override // com.google.android.gms.common.api.l
    public final void A() {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final void B(@NonNull com.google.android.gms.common.api.l.b bVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final void C(@NonNull com.google.android.gms.common.api.l.c cVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final void E(@NonNull androidx.fragment.app.s sVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final void F(@NonNull com.google.android.gms.common.api.l.b bVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final void G(@NonNull com.google.android.gms.common.api.l.c cVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final ConnectionResult d() {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final ConnectionResult e(long j10, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final com.google.android.gms.common.api.p<Status> f() {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final void g() {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final void i() {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final void j(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    @NonNull
    public final ConnectionResult p(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean t(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean u() {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean v() {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean w(@NonNull com.google.android.gms.common.api.l.b bVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean x(@NonNull com.google.android.gms.common.api.l.c cVar) {
        throw new UnsupportedOperationException(this.f106109e);
    }
}
