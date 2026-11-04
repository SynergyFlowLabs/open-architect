package com.planner5d.library.interactor;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements le.m {
    @ij.a
    public j0() {
    }

    private final void b(File file, Bitmap bitmap) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(bufferedOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(bufferedOutputStream, th2);
                throw th3;
            }
        }
    }

    @Override // le.m
    @Nullable
    public Uri a(@NotNull Context context, @Nullable Bitmap bitmap, @NotNull String name) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        if (bitmap == null) {
            return null;
        }
        com.planner5d.library.services.utility.o0 o0Var = com.planner5d.library.services.utility.o0.f225339a;
        String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
        Intrinsics.checkNotNullExpressionValue(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
        File fileB = o0Var.b(context, DIRECTORY_PICTURES, name, ".png");
        b(fileB, bitmap);
        return o0Var.c(context, fileB);
    }
}
