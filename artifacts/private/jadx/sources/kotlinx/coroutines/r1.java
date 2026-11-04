package kotlinx.coroutines;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class r1 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f315208a;

    public r1(boolean z10) {
        this.f315208a = z10;
    }

    @Override // kotlinx.coroutines.i2
    @Nullable
    public b3 a() {
        return null;
    }

    @Override // kotlinx.coroutines.i2
    public boolean isActive() {
        return this.f315208a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
