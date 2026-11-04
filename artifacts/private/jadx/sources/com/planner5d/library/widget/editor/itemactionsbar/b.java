package com.planner5d.library.widget.editor.itemactionsbar;

import androidx.annotation.n;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f256942d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f256943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f256944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f256945c;

    public b(@v int i10, @n int i11, @NotNull Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f256943a = i10;
        this.f256944b = i11;
        this.f256945c = clickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b e(b bVar, int i10, int i11, Function0 function0, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = bVar.f256943a;
        }
        if ((i12 & 2) != 0) {
            i11 = bVar.f256944b;
        }
        if ((i12 & 4) != 0) {
            function0 = bVar.f256945c;
        }
        return bVar.d(i10, i11, function0);
    }

    public final int a() {
        return this.f256943a;
    }

    public final int b() {
        return this.f256944b;
    }

    @NotNull
    public final Function0<Unit> c() {
        return this.f256945c;
    }

    @NotNull
    public final b d(@v int i10, @n int i11, @NotNull Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        return new b(i10, i11, clickListener);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f256943a == bVar.f256943a && this.f256944b == bVar.f256944b && Intrinsics.areEqual(this.f256945c, bVar.f256945c);
    }

    @NotNull
    public final Function0<Unit> f() {
        return this.f256945c;
    }

    public final int g() {
        return this.f256943a;
    }

    public final int h() {
        return this.f256944b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f256943a) * 31) + Integer.hashCode(this.f256944b)) * 31) + this.f256945c.hashCode();
    }

    @NotNull
    public String toString() {
        return "ItemAction(icon=" + this.f256943a + ", iconColor=" + this.f256944b + ", clickListener=" + this.f256945c + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@v int i10, @NotNull Function0<Unit> clickListener) {
        this(i10, com.planner5d.library.f.C1549f.f166585oh, clickListener);
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
    }
}
