package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nWebSocketExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketExtension.kt\nio/ktor/websocket/WebSocketExtensionsConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1563#2:168\n1634#2,3:169\n1#3:172\n*S KotlinDebug\n*F\n+ 1 WebSocketExtension.kt\nio/ktor/websocket/WebSocketExtensionsConfig\n*L\n157#1:168\n157#1:169,3\n*E\n"})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Function0<e0<?>>> f297336a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Boolean[] f297337b;

    public m0() {
        Boolean bool = Boolean.FALSE;
        this.f297337b = new Boolean[]{bool, bool, bool};
    }

    private final void d(f0<?, ?> f0Var) {
        boolean z10 = true;
        if ((!f0Var.c() || !this.f297337b[1].booleanValue()) && ((!f0Var.d() || !this.f297337b[2].booleanValue()) && (!f0Var.a() || !this.f297337b[3].booleanValue()))) {
            z10 = false;
        }
        if (z10) {
            throw new IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.");
        }
    }

    public static /* synthetic */ void f(m0 m0Var, f0 f0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.websocket.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return m0.g(obj2);
                }
            };
        }
        m0Var.e(f0Var, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 h(f0 f0Var, Function1 function1) {
        return f0Var.b(function1);
    }

    @NotNull
    public final List<e0<?>> c() {
        List<Function0<e0<?>>> list = this.f297336a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((e0) ((Function0) it.next()).invoke());
        }
        return arrayList;
    }

    public final <ConfigType> void e(@NotNull final f0<ConfigType, ?> extension, @NotNull final Function1<? super ConfigType, Unit> config) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(config, "config");
        d(extension);
        this.f297336a.add(new Function0() { // from class: io.ktor.websocket.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m0.h(extension, config);
            }
        });
    }
}
