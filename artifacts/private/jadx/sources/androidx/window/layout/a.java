package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@w0(24)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f76375a = new a();

    private a() {
    }

    public final boolean a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
