package com.planner5d.library.services;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.core.content.FileProvider;
import com.planner5d.library.services.utility.o2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f229891a;

    @ij.a
    public z(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f229891a = application;
    }

    @NotNull
    public final File a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new File(this.f229891a.getFilesDir(), name);
    }

    @NotNull
    public final File b() {
        File filesDir = this.f229891a.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        return filesDir;
    }

    @NotNull
    public final FileInputStream c(@NotNull String name) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(name, "name");
        FileInputStream fileInputStreamOpenFileInput = this.f229891a.openFileInput(name);
        Intrinsics.checkNotNullExpressionValue(fileInputStreamOpenFileInput, "openFileInput(...)");
        return fileInputStreamOpenFileInput;
    }

    @NotNull
    public final FileOutputStream d(@NotNull String name) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(name, "name");
        FileOutputStream fileOutputStreamOpenFileOutput = this.f229891a.openFileOutput(name, 0);
        Intrinsics.checkNotNullExpressionValue(fileOutputStreamOpenFileOutput, "openFileOutput(...)");
        return fileOutputStreamOpenFileOutput;
    }

    @m1
    @NotNull
    public final Uri e(@NotNull Activity activity, @NotNull String filename, @NotNull Bitmap bitmap) throws IOException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        File file = new File(activity.getExternalCacheDir(), "external_cache");
        file.mkdirs();
        File file2 = new File(file, filename + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(fileOutputStream, null);
            String string = activity.getBaseContext().getString(o2.q.f227991hb);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Uri uriForFile = FileProvider.getUriForFile(activity.getBaseContext(), string, file2);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
            return uriForFile;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }
}
