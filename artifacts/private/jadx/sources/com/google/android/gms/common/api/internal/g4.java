package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f106035a = Collections.synchronizedMap(new androidx.collection.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106036b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private Bundle f106037c;

    g4() {
        int i10 = 6 & 0;
    }

    @androidx.annotation.p0
    final m c(String str, Class cls) {
        return (m) cls.cast(this.f106035a.get(str));
    }

    final void d(String str, m mVar) {
        if (!this.f106035a.containsKey(str)) {
            this.f106035a.put(str, mVar);
            if (this.f106036b > 0) {
                new com.google.android.gms.internal.common.x(Looper.getMainLooper()).post(new f4(this, mVar, str));
            }
        } else {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
    }

    final void e(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        Iterator it = this.f106035a.values().iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void f(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        Iterator it = this.f106035a.values().iterator();
        while (it.hasNext()) {
            ((m) it.next()).f(i10, i11, intent);
        }
    }

    final void g(@androidx.annotation.p0 Bundle bundle) {
        this.f106036b = 1;
        this.f106037c = bundle;
        for (Map.Entry entry : this.f106035a.entrySet()) {
            ((m) entry.getValue()).g(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void h() {
        this.f106036b = 5;
        Iterator it = this.f106035a.values().iterator();
        while (it.hasNext()) {
            ((m) it.next()).h();
        }
    }

    final void i() {
        this.f106036b = 3;
        Iterator it = this.f106035a.values().iterator();
        while (it.hasNext()) {
            ((m) it.next()).i();
        }
    }

    final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f106035a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((m) entry.getValue()).j(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void k() {
        this.f106036b = 2;
        Iterator it = this.f106035a.values().iterator();
        while (it.hasNext()) {
            ((m) it.next()).k();
        }
    }

    final void l() {
        this.f106036b = 4;
        Iterator it = this.f106035a.values().iterator();
        while (it.hasNext()) {
            ((m) it.next()).l();
        }
    }

    final boolean m() {
        return this.f106036b > 0;
    }

    final boolean n() {
        return this.f106036b >= 2;
    }
}
