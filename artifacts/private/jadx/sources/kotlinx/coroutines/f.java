package kotlinx.coroutines;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n37#2:122\n36#2,3:123\n13402#3,2:126\n1863#4,2:128\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n36#1:122\n36#1:123,3\n47#1:126,2\n58#1:128,2\n*E\n"})
public final class f {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {47}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f314016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f314018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f314019e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314018d = obj;
            this.f314019e |= Integer.MIN_VALUE;
            return f.d(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = "joinAll", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314022c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314021b = obj;
            this.f314022c |= Integer.MIN_VALUE;
            return f.c(null, this);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Collection<? extends a1<? extends T>> collection, @NotNull kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return collection.isEmpty() ? CollectionsKt.emptyList() : new e((a1[]) collection.toArray(new a1[0])).c(dVar);
    }

    @Nullable
    public static final <T> Object b(@NotNull a1<? extends T>[] a1VarArr, @NotNull kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return a1VarArr.length == 0 ? CollectionsKt.emptyList() : new e(a1VarArr).c(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final Object c(@NotNull Collection<? extends p2> collection, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        Iterator it;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f314022c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f314022c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f314021b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f314022c;
        if (i11 == 0) {
            ResultKt.m(obj);
            it = collection.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) bVar.f314020a;
            ResultKt.m(obj);
        }
        while (it.hasNext()) {
            p2 p2Var = (p2) it.next();
            bVar.f314020a = it;
            bVar.f314022c = 1;
            if (p2Var.d1(bVar) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.p2[] r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r6 = 2
            boolean r0 = r8 instanceof kotlinx.coroutines.f.a
            if (r0 == 0) goto L18
            r0 = r8
            kotlinx.coroutines.f$a r0 = (kotlinx.coroutines.f.a) r0
            r6 = 4
            int r1 = r0.f314019e
            r6 = 6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 7
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f314019e = r1
            r6 = 3
            goto L1e
        L18:
            kotlinx.coroutines.f$a r0 = new kotlinx.coroutines.f$a
            r6 = 4
            r0.<init>(r8)
        L1e:
            java.lang.Object r8 = r0.f314018d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 3
            int r2 = r0.f314019e
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r7 = r0.f314017c
            r6 = 7
            int r2 = r0.f314016b
            java.lang.Object r4 = r0.f314015a
            kotlinx.coroutines.p2[] r4 = (kotlinx.coroutines.p2[]) r4
            r6 = 1
            kotlin.ResultKt.m(r8)
            r8 = r4
            goto L66
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            kotlin.ResultKt.m(r8)
            int r8 = r7.length
            r2 = 0
            r5 = r8
            r5 = r8
            r8 = r7
            r8 = r7
            r6 = 3
            r7 = r5
            r7 = r5
        L4f:
            if (r2 >= r7) goto L68
            r4 = r8[r2]
            r0.f314015a = r8
            r6 = 3
            r0.f314016b = r2
            r0.f314017c = r7
            r6 = 4
            r0.f314019e = r3
            r6 = 4
            java.lang.Object r4 = r4.d1(r0)
            r6 = 4
            if (r4 != r1) goto L66
            return r1
        L66:
            int r2 = r2 + r3
            goto L4f
        L68:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f.d(kotlinx.coroutines.p2[], kotlin.coroutines.d):java.lang.Object");
    }
}
