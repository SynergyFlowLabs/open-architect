package androidx.compose.ui;

import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
final class y extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f43008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Object f43009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Object f43010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Object f43011h;

    public y(@NotNull String str, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        super(function1, nVar);
        this.f43008e = str;
        this.f43009f = obj;
        this.f43010g = obj2;
        this.f43011h = obj3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (Intrinsics.areEqual(this.f43008e, yVar.f43008e) && Intrinsics.areEqual(this.f43009f, yVar.f43009f) && Intrinsics.areEqual(this.f43010g, yVar.f43010g) && Intrinsics.areEqual(this.f43011h, yVar.f43011h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f43008e.hashCode() * 31;
        Object obj = this.f43009f;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f43010g;
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.f43011h;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    @NotNull
    public final String j() {
        return this.f43008e;
    }

    @Nullable
    public final Object k() {
        return this.f43009f;
    }

    @Nullable
    public final Object l() {
        return this.f43010g;
    }

    @Nullable
    public final Object m() {
        return this.f43011h;
    }
}
