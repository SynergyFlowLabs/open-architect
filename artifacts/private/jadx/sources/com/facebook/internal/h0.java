package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Fragment f99882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private android.app.Fragment f99883b;

    public h0(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f99882a = fragment;
    }

    @Nullable
    public final Activity a() {
        Fragment fragment = this.f99882a;
        if (fragment != null) {
            if (fragment == null) {
                return null;
            }
            return fragment.getActivity();
        }
        android.app.Fragment fragment2 = this.f99883b;
        if (fragment2 == null) {
            return null;
        }
        return fragment2.getActivity();
    }

    @Nullable
    public final android.app.Fragment b() {
        return this.f99883b;
    }

    @Nullable
    public final Fragment c() {
        return this.f99882a;
    }

    public final void d(@Nullable Intent intent, int i10) {
        Fragment fragment = this.f99882a;
        if (fragment == null) {
            android.app.Fragment fragment2 = this.f99883b;
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i10);
            }
        } else if (fragment != null) {
            fragment.startActivityForResult(intent, i10);
        }
    }

    public h0(@NotNull android.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f99883b = fragment;
    }
}
