package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f122455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View.OnClickListener f122456b;

    public a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.f122455a = viewGroup;
        this.f122456b = onClickListener;
    }

    @p0
    public Boolean a(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = this.f122456b;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick(this.f122455a);
        return Boolean.TRUE;
    }
}
