package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class q3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42124e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final c3 f42125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final c3 f42126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final c3 f42127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final c3 f42128d;

    public q3() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final c3 a() {
        return this.f42126b;
    }

    @Nullable
    public final c3 b() {
        return this.f42127c;
    }

    @Nullable
    public final c3 c() {
        return this.f42128d;
    }

    @Nullable
    public final c3 d() {
        return this.f42125a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return Intrinsics.areEqual(this.f42125a, q3Var.f42125a) && Intrinsics.areEqual(this.f42126b, q3Var.f42126b) && Intrinsics.areEqual(this.f42127c, q3Var.f42127c) && Intrinsics.areEqual(this.f42128d, q3Var.f42128d);
    }

    public int hashCode() {
        c3 c3Var = this.f42125a;
        int iHashCode = (c3Var != null ? c3Var.hashCode() : 0) * 31;
        c3 c3Var2 = this.f42126b;
        int iHashCode2 = (iHashCode + (c3Var2 != null ? c3Var2.hashCode() : 0)) * 31;
        c3 c3Var3 = this.f42127c;
        int iHashCode3 = (iHashCode2 + (c3Var3 != null ? c3Var3.hashCode() : 0)) * 31;
        c3 c3Var4 = this.f42128d;
        return iHashCode3 + (c3Var4 != null ? c3Var4.hashCode() : 0);
    }

    public q3(@Nullable c3 c3Var, @Nullable c3 c3Var2, @Nullable c3 c3Var3, @Nullable c3 c3Var4) {
        this.f42125a = c3Var;
        this.f42126b = c3Var2;
        this.f42127c = c3Var3;
        this.f42128d = c3Var4;
    }

    public /* synthetic */ q3(c3 c3Var, c3 c3Var2, c3 c3Var3, c3 c3Var4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : c3Var, (i10 & 2) != 0 ? null : c3Var2, (i10 & 4) != 0 ? null : c3Var3, (i10 & 8) != 0 ? null : c3Var4);
    }
}
