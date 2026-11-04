package com.planner5d.library.contest.data;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestImageLoader.kt\ncom/planner5d/library/contest/data/ContestImageLoader\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,30:1\n67#2,4:31\n37#2,2:35\n55#2:37\n72#2:38\n*S KotlinDebug\n*F\n+ 1 ContestImageLoader.kt\ncom/planner5d/library/contest/data/ContestImageLoader\n*L\n24#1:31,4\n24#1:35,2\n24#1:37\n24#1:38\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f148536b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f148537a;

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ContestImageLoader.kt\ncom/planner5d/library/contest/data/ContestImageLoader\n*L\n1#1,52:1\n70#2:53\n25#3,2:54\n*E\n"})
    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f148539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f148540c;

        public a(String str, com.planner5d.library.services.bitmaploader.target.a aVar) {
            this.f148539b = str;
            this.f148540c = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            h.this.f148537a.b(this.f148539b, view.getWidth(), view.getHeight(), this.f148540c, 5L);
        }
    }

    public h(@NotNull q imageManager) {
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f148537a = imageManager;
    }

    @NotNull
    public final com.planner5d.library.services.bitmaploader.target.a b(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar, @NotNull ImageView view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(view, "view");
        bitmapTargetManager.d(aVar);
        com.planner5d.library.services.bitmaploader.target.a aVarC = bitmapTargetManager.c(com.planner5d.library.widget.bitmaptarget.a.g(view, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null));
        int width = view.getWidth();
        int height = view.getHeight();
        if (width != 0 && height != 0) {
            this.f148537a.b(str, width, height, aVarC, 5L);
        } else if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(str, aVarC));
        } else {
            this.f148537a.b(str, view.getWidth(), view.getHeight(), aVarC, 5L);
        }
        Intrinsics.checkNotNull(aVarC);
        return aVarC;
    }
}
