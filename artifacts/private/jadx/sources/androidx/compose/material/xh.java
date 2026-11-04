package androidx.compose.material;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@u7
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,881:1\n17#2:882\n19#2:886\n46#3:883\n51#3:885\n105#4:884\n85#5:887\n117#5,2:888\n85#5:890\n117#5,2:891\n85#5:893\n117#5,2:894\n85#5:925\n117#5,2:926\n85#5:931\n117#5,2:932\n1#6:896\n2341#7,14:897\n2341#7,14:911\n81#8:928\n114#8,2:929\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n131#1:882\n131#1:886\n131#1:883\n131#1:885\n131#1:884\n97#1:887\n97#1:888,2\n101#1:890\n101#1:891,2\n128#1:893\n128#1:894,2\n191#1:925\n191#1:926,2\n195#1:931\n195#1:932,2\n170#1:897,14\n176#1:911,14\n193#1:928\n193#1:929,2\n*E\n"})
public class xh<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f25547q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f25548r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f25549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f25550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f25553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f25554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f25555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Float> f25556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Map<Float, T>> f25558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f25559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f25560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f25562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.a3 f25564p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(androidx.compose.runtime.saveable.g0 g0Var, xh xhVar) {
            return xhVar.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xh e(androidx.compose.animation.core.o oVar, Function1 function1, Object obj) {
            return new xh(obj, oVar, function1);
        }

        @NotNull
        public final <T> androidx.compose.runtime.saveable.c0<xh<T>, T> c(@NotNull final androidx.compose.animation.core.o<Float> oVar, @NotNull final Function1<? super T, Boolean> function1) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material.vh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return xh.a.d((androidx.compose.runtime.saveable.g0) obj, (xh) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material.wh
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return xh.a.e(oVar, function1, obj);
                }
            });
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ xh<T> f25567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f25568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f25569e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xh<T> xhVar, float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f25567c = xhVar;
            this.f25568d = f10;
            this.f25569e = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(androidx.compose.foundation.gestures.k2 k2Var, kotlin.jvm.internal.i1.e eVar, androidx.compose.animation.core.c cVar) {
            k2Var.a(((Number) cVar.v()).floatValue() - eVar.f312748a);
            eVar.f312748a = ((Number) cVar.v()).floatValue();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f25567c, this.f25568d, this.f25569e, dVar);
            bVar.f25566b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objI;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f25565a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    final androidx.compose.foundation.gestures.k2 k2Var = (androidx.compose.foundation.gestures.k2) this.f25566b;
                    final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
                    eVar.f312748a = ((xh) this.f25567c).f25555g.V0();
                    ((xh) this.f25567c).f25556h.setValue(kotlin.coroutines.jvm.internal.b.e(this.f25568d));
                    this.f25567c.O(true);
                    androidx.compose.animation.core.c cVarB = androidx.compose.animation.core.d.b(eVar.f312748a, 0.0f, 2, null);
                    Float fE = kotlin.coroutines.jvm.internal.b.e(this.f25568d);
                    androidx.compose.animation.core.o<Float> oVar = this.f25569e;
                    Function1 function1 = new Function1() { // from class: androidx.compose.material.yh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return xh.b.n(k2Var, eVar, (androidx.compose.animation.core.c) obj2);
                        }
                    };
                    this.f25565a = 1;
                    objI = androidx.compose.animation.core.c.i(cVarB, fE, oVar, null, function1, this, 4, null);
                    if (objI == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    objI = obj;
                }
                ((xh) this.f25567c).f25556h.setValue(null);
                this.f25567c.O(false);
                return Unit.f312394a;
            } catch (Throwable th2) {
                ((xh) this.f25567c).f25556h.setValue(null);
                this.f25567c.O(false);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.foundation.gestures.k2 k2Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(k2Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$animateTo$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,881:1\n1#2:882\n487#3,7:883\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$animateTo$2\n*L\n334#1:883,7\n*E\n"})
    static final class c<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f25570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xh<T> f25571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f25572c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0}, l = {327}, m = "emit", n = {"anchors"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f25573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f25574b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c<T> f25575c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f25576d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f25575c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25574b = obj;
                this.f25576d |= Integer.MIN_VALUE;
                return this.f25575c.emit(null, this);
            }
        }

        c(T t10, xh<T> xhVar, androidx.compose.animation.core.o<Float> oVar) {
            this.f25570a = t10;
            this.f25571b = xhVar;
            this.f25572c = oVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map<Float, ? extends T> map, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f25576d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f25576d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f25574b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f25576d;
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    Float fK = ph.k(map, this.f25570a);
                    if (fK == null) {
                        throw new IllegalArgumentException("The target value must have an associated anchor.");
                    }
                    xh<T> xhVar = this.f25571b;
                    float fFloatValue = fK.floatValue();
                    androidx.compose.animation.core.o<Float> oVar = this.f25572c;
                    aVar.f25573a = map;
                    aVar.f25576d = 1;
                    if (xhVar.l(fFloatValue, oVar, aVar) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) aVar.f25573a;
                    ResultKt.m(obj);
                }
                float fV0 = ((xh) this.f25571b).f25555g.V0();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Float, ? extends T> entry : map.entrySet()) {
                    if (Math.abs(entry.getKey().floatValue() - fV0) < 0.5f) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Object objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
                if (objFirstOrNull == null) {
                    objFirstOrNull = this.f25571b.t();
                }
                this.f25571b.P(objFirstOrNull);
                return Unit.f312394a;
            } catch (Throwable th2) {
                float fV1 = ((xh) this.f25571b).f25555g.V0();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Float, ? extends T> entry2 : map.entrySet()) {
                    if (Math.abs(entry2.getKey().floatValue() - fV1) < 0.5f) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Object objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap2.values());
                if (objFirstOrNull2 == null) {
                    objFirstOrNull2 = this.f25571b.t();
                }
                this.f25571b.P(objFirstOrNull2);
                throw th2;
            }
        }
    }

    static final class d<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xh<T> f25577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f25578b;

        d(xh<T> xhVar, float f10) {
            this.f25577a = xhVar;
            this.f25578b = f10;
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map<Float, ? extends T> map, kotlin.coroutines.d<? super Unit> dVar) {
            Float fK = ph.k(map, this.f25577a.t());
            Intrinsics.checkNotNull(fK);
            float fFloatValue = fK.floatValue();
            T t10 = map.get(kotlin.coroutines.jvm.internal.b.e(ph.i(this.f25577a.z().getValue().floatValue(), fFloatValue, map.keySet(), this.f25577a.G(), this.f25578b, this.f25577a.H())));
            if (t10 == null || !this.f25577a.s().invoke(t10).booleanValue()) {
                xh<T> xhVar = this.f25577a;
                Object objL = xhVar.l(fFloatValue, xhVar.r(), dVar);
                return objL == kotlin.coroutines.intrinsics.b.l() ? objL : Unit.f312394a;
            }
            int i10 = 6 & 0;
            Object objN = xh.n(this.f25577a, t10, null, dVar, 2, null);
            return objN == kotlin.coroutines.intrinsics.b.l() ? objN : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 2, 2}, l = {androidx.media2.widget.f.i.f59793p0, 179, 182}, m = "processNewAnchors$material", n = {"newAnchors", "targetOffset", "newAnchors", "targetOffset"}, s = {"L$0", "F$0", "L$0", "F$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f25579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f25580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ xh<T> f25582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25583e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(xh<T> xhVar, kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
            this.f25582d = xhVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25581c = obj;
            this.f25583e |= Integer.MIN_VALUE;
            return this.f25582d.M(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f25586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ xh<T> f25587d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f10, xh<T> xhVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f25586c = f10;
            this.f25587d = xhVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f25586c, this.f25587d, dVar);
            fVar.f25585b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25584a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((androidx.compose.foundation.gestures.k2) this.f25585b).a(this.f25586c - ((xh) this.f25587d).f25555g.V0());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.foundation.gestures.k2 k2Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(k2Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$snapTo$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,881:1\n1#2:882\n*E\n"})
    static final class g<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f25588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xh<T> f25589b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {}, l = {310}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f25590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g<T> f25591b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f25592c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(g<? super T> gVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f25591b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25590a = obj;
                this.f25592c |= Integer.MIN_VALUE;
                return this.f25591b.emit(null, this);
            }
        }

        g(T t10, xh<T> xhVar) {
            this.f25588a = t10;
            this.f25589b = xhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map<Float, ? extends T> map, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f25592c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f25592c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f25590a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f25592c;
            if (i11 == 0) {
                ResultKt.m(obj);
                Float fK = ph.k(map, this.f25588a);
                if (fK == null) {
                    throw new IllegalArgumentException("The target value must have an associated anchor.");
                }
                xh<T> xhVar = this.f25589b;
                float fFloatValue = fK.floatValue();
                aVar.f25592c = 1;
                if (xhVar.V(fFloatValue, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f25589b.P(this.f25588a);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
    public static final class h implements kotlinx.coroutines.flow.i<Map<Float, ? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f25593a;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n1#1,218:1\n18#2:219\n19#2:221\n131#3:220\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f25594a;

            /* JADX INFO: renamed from: androidx.compose.material.xh$h$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            public static final class C0204a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f25595a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f25596b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f25597c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f25598d;

                public C0204a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f25595a = obj;
                    this.f25596b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar) {
                this.f25594a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001b  */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0204a c0204a;
                if (dVar instanceof C0204a) {
                    c0204a = (C0204a) dVar;
                    int i10 = c0204a.f25596b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0204a.f25596b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0204a = new C0204a(dVar);
                    }
                } else {
                    c0204a = new C0204a(dVar);
                }
                Object obj2 = c0204a.f25595a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0204a.f25596b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f25594a;
                    if (!((Map) obj).isEmpty()) {
                        c0204a.f25596b = 1;
                        if (jVar.emit(obj, c0204a) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj2);
                }
                return Unit.f312394a;
            }
        }

        public h(kotlinx.coroutines.flow.i iVar) {
            this.f25593a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f25593a.collect(new a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xh(T t10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull Function1<? super T, Boolean> function1) {
        this.f25549a = oVar;
        this.f25550b = function1;
        this.f25551c = androidx.compose.runtime.d7.g(t10, null, 2, null);
        this.f25552d = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
        int i10 = 7 | 0;
        this.f25553e = androidx.compose.runtime.g4.b(0.0f);
        this.f25554f = androidx.compose.runtime.g4.b(0.0f);
        this.f25555g = androidx.compose.runtime.g4.b(0.0f);
        this.f25556h = androidx.compose.runtime.d7.g(null, null, 2, null);
        this.f25557i = androidx.compose.runtime.d7.g(MapsKt.emptyMap(), null, 2, null);
        this.f25558j = kotlinx.coroutines.flow.k.W1(new h(androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.material.rh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xh.J(this.f24666a);
            }
        })), 1);
        this.f25559k = Float.NEGATIVE_INFINITY;
        this.f25560l = Float.POSITIVE_INFINITY;
        this.f25561m = androidx.compose.runtime.d7.g(new Function2() { // from class: androidx.compose.material.sh
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(xh.X(((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        }, null, 2, null);
        this.f25562n = androidx.compose.runtime.g4.b(0.0f);
        this.f25563o = androidx.compose.runtime.d7.g(null, null, 2, null);
        this.f25564p = androidx.compose.foundation.gestures.x2.b(new Function1() { // from class: androidx.compose.material.th
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xh.o(this.f25018a, ((Float) obj).floatValue());
            }
        });
    }

    @u7
    public static /* synthetic */ void C() {
    }

    @u7
    public static /* synthetic */ void F() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map J(xh xhVar) {
        return xhVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(boolean z10) {
        this.f25552d.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(T t10) {
        this.f25551c.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object V(float f10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = androidx.compose.foundation.gestures.a3.c(this.f25564p, null, new f(f10, this, null), dVar, 1, null);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float X(float f10, float f11) {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = androidx.compose.foundation.gestures.a3.c(this.f25564p, null, new b(this, f10, oVar, null), dVar, 1, null);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object n(xh xhVar, Object obj, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i10 & 2) != 0) {
            oVar = xhVar.f25549a;
        }
        return xhVar.m(obj, oVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(xh xhVar, float f10) {
        float fV0 = xhVar.f25555g.V0() + f10;
        float fH = kotlin.ranges.r.H(fV0, xhVar.f25559k, xhVar.f25560l);
        float f11 = fV0 - fH;
        sd sdVarD = xhVar.D();
        xhVar.f25553e.q(fH + (sdVarD != null ? sdVarD.a(f11) : 0.0f));
        xhVar.f25554f.q(f11);
        xhVar.f25555g.q(fV0);
        return Unit.f312394a;
    }

    @u7
    public static /* synthetic */ void v() {
    }

    @NotNull
    public final androidx.compose.runtime.n7<Float> A() {
        return this.f25554f;
    }

    @NotNull
    public final bh<T> B() {
        Object objT;
        float fFloatValue;
        Object value;
        List listJ = ph.j(z().getValue().floatValue(), q().keySet());
        int size = listJ.size();
        if (size == 0) {
            T t10 = t();
            objT = t();
            fFloatValue = 1.0f;
            value = t10;
        } else if (size != 1) {
            int i10 = 3 & 0;
            Pair pair = u() > 0.0f ? TuplesKt.to(listJ.get(0), listJ.get(1)) : TuplesKt.to(listJ.get(1), listJ.get(0));
            float fFloatValue2 = ((Number) pair.component1()).floatValue();
            float fFloatValue3 = ((Number) pair.component2()).floatValue();
            value = MapsKt.getValue(q(), Float.valueOf(fFloatValue2));
            objT = MapsKt.getValue(q(), Float.valueOf(fFloatValue3));
            fFloatValue = (z().getValue().floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        } else {
            Object value2 = MapsKt.getValue(q(), listJ.get(0));
            objT = MapsKt.getValue(q(), listJ.get(0));
            fFloatValue = 1.0f;
            value = value2;
        }
        return new bh<>(value, objT, fFloatValue);
    }

    @Nullable
    public final sd D() {
        return (sd) this.f25563o.getValue();
    }

    public final T E() {
        float fI;
        Float value = this.f25556h.getValue();
        if (value != null) {
            fI = value.floatValue();
        } else {
            float fFloatValue = z().getValue().floatValue();
            Float fK = ph.k(q(), t());
            fI = ph.i(fFloatValue, fK != null ? fK.floatValue() : z().getValue().floatValue(), q().keySet(), G(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t10 = q().get(Float.valueOf(fI));
        return t10 == null ? t() : t10;
    }

    @NotNull
    public final Function2<Float, Float, Float> G() {
        return (Function2) this.f25561m.getValue();
    }

    public final float H() {
        return this.f25562n.V0();
    }

    public final boolean I() {
        return ((Boolean) this.f25552d.getValue()).booleanValue();
    }

    public final float K(float f10) {
        float fH = kotlin.ranges.r.H(this.f25555g.V0() + f10, this.f25559k, this.f25560l) - this.f25555g.V0();
        if (Math.abs(fH) > 0.0f) {
            this.f25564p.b(fH);
        }
        return fH;
    }

    @Nullable
    public final Object L(float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = this.f25558j.collect(new d(this, f10), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (V(r11, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024e, code lost:
    
        if (V(r11, r0) == r1) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23, types: [float] */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v66, types: [float] */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r11, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.xh.M(java.util.Map, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    public final void N(@NotNull Map<Float, ? extends T> map) {
        this.f25557i.setValue(map);
    }

    public final void Q(float f10) {
        this.f25560l = f10;
    }

    public final void R(float f10) {
        this.f25559k = f10;
    }

    public final void S(@Nullable sd sdVar) {
        this.f25563o.setValue(sdVar);
    }

    public final void T(@NotNull Function2<? super Float, ? super Float, Float> function2) {
        this.f25561m.setValue(function2);
    }

    public final void U(float f10) {
        this.f25562n.q(f10);
    }

    @u7
    @Nullable
    public final Object W(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = this.f25558j.collect(new g(t10, this), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    @u7
    @Nullable
    public final Object m(T t10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = this.f25558j.collect(new c(t10, this, oVar), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    public final void p(@NotNull Map<Float, ? extends T> map) {
        if (q().isEmpty()) {
            Float fK = ph.k(map, t());
            if (fK == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.f25553e.q(fK.floatValue());
            this.f25555g.q(fK.floatValue());
        }
    }

    @NotNull
    public final Map<Float, T> q() {
        return (Map) this.f25557i.getValue();
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> r() {
        return this.f25549a;
    }

    @NotNull
    public final Function1<T, Boolean> s() {
        return this.f25550b;
    }

    public final T t() {
        return this.f25551c.getValue();
    }

    public final float u() {
        Float fK = ph.k(q(), t());
        if (fK == null) {
            return 0.0f;
        }
        return Math.signum(z().getValue().floatValue() - fK.floatValue());
    }

    @NotNull
    public final androidx.compose.foundation.gestures.a3 w() {
        return this.f25564p;
    }

    public final float x() {
        return this.f25560l;
    }

    public final float y() {
        return this.f25559k;
    }

    @NotNull
    public final androidx.compose.runtime.n7<Float> z() {
        return this.f25553e;
    }

    public /* synthetic */ xh(Object obj, androidx.compose.animation.core.o oVar, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? jh.f23346a.a() : oVar, (i10 & 4) != 0 ? new Function1() { // from class: androidx.compose.material.uh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(xh.e(obj2));
            }
        } : function1);
    }
}
