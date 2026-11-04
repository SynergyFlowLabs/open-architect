package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.l1;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.util.m;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f96710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f96711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.b f96712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f96713d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f96714e;

    public b(j jVar, e eVar, com.bumptech.glide.load.b bVar) {
        this.f96710a = jVar;
        this.f96711b = eVar;
        this.f96712c = bVar;
    }

    private static int b(d dVar) {
        return m.g(dVar.d(), dVar.b(), dVar.a());
    }

    @l1
    c a(d... dVarArr) {
        long jA = (this.f96710a.a() - this.f96710a.e()) + this.f96711b.a();
        int iC = 0;
        for (d dVar : dVarArr) {
            iC += dVar.c();
        }
        float f10 = jA / iC;
        HashMap map = new HashMap();
        for (d dVar2 : dVarArr) {
            map.put(dVar2, Integer.valueOf(Math.round(dVar2.c() * f10) / b(dVar2)));
        }
        return new c(map);
    }

    public void c(d.a... aVarArr) {
        a aVar = this.f96714e;
        if (aVar != null) {
            aVar.b();
        }
        d[] dVarArr = new d[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            d.a aVar2 = aVarArr[i10];
            if (aVar2.b() == null) {
                aVar2.c(this.f96712c == com.bumptech.glide.load.b.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            dVarArr[i10] = aVar2.a();
        }
        a aVar3 = new a(this.f96711b, this.f96710a, a(dVarArr));
        this.f96714e = aVar3;
        this.f96713d.post(aVar3);
    }
}
