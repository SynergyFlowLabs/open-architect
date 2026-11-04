package com.planner5d.library.userimporteddata;

import android.net.Uri;
import androidx.annotation.m1;
import com.planner5d.library.services.utility.e0;
import com.planner5d.library.services.z;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@ij.f
@SourceDebugExtension({"SMAP\nUserImportedModelFileRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserImportedModelFileRepository.kt\ncom/planner5d/library/userimporteddata/UserImportedModelFileRepository\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,42:1\n29#2:43\n*S KotlinDebug\n*F\n+ 1 UserImportedModelFileRepository.kt\ncom/planner5d/library/userimporteddata/UserImportedModelFileRepository\n*L\n32#1:43\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f235825c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f235826d = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f235827e = "user_models";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z f235828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.filedownloader.c f235829b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @ij.a
    public l(@NotNull z privateFiles, @NotNull com.planner5d.library.services.filedownloader.c fileDownloader) {
        Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        this.f235828a = privateFiles;
        this.f235829b = fileDownloader;
    }

    private final File a(String str) {
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment == null) {
            return null;
        }
        return new File(this.f235828a.a(f235827e), lastPathSegment);
    }

    @m1
    @NotNull
    public final File b(@NotNull String uri, @NotNull String integrityHash) throws Throwable {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(integrityHash, "integrityHash");
        File fileA = a(uri);
        if (fileA == null) {
            throw new IllegalArgumentException("Can not prepare model file for URI");
        }
        if (fileA.isFile() && Intrinsics.areEqual(e0.d(fileA), integrityHash)) {
            return fileA;
        }
        this.f235829b.g(new com.planner5d.library.services.download.g[]{new com.planner5d.library.services.download.g(uri)}, fileA, integrityHash, f235826d);
        return fileA;
    }
}
