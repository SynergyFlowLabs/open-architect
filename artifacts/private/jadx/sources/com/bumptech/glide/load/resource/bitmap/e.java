package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class e implements com.bumptech.glide.load.m<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<Integer> f96968b = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<Bitmap.CompressFormat> f96969c = com.bumptech.glide.load.i.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96970d = "BitmapEncoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f96971a;

    public e(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f96971a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, com.bumptech.glide.load.j jVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) jVar.c(f96969c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.m
    @NonNull
    public com.bumptech.glide.load.c b(@NonNull com.bumptech.glide.load.j jVar) {
        return com.bumptech.glide.load.c.TRANSFORMED;
    }

    @Override // com.bumptech.glide.load.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull com.bumptech.glide.load.engine.v<Bitmap> vVar, @NonNull File file, @NonNull com.bumptech.glide.load.j jVar) {
        boolean z10;
        Bitmap bitmap = vVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, jVar);
        com.bumptech.glide.util.pool.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = com.bumptech.glide.util.g.b();
            int iIntValue = ((Integer) jVar.c(f96968b)).intValue();
            OutputStream cVar = null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    cVar = this.f96971a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f96971a) : fileOutputStream;
                    bitmap.compress(compressFormatD, iIntValue, cVar);
                    cVar.close();
                    try {
                        cVar.close();
                    } catch (IOException unused) {
                    }
                    z10 = true;
                } catch (IOException unused2) {
                    cVar = fileOutputStream;
                    if (cVar != null) {
                        try {
                            cVar.close();
                        } catch (IOException unused3) {
                        }
                    }
                    z10 = false;
                } catch (Throwable th2) {
                    th = th2;
                    cVar = fileOutputStream;
                    if (cVar != null) {
                        try {
                            cVar.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
            if (Log.isLoggable(f96970d, 2)) {
                Objects.toString(compressFormatD);
                com.bumptech.glide.util.m.h(bitmap);
                com.bumptech.glide.util.g.a(jB);
                Objects.toString(jVar.c(f96969c));
                bitmap.hasAlpha();
            }
            com.bumptech.glide.util.pool.b.e();
            return z10;
        } catch (Throwable th4) {
            com.bumptech.glide.util.pool.b.e();
            throw th4;
        }
    }

    @Deprecated
    public e() {
        this.f96971a = null;
    }
}
