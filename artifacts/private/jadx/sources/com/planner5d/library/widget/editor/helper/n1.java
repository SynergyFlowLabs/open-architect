package com.planner5d.library.widget.editor.helper;

import android.view.View;
import android.widget.ImageView;
import com.planner5d.library.model.item.Item;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorAiChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorAiChat.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorAiChat\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,65:1\n257#2,2:66\n257#2,2:68\n257#2,2:70\n257#2,2:72\n257#2,2:74\n*S KotlinDebug\n*F\n+ 1 HelperEditorAiChat.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorAiChat\n*L\n30#1:66,2\n37#1:68,2\n41#1:70,2\n45#1:72,2\n50#1:74,2\n*E\n"})
public final class n1 implements xa.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f256574e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u2 f256575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private e f256576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private WeakReference<View> f256577c = new WeakReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f256578d;

    private final View d() {
        View view = this.f256577c.get();
        if (view != null) {
            return view.findViewById(com.planner5d.library.f.j.S1);
        }
        return null;
    }

    private final ImageView e() {
        View view = this.f256577c.get();
        if (view != null) {
            return (ImageView) view.findViewById(com.planner5d.library.f.j.f168152j4);
        }
        return null;
    }

    private final View f() {
        View view = this.f256577c.get();
        if (view != null) {
            return view.findViewById(com.planner5d.library.f.j.f167984c5);
        }
        return null;
    }

    @Override // xa.b
    public void a() {
        View viewD = d();
        if (viewD != null) {
            viewD.setVisibility(8);
        }
        ImageView imageViewE = e();
        if (imageViewE != null) {
            imageViewE.setImageResource(com.planner5d.library.f.h.f167758r6);
        }
    }

    @Override // xa.b
    public void b() {
        View viewD = d();
        if (viewD != null) {
            viewD.setVisibility(0);
        }
        ImageView imageViewE = e();
        if (imageViewE != null) {
            imageViewE.setImageResource(com.planner5d.library.f.h.f167777s6);
        }
    }

    @Override // xa.b
    public void c() {
        u2 u2Var = this.f256575a;
        if (u2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperEditorTooltips");
            u2Var = null;
        }
        u2Var.o(this.f256577c.get());
    }

    public final void g() {
        View viewF = f();
        if (viewF != null) {
            viewF.setVisibility(8);
        }
    }

    public final void h(@Nullable Item item) {
        if (this.f256578d && item != null) {
            View viewF = f();
            if (viewF != null) {
                viewF.setVisibility(8);
            }
            e eVar = this.f256576b;
            if (eVar != null) {
                eVar.A();
            }
            this.f256578d = false;
        }
    }

    public final void i(@NotNull View rootView, @NotNull e bottomMenuHelper, @NotNull u2 helperEditorTooltips) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(bottomMenuHelper, "bottomMenuHelper");
        Intrinsics.checkNotNullParameter(helperEditorTooltips, "helperEditorTooltips");
        this.f256577c = new WeakReference<>(rootView);
        this.f256576b = bottomMenuHelper;
        this.f256575a = helperEditorTooltips;
    }

    public final void j() {
        View viewF = f();
        if (viewF != null) {
            viewF.setVisibility(0);
        }
    }

    public final void k() {
        this.f256578d = true;
    }
}
