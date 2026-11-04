package com.planner5d.library.widget.editor.facade;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f256069b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<Fragment> f256070a;

    public a(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f256070a = new WeakReference<>(fragment);
    }

    @Override // com.planner5d.library.widget.editor.facade.e
    @Nullable
    public o0 F() {
        Fragment fragment = this.f256070a.get();
        if (fragment != null) {
            return fragment.getViewLifecycleOwner();
        }
        return null;
    }

    @Override // com.planner5d.library.widget.editor.facade.e
    @Nullable
    public androidx.fragment.app.s a() {
        Fragment fragment = this.f256070a.get();
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    @Override // com.planner5d.library.widget.editor.facade.e
    @Nullable
    public View getView() {
        Fragment fragment = this.f256070a.get();
        if (fragment != null) {
            return fragment.getView();
        }
        return null;
    }

    @Override // com.planner5d.library.widget.editor.facade.e
    @Nullable
    public Fragment i() {
        return this.f256070a.get();
    }
}
