package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.p0;
import com.airbnb.lottie.model.i;
import com.airbnb.lottie.utils.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AssetManager f88334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.c f88335e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<String> f88331a = new i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<i<String>, Typeface> f88332b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f88333c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f88336f = ".ttf";

    public a(Drawable.Callback callback, @p0 com.airbnb.lottie.c cVar) {
        this.f88335e = cVar;
        if (callback instanceof View) {
            this.f88334d = ((View) callback).getContext().getAssets();
        } else {
            d.e("LottieDrawable must be inside of a view for images to work.");
            this.f88334d = null;
        }
    }

    private Typeface a(com.airbnb.lottie.model.c cVar) {
        Typeface typefaceCreateFromAsset;
        String strB = cVar.b();
        Typeface typeface = this.f88333c.get(strB);
        if (typeface != null) {
            return typeface;
        }
        String strD = cVar.d();
        String strC = cVar.c();
        com.airbnb.lottie.c cVar2 = this.f88335e;
        if (cVar2 != null) {
            typefaceCreateFromAsset = cVar2.b(strB, strD, strC);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f88335e.a(strB);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        com.airbnb.lottie.c cVar3 = this.f88335e;
        if (cVar3 != null && typefaceCreateFromAsset == null) {
            String strD2 = cVar3.d(strB, strD, strC);
            if (strD2 == null) {
                strD2 = this.f88335e.c(strB);
            }
            if (strD2 != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f88334d, strD2);
            }
        }
        if (cVar.e() != null) {
            return cVar.e();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.f88334d, "fonts/" + strB + this.f88336f);
        }
        this.f88333c.put(strB, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface e(Typeface typeface, String str) {
        int i10;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(com.airbnb.lottie.model.c cVar) {
        this.f88331a.b(cVar.b(), cVar.d());
        Typeface typeface = this.f88332b.get(this.f88331a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.d());
        this.f88332b.put(this.f88331a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f88336f = str;
    }

    public void d(@p0 com.airbnb.lottie.c cVar) {
        this.f88335e = cVar;
    }
}
