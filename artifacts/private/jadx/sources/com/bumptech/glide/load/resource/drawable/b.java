package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T extends Drawable> implements v<T>, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final T f97110a;

    public b(T t10) {
        this.f97110a = (T) k.d(t10);
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f97110a.getConstantState();
        return constantState == null ? this.f97110a : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t10 = this.f97110a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof com.bumptech.glide.load.resource.gif.c) {
            ((com.bumptech.glide.load.resource.gif.c) t10).g().prepareToDraw();
        }
    }
}
