package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class t implements com.bumptech.glide.load.d<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f96925b = "StreamEncoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f96926a;

    public t(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f96926a = bVar;
    }

    @Override // com.bumptech.glide.load.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull InputStream inputStream, @NonNull File file, @NonNull com.bumptech.glide.load.j jVar) throws Throwable {
        byte[] bArr = (byte[]) this.f96926a.a(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i10);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f96926a.put(bArr);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    this.f96926a.put(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            this.f96926a.put(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
