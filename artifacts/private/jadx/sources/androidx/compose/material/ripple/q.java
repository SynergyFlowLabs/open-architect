package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleHostMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<p, s> f24820a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<s, p> f24821b = new LinkedHashMap();

    @Nullable
    public final p a(@NotNull s sVar) {
        return this.f24821b.get(sVar);
    }

    @Nullable
    public final s b(@NotNull p pVar) {
        return this.f24820a.get(pVar);
    }

    public final void c(@NotNull p pVar) {
        s sVar = this.f24820a.get(pVar);
        if (sVar != null) {
            this.f24821b.remove(sVar);
        }
        this.f24820a.remove(pVar);
    }

    public final void d(@NotNull p pVar, @NotNull s sVar) {
        this.f24820a.put(pVar, sVar);
        this.f24821b.put(sVar, pVar);
    }
}
