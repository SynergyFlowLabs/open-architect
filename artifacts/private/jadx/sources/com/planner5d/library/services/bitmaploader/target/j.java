package com.planner5d.library.services.bitmaploader.target;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j extends com.planner5d.library.services.bitmaploader.target.a {

    class a extends BitmapShader {
        a(Bitmap bitmap, Shader.TileMode tileX, Shader.TileMode tileY) {
            super(bitmap, tileX, tileY);
        }

        protected void finalize() throws Throwable {
            j.this.dispose();
            super.finalize();
        }
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    public void h(final Bitmap bitmap) {
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        l(new a(bitmap, tileMode, tileMode), bitmap.getWidth(), bitmap.getHeight());
    }

    protected abstract void l(BitmapShader bitmapShader, int bitmapWidth, int bitmapHeight);
}
