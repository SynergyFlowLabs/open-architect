package com.planner5d.library.services;

import android.content.Context;
import androidx.annotation.m1;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f229889a = new w();

    private w() {
    }

    @m1
    @Nullable
    public final File a(@Nullable Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (context == null) {
            return null;
        }
        e eVarA = e.f224295d.a(context);
        File fileF = eVarA.f();
        File fileE = eVarA.e();
        File file = fileF == null ? null : new File(fileF, name);
        File file2 = fileE == null ? null : new File(fileE, name);
        if (file != null && fileF != null && ((fileF.isDirectory() || fileF.mkdirs()) && (file2 == null || !file2.exists() || (!file.exists() && file2.renameTo(file))))) {
            return file;
        }
        if (file2 == null || fileE == null || !(fileE.isDirectory() || fileE.mkdirs())) {
            return null;
        }
        return file2;
    }
}
