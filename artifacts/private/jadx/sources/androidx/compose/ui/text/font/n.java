package androidx.compose.ui.text.font;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n85#2:445\n117#2,2:446\n35#3,5:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n264#1:445\n264#1:446,2\n271#1:448,5\n*E\n"})
public final class n implements n7<Object> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41637h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<x> f41638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r1 f41639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f41640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<u1.b, Unit> f41641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final d1 f41642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n3 f41643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41644g = true;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 1, 1}, l = {281, 295}, m = "load", n = {"$this$fastForEach$iv", io.ktor.http.m.d.f296017b, "index$iv", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f41649e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f41651g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41649e = obj;
            this.f41651g |= Integer.MIN_VALUE;
            return n.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41652a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f41654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x xVar, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f41654c = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return n.this.new b(this.f41654c, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super Object> dVar) {
            return invoke2((kotlin.coroutines.d<Object>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f41652a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            n nVar = n.this;
            x xVar = this.f41654c;
            this.f41652a = 1;
            Object objG = nVar.g(xVar, this);
            return objG == objL ? objL : objG;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<Object> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {314}, m = "loadWithTimeoutOrNull$ui_text", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41656b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41658d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41656b = obj;
            this.f41658d |= Integer.MIN_VALUE;
            return n.this.g(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41659a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f41661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x xVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f41661c = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new d(this.f41661c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f41659a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            d1 d1Var = n.this.f41642e;
            x xVar = this.f41661c;
            this.f41659a = 1;
            Object objA = d1Var.a(xVar, this);
            return objA == objL ? objL : objA;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<Object> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull List<? extends x> list, @NotNull Object obj, @NotNull r1 r1Var, @NotNull o oVar, @NotNull Function1<? super u1.b, Unit> function1, @NotNull d1 d1Var) {
        this.f41638a = list;
        this.f41639b = r1Var;
        this.f41640c = oVar;
        this.f41641d = function1;
        this.f41642e = d1Var;
        this.f41643f = d7.g(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f41643f.setValue(obj);
    }

    public final boolean b() {
        return this.f41644g;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:27:0x006c, B:29:0x0084), top: B:48:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:34:0x00a7, B:37:0x00db, B:21:0x0053, B:24:0x005d), top: B:50:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00db A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:34:0x00a7, B:37:0x00db, B:21:0x0053, B:24:0x005d), top: B:50:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:43:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e9 -> B:40:0x00ec). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.n.d(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object g(@NotNull x xVar, @NotNull kotlin.coroutines.d<Object> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f41658d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f41658d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f41656b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f41658d;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            d dVar2 = new d(xVar, null);
            cVar.f41655a = xVar;
            cVar.f41658d = 1;
            Object objE = b4.e(15000L, dVar2, cVar);
            return objE == objL ? objL : objE;
        } catch (CancellationException e10) {
            if (!s2.D(cVar.getContext())) {
                throw e10;
            }
            return null;
        } catch (Exception e11) {
            kotlinx.coroutines.o0 o0Var = (kotlinx.coroutines.o0) cVar.getContext().get(kotlinx.coroutines.o0.L2);
            if (o0Var != null) {
                o0Var.handleException(cVar.getContext(), new IllegalStateException("Unable to load font " + xVar, e11));
            }
            return null;
        }
    }

    @Override // androidx.compose.runtime.n7
    @NotNull
    public Object getValue() {
        return this.f41643f.getValue();
    }

    public final void h(boolean z10) {
        this.f41644g = z10;
    }
}
