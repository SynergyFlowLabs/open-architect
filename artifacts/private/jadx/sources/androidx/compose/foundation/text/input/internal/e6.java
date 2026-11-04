package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldDragAndDropNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDragAndDropNode.android.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDragAndDropNode_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1755#2,3:77\n*S KotlinDebug\n*F\n+ 1 TextFieldDragAndDropNode.android.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDragAndDropNode_androidKt\n*L\n47#1:77,3\n*E\n"})
public final class e6 {

    @SourceDebugExtension({"SMAP\nTextFieldDragAndDropNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDragAndDropNode.android.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,76:1\n1#2:77\n30#3:78\n53#4,3:79\n*S KotlinDebug\n*F\n+ 1 TextFieldDragAndDropNode.android.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2\n*L\n66#1:78\n66#1:79,3\n*E\n"})
    public static final class a implements androidx.compose.ui.draganddrop.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Unit> f19583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.ui.platform.k1, androidx.compose.ui.platform.l1, Boolean> f19584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Unit> f19585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Unit> f19586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f19587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Unit> f19588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Unit> f19589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Unit> f19590h;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super androidx.compose.ui.draganddrop.b, Unit> function1, Function2<? super androidx.compose.ui.platform.k1, ? super androidx.compose.ui.platform.l1, Boolean> function2, Function1<? super androidx.compose.ui.draganddrop.b, Unit> function3, Function1<? super androidx.compose.ui.draganddrop.b, Unit> function4, Function1<? super n0.g, Unit> function5, Function1<? super androidx.compose.ui.draganddrop.b, Unit> function6, Function1<? super androidx.compose.ui.draganddrop.b, Unit> function7, Function1<? super androidx.compose.ui.draganddrop.b, Unit> function8) {
            this.f19583a = function1;
            this.f19584b = function2;
            this.f19585c = function3;
            this.f19586d = function4;
            this.f19587e = function5;
            this.f19588f = function6;
            this.f19589g = function7;
            this.f19590h = function8;
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void G4(androidx.compose.ui.draganddrop.b bVar) {
            Function1<androidx.compose.ui.draganddrop.b, Unit> function1 = this.f19590h;
            if (function1 != null) {
                function1.invoke(bVar);
            }
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void I1(androidx.compose.ui.draganddrop.b bVar) {
            Function1<androidx.compose.ui.draganddrop.b, Unit> function1 = this.f19589g;
            if (function1 != null) {
                function1.invoke(bVar);
            }
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void Q4(androidx.compose.ui.draganddrop.b bVar) {
            DragEvent dragEventC = androidx.compose.ui.draganddrop.l.c(bVar);
            Function1<n0.g, Unit> function1 = this.f19587e;
            if (function1 != null) {
                float x10 = dragEventC.getX();
                float y10 = dragEventC.getY();
                function1.invoke(n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(x10)) << 32) | (((long) Float.floatToRawIntBits(y10)) & com.rabbitmq.client.k0.f265952a))));
            }
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void Z5(androidx.compose.ui.draganddrop.b bVar) {
            Function1<androidx.compose.ui.draganddrop.b, Unit> function1 = this.f19586d;
            if (function1 != null) {
                function1.invoke(bVar);
            }
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void c1(androidx.compose.ui.draganddrop.b bVar) {
            Function1<androidx.compose.ui.draganddrop.b, Unit> function1 = this.f19588f;
            if (function1 != null) {
                function1.invoke(bVar);
            }
        }

        @Override // androidx.compose.ui.draganddrop.i
        public boolean u2(androidx.compose.ui.draganddrop.b bVar) {
            this.f19583a.invoke(bVar);
            return this.f19584b.invoke(androidx.compose.ui.platform.g.c(androidx.compose.ui.draganddrop.l.c(bVar).getClipData()), androidx.compose.ui.platform.g.d(androidx.compose.ui.draganddrop.l.c(bVar).getClipDescription())).booleanValue();
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void w0(androidx.compose.ui.draganddrop.b bVar) {
            Function1<androidx.compose.ui.draganddrop.b, Unit> function1 = this.f19585c;
            if (function1 != null) {
                function1.invoke(bVar);
            }
        }
    }

    @NotNull
    public static final androidx.compose.ui.draganddrop.j b(@NotNull final Function0<? extends Set<w.a>> function0, @NotNull Function2<? super androidx.compose.ui.platform.k1, ? super androidx.compose.ui.platform.l1, Boolean> function2, @NotNull Function1<? super androidx.compose.ui.draganddrop.b, Unit> function1, @Nullable Function1<? super androidx.compose.ui.draganddrop.b, Unit> function3, @Nullable Function1<? super androidx.compose.ui.draganddrop.b, Unit> function4, @Nullable Function1<? super n0.g, Unit> function5, @Nullable Function1<? super androidx.compose.ui.draganddrop.b, Unit> function6, @Nullable Function1<? super androidx.compose.ui.draganddrop.b, Unit> function7, @Nullable Function1<? super androidx.compose.ui.draganddrop.b, Unit> function8) {
        return androidx.compose.ui.draganddrop.f.d(new Function1() { // from class: androidx.compose.foundation.text.input.internal.d6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e6.d(function0, (androidx.compose.ui.draganddrop.b) obj));
            }
        }, new a(function1, function2, function3, function4, function5, function7, function6, function8));
    }

    public static /* synthetic */ androidx.compose.ui.draganddrop.j c(Function0 function0, Function2 function2, Function1 function1, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function3 = null;
        }
        if ((i10 & 16) != 0) {
            function4 = null;
        }
        if ((i10 & 32) != 0) {
            function5 = null;
        }
        if ((i10 & 64) != 0) {
            function6 = null;
        }
        if ((i10 & 128) != 0) {
            function7 = null;
        }
        if ((i10 & 256) != 0) {
            function8 = null;
        }
        return b(function0, function2, function1, function3, function4, function5, function6, function7, function8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Function0 function0, androidx.compose.ui.draganddrop.b bVar) {
        ClipDescription clipDescription = androidx.compose.ui.draganddrop.l.c(bVar).getClipDescription();
        Iterable<w.a> iterable = (Iterable) function0.invoke();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (w.a aVar : iterable) {
            if (Intrinsics.areEqual(aVar, w.a.f385793b.a()) || clipDescription.hasMimeType(aVar.f())) {
                return true;
            }
        }
        return false;
    }
}
