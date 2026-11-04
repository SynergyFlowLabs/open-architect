package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class c implements com.bumptech.glide.load.d<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f96816a = "ByteBufferEncoder";

    @Override // com.bumptech.glide.load.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull com.bumptech.glide.load.j jVar) throws Throwable {
        try {
            com.bumptech.glide.util.a.e(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
