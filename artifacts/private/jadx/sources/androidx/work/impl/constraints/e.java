package androidx.work.impl.constraints;

import androidx.work.impl.constraints.controllers.h;
import androidx.work.impl.model.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWorkConstraintsTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,104:1\n766#2:105\n857#2,2:106\n1549#2:108\n1620#2,3:109\n766#2:117\n857#2,2:118\n287#3:112\n288#3:115\n37#4,2:113\n106#5:116\n*S KotlinDebug\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n*L\n84#1:105\n84#1:106,2\n84#1:108\n84#1:109,3\n91#1:117\n91#1:118,2\n85#1:112\n85#1:115\n85#1:113,2\n85#1:116\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<androidx.work.impl.constraints.controllers.c<?>> f76777a;

    static final class a extends l0 implements Function1<androidx.work.impl.constraints.controllers.c<?>, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76778a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull androidx.work.impl.constraints.controllers.c<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String simpleName = it.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n289#2,5:113\n*E\n"})
    public static final class b implements i<androidx.work.impl.constraints.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i[] f76779a;

        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
        static final class a extends l0 implements Function0<androidx.work.impl.constraints.b[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i[] f76780a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i[] iVarArr) {
                super(0);
                this.f76780a = iVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.work.impl.constraints.b[] invoke() {
                return new androidx.work.impl.constraints.b[this.f76780a.length];
            }
        }

        /* JADX INFO: renamed from: androidx.work.impl.constraints.e$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,332:1\n86#2:333\n1282#3,2:334\n*S KotlinDebug\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n*L\n86#1:334,2\n*E\n"})
        public static final class C0780b extends o implements n<j<? super androidx.work.impl.constraints.b>, androidx.work.impl.constraints.b[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f76781a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f76782b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f76783c;

            public C0780b(kotlin.coroutines.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                androidx.work.impl.constraints.b bVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f76781a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = (j) this.f76782b;
                    androidx.work.impl.constraints.b[] bVarArr = (androidx.work.impl.constraints.b[]) ((Object[]) this.f76783c);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!Intrinsics.areEqual(bVar, androidx.work.impl.constraints.b.a.f76752a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = androidx.work.impl.constraints.b.a.f76752a;
                    }
                    this.f76781a = 1;
                    if (jVar.emit(bVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // pj.n
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull j<? super androidx.work.impl.constraints.b> jVar, @NotNull androidx.work.impl.constraints.b[] bVarArr, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                C0780b c0780b = new C0780b(dVar);
                c0780b.f76782b = jVar;
                c0780b.f76783c = bVarArr;
                return c0780b.invokeSuspend(Unit.f312394a);
            }
        }

        public b(i[] iVarArr) {
            this.f76779a = iVarArr;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull j<? super androidx.work.impl.constraints.b> jVar, @NotNull kotlin.coroutines.d dVar) {
            i[] iVarArr = this.f76779a;
            Object objA = m.a(jVar, iVarArr, new a(iVarArr), new C0780b(null), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull List<? extends androidx.work.impl.constraints.controllers.c<?>> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.f76777a = controllers;
    }

    public final boolean a(@NotNull v workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        List<androidx.work.impl.constraints.controllers.c<?>> list = this.f76777a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((androidx.work.impl.constraints.controllers.c) obj).e(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            androidx.work.v.e().a(f.f76784a, "Work " + workSpec.f76983a + " constrained by " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, a.f76778a, 31, null));
        }
        return arrayList.isEmpty();
    }

    @NotNull
    public final i<androidx.work.impl.constraints.b> b(@NotNull v spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List<androidx.work.impl.constraints.controllers.c<?>> list = this.f76777a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((androidx.work.impl.constraints.controllers.c) obj).d(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((androidx.work.impl.constraints.controllers.c) it.next()).g());
        }
        return k.i0(new b((i[]) CollectionsKt.toList(arrayList2).toArray(new i[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull androidx.work.impl.constraints.trackers.o trackers) {
        this((List<? extends androidx.work.impl.constraints.controllers.c<?>>) CollectionsKt.listOf((Object[]) new androidx.work.impl.constraints.controllers.c[]{new androidx.work.impl.constraints.controllers.a(trackers.a()), new androidx.work.impl.constraints.controllers.b(trackers.b()), new h(trackers.d()), new androidx.work.impl.constraints.controllers.d(trackers.c()), new androidx.work.impl.constraints.controllers.g(trackers.c()), new androidx.work.impl.constraints.controllers.f(trackers.c()), new androidx.work.impl.constraints.controllers.e(trackers.c())}));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        int i10 = 2 ^ 2;
    }
}
