package com.planner5d.library.services.utility;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nReentrancyCheckingCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReentrancyCheckingCoroutineContext.kt\ncom/planner5d/library/services/utility/ReentrancyCheckingCoroutineContext\n+ 2 CollectionUtils.kt\ncom/planner5d/library/services/utility/CollectionUtils\n*L\n1#1,55:1\n19#2:56\n19#2:57\n*S KotlinDebug\n*F\n+ 1 ReentrancyCheckingCoroutineContext.kt\ncom/planner5d/library/services/utility/ReentrancyCheckingCoroutineContext\n*L\n31#1:56\n36#1:57\n*E\n"})
public final class p2 implements CoroutineContext.Element {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f229701c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<Object> f229702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext.b<?> f229703b;

    @SourceDebugExtension({"SMAP\nReentrancyCheckingCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReentrancyCheckingCoroutineContext.kt\ncom/planner5d/library/services/utility/ReentrancyCheckingCoroutineContext$Key\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,55:1\n326#2:56\n326#2:57\n*S KotlinDebug\n*F\n+ 1 ReentrancyCheckingCoroutineContext.kt\ncom/planner5d/library/services/utility/ReentrancyCheckingCoroutineContext$Key\n*L\n46#1:56\n49#1:57\n*E\n"})
    public static final class a implements CoroutineContext.b<p2> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Object a(@NotNull Object obj, @NotNull kotlin.coroutines.d<? super p2> dVar) {
            return new p2(dVar.getContext(), obj);
        }

        @Nullable
        public final Object b(@NotNull Object obj, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
            p2 p2Var = (p2) dVar.getContext().get(p2.f229701c);
            boolean z10 = false;
            if (p2Var != null && p2Var.a(obj)) {
                z10 = true;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        private a() {
        }
    }

    public p2(@NotNull CoroutineContext currentCoroutineContext, @NotNull Object reentrancyMonitor) {
        Set<Object> setNewSetFromMap;
        Intrinsics.checkNotNullParameter(currentCoroutineContext, "currentCoroutineContext");
        Intrinsics.checkNotNullParameter(reentrancyMonitor, "reentrancyMonitor");
        a aVar = f229701c;
        p2 p2Var = (p2) currentCoroutineContext.get(aVar);
        if (p2Var == null || (setNewSetFromMap = p2Var.f229702a) == null) {
            m mVar = m.f225326a;
            setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(1));
            setNewSetFromMap.add(reentrancyMonitor);
            Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "apply(...)");
        } else if (!setNewSetFromMap.contains(reentrancyMonitor)) {
            m mVar2 = m.f225326a;
            Set<Object> setNewSetFromMap2 = Collections.newSetFromMap(new IdentityHashMap(setNewSetFromMap.size() + 1));
            setNewSetFromMap2.addAll(setNewSetFromMap);
            setNewSetFromMap2.add(reentrancyMonitor);
            Intrinsics.checkNotNullExpressionValue(setNewSetFromMap2, "apply(...)");
            setNewSetFromMap = setNewSetFromMap2;
        }
        this.f229702a = setNewSetFromMap;
        this.f229703b = aVar;
    }

    public final boolean a(@NotNull Object reentrancyMonitor) {
        Intrinsics.checkNotNullParameter(reentrancyMonitor, "reentrancyMonitor");
        return this.f229702a.contains(reentrancyMonitor);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.Element.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b<?> getKey() {
        return this.f229703b;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
