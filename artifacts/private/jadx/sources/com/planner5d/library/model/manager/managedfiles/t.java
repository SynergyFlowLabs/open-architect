package com.planner5d.library.model.manager.managedfiles;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.ManagedFile;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f192079c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f192080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f192081b;

    @ij.a
    public t(@NotNull d datafileDao) {
        Intrinsics.checkNotNullParameter(datafileDao, "datafileDao");
        this.f192080a = datafileDao;
    }

    @m1
    private final int e(String str) {
        Integer num = this.f192081b;
        int iIntValue = (num != null ? num.intValue() : this.f192080a.i(str)) + 1;
        this.f192081b = Integer.valueOf(iIntValue);
        return iIntValue;
    }

    @m1
    @Nullable
    public final ManagedFile a(@NotNull String datafileVersion, int i10) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        ManagedFile managedFileK = this.f192080a.k(datafileVersion, i10);
        if (managedFileK == null) {
            return null;
        }
        managedFileK.downloadStatus = 1;
        managedFileK.downloadStart = new Date();
        managedFileK.save();
        return managedFileK;
    }

    @m1
    public final void b(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        this.f192080a.d(datafileVersion);
    }

    @m1
    @Nullable
    public final ManagedFile c(@NotNull String datafileVersion, @NotNull String path) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        return this.f192080a.e(datafileVersion, path);
    }

    @m1
    @NotNull
    public final List<ManagedFile> d(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        return this.f192080a.j(datafileVersion);
    }

    @m1
    @NotNull
    public final w f(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        d.a aVarG = this.f192080a.g(datafileVersion);
        d.a aVarH = this.f192080a.h(datafileVersion);
        return new w(aVarH.b(), aVarH.a(), aVarG.b(), aVarG.a());
    }

    @m1
    public final void g(@NotNull String datafileVersion, @NotNull Set<String> itemsNsUser) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        Intrinsics.checkNotNullParameter(itemsNsUser, "itemsNsUser");
        d dVar = this.f192080a;
        dVar.m(dVar.f(datafileVersion), itemsNsUser);
    }

    @m1
    public final void h() {
        this.f192080a.o();
    }

    @m1
    public final void i(@NotNull List<? extends ManagedFile> files) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.f192080a.p(files);
    }

    @m1
    public final void j(@NotNull ManagedFile file) {
        Intrinsics.checkNotNullParameter(file, "file");
        file.dateUpdated = new Date();
        file.downloadStatus = 0;
        file.downloadPriority = file.u(false);
        file.save();
    }

    @m1
    public final void k(@NotNull List<Long> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f192080a.r(ids);
    }

    @m1
    public final void l(@NotNull ManagedFile file) {
        Intrinsics.checkNotNullParameter(file, "file");
        file.dateUpdated = new Date();
        file.downloadStatus = 2;
        file.downloadPriority = file.u(false);
        file.save();
    }

    @m1
    public final void m(@NotNull String datafileVersion, @NotNull ManagedFile file) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        Intrinsics.checkNotNullParameter(file, "file");
        file.downloadPriority = e(datafileVersion);
        file.save();
    }
}
