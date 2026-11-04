package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@zl.a
@kotlin.a1
public final class q0 extends kotlin.coroutines.a implements r3<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f315202b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f315203a;

    public static final class a implements CoroutineContext.b<q0> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q0(long j10) {
        super(f315202b);
        this.f315203a = j10;
    }

    public static /* synthetic */ q0 N(q0 q0Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = q0Var.f315203a;
        }
        return q0Var.j(j10);
    }

    public final long T() {
        return this.f315203a;
    }

    @Override // kotlinx.coroutines.r3
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void I(@NotNull CoroutineContext coroutineContext, @NotNull String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.r3
    @NotNull
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public String l1(@NotNull CoroutineContext coroutineContext) {
        String strT;
        r0 r0Var = (r0) coroutineContext.get(r0.f315206b);
        if (r0Var == null || (strT = r0Var.T()) == null) {
            strT = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iG3 = StringsKt.G3(name, " @", 0, false, 6, null);
        if (iG3 < 0) {
            iG3 = name.length();
        }
        StringBuilder sb2 = new StringBuilder(strT.length() + iG3 + 10);
        String strSubstring = name.substring(0, iG3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append(" @");
        sb2.append(strT);
        sb2.append('#');
        sb2.append(this.f315203a);
        threadCurrentThread.setName(sb2.toString());
        return name;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.f315203a == ((q0) obj).f315203a;
    }

    public final long h() {
        return this.f315203a;
    }

    public int hashCode() {
        return Long.hashCode(this.f315203a);
    }

    @NotNull
    public final q0 j(long j10) {
        return new q0(j10);
    }

    @NotNull
    public String toString() {
        return "CoroutineId(" + this.f315203a + ')';
    }
}
