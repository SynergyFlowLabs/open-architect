package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class y1 extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f258883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View[] f258884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable[] f258885c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f258886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f258887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f258888c;

        public a(Context context, @androidx.annotation.f1 int i10, @androidx.annotation.v int i11, View view) {
            this(androidx.core.content.d.l(context, i11), context.getString(i10), view);
        }

        public a(Context context, @androidx.annotation.f1 int i10, View view) {
            this(context.getString(i10), view);
        }

        public a(String str, View view) {
            this((Drawable) null, str, view);
        }

        public a(Drawable drawable, String str, View view) {
            this.f258886a = drawable;
            this.f258887b = str;
            this.f258888c = view;
        }
    }

    public interface b {
        void j();
    }

    public y1(List<a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public Drawable a(int i10) {
        Drawable[] drawableArr = this.f258885c;
        if (drawableArr == null) {
            return null;
        }
        return drawableArr[i10];
    }

    protected View b(int i10) {
        return this.f258884b[i10];
    }

    public void c(int i10) {
        KeyEvent.Callback callbackB = b(i10);
        if (callbackB instanceof b) {
            ((b) callbackB).j();
        }
    }

    protected void d(View[] viewArr, String[] strArr) {
        e(viewArr, strArr, null);
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        viewGroup.removeView(this.f258884b[i10]);
    }

    protected void e(View[] viewArr, String[] strArr, Drawable[] drawableArr) {
        this.f258884b = viewArr;
        this.f258883a = strArr;
        this.f258885c = drawableArr;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f258884b.length;
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i10) {
        return this.f258883a[i10];
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        viewGroup.addView(this.f258884b[i10]);
        return Integer.valueOf(i10);
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return this.f258884b[((Integer) obj).intValue()] == view;
    }

    public y1(a[] aVarArr) {
        this.f258883a = null;
        this.f258884b = null;
        this.f258885c = null;
        View[] viewArr = new View[aVarArr.length];
        String[] strArr = new String[aVarArr.length];
        Drawable[] drawableArr = new Drawable[aVarArr.length];
        int i10 = 5 & 0;
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar = aVarArr[i11];
            viewArr[i11] = aVar.f258888c;
            strArr[i11] = aVar.f258887b;
            drawableArr[i11] = aVar.f258886a;
        }
        e(viewArr, strArr, drawableArr);
    }

    public y1(View[] viewArr, String[] strArr) {
        this.f258883a = null;
        this.f258884b = null;
        this.f258885c = null;
        d(viewArr, strArr);
    }

    protected y1() {
        this.f258883a = null;
        this.f258884b = null;
        this.f258885c = null;
    }
}
