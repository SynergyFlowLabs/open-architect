package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10504a;

    private a(Context context) {
        this.f10504a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f10504a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f10504a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f10504a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            return 5;
        }
        if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            return 4;
        }
        return i10 >= 360 ? 3 : 2;
    }

    public int e() {
        return this.f10504a.getResources().getDimensionPixelSize(i.a.e.f286096k);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f10504a.obtainStyledAttributes(null, i.a.m.f286477a, i.a.b.f285909f, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(i.a.m.f286601o, 0);
        Resources resources = this.f10504a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(i.a.e.f286094j));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f10504a.getResources().getBoolean(i.a.c.f286022a);
    }

    public boolean h() {
        return true;
    }
}
