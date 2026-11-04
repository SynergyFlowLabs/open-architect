package com.planner5d.library.widget.editor.catalog;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.builtin.c1;
import com.planner5d.library.modules.user.user.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@m1
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nCatalogLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogLoader.kt\ncom/planner5d/library/widget/editor/catalog/CatalogLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1368#2:108\n1454#2,5:109\n774#2:114\n865#2,2:115\n1#3:117\n*S KotlinDebug\n*F\n+ 1 CatalogLoader.kt\ncom/planner5d/library/widget/editor/catalog/CatalogLoader\n*L\n92#1:108\n92#1:109,5\n100#1:114\n100#1:115,2\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f254619h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f254620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.d f254621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.contest.b f254622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f254623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t0 f254624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f254625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Long f254626g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.CatalogLoader", f = "CatalogLoader.kt", i = {}, l = {78}, m = "createQuery", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f254627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f254628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f254629c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f254631e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254629c = obj;
            this.f254631e |= Integer.MIN_VALUE;
            return g.this.i(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.CatalogLoader$loadCategoriesWithItems$2", f = "CatalogLoader.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {"destination$iv$iv", MetricConsts.Install}, s = {"L$1", "L$3"})
    @SourceDebugExtension({"SMAP\nCatalogLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogLoader.kt\ncom/planner5d/library/widget/editor/catalog/CatalogLoader$loadCategoriesWithItems$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1368#2:108\n1454#2,5:109\n*S KotlinDebug\n*F\n+ 1 CatalogLoader.kt\ncom/planner5d/library/widget/editor/catalog/CatalogLoader$loadCategoriesWithItems$2\n*L\n83#1:108\n83#1:109,5\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f254633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f254634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f254635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f254636e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CatalogCategory f254638g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CatalogCategory catalogCategory, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f254638g = catalogCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new b(this.f254638g, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0050  */
        /* JADX WARN: Code duplicated, block: B:13:0x006a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0075  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0068 -> B:14:0x006b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0050
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f254636e
                r7 = 0
                r2 = 1
                r7 = 7
                if (r1 == 0) goto L2c
                if (r1 != r2) goto L22
                java.lang.Object r1 = r8.f254635d
                com.planner5d.library.model.item.catalog.CatalogCategory r1 = (com.planner5d.library.model.item.catalog.CatalogCategory) r1
                java.lang.Object r3 = r8.f254634c
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r8.f254633b
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r8.f254632a
                com.planner5d.library.widget.editor.catalog.g r5 = (com.planner5d.library.widget.editor.catalog.g) r5
                r7 = 0
                kotlin.ResultKt.m(r9)
                goto L6b
            L22:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 5
                r8.<init>(r9)
                r7 = 6
                throw r8
            L2c:
                kotlin.ResultKt.m(r9)
                com.planner5d.library.widget.editor.catalog.g r9 = com.planner5d.library.widget.editor.catalog.g.this
                com.planner5d.library.model.item.catalog.CatalogCategory r1 = r8.f254638g
                java.util.List r9 = com.planner5d.library.widget.editor.catalog.g.e(r9, r1)
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                com.planner5d.library.widget.editor.catalog.g r1 = com.planner5d.library.widget.editor.catalog.g.this
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r9 = r9.iterator()
                r5 = r1
                r5 = r1
                r4 = r3
                r3 = r9
            L48:
                r7 = 3
                boolean r9 = r3.hasNext()
                r7 = 6
                if (r9 == 0) goto L8a
                java.lang.Object r9 = r3.next()
                r1 = r9
                r7 = 2
                com.planner5d.library.model.item.catalog.CatalogCategory r1 = (com.planner5d.library.model.item.catalog.CatalogCategory) r1
                r8.f254632a = r5
                r8.f254633b = r4
                r7 = 2
                r8.f254634c = r3
                r8.f254635d = r1
                r8.f254636e = r2
                r7 = 6
                java.lang.Object r9 = com.planner5d.library.widget.editor.catalog.g.h(r5, r1, r8)
                if (r9 != r0) goto L6b
                return r0
            L6b:
                java.util.List r9 = (java.util.List) r9
                boolean r6 = r9.isEmpty()
                r7 = 3
                if (r6 == 0) goto L75
                goto L83
            L75:
                r7 = 1
                java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
                java.util.Collection r1 = (java.util.Collection) r1
                r7 = 7
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.List r9 = kotlin.collections.CollectionsKt.plus(r1, r9)
            L83:
                r7 = 1
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                kotlin.collections.CollectionsKt.addAll(r4, r9)
                goto L48
            L8a:
                r7 = 6
                java.util.List r4 = (java.util.List) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.catalog.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends Object>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.CatalogLoader$loadForCategoryLayout$2", f = "CatalogLoader.kt", i = {}, l = {35, 37}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f254639a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CatalogCategory f254641c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f254642a;

            static {
                int[] iArr = new int[com.planner5d.library.model.manager.d.a.values().length];
                try {
                    iArr[com.planner5d.library.model.manager.d.a.Items.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.planner5d.library.model.manager.d.a.Categories.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.planner5d.library.model.manager.d.a.CategoriesAndItems.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.planner5d.library.model.manager.d.a.CategoriesAndSubcategories.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f254642a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CatalogCategory catalogCategory, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f254641c = catalogCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new c(this.f254641c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        
            if (r6 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
        
            if (r6 == r0) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 1
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f254639a
                r2 = 2
                r4 = r2
                r3 = 1
                r4 = r4 ^ r3
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r6)
                goto L85
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1d:
                kotlin.ResultKt.m(r6)
                r4 = 3
                goto La2
            L23:
                kotlin.ResultKt.m(r6)
                com.planner5d.library.widget.editor.catalog.g r6 = com.planner5d.library.widget.editor.catalog.g.this
                com.planner5d.library.model.manager.d r6 = com.planner5d.library.widget.editor.catalog.g.c(r6)
                com.planner5d.library.model.item.catalog.CatalogCategory r1 = r5.f254641c
                com.planner5d.library.model.manager.d$a r6 = r6.d(r1)
                r4 = 2
                if (r6 != 0) goto L37
                r6 = -1
                goto L41
            L37:
                r4 = 3
                int[] r1 = com.planner5d.library.widget.editor.catalog.g.c.a.f254642a
                r4 = 4
                int r6 = r6.ordinal()
                r6 = r1[r6]
            L41:
                if (r6 == r3) goto L93
                r4 = 4
                if (r6 == r2) goto L89
                r1 = 3
                if (r6 == r1) goto L77
                r0 = 4
                if (r6 != r0) goto L57
                com.planner5d.library.widget.editor.catalog.g r6 = com.planner5d.library.widget.editor.catalog.g.this
                r4 = 0
                com.planner5d.library.model.item.catalog.CatalogCategory r5 = r5.f254641c
                java.util.List r5 = com.planner5d.library.widget.editor.catalog.g.g(r6, r5)
                r4 = 7
                return r5
            L57:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                com.planner5d.library.model.item.catalog.CatalogCategory r5 = r5.f254641c
                long r0 = r5.getId()
                r4 = 5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = "Invalid category layout, for category: "
                r5.append(r2)
                r5.append(r0)
                r4 = 2
                java.lang.String r5 = r5.toString()
                r4 = 4
                r6.<init>(r5)
                throw r6
            L77:
                com.planner5d.library.widget.editor.catalog.g r6 = com.planner5d.library.widget.editor.catalog.g.this
                com.planner5d.library.model.item.catalog.CatalogCategory r1 = r5.f254641c
                r4 = 4
                r5.f254639a = r2
                java.lang.Object r6 = com.planner5d.library.widget.editor.catalog.g.f(r6, r1, r5)
                if (r6 != r0) goto L85
                goto La1
            L85:
                java.util.List r6 = (java.util.List) r6
                r4 = 6
                return r6
            L89:
                com.planner5d.library.widget.editor.catalog.g r6 = com.planner5d.library.widget.editor.catalog.g.this
                com.planner5d.library.model.item.catalog.CatalogCategory r5 = r5.f254641c
                java.util.List r5 = com.planner5d.library.widget.editor.catalog.g.e(r6, r5)
                r4 = 7
                return r5
            L93:
                com.planner5d.library.widget.editor.catalog.g r6 = com.planner5d.library.widget.editor.catalog.g.this
                com.planner5d.library.model.item.catalog.CatalogCategory r1 = r5.f254641c
                r4 = 3
                r5.f254639a = r3
                java.lang.Object r6 = com.planner5d.library.widget.editor.catalog.g.h(r6, r1, r5)
                r4 = 1
                if (r6 != r0) goto La2
            La1:
                return r0
            La2:
                java.util.List r6 = (java.util.List) r6
                r4 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.catalog.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends Object>> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.CatalogLoader", f = "CatalogLoader.kt", i = {}, l = {71}, m = "loadItems", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f254643a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f254645c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254643a = obj;
            this.f254645c |= Integer.MIN_VALUE;
            return g.this.s(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.CatalogLoader$loadItems$2", f = "CatalogLoader.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s, com.planner5d.library.engine.input.f.b.C0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends CatalogItem>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f254647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f254648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f254649d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ CatalogCategory f254651f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CatalogCategory catalogCategory, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f254651f = catalogCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new e(this.f254651f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CatalogCategory catalogCategory;
            com.planner5d.library.model.manager.contest.b bVar;
            long j10;
            com.planner5d.library.model.manager.builtin.i iVar;
            CatalogCategory catalogCategory2;
            Object objI;
            com.planner5d.library.model.manager.builtin.i iVar2;
            CatalogCategory catalogCategory3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f254649d;
            if (i10 != 0) {
                if (i10 == 1) {
                    j10 = this.f254648c;
                    bVar = (com.planner5d.library.model.manager.contest.b) this.f254647b;
                    catalogCategory = (CatalogCategory) this.f254646a;
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catalogCategory3 = (CatalogCategory) this.f254647b;
                    iVar2 = (com.planner5d.library.model.manager.builtin.i) this.f254646a;
                    ResultKt.m(obj);
                }
                return iVar2.C(catalogCategory3, (c1) obj);
            }
            ResultKt.m(obj);
            Long lJ = g.this.j();
            if (lJ != null) {
                g gVar = g.this;
                catalogCategory = this.f254651f;
                long jLongValue = lJ.longValue();
                com.planner5d.library.model.manager.contest.b bVar2 = gVar.f254622c;
                this.f254646a = catalogCategory;
                this.f254647b = bVar2;
                this.f254648c = jLongValue;
                this.f254649d = 1;
                Object objI2 = gVar.i(this);
                if (objI2 != objL) {
                    bVar = bVar2;
                    obj = objI2;
                    j10 = jLongValue;
                }
            } else {
                iVar = g.this.f254620a;
                catalogCategory2 = this.f254651f;
                g gVar2 = g.this;
                this.f254646a = iVar;
                this.f254647b = catalogCategory2;
                this.f254649d = 2;
                objI = gVar2.i(this);
                if (objI != objL) {
                    obj = objI;
                    iVar2 = iVar;
                    catalogCategory3 = catalogCategory2;
                    return iVar2.C(catalogCategory3, (c1) obj);
                }
            }
            return objL;
            List<CatalogItem> listD = bVar.d(j10, catalogCategory, (c1) obj);
            if (listD != null) {
                return listD;
            }
            iVar = g.this.f254620a;
            catalogCategory2 = this.f254651f;
            g gVar3 = g.this;
            this.f254646a = iVar;
            this.f254647b = catalogCategory2;
            this.f254649d = 2;
            objI = gVar3.i(this);
            if (objI != objL) {
                obj = objI;
                iVar2 = iVar;
                catalogCategory3 = catalogCategory2;
                return iVar2.C(catalogCategory3, (c1) obj);
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends CatalogItem>> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.CatalogLoader$loadSearchResults$2", f = "CatalogLoader.kt", i = {}, l = {48, 52}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f254653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f254654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f254655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f254656e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ xd.b f254658g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(xd.b bVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f254658g = bVar;
            int i10 = 5 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new f(this.f254658g, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00ec  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Collection collection;
            String[] strArr;
            long j10;
            com.planner5d.library.model.manager.contest.b bVar;
            List<CatalogCategory> list;
            com.planner5d.library.model.manager.builtin.i iVar;
            String[] strArrB;
            Object objI;
            Collection collection2;
            String[] strArr2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f254656e;
            if (i10 != 0) {
                if (i10 == 1) {
                    j10 = this.f254655d;
                    collection = (Collection) this.f254654c;
                    bVar = (com.planner5d.library.model.manager.contest.b) this.f254653b;
                    strArr = (String[]) this.f254652a;
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    strArr2 = (String[]) this.f254654c;
                    iVar = (com.planner5d.library.model.manager.builtin.i) this.f254653b;
                    collection2 = (Collection) this.f254652a;
                    ResultKt.m(obj);
                }
                List<CatalogItem> listD = iVar.D(strArr2, (c1) obj);
                Intrinsics.checkNotNullExpressionValue(listD, "getCatalogItems(...)");
                return CollectionsKt.plus(collection2, (Iterable) listD);
            }
            ResultKt.m(obj);
            Long lJ = g.this.j();
            if (lJ != null) {
                g gVar = g.this;
                xd.b bVar2 = this.f254658g;
                long jLongValue = lJ.longValue();
                com.planner5d.library.model.manager.contest.b bVar3 = gVar.f254622c;
                long[] jArrA = bVar2.a();
                Intrinsics.checkNotNullExpressionValue(jArrA, "getCategories(...)");
                List<CatalogCategory> listC = bVar3.c(jLongValue, jArrA);
                com.planner5d.library.model.manager.contest.b bVar4 = gVar.f254622c;
                String[] strArrB2 = bVar2.b();
                Intrinsics.checkNotNullExpressionValue(strArrB2, "getItems(...)");
                this.f254652a = strArrB2;
                this.f254653b = bVar4;
                this.f254654c = listC;
                this.f254655d = jLongValue;
                this.f254656e = 1;
                Object objI2 = gVar.i(this);
                if (objI2 != objL) {
                    collection = listC;
                    obj = objI2;
                    strArr = strArrB2;
                    j10 = jLongValue;
                    bVar = bVar4;
                }
            } else {
                List<CatalogCategory> listT = g.this.f254620a.t(this.f254658g.a());
                Intrinsics.checkNotNullExpressionValue(listT, "getCatalogCategories(...)");
                list = listT;
                iVar = g.this.f254620a;
                strArrB = this.f254658g.b();
                g gVar2 = g.this;
                this.f254652a = list;
                this.f254653b = iVar;
                this.f254654c = strArrB;
                this.f254656e = 2;
                objI = gVar2.i(this);
                if (objI != objL) {
                    obj = objI;
                    collection2 = list;
                    strArr2 = strArrB;
                    List<CatalogItem> listD2 = iVar.D(strArr2, (c1) obj);
                    Intrinsics.checkNotNullExpressionValue(listD2, "getCatalogItems(...)");
                    return CollectionsKt.plus(collection2, (Iterable) listD2);
                }
            }
            return objL;
            List listPlus = CollectionsKt.plus(collection, (Iterable) bVar.f(j10, strArr, (c1) obj));
            if (listPlus != null) {
                return listPlus;
            }
            List<CatalogCategory> listT2 = g.this.f254620a.t(this.f254658g.a());
            Intrinsics.checkNotNullExpressionValue(listT2, "getCatalogCategories(...)");
            list = listT2;
            iVar = g.this.f254620a;
            strArrB = this.f254658g.b();
            g gVar3 = g.this;
            this.f254652a = list;
            this.f254653b = iVar;
            this.f254654c = strArrB;
            this.f254656e = 2;
            objI = gVar3.i(this);
            if (objI != objL) {
                obj = objI;
                collection2 = list;
                strArr2 = strArrB;
                List<CatalogItem> listD3 = iVar.D(strArr2, (c1) obj);
                Intrinsics.checkNotNullExpressionValue(listD3, "getCatalogItems(...)");
                return CollectionsKt.plus(collection2, (Iterable) listD3);
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends Object>> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public g(@NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.model.manager.d catalogCategoryManager, @NotNull com.planner5d.library.model.manager.contest.b contestDataManager, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers, @NotNull t0 userPurchases) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(catalogCategoryManager, "catalogCategoryManager");
        Intrinsics.checkNotNullParameter(contestDataManager, "contestDataManager");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        this.f254620a = builtInDataManager;
        this.f254621b = catalogCategoryManager;
        this.f254622c = contestDataManager;
        this.f254623d = coroutineDispatchers;
        this.f254624e = userPurchases;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object i(kotlin.coroutines.d<? super c1> dVar) {
        a aVar;
        boolean z10;
        int i10;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f254631e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f254631e = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f254629c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = aVar.f254631e;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.m(obj);
            boolean z12 = this.f254625f;
            int i13 = !this.f254624e.c() ? 1 : 0;
            t0 t0Var = this.f254624e;
            aVar.f254627a = z12;
            aVar.f254628b = i13;
            aVar.f254631e = 1;
            Object objS = t0Var.S(aVar);
            if (objS == objL) {
                return objL;
            }
            z10 = z12;
            obj = objS;
            i10 = i13;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = aVar.f254628b;
            z10 = aVar.f254627a;
            ResultKt.m(obj);
        }
        String[] strArr = (String[]) obj;
        if (i10 == 0) {
            z11 = false;
        }
        return new c1(z10, z11, strArr);
    }

    @m1
    private final List<Long> l() {
        return CollectionsKt.listOfNotNull(this.f254625f ? this.f254620a.W("ground/0") : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final List<CatalogCategory> o(CatalogCategory catalogCategory) {
        Long l10 = this.f254626g;
        if (l10 != null) {
            List<CatalogCategory> listJ = this.f254622c.j(l10.longValue(), catalogCategory);
            if (listJ != null) {
                return listJ;
            }
        }
        List<CatalogCategory> listH = this.f254620a.H(catalogCategory);
        List<Long> listL = l();
        Intrinsics.checkNotNull(listH);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (!listL.contains(Long.valueOf(((CatalogCategory) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(CatalogCategory catalogCategory, kotlin.coroutines.d<? super List<? extends Object>> dVar) {
        return kotlinx.coroutines.i.h(this.f254623d.h(), new b(catalogCategory, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final List<CatalogCategory> q(CatalogCategory catalogCategory) {
        List<CatalogCategory> listO = o(catalogCategory);
        ArrayList arrayList = new ArrayList();
        for (CatalogCategory catalogCategory2 : listO) {
            CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) CollectionsKt.listOf(catalogCategory2), (Iterable) o(catalogCategory2)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object s(CatalogCategory catalogCategory, kotlin.coroutines.d<? super List<? extends CatalogItem>> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f254645c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f254645c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objH = dVar2.f254643a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f254645c;
        if (i11 == 0) {
            ResultKt.m(objH);
            n0 n0VarH = this.f254623d.h();
            e eVar = new e(catalogCategory, null);
            dVar2.f254645c = 1;
            objH = kotlinx.coroutines.i.h(n0VarH, eVar, dVar2);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    @Nullable
    public final Long j() {
        return this.f254626g;
    }

    public final boolean k() {
        return this.f254625f;
    }

    @m1
    public final boolean m(@NotNull String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Long l10 = this.f254626g;
        if (l10 == null) {
            return this.f254620a.r0(itemId);
        }
        return this.f254622c.l(l10.longValue(), itemId);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    @m1
    @NotNull
    public final CatalogCategory n(@NotNull CatalogCategory category) {
        CatalogCategory catalogCategoryG;
        Intrinsics.checkNotNullParameter(category, "category");
        if (category.getParentId() <= 0 || !l().contains(Long.valueOf(category.getId()))) {
            return category;
        }
        Long l10 = this.f254626g;
        if (l10 != null) {
            catalogCategoryG = this.f254622c.i(l10.longValue(), category.getParentId());
            if (catalogCategoryG == null) {
                catalogCategoryG = this.f254620a.G(category.getParentId());
            }
        } else {
            catalogCategoryG = this.f254620a.G(category.getParentId());
        }
        Intrinsics.checkNotNull(catalogCategoryG);
        return catalogCategoryG;
    }

    @Nullable
    public final Object r(@NotNull CatalogCategory catalogCategory, @NotNull kotlin.coroutines.d<? super List<? extends Object>> dVar) throws RuntimeException {
        return kotlinx.coroutines.i.h(this.f254623d.h(), new c(catalogCategory, null), dVar);
    }

    @Nullable
    public final Object t(@NotNull xd.b bVar, @NotNull kotlin.coroutines.d<? super List<? extends Object>> dVar) {
        return kotlinx.coroutines.i.h(this.f254623d.h(), new f(bVar, null), dVar);
    }

    public final void u(@Nullable Long l10) {
        this.f254626g = l10;
    }

    public final void v(boolean z10) {
        this.f254625f = z10;
    }
}
