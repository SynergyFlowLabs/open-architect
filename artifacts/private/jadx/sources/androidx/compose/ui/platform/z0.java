package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
interface z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f40984a = a.f40985a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40985a = new a();

        private a() {
        }

        @NotNull
        public final z0 a() {
            return Build.VERSION.SDK_INT >= 30 ? e1.f40430b : d1.f40391b;
        }
    }

    @NotNull
    Rect a(@NotNull Activity activity);
}
