package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.EditTextWithValidator;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f158891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f158892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditTextWithValidator f158893c;

    private e3(@NonNull View view, @NonNull ImageView imageView, @NonNull EditTextWithValidator editTextWithValidator) {
        this.f158891a = view;
        this.f158892b = imageView;
        this.f158893c = editTextWithValidator;
    }

    @NonNull
    public static e3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168201l5;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.f168427ue;
            EditTextWithValidator editTextWithValidator = (EditTextWithValidator) b4.c.a(view, i10);
            if (editTextWithValidator != null) {
                return new e3(view, imageView, editTextWithValidator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168699g6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f158891a;
    }
}
