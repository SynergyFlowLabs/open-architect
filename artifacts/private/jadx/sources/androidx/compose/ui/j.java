package androidx.compose.ui;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class j implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39190c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a0 f39191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a0 f39192b;

    static final class a extends l0 implements Function2<String, a0.c, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39193a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, a0.c cVar) {
            if (str.length() == 0) {
                return cVar.toString();
            }
            return str + ", " + cVar;
        }
    }

    public j(@NotNull a0 a0Var, @NotNull a0 a0Var2) {
        this.f39191a = a0Var;
        this.f39192b = a0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.a0
    public <R> R J(R r10, @NotNull Function2<? super R, ? super a0.c, ? extends R> function2) {
        return (R) this.f39192b.J(this.f39191a.J(r10, function2), function2);
    }

    @Override // androidx.compose.ui.a0
    public boolean N(@NotNull Function1<? super a0.c, Boolean> function1) {
        return this.f39191a.N(function1) && this.f39192b.N(function1);
    }

    @Override // androidx.compose.ui.a0
    public boolean X(@NotNull Function1<? super a0.c, Boolean> function1) {
        return this.f39191a.X(function1) || this.f39192b.X(function1);
    }

    @NotNull
    public final a0 a() {
        return this.f39192b;
    }

    @NotNull
    public final a0 b() {
        return this.f39191a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.a0
    public <R> R b0(R r10, @NotNull Function2<? super a0.c, ? super R, ? extends R> function2) {
        return (R) this.f39191a.b0(this.f39192b.b0(r10, function2), function2);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f39191a, jVar.f39191a) && Intrinsics.areEqual(this.f39192b, jVar.f39192b);
    }

    public int hashCode() {
        return this.f39191a.hashCode() + (this.f39192b.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + ((String) J("", a.f39193a)) + AbstractJsonLexerKt.END_LIST;
    }
}
