package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@e.a({"NewApi"})
@g6.a
public final class b extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fragment f107019a;

    private b(Fragment fragment) {
        this.f107019a = fragment;
    }

    @p0
    @g6.a
    public static b n(@p0 Fragment fragment) {
        if (fragment != null) {
            return new b(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean B0() {
        return this.f107019a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void F6(@NonNull Intent intent, int i10) {
        this.f107019a.startActivityForResult(intent, i10);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void L5(boolean z10) {
        this.f107019a.setMenuVisibility(z10);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean M0() {
        return this.f107019a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean Q0() {
        return this.f107019a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void Qd(@NonNull d dVar) {
        View view = (View) f.n(dVar);
        w.r(view);
        this.f107019a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    @NonNull
    public final d R() {
        return f.p(this.f107019a.getResources());
    }

    @Override // com.google.android.gms.dynamic.c
    @p0
    public final String T() {
        return this.f107019a.getTag();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean U0() {
        return this.f107019a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean X() {
        return this.f107019a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean Y() {
        return this.f107019a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean b1() {
        return this.f107019a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.c
    @p0
    public final c c() {
        return n(this.f107019a.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.c
    @NonNull
    public final d f() {
        return f.p(this.f107019a.getView());
    }

    @Override // com.google.android.gms.dynamic.c
    public final int g() {
        return this.f107019a.getId();
    }

    @Override // com.google.android.gms.dynamic.c
    public final int h() {
        return this.f107019a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void hb(@NonNull d dVar) {
        View view = (View) f.n(dVar);
        w.r(view);
        this.f107019a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void i6(boolean z10) {
        this.f107019a.setRetainInstance(z10);
    }

    @Override // com.google.android.gms.dynamic.c
    @p0
    public final c j() {
        return n(this.f107019a.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.c
    @p0
    public final Bundle m() {
        return this.f107019a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void n8(boolean z10) {
        this.f107019a.setUserVisibleHint(z10);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean o1() {
        return this.f107019a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.c
    @NonNull
    public final d q() {
        return f.p(this.f107019a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.c
    public final void t5(boolean z10) {
        this.f107019a.setHasOptionsMenu(z10);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void w6(@NonNull Intent intent) {
        this.f107019a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean x0() {
        return this.f107019a.isAdded();
    }
}
