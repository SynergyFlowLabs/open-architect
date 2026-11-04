package com.planner5d.library.services.bitmaploader.background.postprocess;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;

/* JADX INFO: loaded from: classes10.dex */
public class b extends a {
    public b(Bundle bundle) {
        super(bundle);
    }

    @Override // com.planner5d.library.services.bitmaploader.background.postprocess.a
    public Bitmap b(Context context, Bitmap bitmap) {
        j jVar = this.f224095a;
        r rVar = r.width;
        if (jVar.c(rVar, 0) <= 0) {
            return null;
        }
        j jVar2 = this.f224095a;
        r rVar2 = r.height;
        if (jVar2.c(rVar2, 0) <= 0) {
            return null;
        }
        return td.a.f380845a.a(context, this.f224095a.c(rVar, 0), this.f224095a.c(rVar2, 0), bitmap);
    }

    public b(int width, int height) {
        super(new i().f(r.width, width).f(r.height, height).a());
    }
}
