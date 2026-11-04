package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.ui.draganddrop.i;
import androidx.compose.ui.draganddrop.j;
import androidx.compose.ui.draganddrop.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f14014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Unit> f14015b;

        /* JADX WARN: Multi-variable type inference failed */
        a(c cVar, Function1<? super androidx.compose.ui.draganddrop.b, Unit> function1) {
            this.f14014a = cVar;
            this.f14015b = function1;
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void G4(androidx.compose.ui.draganddrop.b bVar) {
            this.f14014a.a().d();
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void Z5(androidx.compose.ui.draganddrop.b bVar) {
            this.f14014a.a().b();
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void c1(androidx.compose.ui.draganddrop.b bVar) {
            this.f14014a.a().e();
        }

        @Override // androidx.compose.ui.draganddrop.i
        public boolean u2(androidx.compose.ui.draganddrop.b bVar) {
            this.f14015b.invoke(bVar);
            w.g gVarD = h.d(bVar);
            return !Intrinsics.areEqual(gVarD, this.f14014a.a().a(gVarD));
        }

        @Override // androidx.compose.ui.draganddrop.i
        public void w0(androidx.compose.ui.draganddrop.b bVar) {
            this.f14014a.a().c();
        }
    }

    @NotNull
    public static final j b(@NotNull c cVar, @NotNull Function1<? super androidx.compose.ui.draganddrop.b, Unit> function1) {
        return androidx.compose.ui.draganddrop.f.d(new Function1() { // from class: androidx.compose.foundation.content.internal.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(h.c((androidx.compose.ui.draganddrop.b) obj));
            }
        }, new a(cVar, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(androidx.compose.ui.draganddrop.b bVar) {
        return true;
    }

    @NotNull
    public static final w.g d(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        DragEvent dragEventC = l.c(bVar);
        return new w.g(androidx.compose.ui.platform.g.c(dragEventC.getClipData()), androidx.compose.ui.platform.g.d(dragEventC.getClipDescription()), w.g.a.f385811b.b(), null, 8, null);
    }
}
