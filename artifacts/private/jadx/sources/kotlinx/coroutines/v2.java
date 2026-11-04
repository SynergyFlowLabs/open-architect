package kotlinx.coroutines;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class v2 extends kotlinx.coroutines.internal.f0 implements o1, i2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w2 f315662d;

    @NotNull
    public final w2 C() {
        w2 w2Var = this.f315662d;
        if (w2Var != null) {
            return w2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract boolean D();

    public abstract void E(@Nullable Throwable th2);

    public final void F(@NotNull w2 w2Var) {
        this.f315662d = w2Var;
    }

    @Override // kotlinx.coroutines.i2
    @Nullable
    public b3 a() {
        return null;
    }

    @Override // kotlinx.coroutines.o1
    public void dispose() {
        C().O1(this);
    }

    @Override // kotlinx.coroutines.i2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.f0
    @NotNull
    public String toString() {
        return x0.a(this) + '@' + x0.b(this) + "[job@" + x0.b(C()) + AbstractJsonLexerKt.END_LIST;
    }
}
