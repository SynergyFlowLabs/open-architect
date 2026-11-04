package com.planner5d.library.model.manager.managedfiles;

import androidx.compose.runtime.internal.w0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f192062a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f192063b = 0;

    private q() {
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    public boolean a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        int i10 = 2 >> 0;
        return false;
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    public void b(@Nullable File file) {
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    public boolean c(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return false;
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    public void d(int i10) {
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d dVar) {
        return null;
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    public boolean f(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return true;
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    public void g(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @Nullable
    public Object h(boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    public void validate() {
    }
}
