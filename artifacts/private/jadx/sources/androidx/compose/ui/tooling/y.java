package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1557#2:117\n1628#2,3:118\n1557#2:121\n1628#2,3:122\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo\n*L\n34#1:117\n34#1:118,3\n61#1:121\n61#1:122,3\n*E\n"})
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private y f42645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e0 f42646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<y> f42647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Sequence<y> f42648d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.tooling.ShadowViewInfo$allNodes$1", f = "ShadowViewInfo.android.kt", i = {0, 1}, l = {43, 44}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo$allNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1381#2:117\n1469#2,5:118\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo$allNodes$1\n*L\n44#1:117\n44#1:118,5\n44#1:123,2\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super y>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f42649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f42650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f42651c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = y.this.new a(dVar);
            aVar.f42651c = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0090 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:? A[LOOP:0: B:18:0x0076->B:28:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        
            if (r1.b(r7, r6) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f42650b
                r2 = 2
                int r5 = r5 >> r2
                r3 = 6
                r3 = 1
                if (r1 == 0) goto L2e
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f42649a
                java.util.Iterator r1 = (java.util.Iterator) r1
                r5 = 1
                java.lang.Object r3 = r6.f42651c
                kotlin.sequences.n r3 = (kotlin.sequences.n) r3
                kotlin.ResultKt.m(r7)
                goto L76
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L26:
                java.lang.Object r1 = r6.f42651c
                kotlin.sequences.n r1 = (kotlin.sequences.n) r1
                kotlin.ResultKt.m(r7)
                goto L46
            L2e:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f42651c
                r1 = r7
                r1 = r7
                kotlin.sequences.n r1 = (kotlin.sequences.n) r1
                androidx.compose.ui.tooling.y r7 = androidx.compose.ui.tooling.y.this
                r6.f42651c = r1
                r5 = 7
                r6.f42650b = r3
                java.lang.Object r7 = r1.b(r7, r6)
                r5 = 6
                if (r7 != r0) goto L46
                goto L90
            L46:
                r5 = 3
                androidx.compose.ui.tooling.y r7 = androidx.compose.ui.tooling.y.this
                java.util.List r7 = r7.c()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r3 = new java.util.ArrayList
                r5 = 5
                r3.<init>()
                java.util.Iterator r7 = r7.iterator()
            L59:
                boolean r4 = r7.hasNext()
                if (r4 == 0) goto L70
                java.lang.Object r4 = r7.next()
                r5 = 0
                androidx.compose.ui.tooling.y r4 = (androidx.compose.ui.tooling.y) r4
                r5 = 4
                kotlin.sequences.Sequence r4 = r4.b()
                r5 = 2
                kotlin.collections.CollectionsKt.addAll(r3, r4)
                goto L59
            L70:
                java.util.Iterator r7 = r3.iterator()
                r3 = r1
                r1 = r7
            L76:
                r5 = 6
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L91
                java.lang.Object r7 = r1.next()
                r5 = 1
                androidx.compose.ui.tooling.y r7 = (androidx.compose.ui.tooling.y) r7
                r6.f42651c = r3
                r6.f42649a = r1
                r6.f42650b = r2
                java.lang.Object r7 = r3.b(r7, r6)
                if (r7 != r0) goto L76
            L90:
                return r0
            L91:
                r5 = 2
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.y.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super y> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private y(y yVar, e0 e0Var) {
        this.f42645a = yVar;
        this.f42646b = e0Var;
        List<e0> listL = e0Var.l();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listL, 10));
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(new y(this, (e0) it.next()));
        }
        this.f42647c = CollectionsKt.toMutableList((Collection) arrayList);
        this.f42648d = kotlin.sequences.o.b(new a(null));
    }

    @NotNull
    public final y a() {
        y yVar = this.f42645a;
        if (yVar == null) {
            return this;
        }
        Intrinsics.checkNotNull(yVar);
        return yVar.a();
    }

    @NotNull
    public final Sequence<y> b() {
        return this.f42648d;
    }

    @NotNull
    public final List<y> c() {
        return this.f42647c;
    }

    @Nullable
    public final l0 d() {
        Object objN = this.f42646b.n();
        if (objN instanceof l0) {
            return (l0) objN;
        }
        return null;
    }

    @Nullable
    public final y e() {
        return this.f42645a;
    }

    public final void f(@NotNull y yVar) {
        List<y> list;
        y yVar2 = this.f42645a;
        if (yVar2 != null && (list = yVar2.f42647c) != null) {
            list.remove(this);
        }
        yVar.f42647c.add(this);
        this.f42645a = yVar;
    }

    public final void g(@Nullable y yVar) {
        this.f42645a = yVar;
    }

    @NotNull
    public final e0 h() {
        String strM = this.f42646b.m();
        int iO = this.f42646b.o();
        androidx.compose.ui.unit.s sVarK = this.f42646b.k();
        androidx.compose.ui.tooling.data.m mVarP = this.f42646b.p();
        List<y> list = this.f42647c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((y) it.next()).h());
        }
        return new e0(strM, iO, sVarK, mVarP, arrayList, this.f42646b.n(), this.f42646b.q());
    }

    public y(@NotNull e0 e0Var) {
        this(null, e0Var);
    }
}
