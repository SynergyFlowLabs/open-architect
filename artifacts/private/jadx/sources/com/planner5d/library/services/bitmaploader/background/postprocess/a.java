package com.planner5d.library.services.bitmaploader.background.postprocess;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.planner5d.library.services.utility.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j f224095a;

    public a(Bundle bundle) {
        this.f224095a = new j(bundle);
    }

    public Bundle a() {
        return new Bundle(this.f224095a.e());
    }

    public abstract Bitmap b(Context context, Bitmap bitmap);
}
