package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.editor.PovPromptView;

/* JADX INFO: loaded from: classes4.dex */
public final class h7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final PovPromptView f159092a;

    private h7(@NonNull PovPromptView povPromptView) {
        this.f159092a = povPromptView;
    }

    @NonNull
    public static h7 a(@NonNull View view) {
        if (view != null) {
            return new h7((PovPromptView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static h7 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h7 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.D8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PovPromptView getRoot() {
        return this.f159092a;
    }
}
