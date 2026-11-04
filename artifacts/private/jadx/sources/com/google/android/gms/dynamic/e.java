package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public interface e {
    @g6.a
    void a();

    @g6.a
    void b();

    @g6.a
    void d();

    @g6.a
    void f(@NonNull Bundle bundle);

    @g6.a
    void g();

    @g6.a
    void h(@p0 Bundle bundle);

    @g6.a
    void i(@NonNull Activity activity, @NonNull Bundle bundle, @p0 Bundle bundle2);

    @NonNull
    @g6.a
    View j(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle);

    @g6.a
    void l();

    @g6.a
    void m();

    @g6.a
    void onLowMemory();
}
