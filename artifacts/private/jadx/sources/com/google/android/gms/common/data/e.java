package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements d, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f106382a = new HashSet();

    @Override // com.google.android.gms.common.data.d
    public void a(int i10, int i11) {
        Iterator it = this.f106382a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(i10, i11);
        }
    }

    @Override // com.google.android.gms.common.data.d.a
    public void b(@NonNull d dVar) {
        this.f106382a.remove(dVar);
    }

    @Override // com.google.android.gms.common.data.d
    public void c(int i10, int i11) {
        Iterator it = this.f106382a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).c(i10, i11);
        }
    }

    @Override // com.google.android.gms.common.data.d
    public void d(int i10, int i11) {
        Iterator it = this.f106382a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).d(i10, i11);
        }
    }

    @Override // com.google.android.gms.common.data.d.a
    public void e(@NonNull d dVar) {
        this.f106382a.add(dVar);
    }

    @Override // com.google.android.gms.common.data.d
    public void f(int i10, int i11, int i12) {
        Iterator it = this.f106382a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).f(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.common.data.d
    public void g() {
        Iterator it = this.f106382a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).g();
        }
    }

    public void h() {
        this.f106382a.clear();
    }

    public boolean i() {
        return !this.f106382a.isEmpty();
    }
}
