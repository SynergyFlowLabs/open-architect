package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends androidx.compose.ui.node.e1<g8> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f15831h = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final r1 f15832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> f15834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f15835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f15836g;

    @SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/WrapContentElement$Companion\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1134:1\n54#2:1135\n59#2:1139\n85#3:1136\n80#3:1138\n90#3:1140\n80#3:1142\n32#4:1137\n32#4:1141\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/WrapContentElement$Companion\n*L\n973#1:1135\n984#1:1139\n973#1:1136\n973#1:1138\n984#1:1140\n984#1:1142\n973#1:1137\n984#1:1141\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.q e(androidx.compose.ui.e.c cVar, androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.w wVar) {
            return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) 0) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) cVar.a(0, (int) (uVar.q() & com.rabbitmq.client.k0.f265952a))))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.q g(androidx.compose.ui.e eVar, androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.w wVar) {
            return androidx.compose.ui.unit.q.c(eVar.a(androidx.compose.ui.unit.u.f42720b.a(), uVar.q(), wVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.q i(androidx.compose.ui.e.b bVar, androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.w wVar) {
            return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) bVar.a(0, (int) (uVar.q() >> 32), wVar)) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a)));
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final WrapContentElement d(@NotNull final androidx.compose.ui.e.c cVar, boolean z10) {
            return new WrapContentElement(r1.Vertical, z10, new Function2() { // from class: androidx.compose.foundation.layout.d8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WrapContentElement.a.e(cVar, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.w) obj2);
                }
            }, cVar, "wrapContentHeight");
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final WrapContentElement f(@NotNull final androidx.compose.ui.e eVar, boolean z10) {
            return new WrapContentElement(r1.Both, z10, new Function2() { // from class: androidx.compose.foundation.layout.e8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WrapContentElement.a.g(eVar, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.w) obj2);
                }
            }, eVar, "wrapContentSize");
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final WrapContentElement h(@NotNull final androidx.compose.ui.e.b bVar, boolean z10) {
            return new WrapContentElement(r1.Horizontal, z10, new Function2() { // from class: androidx.compose.foundation.layout.c8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WrapContentElement.a.i(bVar, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.w) obj2);
                }
            }, bVar, "wrapContentWidth");
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(@NotNull r1 r1Var, boolean z10, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> function2, @NotNull Object obj, @NotNull String str) {
        this.f15832c = r1Var;
        this.f15833d = z10;
        this.f15834e = function2;
        this.f15835f = obj;
        this.f15836g = str;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && WrapContentElement.class == obj.getClass()) {
            WrapContentElement wrapContentElement = (WrapContentElement) obj;
            return this.f15832c == wrapContentElement.f15832c && this.f15833d == wrapContentElement.f15833d && Intrinsics.areEqual(this.f15835f, wrapContentElement.f15835f);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f15832c.hashCode() * 31) + Boolean.hashCode(this.f15833d)) * 31) + this.f15835f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d(this.f15836g);
        t2Var.b().c("align", this.f15835f);
        t2Var.b().c("unbounded", Boolean.valueOf(this.f15833d));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g8 a() {
        return new g8(this.f15832c, this.f15833d, this.f15834e);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g8 g8Var) {
        g8Var.B9(this.f15832c);
        g8Var.C9(this.f15833d);
        g8Var.A9(this.f15834e);
    }
}
