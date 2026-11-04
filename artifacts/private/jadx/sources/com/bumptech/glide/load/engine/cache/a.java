package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.a$a, reason: collision with other inner class name */
    public interface InterfaceC0855a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f96453a = 262144000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f96454b = "image_manager_disk_cache";

        @p0
        a build();
    }

    public interface b {
        boolean a(@NonNull File file);
    }

    void a(com.bumptech.glide.load.g gVar, b bVar);

    @p0
    File b(com.bumptech.glide.load.g gVar);

    void c(com.bumptech.glide.load.g gVar);

    void clear();
}
