package androidx.compose.animation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class w extends q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f13765d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13766e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.l f13767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f13768c;

    public static final class a implements r1<w> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w(@NotNull androidx.compose.ui.layout.l lVar, @NotNull androidx.compose.ui.e eVar) {
        super(null);
        this.f13767b = lVar;
        this.f13768c = eVar;
    }

    public static /* synthetic */ w e(w wVar, androidx.compose.ui.layout.l lVar, androidx.compose.ui.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = wVar.f13767b;
        }
        if ((i10 & 2) != 0) {
            eVar = wVar.f13768c;
        }
        return wVar.d(lVar, eVar);
    }

    @Override // androidx.compose.animation.q1
    @NotNull
    public r1<?> a() {
        return f13765d;
    }

    @NotNull
    public final androidx.compose.ui.layout.l b() {
        return this.f13767b;
    }

    @NotNull
    public final androidx.compose.ui.e c() {
        return this.f13768c;
    }

    @NotNull
    public final w d(@NotNull androidx.compose.ui.layout.l lVar, @NotNull androidx.compose.ui.e eVar) {
        return new w(lVar, eVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f13767b, wVar.f13767b) && Intrinsics.areEqual(this.f13768c, wVar.f13768c);
    }

    @NotNull
    public final androidx.compose.ui.e f() {
        return this.f13768c;
    }

    @NotNull
    public final androidx.compose.ui.layout.l g() {
        return this.f13767b;
    }

    public int hashCode() {
        return (this.f13767b.hashCode() * 31) + this.f13768c.hashCode();
    }

    @NotNull
    public String toString() {
        return "ContentScaleTransitionEffect(contentScale=" + this.f13767b + ", alignment=" + this.f13768c + ')';
    }
}
