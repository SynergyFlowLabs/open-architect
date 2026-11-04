package com.planner5d.library.widget.zoom;

import android.graphics.Bitmap;
import android.graphics.Rect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: com.planner5d.library.widget.zoom.a$a, reason: collision with other inner class name */
    public static final class C1750a {
        public static boolean a(@NotNull a aVar) {
            return aVar.a().width() < aVar.d().width();
        }
    }

    @NotNull
    Rect a();

    boolean b();

    @NotNull
    Rect c();

    @NotNull
    Rect d();

    boolean e();

    @NotNull
    Bitmap getOriginalSource();

    void setNewSource(@NotNull Bitmap bitmap);

    void setScalingInProgress(boolean z10);
}
