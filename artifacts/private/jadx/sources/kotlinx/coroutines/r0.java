package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f315206b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f315207a;

    public static final class a implements CoroutineContext.b<r0> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public r0(@NotNull String str) {
        super(f315206b);
        this.f315207a = str;
    }

    public static /* synthetic */ r0 N(r0 r0Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r0Var.f315207a;
        }
        return r0Var.j(str);
    }

    @NotNull
    public final String T() {
        return this.f315207a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.areEqual(this.f315207a, ((r0) obj).f315207a);
    }

    @NotNull
    public final String h() {
        return this.f315207a;
    }

    public int hashCode() {
        return this.f315207a.hashCode();
    }

    @NotNull
    public final r0 j(@NotNull String str) {
        return new r0(str);
    }

    @NotNull
    public String toString() {
        return "CoroutineName(" + this.f315207a + ')';
    }
}
