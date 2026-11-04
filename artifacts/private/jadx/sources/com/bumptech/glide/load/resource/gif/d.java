package com.bumptech.glide.load.resource.gif;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.m;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d implements m<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97145a = "GifEncoder";

    @Override // com.bumptech.glide.load.m
    @NonNull
    public com.bumptech.glide.load.c b(@NonNull com.bumptech.glide.load.j jVar) {
        return com.bumptech.glide.load.c.SOURCE;
    }

    @Override // com.bumptech.glide.load.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull v<c> vVar, @NonNull File file, @NonNull com.bumptech.glide.load.j jVar) throws Throwable {
        try {
            com.bumptech.glide.util.a.e(vVar.get().e(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
