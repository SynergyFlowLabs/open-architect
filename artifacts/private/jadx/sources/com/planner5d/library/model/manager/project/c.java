package com.planner5d.library.model.manager.project;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.activeandroid.query.Select;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.y0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProjectImagesHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectImagesHelper.kt\ncom/planner5d/library/model/manager/project/ProjectImagesHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,158:1\n1#2:159\n72#3:160\n*S KotlinDebug\n*F\n+ 1 ProjectImagesHelper.kt\ncom/planner5d/library/model/manager/project/ProjectImagesHelper\n*L\n106#1:160\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f193132c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f193133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f193134b;

    @ij.a
    public c(@NotNull y0 imageManager, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        this.f193133a = imageManager;
        this.f193134b = builtInDataManager;
    }

    private final File d(Project project) {
        return this.f193134b.R(project);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    private final String e(Project project) {
        String str;
        String str2 = project.uid;
        if (str2 == null) {
            return null;
        }
        if (project.C() != null) {
            return project.C();
        }
        String str3 = com.planner5d.library.api.f.a().f142272j;
        String strSubstring = str2.substring(0, 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str2.substring(5, 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Date date = project.dateUpdated;
        if (date != null) {
            str = "v=" + date.getTime();
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        return str3 + "/images/" + strSubstring + "/" + strSubstring2 + "/" + str2 + ".600.jpg?" + str;
    }

    @m1
    private final File f(Context context, Long l10) {
        File fileA;
        if (l10 == null || (fileA = com.planner5d.library.services.w.f229889a.a(context, "images/project")) == null) {
            return null;
        }
        if (!fileA.isDirectory() && !fileA.mkdirs()) {
            fileA = null;
        }
        if (fileA != null) {
            return new File(fileA, l10.toString());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d h(c cVar, int i10, com.planner5d.library.services.bitmaploader.target.a aVar, File file, int i11) {
        Intrinsics.checkNotNullParameter(file, "file");
        return cVar.f193133a.h(file.getAbsolutePath(), i10, i10, aVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Project project, c cVar, Context context, Bitmap bitmap, Subscriber subscriber) {
        Bitmap bitmap2;
        Long id2 = project.getId();
        if (id2 == null || id2.longValue() <= 0) {
            subscriber.onCompleted();
            return;
        }
        File fileF = cVar.f(context, id2);
        if (fileF == null) {
            subscriber.onError(new IOException("Cannot create project image file"));
            return;
        }
        Point point = new Point();
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167313ui);
        if (bitmap.getWidth() > bitmap.getHeight()) {
            point.x = (bitmap.getWidth() - bitmap.getHeight()) / 2;
        } else if (bitmap.getHeight() > bitmap.getWidth()) {
            point.y = (bitmap.getHeight() - bitmap.getWidth()) / 2;
        }
        try {
            bitmap2 = bitmap;
            try {
                Bitmap bitmapC = td.a.f380845a.c(bitmap2, point.x, point.y, iMin, iMin, null);
                if (!Intrinsics.areEqual(bitmapC, bitmap2)) {
                    bitmap2.recycle();
                }
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapC, dimensionPixelSize, dimensionPixelSize, true);
                if (!Intrinsics.areEqual(bitmapC, bitmapCreateScaledBitmap)) {
                    bitmapC.recycle();
                }
                try {
                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.PNG, 96, new FileOutputStream(fileF));
                } catch (FileNotFoundException unused) {
                } finally {
                    bitmapCreateScaledBitmap.recycle();
                }
                subscriber.onNext(fileF);
                subscriber.onCompleted();
                if (bitmap2.isRecycled()) {
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    subscriber.onError(new Exception(th));
                    boolean zIsRecycled = bitmap2.isRecycled();
                } finally {
                    if (!bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    @m1
    public final void c(@NotNull Context context, @NotNull Project from, @NotNull Project to) {
        File fileF;
        File fileD;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        Long id2 = from.getId();
        Long id3 = to.getId();
        if (id2 == null || id3 == null || (fileF = f(context, id3)) == null || fileF.isDirectory()) {
            return;
        }
        File fileF2 = f(context, id2);
        File file = null;
        if (fileF2 == null) {
            fileD = d(from);
            if (fileD != null && fileD.isFile()) {
                file = fileD;
            }
            if (file == null) {
                return;
            } else {
                fileF2 = file;
            }
        } else {
            if (!fileF2.isFile()) {
                fileF2 = null;
            }
            if (fileF2 == null) {
                fileD = d(from);
                if (fileD != null) {
                    file = fileD;
                }
                if (file == null) {
                    return;
                } else {
                    fileF2 = file;
                }
            }
        }
        try {
            org.apache.commons.io.p.v(new FileInputStream(fileF2), new FileOutputStream(fileF));
        } catch (Exception unused) {
        }
    }

    @m1
    @Nullable
    public final com.planner5d.library.services.bitmaploader.d.C1663d g(@Nullable Context context, @NotNull Project model, final int i10, @NotNull final com.planner5d.library.services.bitmaploader.target.a target) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(target, "target");
        Function2 function2 = new Function2() { // from class: com.planner5d.library.model.manager.project.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return c.h(this.f193122a, i10, target, (File) obj, ((Integer) obj2).intValue());
            }
        };
        File fileF = f(context, model.getId());
        if (fileF != null) {
            if (!fileF.isFile()) {
                fileF = null;
            }
            if (fileF != null) {
                return (com.planner5d.library.services.bitmaploader.d.C1663d) function2.invoke(fileF, 2);
            }
        }
        File fileD = d(model);
        if (fileD != null) {
            if (!fileD.isFile()) {
                fileD = null;
            }
            if (fileD != null) {
                return (com.planner5d.library.services.bitmaploader.d.C1663d) function2.invoke(fileD, 4);
            }
        }
        target.j(null, null);
        return null;
    }

    @Nullable
    public final com.planner5d.library.services.bitmaploader.d.C1663d i(@NotNull Project model, int i10, @NotNull com.planner5d.library.services.bitmaploader.target.a target) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(target, "target");
        y0 y0Var = this.f193133a;
        String strE = e(model);
        if (strE == null) {
            return null;
        }
        return y0Var.b(strE, i10, i10, target, 4L);
    }

    @NotNull
    public final Observable<File> j(@Nullable final Context context, @Nullable final Project project, @Nullable final Bitmap bitmap) {
        if (project == null || bitmap == null || context == null) {
            Observable<File> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        Observable<File> observableD = com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.b
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                c.k(project, this, context, bitmap, (Subscriber) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableD, "background(...)");
        return observableD;
    }

    @m1
    public final void l(@Nullable String str, @Nullable String str2, @Nullable id.a aVar) {
        Project project = (Project) new Select().from(Project.class).where("user_id = ? AND uid = ?", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), str).executeSingle();
        if (project != null) {
            project.G(str2);
            project.save();
        }
    }
}
