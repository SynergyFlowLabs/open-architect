package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes12.dex */
public class BackgroundImageView extends AppCompatImageView implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.d.C1663d f249421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.a f249422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f249423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView.ScaleType f249424d;

    class a extends com.planner5d.library.widget.bitmaptarget.c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Action1 f249425n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ImageView imageView, Action1 action1) {
            super(imageView);
            this.f249425n = action1;
        }

        private void p() {
            Action1 action1;
            if (BackgroundImageView.this.f249422b != this || (action1 = this.f249425n) == null) {
                return;
            }
            action1.call(null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void g(Throwable th2) {
            p();
        }

        @Override // com.planner5d.library.widget.bitmaptarget.d, com.planner5d.library.services.bitmaploader.target.a
        public void h(Bitmap bitmap) {
            BackgroundImageView.this.g();
            p();
            super.h(bitmap);
        }
    }

    public BackgroundImageView(Context context) {
        super(context);
        this.f249421a = null;
        this.f249422b = null;
        this.f249423c = null;
        this.f249424d = ImageView.ScaleType.FIT_CENTER;
        g();
    }

    @Override // com.planner5d.library.widget.d1
    public void a() {
        com.planner5d.library.services.bitmaploader.d.C1663d c1663d = this.f249421a;
        if (c1663d != null) {
            c1663d.a();
            this.f249421a = null;
        }
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f249423c;
        if (hVar != null) {
            hVar.d(this.f249422b);
        }
        this.f249422b = null;
        setImageBitmap(null);
    }

    public com.planner5d.library.services.bitmaploader.target.a e(@NonNull com.planner5d.library.services.bitmaploader.target.h hVar, Action1<Void> action1) {
        a();
        this.f249423c = hVar;
        super.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a aVar = new a(this, action1);
        this.f249422b = aVar;
        return hVar.c(aVar);
    }

    public BackgroundImageView f(com.planner5d.library.services.bitmaploader.d.C1663d c1663d) {
        this.f249421a = c1663d;
        return this;
    }

    public void g() {
        super.setScaleType(this.f249424d);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.f249424d = scaleType;
    }

    public BackgroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f249421a = null;
        this.f249422b = null;
        this.f249423c = null;
        this.f249424d = ImageView.ScaleType.FIT_CENTER;
        g();
    }

    public BackgroundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f249421a = null;
        this.f249422b = null;
        this.f249423c = null;
        this.f249424d = ImageView.ScaleType.FIT_CENTER;
        g();
    }
}
