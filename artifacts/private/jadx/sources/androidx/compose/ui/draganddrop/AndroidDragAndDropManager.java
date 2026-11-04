package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.a0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidDragAndDropManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropManager.android.kt\nandroidx/compose/ui/draganddrop/AndroidDragAndDropManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1#2:122\n1863#3,2:123\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropManager.android.kt\nandroidx/compose/ui/draganddrop/AndroidDragAndDropManager\n*L\n86#1:123,2\n*E\n"})
public final class AndroidDragAndDropManager implements View.OnDragListener, c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37171e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n<k, n0.n, Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit>, Boolean> f37172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f37173b = new e(null, null, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.c<i> f37174c = new androidx.collection.c<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a0 f37175d = new e1<e>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.e1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.e1
        public int hashCode() {
            return this.f37179c.f37173b.hashCode();
        }

        @Override // androidx.compose.ui.node.e1
        public void j(t2 t2Var) {
            t2Var.d("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.e1
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public e a() {
            return this.f37179c.f37173b;
        }

        @Override // androidx.compose.ui.node.e1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void k(e eVar) {
        }
    };

    static final class a extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f37176a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1.a aVar) {
            super(0);
            this.f37176a = aVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f37176a.f312744a);
        }
    }

    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f37177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AndroidDragAndDropManager f37178b;

        b(i1.a aVar, AndroidDragAndDropManager androidDragAndDropManager) {
            this.f37177a = aVar;
            this.f37178b = androidDragAndDropManager;
        }

        @Override // androidx.compose.ui.draganddrop.h
        public boolean a(k kVar, long j10, Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
            this.f37177a.f312744a = ((Boolean) this.f37178b.f37172a.invoke(kVar, n0.n.c(j10), function1)).booleanValue();
            return this.f37177a.f312744a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidDragAndDropManager(@NotNull n<? super k, ? super n0.n, ? super Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit>, Boolean> nVar) {
        this.f37172a = nVar;
    }

    @Override // androidx.compose.ui.draganddrop.c
    @NotNull
    public a0 a() {
        return this.f37175d;
    }

    @Override // androidx.compose.ui.draganddrop.c
    public boolean g0() {
        return true;
    }

    @Override // androidx.compose.ui.draganddrop.c
    public void h0(@NotNull i iVar) {
        this.f37174c.add(iVar);
    }

    @Override // androidx.compose.ui.draganddrop.c
    public void i0(@NotNull e eVar, long j10) {
        i1.a aVar = new i1.a();
        eVar.F9(new b(aVar, this), j10, new a(aVar));
    }

    @Override // androidx.compose.ui.draganddrop.c
    public boolean j0(@NotNull i iVar) {
        return this.f37174c.contains(iVar);
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(@NotNull View view, @NotNull DragEvent dragEvent) {
        androidx.compose.ui.draganddrop.b bVar = new androidx.compose.ui.draganddrop.b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zV6 = this.f37173b.v6(bVar);
                Iterator<i> it = this.f37174c.iterator();
                while (it.hasNext()) {
                    it.next().w0(bVar);
                }
                return zV6;
            case 2:
                this.f37173b.Q4(bVar);
                return false;
            case 3:
                return this.f37173b.u2(bVar);
            case 4:
                this.f37173b.G4(bVar);
                this.f37174c.clear();
                return false;
            case 5:
                this.f37173b.Z5(bVar);
                return false;
            case 6:
                this.f37173b.c1(bVar);
                return false;
            default:
                return false;
        }
    }
}
