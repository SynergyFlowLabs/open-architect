package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1134:1\n110#2:1135\n110#2:1136\n110#2:1137\n110#2:1138\n110#2:1139\n110#2:1140\n110#2:1141\n110#2:1142\n110#2:1143\n110#2:1144\n110#2:1145\n110#2:1146\n110#2:1147\n110#2:1148\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n68#1:1135\n95#1:1136\n124#1:1137\n154#1:1138\n189#1:1139\n211#1:1140\n240#1:1141\n272#1:1142\n302#1:1143\n334#1:1144\n362#1:1145\n397#1:1146\n420#1:1147\n451#1:1148\n*E\n"})
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final FillElement f16098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final FillElement f16099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final FillElement f16100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f16101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f16102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f16103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f16104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f16105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final WrapContentElement f16106i;

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n96#2,3:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16107a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10) {
            super(1);
            this.f16107a = f10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("height");
            t2Var.e(androidx.compose.ui.unit.h.o(this.f16107a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n212#2,4:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f16109b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11) {
            super(1);
            this.f16108a = f10;
            this.f16109b = f11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("heightIn");
            t2Var.b().c("min", androidx.compose.ui.unit.h.o(this.f16108a));
            t2Var.b().c("max", androidx.compose.ui.unit.h.o(this.f16109b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n303#2,3:111\n*E\n"})
    public static final class c extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10) {
            super(1);
            this.f16110a = f10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredHeight");
            t2Var.e(androidx.compose.ui.unit.h.o(this.f16110a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n421#2,4:111\n*E\n"})
    public static final class d extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f16112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10, float f11) {
            super(1);
            this.f16111a = f10;
            this.f16112b = f11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredHeightIn");
            t2Var.b().c("min", androidx.compose.ui.unit.h.o(this.f16111a));
            t2Var.b().c("max", androidx.compose.ui.unit.h.o(this.f16112b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n335#2,3:111\n*E\n"})
    public static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16113a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f10) {
            super(1);
            this.f16113a = f10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredSize");
            t2Var.e(androidx.compose.ui.unit.h.o(this.f16113a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n363#2,4:111\n*E\n"})
    public static final class f extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f16115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f10, float f11) {
            super(1);
            this.f16114a = f10;
            this.f16115b = f11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredSize");
            t2Var.b().c("width", androidx.compose.ui.unit.h.o(this.f16114a));
            t2Var.b().c("height", androidx.compose.ui.unit.h.o(this.f16115b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n452#2,6:111\n*E\n"})
    public static final class g extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f16117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f16118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f16119d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f10, float f11, float f12, float f13) {
            super(1);
            this.f16116a = f10;
            this.f16117b = f11;
            this.f16118c = f12;
            this.f16119d = f13;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredSizeIn");
            t2Var.b().c("minWidth", androidx.compose.ui.unit.h.o(this.f16116a));
            t2Var.b().c("minHeight", androidx.compose.ui.unit.h.o(this.f16117b));
            t2Var.b().c("maxWidth", androidx.compose.ui.unit.h.o(this.f16118c));
            t2Var.b().c("maxHeight", androidx.compose.ui.unit.h.o(this.f16119d));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n273#2,3:111\n*E\n"})
    public static final class h extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f10) {
            super(1);
            this.f16120a = f10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredWidth");
            t2Var.e(androidx.compose.ui.unit.h.o(this.f16120a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n398#2,4:111\n*E\n"})
    public static final class i extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f16122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f10, float f11) {
            super(1);
            this.f16121a = f10;
            this.f16122b = f11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredWidthIn");
            t2Var.b().c("min", androidx.compose.ui.unit.h.o(this.f16121a));
            t2Var.b().c("max", androidx.compose.ui.unit.h.o(this.f16122b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n125#2,3:111\n*E\n"})
    public static final class j extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16123a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f10) {
            super(1);
            this.f16123a = f10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("size");
            t2Var.e(androidx.compose.ui.unit.h.o(this.f16123a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n155#2,4:111\n*E\n"})
    public static final class k extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f16125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f10, float f11) {
            super(1);
            this.f16124a = f10;
            this.f16125b = f11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("size");
            t2Var.b().c("width", androidx.compose.ui.unit.h.o(this.f16124a));
            t2Var.b().c("height", androidx.compose.ui.unit.h.o(this.f16125b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n241#2,6:111\n*E\n"})
    public static final class l extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f16127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f16128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f16129d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f10, float f11, float f12, float f13) {
            super(1);
            this.f16126a = f10;
            this.f16127b = f11;
            this.f16128c = f12;
            this.f16129d = f13;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("sizeIn");
            t2Var.b().c("minWidth", androidx.compose.ui.unit.h.o(this.f16126a));
            t2Var.b().c("minHeight", androidx.compose.ui.unit.h.o(this.f16127b));
            t2Var.b().c("maxWidth", androidx.compose.ui.unit.h.o(this.f16128c));
            t2Var.b().c("maxHeight", androidx.compose.ui.unit.h.o(this.f16129d));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n69#2,3:111\n*E\n"})
    public static final class m extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f10) {
            super(1);
            this.f16130a = f10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("width");
            t2Var.e(androidx.compose.ui.unit.h.o(this.f16130a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,110:1\n190#2,4:111\n*E\n"})
    public static final class n extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f16132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(float f10, float f11) {
            super(1);
            this.f16131a = f10;
            this.f16132b = f11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("widthIn");
            t2Var.b().c("min", androidx.compose.ui.unit.h.o(this.f16131a));
            t2Var.b().c("max", androidx.compose.ui.unit.h.o(this.f16132b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    static {
        FillElement.a aVar = FillElement.f15786f;
        f16098a = aVar.c(1.0f);
        f16099b = aVar.a(1.0f);
        f16100c = aVar.b(1.0f);
        WrapContentElement.a aVar2 = WrapContentElement.f15831h;
        androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
        int i10 = 7 >> 0;
        f16101d = aVar2.h(aVar3.m(), false);
        f16102e = aVar2.h(aVar3.u(), false);
        f16103f = aVar2.d(aVar3.q(), false);
        f16104g = aVar2.d(aVar3.w(), false);
        f16105h = aVar2.f(aVar3.i(), false);
        f16106i = aVar2.f(aVar3.C(), false);
    }

    public static /* synthetic */ androidx.compose.ui.a0 A(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return z(a0Var, f10, f11, f12, f13);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 B(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        return a0Var.B2(new SizeElement(f10, 0.0f, f10, 0.0f, true, androidx.compose.ui.platform.r2.e() ? new m(f10) : androidx.compose.ui.platform.r2.b(), 10, null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 C(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11) {
        return a0Var.B2(new SizeElement(f10, 0.0f, f11, 0.0f, true, androidx.compose.ui.platform.r2.e() ? new n(f10, f11) : androidx.compose.ui.platform.r2.b(), 10, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 D(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return C(a0Var, f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 E(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.c cVar, boolean z10) {
        WrapContentElement wrapContentElementD;
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        if (!Intrinsics.areEqual(cVar, aVar.q()) || z10) {
            wrapContentElementD = (!Intrinsics.areEqual(cVar, aVar.w()) || z10) ? WrapContentElement.f15831h.d(cVar, z10) : f16104g;
        } else {
            wrapContentElementD = f16103f;
        }
        return a0Var.B2(wrapContentElementD);
    }

    public static /* synthetic */ androidx.compose.ui.a0 F(androidx.compose.ui.a0 a0Var, androidx.compose.ui.e.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = androidx.compose.ui.e.f37317a.q();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E(a0Var, cVar, z10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 G(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e eVar, boolean z10) {
        WrapContentElement wrapContentElementF;
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        if (!Intrinsics.areEqual(eVar, aVar.i()) || z10) {
            wrapContentElementF = (!Intrinsics.areEqual(eVar, aVar.C()) || z10) ? WrapContentElement.f15831h.f(eVar, z10) : f16106i;
        } else {
            wrapContentElementF = f16105h;
        }
        return a0Var.B2(wrapContentElementF);
    }

    public static /* synthetic */ androidx.compose.ui.a0 H(androidx.compose.ui.a0 a0Var, androidx.compose.ui.e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = androidx.compose.ui.e.f37317a.i();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return G(a0Var, eVar, z10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 I(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.b bVar, boolean z10) {
        WrapContentElement wrapContentElementH;
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        if (!Intrinsics.areEqual(bVar, aVar.m()) || z10) {
            wrapContentElementH = (!Intrinsics.areEqual(bVar, aVar.u()) || z10) ? WrapContentElement.f15831h.h(bVar, z10) : f16102e;
        } else {
            wrapContentElementH = f16101d;
        }
        return a0Var.B2(wrapContentElementH);
    }

    public static /* synthetic */ androidx.compose.ui.a0 J(androidx.compose.ui.a0 a0Var, androidx.compose.ui.e.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = androidx.compose.ui.e.f37317a.m();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return I(a0Var, bVar, z10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11) {
        return a0Var.B2(new UnspecifiedConstraintsElement(f10, f11, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return a(a0Var, f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return a0Var.B2(f10 == 1.0f ? f16099b : FillElement.f15786f.a(f10));
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return c(a0Var, f10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return a0Var.B2(f10 == 1.0f ? f16100c : FillElement.f15786f.b(f10));
    }

    public static /* synthetic */ androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return e(a0Var, f10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return a0Var.B2(f10 == 1.0f ? f16098a : FillElement.f15786f.c(f10));
    }

    public static /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return g(a0Var, f10);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 i(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        return a0Var.B2(new SizeElement(0.0f, f10, 0.0f, f10, true, androidx.compose.ui.platform.r2.e() ? new a(f10) : androidx.compose.ui.platform.r2.b(), 5, null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11) {
        return a0Var.B2(new SizeElement(0.0f, f10, 0.0f, f11, true, androidx.compose.ui.platform.r2.e() ? new b(f10, f11) : androidx.compose.ui.platform.r2.b(), 5, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 k(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return j(a0Var, f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 l(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        return a0Var.B2(new SizeElement(0.0f, f10, 0.0f, f10, false, androidx.compose.ui.platform.r2.e() ? new c(f10) : androidx.compose.ui.platform.r2.b(), 5, null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 m(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11) {
        return a0Var.B2(new SizeElement(0.0f, f10, 0.0f, f11, false, androidx.compose.ui.platform.r2.e() ? new d(f10, f11) : androidx.compose.ui.platform.r2.b(), 5, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 n(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return m(a0Var, f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 o(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        return a0Var.B2(new SizeElement(f10, f10, f10, f10, false, androidx.compose.ui.platform.r2.e() ? new e(f10) : androidx.compose.ui.platform.r2.b(), null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 p(@NotNull androidx.compose.ui.a0 a0Var, long j10) {
        return q(a0Var, androidx.compose.ui.unit.l.p(j10), androidx.compose.ui.unit.l.m(j10));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 q(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11) {
        return a0Var.B2(new SizeElement(f10, f11, f10, f11, false, androidx.compose.ui.platform.r2.e() ? new f(f10, f11) : androidx.compose.ui.platform.r2.b(), null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 r(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13) {
        return a0Var.B2(new SizeElement(f10, f11, f12, f13, false, androidx.compose.ui.platform.r2.e() ? new g(f10, f11, f12, f13) : androidx.compose.ui.platform.r2.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 s(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return r(a0Var, f10, f11, f12, f13);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 t(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        return a0Var.B2(new SizeElement(f10, 0.0f, f10, 0.0f, false, androidx.compose.ui.platform.r2.e() ? new h(f10) : androidx.compose.ui.platform.r2.b(), 10, null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 u(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11) {
        return a0Var.B2(new SizeElement(f10, 0.0f, f11, 0.0f, false, androidx.compose.ui.platform.r2.e() ? new i(f10, f11) : androidx.compose.ui.platform.r2.b(), 10, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 v(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return u(a0Var, f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 w(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        return a0Var.B2(new SizeElement(f10, f10, f10, f10, true, androidx.compose.ui.platform.r2.e() ? new j(f10) : androidx.compose.ui.platform.r2.b(), null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 x(@NotNull androidx.compose.ui.a0 a0Var, long j10) {
        return y(a0Var, androidx.compose.ui.unit.l.p(j10), androidx.compose.ui.unit.l.m(j10));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 y(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11) {
        return a0Var.B2(new SizeElement(f10, f11, f10, f11, true, androidx.compose.ui.platform.r2.e() ? new k(f10, f11) : androidx.compose.ui.platform.r2.b(), null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 z(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13) {
        return a0Var.B2(new SizeElement(f10, f11, f12, f13, true, androidx.compose.ui.platform.r2.e() ? new l(f10, f11, f12, f13) : androidx.compose.ui.platform.r2.b(), null));
    }
}
