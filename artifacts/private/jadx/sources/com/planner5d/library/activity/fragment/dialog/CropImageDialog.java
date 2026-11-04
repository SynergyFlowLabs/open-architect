package com.planner5d.library.activity.fragment.dialog;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import com.canhub.cropper.core.CropImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCropImageDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageDialog.kt\ncom/planner5d/library/activity/fragment/dialog/CropImageDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class CropImageDialog extends ContentDialog<Intent> implements n0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private CropImageView f131606o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private FloatingActionButton f131607p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private FloatingActionButton f131608q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private View f131609r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @Nullable
    private ViewGroup f131610s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private Intent f131611t3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(CropImageDialog cropImageDialog, CropImageView cropImageView, CropImageView.c result) {
        Intrinsics.checkNotNullParameter(cropImageView, "<unused var>");
        Intrinsics.checkNotNullParameter(result, "result");
        cropImageDialog.a0(result.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(CropImageDialog cropImageDialog, View view) {
        Intent intent = cropImageDialog.f131611t3;
        if (intent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            intent = null;
        }
        cropImageDialog.a0(intent.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(CropImageDialog cropImageDialog, View view) {
        CropImageView cropImageView = cropImageDialog.f131606o3;
        if (cropImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropView");
            cropImageView = null;
        }
        CropImageView.g(cropImageView, null, 0, 0, 0, null, null, 63, null);
    }

    private final Intent Y() {
        Intent intent = this.f131611t3;
        if (intent != null) {
            return intent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("data");
        return null;
    }

    private final Intent Z(Uri uri) {
        Intent intent = new Intent();
        intent.setData(uri);
        return intent;
    }

    private final void a0(Uri uri) {
        sendResultOnce(uri != null ? Z(uri) : Y());
    }

    private final void b0(Intent intent) {
        this.f131611t3 = intent;
        Uri data = intent.getData();
        CropImageView cropImageView = null;
        if (data != null) {
            CropImageView cropImageView2 = this.f131606o3;
            if (cropImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropView");
                cropImageView2 = null;
            }
            cropImageView2.setImageUriAsync(data);
        }
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(intent.getExtras());
        int iC = jVar.c(com.planner5d.library.services.r.minImageSize, 512);
        boolean zF = jVar.f(com.planner5d.library.services.r.aspectRatioSquare, true);
        CropImageView cropImageView3 = this.f131606o3;
        if (cropImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropView");
            cropImageView3 = null;
        }
        cropImageView3.E(iC, iC);
        CropImageView cropImageView4 = this.f131606o3;
        if (cropImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropView");
            cropImageView4 = null;
        }
        cropImageView4.setCropShape(CropImageView.d.RECTANGLE);
        if (zF) {
            CropImageView cropImageView5 = this.f131606o3;
            if (cropImageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropView");
            } else {
                cropImageView = cropImageView5;
            }
            cropImageView.z(1, 1);
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f131609r3 = LayoutInflater.from(getContext()).inflate(com.planner5d.library.f.m.f168825s0, root, false);
        this.f131610s3 = (ViewGroup) root.findViewById(com.planner5d.library.f.j.H7);
        View view = this.f131609r3;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropContent");
            view = null;
        }
        this.f131606o3 = (CropImageView) view.findViewById(com.planner5d.library.f.j.F9);
        View view2 = this.f131609r3;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropContent");
            view2 = null;
        }
        this.f131607p3 = (FloatingActionButton) view2.findViewById(com.planner5d.library.f.j.J5);
        View view3 = this.f131609r3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropContent");
            view3 = null;
        }
        this.f131608q3 = (FloatingActionButton) view3.findViewById(com.planner5d.library.f.j.L);
        CropImageView cropImageView = this.f131606o3;
        if (cropImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropView");
            cropImageView = null;
        }
        cropImageView.setOnCropImageCompleteListener(new CropImageView.f() { // from class: com.planner5d.library.activity.fragment.dialog.f
            @Override // com.canhub.cropper.core.CropImageView.f
            public final void a(CropImageView cropImageView2, CropImageView.c cVar) {
                CropImageDialog.V(this.f132061a, cropImageView2, cVar);
            }
        });
        FloatingActionButton floatingActionButton = this.f131607p3;
        if (floatingActionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelButton");
            floatingActionButton = null;
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CropImageDialog.W(this.f132063a, view4);
            }
        });
        FloatingActionButton floatingActionButton2 = this.f131608q3;
        if (floatingActionButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acceptButton");
            floatingActionButton2 = null;
        }
        floatingActionButton2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CropImageDialog.X(this.f132064a, view4);
            }
        });
        b0((Intent) A());
        View view4 = this.f131609r3;
        if (view4 != null) {
            return view4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cropContent");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.A0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        a0(null);
        return true;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        View view = this.f131609r3;
        if (view != null) {
            ViewGroup viewGroup = this.f131610s3;
            if (viewGroup != null) {
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cropContent");
                    view = null;
                }
                viewGroup.removeView(view);
            }
            ViewGroup viewGroup2 = this.f131610s3;
            if (viewGroup2 != null) {
                viewGroup2.addView(E(viewGroup2, null));
            }
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.W6);
    }
}
