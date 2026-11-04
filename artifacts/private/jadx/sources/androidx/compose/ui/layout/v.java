package androidx.compose.ui.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsRulers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsRulers.kt\nandroidx/compose/ui/layout/InnermostAnimationProperties\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,361:1\n12574#2,2:362\n12574#2,2:364\n*S KotlinDebug\n*F\n+ 1 WindowInsetsRulers.kt\nandroidx/compose/ui/layout/InnermostAnimationProperties\n*L\n347#1:362,2\n350#1:364,2\n*E\n"})
final class v implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i2.a f39565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k3[] f39566b;

    public v(@NotNull i2.a aVar, @NotNull k3[] k3VarArr) {
        this.f39565a = aVar;
        this.f39566b = k3VarArr;
    }

    @Override // androidx.compose.ui.layout.j3
    @NotNull
    public m2 P() {
        return m3.b();
    }

    @Override // androidx.compose.ui.layout.j3
    public long a() {
        return 0L;
    }

    @Override // androidx.compose.ui.layout.j3
    public boolean b() {
        for (k3 k3Var : this.f39566b) {
            if (k3Var.c(this.f39565a).b()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final k3[] c() {
        return this.f39566b;
    }

    @NotNull
    public final i2.a d() {
        return this.f39565a;
    }

    @Override // androidx.compose.ui.layout.j3
    public boolean isVisible() {
        for (k3 k3Var : this.f39566b) {
            if (k3Var.c(this.f39565a).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.j3
    public float r() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.layout.j3
    @NotNull
    public m2 y1() {
        return m3.b();
    }

    @Override // androidx.compose.ui.layout.j3
    public float z1() {
        return 0.0f;
    }
}
