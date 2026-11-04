package com.planner5d.library.spaces.view.search;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
public final class i implements yc.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230467e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f230468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f230469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f230470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f230471d;

    public i(int i10, @NotNull String address, @NotNull String mainText, @NotNull String secondaryText) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        this.f230468a = i10;
        this.f230469b = address;
        this.f230470c = mainText;
        this.f230471d = secondaryText;
    }

    @NotNull
    public final String a() {
        return this.f230469b;
    }

    @NotNull
    public final String b() {
        return this.f230470c;
    }

    @NotNull
    public final String c() {
        return this.f230471d;
    }

    public final int d() {
        return this.f230468a;
    }

    @Override // yc.b
    public boolean equals(@Nullable Object obj) {
        boolean z10 = obj instanceof i;
        i iVar = z10 ? (i) obj : null;
        if (iVar != null && this.f230468a == iVar.f230468a) {
            String str = this.f230469b;
            i iVar2 = z10 ? (i) obj : null;
            if (Intrinsics.areEqual(str, iVar2 != null ? iVar2.f230469b : null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f230469b.hashCode();
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        boolean z10 = obj instanceof i;
        i iVar = z10 ? (i) obj : null;
        if (iVar == null || this.f230468a != iVar.f230468a) {
            return false;
        }
        String str = this.f230469b;
        i iVar2 = z10 ? (i) obj : null;
        return Intrinsics.areEqual(str, iVar2 != null ? iVar2.f230469b : null);
    }
}
