package io.sentry.instrumentation.file;

import io.sentry.n8;
import io.sentry.p1;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    final File f305581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    final p1 f305582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f305583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    final FileOutputStream f305584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    final n8 f305585e;

    c(@Nullable File file, boolean z10, @Nullable p1 p1Var, @NotNull FileOutputStream fileOutputStream, @NotNull n8 n8Var) {
        this.f305581a = file;
        this.f305583c = z10;
        this.f305582b = p1Var;
        this.f305584d = fileOutputStream;
        this.f305585e = n8Var;
    }
}
