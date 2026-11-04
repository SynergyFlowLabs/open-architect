package com.planner5d.library.model.manager;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class y0 implements x1, com.planner5d.library.services.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static y0 f222398e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.d f222399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fg.e<w0> f222400d;

    @ij.a
    public y0(com.planner5d.library.services.bitmaploader.d dVar, fg.e<w0> eVar) {
        this.f222399c = dVar;
        this.f222400d = eVar;
        f222398e = this;
    }

    public static y0 n() {
        return f222398e;
    }

    @Override // com.planner5d.library.services.q
    public com.planner5d.library.services.bitmaploader.d.C1663d a(int i10, String str, int i11, int i12, com.planner5d.library.services.bitmaploader.target.a aVar, long j10, com.planner5d.library.services.bitmaploader.background.postprocess.a aVar2) {
        return this.f222399c.q(i10, str, i11, i12, aVar, j10, aVar2);
    }

    @Override // com.planner5d.library.services.q
    @NonNull
    public com.planner5d.library.services.bitmaploader.d.C1663d b(String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return l(str, i10, i11, aVar, j10, null);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d c(com.planner5d.library.services.download.g[] gVarArr, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return this.f222399c.r(10, gVarArr, i10, i11, aVar, j10, null);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d d(String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return a(2, str, i10, i11, aVar, j10, null);
    }

    public void f(String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        this.f222400d.get().d(str, i10, i11, aVar, j10);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d h(String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return a(1, str, i10, i11, aVar, j10, null);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d i(String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return a(7, str, i10, i11, aVar, j10, null);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d j(@NonNull Context context, @androidx.annotation.v int i10, int i11, int i12, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return a(5, new Uri.Builder().scheme("android.resource").authority(context.getPackageName()).path(String.valueOf(i10)).toString(), i11, i12, aVar, j10, null);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d k(String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return a(4, str, i10, i11, aVar, j10, null);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d l(String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10, com.planner5d.library.services.bitmaploader.background.postprocess.a aVar2) {
        return a(0, str, i10, i11, aVar, j10, aVar2);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d m(com.planner5d.library.services.download.g[] gVarArr, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return this.f222399c.r(0, gVarArr, i10, i11, aVar, j10, null);
    }

    @androidx.annotation.m1
    public boolean o(@androidx.annotation.p0 com.planner5d.library.services.download.g[] gVarArr, @androidx.annotation.p0 String str) {
        if (gVarArr == null) {
            return false;
        }
        for (com.planner5d.library.services.download.g gVar : gVarArr) {
            try {
                if (this.f222399c.n(new URL(gVar.b()), str)) {
                    return true;
                }
            } catch (MalformedURLException unused) {
            }
        }
        return false;
    }
}
