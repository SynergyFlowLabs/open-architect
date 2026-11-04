package androidx.navigation.compose;

import androidx.navigation.a2;
import androidx.navigation.b2;
import androidx.navigation.d3;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@b2
public final class o extends a2<n.b> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f70808l = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n f70809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.window.k f70810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final pj.n<androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> f70811k;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull n nVar, @NotNull String str, @NotNull androidx.compose.ui.window.k kVar, @NotNull pj.n<? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2) {
        super(nVar, str);
        this.f70809i = nVar;
        this.f70810j = kVar;
        this.f70811k = nVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.navigation.a2
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public n.b o() {
        return new n.b(this.f70809i, this.f70810j, this.f70811k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull n nVar, @NotNull kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull androidx.compose.ui.window.k kVar, @NotNull pj.n<? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2) {
        super(nVar, dVar, map);
        this.f70809i = nVar;
        this.f70810j = kVar;
        this.f70811k = nVar2;
    }
}
