package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class b extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f52165a;

    public b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f52165a = application;
    }

    @NotNull
    public <T extends Application> T U() {
        T t10 = (T) this.f52165a;
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
