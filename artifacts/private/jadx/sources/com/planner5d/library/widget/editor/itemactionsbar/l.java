package com.planner5d.library.widget.editor.itemactionsbar;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMultiLevelBestPositionFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiLevelBestPositionFinder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/MultiLevelBestPositionFinder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n29#1:37\n30#1,4:40\n29#1:46\n30#1,4:49\n29#1:55\n30#1,4:58\n12371#2,2:38\n13409#2,2:44\n12371#2,2:47\n13409#2,2:53\n12371#2,2:56\n13409#2,2:62\n12371#2,2:65\n1#3:64\n*S KotlinDebug\n*F\n+ 1 MultiLevelBestPositionFinder.kt\ncom/planner5d/library/widget/editor/itemactionsbar/MultiLevelBestPositionFinder\n*L\n10#1:37\n10#1:40,4\n14#1:46\n14#1:49,4\n18#1:55\n18#1:58,4\n10#1:38,2\n11#1:44,2\n14#1:47,2\n15#1:53,2\n18#1:56,2\n19#1:62,2\n29#1:65,2\n*E\n"})
public final class l<T> implements com.planner5d.library.widget.editor.itemactionsbar.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f256999b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.widget.editor.itemactionsbar.a<T>[] f257000a;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.MultiLevelBestPositionFinder", f = "MultiLevelBestPositionFinder.kt", i = {}, l = {23}, m = "findBestPosition", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f257002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f257003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f257004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<T> f257005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f257006f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l<T> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f257005e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257004d = obj;
            this.f257006f |= Integer.MIN_VALUE;
            return this.f257005e.d(this);
        }
    }

    public l(@NotNull com.planner5d.library.widget.editor.itemactionsbar.a<T>... finders) {
        Intrinsics.checkNotNullParameter(finders, "finders");
        this.f257000a = finders;
    }

    private final <R> R h(Function1<? super com.planner5d.library.widget.editor.itemactionsbar.a<T>, ? extends R> function1) {
        com.planner5d.library.widget.editor.itemactionsbar.a<T>[] aVarArr = this.f257000a;
        if (!(aVarArr.length == 0)) {
            if (aVarArr.length != 1) {
                for (com.planner5d.library.widget.editor.itemactionsbar.a<T> aVar : aVarArr) {
                    if (Intrinsics.areEqual(function1.invoke(aVar), function1.invoke(this.f257000a[0]))) {
                    }
                }
            }
            return function1.invoke(this.f257000a[0]);
        }
        return null;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    public T a() {
        com.planner5d.library.widget.editor.itemactionsbar.a<T>[] aVarArr = this.f257000a;
        if (aVarArr.length == 0) {
            return null;
        }
        if (aVarArr.length != 1) {
            for (com.planner5d.library.widget.editor.itemactionsbar.a<T> aVar : aVarArr) {
                if (!Intrinsics.areEqual(aVar.a(), this.f257000a[0].a())) {
                    return null;
                }
            }
        }
        return this.f257000a[0].a();
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    public void b(@Nullable T[] tArr) {
        for (com.planner5d.library.widget.editor.itemactionsbar.a<T> aVar : this.f257000a) {
            aVar.b(tArr);
        }
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    public void c(@Nullable T t10) {
        for (com.planner5d.library.widget.editor.itemactionsbar.a<T> aVar : this.f257000a) {
            aVar.c(t10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005c -> B:21:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @org.jetbrains.annotations.Nullable
    public java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super T> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.planner5d.library.widget.editor.itemactionsbar.l.a
            if (r0 == 0) goto L16
            r0 = r7
            r5 = 5
            com.planner5d.library.widget.editor.itemactionsbar.l$a r0 = (com.planner5d.library.widget.editor.itemactionsbar.l.a) r0
            int r1 = r0.f257006f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r5 = 3
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r5 = 4
            r0.f257006f = r1
            goto L1b
        L16:
            com.planner5d.library.widget.editor.itemactionsbar.l$a r0 = new com.planner5d.library.widget.editor.itemactionsbar.l$a
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f257004d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f257006f
            r3 = 1
            r5 = 5
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r6 = r0.f257003c
            r5 = 7
            int r2 = r0.f257002b
            java.lang.Object r4 = r0.f257001a
            com.planner5d.library.widget.editor.itemactionsbar.a[] r4 = (com.planner5d.library.widget.editor.itemactionsbar.a[]) r4
            kotlin.ResultKt.m(r7)
            goto L60
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.ResultKt.m(r7)
            com.planner5d.library.widget.editor.itemactionsbar.a<T>[] r6 = r6.f257000a
            int r7 = r6.length
            r2 = 0
            r4 = r6
            r4 = r6
            r5 = 7
            r6 = r7
        L49:
            r5 = 0
            if (r2 >= r6) goto L66
            r7 = r4[r2]
            r0.f257001a = r4
            r5 = 7
            r0.f257002b = r2
            r0.f257003c = r6
            r5 = 5
            r0.f257006f = r3
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L60
            r5 = 6
            return r1
        L60:
            if (r7 == 0) goto L64
            r5 = 0
            return r7
        L64:
            int r2 = r2 + r3
            goto L49
        L66:
            r6 = 4
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.itemactionsbar.l.d(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    public T[] e() {
        com.planner5d.library.widget.editor.itemactionsbar.a<T>[] aVarArr = this.f257000a;
        if (!(aVarArr.length == 0)) {
            if (aVarArr.length != 1) {
                for (com.planner5d.library.widget.editor.itemactionsbar.a<T> aVar : aVarArr) {
                    if (Intrinsics.areEqual(aVar.e(), this.f257000a[0].e())) {
                    }
                }
            }
            return this.f257000a[0].e();
        }
        return null;
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    public void f(@Nullable T t10) {
        for (com.planner5d.library.widget.editor.itemactionsbar.a<T> aVar : this.f257000a) {
            aVar.f(t10);
        }
    }

    @Override // com.planner5d.library.widget.editor.itemactionsbar.a
    @Nullable
    public T g() {
        com.planner5d.library.widget.editor.itemactionsbar.a<T>[] aVarArr = this.f257000a;
        if (!(aVarArr.length == 0)) {
            if (aVarArr.length != 1) {
                for (com.planner5d.library.widget.editor.itemactionsbar.a<T> aVar : aVarArr) {
                    if (Intrinsics.areEqual(aVar.g(), this.f257000a[0].g())) {
                    }
                }
            }
            return this.f257000a[0].g();
        }
        return null;
    }
}
