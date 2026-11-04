package androidx.compose.foundation.content.internal;

import androidx.compose.ui.modifier.j;
import androidx.compose.ui.modifier.p;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final p<c> f14013a = androidx.compose.ui.modifier.g.a(new Function0() { // from class: androidx.compose.foundation.content.internal.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final c b() {
        return null;
    }

    @NotNull
    public static final p<c> c() {
        return f14013a;
    }

    @Nullable
    public static final c d(@NotNull j jVar) {
        if (jVar.w().a9()) {
            return (c) jVar.I(f14013a);
        }
        return null;
    }
}
