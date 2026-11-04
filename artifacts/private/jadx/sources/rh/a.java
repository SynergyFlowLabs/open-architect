package rh;

import android.content.Context;
import ih.e;
import java.io.File;
import kotlin.io.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nio/customer/tracking/migration/store/FileStorage\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,98:1\n13472#2,2:99\n*S KotlinDebug\n*F\n+ 1 FileStorage.kt\nio/customer/tracking/migration/store/FileStorage\n*L\n90#1:99,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f366654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f366655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f366656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final File f366657d;

    public a(@NotNull String siteId, @NotNull Context context, @NotNull e logger) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f366654a = siteId;
        this.f366655b = context;
        this.f366656c = logger;
        this.f366657d = new File(context.getFilesDir(), "io.customer");
    }

    public static /* synthetic */ void c(a aVar, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = aVar.f366657d;
        }
        aVar.b(file);
    }

    public final boolean a(@NotNull b type) {
        Intrinsics.checkNotNullParameter(type, "type");
        File file = new File(type.a(f()), type.getFileName());
        try {
            return file.delete();
        } catch (Throwable th2) {
            e.a.b(this.f366656c, "error while deleting file " + type + ". path " + file.getAbsolutePath() + ". message: " + th2.getMessage(), null, null, 6, null);
            return false;
        }
    }

    public final void b(@NotNull File path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!path.isDirectory()) {
            path.delete();
            return;
        }
        String[] list = path.list();
        if (list != null) {
            for (String str : list) {
                b(new File(path, str));
            }
        }
    }

    @Nullable
    public final String d(@NotNull b type) {
        String strB;
        Intrinsics.checkNotNullParameter(type, "type");
        File file = new File(type.a(f()), type.getFileName());
        if (!file.exists()) {
            return null;
        }
        try {
            strB = l.B(file, null, 1, null);
        } catch (Exception e10) {
            e.a.b(this.f366656c, "error while reading file " + type + ". path " + file.getAbsolutePath() + ". message: " + e10.getMessage(), null, null, 6, null);
            strB = null;
        }
        if (strB == null || StringsKt.w3(strB)) {
            return null;
        }
        return strB;
    }

    @NotNull
    public final File e() {
        return this.f366657d;
    }

    @NotNull
    public final File f() {
        return new File(this.f366657d, this.f366654a);
    }

    public final boolean g(@NotNull b type, @NotNull String contents) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(contents, "contents");
        File fileA = type.a(f());
        File file = new File(fileA, type.getFileName());
        try {
            fileA.mkdirs();
            file.createNewFile();
            l.I(file, contents, null, 2, null);
            return true;
        } catch (Throwable th2) {
            e.a.b(this.f366656c, "error while saving file " + type + ". path " + file.getAbsolutePath() + ". message: " + th2.getMessage(), null, null, 6, null);
            return false;
        }
    }
}
