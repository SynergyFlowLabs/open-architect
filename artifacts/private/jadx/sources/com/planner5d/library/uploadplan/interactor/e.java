package com.planner5d.library.uploadplan.interactor;

import android.content.IntentSender;
import android.graphics.Bitmap;
import android.net.Uri;
import com.planner5d.library.services.utility.c0;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements ke.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.imagechooser.j f230753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final le.m f230754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f230755c;

    @ij.a
    public e(@NotNull com.planner5d.library.activity.helper.imagechooser.j helperImageChooser, @NotNull le.m savePngUseCase, @NotNull com.planner5d.library.application.b context) {
        Intrinsics.checkNotNullParameter(helperImageChooser, "helperImageChooser");
        Intrinsics.checkNotNullParameter(savePngUseCase, "savePngUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f230753a = helperImageChooser;
        this.f230754b = savePngUseCase;
        this.f230755c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri d(e eVar, Bitmap bitmap) {
        return eVar.f230754b.a(eVar.f230755c, bitmap, "crop_image");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri e(Function1 function1, Object obj) {
        return (Uri) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ke.b
    @Nullable
    public Object a(boolean z10, @NotNull IntentSender intentSender, @NotNull kotlin.coroutines.d<? super Uri> dVar) throws IOException {
        boolean z11 = false;
        com.planner5d.library.activity.helper.imagechooser.m mVar = new com.planner5d.library.activity.helper.imagechooser.m(512, false, false);
        int i10 = 3;
        qa.e dVar2 = z10 ? new qa.d(new qa.c(z11, null, i10, 0 == true ? 1 : 0), new qa.f()) : new qa.c(z11, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        c0 c0Var = c0.f225068a;
        Observable<Bitmap> observableG = this.f230753a.G(dVar2, mVar, intentSender);
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.uploadplan.interactor.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.d(this.f230751a, (Bitmap) obj);
            }
        };
        Observable<R> map = observableG.map(new Func1() { // from class: com.planner5d.library.uploadplan.interactor.d
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return e.e(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return c0Var.l(map, dVar);
    }
}
