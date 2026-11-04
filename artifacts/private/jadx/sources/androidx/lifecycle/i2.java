package androidx.lifecycle;

import androidx.lifecycle.f2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class i2<VM extends f2> implements kotlin.f0<VM> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<VM> f52364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<l2> f52365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<j2.c> f52366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<v2.a> f52367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private VM f52368e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public i2(@NotNull kotlin.reflect.d<VM> viewModelClass, @NotNull Function0<? extends l2> storeProducer, @NotNull Function0<? extends j2.c> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v2.a.b b() {
        return v2.a.b.f381327c;
    }

    @Override // kotlin.f0
    public boolean Z() {
        return this.f52368e != null;
    }

    @Override // kotlin.f0
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm2 = this.f52368e;
        if (vm2 == null) {
            vm2 = (VM) j2.f52401b.a(this.f52365b.invoke(), this.f52366c.invoke(), this.f52367d.invoke()).f(this.f52364a);
            this.f52368e = vm2;
        }
        return vm2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public i2(@NotNull kotlin.reflect.d<VM> viewModelClass, @NotNull Function0<? extends l2> storeProducer, @NotNull Function0<? extends j2.c> factoryProducer, @NotNull Function0<? extends v2.a> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f52364a = viewModelClass;
        this.f52365b = storeProducer;
        this.f52366c = factoryProducer;
        this.f52367d = extrasProducer;
    }

    public /* synthetic */ i2(kotlin.reflect.d dVar, Function0 function0, Function0 function1, Function0 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, function0, function1, (i10 & 8) != 0 ? new Function0() { // from class: androidx.lifecycle.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i2.b();
            }
        } : function2);
    }
}
