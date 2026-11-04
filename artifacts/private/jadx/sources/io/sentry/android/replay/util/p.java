package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f305038c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final q0 f305039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f305040b;

    public /* synthetic */ p(q0 q0Var, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, z10);
    }

    public static /* synthetic */ p d(p pVar, q0 q0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q0Var = pVar.f305039a;
        }
        if ((i10 & 2) != 0) {
            z10 = pVar.f305040b;
        }
        return pVar.c(q0Var, z10);
    }

    @Nullable
    public final q0 a() {
        return this.f305039a;
    }

    public final boolean b() {
        return this.f305040b;
    }

    @NotNull
    public final p c(@Nullable q0 q0Var, boolean z10) {
        return new p(q0Var, z10, null);
    }

    @Nullable
    public final q0 e() {
        return this.f305039a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f305039a, pVar.f305039a) && this.f305040b == pVar.f305040b;
    }

    public final boolean f() {
        return this.f305040b;
    }

    public int hashCode() {
        q0 q0Var = this.f305039a;
        return ((q0Var == null ? 0 : q0.K(q0Var.M())) * 31) + Boolean.hashCode(this.f305040b);
    }

    @NotNull
    public String toString() {
        return "TextAttributes(color=" + this.f305039a + ", hasFillModifier=" + this.f305040b + ')';
    }

    private p(q0 q0Var, boolean z10) {
        this.f305039a = q0Var;
        this.f305040b = z10;
    }
}
