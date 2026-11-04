package com.bumptech.glide.load.resource.gif;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j implements l<InputStream, c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f97176d = "StreamGifDecoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f97177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<ByteBuffer, c> f97178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f97179c;

    public j(List<ImageHeaderParser> list, l<ByteBuffer, c> lVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f97177a = list;
        this.f97178b = lVar;
        this.f97179c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<c> b(@NonNull InputStream inputStream, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f97178b.b(ByteBuffer.wrap(bArrE), i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        return !((Boolean) jVar.c(i.f97175b)).booleanValue() && com.bumptech.glide.load.f.e(this.f97177a, inputStream, this.f97179c) == ImageHeaderParser.ImageType.GIF;
    }
}
