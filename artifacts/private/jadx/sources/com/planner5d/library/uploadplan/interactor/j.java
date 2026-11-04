package com.planner5d.library.uploadplan.interactor;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCopyFromUriInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyFromUriInteractor.kt\ncom/planner5d/library/uploadplan/interactor/CopyFromUriInteractor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class j implements ke.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f230769a;

    @ij.a
    public j(@NotNull com.planner5d.library.application.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f230769a = context;
    }

    @Override // ke.d
    public void a(@NotNull Uri contentUri, @NotNull String name) throws IOException {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Intrinsics.checkNotNullParameter(name, "name");
        File file = new File(this.f230769a.getCacheDir(), name);
        file.delete();
        file.createNewFile();
        InputStream inputStreamOpenInputStream = this.f230769a.getContentResolver().openInputStream(contentUri);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            if (inputStreamOpenInputStream != null) {
                try {
                    org.apache.commons.io.p.v(inputStreamOpenInputStream, bufferedOutputStream);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(bufferedOutputStream, th2);
                        throw th3;
                    }
                }
            }
            bufferedOutputStream.flush();
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(bufferedOutputStream, null);
            kotlin.io.c.a(inputStreamOpenInputStream, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                kotlin.io.c.a(inputStreamOpenInputStream, th4);
                throw th5;
            }
        }
    }
}
