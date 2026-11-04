package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.saveable.v;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.platform.t4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"})
public final class k<T extends View> extends androidx.compose.ui.viewinterop.b implements t4 {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f42834v3 = 8;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final T f42835m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.nestedscroll.b f42836n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private final v f42837o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private final int f42838p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private final String f42839q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @Nullable
    private v.a f42840r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    private Function1<? super T, Unit> f42841s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NotNull
    private Function1<? super T, Unit> f42842t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NotNull
    private Function1<? super T, Unit> f42843u3;

    @SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder$registerSaveStateProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"})
    static final class a extends l0 implements Function0<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k<T> f42844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k<T> kVar) {
            super(0);
            this.f42844a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((k) this.f42844a).f42835m3.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    static final class b extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k<T> f42845a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k<T> kVar) {
            super(0);
            this.f42845a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f42845a.getReleaseBlock().invoke(((k) this.f42845a).f42835m3);
            this.f42845a.M();
        }
    }

    static final class c extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k<T> f42846a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k<T> kVar) {
            super(0);
            this.f42846a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f42846a.getResetBlock().invoke(((k) this.f42846a).f42835m3);
        }
    }

    static final class d extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k<T> f42847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k<T> kVar) {
            super(0);
            this.f42847a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f42847a.getUpdateBlock().invoke(((k) this.f42847a).f42835m3);
        }
    }

    /* synthetic */ k(Context context, p0 p0Var, View view, androidx.compose.ui.input.nestedscroll.b bVar, v vVar, int i10, x1 x1Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : p0Var, view, (i11 & 8) != 0 ? new androidx.compose.ui.input.nestedscroll.b() : bVar, vVar, i10, x1Var);
    }

    private final void L() {
        v vVar = this.f42837o3;
        if (vVar != null) {
            setSavableRegistryEntry(vVar.b(this.f42839q3, new a(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(v.a aVar) {
        v.a aVar2 = this.f42840r3;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f42840r3 = aVar;
    }

    @NotNull
    public final androidx.compose.ui.input.nestedscroll.b getDispatcher() {
        return this.f42836n3;
    }

    @NotNull
    public final Function1<T, Unit> getReleaseBlock() {
        return this.f42843u3;
    }

    @NotNull
    public final Function1<T, Unit> getResetBlock() {
        return this.f42842t3;
    }

    @NotNull
    public final Function1<T, Unit> getUpdateBlock() {
        return this.f42841s3;
    }

    @Override // androidx.compose.ui.platform.t4
    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@NotNull Function1<? super T, Unit> function1) {
        this.f42843u3 = function1;
        setRelease(new b(this));
    }

    public final void setResetBlock(@NotNull Function1<? super T, Unit> function1) {
        this.f42842t3 = function1;
        setReset(new c(this));
    }

    public final void setUpdateBlock(@NotNull Function1<? super T, Unit> function1) {
        this.f42841s3 = function1;
        setUpdate(new d(this));
    }

    private k(Context context, p0 p0Var, T t10, androidx.compose.ui.input.nestedscroll.b bVar, v vVar, int i10, x1 x1Var) {
        super(context, p0Var, i10, bVar, t10, x1Var);
        this.f42835m3 = t10;
        this.f42836n3 = bVar;
        this.f42837o3 = vVar;
        this.f42838p3 = i10;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        this.f42839q3 = strValueOf;
        Object objF = vVar != null ? vVar.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            t10.restoreHierarchyState(sparseArray);
        }
        L();
        this.f42841s3 = e.e();
        this.f42842t3 = e.e();
        this.f42843u3 = e.e();
    }

    public /* synthetic */ k(Context context, Function1 function1, p0 p0Var, v vVar, int i10, x1 x1Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function1, (i11 & 4) != 0 ? null : p0Var, vVar, i10, x1Var);
    }

    public k(@NotNull Context context, @NotNull Function1<? super Context, ? extends T> function1, @Nullable p0 p0Var, @Nullable v vVar, int i10, @NotNull x1 x1Var) {
        this(context, p0Var, function1.invoke(context), null, vVar, i10, x1Var, 8, null);
    }
}
