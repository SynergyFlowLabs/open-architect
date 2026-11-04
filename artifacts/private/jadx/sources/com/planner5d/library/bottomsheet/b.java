package com.planner5d.library.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e1;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import com.planner5d.library.services.utility.h3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nUpdateHeightOnSlideCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateHeightOnSlideCallback.kt\ncom/planner5d/library/bottomsheet/UpdateHeightOnSlideCallback\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,43:1\n327#2,4:44\n81#2:48\n*S KotlinDebug\n*F\n+ 1 UpdateHeightOnSlideCallback.kt\ncom/planner5d/library/bottomsheet/UpdateHeightOnSlideCallback\n*L\n33#1:44,4\n39#1:48\n*E\n"})
public final class b extends AdvancedBottomSheetBehavior.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f148351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final View f148352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final int[] f148353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final int[] f148354d;

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n+ 2 UpdateHeightOnSlideCallback.kt\ncom/planner5d/library/bottomsheet/UpdateHeightOnSlideCallback\n*L\n1#1,81:1\n40#2,2:82\n*E\n"})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f148355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f148356b;

        public a(View view, b bVar) {
            this.f148355a = view;
            this.f148356b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f148356b.d();
        }
    }

    public b(@NotNull View viewToUpdate, @NotNull View anchor) {
        Intrinsics.checkNotNullParameter(viewToUpdate, "viewToUpdate");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f148351a = viewToUpdate;
        this.f148352b = anchor;
        this.f148353c = new int[2];
        this.f148354d = new int[2];
    }

    @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
    public void b(@NotNull View bottomSheet, float f10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        d();
    }

    @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
    public void c(@NotNull View bottomSheet, int i10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    public final void d() {
        int[] iArr = this.f148353c;
        iArr[0] = 0;
        iArr[1] = 0;
        this.f148351a.getLocationOnScreen(iArr);
        int[] iArr2 = this.f148354d;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int iA = h3.A(this.f148351a.getContext());
        this.f148352b.getLocationOnScreen(this.f148354d);
        int i10 = iA - (this.f148353c[1] - (this.f148354d[1] - iA));
        if (i10 < 0 || i10 == this.f148351a.getLayoutParams().height) {
            return;
        }
        View view = this.f148351a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
        this.f148351a.requestApplyInsets();
    }

    public final void e() {
        View view = this.f148352b;
        e1.a(view, new a(view, this));
    }
}
