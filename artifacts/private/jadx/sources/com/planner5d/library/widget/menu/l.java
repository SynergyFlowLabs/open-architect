package com.planner5d.library.widget.menu;

import android.view.Menu;
import android.view.MenuInflater;
import androidx.annotation.d0;
import androidx.annotation.m0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f258365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final WeakReference<Menu> f258366b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l(@NotNull MenuInflater inflater, @Nullable Menu menu, @m0 int i10) {
        this(inflater, menu, i10, null, 8, null);
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }

    @NotNull
    public final q a() {
        return this.f258365a;
    }

    @NotNull
    public final n b(@d0 int i10) {
        return new n(this, i10);
    }

    @oj.j
    public l(@NotNull MenuInflater inflater, @Nullable Menu menu, @m0 int i10, @Nullable q qVar) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f258365a = qVar == null ? new q() : qVar;
        this.f258366b = new WeakReference<>(menu);
        if (menu != null) {
            inflater.inflate(i10, menu);
        }
    }

    public /* synthetic */ l(MenuInflater menuInflater, Menu menu, int i10, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(menuInflater, menu, i10, (i11 & 8) != 0 ? null : qVar);
    }
}
