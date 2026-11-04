package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@a
@k7
@SourceDebugExtension({"SMAP\nMutablePermissionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutablePermissionState.kt\ncom/google/accompanist/permissions/MutablePermissionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,112:1\n81#2:113\n107#2,2:114\n*S KotlinDebug\n*F\n+ 1 MutablePermissionState.kt\ncom/google/accompanist/permissions/MutablePermissionState\n*L\n89#1:113\n89#1:114,2\n*E\n"})
public final class f implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f103097f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f103098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f103099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Activity f103100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f103101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.activity.result.h<String> f103102e;

    public f(@NotNull String permission, @NotNull Context context, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f103098a = permission;
        this.f103099b = context;
        this.f103100c = activity;
        this.f103101d = d7.g(b(), null, 2, null);
    }

    private final j b() {
        return m.g(this.f103099b, F7()) ? j.b.f103112a : new j.a(m.m(this.f103100c, F7()));
    }

    @Override // com.google.accompanist.permissions.h
    @NotNull
    public String F7() {
        return this.f103098a;
    }

    @Override // com.google.accompanist.permissions.h
    public void G7() {
        Unit unit;
        androidx.activity.result.h<String> hVar = this.f103102e;
        if (hVar != null) {
            hVar.b(F7());
            unit = Unit.f312394a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    @Nullable
    public final androidx.activity.result.h<String> a() {
        return this.f103102e;
    }

    public final void c() {
        e(b());
    }

    public final void d(@Nullable androidx.activity.result.h<String> hVar) {
        this.f103102e = hVar;
    }

    public void e(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f103101d.setValue(jVar);
    }

    @Override // com.google.accompanist.permissions.h
    @NotNull
    public j t() {
        return (j) this.f103101d.getValue();
    }
}
