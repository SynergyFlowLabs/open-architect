package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    public static final class a extends m3 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Shader f37800f;

        a(Shader shader) {
            this.f37800f = shader;
        }

        @Override // androidx.compose.ui.graphics.m3
        public Shader c(long j10) {
            return this.f37800f;
        }
    }

    @NotNull
    public static final m3 a(@NotNull Shader shader) {
        return new a(shader);
    }

    @NotNull
    public static final m3 b(@NotNull i0 i0Var) {
        if (i0Var instanceof m3) {
            return (m3) i0Var;
        }
        if (!(i0Var instanceof s3)) {
            throw new kotlin.k0();
        }
        s3 s3Var = (s3) i0Var;
        i0 i0VarT = i0.a.t(i0.f37796b, CollectionsKt.listOf((Object[]) new q0[]{q0.n(s3Var.c()), q0.n(s3Var.c())}), 0.0f, 0.0f, 0, 14, null);
        Intrinsics.checkNotNull(i0VarT, "null cannot be cast to non-null type androidx.compose.ui.graphics.ShaderBrush");
        return (m3) i0VarT;
    }
}
