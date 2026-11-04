package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavAction.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavAction.android.kt\nandroidx/navigation/NavAction\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,86:1\n90#2:87\n90#2:88\n*S KotlinDebug\n*F\n+ 1 NavAction.android.kt\nandroidx/navigation/NavAction\n*L\n63#1:87\n69#1:88\n*E\n"})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.d0
    private final int f70904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private w2 f70905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Bundle f70906c;

    @oj.j
    public e0(@androidx.annotation.d0 int i10) {
        this(i10, null, null, 6, null);
    }

    @Nullable
    public final Bundle a() {
        return this.f70906c;
    }

    public final int b() {
        return this.f70904a;
    }

    @Nullable
    public final w2 c() {
        return this.f70905b;
    }

    public final void d(@Nullable Bundle bundle) {
        this.f70906c = bundle;
    }

    public final void e(@Nullable w2 w2Var) {
        this.f70905b = w2Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f70904a != e0Var.f70904a || !Intrinsics.areEqual(this.f70905b, e0Var.f70905b)) {
            return false;
        }
        Bundle bundle = this.f70906c;
        Bundle bundle2 = e0Var.f70906c;
        if (Intrinsics.areEqual(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !androidx.savedstate.f.d(androidx.savedstate.f.b(bundle), bundle2)) ? false : true;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f70904a) * 31;
        w2 w2Var = this.f70905b;
        int iHashCode2 = iHashCode + (w2Var != null ? w2Var.hashCode() : 0);
        Bundle bundle = this.f70906c;
        if (bundle != null) {
            iHashCode2 = (iHashCode2 * 31) + androidx.savedstate.f.e(androidx.savedstate.f.b(bundle));
        }
        return iHashCode2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e0.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f70904a));
        sb2.append(")");
        if (this.f70905b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f70905b);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    public e0(@androidx.annotation.d0 int i10, @Nullable w2 w2Var) {
        this(i10, w2Var, null, 4, null);
    }

    @oj.j
    public e0(@androidx.annotation.d0 int i10, @Nullable w2 w2Var, @Nullable Bundle bundle) {
        this.f70904a = i10;
        this.f70905b = w2Var;
        this.f70906c = bundle;
    }

    public /* synthetic */ e0(int i10, w2 w2Var, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : w2Var, (i11 & 4) != 0 ? null : bundle);
    }
}
