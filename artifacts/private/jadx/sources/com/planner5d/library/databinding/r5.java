package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r5 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f159598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f159599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f159600d;

    private r5(@NonNull View view, @NonNull Button button, @NonNull Button button2, @NonNull Button button3) {
        this.f159597a = view;
        this.f159598b = button;
        this.f159599c = button2;
        this.f159600d = button3;
    }

    @NonNull
    public static r5 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.N4;
        Button button = (Button) b4.c.a(view, i10);
        if (button != null) {
            i10 = com.planner5d.library.f.j.O4;
            Button button2 = (Button) b4.c.a(view, i10);
            if (button2 != null) {
                i10 = com.planner5d.library.f.j.P4;
                Button button3 = (Button) b4.c.a(view, i10);
                if (button3 != null) {
                    return new r5(view, button, button2, button3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r5 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.X7, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159597a;
    }
}
