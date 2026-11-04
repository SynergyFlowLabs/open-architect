package com.planner5d.library.uploadplan.interactor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements ke.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f230813a;

    @ij.a
    public p(@NotNull com.planner5d.library.application.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f230813a = context;
    }

    @Override // ke.f
    @Nullable
    public Bitmap a(@NotNull String fileName) throws IOException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(this.f230813a.getCacheDir(), fileName)));
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStream);
            kotlin.io.c.a(bufferedInputStream, null);
            return bitmapDecodeStream;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(bufferedInputStream, th2);
                throw th3;
            }
        }
    }
}
