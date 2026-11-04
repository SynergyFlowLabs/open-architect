package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavArgument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgument\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,239:1\n90#2:240\n*S KotlinDebug\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgument\n*L\n86#1:240\n*E\n"})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d3<Object> f71118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f71119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f71120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f71121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Object f71122e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private d3<Object> f71123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f71124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Object f71125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f71126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f71127e;

        @NotNull
        public final j0 a() {
            d3<Object> d3VarC = this.f71123a;
            if (d3VarC == null) {
                d3VarC = d3.Companion.c(this.f71125c);
                Intrinsics.checkNotNull(d3VarC, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new j0(d3VarC, this.f71124b, this.f71125c, this.f71126d, this.f71127e);
        }

        @NotNull
        public final a b(@Nullable Object obj) {
            this.f71125c = obj;
            this.f71126d = true;
            return this;
        }

        @NotNull
        public final a c(boolean z10) {
            this.f71124b = z10;
            return this;
        }

        @NotNull
        public final <T> a d(@NotNull d3<T> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f71123a = type;
            return this;
        }

        @NotNull
        public final a e(boolean z10) {
            this.f71127e = z10;
            return this;
        }
    }

    public j0(@NotNull d3<Object> type, boolean z10, @Nullable Object obj, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.isNullableAllowed() && z10) {
            throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        this.f71118a = type;
        this.f71119b = z10;
        this.f71122e = obj;
        this.f71120c = z11 || z12;
        this.f71121d = z12;
    }

    @Nullable
    public final Object a() {
        return this.f71122e;
    }

    @NotNull
    public final d3<Object> b() {
        return this.f71118a;
    }

    public final boolean c() {
        return this.f71120c;
    }

    public final boolean d() {
        return this.f71121d;
    }

    public final boolean e() {
        return this.f71119b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (this.f71119b != j0Var.f71119b || this.f71120c != j0Var.f71120c || !Intrinsics.areEqual(this.f71118a, j0Var.f71118a)) {
                return false;
            }
            Object obj2 = this.f71122e;
            if (obj2 != null) {
                return Intrinsics.areEqual(obj2, j0Var.f71122e);
            }
            if (j0Var.f71122e == null) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void f(@NotNull String name, @NotNull Bundle bundle) {
        Object obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.f71120c || (obj = this.f71122e) == null) {
            return;
        }
        this.f71118a.put(bundle, name, obj);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final boolean g(@NotNull String name, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.f71119b) {
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (androidx.savedstate.f.c(bundleB, name) && androidx.savedstate.f.C0(bundleB, name)) {
                return false;
            }
        }
        try {
            this.f71118a.get(bundle, name);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f71118a.hashCode() * 31) + (this.f71119b ? 1 : 0)) * 31) + (this.f71120c ? 1 : 0)) * 31;
        Object obj = this.f71122e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.jvm.internal.j1.d(j0.class).Q());
        sb2.append(" Type: " + this.f71118a);
        sb2.append(" Nullable: " + this.f71119b);
        if (this.f71120c) {
            sb2.append(" DefaultValue: " + this.f71122e);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
