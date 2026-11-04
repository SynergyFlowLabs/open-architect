package com.planner5d.library.services.utility;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o0 f225339a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f225340b = "yyyyMMdd_HHmmss";

    private o0() {
    }

    @androidx.annotation.m1
    @NotNull
    public final Uri a(@NotNull Context context) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = "JPEG_" + new SimpleDateFormat(f225340b).format(new Date());
        String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
        Intrinsics.checkNotNullExpressionValue(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
        return c(context, b(context, DIRECTORY_PICTURES, str, ".jpg"));
    }

    @NotNull
    public final File b(@NotNull Context context, @NotNull String type, @NotNull String prefix, @NotNull String suffix) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        File externalFilesDir = context.getExternalFilesDir(type);
        if ((externalFilesDir == null || !externalFilesDir.exists()) && externalFilesDir != null) {
            externalFilesDir.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(prefix, suffix, externalFilesDir);
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    @NotNull
    public final Uri c(@NotNull Context context, @NotNull File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriForFile = FileProvider.getUriForFile(context, context.getString(o2.q.f227991hb), file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }
}
