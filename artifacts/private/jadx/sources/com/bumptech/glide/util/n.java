package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.request.target.o;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class n<T> implements com.bumptech.glide.e.b<T>, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f97492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f97493b;

    static final class a extends com.bumptech.glide.request.target.f<View, Object> {
        a(@NonNull View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.p
        public void i(@NonNull Object obj, @p0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.f
        protected void k(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void q(@p0 Drawable drawable) {
        }
    }

    public n() {
    }

    @Override // com.bumptech.glide.e.b
    @p0
    public int[] a(@NonNull T t10, int i10, int i11) {
        int[] iArr = this.f97492a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@NonNull View view) {
        if (this.f97492a == null && this.f97493b == null) {
            a aVar = new a(view);
            this.f97493b = aVar;
            aVar.s(this);
        }
    }

    @Override // com.bumptech.glide.request.target.o
    public void d(int i10, int i11) {
        this.f97492a = new int[]{i10, i11};
        this.f97493b = null;
    }

    public n(@NonNull View view) {
        a aVar = new a(view);
        this.f97493b = aVar;
        aVar.s(this);
    }
}
