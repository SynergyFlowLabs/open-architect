package com.planner5d.library.activity.fragment.spaces.view;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class i extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136410f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function0<Unit> f136411e;

    public i(@f1 int i10, @f1 int i11, @Nullable Function0<Unit> function0) {
        super(Integer.valueOf(i10), Integer.valueOf(i11), null);
        this.f136411e = function0;
    }

    @Nullable
    public final Function0<Unit> c() {
        return this.f136411e;
    }
}
